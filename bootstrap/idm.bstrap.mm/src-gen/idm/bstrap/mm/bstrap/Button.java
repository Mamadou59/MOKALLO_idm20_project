/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.Button#getButtonproperties <em>Buttonproperties</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends ContainableTextElement {
	/**
	 * Returns the value of the '<em><b>Buttonproperties</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.ButtonProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buttonproperties</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getButton_Buttonproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ButtonProperty> getButtonproperties();

} // Button
