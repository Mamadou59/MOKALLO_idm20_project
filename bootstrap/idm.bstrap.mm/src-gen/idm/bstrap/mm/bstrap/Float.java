/**
 */
package idm.bstrap.mm.bstrap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.Float#getAlignement <em>Alignement</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getFloat()
 * @model
 * @generated
 */
public interface Float extends ImageAligning {

	/**
	 * Returns the value of the '<em><b>Alignement</b></em>' attribute.
	 * The default value is <code>"LEFT"</code>.
	 * The literals are from the enumeration {@link idm.bstrap.mm.bstrap.Alignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignement</em>' attribute.
	 * @see idm.bstrap.mm.bstrap.Alignement
	 * @see #setAlignement(Alignement)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getFloat_Alignement()
	 * @model default="LEFT"
	 * @generated
	 */
	Alignement getAlignement();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.Float#getAlignement <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignement</em>' attribute.
	 * @see idm.bstrap.mm.bstrap.Alignement
	 * @see #getAlignement()
	 * @generated
	 */
	void setAlignement(Alignement value);
} // Float
