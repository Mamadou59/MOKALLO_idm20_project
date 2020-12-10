/**
 */
package org.eclipse.sirius.sample.basicwebsite;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.sample.basicwebsite.TextContainer#getTextelement <em>Textelement</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getTextContainer()
 * @model abstract="true"
 * @generated
 */
public interface TextContainer extends PageContent {
	/**
	 * Returns the value of the '<em><b>Textelement</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.sample.basicwebsite.TextElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Textelement</em>' containment reference list.
	 * @see org.eclipse.sirius.sample.basicwebsite.BasicwebsitePackage#getTextContainer_Textelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<TextElement> getTextelement();

} // TextContainer
