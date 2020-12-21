/**
 */
package idm.simpleusd.mm.usd.impl;

import idm.simpleusd.mm.usd.TableCell;
import idm.simpleusd.mm.usd.TableRow;
import idm.simpleusd.mm.usd.UsdPackage;

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
 * An implementation of the model object '<em><b>Table Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.impl.TableRowImpl#getCells <em>Cells</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableRowImpl extends MinimalEObjectImpl.Container implements TableRow {
	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<TableCell> cells;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsdPackage.Literals.TABLE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableCell> getCells() {
		if (cells == null) {
			cells = new EObjectContainmentEList<TableCell>(TableCell.class, this, UsdPackage.TABLE_ROW__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsdPackage.TABLE_ROW__CELLS:
			return ((InternalEList<?>) getCells()).basicRemove(otherEnd, msgs);
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
		case UsdPackage.TABLE_ROW__CELLS:
			return getCells();
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
		case UsdPackage.TABLE_ROW__CELLS:
			getCells().clear();
			getCells().addAll((Collection<? extends TableCell>) newValue);
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
		case UsdPackage.TABLE_ROW__CELLS:
			getCells().clear();
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
		case UsdPackage.TABLE_ROW__CELLS:
			return cells != null && !cells.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableRowImpl
