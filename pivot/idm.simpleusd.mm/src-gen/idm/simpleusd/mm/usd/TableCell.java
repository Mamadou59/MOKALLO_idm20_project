/**
 */
package idm.simpleusd.mm.usd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.TableCell#getAlignement <em>Alignement</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends TextContainer {
	/**
	 * Returns the value of the '<em><b>Alignement</b></em>' attribute.
	 * The literals are from the enumeration {@link idm.simpleusd.mm.usd.TableCellAlignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignement</em>' attribute.
	 * @see idm.simpleusd.mm.usd.TableCellAlignement
	 * @see #setAlignement(TableCellAlignement)
	 * @see idm.simpleusd.mm.usd.UsdPackage#getTableCell_Alignement()
	 * @model
	 * @generated
	 */
	TableCellAlignement getAlignement();

	/**
	 * Sets the value of the '{@link idm.simpleusd.mm.usd.TableCell#getAlignement <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignement</em>' attribute.
	 * @see idm.simpleusd.mm.usd.TableCellAlignement
	 * @see #getAlignement()
	 * @generated
	 */
	void setAlignement(TableCellAlignement value);

} // TableCell
