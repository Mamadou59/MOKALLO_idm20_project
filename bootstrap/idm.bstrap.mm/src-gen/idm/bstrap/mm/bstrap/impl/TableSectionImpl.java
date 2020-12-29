/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.General;
import idm.bstrap.mm.bstrap.TableRow;
import idm.bstrap.mm.bstrap.TableSection;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.TableSectionImpl#getTablerows <em>Tablerows</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.TableSectionImpl#getGenerals <em>Generals</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TableSectionImpl extends MinimalEObjectImpl.Container implements TableSection {
	/**
	 * The cached value of the '{@link #getTablerows() <em>Tablerows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablerows()
	 * @generated
	 * @ordered
	 */
	protected EList<TableRow> tablerows;

	/**
	 * The cached value of the '{@link #getGenerals() <em>Generals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerals()
	 * @generated
	 * @ordered
	 */
	protected EList<General> generals;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.TABLE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableRow> getTablerows() {
		if (tablerows == null) {
			tablerows = new EObjectContainmentEList<TableRow>(TableRow.class, this,
					BstrapPackage.TABLE_SECTION__TABLEROWS);
		}
		return tablerows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<General> getGenerals() {
		if (generals == null) {
			generals = new EObjectContainmentEList<General>(General.class, this, BstrapPackage.TABLE_SECTION__GENERALS);
		}
		return generals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.TABLE_SECTION__TABLEROWS:
			return ((InternalEList<?>) getTablerows()).basicRemove(otherEnd, msgs);
		case BstrapPackage.TABLE_SECTION__GENERALS:
			return ((InternalEList<?>) getGenerals()).basicRemove(otherEnd, msgs);
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
		case BstrapPackage.TABLE_SECTION__TABLEROWS:
			return getTablerows();
		case BstrapPackage.TABLE_SECTION__GENERALS:
			return getGenerals();
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
		case BstrapPackage.TABLE_SECTION__TABLEROWS:
			getTablerows().clear();
			getTablerows().addAll((Collection<? extends TableRow>) newValue);
			return;
		case BstrapPackage.TABLE_SECTION__GENERALS:
			getGenerals().clear();
			getGenerals().addAll((Collection<? extends General>) newValue);
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
		case BstrapPackage.TABLE_SECTION__TABLEROWS:
			getTablerows().clear();
			return;
		case BstrapPackage.TABLE_SECTION__GENERALS:
			getGenerals().clear();
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
		case BstrapPackage.TABLE_SECTION__TABLEROWS:
			return tablerows != null && !tablerows.isEmpty();
		case BstrapPackage.TABLE_SECTION__GENERALS:
			return generals != null && !generals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableSectionImpl
