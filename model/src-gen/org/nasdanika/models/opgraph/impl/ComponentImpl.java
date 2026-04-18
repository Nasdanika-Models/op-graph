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
import org.nasdanika.models.opgraph.Component;
import org.nasdanika.models.opgraph.Operator;
import org.nasdanika.models.opgraph.OpgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ComponentImpl#getStarter <em>Starter</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ComponentImpl#getStopper <em>Stopper</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ComponentImpl#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ComponentImpl#getRole <em>Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ClassImpl implements Component {
	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getStarter() {
		return (Operator)eDynamicGet(OpgraphPackage.COMPONENT__STARTER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STARTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarter(Operator newStarter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStarter, OpgraphPackage.COMPONENT__STARTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarter(Operator newStarter) {
		eDynamicSet(OpgraphPackage.COMPONENT__STARTER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STARTER, newStarter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getStopper() {
		return (Operator)eDynamicGet(OpgraphPackage.COMPONENT__STOPPER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STOPPER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopper(Operator newStopper, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStopper, OpgraphPackage.COMPONENT__STOPPER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopper(Operator newStopper) {
		eDynamicSet(OpgraphPackage.COMPONENT__STOPPER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STOPPER, newStopper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getOutgoingCalls() {
		return (EList<Call>)eDynamicGet(OpgraphPackage.COMPONENT__OUTGOING_CALLS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__OUTGOING_CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return (String)eDynamicGet(OpgraphPackage.COMPONENT__ROLE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__ROLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		eDynamicSet(OpgraphPackage.COMPONENT__ROLE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__ROLE, newRole);
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
			case OpgraphPackage.COMPONENT__OUTGOING_CALLS:
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
			case OpgraphPackage.COMPONENT__STARTER:
				return basicSetStarter(null, msgs);
			case OpgraphPackage.COMPONENT__STOPPER:
				return basicSetStopper(null, msgs);
			case OpgraphPackage.COMPONENT__OUTGOING_CALLS:
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
			case OpgraphPackage.COMPONENT__STARTER:
				return getStarter();
			case OpgraphPackage.COMPONENT__STOPPER:
				return getStopper();
			case OpgraphPackage.COMPONENT__OUTGOING_CALLS:
				return getOutgoingCalls();
			case OpgraphPackage.COMPONENT__ROLE:
				return getRole();
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
			case OpgraphPackage.COMPONENT__STARTER:
				setStarter((Operator)newValue);
				return;
			case OpgraphPackage.COMPONENT__STOPPER:
				setStopper((Operator)newValue);
				return;
			case OpgraphPackage.COMPONENT__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				getOutgoingCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case OpgraphPackage.COMPONENT__ROLE:
				setRole((String)newValue);
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
			case OpgraphPackage.COMPONENT__STARTER:
				setStarter((Operator)null);
				return;
			case OpgraphPackage.COMPONENT__STOPPER:
				setStopper((Operator)null);
				return;
			case OpgraphPackage.COMPONENT__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				return;
			case OpgraphPackage.COMPONENT__ROLE:
				setRole(ROLE_EDEFAULT);
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
			case OpgraphPackage.COMPONENT__STARTER:
				return getStarter() != null;
			case OpgraphPackage.COMPONENT__STOPPER:
				return getStopper() != null;
			case OpgraphPackage.COMPONENT__OUTGOING_CALLS:
				return !getOutgoingCalls().isEmpty();
			case OpgraphPackage.COMPONENT__ROLE:
				return ROLE_EDEFAULT == null ? getRole() != null : !ROLE_EDEFAULT.equals(getRole());
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
