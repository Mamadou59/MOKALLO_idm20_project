/**
 */
package idm.uikit.mm.uikit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see idm.uikit.mm.uikit.UikitFactory
 * @model kind="package"
 * @generated
 */
public interface UikitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uikit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/uikit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uikit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UikitPackage eINSTANCE = idm.uikit.mm.uikit.impl.UikitPackageImpl.init();

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.PageImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGECONTENTS = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.PageContentImpl <em>Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.PageContentImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getPageContent()
	 * @generated
	 */
	int PAGE_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ContainerImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTENTS = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.TextPageContentImpl <em>Text Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.TextPageContentImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextPageContent()
	 * @generated
	 */
	int TEXT_PAGE_CONTENT = 3;

	/**
	 * The number of structural features of the '<em>Text Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PAGE_CONTENT_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PAGE_CONTENT_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.TextContainerImpl <em>Text Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.TextContainerImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextContainer()
	 * @generated
	 */
	int TEXT_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__TEXTELEMENTS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ParagrapheImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getParagraphe()
	 * @generated
	 */
	int PARAGRAPHE = 5;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__TEXTELEMENTS = TEXT_CONTAINER__TEXTELEMENTS;

	/**
	 * The number of structural features of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.TitleImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 6;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TEXTELEMENTS = TEXT_CONTAINER__TEXTELEMENTS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__LEVEL = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ContainableTextElementImpl <em>Containable Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ContainableTextElementImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getContainableTextElement()
	 * @generated
	 */
	int CONTAINABLE_TEXT_ELEMENT = 7;

	/**
	 * The number of structural features of the '<em>Containable Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Containable Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ButtonImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 8;

	/**
	 * The feature id for the '<em><b>Testnestedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TESTNESTEDELEMENTS = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.CompositeTextElementImpl <em>Composite Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.CompositeTextElementImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getCompositeTextElement()
	 * @generated
	 */
	int COMPOSITE_TEXT_ELEMENT = 9;

	/**
	 * The number of structural features of the '<em>Composite Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composite Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT = CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.TextContainableImpl <em>Text Containable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.TextContainableImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextContainable()
	 * @generated
	 */
	int TEXT_CONTAINABLE = 10;

	/**
	 * The number of structural features of the '<em>Text Containable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINABLE_FEATURE_COUNT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Containable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINABLE_OPERATION_COUNT = CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.UrlBasedLinkImpl <em>Url Based Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.UrlBasedLinkImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getUrlBasedLink()
	 * @generated
	 */
	int URL_BASED_LINK = 11;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__URL = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__TITLE = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Url Based Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK_FEATURE_COUNT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Url Based Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK_OPERATION_COUNT = COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.LinkImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 12;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__URL = URL_BASED_LINK__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TITLE = URL_BASED_LINK__TITLE;

	/**
	 * The feature id for the '<em><b>Testnestedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TESTNESTEDELEMENTS = URL_BASED_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = URL_BASED_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = URL_BASED_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ImageImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 13;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__URL = URL_BASED_LINK__URL;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__TITLE = URL_BASED_LINK__TITLE;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = URL_BASED_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = URL_BASED_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.StrongImpl <em>Strong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.StrongImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getStrong()
	 * @generated
	 */
	int STRONG = 14;

	/**
	 * The number of structural features of the '<em>Strong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_FEATURE_COUNT = TEXT_CONTAINABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strong</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_OPERATION_COUNT = TEXT_CONTAINABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ItalicImpl <em>Italic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ItalicImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getItalic()
	 * @generated
	 */
	int ITALIC = 15;

	/**
	 * The number of structural features of the '<em>Italic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_FEATURE_COUNT = TEXT_CONTAINABLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Italic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_OPERATION_COUNT = TEXT_CONTAINABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.TextElement <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.TextElement
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 16;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.TextImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 17;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.CodeImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 18;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__TEXT = TEXT__TEXT;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = TEXT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = TEXT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.TextNested <em>Text Nested</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.TextNested
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextNested()
	 * @generated
	 */
	int TEXT_NESTED = 19;

	/**
	 * The feature id for the '<em><b>Testnestedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NESTED__TESTNESTEDELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Text Nested</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NESTED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Text Nested</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NESTED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.TextNestedElement <em>Text Nested Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.TextNestedElement
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextNestedElement()
	 * @generated
	 */
	int TEXT_NESTED_ELEMENT = 20;

	/**
	 * The number of structural features of the '<em>Text Nested Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NESTED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Nested Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NESTED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see idm.uikit.mm.uikit.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.uikit.mm.uikit.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.uikit.mm.uikit.Page#getPagecontents <em>Pagecontents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagecontents</em>'.
	 * @see idm.uikit.mm.uikit.Page#getPagecontents()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Pagecontents();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Content</em>'.
	 * @see idm.uikit.mm.uikit.PageContent
	 * @generated
	 */
	EClass getPageContent();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see idm.uikit.mm.uikit.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.uikit.mm.uikit.Container#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see idm.uikit.mm.uikit.Container#getContents()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Contents();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.TextPageContent <em>Text Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Page Content</em>'.
	 * @see idm.uikit.mm.uikit.TextPageContent
	 * @generated
	 */
	EClass getTextPageContent();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Container</em>'.
	 * @see idm.uikit.mm.uikit.TextContainer
	 * @generated
	 */
	EClass getTextContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.uikit.mm.uikit.TextContainer#getTextelements <em>Textelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textelements</em>'.
	 * @see idm.uikit.mm.uikit.TextContainer#getTextelements()
	 * @see #getTextContainer()
	 * @generated
	 */
	EReference getTextContainer_Textelements();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraphe</em>'.
	 * @see idm.uikit.mm.uikit.Paragraphe
	 * @generated
	 */
	EClass getParagraphe();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see idm.uikit.mm.uikit.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.Title#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see idm.uikit.mm.uikit.Title#getLevel()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Level();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.ContainableTextElement <em>Containable Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable Text Element</em>'.
	 * @see idm.uikit.mm.uikit.ContainableTextElement
	 * @generated
	 */
	EClass getContainableTextElement();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see idm.uikit.mm.uikit.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.CompositeTextElement <em>Composite Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Text Element</em>'.
	 * @see idm.uikit.mm.uikit.CompositeTextElement
	 * @generated
	 */
	EClass getCompositeTextElement();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.TextContainable <em>Text Containable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Containable</em>'.
	 * @see idm.uikit.mm.uikit.TextContainable
	 * @generated
	 */
	EClass getTextContainable();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.UrlBasedLink <em>Url Based Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Based Link</em>'.
	 * @see idm.uikit.mm.uikit.UrlBasedLink
	 * @generated
	 */
	EClass getUrlBasedLink();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.UrlBasedLink#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see idm.uikit.mm.uikit.UrlBasedLink#getUrl()
	 * @see #getUrlBasedLink()
	 * @generated
	 */
	EAttribute getUrlBasedLink_Url();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.UrlBasedLink#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see idm.uikit.mm.uikit.UrlBasedLink#getTitle()
	 * @see #getUrlBasedLink()
	 * @generated
	 */
	EAttribute getUrlBasedLink_Title();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see idm.uikit.mm.uikit.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see idm.uikit.mm.uikit.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Strong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong</em>'.
	 * @see idm.uikit.mm.uikit.Strong
	 * @generated
	 */
	EClass getStrong();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Italic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic</em>'.
	 * @see idm.uikit.mm.uikit.Italic
	 * @generated
	 */
	EClass getItalic();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see idm.uikit.mm.uikit.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see idm.uikit.mm.uikit.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see idm.uikit.mm.uikit.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see idm.uikit.mm.uikit.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.TextNested <em>Text Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Nested</em>'.
	 * @see idm.uikit.mm.uikit.TextNested
	 * @generated
	 */
	EClass getTextNested();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.uikit.mm.uikit.TextNested#getTestnestedelements <em>Testnestedelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Testnestedelements</em>'.
	 * @see idm.uikit.mm.uikit.TextNested#getTestnestedelements()
	 * @see #getTextNested()
	 * @generated
	 */
	EReference getTextNested_Testnestedelements();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.TextNestedElement <em>Text Nested Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Nested Element</em>'.
	 * @see idm.uikit.mm.uikit.TextNestedElement
	 * @generated
	 */
	EClass getTextNestedElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UikitFactory getUikitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.PageImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '<em><b>Pagecontents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGECONTENTS = eINSTANCE.getPage_Pagecontents();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.PageContentImpl <em>Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.PageContentImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getPageContent()
		 * @generated
		 */
		EClass PAGE_CONTENT = eINSTANCE.getPageContent();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ContainerImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTENTS = eINSTANCE.getContainer_Contents();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.TextPageContentImpl <em>Text Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.TextPageContentImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextPageContent()
		 * @generated
		 */
		EClass TEXT_PAGE_CONTENT = eINSTANCE.getTextPageContent();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.TextContainerImpl <em>Text Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.TextContainerImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextContainer()
		 * @generated
		 */
		EClass TEXT_CONTAINER = eINSTANCE.getTextContainer();

		/**
		 * The meta object literal for the '<em><b>Textelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CONTAINER__TEXTELEMENTS = eINSTANCE.getTextContainer_Textelements();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ParagrapheImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getParagraphe()
		 * @generated
		 */
		EClass PARAGRAPHE = eINSTANCE.getParagraphe();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.TitleImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTitle()
		 * @generated
		 */
		EClass TITLE = eINSTANCE.getTitle();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE__LEVEL = eINSTANCE.getTitle_Level();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ContainableTextElementImpl <em>Containable Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ContainableTextElementImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getContainableTextElement()
		 * @generated
		 */
		EClass CONTAINABLE_TEXT_ELEMENT = eINSTANCE.getContainableTextElement();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ButtonImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.CompositeTextElementImpl <em>Composite Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.CompositeTextElementImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getCompositeTextElement()
		 * @generated
		 */
		EClass COMPOSITE_TEXT_ELEMENT = eINSTANCE.getCompositeTextElement();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.TextContainableImpl <em>Text Containable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.TextContainableImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextContainable()
		 * @generated
		 */
		EClass TEXT_CONTAINABLE = eINSTANCE.getTextContainable();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.UrlBasedLinkImpl <em>Url Based Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.UrlBasedLinkImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getUrlBasedLink()
		 * @generated
		 */
		EClass URL_BASED_LINK = eINSTANCE.getUrlBasedLink();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_BASED_LINK__URL = eINSTANCE.getUrlBasedLink_Url();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute URL_BASED_LINK__TITLE = eINSTANCE.getUrlBasedLink_Title();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.LinkImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ImageImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.StrongImpl <em>Strong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.StrongImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getStrong()
		 * @generated
		 */
		EClass STRONG = eINSTANCE.getStrong();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ItalicImpl <em>Italic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ItalicImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getItalic()
		 * @generated
		 */
		EClass ITALIC = eINSTANCE.getItalic();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.TextElement <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.TextElement
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.TextImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__TEXT = eINSTANCE.getText_Text();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.CodeImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.TextNested <em>Text Nested</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.TextNested
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextNested()
		 * @generated
		 */
		EClass TEXT_NESTED = eINSTANCE.getTextNested();

		/**
		 * The meta object literal for the '<em><b>Testnestedelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_NESTED__TESTNESTEDELEMENTS = eINSTANCE.getTextNested_Testnestedelements();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.TextNestedElement <em>Text Nested Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.TextNestedElement
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextNestedElement()
		 * @generated
		 */
		EClass TEXT_NESTED_ELEMENT = eINSTANCE.getTextNestedElement();

	}

} //UikitPackage
