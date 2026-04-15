/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Something that can be started and stopped
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Component#getStarter <em>Starter</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Component#getStopper <em>Stopper</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Component#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getComponent()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Component extends org.nasdanika.models.opgraph.Class {
	/**
	 * Returns the value of the '<em><b>Starter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Starts the component. For example, establishes connections to external systems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Starter</em>' containment reference.
	 * @see #setStarter(Operator)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getComponent_Starter()
	 * @model containment="true"
	 * @generated
	 */
	Operator getStarter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Component#getStarter <em>Starter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Starter</em>' containment reference.
	 * @see #getStarter()
	 * @generated
	 */
	void setStarter(Operator value);

	/**
	 * Returns the value of the '<em><b>Stopper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Stops the component. For example, closes connections to external systems, deletes temporary files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stopper</em>' containment reference.
	 * @see #setStopper(Operator)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getComponent_Stopper()
	 * @model containment="true"
	 * @generated
	 */
	Operator getStopper();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Component#getStopper <em>Stopper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stopper</em>' containment reference.
	 * @see #getStopper()
	 * @generated
	 */
	void setStopper(Operator value);

	/**
	 * Returns the value of the '<em><b>Outgoing Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Call}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Call#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Component may call functions as part of its startup or overall functionality
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Calls</em>' containment reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getComponent_OutgoingCalls()
	 * @see org.nasdanika.models.opgraph.Call#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Call> getOutgoingCalls();

} // Component
