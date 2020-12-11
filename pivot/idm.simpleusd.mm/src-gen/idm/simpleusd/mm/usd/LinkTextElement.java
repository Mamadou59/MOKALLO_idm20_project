/**
 */
package idm.simpleusd.mm.usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Text Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.LinkTextElement#getUrl <em>Url</em>}</li>
 *   <li>{@link idm.simpleusd.mm.usd.LinkTextElement#getTitle <em>Title</em>}</li>
 *   <li>{@link idm.simpleusd.mm.usd.LinkTextElement#getTextElements <em>Text Elements</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getLinkTextElement()
 * @model abstract="true"
 * @generated
 */
public interface LinkTextElement extends TextElement {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see idm.simpleusd.mm.usd.UsdPackage#getLinkTextElement_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link idm.simpleusd.mm.usd.LinkTextElement#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see idm.simpleusd.mm.usd.UsdPackage#getLinkTextElement_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link idm.simpleusd.mm.usd.LinkTextElement#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Text Elements</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simpleusd.mm.usd.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Elements</em>' containment reference list.
	 * @see idm.simpleusd.mm.usd.UsdPackage#getLinkTextElement_TextElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getTextElements();

} // LinkTextElement
