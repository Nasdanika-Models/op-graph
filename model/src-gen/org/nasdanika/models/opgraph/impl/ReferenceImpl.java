/**
 */
package org.nasdanika.models.opgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.opgraph.Attribute;
import org.nasdanika.models.opgraph.OpgraphPackage;
import org.nasdanika.models.opgraph.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ReferenceImpl#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ReferenceImpl#isContainment <em>Containment</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ReferenceImpl#isContainer <em>Container</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ReferenceImpl#isLocal <em>Local</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ReferenceImpl#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.ReferenceImpl#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceImpl extends FeatureImpl implements Reference {
	/**
	 * The default value of the '{@link #isResolveProxies() <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolveProxies()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVE_PROXIES_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isContainment() <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINMENT_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINER_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResolveProxies() {
		return (Boolean)eDynamicGet(OpgraphPackage.REFERENCE__RESOLVE_PROXIES - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__RESOLVE_PROXIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolveProxies(boolean newResolveProxies) {
		eDynamicSet(OpgraphPackage.REFERENCE__RESOLVE_PROXIES - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__RESOLVE_PROXIES, newResolveProxies);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContainment() {
		return (Boolean)eDynamicGet(OpgraphPackage.REFERENCE__CONTAINMENT - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__CONTAINMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainment(boolean newContainment) {
		eDynamicSet(OpgraphPackage.REFERENCE__CONTAINMENT - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__CONTAINMENT, newContainment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContainer() {
		return (Boolean)eDynamicGet(OpgraphPackage.REFERENCE__CONTAINER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__CONTAINER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(boolean newContainer) {
		eDynamicSet(OpgraphPackage.REFERENCE__CONTAINER - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__CONTAINER, newContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isLocal() {
		return (Boolean)eDynamicGet(OpgraphPackage.REFERENCE__LOCAL - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__LOCAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocal(boolean newLocal) {
		eDynamicSet(OpgraphPackage.REFERENCE__LOCAL - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__LOCAL, newLocal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Attribute> getKeys() {
		return (EList<Attribute>)eDynamicGet(OpgraphPackage.REFERENCE__KEYS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__KEYS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reference getOpposite() {
		return (Reference)eDynamicGet(OpgraphPackage.REFERENCE__OPPOSITE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__OPPOSITE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reference basicGetOpposite() {
		return (Reference)eDynamicGet(OpgraphPackage.REFERENCE__OPPOSITE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__OPPOSITE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpposite(Reference newOpposite) {
		eDynamicSet(OpgraphPackage.REFERENCE__OPPOSITE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.REFERENCE__OPPOSITE, newOpposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpgraphPackage.REFERENCE__RESOLVE_PROXIES:
				return isResolveProxies();
			case OpgraphPackage.REFERENCE__CONTAINMENT:
				return isContainment();
			case OpgraphPackage.REFERENCE__CONTAINER:
				return isContainer();
			case OpgraphPackage.REFERENCE__LOCAL:
				return isLocal();
			case OpgraphPackage.REFERENCE__KEYS:
				return getKeys();
			case OpgraphPackage.REFERENCE__OPPOSITE:
				if (resolve) return getOpposite();
				return basicGetOpposite();
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
			case OpgraphPackage.REFERENCE__RESOLVE_PROXIES:
				setResolveProxies((Boolean)newValue);
				return;
			case OpgraphPackage.REFERENCE__CONTAINMENT:
				setContainment((Boolean)newValue);
				return;
			case OpgraphPackage.REFERENCE__CONTAINER:
				setContainer((Boolean)newValue);
				return;
			case OpgraphPackage.REFERENCE__LOCAL:
				setLocal((Boolean)newValue);
				return;
			case OpgraphPackage.REFERENCE__KEYS:
				getKeys().clear();
				getKeys().addAll((Collection<? extends Attribute>)newValue);
				return;
			case OpgraphPackage.REFERENCE__OPPOSITE:
				setOpposite((Reference)newValue);
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
			case OpgraphPackage.REFERENCE__RESOLVE_PROXIES:
				setResolveProxies(RESOLVE_PROXIES_EDEFAULT);
				return;
			case OpgraphPackage.REFERENCE__CONTAINMENT:
				setContainment(CONTAINMENT_EDEFAULT);
				return;
			case OpgraphPackage.REFERENCE__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
				return;
			case OpgraphPackage.REFERENCE__LOCAL:
				setLocal(LOCAL_EDEFAULT);
				return;
			case OpgraphPackage.REFERENCE__KEYS:
				getKeys().clear();
				return;
			case OpgraphPackage.REFERENCE__OPPOSITE:
				setOpposite((Reference)null);
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
			case OpgraphPackage.REFERENCE__RESOLVE_PROXIES:
				return isResolveProxies() != RESOLVE_PROXIES_EDEFAULT;
			case OpgraphPackage.REFERENCE__CONTAINMENT:
				return isContainment() != CONTAINMENT_EDEFAULT;
			case OpgraphPackage.REFERENCE__CONTAINER:
				return isContainer() != CONTAINER_EDEFAULT;
			case OpgraphPackage.REFERENCE__LOCAL:
				return isLocal() != LOCAL_EDEFAULT;
			case OpgraphPackage.REFERENCE__KEYS:
				return !getKeys().isEmpty();
			case OpgraphPackage.REFERENCE__OPPOSITE:
				return basicGetOpposite() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceImpl
