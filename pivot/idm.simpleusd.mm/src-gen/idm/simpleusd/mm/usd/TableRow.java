/**
 */
package idm.simpleusd.mm.usd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.TableRow#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getTableRow()
 * @model
 * @generated
 */
public interface TableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simpleusd.mm.usd.TableCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see idm.simpleusd.mm.usd.UsdPackage#getTableRow_Cells()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableCell> getCells();

} // TableRow
