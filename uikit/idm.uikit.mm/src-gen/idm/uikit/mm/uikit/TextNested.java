/**
 */
package idm.uikit.mm.uikit;

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
 *   <li>{@link idm.uikit.mm.uikit.TextNested#getTextnestedelements <em>Textnestedelements</em>}</li>
 * </ul>
 *
 * @see idm.uikit.mm.uikit.UikitPackage#getTextNested()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TextNested extends EObject {
	/**
	 * Returns the value of the '<em><b>Textnestedelements</b></em>' containment reference list.
	 * The list contents are of type {@link idm.uikit.mm.uikit.TextNestedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textnestedelements</em>' containment reference list.
	 * @see idm.uikit.mm.uikit.UikitPackage#getTextNested_Textnestedelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextNestedElement> getTextnestedelements();

} // TextNested
