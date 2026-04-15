package org.nasdanika.models.opgraph.generator;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xcore.XAnnotation;
import org.eclipse.emf.ecore.xcore.XAnnotationDirective;
import org.eclipse.emf.ecore.xcore.XClass;
import org.eclipse.emf.ecore.xcore.XGenericType;
import org.eclipse.emf.ecore.xcore.XPackage;
import org.eclipse.emf.ecore.xcore.XcoreFactory;
import org.eclipse.emf.ecore.xcore.XcoreStandaloneSetup;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.nasdanika.common.Util;
import org.nasdanika.models.opgraph.Call;
import org.nasdanika.models.opgraph.Class;
import org.nasdanika.models.opgraph.Component;
import org.nasdanika.models.opgraph.Composite;
import org.nasdanika.models.opgraph.CompositeConsumer;
import org.nasdanika.models.opgraph.CompositeFunction;
import org.nasdanika.models.opgraph.CompositeSupplier;
import org.nasdanika.models.opgraph.Consumer;
import org.nasdanika.models.opgraph.Function;
import org.nasdanika.models.opgraph.Operator;
import org.nasdanika.models.opgraph.OpgraphPackage;
import org.nasdanika.models.opgraph.Package;
import org.nasdanika.models.opgraph.Predicate;
import org.nasdanika.models.opgraph.Reference;
import org.nasdanika.models.opgraph.Supplier;
import org.nasdanika.models.opgraph.Transition;

import com.google.inject.Injector;

/**
 * Generates Xcore from OpGraph model. 
 */
public abstract class XcoreGenerator {
	
	protected XcoreFactory factory;

	public XcoreGenerator() {
        this(XcoreFactory.eINSTANCE);
	}
	
	public XcoreGenerator(XcoreFactory factory) {
        this.factory = factory;
	}	
		
	public XPackage generateXPackage(Package opPackage) {
        XPackage xPackage = factory.createXPackage();
        xPackage.setName("test");
        
        // Ecore annotation directive
        XAnnotationDirective ecoreDirective = factory.createXAnnotationDirective();
        ecoreDirective.setName("Ecore");
        ecoreDirective.setSourceURI("http://www.eclipse.org/emf/2002/Ecore");
        xPackage.getAnnotationDirectives().add(ecoreDirective);
        
        // @Ecore annotation with nsURI and nsPrefix
        XAnnotation ecoreAnnotation = factory.createXAnnotation();
        ecoreAnnotation.setSource(ecoreDirective);
        String nsURI = opPackage.getNsURI();
        if (!Util.isBlank(nsURI)) {
        	ecoreAnnotation.getDetails().put("nsURI", nsURI);
        }
        
        String nsPrefix = opPackage.getNsPrefix();
        if (!Util.isBlank(nsPrefix)) {
        	ecoreAnnotation.getDetails().put("nsPrefix", nsPrefix);
        }
                
        if (!Util.isBlank(nsPrefix) || !Util.isBlank(nsURI)) {
        	xPackage.getAnnotations().add(ecoreAnnotation);
		}
        
        xPackage.setName(opPackage.getName());
        
        Map<Reference, EReference> referenceMap = new HashMap<>();
        
        opPackage
        	.getClasses()
			.stream()
			.forEach(opClass -> generateXClass(opClass, xPackage, referenceMap, new HashSet<>()::add));

        return xPackage;
	}
	
