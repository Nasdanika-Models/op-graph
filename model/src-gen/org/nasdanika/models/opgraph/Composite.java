/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Group is generated to EClass with elements generated either to
 * operations or contained classes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Composite#getComponents <em>Components</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getComposite()
 * @model
 * @generated
 */
public interface Composite extends Component {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getComposite_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();

} // Composite
