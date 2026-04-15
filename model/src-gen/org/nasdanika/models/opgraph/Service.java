/**
 */
package org.nasdanika.models.opgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Service#getEntryPoint <em>Entry Point</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Node, Group {
	/**
	 * Returns the value of the '<em><b>Entry Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point</em>' reference.
	 * @see #setEntryPoint(Node)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getService_EntryPoint()
	 * @model
	 * @generated
	 */
	Node getEntryPoint();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Service#getEntryPoint <em>Entry Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point</em>' reference.
	 * @see #getEntryPoint()
	 * @generated
	 */
	void setEntryPoint(Node value);

} // Service
