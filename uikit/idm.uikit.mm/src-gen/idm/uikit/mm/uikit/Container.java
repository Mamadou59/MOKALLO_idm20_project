/**
 */
package idm.uikit.mm.uikit;

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
 *   <li>{@link idm.uikit.mm.uikit.Container#getContents <em>Contents</em>}</li>
 * </ul>
 *
 * @see idm.uikit.mm.uikit.UikitPackage#getContainer()
 * @model
 * @generated
 */
public interface Container extends PageContent {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link idm.uikit.mm.uikit.PageContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see idm.uikit.mm.uikit.UikitPackage#getContainer_Contents()
	 * @model containment="true"
	 * @generated
	 */
	EList<PageContent> getContents();

} // Container
