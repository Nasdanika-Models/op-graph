package org.nasdanika.models.opgraph.generator;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.nasdanika.common.DefaultConverter;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.Util;
import org.nasdanika.models.opgraph.Attribute;
import org.nasdanika.models.opgraph.Call;
import org.nasdanika.models.opgraph.Class;
import org.nasdanika.models.opgraph.Component;
import org.nasdanika.models.opgraph.Composite;
import org.nasdanika.models.opgraph.CompositeConsumer;
import org.nasdanika.models.opgraph.CompositeFunction;
import org.nasdanika.models.opgraph.CompositeSupplier;
import org.nasdanika.models.opgraph.Consumer;
import org.nasdanika.models.opgraph.Feature;
import org.nasdanika.models.opgraph.Function;
import org.nasdanika.models.opgraph.Operator;
import org.nasdanika.models.opgraph.OpgraphPackage;
import org.nasdanika.models.opgraph.Package;
import org.nasdanika.models.opgraph.Predicate;
import org.nasdanika.models.opgraph.Reference;
import org.nasdanika.models.opgraph.Supplier;
import org.nasdanika.models.opgraph.Transition;

/**
 * Generates Xcore from OpGraph model. 
 */
public class EcoreGenerator {
	
	private static final String JAVA_LANGUAGE = "Java";
	public static final String GEN_MODEL_ANNOTATION_SOURCE = "http://www.eclipse.org/emf/2002/GenModel";
	
	public enum GenModelAnnotationDetailKey {
		
		body,
		get,
		set;
		
		public void set(EModelElement modelElement, String value) {
			EAnnotation genModelAnnotation = modelElement.getEAnnotation(GEN_MODEL_ANNOTATION_SOURCE);		
			if (Util.isBlank(value)) {
				if (genModelAnnotation != null) {
					genModelAnnotation.getDetails().removeKey(name());
				}			
			} else {
				if (genModelAnnotation == null) {
					genModelAnnotation = EcoreFactory.eINSTANCE.createEAnnotation();
					genModelAnnotation.setSource(GEN_MODEL_ANNOTATION_SOURCE);
					modelElement.getEAnnotations().add(genModelAnnotation);
				}
				genModelAnnotation.getDetails().put(name(), value);
			}
		}
				
	}
	
	protected EcoreFactory factory;
	protected Package opPackage;

	public EcoreGenerator(Package opPackage) {
        this(opPackage, EcoreFactory.eINSTANCE);
	}
	
	public EcoreGenerator(Package opPackage, EcoreFactory factory) {
		this.opPackage = opPackage;
        this.factory = factory;
        
		ePackage = factory.createEPackage();
        ePackage.setNsPrefix(opPackage.getNsPrefix());
        ePackage.setNsURI(opPackage.getNsURI());
        ePackage.setName(opPackage.getName());        
	}	
	    
    protected Map<Reference, EReference> referenceMap = new HashMap<>();
    protected EPackage ePackage;	
    
    public Map<Reference, EReference> getReferenceMap() {
		return referenceMap;
	}   
		
    public Package getOpPackage() {
    	return opPackage;
    }
    
    public EPackage getEPackage() {
		return ePackage;
	}
    
	public EPackage generate() {
        opPackage
        	.getClasses()
			.stream()
			.forEach(opClass -> generateEClass(opClass));

        return ePackage;
	}
	
