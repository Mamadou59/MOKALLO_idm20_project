/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.PageContent#getGeneralProperties <em>General Properties</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getPageContent()
 * @model abstract="true"
 * @generated
 */
public interface PageContent extends EObject {
	/**
	 * Returns the value of the '<em><b>General Properties</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.General}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Properties</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getPageContent_GeneralProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<General> getGeneralProperties();

} // PageContent
