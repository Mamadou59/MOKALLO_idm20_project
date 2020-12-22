/**
 */
package idm.simpleusd.mm.usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.Section#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getSection()
 * @model
 * @generated
 */
public interface Section extends PageContent {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simpleusd.mm.usd.PageContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see idm.simpleusd.mm.usd.UsdPackage#getSection_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageContent> getContents();

} // Section
