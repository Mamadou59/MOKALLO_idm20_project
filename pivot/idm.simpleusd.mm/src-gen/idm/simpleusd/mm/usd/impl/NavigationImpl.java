/**
 */
package idm.simpleusd.mm.usd.impl;

import idm.simpleusd.mm.usd.ListElement;
import idm.simpleusd.mm.usd.Navigation;
import idm.simpleusd.mm.usd.UsdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

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
 *   <li>{@link idm.simpleusd.mm.usd.impl.NavigationImpl#getType <em>Type</em>}</li>
 *   <li>{@link idm.simpleusd.mm.usd.impl.NavigationImpl#getTextContent <em>Text Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NavigationImpl extends ContainableTextElementImpl implements Navigation {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTextContent() <em>Text Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextContent()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTextContent() <em>Text Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextContent()
	 * @generated
	 * @ordered
	 */
	protected String textContent = TEXT_CONTENT_EDEFAULT;

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
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsdPackage.NAVIGATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTextContent() {
		return textContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTextContent(String newTextContent) {
		String oldTextContent = textContent;
		textContent = newTextContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UsdPackage.NAVIGATION__TEXT_CONTENT, oldTextContent,
					textContent));
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
		case UsdPackage.NAVIGATION__TYPE:
			return getType();
		case UsdPackage.NAVIGATION__TEXT_CONTENT:
			return getTextContent();
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
		case UsdPackage.NAVIGATION__TYPE:
			setType((String) newValue);
			return;
		case UsdPackage.NAVIGATION__TEXT_CONTENT:
			setTextContent((String) newValue);
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
		case UsdPackage.NAVIGATION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case UsdPackage.NAVIGATION__TEXT_CONTENT:
			setTextContent(TEXT_CONTENT_EDEFAULT);
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
		case UsdPackage.NAVIGATION__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		case UsdPackage.NAVIGATION__TEXT_CONTENT:
			return TEXT_CONTENT_EDEFAULT == null ? textContent != null : !TEXT_CONTENT_EDEFAULT.equals(textContent);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", textContent: ");
		result.append(textContent);
		result.append(')');
		return result.toString();
	}

} //NavigationImpl
