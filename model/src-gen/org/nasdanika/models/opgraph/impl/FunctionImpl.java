/**
 */
package org.nasdanika.models.opgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.opgraph.Call;
import org.nasdanika.models.opgraph.Function;
import org.nasdanika.models.opgraph.OpgraphPackage;
import org.nasdanika.models.opgraph.Supplier;
import org.nasdanika.models.opgraph.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.FunctionImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.FunctionImpl#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.FunctionImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.FunctionImpl#getIncomingCalls <em>Incoming Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ConsumerImpl implements Function {
	/**
	 * The default value of the '{@link #getOutputName() <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputName()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ETypedElement> getOutputs() {
		return (EList<ETypedElement>)eDynamicGet(OpgraphPackage.FUNCTION__OUTPUTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.SUPPLIER__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputName() {
		return (String)eDynamicGet(OpgraphPackage.FUNCTION__OUTPUT_NAME - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.SUPPLIER__OUTPUT_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputName(String newOutputName) {
		eDynamicSet(OpgraphPackage.FUNCTION__OUTPUT_NAME - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.SUPPLIER__OUTPUT_NAME, newOutputName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transition> getOutgoingTransitions() {
		return (EList<Transition>)eDynamicGet(OpgraphPackage.FUNCTION__OUTGOING_TRANSITIONS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.SUPPLIER__OUTGOING_TRANSITIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getIncomingCalls() {
		return (EList<Call>)eDynamicGet(OpgraphPackage.FUNCTION__INCOMING_CALLS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FUNCTION__INCOMING_CALLS, true, true);
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
			case OpgraphPackage.FUNCTION__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
			case OpgraphPackage.FUNCTION__INCOMING_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingCalls()).basicAdd(otherEnd, msgs);
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
			case OpgraphPackage.FUNCTION__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.FUNCTION__INCOMING_CALLS:
				return ((InternalEList<?>)getIncomingCalls()).basicRemove(otherEnd, msgs);
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
			case OpgraphPackage.FUNCTION__OUTPUTS:
				return getOutputs();
			case OpgraphPackage.FUNCTION__OUTPUT_NAME:
				return getOutputName();
			case OpgraphPackage.FUNCTION__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case OpgraphPackage.FUNCTION__INCOMING_CALLS:
				return getIncomingCalls();
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
			case OpgraphPackage.FUNCTION__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends ETypedElement>)newValue);
				return;
			case OpgraphPackage.FUNCTION__OUTPUT_NAME:
				setOutputName((String)newValue);
				return;
			case OpgraphPackage.FUNCTION__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case OpgraphPackage.FUNCTION__INCOMING_CALLS:
				getIncomingCalls().clear();
				getIncomingCalls().addAll((Collection<? extends Call>)newValue);
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
			case OpgraphPackage.FUNCTION__OUTPUTS:
				getOutputs().clear();
				return;
			case OpgraphPackage.FUNCTION__OUTPUT_NAME:
				setOutputName(OUTPUT_NAME_EDEFAULT);
				return;
			case OpgraphPackage.FUNCTION__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case OpgraphPackage.FUNCTION__INCOMING_CALLS:
				getIncomingCalls().clear();
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
			case OpgraphPackage.FUNCTION__OUTPUTS:
				return !getOutputs().isEmpty();
			case OpgraphPackage.FUNCTION__OUTPUT_NAME:
				return OUTPUT_NAME_EDEFAULT == null ? getOutputName() != null : !OUTPUT_NAME_EDEFAULT.equals(getOutputName());
			case OpgraphPackage.FUNCTION__OUTGOING_TRANSITIONS:
				return !getOutgoingTransitions().isEmpty();
			case OpgraphPackage.FUNCTION__INCOMING_CALLS:
				return !getIncomingCalls().isEmpty();
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
		if (baseClass == Supplier.class) {
			switch (derivedFeatureID) {
				case OpgraphPackage.FUNCTION__OUTPUTS: return OpgraphPackage.SUPPLIER__OUTPUTS;
				case OpgraphPackage.FUNCTION__OUTPUT_NAME: return OpgraphPackage.SUPPLIER__OUTPUT_NAME;
				case OpgraphPackage.FUNCTION__OUTGOING_TRANSITIONS: return OpgraphPackage.SUPPLIER__OUTGOING_TRANSITIONS;
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
		if (baseClass == Supplier.class) {
			switch (baseFeatureID) {
				case OpgraphPackage.SUPPLIER__OUTPUTS: return OpgraphPackage.FUNCTION__OUTPUTS;
				case OpgraphPackage.SUPPLIER__OUTPUT_NAME: return OpgraphPackage.FUNCTION__OUTPUT_NAME;
				case OpgraphPackage.SUPPLIER__OUTGOING_TRANSITIONS: return OpgraphPackage.FUNCTION__OUTGOING_TRANSITIONS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FunctionImpl
