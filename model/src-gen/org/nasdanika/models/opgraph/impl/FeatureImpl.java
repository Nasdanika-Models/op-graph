/**
 */
package org.nasdanika.models.opgraph.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ETypedElementImpl;

import org.nasdanika.models.opgraph.Feature;
import org.nasdanika.models.opgraph.OpgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.FeatureImpl#isChangeable <em>Changeable</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.FeatureImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.FeatureImpl#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.FeatureImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.FeatureImpl#isUnsettable <em>Unsettable</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.FeatureImpl#isVolatile <em>Volatile</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class FeatureImpl extends ETypedElementImpl implements Feature {
	/**
	 * The default value of the '{@link #isChangeable() <em>Changeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isChangeable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHANGEABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isUnsettable() <em>Unsettable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnsettable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNSETTABLE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVolatile()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VOLATILE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 10;

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
	public boolean isChangeable() {
		return (Boolean)eDynamicGet(OpgraphPackage.FEATURE__CHANGEABLE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__CHANGEABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeable(boolean newChangeable) {
		eDynamicSet(OpgraphPackage.FEATURE__CHANGEABLE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__CHANGEABLE, newChangeable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDerived() {
		return (Boolean)eDynamicGet(OpgraphPackage.FEATURE__DERIVED - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__DERIVED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerived(boolean newDerived) {
		eDynamicSet(OpgraphPackage.FEATURE__DERIVED - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__DERIVED, newDerived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefaultValueLiteral() {
		return (String)eDynamicGet(OpgraphPackage.FEATURE__DEFAULT_VALUE_LITERAL - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__DEFAULT_VALUE_LITERAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValueLiteral(String newDefaultValueLiteral) {
		eDynamicSet(OpgraphPackage.FEATURE__DEFAULT_VALUE_LITERAL - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__DEFAULT_VALUE_LITERAL, newDefaultValueLiteral);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isTransient() {
		return (Boolean)eDynamicGet(OpgraphPackage.FEATURE__TRANSIENT - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__TRANSIENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTransient(boolean newTransient) {
		eDynamicSet(OpgraphPackage.FEATURE__TRANSIENT - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__TRANSIENT, newTransient);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnsettable() {
		return (Boolean)eDynamicGet(OpgraphPackage.FEATURE__UNSETTABLE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__UNSETTABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnsettable(boolean newUnsettable) {
		eDynamicSet(OpgraphPackage.FEATURE__UNSETTABLE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__UNSETTABLE, newUnsettable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVolatile() {
		return (Boolean)eDynamicGet(OpgraphPackage.FEATURE__VOLATILE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__VOLATILE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVolatile(boolean newVolatile) {
		eDynamicSet(OpgraphPackage.FEATURE__VOLATILE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.FEATURE__VOLATILE, newVolatile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpgraphPackage.FEATURE__CHANGEABLE:
				return isChangeable();
			case OpgraphPackage.FEATURE__DERIVED:
				return isDerived();
			case OpgraphPackage.FEATURE__DEFAULT_VALUE_LITERAL:
				return getDefaultValueLiteral();
			case OpgraphPackage.FEATURE__TRANSIENT:
				return isTransient();
			case OpgraphPackage.FEATURE__UNSETTABLE:
				return isUnsettable();
			case OpgraphPackage.FEATURE__VOLATILE:
				return isVolatile();
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
			case OpgraphPackage.FEATURE__CHANGEABLE:
				setChangeable((Boolean)newValue);
				return;
			case OpgraphPackage.FEATURE__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case OpgraphPackage.FEATURE__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral((String)newValue);
				return;
			case OpgraphPackage.FEATURE__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case OpgraphPackage.FEATURE__UNSETTABLE:
				setUnsettable((Boolean)newValue);
				return;
			case OpgraphPackage.FEATURE__VOLATILE:
				setVolatile((Boolean)newValue);
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
			case OpgraphPackage.FEATURE__CHANGEABLE:
				setChangeable(CHANGEABLE_EDEFAULT);
				return;
			case OpgraphPackage.FEATURE__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case OpgraphPackage.FEATURE__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
				return;
			case OpgraphPackage.FEATURE__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case OpgraphPackage.FEATURE__UNSETTABLE:
				setUnsettable(UNSETTABLE_EDEFAULT);
				return;
			case OpgraphPackage.FEATURE__VOLATILE:
				setVolatile(VOLATILE_EDEFAULT);
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
			case OpgraphPackage.FEATURE__CHANGEABLE:
				return isChangeable() != CHANGEABLE_EDEFAULT;
			case OpgraphPackage.FEATURE__DERIVED:
				return isDerived() != DERIVED_EDEFAULT;
			case OpgraphPackage.FEATURE__DEFAULT_VALUE_LITERAL:
				return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? getDefaultValueLiteral() != null : !DEFAULT_VALUE_LITERAL_EDEFAULT.equals(getDefaultValueLiteral());
			case OpgraphPackage.FEATURE__TRANSIENT:
				return isTransient() != TRANSIENT_EDEFAULT;
			case OpgraphPackage.FEATURE__UNSETTABLE:
				return isUnsettable() != UNSETTABLE_EDEFAULT;
			case OpgraphPackage.FEATURE__VOLATILE:
				return isVolatile() != VOLATILE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //FeatureImpl
