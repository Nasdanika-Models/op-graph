/**
 */
package org.nasdanika.models.opgraph.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.nasdanika.models.opgraph.Call;
import org.nasdanika.models.opgraph.Node;
import org.nasdanika.models.opgraph.OpgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.CallImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.CallImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallImpl extends InvocableImpl implements Call {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getTarget() {
		return (Node)eDynamicGet(OpgraphPackage.CALL__TARGET - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.CALL__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return (Node)eDynamicGet(OpgraphPackage.CALL__TARGET - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.CALL__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, OpgraphPackage.CALL__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Node newTarget) {
		eDynamicSet(OpgraphPackage.CALL__TARGET - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.CALL__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getSource() {
		return (Node)eDynamicGet(OpgraphPackage.CALL__SOURCE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.CALL__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSource() {
		return (Node)eDynamicGet(OpgraphPackage.CALL__SOURCE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.CALL__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Node newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, OpgraphPackage.CALL__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Node newSource) {
		eDynamicSet(OpgraphPackage.CALL__SOURCE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.CALL__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpgraphPackage.CALL__TARGET:
				Node target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, OpgraphPackage.NODE__INCOMING_CALLS, Node.class, msgs);
				return basicSetTarget((Node)otherEnd, msgs);
			case OpgraphPackage.CALL__SOURCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSource((Node)otherEnd, msgs);
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
			case OpgraphPackage.CALL__TARGET:
				return basicSetTarget(null, msgs);
			case OpgraphPackage.CALL__SOURCE:
				return basicSetSource(null, msgs);
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
			case OpgraphPackage.CALL__SOURCE:
				return eInternalContainer().eInverseRemove(this, OpgraphPackage.NODE__OUTGOING_CALLS, Node.class, msgs);
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
			case OpgraphPackage.CALL__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case OpgraphPackage.CALL__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
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
			case OpgraphPackage.CALL__TARGET:
				setTarget((Node)newValue);
				return;
			case OpgraphPackage.CALL__SOURCE:
				setSource((Node)newValue);
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
			case OpgraphPackage.CALL__TARGET:
				setTarget((Node)null);
				return;
			case OpgraphPackage.CALL__SOURCE:
				setSource((Node)null);
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
			case OpgraphPackage.CALL__TARGET:
				return basicGetTarget() != null;
			case OpgraphPackage.CALL__SOURCE:
				return basicGetSource() != null;
		}
		return super.eIsSet(featureID);
	}

} //CallImpl
