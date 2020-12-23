/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.Image#getImageproperties <em>Imageproperties</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getImage()
 * @model
 * @generated
 */
public interface Image extends UrlBasedLink {
	/**
	 * Returns the value of the '<em><b>Imageproperties</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.ImageProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imageproperties</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getImage_Imageproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImageProperty> getImageproperties();

} // Image
