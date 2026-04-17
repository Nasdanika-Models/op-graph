/**
 */
package org.nasdanika.models.opgraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.opgraph.Reference#isResolveProxies <em>Resolve Proxies</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Reference#isContainment <em>Containment</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Reference#isContainer <em>Container</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Reference#isLocal <em>Local</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Reference#getKeys <em>Keys</em>}</li>
 *   <li>{@link org.nasdanika.models.opgraph.Reference#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.opgraph.OpgraphPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Feature {
	/**
	 * Returns the value of the '<em><b>Resolve Proxies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #setResolveProxies(boolean)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getReference_ResolveProxies()
	 * @model unique="false"
	 * @generated
	 */
	boolean isResolveProxies();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Reference#isResolveProxies <em>Resolve Proxies</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Proxies</em>' attribute.
	 * @see #isResolveProxies()
	 * @generated
	 */
	void setResolveProxies(boolean value);

	/**
	 * Returns the value of the '<em><b>Containment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment</em>' attribute.
	 * @see #setContainment(boolean)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getReference_Containment()
	 * @model unique="false"
	 * @generated
	 */
	boolean isContainment();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Reference#isContainment <em>Containment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment</em>' attribute.
	 * @see #isContainment()
	 * @generated
	 */
	void setContainment(boolean value);

	/**
	 * Returns the value of the '<em><b>Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' attribute.
	 * @see #setContainer(boolean)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getReference_Container()
	 * @model unique="false"
	 * @generated
	 */
	boolean isContainer();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Reference#isContainer <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' attribute.
	 * @see #isContainer()
	 * @generated
	 */
	void setContainer(boolean value);

	/**
	 * Returns the value of the '<em><b>Local</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local</em>' attribute.
	 * @see #setLocal(boolean)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getReference_Local()
	 * @model unique="false"
	 * @generated
	 */
	boolean isLocal();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Reference#isLocal <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local</em>' attribute.
	 * @see #isLocal()
	 * @generated
	 */
	void setLocal(boolean value);

	/**
	 * Returns the value of the '<em><b>Keys</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.opgraph.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' reference list.
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getReference_Keys()
	 * @model
	 * @generated
	 */
	EList<Attribute> getKeys();

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Reference)
	 * @see org.nasdanika.models.opgraph.OpgraphPackage#getReference_Opposite()
	 * @model
	 * @generated
	 */
	Reference getOpposite();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.opgraph.Reference#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Reference value);

} // Reference
