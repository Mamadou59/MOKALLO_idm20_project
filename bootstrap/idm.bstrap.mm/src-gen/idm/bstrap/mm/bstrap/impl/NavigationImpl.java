/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.ListElement;
import idm.bstrap.mm.bstrap.NavBarProperty;
import idm.bstrap.mm.bstrap.Navigation;

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
 *   <li>{@link idm.bstrap.mm.bstrap.impl.NavigationImpl#getListelement <em>Listelement</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.NavigationImpl#getNavbar <em>Navbar</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationImpl extends TextPageContentImpl implements Navigation {
	/**
	 * The cached value of the '{@link #getListelement() <em>Listelement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListelement()
	 * @generated
	 * @ordered
	 */
	protected EList<ListElement> listelement;

	/**
	 * The cached value of the '{@link #getNavbar() <em>Navbar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavbar()
	 * @generated
	 * @ordered
	 */
	protected EList<NavBarProperty> navbar;

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
		return BstrapPackage.Literals.NAVIGATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ListElement> getListelement() {
		if (listelement == null) {
			listelement = new EObjectContainmentEList<ListElement>(ListElement.class, this,
					BstrapPackage.NAVIGATION__LISTELEMENT);
		}
		return listelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavBarProperty> getNavbar() {
		if (navbar == null) {
			navbar = new EObjectContainmentEList<NavBarProperty>(NavBarProperty.class, this,
					BstrapPackage.NAVIGATION__NAVBAR);
		}
		return navbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.NAVIGATION__LISTELEMENT:
			return ((InternalEList<?>) getListelement()).basicRemove(otherEnd, msgs);
		case BstrapPackage.NAVIGATION__NAVBAR:
			return ((InternalEList<?>) getNavbar()).basicRemove(otherEnd, msgs);
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
		case BstrapPackage.NAVIGATION__LISTELEMENT:
			return getListelement();
		case BstrapPackage.NAVIGATION__NAVBAR:
			return getNavbar();
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
		case BstrapPackage.NAVIGATION__LISTELEMENT:
			getListelement().clear();
			getListelement().addAll((Collection<? extends ListElement>) newValue);
			return;
		case BstrapPackage.NAVIGATION__NAVBAR:
			getNavbar().clear();
			getNavbar().addAll((Collection<? extends NavBarProperty>) newValue);
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
		case BstrapPackage.NAVIGATION__LISTELEMENT:
			getListelement().clear();
			return;
		case BstrapPackage.NAVIGATION__NAVBAR:
			getNavbar().clear();
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
		case BstrapPackage.NAVIGATION__LISTELEMENT:
			return listelement != null && !listelement.isEmpty();
		case BstrapPackage.NAVIGATION__NAVBAR:
			return navbar != null && !navbar.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NavigationImpl
