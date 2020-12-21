/**
 */
package idm.simpleusd.mm.usd.impl;

import idm.simpleusd.mm.usd.Table;
import idm.simpleusd.mm.usd.TableSection;
import idm.simpleusd.mm.usd.UsdPackage;

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
 *   <li>{@link idm.simpleusd.mm.usd.impl.TableImpl#getTableSections <em>Table Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableImpl extends PageContentImpl implements Table {
	/**
	 * The cached value of the '{@link #getTableSections() <em>Table Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableSections()
	 * @generated
	 * @ordered
	 */
	protected EList<TableSection> tableSections;

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
		return UsdPackage.Literals.TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableSection> getTableSections() {
		if (tableSections == null) {
			tableSections = new EObjectContainmentEList<TableSection>(TableSection.class, this,
					UsdPackage.TABLE__TABLE_SECTIONS);
		}
		return tableSections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsdPackage.TABLE__TABLE_SECTIONS:
			return ((InternalEList<?>) getTableSections()).basicRemove(otherEnd, msgs);
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
		case UsdPackage.TABLE__TABLE_SECTIONS:
			return getTableSections();
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
		case UsdPackage.TABLE__TABLE_SECTIONS:
			getTableSections().clear();
			getTableSections().addAll((Collection<? extends TableSection>) newValue);
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
		case UsdPackage.TABLE__TABLE_SECTIONS:
			getTableSections().clear();
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
		case UsdPackage.TABLE__TABLE_SECTIONS:
			return tableSections != null && !tableSections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableImpl
