/**
 */
package idm.bstrap.mm.bstrap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marges Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.MargesProperty#getLevel <em>Level</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.MargesProperty#getAlignement <em>Alignement</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getMargesProperty()
 * @model abstract="true"
 * @generated
 */
public interface MargesProperty extends General {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getMargesProperty_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.MargesProperty#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

	/**
	 * Returns the value of the '<em><b>Alignement</b></em>' attribute.
	 * The literals are from the enumeration {@link idm.bstrap.mm.bstrap.Alignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignement</em>' attribute.
	 * @see idm.bstrap.mm.bstrap.Alignement
	 * @see #setAlignement(Alignement)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getMargesProperty_Alignement()
	 * @model
	 * @generated
	 */
	Alignement getAlignement();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.MargesProperty#getAlignement <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignement</em>' attribute.
	 * @see idm.bstrap.mm.bstrap.Alignement
	 * @see #getAlignement()
	 * @generated
	 */
	void setAlignement(Alignement value);

} // MargesProperty
