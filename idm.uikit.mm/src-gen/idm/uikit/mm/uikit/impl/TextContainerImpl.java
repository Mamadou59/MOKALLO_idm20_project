/**
 */
package idm.uikit.mm.uikit.impl;

import idm.uikit.mm.uikit.TextContainer;
import idm.uikit.mm.uikit.TextElement;
import idm.uikit.mm.uikit.UikitPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.uikit.mm.uikit.impl.TextContainerImpl#getTextelements <em>Textelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TextContainerImpl extends TextPageContentImpl implements TextContainer {
	/**
	 * The cached value of the '{@link #getTextelements() <em>Textelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextelements()
	 * @generated
	 * @ordered
	 */
	protected EList<TextElement> textelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UikitPackage.Literals.TEXT_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextElement> getTextelements() {
		if (textelements == null) {
			textelements = new EObjectContainmentEList<TextElement>(TextElement.class, this,
					UikitPackage.TEXT_CONTAINER__TEXTELEMENTS);
		}
		return textelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UikitPackage.TEXT_CONTAINER__TEXTELEMENTS:
			return ((InternalEList<?>) getTextelements()).basicRemove(otherEnd, msgs);
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
		case UikitPackage.TEXT_CONTAINER__TEXTELEMENTS:
			return getTextelements();
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
		case UikitPackage.TEXT_CONTAINER__TEXTELEMENTS:
			getTextelements().clear();
			getTextelements().addAll((Collection<? extends TextElement>) newValue);
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
		case UikitPackage.TEXT_CONTAINER__TEXTELEMENTS:
			getTextelements().clear();
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
		case UikitPackage.TEXT_CONTAINER__TEXTELEMENTS:
			return textelements != null && !textelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TextContainerImpl
