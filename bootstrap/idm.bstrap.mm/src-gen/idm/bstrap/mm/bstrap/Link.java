/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.Link#getLinkproperties <em>Linkproperties</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends UrlBasedLink, TextNested {
	/**
	 * Returns the value of the '<em><b>Linkproperties</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.LinkProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkproperties</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getLink_Linkproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkProperty> getLinkproperties();

} // Link
