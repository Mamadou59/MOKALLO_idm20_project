/**
 */
package idm.bstrap.mm.bstrap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alert Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.AlertStyle#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getAlertStyle()
 * @model
 * @generated
 */
public interface AlertStyle extends AlertProperty {

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The default value is <code>"LIGHT"</code>.
	 * The literals are from the enumeration {@link idm.bstrap.mm.bstrap.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see idm.bstrap.mm.bstrap.Color
	 * @see #setColor(Color)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getAlertStyle_Color()
	 * @model default="LIGHT"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.AlertStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see idm.bstrap.mm.bstrap.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);
} // AlertStyle
