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
 *   <li>{@link idm.bstrap.mm.bstrap.Container#getTextpagecontents <em>Textpagecontents</em>}</li>
 *   <li>{@link idm.bstrap.mm.bstrap.Container#getContainers <em>Containers</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends PageContent {
	/**
	 * Returns the value of the '<em><b>Textpagecontents</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.TextPageContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textpagecontents</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getContainer_Textpagecontents()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextPageContent> getTextpagecontents();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.Container}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containers</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getContainer_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Container> getContainers();

} // Container
