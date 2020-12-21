/**
 */
package idm.simpleusd.mm.usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.Table#getTableSections <em>Table Sections</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends PageContent {
	/**
	 * Returns the value of the '<em><b>Table Sections</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simpleusd.mm.usd.TableSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Sections</em>' containment reference list.
	 * @see idm.simpleusd.mm.usd.UsdPackage#getTable_TableSections()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableSection> getTableSections();

} // Table
