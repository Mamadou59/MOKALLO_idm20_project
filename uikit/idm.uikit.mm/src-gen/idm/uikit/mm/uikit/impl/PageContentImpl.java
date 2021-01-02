/**
 */
package idm.uikit.mm.uikit.impl;

import idm.uikit.mm.uikit.GeneralProperty;
import idm.uikit.mm.uikit.PageContent;
import idm.uikit.mm.uikit.UikitPackage;

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
 * An implementation of the model object '<em><b>Page Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.uikit.mm.uikit.impl.PageContentImpl#getGeneralproperties <em>Generalproperties</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PageContentImpl extends MinimalEObjectImpl.Container implements PageContent {
	/**
	 * The cached value of the '{@link #getGeneralproperties() <em>Generalproperties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralproperties()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralProperty> generalproperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UikitPackage.Literals.PAGE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralProperty> getGeneralproperties() {
		if (generalproperties == null) {
			generalproperties = new EObjectContainmentEList<GeneralProperty>(GeneralProperty.class, this,
					UikitPackage.PAGE_CONTENT__GENERALPROPERTIES);
		}
		return generalproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UikitPackage.PAGE_CONTENT__GENERALPROPERTIES:
			return ((InternalEList<?>) getGeneralproperties()).basicRemove(otherEnd, msgs);
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
		case UikitPackage.PAGE_CONTENT__GENERALPROPERTIES:
			return getGeneralproperties();
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
		case UikitPackage.PAGE_CONTENT__GENERALPROPERTIES:
			getGeneralproperties().clear();
			getGeneralproperties().addAll((Collection<? extends GeneralProperty>) newValue);
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
		case UikitPackage.PAGE_CONTENT__GENERALPROPERTIES:
			getGeneralproperties().clear();
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
		case UikitPackage.PAGE_CONTENT__GENERALPROPERTIES:
			return generalproperties != null && !generalproperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PageContentImpl