	protected EClass generateEClass(Class opClass) {
		for (EClassifier eClassifier: ePackage.getEClassifiers()) {
			if (eClassifier instanceof EClass eClass && eClass.getName().equals(opClass.getName())) {
				return eClass;
			}
		}
		
		java.util.function.Predicate<EClass> eClassPredicate = new HashSet<>()::add;
		EClass eClass = switch (opClass) {
			case CompositeFunction compositeFunction -> generateCompositeFunction(compositeFunction, factory.createEClass(), eClassPredicate);
			case CompositeSupplier compositeSupplier -> generateCompositeSupplier(compositeSupplier, factory.createEClass(), eClassPredicate);
			case CompositeConsumer compositeConsumer -> generateCompositeConsumer(compositeConsumer, factory.createEClass(), eClassPredicate);
			case Call call -> generateCall(call, factory.createEClass(), eClassPredicate);
			case Function function -> generateFunction(function, factory.createEClass(), eClassPredicate);
			case Transition transition -> generateTransition(transition, factory.createEClass(), eClassPredicate);
			case Predicate predicate -> generatePredicate(predicate, factory.createEClass(), eClassPredicate);
			case Supplier supplier -> generateSupplier(supplier, factory.createEClass(), eClassPredicate);
			case Consumer consumer -> generateConsumer(consumer, factory.createEClass(), eClassPredicate);
			case Operator operator -> generateOperator(operator, factory.createEClass(), eClassPredicate);
			case Composite composite -> generateComposite(composite, factory.createEClass(), eClassPredicate);
			case Component component -> generateComponent(component, factory.createEClass(), eClassPredicate);
			case Class clazz -> generateClass(clazz, factory.createEClass(), eClassPredicate);		
		};
		
		if (eClass != null && eClass.getEPackage() == null) {
			ePackage.getEClassifiers().add(eClass);
		}
		return eClass;		
	}
	
	protected EClass generateClass(
			Class opClass, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		if (eClassPredicate.test(OpgraphPackage.Literals.CLASS)) {
			eClass.setName(opClass.getName());
			for (EClass eSuperType: opClass.getSuperTypes()) {
				eClass.getESuperTypes().add(eSuperType);
			}
			
			for (Feature feature : opClass.getFeatures()) {
				if (feature instanceof Reference reference) {
					eClass.getEStructuralFeatures().add(generateReference(reference));
				} else {
					eClass.getEStructuralFeatures().add(generateAttribute((Attribute) feature));
				}				
			}
			copyAnnotations(opClass, eClass);			
		}
				
		return eClass;
	}
	
	/**
	 * A class is "empty" if its definition adds no value except as a marker or for typing purposes, i.e. it has no features and has zero or one supertype.
	 * @param opClass
	 * @return
	 */
	protected boolean isEmpty(Class opClass) {
		return opClass.getFeatures().isEmpty() && opClass.getSuperTypes().size() <= 1;
	}
	
	protected boolean isEmpty(Component opComponent) {		
		return isEmpty(((Class) opComponent))
				&& opComponent.getStarter() == null
				&& opComponent.getStopper() == null
				&& opComponent.getOutgoingCalls().isEmpty();
	}

	protected EAttribute generateAttribute(Attribute attribute) {
		EAttribute eAttribute = factory.createEAttribute();
		generateStructuralFeature(attribute, eAttribute);
		eAttribute.setID(attribute.isId());
		eAttribute.setDefaultValueLiteral(attribute.getDefaultValueLiteral());
		return eAttribute;
	}

	protected EReference generateReference(Reference reference) {
		EReference eReference = factory.createEReference();
		generateStructuralFeature(reference, eReference);
		referenceMap.put(reference, eReference);
		eReference.setContainment(reference.isContainment());
		eReference.setResolveProxies(reference.isResolveProxies());
		Reference opposite = reference.getOpposite();
		if (opposite != null) {
			EReference eOpposite = referenceMap.get(opposite);
			if (eOpposite != null) {
				eReference.setEOpposite(eOpposite);
			}
		}
		return eReference;
	}
	
	protected void generateStructuralFeature(
			Feature opFeature, 
			EStructuralFeature eStructuralFeature) {

		generateTypedElement(opFeature, eStructuralFeature);
		
		eStructuralFeature.setChangeable(opFeature.isChangeable());
		eStructuralFeature.setDefaultValueLiteral(opFeature.getDefaultValueLiteral());
		eStructuralFeature.setDerived(opFeature.isDerived());
		eStructuralFeature.setTransient(opFeature.isTransient());
		eStructuralFeature.setUnsettable(opFeature.isUnsettable());
		eStructuralFeature.setVolatile(opFeature.isVolatile());
	}
		
