/**
 */
package org.nasdanika.models.opgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.opgraph.Feature;
import org.nasdanika.models.opgraph.Group;
import org.nasdanika.models.opgraph.GroupElement;
import org.nasdanika.models.opgraph.OpgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.GroupImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.GroupImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.GroupImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupImpl extends GroupElementImpl implements Group {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EClass> getSuperTypes() {
		return (EList<EClass>)eDynamicGet(OpgraphPackage.GROUP__SUPER_TYPES - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.GROUP__SUPER_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GroupElement> getElements() {
		return (EList<GroupElement>)eDynamicGet(OpgraphPackage.GROUP__ELEMENTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.GROUP__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getFeatures() {
		return (EList<Feature>)eDynamicGet(OpgraphPackage.GROUP__FEATURES - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.GROUP__FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpgraphPackage.GROUP__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.GROUP__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
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
			case OpgraphPackage.GROUP__SUPER_TYPES:
				return getSuperTypes();
			case OpgraphPackage.GROUP__ELEMENTS:
				return getElements();
			case OpgraphPackage.GROUP__FEATURES:
				return getFeatures();
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
			case OpgraphPackage.GROUP__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends EClass>)newValue);
				return;
			case OpgraphPackage.GROUP__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends GroupElement>)newValue);
				return;
			case OpgraphPackage.GROUP__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
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
			case OpgraphPackage.GROUP__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case OpgraphPackage.GROUP__ELEMENTS:
				getElements().clear();
				return;
			case OpgraphPackage.GROUP__FEATURES:
				getFeatures().clear();
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
			case OpgraphPackage.GROUP__SUPER_TYPES:
				return !getSuperTypes().isEmpty();
			case OpgraphPackage.GROUP__ELEMENTS:
				return !getElements().isEmpty();
			case OpgraphPackage.GROUP__FEATURES:
				return !getFeatures().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GroupImpl
