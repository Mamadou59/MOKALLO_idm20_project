/**
 */
package idm.bstrap.mm.bstrap;

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
 *   <li>{@link idm.bstrap.mm.bstrap.TextContainer#getTextelements <em>Textelements</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.TextContainer#getColor <em>Color</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.TextContainer#getEmphasis <em>Emphasis</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTextContainer()
 * @model abstract="true"
 * @generated
 */
public interface TextContainer extends TextPageContent {
	/**
	 * Returns the value of the '<em><b>Textelements</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.TextElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textelements</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTextContainer_Textelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElements> getTextelements();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link idm.bstrap.mm.bstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see idm.bstrap.mm.bstrap.Color
	 * @see #setColor(Color)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTextContainer_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.TextContainer#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see idm.bstrap.mm.bstrap.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * Returns the value of the '<em><b>Emphasis</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.Emphasis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emphasis</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTextContainer_Emphasis()
	 * @model containment="true"
	 * @generated
	 */
	EList<Emphasis> getEmphasis();

} // TextContainer
