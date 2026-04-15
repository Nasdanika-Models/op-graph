/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
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
 *   <li>{@link org.nasdanika.models.opgraph.Group#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Group#getElements <em>Elements</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Group#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends GroupElement {
	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getGroup_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<EClass> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.GroupElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getGroup_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<GroupElement> getElements();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getGroup_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Group
