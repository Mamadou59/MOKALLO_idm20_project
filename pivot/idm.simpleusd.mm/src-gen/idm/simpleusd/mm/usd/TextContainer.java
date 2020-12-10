/**
 */
package idm.simpleusd.mm.usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.TextContainer#getTextElements <em>Text Elements</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getTextContainer()
 * @model abstract="true"
 * @generated
 */
public interface TextContainer extends PageContent {
	/**
	 * Returns the value of the '<em><b>Text Elements</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simpleusd.mm.usd.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Elements</em>' containment reference list.
	 * @see idm.simpleusd.mm.usd.UsdPackage#getTextContainer_TextElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getTextElements();

} // TextContainer
