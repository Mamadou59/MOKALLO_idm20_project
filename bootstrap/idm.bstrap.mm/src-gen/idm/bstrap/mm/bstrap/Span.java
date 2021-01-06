/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.bstrap.mm.bstrap.Span#getBadgeproperties <em>Badgeproperties</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getSpan()
 * @model
 * @generated
 */
public interface Span extends TextContainable {
	/**
	 * Returns the value of the '<em><b>Badgeproperties</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.BadgeProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Badgeproperties</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getSpan_Badgeproperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<BadgeProperty> getBadgeproperties();

} // Span
