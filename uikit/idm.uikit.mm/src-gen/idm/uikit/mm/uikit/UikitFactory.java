/**
 */
package idm.uikit.mm.uikit;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see idm.uikit.mm.uikit.UikitPackage
 * @generated
 */
public interface UikitFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UikitFactory eINSTANCE = idm.uikit.mm.uikit.impl.UikitFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container</em>'.
	 * @generated
	 */
	Container createContainer();

	/**
	 * Returns a new object of class '<em>Paragraphe</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Paragraphe</em>'.
	 * @generated
	 */
	Paragraphe createParagraphe();

	/**
	 * Returns a new object of class '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title</em>'.
	 * @generated
	 */
	Title createTitle();

	/**
	 * Returns a new object of class '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button</em>'.
	 * @generated
	 */
	Button createButton();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image</em>'.
	 * @generated
	 */
	Image createImage();

	/**
	 * Returns a new object of class '<em>Strong</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strong</em>'.
	 * @generated
	 */
	Strong createStrong();

	/**
	 * Returns a new object of class '<em>Italic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Italic</em>'.
	 * @generated
	 */
	Italic createItalic();

	/**
	 * Returns a new object of class '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text</em>'.
	 * @generated
	 */
	Text createText();

	/**
	 * Returns a new object of class '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code</em>'.
	 * @generated
	 */
	Code createCode();

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
	 * Returns a new object of class '<em>Background Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Background Property</em>'.
	 * @generated
	 */
	BackgroundProperty createBackgroundProperty();

	/**
	 * Returns a new object of class '<em>Button Basic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Basic</em>'.
	 * @generated
	 */
	ButtonBasic createButtonBasic();

	/**
	 * Returns a new object of class '<em>Button Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button Style</em>'.
	 * @generated
	 */
	ButtonStyle createButtonStyle();

	/**
	 * Returns a new object of class '<em>Mute Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mute Link</em>'.
	 * @generated
	 */
	MuteLink createMuteLink();

	/**
	 * Returns a new object of class '<em>Button SIze</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Button SIze</em>'.
	 * @generated
	 */
	ButtonSIze createButtonSIze();

	/**
	 * Returns a new object of class '<em>Image Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Property</em>'.
	 * @generated
	 */
	ImageProperty createImageProperty();

	/**
	 * Returns a new object of class '<em>Text Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Text Modifier</em>'.
	 * @generated
	 */
	TextModifier createTextModifier();

	/**
	 * Returns a new object of class '<em>Heading Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Heading Modifier</em>'.
	 * @generated
	 */
	HeadingModifier createHeadingModifier();

	/**
	 * Returns a new object of class '<em>Title Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Title Property</em>'.
	 * @generated
	 */
	TitleProperty createTitleProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UikitPackage getUikitPackage();

} //UikitFactory
