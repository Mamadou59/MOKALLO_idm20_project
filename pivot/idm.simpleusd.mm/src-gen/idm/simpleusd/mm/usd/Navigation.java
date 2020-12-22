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
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getNavigation()
 * @model
 * @generated
 */
public interface Navigation extends ClickableElement {
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

} // Navigation
