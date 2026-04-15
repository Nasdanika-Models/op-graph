/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Consumes inputs and may throw an exception as a result
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Consumer#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Consumer#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getConsumer()
 * @model
 * @generated
 */
public interface Consumer extends Operator {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.ETypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getConsumer_Inputs()
	 * @model
	 * @generated
	 */
	EList<ETypedElement> getInputs();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Transition}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Inputs can be provided by incoming transitions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getConsumer_IncomingTransitions()
	 * @see org.nasdanika.models.opgraph.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

} // Consumer
