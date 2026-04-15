/**
 */
package org.nasdanika.models.opgraph.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.opgraph.Consumer;
import org.nasdanika.models.opgraph.OpgraphPackage;
import org.nasdanika.models.opgraph.Supplier;
import org.nasdanika.models.opgraph.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends ConsumerImpl implements Transition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Supplier getSource() {
		return (Supplier)eDynamicGet(OpgraphPackage.TRANSITION__SOURCE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supplier basicGetSource() {
		return (Supplier)eDynamicGet(OpgraphPackage.TRANSITION__SOURCE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Supplier newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, OpgraphPackage.TRANSITION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Supplier newSource) {
		eDynamicSet(OpgraphPackage.TRANSITION__SOURCE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consumer getTarget() {
		return (Consumer)eDynamicGet(OpgraphPackage.TRANSITION__TARGET - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumer basicGetTarget() {
		return (Consumer)eDynamicGet(OpgraphPackage.TRANSITION__TARGET - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Consumer newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, OpgraphPackage.TRANSITION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Consumer newTarget) {
		eDynamicSet(OpgraphPackage.TRANSITION__TARGET - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpgraphPackage.TRANSITION__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((Supplier)otherEnd, msgs);
			case OpgraphPackage.TRANSITION__TARGET:
				Consumer target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, OpgraphPackage.CONSUMER__INCOMING_TRANSITIONS, Consumer.class, msgs);
				return basicSetTarget((Consumer)otherEnd, msgs);
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
			case OpgraphPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case OpgraphPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OpgraphPackage.TRANSITION__SOURCE:
				return eInternalContainer().eInverseRemove(this, OpgraphPackage.SUPPLIER__OUTGOING_TRANSITIONS, Supplier.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpgraphPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OpgraphPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpgraphPackage.TRANSITION__SOURCE:
				setSource((Supplier)newValue);
				return;
			case OpgraphPackage.TRANSITION__TARGET:
				setTarget((Consumer)newValue);
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
			case OpgraphPackage.TRANSITION__SOURCE:
				setSource((Supplier)null);
				return;
			case OpgraphPackage.TRANSITION__TARGET:
				setTarget((Consumer)null);
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
			case OpgraphPackage.TRANSITION__SOURCE:
				return basicGetSource() != null;
			case OpgraphPackage.TRANSITION__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
