/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Produces outputs or throws an exception
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Supplier#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Supplier#getOutputName <em>Output Name</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Supplier#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getSupplier()
 * @model
 * @generated
 */
public interface Supplier extends Operator {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.ETypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getSupplier_Outputs()
	 * @model
	 * @generated
	 */
	EList<ETypedElement> getOutputs();

	/**
	 * Returns the value of the '<em><b>Output Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Name of the output type if there is more than one output element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Name</em>' attribute.
	 * @see #setOutputName(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getSupplier_OutputName()
	 * @model unique="false"
	 * @generated
	 */
	String getOutputName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Supplier#getOutputName <em>Output Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Name</em>' attribute.
	 * @see #getOutputName()
	 * @generated
	 */
	void setOutputName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Transition}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Outputs can be passed to outgoing transitions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getSupplier_OutgoingTransitions()
	 * @see org.nasdanika.models.opgraph.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

} // Supplier