	protected void generateTypedElement(ETypedElement source, ETypedElement target) {
		target.setEType(source.getEType());
		target.setName(source.getName());
		
		target.setLowerBound(source.getLowerBound());
		target.setOrdered(source.isOrdered());
		target.setUnique(source.isUnique());
		target.setUpperBound(source.getUpperBound());
		copyAnnotations(source, target);
	}
	
	
	protected void copyAnnotations(EModelElement source, EModelElement target) {
		source.getEAnnotations().forEach(eAnnotation -> {
			target.getEAnnotations().add(EcoreUtil.copy(eAnnotation));
		});
	}
		
	/**
	 * Generates EOperation from Supplier. 
	 * @param supplier
	 * @param outputClassName Name of the output class for suppliers with more than one output 
	 * @return
	 */
	protected EOperation generateOperation(Operator operator) {
		EOperation eOperation = factory.createEOperation();
		String operationName = operator.getOperationName();
		if (Util.isBlank(operationName)) {
			operationName = switch (operator) {
			case Function function -> "apply";
			case Predicate predicate -> "test";
			case Supplier supplier -> "get";
			case Consumer consumer -> "accept";
			default -> "execute";
			};
		}
		eOperation.setName(operationName);
		
		if (operator instanceof Supplier supplier) {
			EList<ETypedElement> outputs = supplier.getOutputs();
			if (outputs.size() == 1) {
				eOperation.setEType(outputs.get(0).getEType());
			} else if (outputs.size() > 1) {
				String outputClassName = supplier.getOutputName();				
				EClass oClass = ePackage.getEClassifiers()
						.stream()
						.filter(e -> e instanceof EClass && e.getName().equals(outputClassName))						
						.map(EClass.class::cast)
						.findFirst()
						.orElseGet(() -> {
							EClass outputClass = factory.createEClass();
							for (ETypedElement output: outputs) {
								if (output instanceof Reference reference) {
									outputClass.getEStructuralFeatures().add(generateReference(reference));
								} else if (output instanceof Attribute attribute) {
									outputClass.getEStructuralFeatures().add(generateAttribute(attribute));
								} else {				
									EClassifier outputType = output.getEType();
									if (outputType instanceof EClass) {
										EReference eReference = factory.createEReference();
										generateTypedElement(output, eReference);
										outputClass.getEStructuralFeatures().add(eReference);
									} else {
										EAttribute eAttribute = factory.createEAttribute();
										generateTypedElement(output, eAttribute);
										outputClass.getEStructuralFeatures().add(eAttribute);
									}
								}
							}
							ePackage.getEClassifiers().add(outputClass);
							return outputClass;
						});						
						
				eOperation.setEType(oClass);
			} 
		} else if (operator instanceof Predicate) {
			eOperation.setEType(EcorePackage.Literals.EBOOLEAN);
		}
		
		if (operator instanceof Consumer consumer) {
			for (ETypedElement input: consumer.getInputs()) {
				EParameter eParameter = factory.createEParameter();
				generateTypedElement(input, eParameter);								
				eOperation.getEParameters().add(eParameter);
			}
		}	
				
		for (EClassifier ex: operator.getExceptions()) {
			eOperation.getEExceptions().add(ex);  
		}
		
		copyAnnotations(operator, eOperation);
				
		String body = operator.getBody();
		if (Util.isBlank(body) && !Util.isBlank(operator.getBodyRef())) {
			try {
				body = loadCode(operator, operator.getBodyRef());
			} catch (IOException e) {
				throw new NasdanikaException("Failed to load code from " + operator.getBodyRef(), e);
			}
		}
		
		if (!Util.isBlank(body)) {
			String translatedBody = translate(
					body, 
					operator.getLanguage(), 
					GenModelAnnotationDetailKey.body, 
					operator, 
					eOperation);
			GenModelAnnotationDetailKey.body.set(eOperation, translatedBody);
		}		
	
		return eOperation;
	}
	
	protected String getDelegateBody(Operator operator) {
		String delegateBody = operator.getDelegateBody();
		if (Util.isBlank(delegateBody) && !Util.isBlank(operator.getDelegateBodyRef())) {
			try {
				delegateBody = loadCode(operator, operator.getDelegateBodyRef());
			} catch (IOException e) {
				throw new NasdanikaException("Failed to load delegate code from " + operator.getDelegateBodyRef(), e);
			}
		}
		return delegateBody;
	}
	
