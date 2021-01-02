/**
 */
package idm.uikit.mm.uikit;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.uikit.mm.uikit.Title#getLevel <em>Level</em>}</li>
 *   <li>{@link idm.uikit.mm.uikit.Title#getTitleproperties <em>Titleproperties</em>}</li>
 * </ul>
 *
 * @see idm.uikit.mm.uikit.UikitPackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends TextContainer {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see idm.uikit.mm.uikit.UikitPackage#getTitle_Level()
	 * @model
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link idm.uikit.mm.uikit.Title#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Titleproperties</b></em>' containment reference list.
	 * The list contents are of type {@link idm.uikit.mm.uikit.TitleProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titleproperties</em>' containment reference list.
	 * @see idm.uikit.mm.uikit.UikitPackage#getTitle_Titleproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<TitleProperty> getTitleproperties();

} // Title
