/**
 */
package org.nasdanika.models.opgraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ETypedElement;

import org.eclipse.emf.ecore.impl.ENamedElementImpl;

import org.nasdanika.models.opgraph.Invocable;
import org.nasdanika.models.opgraph.OpgraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invocable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.impl.InvocableImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.InvocableImpl#getBodyRef <em>Body Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.InvocableImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.InvocableImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.InvocableImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.impl.InvocableImpl#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvocableImpl extends ENamedElementImpl implements Invocable {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBodyRef() <em>Body Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyRef()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_REF_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = "Java";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpgraphPackage.Literals.INVOCABLE;
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
	public String getBody() {
		return (String)eDynamicGet(OpgraphPackage.INVOCABLE__BODY - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody) {
		eDynamicSet(OpgraphPackage.INVOCABLE__BODY - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__BODY, newBody);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBodyRef() {
		return (String)eDynamicGet(OpgraphPackage.INVOCABLE__BODY_REF - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__BODY_REF, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBodyRef(String newBodyRef) {
		eDynamicSet(OpgraphPackage.INVOCABLE__BODY_REF - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__BODY_REF, newBodyRef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return (String)eDynamicGet(OpgraphPackage.INVOCABLE__LANGUAGE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__LANGUAGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		eDynamicSet(OpgraphPackage.INVOCABLE__LANGUAGE - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__LANGUAGE, newLanguage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ETypedElement> getInputs() {
		return (EList<ETypedElement>)eDynamicGet(OpgraphPackage.INVOCABLE__INPUTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__INPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ETypedElement> getOutputs() {
		return (EList<ETypedElement>)eDynamicGet(OpgraphPackage.INVOCABLE__OUTPUTS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__OUTPUTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EClassifier> getExceptions() {
		return (EList<EClassifier>)eDynamicGet(OpgraphPackage.INVOCABLE__EXCEPTIONS - ESTATIC_FEATURE_COUNT, OpgraphPackage.Literals.INVOCABLE__EXCEPTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpgraphPackage.INVOCABLE__BODY:
				return getBody();
			case OpgraphPackage.INVOCABLE__BODY_REF:
				return getBodyRef();
			case OpgraphPackage.INVOCABLE__LANGUAGE:
				return getLanguage();
			case OpgraphPackage.INVOCABLE__INPUTS:
				return getInputs();
			case OpgraphPackage.INVOCABLE__OUTPUTS:
				return getOutputs();
			case OpgraphPackage.INVOCABLE__EXCEPTIONS:
				return getExceptions();
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
			case OpgraphPackage.INVOCABLE__BODY:
				setBody((String)newValue);
				return;
			case OpgraphPackage.INVOCABLE__BODY_REF:
				setBodyRef((String)newValue);
				return;
			case OpgraphPackage.INVOCABLE__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case OpgraphPackage.INVOCABLE__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends ETypedElement>)newValue);
				return;
			case OpgraphPackage.INVOCABLE__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends ETypedElement>)newValue);
				return;
			case OpgraphPackage.INVOCABLE__EXCEPTIONS:
				getExceptions().clear();
				getExceptions().addAll((Collection<? extends EClassifier>)newValue);
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
			case OpgraphPackage.INVOCABLE__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case OpgraphPackage.INVOCABLE__BODY_REF:
				setBodyRef(BODY_REF_EDEFAULT);
				return;
			case OpgraphPackage.INVOCABLE__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case OpgraphPackage.INVOCABLE__INPUTS:
				getInputs().clear();
				return;
			case OpgraphPackage.INVOCABLE__OUTPUTS:
				getOutputs().clear();
				return;
			case OpgraphPackage.INVOCABLE__EXCEPTIONS:
				getExceptions().clear();
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
			case OpgraphPackage.INVOCABLE__BODY:
				return BODY_EDEFAULT == null ? getBody() != null : !BODY_EDEFAULT.equals(getBody());
			case OpgraphPackage.INVOCABLE__BODY_REF:
				return BODY_REF_EDEFAULT == null ? getBodyRef() != null : !BODY_REF_EDEFAULT.equals(getBodyRef());
			case OpgraphPackage.INVOCABLE__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? getLanguage() != null : !LANGUAGE_EDEFAULT.equals(getLanguage());
			case OpgraphPackage.INVOCABLE__INPUTS:
				return !getInputs().isEmpty();
			case OpgraphPackage.INVOCABLE__OUTPUTS:
				return !getOutputs().isEmpty();
			case OpgraphPackage.INVOCABLE__EXCEPTIONS:
				return !getExceptions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InvocableImpl
