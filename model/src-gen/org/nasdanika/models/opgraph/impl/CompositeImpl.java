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
import org.nasdanika.models.opgraph.Composite;
import org.nasdanika.models.opgraph.Operator;
import org.nasdanika.models.opgraph.OpgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.CompositeImpl#getStarter <em>Starter</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.CompositeImpl#getStopper <em>Stopper</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.CompositeImpl#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.CompositeImpl#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImpl extends ClassImpl implements Composite {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getStarter() {
		return (Operator)eDynamicGet(OpgraphPackage.COMPOSITE__STARTER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STARTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStarter(Operator newStarter, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStarter, OpgraphPackage.COMPOSITE__STARTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStarter(Operator newStarter) {
		eDynamicSet(OpgraphPackage.COMPOSITE__STARTER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STARTER, newStarter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operator getStopper() {
		return (Operator)eDynamicGet(OpgraphPackage.COMPOSITE__STOPPER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STOPPER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopper(Operator newStopper, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newStopper, OpgraphPackage.COMPOSITE__STOPPER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStopper(Operator newStopper) {
		eDynamicSet(OpgraphPackage.COMPOSITE__STOPPER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__STOPPER, newStopper);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Call> getOutgoingCalls() {
		return (EList<Call>)eDynamicGet(OpgraphPackage.COMPOSITE__OUTGOING_CALLS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPONENT__OUTGOING_CALLS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Component> getComponents() {
		return (EList<Component>)eDynamicGet(OpgraphPackage.COMPOSITE__COMPONENTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.COMPOSITE__COMPONENTS, true, true);
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
			case OpgraphPackage.COMPOSITE__OUTGOING_CALLS:
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
			case OpgraphPackage.COMPOSITE__STARTER:
				return basicSetStarter(null, msgs);
			case OpgraphPackage.COMPOSITE__STOPPER:
				return basicSetStopper(null, msgs);
			case OpgraphPackage.COMPOSITE__OUTGOING_CALLS:
				return ((InternalEList<?>)getOutgoingCalls()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.COMPOSITE__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
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
			case OpgraphPackage.COMPOSITE__STARTER:
				return getStarter();
			case OpgraphPackage.COMPOSITE__STOPPER:
				return getStopper();
			case OpgraphPackage.COMPOSITE__OUTGOING_CALLS:
				return getOutgoingCalls();
			case OpgraphPackage.COMPOSITE__COMPONENTS:
				return getComponents();
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
			case OpgraphPackage.COMPOSITE__STARTER:
				setStarter((Operator)newValue);
				return;
			case OpgraphPackage.COMPOSITE__STOPPER:
				setStopper((Operator)newValue);
				return;
			case OpgraphPackage.COMPOSITE__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				getOutgoingCalls().addAll((Collection<? extends Call>)newValue);
				return;
			case OpgraphPackage.COMPOSITE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
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
			case OpgraphPackage.COMPOSITE__STARTER:
				setStarter((Operator)null);
				return;
			case OpgraphPackage.COMPOSITE__STOPPER:
				setStopper((Operator)null);
				return;
			case OpgraphPackage.COMPOSITE__OUTGOING_CALLS:
				getOutgoingCalls().clear();
				return;
			case OpgraphPackage.COMPOSITE__COMPONENTS:
				getComponents().clear();
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
			case OpgraphPackage.COMPOSITE__STARTER:
				return getStarter() != null;
			case OpgraphPackage.COMPOSITE__STOPPER:
				return getStopper() != null;
			case OpgraphPackage.COMPOSITE__OUTGOING_CALLS:
				return !getOutgoingCalls().isEmpty();
			case OpgraphPackage.COMPOSITE__COMPONENTS:
				return !getComponents().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeImpl
