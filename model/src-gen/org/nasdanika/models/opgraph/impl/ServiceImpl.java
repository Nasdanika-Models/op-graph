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
import org.nasdanika.models.opgraph.Node;
import org.nasdanika.models.opgraph.OpgraphPackage;
import org.nasdanika.models.opgraph.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ServiceImpl#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ServiceImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ServiceImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ServiceImpl#getEntryPoint <em>Entry Point</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends NodeImpl implements Service {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EClass> getSuperTypes() {
		return (EList<EClass>)eDynamicGet(OpgraphPackage.SERVICE__SUPER_TYPES - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.GROUP__SUPER_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<GroupElement> getElements() {
		return (EList<GroupElement>)eDynamicGet(OpgraphPackage.SERVICE__ELEMENTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.GROUP__ELEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getFeatures() {
		return (EList<Feature>)eDynamicGet(OpgraphPackage.SERVICE__FEATURES - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.GROUP__FEATURES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node getEntryPoint() {
		return (Node)eDynamicGet(OpgraphPackage.SERVICE__ENTRY_POINT - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.SERVICE__ENTRY_POINT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetEntryPoint() {
		return (Node)eDynamicGet(OpgraphPackage.SERVICE__ENTRY_POINT - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.SERVICE__ENTRY_POINT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEntryPoint(Node newEntryPoint) {
		eDynamicSet(OpgraphPackage.SERVICE__ENTRY_POINT - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.SERVICE__ENTRY_POINT, newEntryPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpgraphPackage.SERVICE__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case OpgraphPackage.SERVICE__FEATURES:
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
			case OpgraphPackage.SERVICE__SUPER_TYPES:
				return getSuperTypes();
			case OpgraphPackage.SERVICE__ELEMENTS:
				return getElements();
			case OpgraphPackage.SERVICE__FEATURES:
				return getFeatures();
			case OpgraphPackage.SERVICE__ENTRY_POINT:
				if (resolve) return getEntryPoint();
				return basicGetEntryPoint();
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
			case OpgraphPackage.SERVICE__SUPER_TYPES:
				getSuperTypes().clear();
				getSuperTypes().addAll((Collection<? extends EClass>)newValue);
				return;
			case OpgraphPackage.SERVICE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends GroupElement>)newValue);
				return;
			case OpgraphPackage.SERVICE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case OpgraphPackage.SERVICE__ENTRY_POINT:
				setEntryPoint((Node)newValue);
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
			case OpgraphPackage.SERVICE__SUPER_TYPES:
				getSuperTypes().clear();
				return;
			case OpgraphPackage.SERVICE__ELEMENTS:
				getElements().clear();
				return;
			case OpgraphPackage.SERVICE__FEATURES:
				getFeatures().clear();
				return;
			case OpgraphPackage.SERVICE__ENTRY_POINT:
				setEntryPoint((Node)null);
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
			case OpgraphPackage.SERVICE__SUPER_TYPES:
				return !getSuperTypes().isEmpty();
			case OpgraphPackage.SERVICE__ELEMENTS:
				return !getElements().isEmpty();
			case OpgraphPackage.SERVICE__FEATURES:
				return !getFeatures().isEmpty();
			case OpgraphPackage.SERVICE__ENTRY_POINT:
				return basicGetEntryPoint() != null;
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
		if (baseClass == Group.class) {
			switch (derivedFeatureID) {
				case OpgraphPackage.SERVICE__SUPER_TYPES: return OpgraphPackage.GROUP__SUPER_TYPES;
				case OpgraphPackage.SERVICE__ELEMENTS: return OpgraphPackage.GROUP__ELEMENTS;
				case OpgraphPackage.SERVICE__FEATURES: return OpgraphPackage.GROUP__FEATURES;
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
		if (baseClass == Group.class) {
			switch (baseFeatureID) {
				case OpgraphPackage.GROUP__SUPER_TYPES: return OpgraphPackage.SERVICE__SUPER_TYPES;
				case OpgraphPackage.GROUP__ELEMENTS: return OpgraphPackage.SERVICE__ELEMENTS;
				case OpgraphPackage.GROUP__FEATURES: return OpgraphPackage.SERVICE__FEATURES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ServiceImpl
