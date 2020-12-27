/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.TestNestedElement;
import idm.bstrap.mm.bstrap.TextContainable;

import idm.bstrap.mm.bstrap.TextNested;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Containable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.TextContainableImpl#getTestnestedelements <em>Testnestedelements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TextContainableImpl extends ContainableTextElementImpl implements TextContainable {
	/**
	 * The cached value of the '{@link #getTestnestedelements() <em>Testnestedelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestnestedelements()
	 * @generated
	 * @ordered
	 */
	protected EList<TestNestedElement> testnestedelements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextContainableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.TEXT_CONTAINABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestNestedElement> getTestnestedelements() {
		if (testnestedelements == null) {
			testnestedelements = new EObjectContainmentEList<TestNestedElement>(TestNestedElement.class, this,
					BstrapPackage.TEXT_CONTAINABLE__TESTNESTEDELEMENTS);
		}
		return testnestedelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.TEXT_CONTAINABLE__TESTNESTEDELEMENTS:
			return ((InternalEList<?>) getTestnestedelements()).basicRemove(otherEnd, msgs);
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
		case BstrapPackage.TEXT_CONTAINABLE__TESTNESTEDELEMENTS:
			return getTestnestedelements();
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
		case BstrapPackage.TEXT_CONTAINABLE__TESTNESTEDELEMENTS:
			getTestnestedelements().clear();
			getTestnestedelements().addAll((Collection<? extends TestNestedElement>) newValue);
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
		case BstrapPackage.TEXT_CONTAINABLE__TESTNESTEDELEMENTS:
			getTestnestedelements().clear();
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
		case BstrapPackage.TEXT_CONTAINABLE__TESTNESTEDELEMENTS:
			return testnestedelements != null && !testnestedelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TextNested.class) {
			switch (derivedFeatureID) {
			case BstrapPackage.TEXT_CONTAINABLE__TESTNESTEDELEMENTS:
				return BstrapPackage.TEXT_NESTED__TESTNESTEDELEMENTS;
			default:
				return -1;
			}
		}
		if (baseClass == TestNestedElement.class) {
			switch (derivedFeatureID) {
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TextNested.class) {
			switch (baseFeatureID) {
			case BstrapPackage.TEXT_NESTED__TESTNESTEDELEMENTS:
				return BstrapPackage.TEXT_CONTAINABLE__TESTNESTEDELEMENTS;
			default:
				return -1;
			}
		}
		if (baseClass == TestNestedElement.class) {
			switch (baseFeatureID) {
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TextContainableImpl
