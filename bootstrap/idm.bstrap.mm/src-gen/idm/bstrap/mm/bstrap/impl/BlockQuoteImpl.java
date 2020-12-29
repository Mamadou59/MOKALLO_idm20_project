/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.BlockQuote;
import idm.bstrap.mm.bstrap.BstrapPackage;

import idm.bstrap.mm.bstrap.PageContent;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Quote</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.impl.BlockQuoteImpl#getPagecontents <em>Pagecontents</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockQuoteImpl extends TextPageContentImpl implements BlockQuote {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockQuoteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BstrapPackage.Literals.BLOCK_QUOTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PageContent> getPagecontents() {
		if (pagecontents == null) {
			pagecontents = new EObjectContainmentEList<PageContent>(PageContent.class, this,
					BstrapPackage.BLOCK_QUOTE__PAGECONTENTS);
		}
		return pagecontents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BstrapPackage.BLOCK_QUOTE__PAGECONTENTS:
			return ((InternalEList<?>) getPagecontents()).basicRemove(otherEnd, msgs);
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
		case BstrapPackage.BLOCK_QUOTE__PAGECONTENTS:
			return getPagecontents();
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
		case BstrapPackage.BLOCK_QUOTE__PAGECONTENTS:
			getPagecontents().clear();
			getPagecontents().addAll((Collection<? extends PageContent>) newValue);
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
		case BstrapPackage.BLOCK_QUOTE__PAGECONTENTS:
			getPagecontents().clear();
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
		case BstrapPackage.BLOCK_QUOTE__PAGECONTENTS:
			return pagecontents != null && !pagecontents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockQuoteImpl
