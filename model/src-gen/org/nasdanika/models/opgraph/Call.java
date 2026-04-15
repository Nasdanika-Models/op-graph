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
 * Calls the target function.
 * May process (map) inputs and outputs as well as handle exceptions.
 * 
 * Calls are functions themselves, so they may have their own calls.
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
public interface Call extends Function, Component {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Function#getIncomingCalls <em>Incoming Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Function)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getCall_Target()
	 * @see org.nasdanika.models.opgraph.Function#getIncomingCalls
	 * @model opposite="incomingCalls"
	 * @generated
	 */
	Function getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Call#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Function value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Component#getOutgoingCalls <em>Outgoing Calls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Component)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getCall_Source()
	 * @see org.nasdanika.models.opgraph.Component#getOutgoingCalls
	 * @model opposite="outgoingCalls" transient="false"
	 * @generated
	 */
	Component getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Call#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Component value);

} // Call
