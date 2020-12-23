/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.PageContent;
import idm.bstrap.mm.bstrap.TextContainer;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.ContainerImpl#getPagecontents <em>Pagecontents</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.ContainerImpl#getTextcontainers <em>Textcontainers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends PageContentImpl implements idm.bstrap.mm.bstrap.Container {
	/**
	 * The cached value of the '{@link #getPagecontents() <em>Pagecontents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagecontents()
	 * @generated
	 * @ordered
	 */
	protected EList<PageContent> pagecontents;

	/**
	 * The cached value of the '{@link #getTextcontainers() <em>Textcontainers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextcontainers()
	 * @generated
	 * @ordered
	 */
	protected EList<TextContainer> textcontainers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageContent> getPagecontents() {
		if (pagecontents == null) {
			pagecontents = new EObjectContainmentEList<PageContent>(PageContent.class, this,
					BstrapPackage.CONTAINER__PAGECONTENTS);
		}
		return pagecontents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextContainer> getTextcontainers() {
		if (textcontainers == null) {
			textcontainers = new EObjectContainmentEList<TextContainer>(TextContainer.class, this,
					BstrapPackage.CONTAINER__TEXTCONTAINERS);
		}
		return textcontainers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.CONTAINER__PAGECONTENTS:
			return ((InternalEList<?>) getPagecontents()).basicRemove(otherEnd, msgs);
		case BstrapPackage.CONTAINER__TEXTCONTAINERS:
			return ((InternalEList<?>) getTextcontainers()).basicRemove(otherEnd, msgs);
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
		case BstrapPackage.CONTAINER__PAGECONTENTS:
			return getPagecontents();
		case BstrapPackage.CONTAINER__TEXTCONTAINERS:
			return getTextcontainers();
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
		case BstrapPackage.CONTAINER__PAGECONTENTS:
			getPagecontents().clear();
			getPagecontents().addAll((Collection<? extends PageContent>) newValue);
			return;
		case BstrapPackage.CONTAINER__TEXTCONTAINERS:
			getTextcontainers().clear();
			getTextcontainers().addAll((Collection<? extends TextContainer>) newValue);
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
		case BstrapPackage.CONTAINER__PAGECONTENTS:
			getPagecontents().clear();
			return;
		case BstrapPackage.CONTAINER__TEXTCONTAINERS:
			getTextcontainers().clear();
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
		case BstrapPackage.CONTAINER__PAGECONTENTS:
			return pagecontents != null && !pagecontents.isEmpty();
		case BstrapPackage.CONTAINER__TEXTCONTAINERS:
			return textcontainers != null && !textcontainers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
