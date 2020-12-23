/**
 */
package idm.bstrap.mm.bstrap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see idm.bstrap.mm.bstrap.BstrapPackage
 * @generated
 */
public interface BstrapFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BstrapFactory eINSTANCE = idm.bstrap.mm.bstrap.impl.BstrapFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Fix Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fix Container</em>'.
	 * @generated
	 */
	FixContainer createFixContainer();

	/**
	 * Returns a new object of class '<em>Fluid Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fluid Container</em>'.
	 * @generated
	 */
	FluidContainer createFluidContainer();

	/**
	 * Returns a new object of class '<em>Margin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Margin</em>'.
	 * @generated
	 */
	Margin createMargin();

	/**
	 * Returns a new object of class '<em>Padding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Padding</em>'.
	 * @generated
	 */
	Padding createPadding();

	/**
	 * Returns a new object of class '<em>Dark</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dark</em>'.
	 * @generated
	 */
	Dark createDark();

	/**
	 * Returns a new object of class '<em>Primary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primary</em>'.
	 * @generated
	 */
	Primary createPrimary();

	/**
	 * Returns a new object of class '<em>New EClass13</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New EClass13</em>'.
	 * @generated
	 */
	NewEClass13 createNewEClass13();

	/**
	 * Returns a new object of class '<em>New EClass14</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New EClass14</em>'.
	 * @generated
	 */
	NewEClass14 createNewEClass14();

	/**
	 * Returns a new object of class '<em>General</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>General</em>'.
	 * @generated
	 */
	General createGeneral();

	/**
	 * Returns a new object of class '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title</em>'.
	 * @generated
	 */
	Title createTitle();

	/**
	 * Returns a new object of class '<em>Paragraphe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraphe</em>'.
	 * @generated
	 */
	Paragraphe createParagraphe();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BstrapPackage getBstrapPackage();

} //BstrapFactory
