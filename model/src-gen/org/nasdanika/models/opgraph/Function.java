/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Takes inputs, produces outputs or throws an exception
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Function#getIncomingCalls <em>Incoming Calls</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends Consumer, Supplier {
	/**
	 * Returns the value of the '<em><b>Incoming Calls</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Call}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.opgraph.Call#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Function can be invoked by calls
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Incoming Calls</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getFunction_IncomingCalls()
	 * @see org.nasdanika.models.opgraph.Call#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Call> getIncomingCalls();

} // Function
