/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Transitions pass data and control between activities.
 * Transitions can perform data mapping.
 * Transitions can be conditional and can be activated by thrown exceptions (error transitions)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Transition#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.ETypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getTransition_Inputs()
	 * @model
	 * @generated
	 */
	EList<ETypedElement> getInputs();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Activity#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Activity)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getTransition_Source()
	 * @see org.nasdanika.models.opgraph.Activity#getOutgoingTransitions
	 * @model opposite="outgoingTransitions" transient="false"
	 * @generated
	 */
	Activity getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Transition#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Activity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Activity#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Activity)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getTransition_Target()
	 * @see org.nasdanika.models.opgraph.Activity#getIncomingTransitions
	 * @model opposite="incomingTransitions"
	 * @generated
	 */
	Activity getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Activity value);

} // Transition
