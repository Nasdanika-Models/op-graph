/**
 */
package org.nasdanika.models.opgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENamedElementImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.opgraph.OpgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.PackageImpl#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.PackageImpl#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends ENamedElementImpl implements org.nasdanika.models.opgraph.Package {
	/**
	 * The default value of the '{@link #getNsPrefix() <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_URI_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.PACKAGE;
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
	@Override
	public String getNsPrefix() {
		return (String)eDynamicGet(OpgraphPackage.PACKAGE__NS_PREFIX - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PACKAGE__NS_PREFIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNsPrefix(String newNsPrefix) {
		eDynamicSet(OpgraphPackage.PACKAGE__NS_PREFIX - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PACKAGE__NS_PREFIX, newNsPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return (String)eDynamicGet(OpgraphPackage.PACKAGE__NS_URI - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PACKAGE__NS_URI, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNsURI(String newNsURI) {
		eDynamicSet(OpgraphPackage.PACKAGE__NS_URI - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PACKAGE__NS_URI, newNsURI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.nasdanika.models.opgraph.Class> getClasses() {
		return (EList<org.nasdanika.models.opgraph.Class>)eDynamicGet(OpgraphPackage.PACKAGE__CLASSES - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.PACKAGE__CLASSES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpgraphPackage.PACKAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case OpgraphPackage.PACKAGE__NS_PREFIX:
				return getNsPrefix();
			case OpgraphPackage.PACKAGE__NS_URI:
				return getNsURI();
			case OpgraphPackage.PACKAGE__CLASSES:
				return getClasses();
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
			case OpgraphPackage.PACKAGE__NS_PREFIX:
				setNsPrefix((String)newValue);
				return;
			case OpgraphPackage.PACKAGE__NS_URI:
				setNsURI((String)newValue);
				return;
			case OpgraphPackage.PACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends org.nasdanika.models.opgraph.Class>)newValue);
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
			case OpgraphPackage.PACKAGE__NS_PREFIX:
				setNsPrefix(NS_PREFIX_EDEFAULT);
				return;
			case OpgraphPackage.PACKAGE__NS_URI:
				setNsURI(NS_URI_EDEFAULT);
				return;
			case OpgraphPackage.PACKAGE__CLASSES:
				getClasses().clear();
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
			case OpgraphPackage.PACKAGE__NS_PREFIX:
				return NS_PREFIX_EDEFAULT == null ? getNsPrefix() != null : !NS_PREFIX_EDEFAULT.equals(getNsPrefix());
			case OpgraphPackage.PACKAGE__NS_URI:
				return NS_URI_EDEFAULT == null ? getNsURI() != null : !NS_URI_EDEFAULT.equals(getNsURI());
			case OpgraphPackage.PACKAGE__CLASSES:
				return !getClasses().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
