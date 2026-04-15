/**
 */
package org.nasdanika.models.opgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Invokes the target invocable.
 * May process (map) inputs and outputs as well as handle exceptions.
 * 
 * Calls are passed to activities and other calls as additional inputs
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Call#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Call#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Invocable {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Node#getIncomingCalls <em>Incoming Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getCall_Target()
	 * @see org.nasdanika.models.opgraph.Node#getIncomingCalls
	 * @model opposite="incomingCalls"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Call#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Node#getOutgoingCalls <em>Outgoing Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Node)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getCall_Source()
	 * @see org.nasdanika.models.opgraph.Node#getOutgoingCalls
	 * @model opposite="outgoingCalls" transient="false"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Call#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

} // Call