	/**
	 * Override to modify the operation or to add (introduce) operation flavors, e.g. async, reactive, etc. or helper features or operations.
	 * This method is called after the operation is added to its EClass, so the class can be reached from the operation.
	 * @param operator
	 * @param eOperation
	 * @param ePackage
	 * @param referenceMap
	 */
	protected void advise(			
			Operator operator, 
			EOperation eOperation) {
		
	}	
	
	protected EClass generateComponent(
			Component opComponent, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		if (isEmpty(opComponent)) {			
			return opComponent.getSuperTypes()
					.stream()
					.findFirst()
					.orElse(EcorePackage.Literals.ECLASS);
		}
		
		generateClass(opComponent, eClass, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.COMPONENT)) {
			Operator starter = opComponent.getStarter();
			if (starter != null) {
				EOperation startOperation = generateOperation(starter);
				eClass.getEOperations().add(startOperation);
				advise(starter, startOperation);
			}
			
			Operator stopper = opComponent.getStopper();
			if (stopper != null) {
				EOperation stopOperation = generateOperation(stopper);
				eClass.getEOperations().add(stopOperation);
				advise(starter, stopOperation);
			}			
		}
		
		for (Call call: opComponent.getOutgoingCalls()) {
			EOperation callOperation = generateOperation(call);
			eClass.getEOperations().add(callOperation);
			if (!Util.isBlank(call.getRole())) {
				generateComponentReference(eClass, call);					
				GenModelAnnotationDetailKey.body.set(callOperation, getDelegateBody(call));
			}				
			
			advise(call, callOperation);
		}
		
		return eClass;
	}

//	protected String callOutputName(Component opComponent, Call call, EClass eClass) {
//		return eClass.getName() + StringUtils.capitalize(call.getOperationName())  + "Output";
//	}
//
//	protected String stopOutputName(Component opComponent, EClass eClass) {
//		return eClass.getName() + "StopOutput";
//	}
//
//	protected String startOutputName(Component opComponent, EClass eClass) {
//		return eClass.getName() + "StartOutput";
//	}
	
	/**
	 * Translates code from source language to Java.
	 * This method supports only Java and returns code argument as is. For other languages it throws UnsupportedOperationException.
	 * Override to add support for other languages. 
	 * For example, Groogy, SpEL, GenAI code generation
	 * @param code Code in source language, e.g. Java, Groovy, SpEL, GenAI prompt.
	 * @param language Source language, e.g. Java, Groovy, SpEL, GenAI.
	 * @param type Type of code, e.g. method body, getter, setter. Can be used to apply different translation rules for different code types.
	 * @param source Source model element for which code is generated. Can be used to access additional information for code translation.
	 * @param target Target model element for which code is generated. Can be used to access additional information for code translation. 
	 * @return
	 */
	protected String translate(
			String code, 
			String language, 
			GenModelAnnotationDetailKey type,
			EModelElement source, 
			EModelElement target) {
		
		if (Util.isBlank(language) || JAVA_LANGUAGE.equals(language)) {
			return code;
		}
		throw new UnsupportedOperationException("Unsupported language: " + language);
	}
	
	protected String loadCode(
			EModelElement context,
			String ref) throws IOException {
		
		URI uri = URI.createURI(ref);
		if (uri.isRelative()) {
			uri = uri.resolve(context.eResource().getURI());
		}
		InputStream in = context.eResource().getResourceSet().getURIConverter().createInputStream(uri);
		return DefaultConverter.INSTANCE.toString(in);
	}
	

