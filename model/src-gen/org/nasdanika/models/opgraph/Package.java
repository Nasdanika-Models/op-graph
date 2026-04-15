/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ENamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A collection of related classes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Package#getNsPrefix <em>Ns Prefix</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Package#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Package#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Ns Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns Prefix</em>' attribute.
	 * @see #setNsPrefix(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getPackage_NsPrefix()
	 * @model unique="false"
	 * @generated
	 */
	String getNsPrefix();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Package#getNsPrefix <em>Ns Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns Prefix</em>' attribute.
	 * @see #getNsPrefix()
	 * @generated
	 */
	void setNsPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getPackage_NsURI()
	 * @model unique="false"
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Package#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getPackage_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<org.nasdanika.models.opgraph.Class> getClasses();

} // Package
