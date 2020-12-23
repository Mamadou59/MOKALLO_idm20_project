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
 *   <li>{@link idm.bstrap.mm.bstrap.Container#getPagecontents <em>Pagecontents</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.Container#getTextcontainers <em>Textcontainers</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends PageContent {
	/**
	 * Returns the value of the '<em><b>Pagecontents</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.PageContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagecontents</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getContainer_Pagecontents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageContent> getPagecontents();

	/**
	 * Returns the value of the '<em><b>Textcontainers</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.TextContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textcontainers</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getContainer_Textcontainers()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextContainer> getTextcontainers();

} // Container
