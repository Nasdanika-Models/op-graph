/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Node#getIncomingCalls <em>Incoming Calls</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Node#getOutgoingCalls <em>Outgoing Calls</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Invocable, GroupElement {
	/**
	 * Returns the value of the '<em><b>Incoming Calls</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Call}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Call#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Calls</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getNode_IncomingCalls()
	 * @see org.nasdanika.models.opgraph.Call#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Call> getIncomingCalls();

	/**
	 * Returns the value of the '<em><b>Outgoing Calls</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Call}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Call#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Calls wired to this node
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Calls</em>' containment reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getNode_OutgoingCalls()
	 * @see org.nasdanika.models.opgraph.Call#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Call> getOutgoingCalls();

} // Node
