/**
 */
package idm.bstrap.mm.bstrap;

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
 *   <li>{@link idm.bstrap.mm.bstrap.ListElement#getListitems <em>Listitems</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.ListElement#getListproperty <em>Listproperty</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getListElement()
 * @model abstract="true"
 * @generated
 */
public interface ListElement extends TextPageContent {
	/**
	 * Returns the value of the '<em><b>Listitems</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.ListItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listitems</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getListElement_Listitems()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListItem> getListitems();

	/**
	 * Returns the value of the '<em><b>Listproperty</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.ListProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listproperty</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getListElement_Listproperty()
	 * @model containment="true"
	 * @generated
	 */
	EList<ListProperty> getListproperty();

} // ListElement
