/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A collection of features which may extend zero or more superTypes
 * providing base functionality
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Class#getSuperTypes <em>Super Types</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Class#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getClass_()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Class extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Super Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Types</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getClass_SuperTypes()
	 * @model
	 * @generated
	 */
	EList<EClass> getSuperTypes();

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Feature}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getClass_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<Feature> getFeatures();

} // Class
