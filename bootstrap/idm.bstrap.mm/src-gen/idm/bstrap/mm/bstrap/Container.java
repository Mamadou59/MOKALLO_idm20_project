/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.Container#getTextelements <em>Textelements</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends PageContent {
	/**
	 * Returns the value of the '<em><b>Textelements</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textelements</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getContainer_Textelements()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getTextelements();

} // Container
