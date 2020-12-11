/**
 */
package idm.simpleusd.mm.usd.impl;

import idm.simpleusd.mm.usd.CodeBlock;
import idm.simpleusd.mm.usd.CodeLine;
import idm.simpleusd.mm.usd.UsdPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.impl.CodeBlockImpl#getCodeLines <em>Code Lines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeBlockImpl extends PageContentImpl implements CodeBlock {
	/**
	 * The cached value of the '{@link #getCodeLines() <em>Code Lines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeLines()
	 * @generated
	 * @ordered
	 */
	protected EList<CodeLine> codeLines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UsdPackage.Literals.CODE_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeLine> getCodeLines() {
		if (codeLines == null) {
			codeLines = new EObjectContainmentEList<CodeLine>(CodeLine.class, this, UsdPackage.CODE_BLOCK__CODE_LINES);
		}
		return codeLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UsdPackage.CODE_BLOCK__CODE_LINES:
			return ((InternalEList<?>) getCodeLines()).basicRemove(otherEnd, msgs);
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
		case UsdPackage.CODE_BLOCK__CODE_LINES:
			return getCodeLines();
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
		case UsdPackage.CODE_BLOCK__CODE_LINES:
			getCodeLines().clear();
			getCodeLines().addAll((Collection<? extends CodeLine>) newValue);
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
		case UsdPackage.CODE_BLOCK__CODE_LINES:
			getCodeLines().clear();
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
		case UsdPackage.CODE_BLOCK__CODE_LINES:
			return codeLines != null && !codeLines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodeBlockImpl
