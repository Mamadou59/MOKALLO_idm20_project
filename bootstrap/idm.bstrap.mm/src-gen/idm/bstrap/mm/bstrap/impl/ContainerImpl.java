/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.TextPageContent;

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
 *   <li>{@link idm.bstrap.mm.bstrap.impl.ContainerImpl#getTextpagecontents <em>Textpagecontents</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.ContainerImpl#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContainerImpl extends PageContentImpl implements idm.bstrap.mm.bstrap.Container {
	/**
	 * The cached value of the '{@link #getTextpagecontents() <em>Textpagecontents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextpagecontents()
	 * @generated
	 * @ordered
	 */
	protected EList<TextPageContent> textpagecontents;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<idm.bstrap.mm.bstrap.Container> containers;

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
	public EList<TextPageContent> getTextpagecontents() {
		if (textpagecontents == null) {
			textpagecontents = new EObjectContainmentEList<TextPageContent>(TextPageContent.class, this,
					BstrapPackage.CONTAINER__TEXTPAGECONTENTS);
		}
		return textpagecontents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<idm.bstrap.mm.bstrap.Container> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<idm.bstrap.mm.bstrap.Container>(
					idm.bstrap.mm.bstrap.Container.class, this, BstrapPackage.CONTAINER__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.CONTAINER__TEXTPAGECONTENTS:
			return ((InternalEList<?>) getTextpagecontents()).basicRemove(otherEnd, msgs);
		case BstrapPackage.CONTAINER__CONTAINERS:
			return ((InternalEList<?>) getContainers()).basicRemove(otherEnd, msgs);
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
		case BstrapPackage.CONTAINER__TEXTPAGECONTENTS:
			return getTextpagecontents();
		case BstrapPackage.CONTAINER__CONTAINERS:
			return getContainers();
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
		case BstrapPackage.CONTAINER__TEXTPAGECONTENTS:
			getTextpagecontents().clear();
			getTextpagecontents().addAll((Collection<? extends TextPageContent>) newValue);
			return;
		case BstrapPackage.CONTAINER__CONTAINERS:
			getContainers().clear();
			getContainers().addAll((Collection<? extends idm.bstrap.mm.bstrap.Container>) newValue);
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
		case BstrapPackage.CONTAINER__TEXTPAGECONTENTS:
			getTextpagecontents().clear();
			return;
		case BstrapPackage.CONTAINER__CONTAINERS:
			getContainers().clear();
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
		case BstrapPackage.CONTAINER__TEXTPAGECONTENTS:
			return textpagecontents != null && !textpagecontents.isEmpty();
		case BstrapPackage.CONTAINER__CONTAINERS:
			return containers != null && !containers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
