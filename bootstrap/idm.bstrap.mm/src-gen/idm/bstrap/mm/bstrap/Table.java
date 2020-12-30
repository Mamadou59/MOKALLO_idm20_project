/**
 */
package idm.bstrap.mm.bstrap;

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
 *   <li>{@link idm.bstrap.mm.bstrap.Table#getTablesections <em>Tablesections</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.Table#getTableproperties <em>Tableproperties</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTable()
 * @model
 * @generated
 */
public interface Table extends TextPageContent {
	/**
	 * Returns the value of the '<em><b>Tablesections</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.TableSection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablesections</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTable_Tablesections()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableSection> getTablesections();

	/**
	 * Returns the value of the '<em><b>Tableproperties</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.TableProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tableproperties</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTable_Tableproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<TableProperty> getTableproperties();

} // Table
