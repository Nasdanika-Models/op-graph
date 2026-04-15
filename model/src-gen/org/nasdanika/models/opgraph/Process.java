/**
 */
package org.nasdanika.models.opgraph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Process#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Process#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends Group, Activity {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Invocations from the process incoming transitions are routed to the start activity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(Activity)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getProcess_Start()
	 * @model
	 * @generated
	 */
	Activity getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Process#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Activity value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Invocations from the process end activity are passed to the process outgoing transitions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference.
	 * @see #setEnd(Activity)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getProcess_End()
	 * @model
	 * @generated
	 */
	Activity getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Process#getEnd <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Activity value);

} // Process
