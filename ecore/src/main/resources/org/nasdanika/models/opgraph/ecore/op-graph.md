
```drawio-resource
op-graph.drawio
```

This is a design document for OpGraph - it is written in the present tense, but not all stated capabilities are implemented.

OpGraph (`op-graph.models.nasdanika.org`) is a strongly-typed, model-driven workflow engine
drawing on patterns from several established workflow engines, designed to overcome the
limitations of map-based process state while preserving their execution semantics and
extending them with Java-native patterns, workflow inheritance, simulation support,
synchronous and reactive execution modes, and a collaborative multi-role authoring model.

[TOC levels=6]


## Core Design Principles

### 1. Dual "This" - Configuration vs. Execution Context

Every workflow operation has two distinct "self" references, mirroring how the JVM works at
the bytecode level:

- **Java `this` (configuration context):** The model element (EObject) holding model configuration and
  runtime infrastructure - connections, caches, service clients. Stable across workflow
  instances. Not part of the workflow state.
- **First operation parameter (execution context):** The workflow state passed explicitly
  through the operation call chain. 

This duality is not an architectural convention imposed on developers - it reflects how
Java methods actually work. Every instance method call passes `this` as an implicit first
argument at the bytecode level. OpGraph makes the execution context explicit as the first
declared parameter, which is the natural Java pattern.

**Result:** Activities can either write state into the execution context object
("everything through state" - common in some workflow engines) or pass values directly
to the next operation (idiomatic Java pass-through). Both patterns are valid and can
coexist in the same workflow.

#### Control Plane vs. Data Plane

The dual-`this` design maps cleanly onto the **control plane / data plane** distinction
familiar from networking and distributed systems:

| | Java `this` | First parameter (execution context) |
|---|---|---|
| Plane | Control plane | Data plane |
| Lifetime | Workflow definition lifetime | Workflow instance lifetime |
| Mutability | Effectively immutable per instance | Mutable, change-recorded |
| Sharing | Shared across all executions | Owned by one execution |
| Contents | Connections, config, policies | State, arguments, intermediate results |
| What it answers | "How do we execute?" | "What are we executing on?" |

**Important qualification:** "Control plane" here refers to *configuration and
infrastructure* - connection pools, retry policies, security context, service clients -
not to runtime routing decisions. 
Branching and looping are
determined by the **graph structure** (which lives in Java `this`) evaluated **against
the execution context** (the data plane). 
The graph encodes the routing rules; the data plane supplies the values those rules act on. 

### 2. Strongly-Typed Workflow State

In some workflow engines, the process state is essentially a map - a
key-value store. This makes refactoring painful and errors late-binding.

OpGraph replaces this with **Ecore-modeled workflow state**:

- The execution context is an EMF model instance, not a generic map.
- State is schema-validated, navigable, and refactorable.
- Schema evolution is handled at the model level.
- Tooling (editors, validators, code generators) can be derived from the model.

### 3. Token Lifecycle and State Recording

Each activity invocation is associated with a **token** that records:

- Input arguments at the point of invocation.
- State [changes](https://change.models.nasdanika.org/) during execution, captured via the EMF `ChangeRecorder`.
- Execution outcome (success, failure, compensation needed).

This enables:

- **Rollback:** Replay recorded changes in reverse to restore prior state.
- **Replay:** Re-execute from any checkpoint by replaying forward from a saved token.
- **Audit:** Full history of state transitions per workflow instance.
- **Event sourcing semantics:** Tokens are the event log; state is derived.

#### Checkpoint Strategy

Token materialization is configurable:

- **Lightweight mode:** No token persistence for non-durable, in-memory activities.
- **Checkpointed mode:** Full token lifecycle with persistence at designated points.
- **Commit points:** Configurable - every activity, explicit annotations, or named groups.

Persistence backends are pluggable. One supported strategy: **Git commits** per checkpoint,
providing a human-readable, diffable audit trail. 
Granularity is configurable to avoid
excessive history in long-running workflows.

### 4. Multiple sources

A logical OpGraph model can be defined in a single resource or multiple resources using

AbtstractXXX - XXX - XXXReference pattern as in the Product Management Model.
For example:

* `AbstractOperator` - type used in operator references
* `Operator` - concrete definition
* `OperatorReference` - references a definition somewhere else using `target` reference. Might follow reference chains.

This approach would allow to assemble graphs from multiple locations including, say, Maven repositories using MavenURIResolver.

## Compilation Pipeline

OpGraph workflows follow a progressive elaboration path:

```
Draw.io diagram
    ↓
Elaborate (annotate, connect, type)
    ↓  CLI command
Compile to Ecore (OpGraph model)
    ↓
Compile to Java (if all operations have implementations)
    ↓
Deploy
```

- **YAML/JSON** serialization is available out of the box via EMF JSON.
- **XText DSL** (planned): A textual syntax with IDE support - syntax highlighting,
  activity type lookup from a registry of published activities, content assist.
- **Ecore as IR:** The compiled Ecore model is the canonical intermediate representation.
  Java code generation is an optional final step when all operations are implemented.
- **Partial implementation is valid:** A workflow where some operations have Java
  implementations and others are stubs is a legitimate intermediate state, supporting
  incremental elaboration and testing.

## Workflow Inheritance

OpGraph supports **workflow inheritance** modeled after Java class inheritance, with
extensions suited to workflow semantics.

### Inheritance

- A derived workflow extends a parent workflow, inheriting its activity graph, operation
  signatures, and default implementations.
- Derived workflows may **override** any non-final operation implementation and customize connections - calls and transitions.
- Workflow graphs compose via inheritance similarly to how container layers compose
  (e.g., Docker layers, Eclipse extension points).
- The original motivation for this model came from modeling **Software Development
  Lifecycle (SDLC)** processes, where a generic SDLC workflow is specialized per
  technology, team, or regulatory context.

### Abstract Activities

An activity may be declared **abstract** - it defines a named step with a typed signature
but provides no implementation. Derived workflows must provide a concrete implementation
before the workflow can be executed (or compiled to Java).

**Example:** An `SDLC` workflow defines an abstract `Develop Code` activity. Derived
workflows `JavaSDLC` and `PythonSDLC` each provide a concrete implementation appropriate
to their language toolchain. 
The parent workflow defines the shape of the process; the
children define how each step is actually done.

Abstract activities are first-class citizens in the model - they appear in diagrams,
documentation, and simulations with their name and signature even before implementation
exists.

### Final Activities

An activity may be declared **final** - it cannot be overridden or suppressed in any
derived workflow. This is the mechanism for enforcing non-negotiable steps.

**Examples of final activities:**

- A regulatory audit log entry that must execute in every compliant workflow instance.
- A security checkpoint that must not be bypassed in any derived workflow.
- A billing event that must fire regardless of how the workflow is specialized.

The compiler and runtime both enforce finality - a derived workflow that attempts to
override or suppress a final activity is rejected at compile time.

### Suppression

Unlike Java, where you cannot delete an inherited method, OpGraph supports **suppression**:
a derived workflow may remove a non-final activity or connection inherited from a parent.

**Use cases for suppression:**

- Removing a notification step in a test-environment workflow.
- Stripping an approval gate in a derived workflow for a low-risk deployment context.
- Simplifying a parent workflow template for a specific deployment scenario.

### Multiple inheritance and diamond inheritance

* The base SDLC workflow defines abstract "Development" and "Deployment" activities.
* Java and Python SDLC workflows extend the base workflow and provide provide concrete "Development" activities for their respective languages. 
* On-prem and Cloud SDLC workflows extend the base workflow and provide provide concrete "Deployment" activities for their respective runtimes.     
* Java Cloud SDLC is a concrete workflow extending Java and Cloud SDLC. Similarly there is a Java On-Prem SDLC, Python Cloud, ...

## Collaborative Authoring Model

OpGraph is designed to support a multi-role, multi-phase authoring pipeline:

| Phase | Role | Tool | Output |
|---|---|---|---|
| **Draw** | Business analyst | Diagram editor (Draw.io or similar) | Workflow diagram |
| **Elaborate** | Developer / architect | Diagram annotations, type assignments | Typed, connected diagram |
| **Compile** | Developer / CI | CLI command | OpGraph Ecore model |
| **Implement** | Developer / AI | Java, generated stubs | Operation implementations |
| **Deploy** | DevOps / runtime | OpGraph runtime | Running workflow |

The **CLI compile step** is the formal contract between the business-facing and
engineering-facing layers. It validates that the elaborated diagram is structurally sound
before any implementation work begins.

**AI integration point:** AI agents can generate operation implementations from operation
signatures and operation/parameter documentation. 

## Operation Model

Operations in OpGraph follow this signature convention:

```java
ReturnType operationName(ExecutionContext ctx, Param1Type param1, ...);
```

- `ExecutionContext ctx` - the workflow state, passed explicitly as the first argument.
  Corresponds to the process instance in workflow engine terms.
- Additional parameters - typed inputs, either mapped from the execution context
  (state-driven style) or passed directly from the preceding operation's output
  (Java-style pass-through). One way to implement mapping is to use a YAML map of parameter names to [SpEL](https://docs.spring.io/spring-framework/reference/core/expressions.html) expressions.
- `ReturnType` - may be mapped into the execution context, passed forward, or both. The default behavior is to map features to parameters of the next activity. Mapping between types can be done at the transition/call level.

## Execution Modes

OpGraph generates multiple execution flavors from the same workflow model, following
patterns established in modern AI and integration libraries 
A workflow author writes one definition; the
generator produces multiple execution surfaces.

### Synchronous Execution

The simplest and most familiar mode. Operations are invoked as direct Java method calls,
the execution context flows through the call stack, and the workflow returns when the
final activity completes.

```java
ResultType result = workflow.execute(ctx, input);
```

**Use cases:** Unit tests, batch jobs, short-running workflows where blocking is
acceptable, and contexts where simplicity outweighs concurrency benefits.

### Asynchronous Execution - `CompletionStage`

For workflows where lifecycle events (start, stop, individual activity completion) need
to be observed without blocking, OpGraph generates `CompletionStage`-based methods.

```java
CompletionStage<ResultType> stage = workflow.executeAsync(ctx, input);
stage.thenAccept(result -> ...);
```

**Use cases:** Integration with thread pools and executors, lifecycle coordination
(start one workflow when another finishes), interop with `CompletableFuture`-based APIs.

### Reactive Execution - `Mono` / `Flux`

For streaming workflows, long-running workflows with intermediate events, and workflows
where back-pressure matters, OpGraph generates Reactor-based methods using `Mono` (single
result) and `Flux` (stream of results or events).

```java
Mono<ResultType> mono = workflow.executeReactive(ctx, input);
Flux<TokenEvent> events = workflow.executeStreaming(ctx, input);
```

**Use cases:**

- **Back-pressure:** Activities producing more output than downstream consumers can
  handle are throttled automatically by the reactive framework.
- **Streaming output:** Workflows producing a stream of results (e.g., a search workflow
  yielding results progressively) emit each result as it becomes available.
- **Event observation:** A `Flux<TokenEvent>` surface exposes the token lifecycle to
  external observers - activity start, activity complete, state change, checkpoint -
  enabling live monitoring, progress indicators, and audit streaming without coupling
  the workflow logic to monitoring infrastructure.
- **Long-running workflows:** Reactive composition naturally handles workflows that
  span minutes, hours, or days, integrating with reactive persistence and messaging.

### Mode Selection at Compile Time

The execution mode is a compile-time concern, not a runtime one. 
The generator produces the synchronous, async, and reactive variants side-by-side as separate methods on the
generated workflow class. Callers choose the mode appropriate to their context.

Operation implementations are **mode-agnostic** where possible - the same operation
implementation can participate in synchronous and reactive execution, with the generator
handling the wrapping. 
Operations that are inherently asynchronous (e.g., a remote API
call) can be implemented as `Mono`-returning methods, and the synchronous variant blocks
on completion at the call site.

## Context Mapping - `map` and `flatMap`

Operators may optionally declare a **`map`** or **`flatMap`** function that transforms
the parent execution context into a narrowed or transformed downstream context before
the operator's body executes. These functions adapt the data plane flowing into the
operator without affecting the control plane.

The naming is deliberate: these are the same `map` and `flatMap` operations familiar
from `Stream` and reactive libraries (`Mono`, `Flux`).
The semantic correspondence is exact:

- **`map`** transforms one parent context into one downstream context (possibly of a
  different type).
- **`flatMap`** transforms one parent context into zero, one, or many downstream contexts.

Conceptually, a workflow *is* a stream of execution contexts flowing through operators,
and `map` / `flatMap` shape that stream the same way they shape value streams in Reactor.

### Signatures

```java
DownstreamContext map(ParentContext ctx);                       // one-to-one transform
Iterator<DownstreamContext> flatMap(ParentContext ctx);         // one-to-many, sequential
Flux<DownstreamContext> flatMap(ParentContext ctx);             // one-to-many, reactive
```

The operator's body receives `DownstreamContext` as its first parameter (the data
plane); Java `this` (the control plane) is unchanged. From the operator's perspective,
the downstream context *is* the execution context - there is no distinction between
"a mapped context" and "a regular context."

### Typed Contexts via Metamodel Subsetting

For each `map` or `flatMap` declaration, the compiler generates:

1. A **subset Ecore metamodel** containing only the EClasses, EStructuralFeatures, and
   EOperations reachable in the downstream context.
2. **Generated Java interfaces and implementations** for the subset, with implementations
   delegating to the parent model through EMF adapters.
3. **Compile-time enforcement** - the operator cannot reference features outside the
   downstream context because they don't exist in the downstream type. This is stronger
   than runtime permission checks: out-of-context access is a compilation error.

This is particularly valuable for agent definitions: an agent operating on a mapped
context literally cannot see or modify state outside its mapped view, by virtue of the
type system.

### Use Cases

**Reusable operators with adapted state.** A generic operator (e.g., `ProcessTickets`)
can be invoked from multiple parent workflows, each providing a `map` that adapts its
local state to the operator's expected input. The operator is reused without modification;
the `map` handles the adaptation.

**Agent focus.** An agent operator is given a `map` that narrows the workflow state to
a specific subject - a [Jira issue](https://jira.models.nasdanika.org/references/eClassifiers/Issue/default-graph.html), a customer record, a [product management persona](https://product-management.models.nasdanika.org/references/eClassifiers/Persona/index.html) - and
to the subset of operations that agent is allowed to invoke. 
The agent's reachability is defined declaratively, enforced by the type system, and inspectable in the model.

**Iteration via `flatMap`.** When an operator should run once per element of some
collection in the parent state, `flatMap` produces one downstream context per element.
This collapses context establishment and iteration into one well-understood construct.

**Persona switching.** Different `map` functions over the same parent state present the
same underlying data through different lenses - a "product manager" mapping exposing
prioritization features, an "engineer" mapping exposing technical details, a "compliance"
mapping exposing audit trails.

### Iteration Semantics

When `flatMap` returns multiple contexts, the return type determines processing semantics:

- **`Iterator<DownstreamContext>`** - sequential, ordered processing. One operator
  invocation completes before the next begins. Natural fit for synchronous and async
  execution modes.
- **`Flux<DownstreamContext>`** - reactive streaming with back-pressure. Operator
  invocations proceed subject to back-pressure constraints. Natural fit for the
  reactive execution mode.

#### Parallelism Policy (Initial Implementation)

To keep early implementation tractable and debuggable, the initial parallelism rules are:

- **Synchronous mode:** All `flatMap` iteration is sequential, regardless of return type.
  A `Flux` is consumed serially.
- **Async / reactive mode:** Execution follows standard reactive semantics - sequential
  by default, with concurrency emerging from explicit reactive operators downstream.

A future addition: a **`parallel`** flag on `flatMap` that, in synchronous mode, uses
parallel streams for independent iteration. 
This is deferred until the sequential model is solid and the implications for token ordering, change-recorder concurrency, and
rollback are designed.

### Composition and Nesting

`map` and `flatMap` declarations compose naturally. An operator with a mapped context
can invoke another operator with its own `map` or `flatMap`, and the mappings compose:

```
workflow context -> activity context -> sub-activity context -> agent context
```

Each level narrows or adapts further. The change recorder records changes at the
appropriate level, with merge-on-exit semantics similar to nested transactions -
when a mapped operator completes successfully, its recorded changes are merged into
the parent's change record; on failure, the mapped changes are discarded.

### Write Modes

`map` and `flatMap` support multiple write-back modes:

- **Read-write (default):** Writes to the downstream context propagate to the parent
  through the adapter layer.
- **Read-only:** Writes are prohibited at compile time (the generated downstream
  interfaces have no setters or mutating operations). Suitable for agents that should
  only observe.
- **Copy-on-write (sandbox):** The downstream context is a deep copy of the relevant
  subset. Writes affect only the copy. Suitable for simulation, what-if analysis, and
  experimental agent execution where the parent state must remain untouched until
  explicit commit.

The write mode is a declarative property of the `map` or `flatMap` declaration, not a
runtime decision.

### Relationship to Stream and Reactive `map` / `flatMap`

The naming is intentional, and the semantic correspondence is close - but the analogy
should not be pushed past its useful limits. OpGraph's `map` / `flatMap` operate on
execution contexts flowing through workflow operators, and their behavior integrates
with token recording, change recording, and rollback in ways that Stream and Reactor
operators do not. The names communicate the *shape* of the transformation (one-to-one
or one-to-many), not a literal contract with `java.util.stream` or Reactor APIs.

## State Access and Critical Sections

Operators do not access workflow state directly. Instead, state access flows through
**read** and **write/exclusive** commands dispatched to a coordinator - implemented on
top of **EMF Transaction's `TransactionalEditingDomain` and realms**. 
This design
decouples state access from operator execution duration, which is essential because
operator durations are wildly asymmetric: a model read or write completes in
microseconds, while an LLM call or remote API invocation may take seconds or minutes.

Commands can be wrapped into reactive constructs like Mono or async constructs as CompetionStage -
they will be executed by a thread pool or some other means and subsequent actions will
be triggered upon execution.

### The Asymmetry Problem

If operators held locks directly during their full execution, a single operator wrapped
around a slow remote call would serialize the entire workflow - defeating the purpose
of reactive execution and back-pressure. By pushing state access through short
commands, the engine can:

- Hold locks only for the duration of actual state operations.
- Release locks across long-running operator bodies (LLM calls, HTTP requests, file I/O).
- Permit concurrent reads where appropriate.
- Schedule writes serially without blocking the operator's overall progress.

### Critical Sections

A **critical section operator** is a composite operator that executes its children
within a single transaction. The semantics:

- All child operators execute as one atomic unit with respect to state changes.
- A child failure rolls back the entire critical section's state changes.
- The transaction is held for the duration of the critical section's execution.

Critical sections are the right abstraction for "this group of operators must see a
consistent snapshot of state and either all succeed or all roll back together."

They compose naturally with `map` and `flatMap` - a critical section may map the parent
context to a narrowed downstream context, and its children operate within both the
mapping and the transaction.

#### Long-Running Operators in Critical Sections

A critical section holds its transaction for the duration of its children. Wrapping a
long-running operator (LLM call, remote API, file upload) inside a critical section
holds the transaction for the duration of that long operation - which is almost always
wrong and should be hard to do accidentally.

The model addresses this with **operator duration annotations**:

- Operators are annotated (declaratively or by inference from their type) as `fast`
  (model operations only, microseconds), `bounded` (local I/O, milliseconds), or
  `unbounded` (remote calls, LLMs, user interactions).
- The compiler **rejects critical sections that contain `unbounded` operators**, or
  emits a strong warning, depending on configuration.
- Authors who genuinely need to hold state across a long operation must do so explicitly,
  e.g., by snapshotting state into a copy-on-write mapped context and committing back
  later - making the long-held boundary visible in the model.

This is the strongly-typed-workflow philosophy applied to concurrency: the model knows
which operators are long-running, and the compiler enforces concurrency discipline.

### Realms and Non-Model Resources

EMF Transaction's realm concept generalizes beyond models - a realm can guard any shared
resource, not just an EMF model. OpGraph exploits this by allowing critical sections to
declare the **resource they protect**:

- The default resource is the workflow state's editing domain.
- Other declarable resources: connection pools, external service clients, in-memory
  caches, or any object exposing a realm.

A critical section over a connection pool serializes access to that pool while
permitting concurrent state access elsewhere. This is a more granular concurrency
model than a single global state lock.

### Reactive Execution and Thread Confinement

EMF realms are thread-confined by design - operations on a realm must execute on the
realm's thread, accessed via `Realm.syncExec` / `Realm.asyncExec`. Reactive execution
poses an integration challenge: operators may resume on arbitrary scheduler threads.

The bridge is Reactor scheduler interop:

- A realm is exposed as a Reactor `Scheduler` - operations dispatched to that scheduler
  execute on the realm's thread.
- State access commands (`read`, `write`) return `Mono` / `Flux` that are subscribed on
  the realm scheduler.
- Operator bodies subscribe back to whatever scheduler is appropriate for their work
  (an I/O scheduler for remote calls, a compute scheduler for CPU-bound work).

This keeps the realm's thread-confinement invariant intact while letting the rest of
the workflow execute reactively.

### Integration with Token Recording

The token's change recorder aligns with transaction boundaries:

- Changes made within a transaction are recorded against the transaction's token.
- On commit, the changes are merged into the parent token's record.
- On rollback, the transaction's changes are discarded from the audit log (or marked
  as rolled-back, depending on audit policy).
- For nested critical sections, change records nest correspondingly.

This gives consistent audit semantics: the token log reflects what actually persisted,
not what was attempted-and-rolled-back, while preserving the ability to inspect failed
attempts if needed.

### Summary of the Discipline

| Concern | Default | Mechanism |
|---|---|---|
| Short state access | Commands dispatched to the realm | EMF Transaction read/write transactions |
| Atomic multi-operator groups | Critical section operator | One transaction wraps all children |
| Long operations | Outside any transaction | Compiler rejects unbounded operators in critical sections |
| Concurrent reads | Permitted | Read-only transactions on the same realm |
| Concurrent writes | Serialized per realm | Write transaction queue |
| Non-state resources | Declarable as realm-protected | Critical section names the resource |
| Reactive integration | Realm exposed as scheduler | `Realm.asyncExec` wrapped as Reactor scheduler |

## Diagram Merge Strategy

The diagram round-trip problem - keeping manual layout in sync with a model that may
evolve through inheritance, suppression, or direct editing - is resolved through
**three-way EMF Compare-based merging**.

### Approach

1. **Diagram as Ecore:** The Draw.io diagram is converted to an Ecore model representation.
   Geometry (positions, sizes, routing waypoints) is stored as model attributes.
2. **Three-way compare:** When the workflow model changes (parent workflow updated,
   activities added or suppressed, structure refactored), EMF Compare performs a three-way
   merge between:
   - The **base** - the diagram corresponding to the previous workflow state.
   - The **left** - the diagram with the user's manual layout adjustments.
   - The **right** - the freshly generated diagram from the new workflow state.
3. **Conflict annotation:** Where the three-way merge cannot resolve automatically,
   conflicts are surfaced as **labels directly on the diagram**, allowing the author to
   resolve them visually rather than in a separate merge UI.
4. **Auto-layout for additions:** New activities introduced by the workflow change are
   placed using ELK auto-layout, integrated into the existing manually-adjusted layout.
   Manual layout for unchanged elements is preserved.
5. **Manual refinement:** The author reviews the merged diagram and adjusts the layout
   of newly added elements as desired.

### Properties

- **Geometry preservation:** Manual layout work is never lost as long as the corresponding
  activities still exist in the model.
- **Inheritance-aware:** When a parent workflow is updated, the merge propagates through
  to derived workflow diagrams using the same mechanism - derived diagrams inherit layout
  changes where structure aligns, and re-layout incrementally where it does not.
- **Diagram as documentation:** Because the diagram is a first-class artifact maintained
  in sync with the model, it is reliable enough to use as primary documentation,
  not just a rendered view.

This strategy effectively makes the diagram a versioned, mergeable artifact alongside
the workflow definition itself - solving the long-standing problem of "the diagram and
the model are out of sync" that plagues many model-driven tools.

## Relationship to Prior Workflow Engines

OpGraph synthesizes patterns from multiple workflow engines (process-state-centric ESB
workflow products, case management workflow engines, and others). 
The table below contrasts the typical patterns found in those engines with OpGraph's approach.

| Concept | Typical prior-art approach | OpGraph |
|---|---|---|
| Process state | XML document, map, or untyped property bag | Strongly-typed EMF model |
| Activity I/O | XPath/expression mappings over state | Typed parameters + optional state mapping |
| Rollback | Engine-managed, opaque | EMF ChangeRecorder, inspectable |
| Checkpointing | Binary checkpoint store | Pluggable; Git, DB, object store |
| Process definition | Proprietary XML or DSL | Ecore model; YAML/JSON/XText DSL |
| Inheritance | Generally absent, or limited templating | Java-style + abstract + final + suppression |
| Execution model | Engine-driven, often synchronous-only | Compiled code. Sync (CompletionStage) + reactive (Mono/Flux) |
| Authoring | Monolithic vendor IDE | Multi-role, multi-tool, CLI integration |

## Distribution - Maven as Workflow Registry

OpGraph workflows are distributed as **standard Maven modules**. This gives workflow
publishing, versioning, and dependency resolution for free using the existing Maven
ecosystem.

### Module Structure

A workflow Maven module contains:

- The workflow definition in YAML/JSON/XText DSL source form.
- The compiled Ecore model.
- Optionally, compiled Java classes when all operations are implemented.
- A `module-info.java` / `META-INF/services` registration so the workflow is
  discoverable as a Java `ServiceLoader` service or [Nasdanika Capability](https://docs.nasdanika.org/core/capability/index.html).

### Discovery and Composition

- Workflows are **executed as classes** when compiled to Java - no special runtime
  container is required beyond the JVM.
- Workflows are **discovered as services** via the standard Java `ServiceLoader`
  mechanism or nasdanika capabilities, enabling runtime composition without hard-wiring dependencies.
- Maven version ranges and BOMs manage compatibility between workflow versions, the
  same way they manage library compatibility.

### Publishing Model

- Any team can publish a workflow module to any Maven repository (Maven Central,
  GitHub Packages, a private Nexus/Artifactory instance).
- Consumers declare a dependency, inherit the workflow, and extend or specialize it.
- **Source form distribution** allows consumers to inspect, understand, and document
  the workflow before compilation - the YAML/JSON/XText source is part of the published
  artifact, not just the compiled output.

## Diagram Generation

Complex workflows - especially deeply inherited ones - can be difficult to author from
scratch as diagrams. OpGraph supports a **text-first, diagram-derived** authoring path:

1. Author the workflow in YAML/JSON or the XText DSL.
2. Run the CLI to generate a **Draw.io diagram** with automatic layout via the
   **ELK (Eclipse Layout Kernel)** algorithm.
3. Manually adjust the generated diagram for clarity, grouping, or presentation.
4. The adjusted diagram is saved alongside the model as documentation.
5. When the underlying workflow changes, the **three-way merge strategy** (see
   *Diagram Merge Strategy* above) preserves manual layout while integrating new
   elements with auto-layout.

### Inheritance Visualization

When a workflow inherits from a parent, the generated diagram can optionally annotate
each activity with its origin - whether it is inherited as-is, overridden, abstract,
final, or suppressed. This makes the effective workflow immediately readable without
tracing the inheritance chain manually.

## Simulation

When not all activities have real implementations, OpGraph supports a **simulation
flavor** of code generation. Instead of generating stubs that throw
`UnsupportedOperationException`, the simulator generates:

- **Timed stubs:** Activities execute with a configurable or statistically modeled delay,
  representing realistic duration distributions (constant, uniform, normal, log-normal).
- **Probabilistic branching:** Conditional paths are taken with configurable probabilities,
  enabling Monte Carlo simulation of workflow outcomes.
- **State placeholders:** Output values are generated as synthetic but type-valid data,
  allowing downstream activities to execute without real inputs.

### Use Cases for Simulation

- **Documentation:** A fully abstract SDLC workflow with simulated activities produces
  an executable model of the process that can be run, observed, and explained to
  stakeholders without any real tooling integration.
- **Bottleneck identification:** Running the simulation at scale reveals which activities
  dominate elapsed time or resource contention, allowing teams to prioritize optimization
  efforts before committing to implementation.
- **Long-running workflow modeling:** An SDLC workflow spanning weeks or months can be
  simulated in compressed time (seconds or minutes) to explore scheduling, parallelism,
  and critical path questions.
- **Capacity planning:** Varying concurrency parameters and delay distributions produces
  throughput and latency estimates for infrastructure sizing.
- **"What-if" analysis:** Suppressing or replacing specific activities in a derived
  simulation workflow models the effect of proposed process improvements before
  implementing them.

Simulation output integrates with the token/checkpoint infrastructure - a simulated run
produces the same token log as a real run, making simulation traces inspectable in the
same tooling.

## Use Cases

### UC-1: Generic SDLC Workflow - Publish and Extend

**Context:** A platform engineering team wants to standardize software delivery across
multiple technology stacks.

**Actors:** Platform team (publisher), Java team, Python team, Data Science team
(consumers).

**Flow:**

1. The platform team authors a generic `SDLC` workflow module defining abstract
   activities: `Plan`, `Develop Code`, `Write Tests`, `Code Review`, `Build`,
   `Deploy to Staging`, `Acceptance Test`, `Deploy to Production`.
2. `Deploy to Production` is marked **final** - no derived workflow may skip or
   override it, enforcing the deployment gate.
3. `Code Review` is marked **final** - the review step is non-negotiable.
4. `Develop Code`, `Build`, and `Write Tests` are marked **abstract** - technology-specific.
5. The module is published to the organization's Maven repository.
6. The Java team creates a `java-sdlc` module that depends on `sdlc`, extends the
   workflow, and provides concrete implementations of `Develop Code` (Maven build),
   `Write Tests` (JUnit), and `Build` (Docker image build).
7. The Python team creates a `python-sdlc` module with implementations using `pip`,
   `pytest`, and a Python-appropriate build step.
8. The Data Science team creates a `ds-sdlc` module that additionally **suppresses**
   the `Deploy to Staging` activity (models go to a model registry, not a staging
   environment) and overrides `Acceptance Test` with a model evaluation step.

**Result:** All three teams share governance structure, audit steps, and deployment
gates from the parent, while implementing technology-appropriate details independently.
Changes to the parent (e.g., adding a security scan step) propagate automatically
when consumers update their dependency.

### UC-2: Regulatory Compliance Enforcement via Final Activities

**Context:** A financial services firm runs multiple workflow variants across business
units, all of which must satisfy audit requirements.

**Actors:** Compliance team (publishes base workflow), individual business unit teams
(extend it).

**Flow:**

1. The compliance team publishes a `trade-workflow` module with a **final**
   `Audit Log Entry` activity and a **final** `Regulatory Report Submission` activity.
2. Business unit teams extend the workflow, overriding pricing logic, notification
   steps, and routing - but cannot suppress or modify the final activities.
3. The compiler enforces this: any derived workflow that attempts to suppress a final
   activity fails at compile time with a clear error.
4. The compliance team can audit all deployed workflows by inspecting Maven dependency
   trees - any workflow claiming to extend `trade-workflow` is guaranteed to include
   the required steps.

### UC-3: SDLC Process Documentation and Simulation

**Context:** An engineering manager wants to document the team's SDLC, identify
bottlenecks, and present the process to non-technical stakeholders - before any
tooling integration is built.

**Flow:**

1. The manager authors the SDLC workflow in YAML using abstract activities with
   duration estimates expressed as statistical distributions (e.g., `Code Review`
   averages 4 hours, std dev 2 hours).
2. The CLI generates a Draw.io diagram with ELK auto-layout. The manager adjusts
   swim lanes and groupings for clarity.
3. The simulation generator produces a runnable Java module with timed stubs.
4. The simulation is run 1,000 times. Output shows that `Code Review` and
   `Deploy to Staging` are the dominant bottlenecks - not `Build` as assumed.
5. The manager uses this to justify prioritizing a self-service review tooling
   investment over build optimization.
6. The same workflow model is published as documentation - a web site generated from YAML and Draw.io.

### UC-4: Cross-Team Workflow Composition via Maven

**Context:** A platform team publishes a generic `data-pipeline` workflow. A product
team wants to use it with custom ingestion and transformation logic.

**Flow:**

1. The platform team publishes `data-pipeline:1.3.0` to Maven Central with abstract
   `Ingest`, `Transform`, and `Validate` activities and a final `Audit Trail` activity.
2. The product team adds a Maven dependency on `data-pipeline:1.3.0`, extends the
   workflow, and implements the three abstract activities.
3. The product team's workflow is compiled to Java and registered as a `ServiceLoader`
   capability.
4. A workflow orchestrator discovers and instantiates the workflow at runtime without
   any configuration changes - it is found on the classpath like any other service.
5. When `data-pipeline:1.4.0` is released (adding a `Data Quality Check` activity),
   the product team updates their dependency, reviews the diff in their inherited
   workflow diagram, and decides whether to override the new activity or accept
   the default implementation.

### UC-5: Test Environment Workflow via Suppression

**Context:** A team wants a fast-running test variant of their production workflow that
skips slow external notification and reporting steps.

**Flow:**

1. The production `order-fulfillment` workflow includes `Send Confirmation Email`,
   `Update CRM`, and `Generate Invoice` activities. None are marked final.
2. The team creates a `test-order-fulfillment` module that extends the production
   workflow and suppresses all three activities using no-op pass-through suppression.
3. The test workflow executes the same core fulfillment logic at full speed, with
   token recording intact, but without triggering real external systems.
4. Token logs from test runs are structurally identical to production logs, making
   them useful for validating the audit infrastructure itself.

### UC-6: AI-Assisted Workflow Implementation

**Context:** A developer has an elaborated workflow model with typed operation
signatures but no implementations yet.

**Flow:**

1. The developer runs the CLI to generate a stub module with empty operation
   implementations and full Javadoc derived from the workflow model and activity
   metadata.
2. An AI agent is pointed at the stub module. The activity signatures, parameter
   types (from Ecore), and documentation are sufficient context for the agent to
   generate plausible implementations for standard activities (HTTP calls, DB reads,
   transformations).
3. The developer reviews, corrects, and merges the AI-generated implementations.
4. Non-standard activities requiring domain expertise are implemented manually.
5. The completed module is published to Maven and made available for inheritance
   by other teams.

### UC-7: AI-Assisted Workflow Definition

**Context:** There is an existing body of documentation about a specific process.
A workflow definition shall be constructed from this documentation.

An AI agent is provided access to the documentation and OpGraph or diagram metamodel in the prompt.
It generates either OpGraph model (more complex) or diagram model (simpler). 
The model is validated for correctness, validation errors are used to refine the prompt.
The agent may also be provided tools to query the metamodel and access other context - perform
web searches, query internal knowledge sources.
The agent either produces a valid model or exceeds the maximum number of attempts. 
A more advanced scenario may involve multiple stages of elaboration.

Once a model (diagram or OpGraph) is available it goes through the elaboration pipeline elaborated above.


## Model-Based Telemetry

OpGraph treats telemetry as a first-class artifact of workflow execution, not as a
side-channel emitted to an external backend. Every workflow execution produces a
[**telemetry model**](https://telemetry.models.nasdanika.org/) - an Ecore model that captures spans, events, and the model changes
they caused - stored alongside the workflow definition and the workflow state.

This builds directly on the token and change-recorder infrastructure already described
above. The token log is, in effect, an unrefined form of telemetry; the telemetry model
is its structured, queryable, navigable expression.

### Telemetry as a Durable Artifact

In OpGraph, telemetry is:

- **Local-first.** Telemetry is produced and stored where the workflow runs. Forwarding
  to traditional observability backends (Jaeger, Honeycomb, Grafana, Loki, Prometheus)
  is an optional, additional export - not the primary store.
- **Durable.** Telemetry is an Ecore model serialized in standard EMF XMI (or JSON via
  EMF JSON). It outlives the runtime, the tooling, and the observability vendor.
- **Semantically rich.** Every span is linked to the workflow model elements it
  executed (operator, activity, critical section, mapping) and to the state changes
  it caused (feature-level diffs with before/after values via `ChangeRecorder`).
- **Versionable.** Telemetry is text-serializable and can be committed to Git
  alongside the workflow definition - a longitudinal record of workflow execution at
  the semantic level.

### What a Span Captures

In a traditional observability stack, a span captures duration, operation name, and
attributes. OpGraph spans capture additionally:

- The **operator** that produced the span (a typed reference to the workflow model
  element, not a string name).
- The **execution context** at span start, and the **mapped context** if the operator
  declared a `map` or `flatMap`.
- The **state changes** the span produced, as a structured change record - every
  feature modification with old and new values.
- The **child spans** corresponding to invoked operators, critical sections, or
  iterations of `flatMap`.
- The **transaction boundary** the span participated in (if any), enabling reconstruction
  of which changes were committed vs. rolled back.

The result is a span that doesn't just say "this operator ran" - it says exactly which
model element ran, what data it saw, and what data it changed.

### Generation From the Existing Token Log

The token infrastructure described earlier already records arguments, state changes,
and execution outcomes per activity invocation. The telemetry model is a **projection**
of that information into the OpenTelemetry-shaped schema: tokens become spans, change
records become structured change events linked to spans, and the workflow execution
graph becomes the parent-child span hierarchy.

This means telemetry is not an additional cost - it is a structured view of data the
runtime already produces. The configurable token granularity (lightweight,
checkpointed, per-commit-point) directly controls the resolution of the resulting
telemetry.

### Telemetry Context on the Execution Context

The **telemetry context** - the currently-active span, trace identifiers, and the
OpenTelemetry context for propagation - is exposed as part of the execution context
(the first operator parameter, the data plane). It flows with the work, not with the
configuration.

This placement is deliberate:

- A span is created **per operator invocation** and exists for the duration of that
  invocation. Each operator's execution context carries its own active span.
- When an operator invokes a child operator, the engine creates a **child span** under
  the parent's span before passing the downstream execution context. The parent-child
  span relationship mirrors the operator invocation hierarchy automatically.
- When an operator's `map` or `flatMap` produces a downstream context, the telemetry
  context propagates into it - the mapped operator's spans become children of the
  mapping operator's span.
- Iteration via `flatMap` produces one child span per element, all under the same
  parent span, enabling concise visualization of "this operator processed N items."

Operator authors do not manually manage span lifecycles. The engine starts and ends
spans around each operator invocation as part of the same machinery that manages
tokens and change recording. Operators may, however, *read* the telemetry context to
add attributes, events, or links - e.g., recording an LLM model name, the size of a
processed batch, or a correlation identifier from an external system.

#### Inbound Context Propagation - Starter Activities

**Starter activities** - operators that initiate workflow execution in response to an
external event - receive the inbound telemetry context from that event and seed the
workflow's root span with it. The OpenTelemetry W3C trace context propagation format
is the baseline.

Examples:

- **JMS listener:** Extracts `traceparent` and `tracestate` from incoming JMS message
  properties. The workflow's root span becomes a child of the upstream producer's span,
  preserving end-to-end trace continuity across systems.
- **HTTP listener:** Extracts trace context from incoming request headers (W3C, B3, or
  configurable propagator format). The workflow root span links to the calling client's
  trace.
- **Scheduled trigger:** Creates a fresh root span with no upstream parent, optionally
  attaching the schedule definition as a span attribute for correlation.
- **Workflow-invokes-workflow:** When a workflow operator invokes another workflow
  (discovered via `ServiceLoader` or referenced directly), the engine propagates the
  current telemetry context into the child workflow's execution context. The two
  workflows' telemetry models cross-link via the trace context.

#### Outbound Context Propagation

Conversely, operators that call external systems propagate the current telemetry
context outbound:

- HTTP client operators inject `traceparent` into outgoing request headers.
- JMS producer operators attach the trace context as message properties.
- LLM client operators may include trace identifiers in request metadata where the
  provider supports it.

The propagation is automatic for built-in client operators. Custom operators access
the telemetry context from their execution context parameter and propagate as needed
for their specific protocol.

#### Implication for Distributed Tracing

Because the telemetry context flows on the data plane and is automatically propagated
at workflow boundaries, OpGraph workflows participate in distributed tracing as
first-class citizens. A trace originating in an upstream microservice, passing through
an OpGraph workflow that invokes child workflows and external services, and continuing
downstream, produces one continuous trace - viewable in traditional observability
backends and, with the cross-workflow correlation discussed below, also navigable as
linked telemetry models.

### Telemetry-to-Diagram Linkage

Because OpGraph workflows have generated diagrams (see *Diagram Generation* and
*Diagram Merge Strategy* above), and because each span references the workflow model
element it executed, **spans can be linked to diagram elements** through the model.

This linkage is bidirectional:

- **Span → diagram element:** Selecting a span in a telemetry viewer highlights the
  corresponding activity, mapping, or critical section on the diagram.
- **Diagram element → spans:** Selecting an activity on the diagram surfaces all
  spans where that activity executed - across the current run or across the full
  longitudinal telemetry history.

The mechanism is straightforward because the diagram is itself an Ecore model with
explicit references to the workflow model elements, and spans hold typed references
to those same elements. No string-matching or convention-based linkage is required -
the references are direct.

### Live Replay With Diagram Visualization

The combination of (a) durable, structured telemetry, (b) full state change records,
and (c) diagram-to-model linkage enables a powerful debugging and analysis capability:
**live replay of a workflow execution on the diagram**.

#### Replay Mechanics

1. The telemetry model contains the complete span tree of a past workflow execution.
2. The state change records linked to each span describe every model modification with
   before/after values.
3. A replay tool walks the span tree chronologically, and at each step:
   - Highlights the currently-executing activity on the diagram (a moving marker
     traversing the activity graph).
   - Applies the recorded state changes to a reconstructed state model, displayed
     alongside the diagram.
   - Shows the span's input context, output, and any errors.

The marker traversing the diagram during replay gives a direct visual narrative of
the execution - the equivalent of a debugger's program counter, but at the workflow
level and operating on durable historical data rather than only live execution.

#### Live Modification During Replay

Because the workflow model, the diagram, and the telemetry model are all EMF models in
the same resource set, **the diagram can be modified during replay** and the modifications
are reflected immediately:

- Rearranging activities for clarity while watching execution flow.
- Adding annotations to record observations as the replay progresses.
- Marking activities for further investigation, which becomes persistent metadata.
- Toggling visibility of branches to focus on specific paths.

The replay is a *view* over the telemetry model; the underlying execution history is
immutable, but the presentation is live and editable.

#### Replay Modes

- **Step:** Manual advancement through spans, one at a time. Suitable for detailed
  debugging.
- **Play with speed control:** Continuous traversal at configurable speed, including
  real-time (matching original durations) and compressed time (long-running workflows
  replayable in seconds).
- **Filtered replay:** Restrict to spans matching a predicate (only LLM calls, only
  state modifications to a specific feature, only spans within a critical section).
- **Comparative replay:** Two telemetry models side by side - e.g., a known-good run
  and a failing run - with synchronized markers on the same diagram, highlighting
  divergence points.

### Use Cases

**Debugging.** A failed production workflow is loaded from its telemetry artifact and
replayed on the diagram. The point of failure, the input that caused it, and the
sequence of state changes leading up to it are all directly visible without log
spelunking.

**Audit.** A regulator reviewing a compliance-sensitive workflow can replay any past
execution, see exactly which activities ran, what data they saw, and what they changed.
The audit trail is the telemetry model, in a durable, vendor-independent format.

**Optimization.** Replaying a long-running workflow at compressed time reveals
where time was actually spent - not from synthetic simulation, but from real production
telemetry. The diagram visualization makes bottlenecks immediately obvious.

**Training and documentation.** A workflow's behavior can be demonstrated by replaying
representative telemetry traces on its diagram. New team members watch how the
workflow actually executes rather than reading static documentation.

**Test failure analysis.** A failing CI test produces a telemetry artifact alongside
its failure output. The developer replays the telemetry against the workflow diagram
to understand the failure before touching the code.

**Long-horizon analysis.** Telemetry artifacts from many executions over weeks or months
are aggregated to reveal patterns - activities whose duration is drifting, branches
whose probabilities have shifted, critical sections experiencing growing contention.
Because the telemetry format is durable and tool-independent, this longitudinal view
remains accessible even as runtime and tooling evolve.

### Telemetry Volume Management

Telemetry can be voluminous. OpGraph adopts the **"just right" curation** philosophy
described in the prior model-based telemetry work: capture what is semantically
valuable, drop what is operational noise. Configurable curation policies include:

- **Drop spans that don't modify state.** Read-only operator invocations without state
  changes and without child spans of interest can be elided.
- **Aggregate fine-grained spans.** A sequence of related model operations within one
  critical section can be summarized as one span with a structured summary.
- **Drop spans below a duration threshold.** Activities completing in microseconds may
  not warrant individual span records.
- **LLM call aggregation.** A multi-turn LLM interaction can be aggregated into a
  single "conversation" span with the turn count, total tokens, and total duration.
- **State change filtering.** Changes to features marked as "noise" (e.g., timestamp
  updates, cache fields) can be excluded from change records.

Curation policies are declarative properties of the workflow or the runtime
configuration - not procedural code embedded in operators.

### Optional Forwarding to Traditional Backends

OpGraph can additionally forward telemetry to traditional observability backends via
the standard OpenTelemetry export protocol. This is appropriate for:

- Operational monitoring of workflow runtime health.
- Alerting on workflow failures, latency anomalies, or error rates.
- Cross-system trace correlation when workflows participate in larger distributed
  request flows.

The forwarded telemetry is the standard span/metric/log surface - flattened from the
rich model-based representation. The full semantic detail (typed model references,
structured change records, diagram linkages) stays in the local telemetry model.
Operational backends handle the operational dimension; the local telemetry model
handles the strategic dimension.

### Summary

| Aspect | Traditional telemetry | OpGraph model-based telemetry |
|---|---|---|
| Storage | External backend | Local Ecore model, optionally forwarded |
| Retention | Hours to days | Indefinite, versionable in Git |
| Span semantics | String operation name + attributes | Typed reference to workflow model element |
| State changes | Not captured | Feature-level diffs with before/after values |
| Replay | Reconstructed from logs, lossy | Direct from durable artifact, lossless |
| Diagram linkage | Manual, by naming convention | Automatic, by model reference |
| Long-horizon analysis | Limited by retention and vendor lock-in | Native, tool-independent |
| Format durability | Vendor-specific | Open EMF XMI / JSON |

## Declarative Semantic Mapping

OpGraph operators may declare `map` and `flatMap` functions that adapt the parent
execution context into a downstream context. The base design assumes these are written
as Java methods. For non-trivial mappings - especially agent semantic contexts, model
projections, and reusable operator adapters - Java code is the wrong abstraction:

- It is opaque to inheritance, suppression, diagram generation, and telemetry.
- It cannot be authored or modified by SMEs through visual tools.
- It is not amenable to AI generation, review, or modification.
- It cannot be inspected, transformed, or composed at the model level.

A **declarative mapping model** addresses all of these. 
The mapping becomes a first-class artifact in the same modeling fabric as the workflow itself.

### Two Forms of `map` / `flatMap`

Operators may declare their context mapping in either form:

- **Java form** - a Java method, as in the base design. Suitable for mappings that need
  arbitrary computation, complex side effects, or integration with existing Java code.
- **NSML form** - a reference to an [NSML](https://github.com/Nasdanika-Models/nasdanika-semantic-mapping-language) transformation model. 
  Suitable for declarative
  projections, agent context narrowing, persona switching, and any mapping whose
  semantics are expressible as match-and-transform rules.

The two forms are interchangeable at the operator level - an operator with a Java `map`
and an operator with an NSML `mapModel` are indistinguishable to the rest of the workflow.
NSML mappings compile to Java implementations of the same interface, so there is no
runtime distinction either.

### Why NSML Fits OpGraph's `map` / `flatMap`

NSML's rule shape - match an input element by namespace URI and EClassifier name with
an expression-language condition, produce an output element with computed feature
values - is precisely what context mapping needs:

- **`map`** corresponds to one matched rule producing one output context.
- **`flatMap`** corresponds to one matched rule producing multiple output contexts
  (NSML rules may produce collections naturally).
- **Typed subset generation** (described in the base OpGraph design under Context
  Mapping) is derived from the NSML transformation by static analysis - the EClasses
  and features the transformation reads and writes define the downstream context's
  metamodel subset.
- **Read / write / read-only / copy-on-write modes** are reflected in NSML rule
  declarations and enforced at compilation.

### Integration Points

#### Operator Declaration

An operator declares its mapping with a reference to an NSML transformation:

```yaml
operator: ProcessTickets
map:
  nsml: classpath:/mappings/ticket-context.nsml
```

Or inline for simple cases:

```yaml
operator: FilterHighPriority
map:
  nsml: |
    rules:
      - match: { uri: "http://issues.example.com", classifier: "Issue" }
        when: "spel: priority > 5"
        produce:
          uri: "http://focused.example.com"
          classifier: "PriorityIssue"
          features:
            id: "spel: id"
            summary: "spel: summary"
```

The above samples are YAML pseudo-code - real definitions will be different - NSML will be tightly integrated with
OpGraph using `mapModel` and `flatMapModel` references.

AbstractXXX - XXX - XXXReference pattern will be used to allow inline mapping definitions and external mapping definitions. 

#### Compile-Time Subset Generation

When the OpGraph compiler encounters an NSML-declared mapping, it:

1. Loads the NSML transformation model.
2. Statically analyzes the rules to determine the EClasses and features the
   transformation reads from the parent context and writes to the downstream context.
3. Generates the downstream context's Ecore subset model.
4. Generates the adapter implementation that delegates to the parent.
5. Compiles the NSML transformation to a Java implementation of `Function<Parent,
   Downstream>` or `Function<Parent, Flux<Downstream>>`.

This is the same Transformer-pattern compilation NSML provides as a standalone
capability - OpGraph just consumes and wraps the output.

#### Inheritance and Suppression

NSML mappings participate in workflow inheritance. A derived workflow may:

- **Inherit** the parent's mapping unchanged.
- **Refine** the mapping by adding rules, narrowing match conditions, or overriding
  feature mappings.
- **Replace** the mapping entirely with a different NSML model (subject to the
  narrowing-only rule discussed in the base design's open questions).

This is more powerful than Java-form inheritance, where overriding a `map` method means
rewriting it. NSML rules can be incrementally specialized.

#### Diagram Generation

NSML transformations have their own Draw.io diagram representation (see NSML design
document). When OpGraph generates a workflow diagram, mapped operators may be drawn
with a nested page showing the NSML mapping diagram. Selecting the operator in the
parent diagram drills into the mapping; selecting an NSML rule highlights the affected
operator and downstream features.

#### Telemetry Integration

Each NSML rule execution produces a child span under the operator's span, capturing
which rule matched, which output was produced, and (under detailed telemetry
configuration) the values that flowed through. This makes mapping behavior debuggable
at the rule level using the same replay-on-diagram tooling described in the telemetry
section.

#### AI Elicitation

The NSML elicitor (chat/prompt -> valid NSML model) is reusable for OpGraph: an SME describes
the mapping in natural language and produces a reviewable NSML model. The generated
mapping integrates into the workflow without code-generation steps for the SME.

### Composition

NSML mappings can be composed. An operator's `map` may itself reference an NSML
transformation that imports and reuses other NSML transformations. This composability
is inherited from the Transformer pattern (an NSML transformation compiles to a
Transformer target, which composes with other Transformer targets).

For OpGraph, this means common semantic mappings - "narrow to one Jira issue,"
"narrow to one customer record," "switch to product-manager [persona](https://product-management.models.nasdanika.org/references/eClassifiers/Persona/index.html)" - can be
published as reusable NSML modules and consumed by many operators across many
workflows. The reusability dynamic is the same as Maven workflow distribution
described earlier: NSML modules are Maven artifacts, discoverable, versionable,
and composable.

### Boundary Between OpGraph and NSML

NSML stands alone. It is useful without OpGraph for:

- Standalone model transformations (Ecore-to-Ecore, Ecore-to-application-model,
  application-model-to-site).
- Documentation generation from arbitrary models.
- Ad-hoc data shaping in CLI pipelines.

OpGraph stands alone. It is useful without NSML for:

- Workflows whose mappings are trivial enough to express in Java.
- Workflows that don't need mappings at all (operators consume the parent context
  directly).

The integration is opt-in at the operator level. An OpGraph workflow may use NSML
mappings for some operators and Java mappings for others, or no mappings at all.

## Open Design Questions

1. **Suppression semantics:** Remove-and-rewire vs. no-op pass-through - or both as modes?
2. **Argument recording scope:** Are operation arguments part of the token state or
   transition metadata? This determines replay correctness for side-effectful activities.
3. **Idempotency contract:** How does the runtime distinguish "not yet executed" from
   "executed, result lost"? Required for safe replay.
4. **Token granularity defaults:** What is the out-of-the-box default - lightweight or
   fully checkpointed? Should this be per-activity or per-workflow?
5. **XText DSL registry:** How are published activity types versioned and resolved?
   Maven coordinates are the natural answer - confirm whether a separate registry is
   ever needed or whether Maven search (Central, private repos) is sufficient.
6. **Simulation delay modeling:** What distribution types are supported out of the box
   for activity duration simulation? (constant, uniform, normal, log-normal, empirical?)
   How are distributions specified in the workflow DSL?
7. **Final activity granularity:** Is finality per-activity or per-transition? A final
   activity with overridable retry logic may need finer granularity than a blanket final flag.
8. **Abstract activity enforcement:** When is incompleteness an error vs. a warning?
   A workflow with abstract activities should be deployable in simulation mode but
   blocked from production compilation - define the mode-check rules precisely.
9. **ServiceLoader contract:** What interface do compiled workflows implement for
   `ServiceLoader` discovery? This interface is the stable API contract across versions.
10. **Reactive operation contract:** Should operation implementations declare their
    natural mode (sync, async, reactive), with the generator wrapping for other modes?
    Or should operations always be written reactive-first, with sync as a `block()` wrapper?
    The latter is more uniform but raises the bar for simple operation authors.
11. **Back-pressure propagation across activities:** When activity A produces a `Flux`
    consumed by activity B, back-pressure flows naturally. But when the token recorder
    needs to persist each emitted item, the recorder itself becomes a back-pressure
    participant - define how recording integrates with reactive flow control.
12. **Cancellation semantics:** In reactive mode, subscribers can cancel. How does
    cancellation interact with the token log? Is a cancelled workflow rolled back
    automatically, left in its current state, or marked as cancelled-in-progress?
13. **Context mapping - declarative vs. computed:** Is the metamodel subset for a
    `map` / `flatMap` declared (the developer lists the reachable EClasses/features) or
    computed (the compiler infers reachability from the operator's code)? Declarative is
    more transparent and reviewable; computed is less error-prone but harder to audit.
14. **Mapping and inheritance interaction:** When a derived workflow overrides an
    operator with a `map`, does it inherit the parent's mapping declaration, narrow it
    further, or replace it? A narrowing-only rule preserves the security property;
    replacement breaks it.
15. **Adapter performance:** Adapter chains for deeply nested mappings may have
    measurable overhead. Is there a threshold at which the compiler should generate
    a flattened direct implementation instead of a chain of adapters?
16. **Copy-on-write commit:** For sandbox mappings, when (if ever) is the copy committed
    back to the parent? Never (pure read-only experiment), on explicit commit, or
    on successful operator completion?
17. **Parallel `flatMap` design:** When the `parallel` flag is eventually introduced,
    how does it interact with token ordering (DAG vs. linear sequence), change-recorder
    concurrency (merge strategy for concurrent writes to the same parent feature),
    and rollback (partial failure of a parallel batch)?
18. **Operator duration classification:** Are duration tiers (`fast` / `bounded` /
    `unbounded`) declared per operator, inferred from operator type, or both? Inference
    works for known activity types (HTTP, LLM, model operation) but breaks for custom
    operators. A combined approach - inference with explicit override - is likely needed.
19. **Critical section enforcement strictness:** Should `unbounded` operators inside
    critical sections be a compile-time error, a warning, or runtime-configurable per
    workflow? Different deployments may want different strictness.
20. **Multi-realm critical sections:** Can a critical section protect multiple realms
    at once (e.g., the workflow state *and* a connection pool)? If so, deadlock avoidance
    requires a global lock-ordering discipline - either enforced by the runtime via
    canonical ordering, or declared by the author.
21. **Rolled-back token audit policy:** When a transaction rolls back, are the discarded
    changes erased from the token log, marked as rolled-back-but-visible, or written to
    a separate failure-audit log? Each has different audit and debugging trade-offs.
22. **Reactive scheduler granularity:** Is there one realm scheduler per editing domain,
    or per workflow instance? Per-instance gives better isolation but more thread
    overhead; per-domain is more efficient but shares scheduling across instances.
23. **Telemetry-to-token relationship:** Is the telemetry model a derived projection
    of the token log (always regenerable from tokens), the primary record (with tokens
    as a runtime-only structure), or stored separately at runtime with both retained?
    Each has trade-offs for storage, regenerability, and runtime overhead.
24. **Telemetry granularity at runtime:** Is curation applied at span generation time
    (cheap, but irreversible), at storage time (more expensive, but full fidelity
    available for downgrade), or both (configurable per deployment)?
25. **Replay state reconstruction:** Is the state at any point in replay reconstructed
    by forward-replaying changes from the initial state, or is the state model snapshotted
    at checkpoints with incremental changes in between? Snapshotting trades storage for
    replay speed; pure replay trades speed for storage.
26. **Diagram modifications during replay - persistence:** When a user modifies the
    diagram during replay (annotations, layout, marks), are the modifications saved
    back to the diagram artifact, kept as a side-record linked to the telemetry, or
    both? This is similar to the diagram merge question but specific to the replay
    workflow.
27. **Cross-workflow trace correlation:** When a workflow invokes another workflow (in
    a different module, via service loader), how do their telemetry models relate?
    Embedded as sub-spans, linked as separate resources, or both with a configurable
    boundary policy?
28. **Sensitive data in telemetry:** State changes captured in telemetry may include
    sensitive values (PII, credentials, business-sensitive data). What is the redaction
    model? Per-feature annotations on the Ecore model? Runtime-configurable filters?
    Both?
29. **Operator-author access to the telemetry context:** Operators should not start
    or end spans (the engine owns the lifecycle), but they may need to add attributes,
    events, links, or baggage. What is the minimal API surface exposed on the execution
    context for this - and how is it kept narrow enough that operators cannot break
    the span hierarchy by accident?
30. **Propagator pluggability:** The starter activities described above default to
    W3C trace context propagation. How are alternative propagators (B3, Jaeger, custom
    enterprise propagators) registered and selected - globally, per workflow, per
    starter operator, or all three?
31. **Cross-workflow context boundary policy:** When a workflow invokes a discovered
    workflow, is the child's root span always a child of the parent's current span,
    or is "new trace at boundary" an option (e.g., for fire-and-forget async invocation
    where the parent does not wait)? Both models are useful in different scenarios.
32. **NSML rule scope analysis precision:** Static analysis of NSML rules to derive
    the downstream metamodel subset works for straightforward feature reads, but may
    be imprecise for expressions that traverse deep paths or use dynamic dispatch.
    Is the analysis conservative (over-includes features, reducing the security
    benefit) or strict (under-includes, requiring manual override)?
33. **Mixed-form workflow inheritance:** When a parent workflow has a Java `map`
    and a derived workflow wants to refine it declaratively with NSML - or vice versa
    - how is the override expressed? Replacement is always available; structural
    refinement across forms is harder.
34. **NSML mapping versioning across workflow versions:** When an NSML mapping module
    is updated independently of the workflow that uses it, does the workflow recompile
    against the new mapping, pin to the old one, or detect incompatibility? Standard
    Maven version range mechanisms apply, but the structural compatibility check (does
    the downstream context still satisfy what downstream operators expect?) is more
    subtle.
    