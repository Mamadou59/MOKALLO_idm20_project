/**
 */
package idm.simpleusd.mm.usd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.Button#getTextContent <em>Text Content</em>}</li>
 *   <li>{@link idm.simpleusd.mm.usd.Button#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends TextElement {
	/**
	 * Returns the value of the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Content</em>' attribute.
	 * @see #setTextContent(String)
	 * @see idm.simpleusd.mm.usd.UsdPackage#getButton_TextContent()
	 * @model
	 * @generated
	 */
	String getTextContent();

	/**
	 * Sets the value of the '{@link idm.simpleusd.mm.usd.Button#getTextContent <em>Text Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Content</em>' attribute.
	 * @see #getTextContent()
	 * @generated
	 */
	void setTextContent(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see idm.simpleusd.mm.usd.UsdPackage#getButton_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link idm.simpleusd.mm.usd.Button#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Button
