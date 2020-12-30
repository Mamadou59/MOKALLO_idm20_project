/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.General;
import idm.bstrap.mm.bstrap.TableCell;
import idm.bstrap.mm.bstrap.TableRow;

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
 *   <li>{@link idm.bstrap.mm.bstrap.impl.TableRowImpl#getTablecells <em>Tablecells</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.TableRowImpl#getGenerals <em>Generals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableRowImpl extends MinimalEObjectImpl.Container implements TableRow {
	/**
	 * The cached value of the '{@link #getTablecells() <em>Tablecells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablecells()
	 * @generated
	 * @ordered
	 */
	protected EList<TableCell> tablecells;

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
		return BstrapPackage.Literals.TABLE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableCell> getTablecells() {
		if (tablecells == null) {
			tablecells = new EObjectContainmentEList<TableCell>(TableCell.class, this,
					BstrapPackage.TABLE_ROW__TABLECELLS);
		}
		return tablecells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<General> getGenerals() {
		if (generals == null) {
			generals = new EObjectContainmentEList<General>(General.class, this, BstrapPackage.TABLE_ROW__GENERALS);
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
		case BstrapPackage.TABLE_ROW__TABLECELLS:
			return ((InternalEList<?>) getTablecells()).basicRemove(otherEnd, msgs);
		case BstrapPackage.TABLE_ROW__GENERALS:
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
		case BstrapPackage.TABLE_ROW__TABLECELLS:
			return getTablecells();
		case BstrapPackage.TABLE_ROW__GENERALS:
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
		case BstrapPackage.TABLE_ROW__TABLECELLS:
			getTablecells().clear();
			getTablecells().addAll((Collection<? extends TableCell>) newValue);
			return;
		case BstrapPackage.TABLE_ROW__GENERALS:
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
		case BstrapPackage.TABLE_ROW__TABLECELLS:
			getTablecells().clear();
			return;
		case BstrapPackage.TABLE_ROW__GENERALS:
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
		case BstrapPackage.TABLE_ROW__TABLECELLS:
			return tablecells != null && !tablecells.isEmpty();
		case BstrapPackage.TABLE_ROW__GENERALS:
			return generals != null && !generals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableRowImpl
