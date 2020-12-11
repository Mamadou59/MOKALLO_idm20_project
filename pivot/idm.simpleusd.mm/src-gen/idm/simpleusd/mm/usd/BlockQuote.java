/**
 */
package idm.simpleusd.mm.usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Quote</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.BlockQuote#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getBlockQuote()
 * @model
 * @generated
 */
public interface BlockQuote extends ListItemElement, PageContent {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simpleusd.mm.usd.PageContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see idm.simpleusd.mm.usd.UsdPackage#getBlockQuote_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageContent> getContents();

} // BlockQuote