	protected void generateXClass(
			Class opClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		XClass xClass = switch (opClass) {
		case CompositeFunction compositeFunction -> generateCompositeFunction(compositeFunction, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case CompositeSupplier compositeSupplier -> generateCompositeSupplier(compositeSupplier, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case CompositeConsumer compositeConsumer -> generateCompositeConsumer(compositeConsumer, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case Call call -> generateCall(call, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case Function function -> generateFunction(function, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case Transition transition -> generateTransition(transition, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case Predicate predicate -> generatePredicate(predicate, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case Supplier supplier -> generateSupplier(supplier, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case Consumer consumer -> generateConsumer(consumer, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case Operator operator -> generateOperator(operator, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case Composite composite -> generateComposite(composite, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case Component component -> generateComponent(component, factory.createXClass(), xPackage, referenceMap, eClassPredicate);
		case Class clazz -> generateClass(clazz, factory.createXClass(), xPackage, referenceMap, eClassPredicate);		
		};
		
		if (xClass != null) {
			xPackage.getClassifiers().add(xClass);
		}
				
	}
	
	protected XClass generateClass(
			Class opClass, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		if (eClassPredicate.test(OpgraphPackage.Literals.CLASS)) {
			xClass.setName(opClass.getName());
			for (EClass eSuperType: opClass.getSuperTypes()) {
				XGenericType xSuperType = factory.createXGenericType();
			    GenClass genClassSuperType = findGenClassFor(eSuperType); 			    
			    xSuperType.setType(genClassSuperType);				
				xClass.getSuperTypes().add(xSuperType);
			}
		}
		
		return xClass;
	}
	
	/**
	 * Implements by, for example, loading GenPacages using the capability framework.
	 * @return
	 */
	protected abstract Collection<GenPackage> getGenPackages();
	
	private GenClass findGenClassFor(EClass eClass) {
	    for (GenPackage genPackage : getGenPackages()) {
	        if (genPackage.getEcorePackage() == eClass.getEPackage()) {
	            for (GenClass genClass : genPackage.getGenClasses()) {
	                if (genClass.getEcoreClass() == eClass) {
	                    return genClass;
	                }
	            }
	        }
	    }
	    throw new IllegalArgumentException("No GenClass found for " + eClass.getName());
	}	
	
	protected XClass generateComponent(
			Component opComponent, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateClass(opComponent, xClass, xPackage, referenceMap, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.COMPONENT)) {
			
			// starter, stopper
			
		}
		return xClass;
	}
	
	protected XClass generateOperator(
			Operator opOperator, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateComponent(opOperator, xClass, xPackage, referenceMap, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.OPERATOR)) {
		}
		return xClass;
	}
	
	protected XClass generateComposite(
			Composite opComposite, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateComponent(opComposite, xClass, xPackage, referenceMap, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.COMPOSITE)) {
		}
		return xClass;
	}
	
	protected XClass generateSupplier(
			Supplier opSupplier, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateOperator(opSupplier, xClass, xPackage, referenceMap, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.SUPPLIER)) {
		}
		return xClass;
	}
	
	protected XClass generateConsumer(
			Consumer opConsumer, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateOperator(opConsumer, xClass, xPackage, referenceMap, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.CONSUMER)) {
		}
		return xClass;
	}
		
	protected XClass generatePredicate(
			Predicate opPredicate, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateConsumer(opPredicate, xClass, xPackage, referenceMap, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.PREDICATE)) {
		}
		return xClass;
	}
		
	protected XClass generateTransition(
			Transition opTransition, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generatePredicate(opTransition, xClass, xPackage, referenceMap, eClassPredicate);
		if (eClassPredicate.test(OpgraphPackage.Literals.TRANSITION)) {
		}
		return xClass;
	}
		
	protected XClass generateFunction(
			Function opFunction, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateSupplier(opFunction, xClass, xPackage, referenceMap, eClassPredicate);
		generateConsumer(opFunction, xClass, xPackage, referenceMap, eClassPredicate);				
		
		if (eClassPredicate.test(OpgraphPackage.Literals.FUNCTION)) {
		}
		return xClass;
	}
		
	protected XClass generateCall(
			Call opCall, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
				
		generateFunction(opCall, xClass, xPackage, referenceMap, eClassPredicate);				
		
		if (eClassPredicate.test(OpgraphPackage.Literals.CALL)) {
		}
		return xClass;
	}
		
	protected XClass generateCompositeSupplier(
			CompositeSupplier opCompositeSupplier, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateComposite(opCompositeSupplier, xClass, xPackage, referenceMap, eClassPredicate);
		generateSupplier(opCompositeSupplier, xClass, xPackage, referenceMap, eClassPredicate);		
		
		if (eClassPredicate.test(OpgraphPackage.Literals.COMPOSITE_SUPPLIER)) {
		}
		return xClass;
	}
		
	protected XClass generateCompositeConsumer(
			CompositeConsumer opCompositeConsumer, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateComposite(opCompositeConsumer, xClass, xPackage, referenceMap, eClassPredicate);
		generateConsumer(opCompositeConsumer, xClass, xPackage, referenceMap, eClassPredicate);		
		
		if (eClassPredicate.test(OpgraphPackage.Literals.COMPOSITE_CONSUMER)) {
		}
		return xClass;
	}
	
	protected XClass generateCompositeFunction(
			CompositeFunction opCompositeFunction, 
			XClass xClass, 
			XPackage xPackage, 
			Map<Reference, EReference> referenceMap, 
			java.util.function.Predicate<EClass> eClassPredicate) {
		
		generateCompositeConsumer(opCompositeFunction, xClass, xPackage, referenceMap, eClassPredicate);
		generateCompositeSupplier(opCompositeFunction, xClass, xPackage, referenceMap, eClassPredicate);
		generateCompositeFunction(opCompositeFunction, xClass, xPackage, referenceMap, eClassPredicate);
		
		if (eClassPredicate.test(OpgraphPackage.Literals.COMPOSITE_FUNCTION)) {
		}
		return xClass;
	}	
	
	public void save(Package opPackage, URI uri) throws Exception {
		XPackage xPackage = generateXPackage(opPackage);
		save(xPackage, uri);
	}
	
	public void save(Package opPackage, String path) throws Exception {
		save(opPackage, URI.createFileURI(path));
	}
	
	public void save(XPackage xPackage, URI uri) throws Exception {
        Injector injector = new XcoreStandaloneSetup().createInjectorAndDoEMFRegistration();
        XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
        Resource resource = resourceSet.createResource(uri);
        resource.getContents().add(xPackage);        
        resource.save(null);		
	}
	
	public void save(XPackage xPackage, String path) throws Exception {
		save(xPackage, URI.createFileURI(path));
	}

}
