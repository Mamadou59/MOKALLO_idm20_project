/**
 */
package idm.simpleusd.mm.usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.Navigation#getGroupedItems <em>Grouped Items</em>}</li>
 *   <li>{@link idm.simpleusd.mm.usd.Navigation#getType <em>Type</em>}</li>
 *   <li>{@link idm.simpleusd.mm.usd.Navigation#getTextContent <em>Text Content</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getNavigation()
 * @model
 * @generated
 */
public interface Navigation extends ContainableTextElement {
	/**
	 * Returns the value of the '<em><b>Grouped Items</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simpleusd.mm.usd.ListElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grouped Items</em>' containment reference list.
	 * @see idm.simpleusd.mm.usd.UsdPackage#getNavigation_GroupedItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListElement> getGroupedItems();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see idm.simpleusd.mm.usd.UsdPackage#getNavigation_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link idm.simpleusd.mm.usd.Navigation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Content</em>' attribute.
	 * @see #setTextContent(String)
	 * @see idm.simpleusd.mm.usd.UsdPackage#getNavigation_TextContent()
	 * @model
	 * @generated
	 */
	String getTextContent();

	/**
	 * Sets the value of the '{@link idm.simpleusd.mm.usd.Navigation#getTextContent <em>Text Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Content</em>' attribute.
	 * @see #getTextContent()
	 * @generated
	 */
	void setTextContent(String value);

} // Navigation
