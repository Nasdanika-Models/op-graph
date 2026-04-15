/**
 */
package org.nasdanika.models.opgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENamedElementImpl;

import org.nasdanika.models.opgraph.Activity;
import org.nasdanika.models.opgraph.OpgraphPackage;
import org.nasdanika.models.opgraph.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.TransitionImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends ENamedElementImpl implements Transition {
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
	protected static final int ESTATIC_FEATURE_COUNT = 2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ETypedElement> getInputs() {
		return (EList<ETypedElement>)eDynamicGet(OpgraphPackage.TRANSITION__INPUTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getSource() {
		return (Activity)eDynamicGet(OpgraphPackage.TRANSITION__SOURCE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__SOURCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetSource() {
		return (Activity)eDynamicGet(OpgraphPackage.TRANSITION__SOURCE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__SOURCE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Activity newSource, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSource, OpgraphPackage.TRANSITION__SOURCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(Activity newSource) {
		eDynamicSet(OpgraphPackage.TRANSITION__SOURCE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__SOURCE, newSource);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activity getTarget() {
		return (Activity)eDynamicGet(OpgraphPackage.TRANSITION__TARGET - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetTarget() {
		return (Activity)eDynamicGet(OpgraphPackage.TRANSITION__TARGET - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.TRANSITION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Activity newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, OpgraphPackage.TRANSITION__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Activity newTarget) {
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
				return basicSetSource((Activity)otherEnd, msgs);
			case OpgraphPackage.TRANSITION__TARGET:
				Activity target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, OpgraphPackage.ACTIVITY__INCOMING_TRANSITIONS, Activity.class, msgs);
				return basicSetTarget((Activity)otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, OpgraphPackage.ACTIVITY__OUTGOING_TRANSITIONS, Activity.class, msgs);
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
			case OpgraphPackage.TRANSITION__INPUTS:
				return getInputs();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OpgraphPackage.TRANSITION__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends ETypedElement>)newValue);
				return;
			case OpgraphPackage.TRANSITION__SOURCE:
				setSource((Activity)newValue);
				return;
			case OpgraphPackage.TRANSITION__TARGET:
				setTarget((Activity)newValue);
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
			case OpgraphPackage.TRANSITION__INPUTS:
				getInputs().clear();
				return;
			case OpgraphPackage.TRANSITION__SOURCE:
				setSource((Activity)null);
				return;
			case OpgraphPackage.TRANSITION__TARGET:
				setTarget((Activity)null);
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
			case OpgraphPackage.TRANSITION__INPUTS:
				return !getInputs().isEmpty();
			case OpgraphPackage.TRANSITION__SOURCE:
				return basicGetSource() != null;
			case OpgraphPackage.TRANSITION__TARGET:
				return basicGetTarget() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
