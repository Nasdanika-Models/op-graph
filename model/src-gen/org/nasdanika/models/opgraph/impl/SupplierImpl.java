/**
 */
package org.nasdanika.models.opgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.opgraph.OpgraphPackage;
import org.nasdanika.models.opgraph.Predicate;
import org.nasdanika.models.opgraph.Supplier;
import org.nasdanika.models.opgraph.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.SupplierImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.SupplierImpl#getBodyRef <em>Body Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.SupplierImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.SupplierImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.SupplierImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.SupplierImpl#getExceptionHandlers <em>Exception Handlers</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.SupplierImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.SupplierImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierImpl extends ComponentImpl implements Supplier {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBodyRef() <em>Body Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = "Java";

	/**
	 * The default value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.SUPPLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return (String)eDynamicGet(OpgraphPackage.SUPPLIER__BODY - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		eDynamicSet(OpgraphPackage.SUPPLIER__BODY - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBodyRef() {
		return (String)eDynamicGet(OpgraphPackage.SUPPLIER__BODY_REF - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__BODY_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyRef(String newBodyRef) {
		eDynamicSet(OpgraphPackage.SUPPLIER__BODY_REF - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__BODY_REF, newBodyRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return (String)eDynamicGet(OpgraphPackage.SUPPLIER__LANGUAGE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		eDynamicSet(OpgraphPackage.SUPPLIER__LANGUAGE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperationName() {
		return (String)eDynamicGet(OpgraphPackage.SUPPLIER__OPERATION_NAME - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__OPERATION_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationName(String newOperationName) {
		eDynamicSet(OpgraphPackage.SUPPLIER__OPERATION_NAME - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__OPERATION_NAME, newOperationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EClassifier> getExceptions() {
		return (EList<EClassifier>)eDynamicGet(OpgraphPackage.SUPPLIER__EXCEPTIONS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__EXCEPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Predicate> getExceptionHandlers() {
		return (EList<Predicate>)eDynamicGet(OpgraphPackage.SUPPLIER__EXCEPTION_HANDLERS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__EXCEPTION_HANDLERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ETypedElement> getOutputs() {
		return (EList<ETypedElement>)eDynamicGet(OpgraphPackage.SUPPLIER__OUTPUTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.SUPPLIER__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getOutgoingTransitions() {
		return (EList<Transition>)eDynamicGet(OpgraphPackage.SUPPLIER__OUTGOING_TRANSITIONS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.SUPPLIER__OUTGOING_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpgraphPackage.SUPPLIER__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpgraphPackage.SUPPLIER__EXCEPTION_HANDLERS:
				return ((InternalEList<?>)getExceptionHandlers()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.SUPPLIER__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpgraphPackage.SUPPLIER__BODY:
				return getBody();
			case OpgraphPackage.SUPPLIER__BODY_REF:
				return getBodyRef();
			case OpgraphPackage.SUPPLIER__LANGUAGE:
				return getLanguage();
			case OpgraphPackage.SUPPLIER__OPERATION_NAME:
				return getOperationName();
			case OpgraphPackage.SUPPLIER__EXCEPTIONS:
				return getExceptions();
			case OpgraphPackage.SUPPLIER__EXCEPTION_HANDLERS:
				return getExceptionHandlers();
			case OpgraphPackage.SUPPLIER__OUTPUTS:
				return getOutputs();
			case OpgraphPackage.SUPPLIER__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpgraphPackage.SUPPLIER__BODY:
				setBody((String)newValue);
				return;
			case OpgraphPackage.SUPPLIER__BODY_REF:
				setBodyRef((String)newValue);
				return;
			case OpgraphPackage.SUPPLIER__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case OpgraphPackage.SUPPLIER__OPERATION_NAME:
				setOperationName((String)newValue);
				return;
			case OpgraphPackage.SUPPLIER__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends EClassifier>)newValue);
				return;
			case OpgraphPackage.SUPPLIER__EXCEPTION_HANDLERS:
				getExceptionHandlers().clear();
				getExceptionHandlers().addAll((Collection<? extends Predicate>)newValue);
				return;
			case OpgraphPackage.SUPPLIER__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends ETypedElement>)newValue);
				return;
			case OpgraphPackage.SUPPLIER__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OpgraphPackage.SUPPLIER__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case OpgraphPackage.SUPPLIER__BODY_REF:
				setBodyRef(BODY_REF_EDEFAULT);
				return;
			case OpgraphPackage.SUPPLIER__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case OpgraphPackage.SUPPLIER__OPERATION_NAME:
				setOperationName(OPERATION_NAME_EDEFAULT);
				return;
			case OpgraphPackage.SUPPLIER__EXCEPTIONS:
				getExceptions().clear();
				return;
			case OpgraphPackage.SUPPLIER__EXCEPTION_HANDLERS:
				getExceptionHandlers().clear();
				return;
			case OpgraphPackage.SUPPLIER__OUTPUTS:
				getOutputs().clear();
				return;
			case OpgraphPackage.SUPPLIER__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OpgraphPackage.SUPPLIER__BODY:
				return BODY_EDEFAULT == null ? getBody() != null : !BODY_EDEFAULT.equals(getBody());
			case OpgraphPackage.SUPPLIER__BODY_REF:
				return BODY_REF_EDEFAULT == null ? getBodyRef() != null : !BODY_REF_EDEFAULT.equals(getBodyRef());
			case OpgraphPackage.SUPPLIER__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? getLanguage() != null : !LANGUAGE_EDEFAULT.equals(getLanguage());
			case OpgraphPackage.SUPPLIER__OPERATION_NAME:
				return OPERATION_NAME_EDEFAULT == null ? getOperationName() != null : !OPERATION_NAME_EDEFAULT.equals(getOperationName());
			case OpgraphPackage.SUPPLIER__EXCEPTIONS:
				return !getExceptions().isEmpty();
			case OpgraphPackage.SUPPLIER__EXCEPTION_HANDLERS:
				return !getExceptionHandlers().isEmpty();
			case OpgraphPackage.SUPPLIER__OUTPUTS:
				return !getOutputs().isEmpty();
			case OpgraphPackage.SUPPLIER__OUTGOING_TRANSITIONS:
				return !getOutgoingTransitions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SupplierImpl
