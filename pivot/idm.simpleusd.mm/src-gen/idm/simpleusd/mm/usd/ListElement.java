/**
 */
package idm.simpleusd.mm.usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.ListElement#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getListElement()
 * @model abstract="true"
 * @generated
 */
public interface ListElement extends PageContent, ListItemElement {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simpleusd.mm.usd.ListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see idm.simpleusd.mm.usd.UsdPackage#getListElement_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getItems();

} // ListElement
