/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Performs some operation
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Operator#getBody <em>Body</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Operator#getBodyRef <em>Body Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Operator#getDelegateBody <em>Delegate Body</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Operator#getDelegateBodyRef <em>Delegate Body Ref</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Operator#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Operator#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Operator#getExceptions <em>Exceptions</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Operator#getExceptionHandlers <em>Exception Handlers</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getOperator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Operator extends Component {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Code body
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getOperator_Body()
	 * @model unique="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Operator#getBody <em>Body</em>}' attribute.
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
	 * URI of the code body
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Ref</em>' attribute.
	 * @see #setBodyRef(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getOperator_BodyRef()
	 * @model unique="false"
	 * @generated
	 */
	String getBodyRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Operator#getBodyRef <em>Body Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Ref</em>' attribute.
	 * @see #getBodyRef()
	 * @generated
	 */
	void setBodyRef(String value);

	/**
	 * Returns the value of the '<em><b>Delegate Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Code body for the delegate operation when this operator is
	 * contained by a host class and there is an operation
	 * in the host delegating to this one
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegate Body</em>' attribute.
	 * @see #setDelegateBody(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getOperator_DelegateBody()
	 * @model unique="false"
	 * @generated
	 */
	String getDelegateBody();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Operator#getDelegateBody <em>Delegate Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Body</em>' attribute.
	 * @see #getDelegateBody()
	 * @generated
	 */
	void setDelegateBody(String value);

	/**
	 * Returns the value of the '<em><b>Delegate Body Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * URI of the delegate code body
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegate Body Ref</em>' attribute.
	 * @see #setDelegateBodyRef(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getOperator_DelegateBodyRef()
	 * @model unique="false"
	 * @generated
	 */
	String getDelegateBodyRef();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Operator#getDelegateBodyRef <em>Delegate Body Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delegate Body Ref</em>' attribute.
	 * @see #getDelegateBodyRef()
	 * @generated
	 */
	void setDelegateBodyRef(String value);

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
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getOperator_Language()
	 * @model default="Java" unique="false"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Operator#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Allows to override the default operation name such as apply for functions or accept for consumers
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getOperator_OperationName()
	 * @model unique="false"
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Operator#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Exceptions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Exceptions which this operator's operation may throw
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exceptions</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getOperator_Exceptions()
	 * @model
	 * @generated
	 */
	EList<EClassifier> getExceptions();

	/**
	 * Returns the value of the '<em><b>Exception Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Predicate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Exception handlers are evaluated in the definition order
	 * until one of them return true or there are no more handlers.
	 * In the latter case the exception bubbles up to the caller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Handlers</em>' containment reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getOperator_ExceptionHandlers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Predicate> getExceptionHandlers();

} // Operator
