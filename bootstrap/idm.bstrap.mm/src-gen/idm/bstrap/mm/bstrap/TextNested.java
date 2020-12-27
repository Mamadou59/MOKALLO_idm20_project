/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Nested</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.TextNested#getTestnestedelements <em>Testnestedelements</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTextNested()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TextNested extends EObject {
	/**
	 * Returns the value of the '<em><b>Testnestedelements</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.TestNestedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Testnestedelements</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getTextNested_Testnestedelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TestNestedElement> getTestnestedelements();

} // TextNested
