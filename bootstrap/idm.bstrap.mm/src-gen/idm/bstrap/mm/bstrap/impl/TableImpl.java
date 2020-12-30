/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.Table;
import idm.bstrap.mm.bstrap.TableProperty;
import idm.bstrap.mm.bstrap.TableSection;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.TableImpl#getTablesections <em>Tablesections</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.TableImpl#getTableproperties <em>Tableproperties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends TextPageContentImpl implements Table {
	/**
	 * The cached value of the '{@link #getTablesections() <em>Tablesections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablesections()
	 * @generated
	 * @ordered
	 */
	protected EList<TableSection> tablesections;

	/**
	 * The cached value of the '{@link #getTableproperties() <em>Tableproperties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableproperties()
	 * @generated
	 * @ordered
	 */
	protected EList<TableProperty> tableproperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableSection> getTablesections() {
		if (tablesections == null) {
			tablesections = new EObjectContainmentEList<TableSection>(TableSection.class, this,
					BstrapPackage.TABLE__TABLESECTIONS);
		}
		return tablesections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableProperty> getTableproperties() {
		if (tableproperties == null) {
			tableproperties = new EObjectContainmentEList<TableProperty>(TableProperty.class, this,
					BstrapPackage.TABLE__TABLEPROPERTIES);
		}
		return tableproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.TABLE__TABLESECTIONS:
			return ((InternalEList<?>) getTablesections()).basicRemove(otherEnd, msgs);
		case BstrapPackage.TABLE__TABLEPROPERTIES:
			return ((InternalEList<?>) getTableproperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BstrapPackage.TABLE__TABLESECTIONS:
			return getTablesections();
		case BstrapPackage.TABLE__TABLEPROPERTIES:
			return getTableproperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BstrapPackage.TABLE__TABLESECTIONS:
			getTablesections().clear();
			getTablesections().addAll((Collection<? extends TableSection>) newValue);
			return;
		case BstrapPackage.TABLE__TABLEPROPERTIES:
			getTableproperties().clear();
			getTableproperties().addAll((Collection<? extends TableProperty>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case BstrapPackage.TABLE__TABLESECTIONS:
			getTablesections().clear();
			return;
		case BstrapPackage.TABLE__TABLEPROPERTIES:
			getTableproperties().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case BstrapPackage.TABLE__TABLESECTIONS:
			return tablesections != null && !tablesections.isEmpty();
		case BstrapPackage.TABLE__TABLEPROPERTIES:
			return tableproperties != null && !tableproperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
