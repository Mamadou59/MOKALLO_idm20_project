/**
 */
package idm.bstrap.mm.bstrap;

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
 *   <li>{@link idm.bstrap.mm.bstrap.Navigation#getListelement <em>Listelement</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.Navigation#getNavbar <em>Navbar</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getNavigation()
 * @model
 * @generated
 */
public interface Navigation extends TextPageContent {
	/**
	 * Returns the value of the '<em><b>Listelement</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.ListElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listelement</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getNavigation_Listelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListElement> getListelement();

	/**
	 * Returns the value of the '<em><b>Navbar</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.NavBarProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navbar</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getNavigation_Navbar()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavBarProperty> getNavbar();

} // Navigation
