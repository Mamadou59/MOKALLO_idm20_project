/**
 */
package idm.simpleusd.mm.usd.impl;

import idm.simpleusd.mm.usd.ListElement;
import idm.simpleusd.mm.usd.Navigation;
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
 * An implementation of the model object '<em><b>Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.impl.NavigationImpl#getGroupedItems <em>Grouped Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationImpl extends ClickableElementImpl implements Navigation {
	/**
	 * The cached value of the '{@link #getGroupedItems() <em>Grouped Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupedItems()
	 * @generated
	 * @ordered
	 */
	protected EList<ListElement> groupedItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsdPackage.Literals.NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListElement> getGroupedItems() {
		if (groupedItems == null) {
			groupedItems = new EObjectContainmentEList<ListElement>(ListElement.class, this,
					UsdPackage.NAVIGATION__GROUPED_ITEMS);
		}
		return groupedItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsdPackage.NAVIGATION__GROUPED_ITEMS:
			return ((InternalEList<?>) getGroupedItems()).basicRemove(otherEnd, msgs);
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
		case UsdPackage.NAVIGATION__GROUPED_ITEMS:
			return getGroupedItems();
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
		case UsdPackage.NAVIGATION__GROUPED_ITEMS:
			getGroupedItems().clear();
			getGroupedItems().addAll((Collection<? extends ListElement>) newValue);
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
		case UsdPackage.NAVIGATION__GROUPED_ITEMS:
			getGroupedItems().clear();
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
		case UsdPackage.NAVIGATION__GROUPED_ITEMS:
			return groupedItems != null && !groupedItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationImpl
