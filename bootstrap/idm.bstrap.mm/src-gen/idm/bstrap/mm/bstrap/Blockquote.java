/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blockquote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.Blockquote#getPagecontents <em>Pagecontents</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getBlockquote()
 * @model
 * @generated
 */
public interface Blockquote extends PageContent {
	/**
	 * Returns the value of the '<em><b>Pagecontents</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.PageContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagecontents</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getBlockquote_Pagecontents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageContent> getPagecontents();

} // Blockquote
