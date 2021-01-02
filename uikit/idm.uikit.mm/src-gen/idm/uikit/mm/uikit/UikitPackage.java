/**
 */
package idm.uikit.mm.uikit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT__GENERALPROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERALPROPERTIES = PAGE_CONTENT__GENERALPROPERTIES;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PAGE_CONTENT__GENERALPROPERTIES = PAGE_CONTENT__GENERALPROPERTIES;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__GENERALPROPERTIES = TEXT_PAGE_CONTENT__GENERALPROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__TEXTELEMENTS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__COLOR = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__GENERALPROPERTIES = TEXT_CONTAINER__GENERALPROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__TEXTELEMENTS = TEXT_CONTAINER__TEXTELEMENTS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__COLOR = TEXT_CONTAINER__COLOR;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__GENERALPROPERTIES = TEXT_CONTAINER__GENERALPROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TEXTELEMENTS = TEXT_CONTAINER__TEXTELEMENTS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__COLOR = TEXT_CONTAINER__COLOR;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__LEVEL = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Titleproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TITLEPROPERTIES = TEXT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT__GENERALPROPERTIES = TEXT_PAGE_CONTENT__GENERALPROPERTIES;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__GENERALPROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERALPROPERTIES;

	/**
	 * The feature id for the '<em><b>Textnestedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXTNESTEDELEMENTS = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buttonproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BUTTONPROPERTIES = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT__GENERALPROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERALPROPERTIES;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINABLE__GENERALPROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERALPROPERTIES;

	/**
	 * The feature id for the '<em><b>Textnestedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINABLE__TEXTNESTEDELEMENTS = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Containable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINABLE_FEATURE_COUNT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__GENERALPROPERTIES = COMPOSITE_TEXT_ELEMENT__GENERALPROPERTIES;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__GENERALPROPERTIES = URL_BASED_LINK__GENERALPROPERTIES;

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
	 * The feature id for the '<em><b>Textnestedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TEXTNESTEDELEMENTS = URL_BASED_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linkproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINKPROPERTIES = URL_BASED_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = URL_BASED_LINK_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__GENERALPROPERTIES = URL_BASED_LINK__GENERALPROPERTIES;

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
	 * The feature id for the '<em><b>Imageproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__IMAGEPROPERTIES = URL_BASED_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = URL_BASED_LINK_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__GENERALPROPERTIES = TEXT_CONTAINABLE__GENERALPROPERTIES;

	/**
	 * The feature id for the '<em><b>Textnestedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__TEXTNESTEDELEMENTS = TEXT_CONTAINABLE__TEXTNESTEDELEMENTS;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC__GENERALPROPERTIES = TEXT_CONTAINABLE__GENERALPROPERTIES;

	/**
	 * The feature id for the '<em><b>Textnestedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC__TEXTNESTEDELEMENTS = TEXT_CONTAINABLE__TEXTNESTEDELEMENTS;

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
	 * The feature id for the '<em><b>Textnestedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_NESTED__TEXTNESTEDELEMENTS = 0;

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
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.PropertyImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 21;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.GeneralPropertyImpl <em>General Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.GeneralPropertyImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getGeneralProperty()
	 * @generated
	 */
	int GENERAL_PROPERTY = 22;

	/**
	 * The number of structural features of the '<em>General Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.SpecificPropertyImpl <em>Specific Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.SpecificPropertyImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getSpecificProperty()
	 * @generated
	 */
	int SPECIFIC_PROPERTY = 23;

	/**
	 * The number of structural features of the '<em>Specific Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_PROPERTY_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Specific Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_PROPERTY_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.MargesPropertyImpl <em>Marges Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.MargesPropertyImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getMargesProperty()
	 * @generated
	 */
	int MARGES_PROPERTY = 24;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY__SIZE = GENERAL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY__ALIGN = GENERAL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Marges Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY_FEATURE_COUNT = GENERAL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Marges Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY_OPERATION_COUNT = GENERAL_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.MarginImpl <em>Margin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.MarginImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getMargin()
	 * @generated
	 */
	int MARGIN = 25;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__SIZE = MARGES_PROPERTY__SIZE;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__ALIGN = MARGES_PROPERTY__ALIGN;

	/**
	 * The number of structural features of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_FEATURE_COUNT = MARGES_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Margin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN_OPERATION_COUNT = MARGES_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.PaddingImpl <em>Padding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.PaddingImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getPadding()
	 * @generated
	 */
	int PADDING = 26;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING__SIZE = MARGES_PROPERTY__SIZE;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING__ALIGN = MARGES_PROPERTY__ALIGN;

	/**
	 * The number of structural features of the '<em>Padding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING_FEATURE_COUNT = MARGES_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Padding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING_OPERATION_COUNT = MARGES_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.BackgroundPropertyImpl <em>Background Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.BackgroundPropertyImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getBackgroundProperty()
	 * @generated
	 */
	int BACKGROUND_PROPERTY = 27;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_PROPERTY__COLOR = GENERAL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Background Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_PROPERTY_FEATURE_COUNT = GENERAL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Background Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_PROPERTY_OPERATION_COUNT = GENERAL_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ButtonPropertyImpl <em>Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ButtonPropertyImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getButtonProperty()
	 * @generated
	 */
	int BUTTON_PROPERTY = 28;

	/**
	 * The number of structural features of the '<em>Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PROPERTY_FEATURE_COUNT = SPECIFIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PROPERTY_OPERATION_COUNT = SPECIFIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ButtonBasicImpl <em>Button Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ButtonBasicImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getButtonBasic()
	 * @generated
	 */
	int BUTTON_BASIC = 29;

	/**
	 * The number of structural features of the '<em>Button Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BASIC_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_BASIC_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ButtonStyleImpl <em>Button Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ButtonStyleImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getButtonStyle()
	 * @generated
	 */
	int BUTTON_STYLE = 30;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE__COLOR = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.LinkPropertyImpl <em>Link Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.LinkPropertyImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getLinkProperty()
	 * @generated
	 */
	int LINK_PROPERTY = 32;

	/**
	 * The number of structural features of the '<em>Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_FEATURE_COUNT = SPECIFIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_OPERATION_COUNT = SPECIFIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.MuteLinkImpl <em>Mute Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.MuteLinkImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getMuteLink()
	 * @generated
	 */
	int MUTE_LINK = 31;

	/**
	 * The number of structural features of the '<em>Mute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LINK_FEATURE_COUNT = LINK_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mute Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTE_LINK_OPERATION_COUNT = LINK_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ButtonSIzeImpl <em>Button SIze</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ButtonSIzeImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getButtonSIze()
	 * @generated
	 */
	int BUTTON_SIZE = 33;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SIZE__SIZE = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button SIze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SIZE_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button SIze</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SIZE_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.ImagePropertyImpl <em>Image Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.ImagePropertyImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getImageProperty()
	 * @generated
	 */
	int IMAGE_PROPERTY = 34;

	/**
	 * The number of structural features of the '<em>Image Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROPERTY_FEATURE_COUNT = SPECIFIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROPERTY_OPERATION_COUNT = SPECIFIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.TextModifierImpl <em>Text Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.TextModifierImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextModifier()
	 * @generated
	 */
	int TEXT_MODIFIER = 35;

	/**
	 * The number of structural features of the '<em>Text Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MODIFIER_FEATURE_COUNT = LINK_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_MODIFIER_OPERATION_COUNT = LINK_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.HeadingModifierImpl <em>Heading Modifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.HeadingModifierImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getHeadingModifier()
	 * @generated
	 */
	int HEADING_MODIFIER = 36;

	/**
	 * The number of structural features of the '<em>Heading Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_MODIFIER_FEATURE_COUNT = LINK_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Heading Modifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADING_MODIFIER_OPERATION_COUNT = LINK_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.impl.TitlePropertyImpl <em>Title Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.impl.TitlePropertyImpl
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTitleProperty()
	 * @generated
	 */
	int TITLE_PROPERTY = 37;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_PROPERTY__SIZE = SPECIFIC_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Title Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_PROPERTY_FEATURE_COUNT = SPECIFIC_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Title Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_PROPERTY_OPERATION_COUNT = SPECIFIC_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.Color
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 38;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.Size
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 39;

	/**
	 * The meta object id for the '{@link idm.uikit.mm.uikit.Align <em>Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.uikit.mm.uikit.Align
	 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getAlign()
	 * @generated
	 */
	int ALIGN = 40;

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
	 * Returns the meta object for the containment reference list '{@link idm.uikit.mm.uikit.PageContent#getGeneralproperties <em>Generalproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalproperties</em>'.
	 * @see idm.uikit.mm.uikit.PageContent#getGeneralproperties()
	 * @see #getPageContent()
	 * @generated
	 */
	EReference getPageContent_Generalproperties();

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
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.TextContainer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see idm.uikit.mm.uikit.TextContainer#getColor()
	 * @see #getTextContainer()
	 * @generated
	 */
	EAttribute getTextContainer_Color();

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
	 * Returns the meta object for the containment reference list '{@link idm.uikit.mm.uikit.Title#getTitleproperties <em>Titleproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Titleproperties</em>'.
	 * @see idm.uikit.mm.uikit.Title#getTitleproperties()
	 * @see #getTitle()
	 * @generated
	 */
	EReference getTitle_Titleproperties();

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
	 * Returns the meta object for the containment reference list '{@link idm.uikit.mm.uikit.Button#getButtonproperties <em>Buttonproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttonproperties</em>'.
	 * @see idm.uikit.mm.uikit.Button#getButtonproperties()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Buttonproperties();

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
	 * Returns the meta object for the containment reference list '{@link idm.uikit.mm.uikit.Link#getLinkproperties <em>Linkproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linkproperties</em>'.
	 * @see idm.uikit.mm.uikit.Link#getLinkproperties()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Linkproperties();

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
	 * Returns the meta object for the containment reference list '{@link idm.uikit.mm.uikit.Image#getImageproperties <em>Imageproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imageproperties</em>'.
	 * @see idm.uikit.mm.uikit.Image#getImageproperties()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Imageproperties();

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
	 * Returns the meta object for the containment reference list '{@link idm.uikit.mm.uikit.TextNested#getTextnestedelements <em>Textnestedelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textnestedelements</em>'.
	 * @see idm.uikit.mm.uikit.TextNested#getTextnestedelements()
	 * @see #getTextNested()
	 * @generated
	 */
	EReference getTextNested_Textnestedelements();

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
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see idm.uikit.mm.uikit.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.GeneralProperty <em>General Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Property</em>'.
	 * @see idm.uikit.mm.uikit.GeneralProperty
	 * @generated
	 */
	EClass getGeneralProperty();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.SpecificProperty <em>Specific Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Property</em>'.
	 * @see idm.uikit.mm.uikit.SpecificProperty
	 * @generated
	 */
	EClass getSpecificProperty();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.MargesProperty <em>Marges Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marges Property</em>'.
	 * @see idm.uikit.mm.uikit.MargesProperty
	 * @generated
	 */
	EClass getMargesProperty();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.MargesProperty#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see idm.uikit.mm.uikit.MargesProperty#getSize()
	 * @see #getMargesProperty()
	 * @generated
	 */
	EAttribute getMargesProperty_Size();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.MargesProperty#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see idm.uikit.mm.uikit.MargesProperty#getAlign()
	 * @see #getMargesProperty()
	 * @generated
	 */
	EAttribute getMargesProperty_Align();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Margin</em>'.
	 * @see idm.uikit.mm.uikit.Margin
	 * @generated
	 */
	EClass getMargin();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.Padding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Padding</em>'.
	 * @see idm.uikit.mm.uikit.Padding
	 * @generated
	 */
	EClass getPadding();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.BackgroundProperty <em>Background Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Property</em>'.
	 * @see idm.uikit.mm.uikit.BackgroundProperty
	 * @generated
	 */
	EClass getBackgroundProperty();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.BackgroundProperty#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see idm.uikit.mm.uikit.BackgroundProperty#getColor()
	 * @see #getBackgroundProperty()
	 * @generated
	 */
	EAttribute getBackgroundProperty_Color();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.ButtonProperty <em>Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Property</em>'.
	 * @see idm.uikit.mm.uikit.ButtonProperty
	 * @generated
	 */
	EClass getButtonProperty();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.ButtonBasic <em>Button Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Basic</em>'.
	 * @see idm.uikit.mm.uikit.ButtonBasic
	 * @generated
	 */
	EClass getButtonBasic();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.ButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Style</em>'.
	 * @see idm.uikit.mm.uikit.ButtonStyle
	 * @generated
	 */
	EClass getButtonStyle();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.ButtonStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see idm.uikit.mm.uikit.ButtonStyle#getColor()
	 * @see #getButtonStyle()
	 * @generated
	 */
	EAttribute getButtonStyle_Color();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.MuteLink <em>Mute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mute Link</em>'.
	 * @see idm.uikit.mm.uikit.MuteLink
	 * @generated
	 */
	EClass getMuteLink();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.LinkProperty <em>Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Property</em>'.
	 * @see idm.uikit.mm.uikit.LinkProperty
	 * @generated
	 */
	EClass getLinkProperty();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.ButtonSIze <em>Button SIze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button SIze</em>'.
	 * @see idm.uikit.mm.uikit.ButtonSIze
	 * @generated
	 */
	EClass getButtonSIze();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.ButtonSIze#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see idm.uikit.mm.uikit.ButtonSIze#getSize()
	 * @see #getButtonSIze()
	 * @generated
	 */
	EAttribute getButtonSIze_Size();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.ImageProperty <em>Image Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Property</em>'.
	 * @see idm.uikit.mm.uikit.ImageProperty
	 * @generated
	 */
	EClass getImageProperty();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.TextModifier <em>Text Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Modifier</em>'.
	 * @see idm.uikit.mm.uikit.TextModifier
	 * @generated
	 */
	EClass getTextModifier();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.HeadingModifier <em>Heading Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading Modifier</em>'.
	 * @see idm.uikit.mm.uikit.HeadingModifier
	 * @generated
	 */
	EClass getHeadingModifier();

	/**
	 * Returns the meta object for class '{@link idm.uikit.mm.uikit.TitleProperty <em>Title Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Property</em>'.
	 * @see idm.uikit.mm.uikit.TitleProperty
	 * @generated
	 */
	EClass getTitleProperty();

	/**
	 * Returns the meta object for the attribute '{@link idm.uikit.mm.uikit.TitleProperty#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see idm.uikit.mm.uikit.TitleProperty#getSize()
	 * @see #getTitleProperty()
	 * @generated
	 */
	EAttribute getTitleProperty_Size();

	/**
	 * Returns the meta object for enum '{@link idm.uikit.mm.uikit.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see idm.uikit.mm.uikit.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link idm.uikit.mm.uikit.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see idm.uikit.mm.uikit.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link idm.uikit.mm.uikit.Align <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align</em>'.
	 * @see idm.uikit.mm.uikit.Align
	 * @generated
	 */
	EEnum getAlign();

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
		 * The meta object literal for the '<em><b>Generalproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTENT__GENERALPROPERTIES = eINSTANCE.getPageContent_Generalproperties();

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
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTAINER__COLOR = eINSTANCE.getTextContainer_Color();

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
		 * The meta object literal for the '<em><b>Titleproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__TITLEPROPERTIES = eINSTANCE.getTitle_Titleproperties();

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
		 * The meta object literal for the '<em><b>Buttonproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUTTON__BUTTONPROPERTIES = eINSTANCE.getButton_Buttonproperties();

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
		 * The meta object literal for the '<em><b>Linkproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LINKPROPERTIES = eINSTANCE.getLink_Linkproperties();

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
		 * The meta object literal for the '<em><b>Imageproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE__IMAGEPROPERTIES = eINSTANCE.getImage_Imageproperties();

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
		 * The meta object literal for the '<em><b>Textnestedelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_NESTED__TEXTNESTEDELEMENTS = eINSTANCE.getTextNested_Textnestedelements();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.TextNestedElement <em>Text Nested Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.TextNestedElement
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextNestedElement()
		 * @generated
		 */
		EClass TEXT_NESTED_ELEMENT = eINSTANCE.getTextNestedElement();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.PropertyImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.GeneralPropertyImpl <em>General Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.GeneralPropertyImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getGeneralProperty()
		 * @generated
		 */
		EClass GENERAL_PROPERTY = eINSTANCE.getGeneralProperty();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.SpecificPropertyImpl <em>Specific Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.SpecificPropertyImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getSpecificProperty()
		 * @generated
		 */
		EClass SPECIFIC_PROPERTY = eINSTANCE.getSpecificProperty();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.MargesPropertyImpl <em>Marges Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.MargesPropertyImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getMargesProperty()
		 * @generated
		 */
		EClass MARGES_PROPERTY = eINSTANCE.getMargesProperty();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGES_PROPERTY__SIZE = eINSTANCE.getMargesProperty_Size();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGES_PROPERTY__ALIGN = eINSTANCE.getMargesProperty_Align();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.MarginImpl <em>Margin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.MarginImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getMargin()
		 * @generated
		 */
		EClass MARGIN = eINSTANCE.getMargin();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.PaddingImpl <em>Padding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.PaddingImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getPadding()
		 * @generated
		 */
		EClass PADDING = eINSTANCE.getPadding();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.BackgroundPropertyImpl <em>Background Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.BackgroundPropertyImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getBackgroundProperty()
		 * @generated
		 */
		EClass BACKGROUND_PROPERTY = eINSTANCE.getBackgroundProperty();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND_PROPERTY__COLOR = eINSTANCE.getBackgroundProperty_Color();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ButtonPropertyImpl <em>Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ButtonPropertyImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getButtonProperty()
		 * @generated
		 */
		EClass BUTTON_PROPERTY = eINSTANCE.getButtonProperty();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ButtonBasicImpl <em>Button Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ButtonBasicImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getButtonBasic()
		 * @generated
		 */
		EClass BUTTON_BASIC = eINSTANCE.getButtonBasic();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ButtonStyleImpl <em>Button Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ButtonStyleImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getButtonStyle()
		 * @generated
		 */
		EClass BUTTON_STYLE = eINSTANCE.getButtonStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_STYLE__COLOR = eINSTANCE.getButtonStyle_Color();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.MuteLinkImpl <em>Mute Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.MuteLinkImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getMuteLink()
		 * @generated
		 */
		EClass MUTE_LINK = eINSTANCE.getMuteLink();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.LinkPropertyImpl <em>Link Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.LinkPropertyImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getLinkProperty()
		 * @generated
		 */
		EClass LINK_PROPERTY = eINSTANCE.getLinkProperty();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ButtonSIzeImpl <em>Button SIze</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ButtonSIzeImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getButtonSIze()
		 * @generated
		 */
		EClass BUTTON_SIZE = eINSTANCE.getButtonSIze();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_SIZE__SIZE = eINSTANCE.getButtonSIze_Size();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.ImagePropertyImpl <em>Image Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.ImagePropertyImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getImageProperty()
		 * @generated
		 */
		EClass IMAGE_PROPERTY = eINSTANCE.getImageProperty();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.TextModifierImpl <em>Text Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.TextModifierImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTextModifier()
		 * @generated
		 */
		EClass TEXT_MODIFIER = eINSTANCE.getTextModifier();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.HeadingModifierImpl <em>Heading Modifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.HeadingModifierImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getHeadingModifier()
		 * @generated
		 */
		EClass HEADING_MODIFIER = eINSTANCE.getHeadingModifier();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.impl.TitlePropertyImpl <em>Title Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.impl.TitlePropertyImpl
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getTitleProperty()
		 * @generated
		 */
		EClass TITLE_PROPERTY = eINSTANCE.getTitleProperty();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_PROPERTY__SIZE = eINSTANCE.getTitleProperty_Size();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.Color
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.Size
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link idm.uikit.mm.uikit.Align <em>Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.uikit.mm.uikit.Align
		 * @see idm.uikit.mm.uikit.impl.UikitPackageImpl#getAlign()
		 * @generated
		 */
		EEnum ALIGN = eINSTANCE.getAlign();

	}

} //UikitPackage
