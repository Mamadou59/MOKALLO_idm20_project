/**
 */
package idm.bstrap.mm.bstrap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Containable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.TextContainable#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTextContainable()
 * @model abstract="true"
 * @generated
 */
public interface TextContainable extends ContainableTextElement {

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTextContainable_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.TextContainable#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);
} // TextContainable
