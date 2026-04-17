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

import org.nasdanika.models.opgraph.Call;
import org.nasdanika.models.opgraph.Consumer;
import org.nasdanika.models.opgraph.Operator;
import org.nasdanika.models.opgraph.OpgraphPackage;
import org.nasdanika.models.opgraph.Predicate;
import org.nasdanika.models.opgraph.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getStarter <em>Starter</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getStopper <em>Stopper</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getBodyRef <em>Body Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getExceptionHandlers <em>Exception Handlers</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ConsumerImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumerImpl extends ClassImpl implements Consumer {
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
	protected ConsumerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.CONSUMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getStarter() {
		return (Operator)eDynamicGet(OpgraphPackage.CONSUMER__STARTER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STARTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarter(Operator newStarter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStarter, OpgraphPackage.CONSUMER__STARTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarter(Operator newStarter) {
		eDynamicSet(OpgraphPackage.CONSUMER__STARTER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STARTER, newStarter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getStopper() {
		return (Operator)eDynamicGet(OpgraphPackage.CONSUMER__STOPPER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STOPPER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopper(Operator newStopper, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStopper, OpgraphPackage.CONSUMER__STOPPER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopper(Operator newStopper) {
		eDynamicSet(OpgraphPackage.CONSUMER__STOPPER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STOPPER, newStopper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getOutgoingCalls() {
		return (EList<Call>)eDynamicGet(OpgraphPackage.CONSUMER__OUTGOING_CALLS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__OUTGOING_CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return (String)eDynamicGet(OpgraphPackage.CONSUMER__BODY - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		eDynamicSet(OpgraphPackage.CONSUMER__BODY - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBodyRef() {
		return (String)eDynamicGet(OpgraphPackage.CONSUMER__BODY_REF - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__BODY_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyRef(String newBodyRef) {
		eDynamicSet(OpgraphPackage.CONSUMER__BODY_REF - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__BODY_REF, newBodyRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return (String)eDynamicGet(OpgraphPackage.CONSUMER__LANGUAGE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		eDynamicSet(OpgraphPackage.CONSUMER__LANGUAGE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperationName() {
		return (String)eDynamicGet(OpgraphPackage.CONSUMER__OPERATION_NAME - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__OPERATION_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationName(String newOperationName) {
		eDynamicSet(OpgraphPackage.CONSUMER__OPERATION_NAME - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__OPERATION_NAME, newOperationName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EClassifier> getExceptions() {
		return (EList<EClassifier>)eDynamicGet(OpgraphPackage.CONSUMER__EXCEPTIONS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__EXCEPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Predicate> getExceptionHandlers() {
		return (EList<Predicate>)eDynamicGet(OpgraphPackage.CONSUMER__EXCEPTION_HANDLERS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.OPERATOR__EXCEPTION_HANDLERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ETypedElement> getInputs() {
		return (EList<ETypedElement>)eDynamicGet(OpgraphPackage.CONSUMER__INPUTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.CONSUMER__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getIncomingTransitions() {
		return (EList<Transition>)eDynamicGet(OpgraphPackage.CONSUMER__INCOMING_TRANSITIONS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.CONSUMER__INCOMING_TRANSITIONS, true, true);
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
			case OpgraphPackage.CONSUMER__OUTGOING_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingCalls()).basicAdd(otherEnd, msgs);
			case OpgraphPackage.CONSUMER__INCOMING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransitions()).basicAdd(otherEnd, msgs);
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
			case OpgraphPackage.CONSUMER__STARTER:
				return basicSetStarter(null, msgs);
			case OpgraphPackage.CONSUMER__STOPPER:
				return basicSetStopper(null, msgs);
			case OpgraphPackage.CONSUMER__OUTGOING_CALLS:
				return ((InternalEList<?>)getOutgoingCalls()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.CONSUMER__EXCEPTION_HANDLERS:
				return ((InternalEList<?>)getExceptionHandlers()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.CONSUMER__INCOMING_TRANSITIONS:
				return ((InternalEList<?>)getIncomingTransitions()).basicRemove(otherEnd, msgs);
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
			case OpgraphPackage.CONSUMER__STARTER:
				return getStarter();
			case OpgraphPackage.CONSUMER__STOPPER:
				return getStopper();
			case OpgraphPackage.CONSUMER__OUTGOING_CALLS:
				return getOutgoingCalls();
			case OpgraphPackage.CONSUMER__BODY:
				return getBody();
			case OpgraphPackage.CONSUMER__BODY_REF:
				return getBodyRef();
			case OpgraphPackage.CONSUMER__LANGUAGE:
				return getLanguage();
			case OpgraphPackage.CONSUMER__OPERATION_NAME:
				return getOperationName();
			case OpgraphPackage.CONSUMER__EXCEPTIONS:
				return getExceptions();
			case OpgraphPackage.CONSUMER__EXCEPTION_HANDLERS:
				return getExceptionHandlers();
			case OpgraphPackage.CONSUMER__INPUTS:
				return getInputs();
			case OpgraphPackage.CONSUMER__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
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
			case OpgraphPackage.CONSUMER__STARTER:
				setStarter((Operator)newValue);
				return;
			case OpgraphPackage.CONSUMER__STOPPER:
				setStopper((Operator)newValue);
				return;
			case OpgraphPackage.CONSUMER__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				getOutgoingCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case OpgraphPackage.CONSUMER__BODY:
				setBody((String)newValue);
				return;
			case OpgraphPackage.CONSUMER__BODY_REF:
				setBodyRef((String)newValue);
				return;
			case OpgraphPackage.CONSUMER__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case OpgraphPackage.CONSUMER__OPERATION_NAME:
				setOperationName((String)newValue);
				return;
			case OpgraphPackage.CONSUMER__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends EClassifier>)newValue);
				return;
			case OpgraphPackage.CONSUMER__EXCEPTION_HANDLERS:
				getExceptionHandlers().clear();
				getExceptionHandlers().addAll((Collection<? extends Predicate>)newValue);
				return;
			case OpgraphPackage.CONSUMER__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends ETypedElement>)newValue);
				return;
			case OpgraphPackage.CONSUMER__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
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
			case OpgraphPackage.CONSUMER__STARTER:
				setStarter((Operator)null);
				return;
			case OpgraphPackage.CONSUMER__STOPPER:
				setStopper((Operator)null);
				return;
			case OpgraphPackage.CONSUMER__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				return;
			case OpgraphPackage.CONSUMER__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case OpgraphPackage.CONSUMER__BODY_REF:
				setBodyRef(BODY_REF_EDEFAULT);
				return;
			case OpgraphPackage.CONSUMER__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case OpgraphPackage.CONSUMER__OPERATION_NAME:
				setOperationName(OPERATION_NAME_EDEFAULT);
				return;
			case OpgraphPackage.CONSUMER__EXCEPTIONS:
				getExceptions().clear();
				return;
			case OpgraphPackage.CONSUMER__EXCEPTION_HANDLERS:
				getExceptionHandlers().clear();
				return;
			case OpgraphPackage.CONSUMER__INPUTS:
				getInputs().clear();
				return;
			case OpgraphPackage.CONSUMER__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
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
			case OpgraphPackage.CONSUMER__STARTER:
				return getStarter() != null;
			case OpgraphPackage.CONSUMER__STOPPER:
				return getStopper() != null;
			case OpgraphPackage.CONSUMER__OUTGOING_CALLS:
				return !getOutgoingCalls().isEmpty();
			case OpgraphPackage.CONSUMER__BODY:
				return BODY_EDEFAULT == null ? getBody() != null : !BODY_EDEFAULT.equals(getBody());
			case OpgraphPackage.CONSUMER__BODY_REF:
				return BODY_REF_EDEFAULT == null ? getBodyRef() != null : !BODY_REF_EDEFAULT.equals(getBodyRef());
			case OpgraphPackage.CONSUMER__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? getLanguage() != null : !LANGUAGE_EDEFAULT.equals(getLanguage());
			case OpgraphPackage.CONSUMER__OPERATION_NAME:
				return OPERATION_NAME_EDEFAULT == null ? getOperationName() != null : !OPERATION_NAME_EDEFAULT.equals(getOperationName());
			case OpgraphPackage.CONSUMER__EXCEPTIONS:
				return !getExceptions().isEmpty();
			case OpgraphPackage.CONSUMER__EXCEPTION_HANDLERS:
				return !getExceptionHandlers().isEmpty();
			case OpgraphPackage.CONSUMER__INPUTS:
				return !getInputs().isEmpty();
			case OpgraphPackage.CONSUMER__INCOMING_TRANSITIONS:
				return !getIncomingTransitions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConsumerImpl
