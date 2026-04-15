/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.ETypedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invocable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Something that can be invoked, receive arguments and produce result or throw an exception
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Invocable#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Invocable#getBodyRef <em>Body Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Invocable#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Invocable#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Invocable#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Invocable#getExceptions <em>Exceptions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getInvocable()
 * @model
 * @generated
 */
public interface Invocable extends ENamedElement {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Invocable code body
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getInvocable_Body()
	 * @model unique="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Invocable#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Body Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * URI of invocable code body
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Ref</em>' attribute.
	 * @see #setBodyRef(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getInvocable_BodyRef()
	 * @model unique="false"
	 * @generated
	 */
	String getBodyRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Invocable#getBodyRef <em>Body Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Ref</em>' attribute.
	 * @see #getBodyRef()
	 * @generated
	 */
	void setBodyRef(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * The default value is <code>"Java"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * body or bodyRef language
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getInvocable_Language()
	 * @model default="Java" unique="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Invocable#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.ETypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getInvocable_Inputs()
	 * @model
	 * @generated
	 */
	EList<ETypedElement> getInputs();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.ETypedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getInvocable_Outputs()
	 * @model
	 * @generated
	 */
	EList<ETypedElement> getOutputs();

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exceptions</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getInvocable_Exceptions()
	 * @model
	 * @generated
	 */
	EList<EClassifier> getExceptions();

} // Invocable
