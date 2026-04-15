/**
 */
package org.nasdanika.models.opgraph.util;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.models.opgraph.Attribute;
import org.nasdanika.models.opgraph.Call;
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
import org.nasdanika.models.opgraph.Predicate;
import org.nasdanika.models.opgraph.Reference;
import org.nasdanika.models.opgraph.Supplier;
import org.nasdanika.models.opgraph.Transition;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.opgraph.OpgraphPackage
 * @generated
 */
public class OpgraphSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpgraphPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpgraphSwitch() {
		if (modelPackage == null) {
			modelPackage = OpgraphPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OpgraphPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseETypedElement(feature);
				if (result == null) result = caseENamedElement(feature);
				if (result == null) result = caseEModelElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFeature(attribute);
				if (result == null) result = caseETypedElement(attribute);
				if (result == null) result = caseENamedElement(attribute);
				if (result == null) result = caseEModelElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseFeature(reference);
				if (result == null) result = caseETypedElement(reference);
				if (result == null) result = caseENamedElement(reference);
				if (result == null) result = caseEModelElement(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.CLASS: {
				org.nasdanika.models.opgraph.Class class_ = (org.nasdanika.models.opgraph.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseENamedElement(class_);
				if (result == null) result = caseEModelElement(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.PACKAGE: {
				org.nasdanika.models.opgraph.Package package_ = (org.nasdanika.models.opgraph.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseENamedElement(package_);
				if (result == null) result = caseEModelElement(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseClass(component);
				if (result == null) result = caseENamedElement(component);
				if (result == null) result = caseEModelElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseFunction(call);
				if (result == null) result = caseConsumer(call);
				if (result == null) result = caseSupplier(call);
				if (result == null) result = caseOperator(call);
				if (result == null) result = caseComponent(call);
				if (result == null) result = caseClass(call);
				if (result == null) result = caseENamedElement(call);
				if (result == null) result = caseEModelElement(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = caseComponent(operator);
				if (result == null) result = caseClass(operator);
				if (result == null) result = caseENamedElement(operator);
				if (result == null) result = caseEModelElement(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.SUPPLIER: {
				Supplier supplier = (Supplier)theEObject;
				T result = caseSupplier(supplier);
				if (result == null) result = caseOperator(supplier);
				if (result == null) result = caseComponent(supplier);
				if (result == null) result = caseClass(supplier);
				if (result == null) result = caseENamedElement(supplier);
				if (result == null) result = caseEModelElement(supplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.CONSUMER: {
				Consumer consumer = (Consumer)theEObject;
				T result = caseConsumer(consumer);
				if (result == null) result = caseOperator(consumer);
				if (result == null) result = caseComponent(consumer);
				if (result == null) result = caseClass(consumer);
				if (result == null) result = caseENamedElement(consumer);
				if (result == null) result = caseEModelElement(consumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.PREDICATE: {
				Predicate predicate = (Predicate)theEObject;
				T result = casePredicate(predicate);
				if (result == null) result = caseConsumer(predicate);
				if (result == null) result = caseOperator(predicate);
				if (result == null) result = caseComponent(predicate);
				if (result == null) result = caseClass(predicate);
				if (result == null) result = caseENamedElement(predicate);
				if (result == null) result = caseEModelElement(predicate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = casePredicate(transition);
				if (result == null) result = caseConsumer(transition);
				if (result == null) result = caseOperator(transition);
				if (result == null) result = caseComponent(transition);
				if (result == null) result = caseClass(transition);
				if (result == null) result = caseENamedElement(transition);
				if (result == null) result = caseEModelElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseConsumer(function);
				if (result == null) result = caseSupplier(function);
				if (result == null) result = caseOperator(function);
				if (result == null) result = caseComponent(function);
				if (result == null) result = caseClass(function);
				if (result == null) result = caseENamedElement(function);
				if (result == null) result = caseEModelElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseComponent(composite);
				if (result == null) result = caseClass(composite);
				if (result == null) result = caseENamedElement(composite);
				if (result == null) result = caseEModelElement(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.COMPOSITE_SUPPLIER: {
				CompositeSupplier compositeSupplier = (CompositeSupplier)theEObject;
				T result = caseCompositeSupplier(compositeSupplier);
				if (result == null) result = caseSupplier(compositeSupplier);
				if (result == null) result = caseComposite(compositeSupplier);
				if (result == null) result = caseOperator(compositeSupplier);
				if (result == null) result = caseComponent(compositeSupplier);
				if (result == null) result = caseClass(compositeSupplier);
				if (result == null) result = caseENamedElement(compositeSupplier);
				if (result == null) result = caseEModelElement(compositeSupplier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.COMPOSITE_CONSUMER: {
				CompositeConsumer compositeConsumer = (CompositeConsumer)theEObject;
				T result = caseCompositeConsumer(compositeConsumer);
				if (result == null) result = caseConsumer(compositeConsumer);
				if (result == null) result = caseComposite(compositeConsumer);
				if (result == null) result = caseOperator(compositeConsumer);
				if (result == null) result = caseComponent(compositeConsumer);
				if (result == null) result = caseClass(compositeConsumer);
				if (result == null) result = caseENamedElement(compositeConsumer);
				if (result == null) result = caseEModelElement(compositeConsumer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpgraphPackage.COMPOSITE_FUNCTION: {
				CompositeFunction compositeFunction = (CompositeFunction)theEObject;
				T result = caseCompositeFunction(compositeFunction);
				if (result == null) result = caseFunction(compositeFunction);
				if (result == null) result = caseCompositeSupplier(compositeFunction);
				if (result == null) result = caseCompositeConsumer(compositeFunction);
				if (result == null) result = caseConsumer(compositeFunction);
				if (result == null) result = caseSupplier(compositeFunction);
				if (result == null) result = caseComposite(compositeFunction);
				if (result == null) result = caseOperator(compositeFunction);
				if (result == null) result = caseComponent(compositeFunction);
				if (result == null) result = caseClass(compositeFunction);
				if (result == null) result = caseENamedElement(compositeFunction);
				if (result == null) result = caseEModelElement(compositeFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.nasdanika.models.opgraph.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.nasdanika.models.opgraph.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupplier(Supplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsumer(Consumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Predicate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePredicate(Predicate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Supplier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Supplier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSupplier(CompositeSupplier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Consumer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeConsumer(CompositeConsumer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeFunction(CompositeFunction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENamed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseENamedElement(ENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ETyped Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseETypedElement(ETypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OpgraphSwitch
