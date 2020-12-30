/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.ListItem#getListitemelements <em>Listitemelements</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.ListItem#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getListItem()
 * @model
 * @generated
 */
public interface ListItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Listitemelements</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.ListItemElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listitemelements</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getListItem_Listitemelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItemElement> getListitemelements();

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getListItem_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.ListItem#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

} // ListItem
