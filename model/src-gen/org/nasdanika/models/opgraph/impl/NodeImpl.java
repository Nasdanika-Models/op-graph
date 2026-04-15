/**
 */
package org.nasdanika.models.opgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.opgraph.Call;
import org.nasdanika.models.opgraph.Node;
import org.nasdanika.models.opgraph.OpgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.NodeImpl#getIncomingCalls <em>Incoming Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.NodeImpl#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends InvocableImpl implements Node {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getIncomingCalls() {
		return (EList<Call>)eDynamicGet(OpgraphPackage.NODE__INCOMING_CALLS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.NODE__INCOMING_CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getOutgoingCalls() {
		return (EList<Call>)eDynamicGet(OpgraphPackage.NODE__OUTGOING_CALLS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.NODE__OUTGOING_CALLS, true, true);
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
			case OpgraphPackage.NODE__INCOMING_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingCalls()).basicAdd(otherEnd, msgs);
			case OpgraphPackage.NODE__OUTGOING_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingCalls()).basicAdd(otherEnd, msgs);
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
			case OpgraphPackage.NODE__INCOMING_CALLS:
				return ((InternalEList<?>)getIncomingCalls()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.NODE__OUTGOING_CALLS:
				return ((InternalEList<?>)getOutgoingCalls()).basicRemove(otherEnd, msgs);
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
			case OpgraphPackage.NODE__INCOMING_CALLS:
				return getIncomingCalls();
			case OpgraphPackage.NODE__OUTGOING_CALLS:
				return getOutgoingCalls();
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
			case OpgraphPackage.NODE__INCOMING_CALLS:
				getIncomingCalls().clear();
				getIncomingCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case OpgraphPackage.NODE__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				getOutgoingCalls().addAll((Collection<? extends Call>)newValue);
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
			case OpgraphPackage.NODE__INCOMING_CALLS:
				getIncomingCalls().clear();
				return;
			case OpgraphPackage.NODE__OUTGOING_CALLS:
				getOutgoingCalls().clear();
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
			case OpgraphPackage.NODE__INCOMING_CALLS:
				return !getIncomingCalls().isEmpty();
			case OpgraphPackage.NODE__OUTGOING_CALLS:
				return !getOutgoingCalls().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl
