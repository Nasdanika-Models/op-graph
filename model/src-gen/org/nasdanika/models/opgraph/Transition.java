/**
 */
package org.nasdanika.models.opgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Transitions pass data and control from suppliers to consumers
 * Transitions can perform data mapping.
 * Transitions can be conditional and can be activated by thrown exceptions (error transitions)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Predicate {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Supplier#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Supplier)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getTransition_Source()
	 * @see org.nasdanika.models.opgraph.Supplier#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" transient="false"
	 * @generated
	 */
	Supplier getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Supplier value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Consumer#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Consumer)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getTransition_Target()
	 * @see org.nasdanika.models.opgraph.Consumer#getIncomingTransitions
	 * @model opposite="incomingTransitions"
	 * @generated
	 */
	Consumer getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Consumer value);

} // Transition
