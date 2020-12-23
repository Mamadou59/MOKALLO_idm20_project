/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Text Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.CompositeTextElement#getSubTextElements <em>Sub Text Elements</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getCompositeTextElement()
 * @model
 * @generated
 */
public interface CompositeTextElement extends ContainableTextElement {
	/**
	 * Returns the value of the '<em><b>Sub Text Elements</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.TextElements}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Text Elements</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getCompositeTextElement_SubTextElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElements> getSubTextElements();

} // CompositeTextElement
