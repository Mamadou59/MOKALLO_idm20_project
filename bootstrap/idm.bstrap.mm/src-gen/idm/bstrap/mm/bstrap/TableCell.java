/**
 */
package idm.bstrap.mm.bstrap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.TableCell#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.TableCell#getSpan <em>Span</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTableCell()
 * @model
 * @generated
 */
public interface TableCell extends TextContainer {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * The literals are from the enumeration {@link idm.bstrap.mm.bstrap.Alignement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see idm.bstrap.mm.bstrap.Alignement
	 * @see #setAlignment(Alignement)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTableCell_Alignment()
	 * @model
	 * @generated
	 */
	Alignement getAlignment();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.TableCell#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see idm.bstrap.mm.bstrap.Alignement
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(Alignement value);

	/**
	 * Returns the value of the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Span</em>' attribute.
	 * @see #setSpan(int)
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTableCell_Span()
	 * @model
	 * @generated
	 */
	int getSpan();

	/**
	 * Sets the value of the '{@link idm.bstrap.mm.bstrap.TableCell#getSpan <em>Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Span</em>' attribute.
	 * @see #getSpan()
	 * @generated
	 */
	void setSpan(int value);

} // TableCell
