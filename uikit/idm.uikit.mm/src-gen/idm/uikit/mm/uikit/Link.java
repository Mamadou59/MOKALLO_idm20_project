/**
 */
package idm.uikit.mm.uikit;

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
 *   <li>{@link idm.uikit.mm.uikit.Link#getLinkproperties <em>Linkproperties</em>}</li>
 * </ul>
 *
 * @see idm.uikit.mm.uikit.UikitPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends UrlBasedLink, TextNested {

	/**
	 * Returns the value of the '<em><b>Linkproperties</b></em>' containment reference list.
	 * The list contents are of type {@link idm.uikit.mm.uikit.LinkProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkproperties</em>' containment reference list.
	 * @see idm.uikit.mm.uikit.UikitPackage#getLink_Linkproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkProperty> getLinkproperties();
} // Link
