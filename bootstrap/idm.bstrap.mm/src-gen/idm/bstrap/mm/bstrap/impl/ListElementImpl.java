/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.ListElement;
import idm.bstrap.mm.bstrap.ListItem;
import idm.bstrap.mm.bstrap.ListProperty;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.ListElementImpl#getListitems <em>Listitems</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.ListElementImpl#getListproperty <em>Listproperty</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ListElementImpl extends TextPageContentImpl implements ListElement {
	/**
	 * The cached value of the '{@link #getListitems() <em>Listitems</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListitems()
	 * @generated
	 * @ordered
	 */
	protected EList<ListItem> listitems;

	/**
	 * The cached value of the '{@link #getListproperty() <em>Listproperty</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListproperty()
	 * @generated
	 * @ordered
	 */
	protected EList<ListProperty> listproperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.LIST_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListItem> getListitems() {
		if (listitems == null) {
			listitems = new EObjectContainmentEList<ListItem>(ListItem.class, this,
					BstrapPackage.LIST_ELEMENT__LISTITEMS);
		}
		return listitems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListProperty> getListproperty() {
		if (listproperty == null) {
			listproperty = new EObjectContainmentEList<ListProperty>(ListProperty.class, this,
					BstrapPackage.LIST_ELEMENT__LISTPROPERTY);
		}
		return listproperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.LIST_ELEMENT__LISTITEMS:
			return ((InternalEList<?>) getListitems()).basicRemove(otherEnd, msgs);
		case BstrapPackage.LIST_ELEMENT__LISTPROPERTY:
			return ((InternalEList<?>) getListproperty()).basicRemove(otherEnd, msgs);
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
		case BstrapPackage.LIST_ELEMENT__LISTITEMS:
			return getListitems();
		case BstrapPackage.LIST_ELEMENT__LISTPROPERTY:
			return getListproperty();
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
		case BstrapPackage.LIST_ELEMENT__LISTITEMS:
			getListitems().clear();
			getListitems().addAll((Collection<? extends ListItem>) newValue);
			return;
		case BstrapPackage.LIST_ELEMENT__LISTPROPERTY:
			getListproperty().clear();
			getListproperty().addAll((Collection<? extends ListProperty>) newValue);
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
		case BstrapPackage.LIST_ELEMENT__LISTITEMS:
			getListitems().clear();
			return;
		case BstrapPackage.LIST_ELEMENT__LISTPROPERTY:
			getListproperty().clear();
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
		case BstrapPackage.LIST_ELEMENT__LISTITEMS:
			return listitems != null && !listitems.isEmpty();
		case BstrapPackage.LIST_ELEMENT__LISTPROPERTY:
			return listproperty != null && !listproperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListElementImpl
