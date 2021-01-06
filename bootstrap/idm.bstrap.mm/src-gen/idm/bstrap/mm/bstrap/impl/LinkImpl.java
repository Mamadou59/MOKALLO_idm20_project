/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.BadgeProperty;
import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.ButtonProperty;
import idm.bstrap.mm.bstrap.Link;
import idm.bstrap.mm.bstrap.LinkProperty;
import idm.bstrap.mm.bstrap.TextNested;
import idm.bstrap.mm.bstrap.TextNestedElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.LinkImpl#getTextnestedelements <em>Textnestedelements</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.LinkImpl#getLinkproperties <em>Linkproperties</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.LinkImpl#getButtonproperties <em>Buttonproperties</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.LinkImpl#getBadgeproperties <em>Badgeproperties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends UrlBasedLinkImpl implements Link {
	/**
	 * The cached value of the '{@link #getTextnestedelements() <em>Textnestedelements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextnestedelements()
	 * @generated
	 * @ordered
	 */
	protected EList<TextNestedElement> textnestedelements;

	/**
	 * The cached value of the '{@link #getLinkproperties() <em>Linkproperties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkproperties()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkProperty> linkproperties;

	/**
	 * The cached value of the '{@link #getButtonproperties() <em>Buttonproperties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButtonproperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ButtonProperty> buttonproperties;

	/**
	 * The cached value of the '{@link #getBadgeproperties() <em>Badgeproperties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBadgeproperties()
	 * @generated
	 * @ordered
	 */
	protected EList<BadgeProperty> badgeproperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextNestedElement> getTextnestedelements() {
		if (textnestedelements == null) {
			textnestedelements = new EObjectContainmentEList<TextNestedElement>(TextNestedElement.class, this,
					BstrapPackage.LINK__TEXTNESTEDELEMENTS);
		}
		return textnestedelements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkProperty> getLinkproperties() {
		if (linkproperties == null) {
			linkproperties = new EObjectContainmentEList<LinkProperty>(LinkProperty.class, this,
					BstrapPackage.LINK__LINKPROPERTIES);
		}
		return linkproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ButtonProperty> getButtonproperties() {
		if (buttonproperties == null) {
			buttonproperties = new EObjectContainmentEList<ButtonProperty>(ButtonProperty.class, this,
					BstrapPackage.LINK__BUTTONPROPERTIES);
		}
		return buttonproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BadgeProperty> getBadgeproperties() {
		if (badgeproperties == null) {
			badgeproperties = new EObjectContainmentEList<BadgeProperty>(BadgeProperty.class, this,
					BstrapPackage.LINK__BADGEPROPERTIES);
		}
		return badgeproperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.LINK__TEXTNESTEDELEMENTS:
			return ((InternalEList<?>) getTextnestedelements()).basicRemove(otherEnd, msgs);
		case BstrapPackage.LINK__LINKPROPERTIES:
			return ((InternalEList<?>) getLinkproperties()).basicRemove(otherEnd, msgs);
		case BstrapPackage.LINK__BUTTONPROPERTIES:
			return ((InternalEList<?>) getButtonproperties()).basicRemove(otherEnd, msgs);
		case BstrapPackage.LINK__BADGEPROPERTIES:
			return ((InternalEList<?>) getBadgeproperties()).basicRemove(otherEnd, msgs);
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
		case BstrapPackage.LINK__TEXTNESTEDELEMENTS:
			return getTextnestedelements();
		case BstrapPackage.LINK__LINKPROPERTIES:
			return getLinkproperties();
		case BstrapPackage.LINK__BUTTONPROPERTIES:
			return getButtonproperties();
		case BstrapPackage.LINK__BADGEPROPERTIES:
			return getBadgeproperties();
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
		case BstrapPackage.LINK__TEXTNESTEDELEMENTS:
			getTextnestedelements().clear();
			getTextnestedelements().addAll((Collection<? extends TextNestedElement>) newValue);
			return;
		case BstrapPackage.LINK__LINKPROPERTIES:
			getLinkproperties().clear();
			getLinkproperties().addAll((Collection<? extends LinkProperty>) newValue);
			return;
		case BstrapPackage.LINK__BUTTONPROPERTIES:
			getButtonproperties().clear();
			getButtonproperties().addAll((Collection<? extends ButtonProperty>) newValue);
			return;
		case BstrapPackage.LINK__BADGEPROPERTIES:
			getBadgeproperties().clear();
			getBadgeproperties().addAll((Collection<? extends BadgeProperty>) newValue);
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
		case BstrapPackage.LINK__TEXTNESTEDELEMENTS:
			getTextnestedelements().clear();
			return;
		case BstrapPackage.LINK__LINKPROPERTIES:
			getLinkproperties().clear();
			return;
		case BstrapPackage.LINK__BUTTONPROPERTIES:
			getButtonproperties().clear();
			return;
		case BstrapPackage.LINK__BADGEPROPERTIES:
			getBadgeproperties().clear();
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
		case BstrapPackage.LINK__TEXTNESTEDELEMENTS:
			return textnestedelements != null && !textnestedelements.isEmpty();
		case BstrapPackage.LINK__LINKPROPERTIES:
			return linkproperties != null && !linkproperties.isEmpty();
		case BstrapPackage.LINK__BUTTONPROPERTIES:
			return buttonproperties != null && !buttonproperties.isEmpty();
		case BstrapPackage.LINK__BADGEPROPERTIES:
			return badgeproperties != null && !badgeproperties.isEmpty();
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
			case BstrapPackage.LINK__TEXTNESTEDELEMENTS:
				return BstrapPackage.TEXT_NESTED__TEXTNESTEDELEMENTS;
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
			case BstrapPackage.TEXT_NESTED__TEXTNESTEDELEMENTS:
				return BstrapPackage.LINK__TEXTNESTEDELEMENTS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //LinkImpl