//	protected String operatorOutputName(Operator operator, EClass eClass) {
//		return eClass.getName() + "Output";
//	}	
			
	protected EClass generateOperator(
			Operator opOperator, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateComponent(opOperator, eClass, eClassPredicate);
		
		if (eClassPredicate.test(OpgraphPackage.Literals.OPERATOR)) {
			EOperation eOperation = generateOperation(opOperator);
			eClass.getEOperations().add(eOperation);
			
			for (Predicate exceptionHandler: opOperator.getExceptionHandlers()) {
				EOperation exceptionHandlerOperation = generateOperation(exceptionHandler);
				eClass.getEOperations().add(exceptionHandlerOperation);
				if (!Util.isBlank(exceptionHandler.getRole())) {
					generateComponentReference(eClass, exceptionHandler);					
					GenModelAnnotationDetailKey.body.set(exceptionHandlerOperation, getDelegateBody(exceptionHandler));
				}				
				advise(exceptionHandler, exceptionHandlerOperation);
			}
		}
		
		return eClass;
	}
	
	protected EClass generateComposite(
			Composite opComposite, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateComponent(opComposite, eClass, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.COMPOSITE)) {
			for (Component opComponent: opComposite.getComponents()) {
				generateComponentReference(eClass, opComponent);
			}			
		}
		return eClass;
	}

	protected void generateComponentReference(EClass eClass, Component opComponent) {
		EClass componentClass = generateEClass(opComponent);
		EReference componentReference = factory.createEReference();
		componentReference.setName(opComponent.getRole());
		componentReference.setEType(componentClass);
		componentReference.setContainment(true);
		componentReference.setLowerBound(1);
		componentReference.setUpperBound(1);
		eClass.getEStructuralFeatures().add(componentReference);
	}
	
	protected EClass generateSupplier(
			Supplier opSupplier, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateOperator(opSupplier, eClass, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.SUPPLIER)) {
			for (Transition transition: opSupplier.getOutgoingTransitions()) {
				EOperation transitionOperation = generateOperation(transition);
				eClass.getEOperations().add(transitionOperation);
				if (!Util.isBlank(transition.getRole())) {
					generateComponentReference(eClass, transition);					
					GenModelAnnotationDetailKey.body.set(transitionOperation, getDelegateBody(transition));
				}				
				advise(transition, transitionOperation);
			}
		}
		return eClass;
	}
	
	protected EClass generateConsumer(
			Consumer opConsumer, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateOperator(opConsumer, eClass, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.CONSUMER)) {
			
		}
		return eClass;
	}
		
	protected EClass generatePredicate(
			Predicate opPredicate, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateConsumer(opPredicate, eClass, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.PREDICATE)) {
			
		}
		return eClass;
	}
		
	protected EClass generateTransition(
			Transition opTransition, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generatePredicate(opTransition, eClass, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.TRANSITION)) {
			
		}
		return eClass;
	}
		
	protected EClass generateFunction(
			Function opFunction, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateSupplier(opFunction, eClass, eClassPredicate);
		generateConsumer(opFunction, eClass, eClassPredicate);				
		
		if (eClassPredicate.test(OpgraphPackage.Literals.FUNCTION)) {
			
		}
		return eClass;
	}
		
	protected EClass generateCall(
			Call opCall, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
				
		generateFunction(opCall, eClass, eClassPredicate);				
		
		if (eClassPredicate.test(OpgraphPackage.Literals.CALL)) {
		}
		return eClass;
	}
		
	protected EClass generateCompositeSupplier(
			CompositeSupplier opCompositeSupplier, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateComposite(opCompositeSupplier, eClass, eClassPredicate);
		generateSupplier(opCompositeSupplier, eClass, eClassPredicate);		
		
		if (eClassPredicate.test(OpgraphPackage.Literals.COMPOSITE_SUPPLIER)) {
		}
		return eClass;
	}
		
	protected EClass generateCompositeConsumer(
			CompositeConsumer opCompositeConsumer, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateComposite(opCompositeConsumer, eClass, eClassPredicate);
		generateConsumer(opCompositeConsumer, eClass, eClassPredicate);		
		
		if (eClassPredicate.test(OpgraphPackage.Literals.COMPOSITE_CONSUMER)) {
		}
		return eClass;
	}
	
	protected EClass generateCompositeFunction(
			CompositeFunction opCompositeFunction, 
			EClass eClass, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateCompositeConsumer(opCompositeFunction, eClass, eClassPredicate);
		generateCompositeSupplier(opCompositeFunction, eClass, eClassPredicate);
		generateCompositeFunction(opCompositeFunction, eClass, eClassPredicate);
		
		if (eClassPredicate.test(OpgraphPackage.Literals.COMPOSITE_FUNCTION)) {
		}
		return eClass;
	}	

}
