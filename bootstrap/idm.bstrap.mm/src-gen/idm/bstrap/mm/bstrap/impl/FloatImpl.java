/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.Alignement;
import idm.bstrap.mm.bstrap.BstrapPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.FloatImpl#getAlignement <em>Alignement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FloatImpl extends ImageAligningImpl implements idm.bstrap.mm.bstrap.Float {
	/**
	 * The default value of the '{@link #getAlignement() <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignement()
	 * @generated
	 * @ordered
	 */
	protected static final Alignement ALIGNEMENT_EDEFAULT = Alignement.LEFT;
	/**
	 * The cached value of the '{@link #getAlignement() <em>Alignement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignement()
	 * @generated
	 * @ordered
	 */
	protected Alignement alignement = ALIGNEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FloatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.FLOAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignement getAlignement() {
		return alignement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignement(Alignement newAlignement) {
		Alignement oldAlignement = alignement;
		alignement = newAlignement == null ? ALIGNEMENT_EDEFAULT : newAlignement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BstrapPackage.FLOAT__ALIGNEMENT, oldAlignement,
					alignement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BstrapPackage.FLOAT__ALIGNEMENT:
			return getAlignement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case BstrapPackage.FLOAT__ALIGNEMENT:
			setAlignement((Alignement) newValue);
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
		case BstrapPackage.FLOAT__ALIGNEMENT:
			setAlignement(ALIGNEMENT_EDEFAULT);
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
		case BstrapPackage.FLOAT__ALIGNEMENT:
			return alignement != ALIGNEMENT_EDEFAULT;
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
		result.append(" (alignement: ");
		result.append(alignement);
		result.append(')');
		return result.toString();
	}

} //FloatImpl
