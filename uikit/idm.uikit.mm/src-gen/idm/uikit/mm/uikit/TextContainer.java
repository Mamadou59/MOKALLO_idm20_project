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
 *   <li>{@link idm.uikit.mm.uikit.TextContainer#getColor <em>Color</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link idm.uikit.mm.uikit.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see idm.uikit.mm.uikit.Color
	 * @see #setColor(Color)
	 * @see idm.uikit.mm.uikit.UikitPackage#getTextContainer_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link idm.uikit.mm.uikit.TextContainer#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see idm.uikit.mm.uikit.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // TextContainer
