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
 *   <li>{@link idm.bstrap.mm.bstrap.PageContent#getGeneralproperties <em>Generalproperties</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getPageContent()
 * @model abstract="true"
 * @generated
 */
public interface PageContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Generalproperties</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.General}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalproperties</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getPageContent_Generalproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<General> getGeneralproperties();

} // PageContent
