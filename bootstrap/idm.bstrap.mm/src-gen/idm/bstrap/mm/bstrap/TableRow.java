/**
 */
package idm.bstrap.mm.bstrap;

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
 *   <li>{@link idm.bstrap.mm.bstrap.TableRow#getTablecells <em>Tablecells</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.TableRow#getGenerals <em>Generals</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTableRow()
 * @model
 * @generated
 */
public interface TableRow extends EObject {
	/**
	 * Returns the value of the '<em><b>Tablecells</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.TableCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablecells</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTableRow_Tablecells()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableCell> getTablecells();

	/**
	 * Returns the value of the '<em><b>Generals</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.General}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generals</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTableRow_Generals()
	 * @model containment="true"
	 * @generated
	 */
	EList<General> getGenerals();

} // TableRow
