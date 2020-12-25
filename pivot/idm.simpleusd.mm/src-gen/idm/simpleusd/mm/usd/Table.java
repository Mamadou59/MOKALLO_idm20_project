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
 *   <li>{@link idm.simpleusd.mm.usd.Table#getTablesections <em>Tablesections</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends PageContent {
	/**
	 * Returns the value of the '<em><b>Tablesections</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simpleusd.mm.usd.TableSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablesections</em>' containment reference list.
	 * @see idm.simpleusd.mm.usd.UsdPackage#getTable_Tablesections()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableSection> getTablesections();

} // Table
