/**
 */
package idm.uikit.mm.uikit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marges Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.uikit.mm.uikit.MargesProperty#getSize <em>Size</em>}</li>
 *   <li>{@link idm.uikit.mm.uikit.MargesProperty#getAlign <em>Align</em>}</li>
 * </ul>
 *
 * @see idm.uikit.mm.uikit.UikitPackage#getMargesProperty()
 * @model abstract="true"
 * @generated
 */
public interface MargesProperty extends GeneralProperty {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The literals are from the enumeration {@link idm.uikit.mm.uikit.Size}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see idm.uikit.mm.uikit.Size
	 * @see #setSize(Size)
	 * @see idm.uikit.mm.uikit.UikitPackage#getMargesProperty_Size()
	 * @model
	 * @generated
	 */
	Size getSize();

	/**
	 * Sets the value of the '{@link idm.uikit.mm.uikit.MargesProperty#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see idm.uikit.mm.uikit.Size
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Size value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The default value is <code>"CENTER"</code>.
	 * The literals are from the enumeration {@link idm.uikit.mm.uikit.Align}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see idm.uikit.mm.uikit.Align
	 * @see #setAlign(Align)
	 * @see idm.uikit.mm.uikit.UikitPackage#getMargesProperty_Align()
	 * @model default="CENTER"
	 * @generated
	 */
	Align getAlign();

	/**
	 * Sets the value of the '{@link idm.uikit.mm.uikit.MargesProperty#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see idm.uikit.mm.uikit.Align
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(Align value);

} // MargesProperty
