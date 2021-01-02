/**
 */
package idm.uikit.mm.uikit.impl;

import idm.uikit.mm.uikit.Align;
import idm.uikit.mm.uikit.BackgroundProperty;
import idm.uikit.mm.uikit.Button;
import idm.uikit.mm.uikit.ButtonBasic;
import idm.uikit.mm.uikit.ButtonProperty;
import idm.uikit.mm.uikit.ButtonSIze;
import idm.uikit.mm.uikit.ButtonStyle;
import idm.uikit.mm.uikit.Code;
import idm.uikit.mm.uikit.Color;
import idm.uikit.mm.uikit.CompositeTextElement;
import idm.uikit.mm.uikit.ContainableTextElement;
import idm.uikit.mm.uikit.GeneralProperty;
import idm.uikit.mm.uikit.HeadingModifier;
import idm.uikit.mm.uikit.Image;
import idm.uikit.mm.uikit.ImageProperty;
import idm.uikit.mm.uikit.Italic;
import idm.uikit.mm.uikit.Link;
import idm.uikit.mm.uikit.LinkProperty;
import idm.uikit.mm.uikit.MargesProperty;
import idm.uikit.mm.uikit.Margin;
import idm.uikit.mm.uikit.MuteLink;
import idm.uikit.mm.uikit.Padding;
import idm.uikit.mm.uikit.Page;
import idm.uikit.mm.uikit.PageContent;
import idm.uikit.mm.uikit.Paragraphe;
import idm.uikit.mm.uikit.Property;
import idm.uikit.mm.uikit.Size;
import idm.uikit.mm.uikit.SpecificProperty;
import idm.uikit.mm.uikit.Strong;
import idm.uikit.mm.uikit.Text;
import idm.uikit.mm.uikit.TextContainable;
import idm.uikit.mm.uikit.TextContainer;
import idm.uikit.mm.uikit.TextElement;
import idm.uikit.mm.uikit.TextModifier;
import idm.uikit.mm.uikit.TextNested;
import idm.uikit.mm.uikit.TextNestedElement;
import idm.uikit.mm.uikit.TextPageContent;
import idm.uikit.mm.uikit.Title;
import idm.uikit.mm.uikit.TitleProperty;
import idm.uikit.mm.uikit.UikitFactory;
import idm.uikit.mm.uikit.UikitPackage;
import idm.uikit.mm.uikit.UrlBasedLink;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UikitPackageImpl extends EPackageImpl implements UikitPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textPageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragrapheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containableTextElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTextElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textContainableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlBasedLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass italicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textNestedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textNestedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass margesPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paddingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backgroundPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonBasicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass muteLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonSIzeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass headingModifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titlePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sizeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see idm.uikit.mm.uikit.UikitPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UikitPackageImpl() {
		super(eNS_URI, UikitFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UikitPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UikitPackage init() {
		if (isInited)
			return (UikitPackage) EPackage.Registry.INSTANCE.getEPackage(UikitPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUikitPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UikitPackageImpl theUikitPackage = registeredUikitPackage instanceof UikitPackageImpl
				? (UikitPackageImpl) registeredUikitPackage
				: new UikitPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUikitPackage.createPackageContents();

		// Initialize created meta-data
		theUikitPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUikitPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UikitPackage.eNS_URI, theUikitPackage);
		return theUikitPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Name() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Pagecontents() {
		return (EReference) pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageContent() {
		return pageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageContent_Generalproperties() {
		return (EReference) pageContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Contents() {
		return (EReference) containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextPageContent() {
		return textPageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextContainer() {
		return textContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextContainer_Textelements() {
		return (EReference) textContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextContainer_Color() {
		return (EAttribute) textContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraphe() {
		return paragrapheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitle() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitle_Level() {
		return (EAttribute) titleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitle_Titleproperties() {
		return (EReference) titleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainableTextElement() {
		return containableTextElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getButton_Buttonproperties() {
		return (EReference) buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeTextElement() {
		return compositeTextElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextContainable() {
		return textContainableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlBasedLink() {
		return urlBasedLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlBasedLink_Url() {
		return (EAttribute) urlBasedLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlBasedLink_Title() {
		return (EAttribute) urlBasedLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLink_Linkproperties() {
		return (EReference) linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImage_Imageproperties() {
		return (EReference) imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrong() {
		return strongEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItalic() {
		return italicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextElement() {
		return textElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Text() {
		return (EAttribute) textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCode() {
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextNested() {
		return textNestedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextNested_Textnestedelements() {
		return (EReference) textNestedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextNestedElement() {
		return textNestedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralProperty() {
		return generalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificProperty() {
		return specificPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMargesProperty() {
		return margesPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMargesProperty_Size() {
		return (EAttribute) margesPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMargesProperty_Align() {
		return (EAttribute) margesPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMargin() {
		return marginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPadding() {
		return paddingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackgroundProperty() {
		return backgroundPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBackgroundProperty_Color() {
		return (EAttribute) backgroundPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonProperty() {
		return buttonPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonBasic() {
		return buttonBasicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonStyle() {
		return buttonStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonStyle_Color() {
		return (EAttribute) buttonStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuteLink() {
		return muteLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkProperty() {
		return linkPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButtonSIze() {
		return buttonSIzeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButtonSIze_Size() {
		return (EAttribute) buttonSIzeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageProperty() {
		return imagePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextModifier() {
		return textModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHeadingModifier() {
		return headingModifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitleProperty() {
		return titlePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleProperty_Size() {
		return (EAttribute) titlePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSize() {
		return sizeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlign() {
		return alignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UikitFactory getUikitFactory() {
		return (UikitFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__NAME);
		createEReference(pageEClass, PAGE__PAGECONTENTS);

		pageContentEClass = createEClass(PAGE_CONTENT);
		createEReference(pageContentEClass, PAGE_CONTENT__GENERALPROPERTIES);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__CONTENTS);

		textPageContentEClass = createEClass(TEXT_PAGE_CONTENT);

		textContainerEClass = createEClass(TEXT_CONTAINER);
		createEReference(textContainerEClass, TEXT_CONTAINER__TEXTELEMENTS);
		createEAttribute(textContainerEClass, TEXT_CONTAINER__COLOR);

		paragrapheEClass = createEClass(PARAGRAPHE);

		titleEClass = createEClass(TITLE);
		createEAttribute(titleEClass, TITLE__LEVEL);
		createEReference(titleEClass, TITLE__TITLEPROPERTIES);

		containableTextElementEClass = createEClass(CONTAINABLE_TEXT_ELEMENT);

		buttonEClass = createEClass(BUTTON);
		createEReference(buttonEClass, BUTTON__BUTTONPROPERTIES);

		compositeTextElementEClass = createEClass(COMPOSITE_TEXT_ELEMENT);

		textContainableEClass = createEClass(TEXT_CONTAINABLE);

		urlBasedLinkEClass = createEClass(URL_BASED_LINK);
		createEAttribute(urlBasedLinkEClass, URL_BASED_LINK__URL);
		createEAttribute(urlBasedLinkEClass, URL_BASED_LINK__TITLE);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__LINKPROPERTIES);

		imageEClass = createEClass(IMAGE);
		createEReference(imageEClass, IMAGE__IMAGEPROPERTIES);

		strongEClass = createEClass(STRONG);

		italicEClass = createEClass(ITALIC);

		textElementEClass = createEClass(TEXT_ELEMENT);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT);

		codeEClass = createEClass(CODE);

		textNestedEClass = createEClass(TEXT_NESTED);
		createEReference(textNestedEClass, TEXT_NESTED__TEXTNESTEDELEMENTS);

		textNestedElementEClass = createEClass(TEXT_NESTED_ELEMENT);

		propertyEClass = createEClass(PROPERTY);

		generalPropertyEClass = createEClass(GENERAL_PROPERTY);

		specificPropertyEClass = createEClass(SPECIFIC_PROPERTY);

		margesPropertyEClass = createEClass(MARGES_PROPERTY);
		createEAttribute(margesPropertyEClass, MARGES_PROPERTY__SIZE);
		createEAttribute(margesPropertyEClass, MARGES_PROPERTY__ALIGN);

		marginEClass = createEClass(MARGIN);

		paddingEClass = createEClass(PADDING);

		backgroundPropertyEClass = createEClass(BACKGROUND_PROPERTY);
		createEAttribute(backgroundPropertyEClass, BACKGROUND_PROPERTY__COLOR);

		buttonPropertyEClass = createEClass(BUTTON_PROPERTY);

		buttonBasicEClass = createEClass(BUTTON_BASIC);

		buttonStyleEClass = createEClass(BUTTON_STYLE);
		createEAttribute(buttonStyleEClass, BUTTON_STYLE__COLOR);

		muteLinkEClass = createEClass(MUTE_LINK);

		linkPropertyEClass = createEClass(LINK_PROPERTY);

		buttonSIzeEClass = createEClass(BUTTON_SIZE);
		createEAttribute(buttonSIzeEClass, BUTTON_SIZE__SIZE);

		imagePropertyEClass = createEClass(IMAGE_PROPERTY);

		textModifierEClass = createEClass(TEXT_MODIFIER);

		headingModifierEClass = createEClass(HEADING_MODIFIER);

		titlePropertyEClass = createEClass(TITLE_PROPERTY);
		createEAttribute(titlePropertyEClass, TITLE_PROPERTY__SIZE);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		sizeEEnum = createEEnum(SIZE);
		alignEEnum = createEEnum(ALIGN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerEClass.getESuperTypes().add(this.getPageContent());
		textPageContentEClass.getESuperTypes().add(this.getPageContent());
		textContainerEClass.getESuperTypes().add(this.getTextPageContent());
		paragrapheEClass.getESuperTypes().add(this.getTextContainer());
		titleEClass.getESuperTypes().add(this.getTextContainer());
		containableTextElementEClass.getESuperTypes().add(this.getTextPageContent());
		containableTextElementEClass.getESuperTypes().add(this.getTextElement());
		buttonEClass.getESuperTypes().add(this.getContainableTextElement());
		buttonEClass.getESuperTypes().add(this.getTextNested());
		compositeTextElementEClass.getESuperTypes().add(this.getContainableTextElement());
		textContainableEClass.getESuperTypes().add(this.getContainableTextElement());
		textContainableEClass.getESuperTypes().add(this.getTextNestedElement());
		textContainableEClass.getESuperTypes().add(this.getTextNested());
		urlBasedLinkEClass.getESuperTypes().add(this.getCompositeTextElement());
		linkEClass.getESuperTypes().add(this.getUrlBasedLink());
		linkEClass.getESuperTypes().add(this.getTextNested());
		imageEClass.getESuperTypes().add(this.getUrlBasedLink());
		strongEClass.getESuperTypes().add(this.getTextContainable());
		italicEClass.getESuperTypes().add(this.getTextContainable());
		textEClass.getESuperTypes().add(this.getTextElement());
		textEClass.getESuperTypes().add(this.getTextNestedElement());
		codeEClass.getESuperTypes().add(this.getText());
		generalPropertyEClass.getESuperTypes().add(this.getProperty());
		specificPropertyEClass.getESuperTypes().add(this.getProperty());
		margesPropertyEClass.getESuperTypes().add(this.getGeneralProperty());
		marginEClass.getESuperTypes().add(this.getMargesProperty());
		paddingEClass.getESuperTypes().add(this.getMargesProperty());
		backgroundPropertyEClass.getESuperTypes().add(this.getGeneralProperty());
		buttonPropertyEClass.getESuperTypes().add(this.getSpecificProperty());
		buttonBasicEClass.getESuperTypes().add(this.getButtonProperty());
		buttonStyleEClass.getESuperTypes().add(this.getButtonProperty());
		muteLinkEClass.getESuperTypes().add(this.getLinkProperty());
		linkPropertyEClass.getESuperTypes().add(this.getSpecificProperty());
		buttonSIzeEClass.getESuperTypes().add(this.getButtonProperty());
		imagePropertyEClass.getESuperTypes().add(this.getSpecificProperty());
		textModifierEClass.getESuperTypes().add(this.getLinkProperty());
		headingModifierEClass.getESuperTypes().add(this.getLinkProperty());
		titlePropertyEClass.getESuperTypes().add(this.getSpecificProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Pagecontents(), this.getPageContent(), null, "pagecontents", null, 0, -1, Page.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageContentEClass, PageContent.class, "PageContent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageContent_Generalproperties(), this.getGeneralProperty(), null, "generalproperties", null,
				0, -1, PageContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, idm.uikit.mm.uikit.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Contents(), this.getPageContent(), null, "contents", null, 0, -1,
				idm.uikit.mm.uikit.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textPageContentEClass, TextPageContent.class, "TextPageContent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(textContainerEClass, TextContainer.class, "TextContainer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextContainer_Textelements(), this.getTextElement(), null, "textelements", null, 0, -1,
				TextContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextContainer_Color(), this.getColor(), "color", null, 0, 1, TextContainer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragrapheEClass, Paragraphe.class, "Paragraphe", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitle_Level(), ecorePackage.getEInt(), "level", null, 0, 1, Title.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTitle_Titleproperties(), this.getTitleProperty(), null, "titleproperties", null, 0, -1,
				Title.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containableTextElementEClass, ContainableTextElement.class, "ContainableTextElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getButton_Buttonproperties(), this.getButtonProperty(), null, "buttonproperties", null, 0, -1,
				Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeTextElementEClass, CompositeTextElement.class, "CompositeTextElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textContainableEClass, TextContainable.class, "TextContainable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(urlBasedLinkEClass, UrlBasedLink.class, "UrlBasedLink", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrlBasedLink_Url(), ecorePackage.getEString(), "url", null, 0, 1, UrlBasedLink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlBasedLink_Title(), ecorePackage.getEString(), "title", null, 0, 1, UrlBasedLink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Linkproperties(), this.getLinkProperty(), null, "linkproperties", null, 0, -1,
				Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImage_Imageproperties(), this.getImageProperty(), null, "imageproperties", null, 0, -1,
				Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strongEClass, Strong.class, "Strong", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(italicEClass, Italic.class, "Italic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textElementEClass, TextElement.class, "TextElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(textNestedEClass, TextNested.class, "TextNested", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextNested_Textnestedelements(), this.getTextNestedElement(), null, "textnestedelements",
				null, 0, -1, TextNested.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textNestedElementEClass, TextNestedElement.class, "TextNestedElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(generalPropertyEClass, GeneralProperty.class, "GeneralProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificPropertyEClass, SpecificProperty.class, "SpecificProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(margesPropertyEClass, MargesProperty.class, "MargesProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMargesProperty_Size(), this.getSize(), "size", null, 0, 1, MargesProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMargesProperty_Align(), this.getAlign(), "align", "CENTER", 0, 1, MargesProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(marginEClass, Margin.class, "Margin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paddingEClass, Padding.class, "Padding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(backgroundPropertyEClass, BackgroundProperty.class, "BackgroundProperty", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBackgroundProperty_Color(), this.getColor(), "color", null, 0, 1, BackgroundProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buttonPropertyEClass, ButtonProperty.class, "ButtonProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonBasicEClass, ButtonBasic.class, "ButtonBasic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonStyleEClass, ButtonStyle.class, "ButtonStyle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonStyle_Color(), this.getColor(), "color", null, 0, 1, ButtonStyle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(muteLinkEClass, MuteLink.class, "MuteLink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkPropertyEClass, LinkProperty.class, "LinkProperty", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(buttonSIzeEClass, ButtonSIze.class, "ButtonSIze", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButtonSIze_Size(), this.getSize(), "size", null, 0, 1, ButtonSIze.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagePropertyEClass, ImageProperty.class, "ImageProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(textModifierEClass, TextModifier.class, "TextModifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(headingModifierEClass, HeadingModifier.class, "HeadingModifier", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(titlePropertyEClass, TitleProperty.class, "TitleProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitleProperty_Size(), this.getSize(), "size", null, 0, 1, TitleProperty.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.MUTED);
		addEEnumLiteral(colorEEnum, Color.EMPHASIS);
		addEEnumLiteral(colorEEnum, Color.PRIMARY);
		addEEnumLiteral(colorEEnum, Color.SECONDARY);
		addEEnumLiteral(colorEEnum, Color.SUCCESS);
		addEEnumLiteral(colorEEnum, Color.WARNING);
		addEEnumLiteral(colorEEnum, Color.DANGER);

		initEEnum(sizeEEnum, Size.class, "Size");
		addEEnumLiteral(sizeEEnum, Size.DEFAULT);
		addEEnumLiteral(sizeEEnum, Size.SMALL);
		addEEnumLiteral(sizeEEnum, Size.LARGE);

		initEEnum(alignEEnum, Align.class, "Align");
		addEEnumLiteral(alignEEnum, Align.LEFT);
		addEEnumLiteral(alignEEnum, Align.RIGHT);
		addEEnumLiteral(alignEEnum, Align.TOP);
		addEEnumLiteral(alignEEnum, Align.BOTTOM);
		addEEnumLiteral(alignEEnum, Align.CENTER);

		// Create resource
		createResource(eNS_URI);
	}

} //UikitPackageImpl
