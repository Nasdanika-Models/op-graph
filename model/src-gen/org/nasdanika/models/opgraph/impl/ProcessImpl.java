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

import org.nasdanika.models.opgraph.Activity;
import org.nasdanika.models.opgraph.Call;
import org.nasdanika.models.opgraph.Invocable;
import org.nasdanika.models.opgraph.Node;
import org.nasdanika.models.opgraph.OpgraphPackage;
import org.nasdanika.models.opgraph.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getBodyRef <em>Body Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getIncomingCalls <em>Incoming Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ProcessImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessImpl extends GroupImpl implements org.nasdanika.models.opgraph.Process {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return (String)eDynamicGet(OpgraphPackage.PROCESS__BODY - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		eDynamicSet(OpgraphPackage.PROCESS__BODY - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBodyRef() {
		return (String)eDynamicGet(OpgraphPackage.PROCESS__BODY_REF - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__BODY_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyRef(String newBodyRef) {
		eDynamicSet(OpgraphPackage.PROCESS__BODY_REF - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__BODY_REF, newBodyRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return (String)eDynamicGet(OpgraphPackage.PROCESS__LANGUAGE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		eDynamicSet(OpgraphPackage.PROCESS__LANGUAGE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ETypedElement> getInputs() {
		return (EList<ETypedElement>)eDynamicGet(OpgraphPackage.PROCESS__INPUTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ETypedElement> getOutputs() {
		return (EList<ETypedElement>)eDynamicGet(OpgraphPackage.PROCESS__OUTPUTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EClassifier> getExceptions() {
		return (EList<EClassifier>)eDynamicGet(OpgraphPackage.PROCESS__EXCEPTIONS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__EXCEPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getIncomingCalls() {
		return (EList<Call>)eDynamicGet(OpgraphPackage.PROCESS__INCOMING_CALLS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.NODE__INCOMING_CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getOutgoingCalls() {
		return (EList<Call>)eDynamicGet(OpgraphPackage.PROCESS__OUTGOING_CALLS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.NODE__OUTGOING_CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getOutgoingTransitions() {
		return (EList<Transition>)eDynamicGet(OpgraphPackage.PROCESS__OUTGOING_TRANSITIONS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.ACTIVITY__OUTGOING_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getIncomingTransitions() {
		return (EList<Transition>)eDynamicGet(OpgraphPackage.PROCESS__INCOMING_TRANSITIONS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.ACTIVITY__INCOMING_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getStart() {
		return (Activity)eDynamicGet(OpgraphPackage.PROCESS__START - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PROCESS__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetStart() {
		return (Activity)eDynamicGet(OpgraphPackage.PROCESS__START - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PROCESS__START, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Activity newStart) {
		eDynamicSet(OpgraphPackage.PROCESS__START - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PROCESS__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getEnd() {
		return (Activity)eDynamicGet(OpgraphPackage.PROCESS__END - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PROCESS__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetEnd() {
		return (Activity)eDynamicGet(OpgraphPackage.PROCESS__END - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PROCESS__END, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Activity newEnd) {
		eDynamicSet(OpgraphPackage.PROCESS__END - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PROCESS__END, newEnd);
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
			case OpgraphPackage.PROCESS__INCOMING_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingCalls()).basicAdd(otherEnd, msgs);
			case OpgraphPackage.PROCESS__OUTGOING_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingCalls()).basicAdd(otherEnd, msgs);
			case OpgraphPackage.PROCESS__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
			case OpgraphPackage.PROCESS__INCOMING_TRANSITIONS:
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
			case OpgraphPackage.PROCESS__INCOMING_CALLS:
				return ((InternalEList<?>)getIncomingCalls()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.PROCESS__OUTGOING_CALLS:
				return ((InternalEList<?>)getOutgoingCalls()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.PROCESS__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.PROCESS__INCOMING_TRANSITIONS:
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
			case OpgraphPackage.PROCESS__BODY:
				return getBody();
			case OpgraphPackage.PROCESS__BODY_REF:
				return getBodyRef();
			case OpgraphPackage.PROCESS__LANGUAGE:
				return getLanguage();
			case OpgraphPackage.PROCESS__INPUTS:
				return getInputs();
			case OpgraphPackage.PROCESS__OUTPUTS:
				return getOutputs();
			case OpgraphPackage.PROCESS__EXCEPTIONS:
				return getExceptions();
			case OpgraphPackage.PROCESS__INCOMING_CALLS:
				return getIncomingCalls();
			case OpgraphPackage.PROCESS__OUTGOING_CALLS:
				return getOutgoingCalls();
			case OpgraphPackage.PROCESS__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case OpgraphPackage.PROCESS__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case OpgraphPackage.PROCESS__START:
				if (resolve) return getStart();
				return basicGetStart();
			case OpgraphPackage.PROCESS__END:
				if (resolve) return getEnd();
				return basicGetEnd();
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
			case OpgraphPackage.PROCESS__BODY:
				setBody((String)newValue);
				return;
			case OpgraphPackage.PROCESS__BODY_REF:
				setBodyRef((String)newValue);
				return;
			case OpgraphPackage.PROCESS__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case OpgraphPackage.PROCESS__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends ETypedElement>)newValue);
				return;
			case OpgraphPackage.PROCESS__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends ETypedElement>)newValue);
				return;
			case OpgraphPackage.PROCESS__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends EClassifier>)newValue);
				return;
			case OpgraphPackage.PROCESS__INCOMING_CALLS:
				getIncomingCalls().clear();
				getIncomingCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case OpgraphPackage.PROCESS__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				getOutgoingCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case OpgraphPackage.PROCESS__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case OpgraphPackage.PROCESS__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case OpgraphPackage.PROCESS__START:
				setStart((Activity)newValue);
				return;
			case OpgraphPackage.PROCESS__END:
				setEnd((Activity)newValue);
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
			case OpgraphPackage.PROCESS__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case OpgraphPackage.PROCESS__BODY_REF:
				setBodyRef(BODY_REF_EDEFAULT);
				return;
			case OpgraphPackage.PROCESS__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case OpgraphPackage.PROCESS__INPUTS:
				getInputs().clear();
				return;
			case OpgraphPackage.PROCESS__OUTPUTS:
				getOutputs().clear();
				return;
			case OpgraphPackage.PROCESS__EXCEPTIONS:
				getExceptions().clear();
				return;
			case OpgraphPackage.PROCESS__INCOMING_CALLS:
				getIncomingCalls().clear();
				return;
			case OpgraphPackage.PROCESS__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				return;
			case OpgraphPackage.PROCESS__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case OpgraphPackage.PROCESS__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				return;
			case OpgraphPackage.PROCESS__START:
				setStart((Activity)null);
				return;
			case OpgraphPackage.PROCESS__END:
				setEnd((Activity)null);
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
			case OpgraphPackage.PROCESS__BODY:
				return BODY_EDEFAULT == null ? getBody() != null : !BODY_EDEFAULT.equals(getBody());
			case OpgraphPackage.PROCESS__BODY_REF:
				return BODY_REF_EDEFAULT == null ? getBodyRef() != null : !BODY_REF_EDEFAULT.equals(getBodyRef());
			case OpgraphPackage.PROCESS__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? getLanguage() != null : !LANGUAGE_EDEFAULT.equals(getLanguage());
			case OpgraphPackage.PROCESS__INPUTS:
				return !getInputs().isEmpty();
			case OpgraphPackage.PROCESS__OUTPUTS:
				return !getOutputs().isEmpty();
			case OpgraphPackage.PROCESS__EXCEPTIONS:
				return !getExceptions().isEmpty();
			case OpgraphPackage.PROCESS__INCOMING_CALLS:
				return !getIncomingCalls().isEmpty();
			case OpgraphPackage.PROCESS__OUTGOING_CALLS:
				return !getOutgoingCalls().isEmpty();
			case OpgraphPackage.PROCESS__OUTGOING_TRANSITIONS:
				return !getOutgoingTransitions().isEmpty();
			case OpgraphPackage.PROCESS__INCOMING_TRANSITIONS:
				return !getIncomingTransitions().isEmpty();
			case OpgraphPackage.PROCESS__START:
				return basicGetStart() != null;
			case OpgraphPackage.PROCESS__END:
				return basicGetEnd() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Invocable.class) {
			switch (derivedFeatureID) {
				case OpgraphPackage.PROCESS__BODY: return OpgraphPackage.INVOCABLE__BODY;
				case OpgraphPackage.PROCESS__BODY_REF: return OpgraphPackage.INVOCABLE__BODY_REF;
				case OpgraphPackage.PROCESS__LANGUAGE: return OpgraphPackage.INVOCABLE__LANGUAGE;
				case OpgraphPackage.PROCESS__INPUTS: return OpgraphPackage.INVOCABLE__INPUTS;
				case OpgraphPackage.PROCESS__OUTPUTS: return OpgraphPackage.INVOCABLE__OUTPUTS;
				case OpgraphPackage.PROCESS__EXCEPTIONS: return OpgraphPackage.INVOCABLE__EXCEPTIONS;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (derivedFeatureID) {
				case OpgraphPackage.PROCESS__INCOMING_CALLS: return OpgraphPackage.NODE__INCOMING_CALLS;
				case OpgraphPackage.PROCESS__OUTGOING_CALLS: return OpgraphPackage.NODE__OUTGOING_CALLS;
				default: return -1;
			}
		}
		if (baseClass == Activity.class) {
			switch (derivedFeatureID) {
				case OpgraphPackage.PROCESS__OUTGOING_TRANSITIONS: return OpgraphPackage.ACTIVITY__OUTGOING_TRANSITIONS;
				case OpgraphPackage.PROCESS__INCOMING_TRANSITIONS: return OpgraphPackage.ACTIVITY__INCOMING_TRANSITIONS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Invocable.class) {
			switch (baseFeatureID) {
				case OpgraphPackage.INVOCABLE__BODY: return OpgraphPackage.PROCESS__BODY;
				case OpgraphPackage.INVOCABLE__BODY_REF: return OpgraphPackage.PROCESS__BODY_REF;
				case OpgraphPackage.INVOCABLE__LANGUAGE: return OpgraphPackage.PROCESS__LANGUAGE;
				case OpgraphPackage.INVOCABLE__INPUTS: return OpgraphPackage.PROCESS__INPUTS;
				case OpgraphPackage.INVOCABLE__OUTPUTS: return OpgraphPackage.PROCESS__OUTPUTS;
				case OpgraphPackage.INVOCABLE__EXCEPTIONS: return OpgraphPackage.PROCESS__EXCEPTIONS;
				default: return -1;
			}
		}
		if (baseClass == Node.class) {
			switch (baseFeatureID) {
				case OpgraphPackage.NODE__INCOMING_CALLS: return OpgraphPackage.PROCESS__INCOMING_CALLS;
				case OpgraphPackage.NODE__OUTGOING_CALLS: return OpgraphPackage.PROCESS__OUTGOING_CALLS;
				default: return -1;
			}
		}
		if (baseClass == Activity.class) {
			switch (baseFeatureID) {
				case OpgraphPackage.ACTIVITY__OUTGOING_TRANSITIONS: return OpgraphPackage.PROCESS__OUTGOING_TRANSITIONS;
				case OpgraphPackage.ACTIVITY__INCOMING_TRANSITIONS: return OpgraphPackage.PROCESS__INCOMING_TRANSITIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ProcessImpl
