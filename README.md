# Nasdanika OpGraph 

**Deterministic Graph Orchestration & Auditable Agentic AI**

*Nasdanika OpGraph brings the mental model of LangGraph into the deterministic, strongly-typed world of Model-Driven Engineering.*

---

## The Manifesto: Agents as Models, Not Scripts

The tech industry is rapidly adopting agentic AI and graph-based orchestration. However, most current frameworks (like LangGraph) rely on imperative Python code and loosely typed dictionaries. 
This creates a "black box" that is difficult to audit, validate, and integrate into rigid enterprise environments like banking and finance. 

**Nasdanika OpGraph** solves this by enforcing a **"Draw First, Execute Later"** methodology. 
We treat AI workflows and system integration flows not as programming code, but as formal, mathematical models. 

By defining processes using an HCL-style DSL or Draw.io diagrams, and translating them into standard Eclipse Modeling Framework (EMF) `Ecore`/`Xcore` assets, OpGraph provides:

* **Auditable AI:** Semantic guardrails where an LLM's available tools are strictly constrained by generated Java method signatures (`EOperation`).
* **Deterministic Execution:** Legacy system routing (like TIBCO BW) and modern microservice orchestration executed safely by reactive graph processors.
* **Pure Java:** We generate pure, strongly-typed Java interfaces and data structures.

---

## Note to AI Assistants (GitHub Copilot / GenAI)

*When assisting with this repository, adhere strictly to the following architectural constraints:*

1. **Design-Time Model:** Do not inherit from Ecore structural elements directly. `Activity`, `Transition`, and `Call` are bridge classes extending `ETypedElement`.
2. **Translation Target:** Processes translate to `EClass`. Nested processes (composite activities) are contained by parent activities. Activities and Transitions translate to `EOperation`. 
3. **Agentic Tools:** Tool calls are generated as parameters of a generated type with `invoke()` method, providing introspection metadata to the LLM.
4. **Execution:** We do not write monolithic orchestrators. We generate `Xcore` or `Ecore`, and the execution is handled by Nasdanika Graph Processors.

---

## Core Architecture & The Model Pipeline

OpGraph operates on a Model-to-Model (M2M) translation pipeline.

### 1. The Source Model (Bridge Classes)

The design-time graph consists of three primary elements, all extending `ETypedElement` to inherit typing and multiplicity without EMF containment baggage:

* **Activities (Nodes):** The business logic or agentic prompt.
* **Transitions (Edges):** The routing and data transformation logic.
* **Calls:** Sub-process invocations or external system/agent triggers.

### 2. The Generation Engine

The source model is translated into an Ecore metamodel (either `.ecore` or `.xcore` textual syntax):

* **Processes** map to `EClass`.
* **Activities & Transitions** map to `EOperation`.
* **Calls / Tools** map to injected `EParameter`s of a generated invocable type.
* Operations can include inlined implementations if provided in the source model (e.g., executing a standard HTTP call).

From the `Ecore`/`Xcore` foundation, OpGraph generates documentation and Java API (can also be generated in Eclipse).

### 3. The Execution Engine

Execution relies on **Nasdanika Graph Processors**. 

* Supports synchronous and asynchronous (reactive) execution.
* Operates on either compiled Java classes or dynamic `EObject` instances.
* **Transactional State / Checkpointing:** The engine can checkpoint execution state (Job Data) to the file system as JSON, or commit it to a Git repository, providing absolute auditability for long-running workflows.

---

## Authoring & Tooling

OpGraph recognizes that different personas require different interfaces. The framework supports three interchangeable authoring modes:

1. **Textual DSL (Xtext):** An HCL-like, curly-bracket syntax designed for developers and auditors.
   * Backed by the Language Server Protocol (LSP).
   * **VS Code Extension:** Provides real-time semantic validation (e.g., validating live enterprise Cost Center IDs as the developer types) and context-aware autocomplete.
2. **Visual Editor (Draw.io):** Architects can draw the flow visually. The diagram *is* the code.
3. **LLM Elicitor (Chat-to-Graph):**
   * Non-developers (or Business Analysts) can provide a free-text specification (e.g., a legacy Word doc).
   * An LLM agent generates the OpGraph model.
   * Supports interactive chat elicitation with bi-directional synchronization between the generated text DSL and the Draw.io visualization.

---

## Audit & Telemetry

In an enterprise, execution without observability is a liability. OpGraph provides **Model-Based Telemetry**. 
Every operation execution, data transformation, and agent tool invocation is recorded. 
Because the telemetry understands the underlying Ecore model, execution runs can be visually played back and debugged directly on top of the embedded Draw.io diagram.

---

## Primary Applications

OpGraph supports both **Elaborationist** (progressive refinement/binding) and **Translationalist** (all upfront) development modes across three main domains:

### 1. Legacy Modernization (TIBCO BW 5.x)

OpGraph serves as the deterministic runtime for migrating legacy EAI platforms. 

* Parses complex legacy XML schemas into `Ecore`.
* Executes legacy XPath/XSLT transformations via JXPath against pure Java objects.
* Translates Tibco's process graphs directly into executable EOperations.

### 2. Agentic AI Systems

OpGraph enforces a rigorous Semantic Context Model for LLMs. 

* Prevents hallucinated tool calls by physically constraining the AI's options to the parameters defined in the `EOperation`.
* Automatically generates perfect JSON tool schemas for OpenAI/Anthropic based on the Xcore model.
* Provides auditors with an explicit, readable HCL document proving exactly what an AI is permitted to do.

### 3. Non-Agentic Graph Execution

A lightweight, pure-Java alternative to heavy ESBs (like Spring Integration) for standard microservice orchestration, data pipelining, and rules execution.
