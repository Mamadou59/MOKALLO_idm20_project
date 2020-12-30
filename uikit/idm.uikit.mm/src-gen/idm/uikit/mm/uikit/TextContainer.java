/**
 */
package idm.uikit.mm.uikit;

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
 *   <li>{@link idm.uikit.mm.uikit.TextContainer#getTextelements <em>Textelements</em>}</li>
 * </ul>
 *
 * @see idm.uikit.mm.uikit.UikitPackage#getTextContainer()
 * @model abstract="true"
 * @generated
 */
public interface TextContainer extends TextPageContent {
	/**
	 * Returns the value of the '<em><b>Textelements</b></em>' containment reference list.
	 * The list contents are of type {@link idm.uikit.mm.uikit.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textelements</em>' containment reference list.
	 * @see idm.uikit.mm.uikit.UikitPackage#getTextContainer_Textelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getTextelements();

} // TextContainer
