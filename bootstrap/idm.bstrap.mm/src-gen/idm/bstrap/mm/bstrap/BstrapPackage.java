/**
 */
package idm.bstrap.mm.bstrap;

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
 * @see idm.bstrap.mm.bstrap.BstrapFactory
 * @model kind="package"
 * @generated
 */
public interface BstrapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bstrap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/bstrap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bstrap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BstrapPackage eINSTANCE = idm.bstrap.mm.bstrap.impl.BstrapPackageImpl.init();

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.PageImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPage()
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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.PageContentImpl <em>Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.PageContentImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPageContent()
	 * @generated
	 */
	int PAGE_CONTENT = 45;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT__GENERAL_PROPERTIES = 0;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ContainerImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERAL_PROPERTIES = PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PAGECONTENTS = PAGE_CONTENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.FixContainerImpl <em>Fix Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.FixContainerImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getFixContainer()
	 * @generated
	 */
	int FIX_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER__GENERAL_PROPERTIES = CONTAINER__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER__PAGECONTENTS = CONTAINER__PAGECONTENTS;

	/**
	 * The number of structural features of the '<em>Fix Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fix Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.FluidContainerImpl <em>Fluid Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.FluidContainerImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getFluidContainer()
	 * @generated
	 */
	int FLUID_CONTAINER = 3;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER__GENERAL_PROPERTIES = CONTAINER__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER__PAGECONTENTS = CONTAINER__PAGECONTENTS;

	/**
	 * The number of structural features of the '<em>Fluid Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fluid Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TextPageContentImpl <em>Text Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TextPageContentImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextPageContent()
	 * @generated
	 */
	int TEXT_PAGE_CONTENT = 46;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_PAGE_CONTENT__GENERAL_PROPERTIES = PAGE_CONTENT__GENERAL_PROPERTIES;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TextContainerImpl <em>Text Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TextContainerImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextContainer()
	 * @generated
	 */
	int TEXT_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

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
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__EMPHASIS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ParagrapheImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getParagraphe()
	 * @generated
	 */
	int PARAGRAPHE = 5;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__GENERAL_PROPERTIES = TEXT_CONTAINER__GENERAL_PROPERTIES;

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
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__EMPHASIS = TEXT_CONTAINER__EMPHASIS;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TitleImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 6;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__GENERAL_PROPERTIES = TEXT_CONTAINER__GENERAL_PROPERTIES;

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
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__EMPHASIS = TEXT_CONTAINER__EMPHASIS;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__LEVEL = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Displayproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__DISPLAYPROPERTIES = TEXT_CONTAINER_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.ListItemElement <em>List Item Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.ListItemElement
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getListItemElement()
	 * @generated
	 */
	int LIST_ITEM_ELEMENT = 51;

	/**
	 * The number of structural features of the '<em>List Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>List Item Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.TextElements <em>Text Elements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.TextElements
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextElements()
	 * @generated
	 */
	int TEXT_ELEMENTS = 7;

	/**
	 * The number of structural features of the '<em>Text Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENTS_FEATURE_COUNT = LIST_ITEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENTS_OPERATION_COUNT = LIST_ITEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TextImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__TEXT = TEXT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = TEXT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = TEXT_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.CodeImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 9;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ContainableTextElementImpl <em>Containable Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ContainableTextElementImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getContainableTextElement()
	 * @generated
	 */
	int CONTAINABLE_TEXT_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT__GENERAL_PROPERTIES = TEXT_ELEMENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Containable Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT = TEXT_ELEMENTS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Containable Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT = TEXT_ELEMENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.CompositeTextElementImpl <em>Composite Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.CompositeTextElementImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCompositeTextElement()
	 * @generated
	 */
	int COMPOSITE_TEXT_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT__GENERAL_PROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERAL_PROPERTIES;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.UrlBasedLinkImpl <em>Url Based Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.UrlBasedLinkImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getUrlBasedLink()
	 * @generated
	 */
	int URL_BASED_LINK = 11;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__GENERAL_PROPERTIES = COMPOSITE_TEXT_ELEMENT__GENERAL_PROPERTIES;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ImageImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 12;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__GENERAL_PROPERTIES = URL_BASED_LINK__GENERAL_PROPERTIES;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.PropertyClassImpl <em>Property Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.PropertyClassImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPropertyClass()
	 * @generated
	 */
	int PROPERTY_CLASS = 15;

	/**
	 * The number of structural features of the '<em>Property Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CLASS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Property Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.GeneralImpl <em>General</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.GeneralImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getGeneral()
	 * @generated
	 */
	int GENERAL = 14;

	/**
	 * The number of structural features of the '<em>General</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.MargesPropertyImpl <em>Marges Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.MargesPropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getMargesProperty()
	 * @generated
	 */
	int MARGES_PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY__LEVEL = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY__ALIGNEMENT = GENERAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Marges Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Marges Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY_OPERATION_COUNT = GENERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.MarginImpl <em>Margin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.MarginImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getMargin()
	 * @generated
	 */
	int MARGIN = 17;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__LEVEL = MARGES_PROPERTY__LEVEL;

	/**
	 * The feature id for the '<em><b>Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__ALIGNEMENT = MARGES_PROPERTY__ALIGNEMENT;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.PaddingImpl <em>Padding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.PaddingImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPadding()
	 * @generated
	 */
	int PADDING = 18;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING__LEVEL = MARGES_PROPERTY__LEVEL;

	/**
	 * The feature id for the '<em><b>Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING__ALIGNEMENT = MARGES_PROPERTY__ALIGNEMENT;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BackgroundImpl <em>Background</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BackgroundImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBackground()
	 * @generated
	 */
	int BACKGROUND = 19;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND__COLOR = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_OPERATION_COUNT = GENERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BorderPropertyImpl <em>Border Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BorderPropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBorderProperty()
	 * @generated
	 */
	int BORDER_PROPERTY = 20;

	/**
	 * The number of structural features of the '<em>Border Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_PROPERTY_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Border Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_PROPERTY_OPERATION_COUNT = GENERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BorderImpl <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BorderImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 21;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = BORDER_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OPERATION_COUNT = BORDER_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ColoredBorderImpl <em>Colored Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ColoredBorderImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getColoredBorder()
	 * @generated
	 */
	int COLORED_BORDER = 22;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_BORDER__COLOR = BORDER_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colored Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_BORDER_FEATURE_COUNT = BORDER_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Colored Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORED_BORDER_OPERATION_COUNT = BORDER_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.DisplayPropertyImpl <em>Display Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.DisplayPropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplayProperty()
	 * @generated
	 */
	int DISPLAY_PROPERTY = 23;

	/**
	 * The number of structural features of the '<em>Display Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.Display1Impl <em>Display1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.Display1Impl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplay1()
	 * @generated
	 */
	int DISPLAY1 = 24;

	/**
	 * The number of structural features of the '<em>Display1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY1_FEATURE_COUNT = DISPLAY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY1_OPERATION_COUNT = DISPLAY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.Display2Impl <em>Display2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.Display2Impl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplay2()
	 * @generated
	 */
	int DISPLAY2 = 25;

	/**
	 * The number of structural features of the '<em>Display2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY2_FEATURE_COUNT = DISPLAY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY2_OPERATION_COUNT = DISPLAY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.Display3Impl <em>Display3</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.Display3Impl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplay3()
	 * @generated
	 */
	int DISPLAY3 = 26;

	/**
	 * The number of structural features of the '<em>Display3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY3_FEATURE_COUNT = DISPLAY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display3</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY3_OPERATION_COUNT = DISPLAY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.Display4Impl <em>Display4</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.Display4Impl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplay4()
	 * @generated
	 */
	int DISPLAY4 = 27;

	/**
	 * The number of structural features of the '<em>Display4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY4_FEATURE_COUNT = DISPLAY_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Display4</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY4_OPERATION_COUNT = DISPLAY_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonPropertyImpl <em>Button Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonPropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonProperty()
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
	int BUTTON_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ImagePropertyImpl <em>Image Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ImagePropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getImageProperty()
	 * @generated
	 */
	int IMAGE_PROPERTY = 29;

	/**
	 * The number of structural features of the '<em>Image Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ImageShapeImpl <em>Image Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ImageShapeImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getImageShape()
	 * @generated
	 */
	int IMAGE_SHAPE = 30;

	/**
	 * The number of structural features of the '<em>Image Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE_FEATURE_COUNT = IMAGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_SHAPE_OPERATION_COUNT = IMAGE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ImageAligningImpl <em>Image Aligning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ImageAligningImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getImageAligning()
	 * @generated
	 */
	int IMAGE_ALIGNING = 31;

	/**
	 * The number of structural features of the '<em>Image Aligning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ALIGNING_FEATURE_COUNT = IMAGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image Aligning</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_ALIGNING_OPERATION_COUNT = IMAGE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.RoundedImpl <em>Rounded</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.RoundedImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getRounded()
	 * @generated
	 */
	int ROUNDED = 32;

	/**
	 * The number of structural features of the '<em>Rounded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_FEATURE_COUNT = IMAGE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rounded</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUNDED_OPERATION_COUNT = IMAGE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ThumbnailImpl <em>Thumbnail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ThumbnailImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getThumbnail()
	 * @generated
	 */
	int THUMBNAIL = 33;

	/**
	 * The number of structural features of the '<em>Thumbnail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_FEATURE_COUNT = IMAGE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Thumbnail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THUMBNAIL_OPERATION_COUNT = IMAGE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.CircleImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 34;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = IMAGE_SHAPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = IMAGE_SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.FloatImpl <em>Float</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.FloatImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getFloat()
	 * @generated
	 */
	int FLOAT = 35;

	/**
	 * The feature id for the '<em><b>Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT__ALIGNEMENT = IMAGE_ALIGNING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = IMAGE_ALIGNING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_OPERATION_COUNT = IMAGE_ALIGNING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.CenterImpl <em>Center</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.CenterImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCenter()
	 * @generated
	 */
	int CENTER = 36;

	/**
	 * The number of structural features of the '<em>Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_FEATURE_COUNT = IMAGE_ALIGNING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Center</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTER_OPERATION_COUNT = IMAGE_ALIGNING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ResponsiveImpl <em>Responsive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ResponsiveImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getResponsive()
	 * @generated
	 */
	int RESPONSIVE = 37;

	/**
	 * The number of structural features of the '<em>Responsive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIVE_FEATURE_COUNT = IMAGE_ALIGNING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Responsive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSIVE_OPERATION_COUNT = IMAGE_ALIGNING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonStyleImpl <em>Button Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonStyleImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonStyle()
	 * @generated
	 */
	int BUTTON_STYLE = 38;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonSizeImpl <em>Button Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonSizeImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonSize()
	 * @generated
	 */
	int BUTTON_SIZE = 39;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SIZE__SIZE = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SIZE_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button Size</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SIZE_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonLinkImpl <em>Button Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonLinkImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonLink()
	 * @generated
	 */
	int BUTTON_LINK = 40;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_LINK__COLOR = BUTTON_STYLE__COLOR;

	/**
	 * The number of structural features of the '<em>Button Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_LINK_FEATURE_COUNT = BUTTON_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_LINK_OPERATION_COUNT = BUTTON_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonStateImpl <em>Button State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonStateImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonState()
	 * @generated
	 */
	int BUTTON_STATE = 41;

	/**
	 * The number of structural features of the '<em>Button State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STATE_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STATE_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.DisabledImpl <em>Disabled</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.DisabledImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisabled()
	 * @generated
	 */
	int DISABLED = 42;

	/**
	 * The number of structural features of the '<em>Disabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLED_FEATURE_COUNT = BUTTON_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Disabled</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISABLED_OPERATION_COUNT = BUTTON_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ActiveImpl <em>Active</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ActiveImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getActive()
	 * @generated
	 */
	int ACTIVE = 43;

	/**
	 * The number of structural features of the '<em>Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_FEATURE_COUNT = BUTTON_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Active</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVE_OPERATION_COUNT = BUTTON_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 44;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__GENERAL_PROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERAL_PROPERTIES;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ListElementImpl <em>List Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ListElementImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getListElement()
	 * @generated
	 */
	int LIST_ELEMENT = 47;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Listitems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__LISTITEMS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Listproperty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__LISTPROPERTY = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.OrderListImpl <em>Order List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.OrderListImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getOrderList()
	 * @generated
	 */
	int ORDER_LIST = 48;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__GENERAL_PROPERTIES = LIST_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Listitems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__LISTITEMS = LIST_ELEMENT__LISTITEMS;

	/**
	 * The feature id for the '<em><b>Listproperty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST__LISTPROPERTY = LIST_ELEMENT__LISTPROPERTY;

	/**
	 * The number of structural features of the '<em>Order List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Order List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_LIST_OPERATION_COUNT = LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.UnOrderedListImpl <em>Un Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.UnOrderedListImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getUnOrderedList()
	 * @generated
	 */
	int UN_ORDERED_LIST = 49;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_ORDERED_LIST__GENERAL_PROPERTIES = LIST_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Listitems</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_ORDERED_LIST__LISTITEMS = LIST_ELEMENT__LISTITEMS;

	/**
	 * The feature id for the '<em><b>Listproperty</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_ORDERED_LIST__LISTPROPERTY = LIST_ELEMENT__LISTPROPERTY;

	/**
	 * The number of structural features of the '<em>Un Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_ORDERED_LIST_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Un Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UN_ORDERED_LIST_OPERATION_COUNT = LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ListItemImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 50;

	/**
	 * The feature id for the '<em><b>Listitemelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__LISTITEMELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ACTIVE = 1;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.NavigationImpl <em>Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.NavigationImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getNavigation()
	 * @generated
	 */
	int NAVIGATION = 52;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Listelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__LISTELEMENT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Navbar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__NAVBAR = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__LINKS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.NavBarPropertyImpl <em>Nav Bar Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.NavBarPropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getNavBarProperty()
	 * @generated
	 */
	int NAV_BAR_PROPERTY = 57;

	/**
	 * The number of structural features of the '<em>Nav Bar Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BAR_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Nav Bar Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAV_BAR_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.CenteredImpl <em>Centered</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.CenteredImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCentered()
	 * @generated
	 */
	int CENTERED = 53;

	/**
	 * The number of structural features of the '<em>Centered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_FEATURE_COUNT = NAV_BAR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Centered</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CENTERED_OPERATION_COUNT = NAV_BAR_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ListPropertyImpl <em>List Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ListPropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getListProperty()
	 * @generated
	 */
	int LIST_PROPERTY = 54;

	/**
	 * The number of structural features of the '<em>List Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>List Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BasicListImpl <em>Basic List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BasicListImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBasicList()
	 * @generated
	 */
	int BASIC_LIST = 55;

	/**
	 * The number of structural features of the '<em>Basic List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LIST_FEATURE_COUNT = LIST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_LIST_OPERATION_COUNT = LIST_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.HorizontalListImpl <em>Horizontal List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.HorizontalListImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getHorizontalList()
	 * @generated
	 */
	int HORIZONTAL_LIST = 56;

	/**
	 * The number of structural features of the '<em>Horizontal List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LIST_FEATURE_COUNT = LIST_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LIST_OPERATION_COUNT = LIST_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BasicImpl <em>Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BasicImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBasic()
	 * @generated
	 */
	int BASIC = 58;

	/**
	 * The number of structural features of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FEATURE_COUNT = NAV_BAR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION_COUNT = NAV_BAR_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.VerticalImpl <em>Vertical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.VerticalImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getVertical()
	 * @generated
	 */
	int VERTICAL = 59;

	/**
	 * The number of structural features of the '<em>Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_FEATURE_COUNT = NAV_BAR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vertical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_OPERATION_COUNT = NAV_BAR_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.EmphasisImpl <em>Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.EmphasisImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getEmphasis()
	 * @generated
	 */
	int EMPHASIS = 60;

	/**
	 * The number of structural features of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ItalicPropertyImpl <em>Italic Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ItalicPropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getItalicProperty()
	 * @generated
	 */
	int ITALIC_PROPERTY = 61;

	/**
	 * The number of structural features of the '<em>Italic Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_PROPERTY_FEATURE_COUNT = EMPHASIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Italic Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_PROPERTY_OPERATION_COUNT = EMPHASIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BoldImpl <em>Bold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BoldImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBold()
	 * @generated
	 */
	int BOLD = 62;

	/**
	 * The number of structural features of the '<em>Bold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_FEATURE_COUNT = EMPHASIS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOLD_OPERATION_COUNT = EMPHASIS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.LinkImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 63;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__GENERAL_PROPERTIES = URL_BASED_LINK__GENERAL_PROPERTIES;

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
	 * The feature id for the '<em><b>Buttonproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BUTTONPROPERTIES = URL_BASED_LINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Badgeproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BADGEPROPERTIES = URL_BASED_LINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = URL_BASED_LINK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = URL_BASED_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TextContainableImpl <em>Text Containable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TextContainableImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextContainable()
	 * @generated
	 */
	int TEXT_CONTAINABLE = 66;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINABLE__GENERAL_PROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERAL_PROPERTIES;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.StrongImpl <em>Strong</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.StrongImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getStrong()
	 * @generated
	 */
	int STRONG = 64;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG__GENERAL_PROPERTIES = TEXT_CONTAINABLE__GENERAL_PROPERTIES;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ItalicImpl <em>Italic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ItalicImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getItalic()
	 * @generated
	 */
	int ITALIC = 65;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC__GENERAL_PROPERTIES = TEXT_CONTAINABLE__GENERAL_PROPERTIES;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.TextNested <em>Text Nested</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.TextNested
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextNested()
	 * @generated
	 */
	int TEXT_NESTED = 67;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.TextNestedElement <em>Text Nested Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.TextNestedElement
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextNestedElement()
	 * @generated
	 */
	int TEXT_NESTED_ELEMENT = 68;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BrandImpl <em>Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BrandImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBrand()
	 * @generated
	 */
	int BRAND = 69;

	/**
	 * The number of structural features of the '<em>Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_FEATURE_COUNT = NAV_BAR_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRAND_OPERATION_COUNT = NAV_BAR_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.LinkPropertyImpl <em>Link Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.LinkPropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getLinkProperty()
	 * @generated
	 */
	int LINK_PROPERTY = 70;

	/**
	 * The number of structural features of the '<em>Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.LinkBrandImpl <em>Link Brand</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.LinkBrandImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getLinkBrand()
	 * @generated
	 */
	int LINK_BRAND = 71;

	/**
	 * The number of structural features of the '<em>Link Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BRAND_FEATURE_COUNT = LINK_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link Brand</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_BRAND_OPERATION_COUNT = LINK_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TableImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 72;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Tablesections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLESECTIONS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tableproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLEPROPERTIES = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TableSectionImpl <em>Table Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TableSectionImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTableSection()
	 * @generated
	 */
	int TABLE_SECTION = 76;

	/**
	 * The feature id for the '<em><b>Tablerows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__TABLEROWS = 0;

	/**
	 * The feature id for the '<em><b>Generals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__GENERALS = 1;

	/**
	 * The number of structural features of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TheadImpl <em>Thead</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TheadImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getThead()
	 * @generated
	 */
	int THEAD = 73;

	/**
	 * The feature id for the '<em><b>Tablerows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__TABLEROWS = TABLE_SECTION__TABLEROWS;

	/**
	 * The feature id for the '<em><b>Generals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD__GENERALS = TABLE_SECTION__GENERALS;

	/**
	 * The number of structural features of the '<em>Thead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Thead</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TbodyImpl <em>Tbody</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TbodyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTbody()
	 * @generated
	 */
	int TBODY = 74;

	/**
	 * The feature id for the '<em><b>Tablerows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__TABLEROWS = TABLE_SECTION__TABLEROWS;

	/**
	 * The feature id for the '<em><b>Generals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY__GENERALS = TABLE_SECTION__GENERALS;

	/**
	 * The number of structural features of the '<em>Tbody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tbody</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TfootImpl <em>Tfoot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TfootImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTfoot()
	 * @generated
	 */
	int TFOOT = 75;

	/**
	 * The feature id for the '<em><b>Tablerows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__TABLEROWS = TABLE_SECTION__TABLEROWS;

	/**
	 * The feature id for the '<em><b>Generals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT__GENERALS = TABLE_SECTION__GENERALS;

	/**
	 * The number of structural features of the '<em>Tfoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tfoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TableRowImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 77;

	/**
	 * The feature id for the '<em><b>Tablecells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__TABLECELLS = 0;

	/**
	 * The feature id for the '<em><b>Generals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__GENERALS = 1;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TableCellImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 78;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__GENERAL_PROPERTIES = TEXT_CONTAINER__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__TEXTELEMENTS = TEXT_CONTAINER__TEXTELEMENTS;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__COLOR = TEXT_CONTAINER__COLOR;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__EMPHASIS = TEXT_CONTAINER__EMPHASIS;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ALIGNMENT = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__SPAN = TEXT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TablePropertyImpl <em>Table Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TablePropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTableProperty()
	 * @generated
	 */
	int TABLE_PROPERTY = 79;

	/**
	 * The number of structural features of the '<em>Table Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BasicTableImpl <em>Basic Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BasicTableImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBasicTable()
	 * @generated
	 */
	int BASIC_TABLE = 80;

	/**
	 * The number of structural features of the '<em>Basic Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TABLE_FEATURE_COUNT = TABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TABLE_OPERATION_COUNT = TABLE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.StripedRowsImpl <em>Striped Rows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.StripedRowsImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getStripedRows()
	 * @generated
	 */
	int STRIPED_ROWS = 81;

	/**
	 * The number of structural features of the '<em>Striped Rows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIPED_ROWS_FEATURE_COUNT = TABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Striped Rows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIPED_ROWS_OPERATION_COUNT = TABLE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BorderedTableImpl <em>Bordered Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BorderedTableImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBorderedTable()
	 * @generated
	 */
	int BORDERED_TABLE = 82;

	/**
	 * The number of structural features of the '<em>Bordered Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDERED_TABLE_FEATURE_COUNT = TABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bordered Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDERED_TABLE_OPERATION_COUNT = TABLE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.HoverRowsImpl <em>Hover Rows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.HoverRowsImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getHoverRows()
	 * @generated
	 */
	int HOVER_ROWS = 83;

	/**
	 * The number of structural features of the '<em>Hover Rows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOVER_ROWS_FEATURE_COUNT = TABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hover Rows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOVER_ROWS_OPERATION_COUNT = TABLE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.DarkTableImpl <em>Dark Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.DarkTableImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDarkTable()
	 * @generated
	 */
	int DARK_TABLE = 84;

	/**
	 * The number of structural features of the '<em>Dark Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_TABLE_FEATURE_COUNT = TABLE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dark Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_TABLE_OPERATION_COUNT = TABLE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BlockQuoteImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBlockQuote()
	 * @generated
	 */
	int BLOCK_QUOTE = 85;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__PAGECONTENTS = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.CodeBlockImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 86;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Codelines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CODELINES = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.CodeLineImpl <em>Code Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.CodeLineImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCodeLine()
	 * @generated
	 */
	int CODE_LINE = 87;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Code Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Code Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.HorizontalLineImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getHorizontalLine()
	 * @generated
	 */
	int HORIZONTAL_LINE = 88;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE__GENERAL_PROPERTIES = TEXT_PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_FEATURE_COUNT = TEXT_PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_OPERATION_COUNT = TEXT_PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonOutLineImpl <em>Button Out Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonOutLineImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonOutLine()
	 * @generated
	 */
	int BUTTON_OUT_LINE = 89;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OUT_LINE__COLOR = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Button Out Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OUT_LINE_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Button Out Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OUT_LINE_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonSpinnerImpl <em>Button Spinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonSpinnerImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonSpinner()
	 * @generated
	 */
	int BUTTON_SPINNER = 90;

	/**
	 * The number of structural features of the '<em>Button Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SPINNER_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Spinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_SPINNER_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.SpanImpl <em>Span</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.SpanImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getSpan()
	 * @generated
	 */
	int SPAN = 91;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__GENERAL_PROPERTIES = TEXT_CONTAINABLE__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Textnestedelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__TEXTNESTEDELEMENTS = TEXT_CONTAINABLE__TEXTNESTEDELEMENTS;

	/**
	 * The feature id for the '<em><b>Badgeproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN__BADGEPROPERTIES = TEXT_CONTAINABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_FEATURE_COUNT = TEXT_CONTAINABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Span</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_OPERATION_COUNT = TEXT_CONTAINABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BadgePropertyImpl <em>Badge Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BadgePropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBadgeProperty()
	 * @generated
	 */
	int BADGE_PROPERTY = 92;

	/**
	 * The number of structural features of the '<em>Badge Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_PROPERTY_FEATURE_COUNT = PROPERTY_CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Badge Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_PROPERTY_OPERATION_COUNT = PROPERTY_CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BadgeStyleImpl <em>Badge Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BadgeStyleImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBadgeStyle()
	 * @generated
	 */
	int BADGE_STYLE = 93;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_STYLE__COLOR = BADGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Badge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_STYLE_FEATURE_COUNT = BADGE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Badge Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_STYLE_OPERATION_COUNT = BADGE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BadgePillImpl <em>Badge Pill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BadgePillImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBadgePill()
	 * @generated
	 */
	int BADGE_PILL = 94;

	/**
	 * The number of structural features of the '<em>Badge Pill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_PILL_FEATURE_COUNT = BADGE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Badge Pill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BADGE_PILL_OPERATION_COUNT = BADGE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.AlertPropertyImpl <em>Alert Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.AlertPropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getAlertProperty()
	 * @generated
	 */
	int ALERT_PROPERTY = 95;

	/**
	 * The number of structural features of the '<em>Alert Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_PROPERTY_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alert Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_PROPERTY_OPERATION_COUNT = GENERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.AlertStyleImpl <em>Alert Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.AlertStyleImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getAlertStyle()
	 * @generated
	 */
	int ALERT_STYLE = 96;

	/**
	 * The number of structural features of the '<em>Alert Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_STYLE_FEATURE_COUNT = ALERT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alert Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_STYLE_OPERATION_COUNT = ALERT_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.AlertAnimatedImpl <em>Alert Animated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.AlertAnimatedImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getAlertAnimated()
	 * @generated
	 */
	int ALERT_ANIMATED = 97;

	/**
	 * The number of structural features of the '<em>Alert Animated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_ANIMATED_FEATURE_COUNT = ALERT_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alert Animated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_ANIMATED_OPERATION_COUNT = ALERT_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.AlertLinkImpl <em>Alert Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.AlertLinkImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getAlertLink()
	 * @generated
	 */
	int ALERT_LINK = 98;

	/**
	 * The number of structural features of the '<em>Alert Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK_FEATURE_COUNT = LINK_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alert Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALERT_LINK_OPERATION_COUNT = LINK_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.Color
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 99;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.Size
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 100;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.Alignement <em>Alignement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.Alignement
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getAlignement()
	 * @generated
	 */
	int ALIGNEMENT = 101;

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see idm.bstrap.mm.bstrap.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.bstrap.mm.bstrap.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Page#getPagecontents <em>Pagecontents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagecontents</em>'.
	 * @see idm.bstrap.mm.bstrap.Page#getPagecontents()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Pagecontents();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see idm.bstrap.mm.bstrap.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Container#getPagecontents <em>Pagecontents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagecontents</em>'.
	 * @see idm.bstrap.mm.bstrap.Container#getPagecontents()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Pagecontents();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.FixContainer <em>Fix Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fix Container</em>'.
	 * @see idm.bstrap.mm.bstrap.FixContainer
	 * @generated
	 */
	EClass getFixContainer();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.FluidContainer <em>Fluid Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fluid Container</em>'.
	 * @see idm.bstrap.mm.bstrap.FluidContainer
	 * @generated
	 */
	EClass getFluidContainer();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Container</em>'.
	 * @see idm.bstrap.mm.bstrap.TextContainer
	 * @generated
	 */
	EClass getTextContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.TextContainer#getTextelements <em>Textelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textelements</em>'.
	 * @see idm.bstrap.mm.bstrap.TextContainer#getTextelements()
	 * @see #getTextContainer()
	 * @generated
	 */
	EReference getTextContainer_Textelements();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.TextContainer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see idm.bstrap.mm.bstrap.TextContainer#getColor()
	 * @see #getTextContainer()
	 * @generated
	 */
	EAttribute getTextContainer_Color();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.TextContainer#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see idm.bstrap.mm.bstrap.TextContainer#getEmphasis()
	 * @see #getTextContainer()
	 * @generated
	 */
	EReference getTextContainer_Emphasis();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraphe</em>'.
	 * @see idm.bstrap.mm.bstrap.Paragraphe
	 * @generated
	 */
	EClass getParagraphe();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see idm.bstrap.mm.bstrap.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.Title#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see idm.bstrap.mm.bstrap.Title#getLevel()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Title#getDisplayproperties <em>Displayproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Displayproperties</em>'.
	 * @see idm.bstrap.mm.bstrap.Title#getDisplayproperties()
	 * @see #getTitle()
	 * @generated
	 */
	EReference getTitle_Displayproperties();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TextElements <em>Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Elements</em>'.
	 * @see idm.bstrap.mm.bstrap.TextElements
	 * @generated
	 */
	EClass getTextElements();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see idm.bstrap.mm.bstrap.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see idm.bstrap.mm.bstrap.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see idm.bstrap.mm.bstrap.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.CompositeTextElement <em>Composite Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Text Element</em>'.
	 * @see idm.bstrap.mm.bstrap.CompositeTextElement
	 * @generated
	 */
	EClass getCompositeTextElement();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.UrlBasedLink <em>Url Based Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Based Link</em>'.
	 * @see idm.bstrap.mm.bstrap.UrlBasedLink
	 * @generated
	 */
	EClass getUrlBasedLink();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.UrlBasedLink#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see idm.bstrap.mm.bstrap.UrlBasedLink#getUrl()
	 * @see #getUrlBasedLink()
	 * @generated
	 */
	EAttribute getUrlBasedLink_Url();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.UrlBasedLink#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see idm.bstrap.mm.bstrap.UrlBasedLink#getTitle()
	 * @see #getUrlBasedLink()
	 * @generated
	 */
	EAttribute getUrlBasedLink_Title();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see idm.bstrap.mm.bstrap.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Image#getImageproperties <em>Imageproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imageproperties</em>'.
	 * @see idm.bstrap.mm.bstrap.Image#getImageproperties()
	 * @see #getImage()
	 * @generated
	 */
	EReference getImage_Imageproperties();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ContainableTextElement <em>Containable Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable Text Element</em>'.
	 * @see idm.bstrap.mm.bstrap.ContainableTextElement
	 * @generated
	 */
	EClass getContainableTextElement();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.General <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General</em>'.
	 * @see idm.bstrap.mm.bstrap.General
	 * @generated
	 */
	EClass getGeneral();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.PropertyClass <em>Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Class</em>'.
	 * @see idm.bstrap.mm.bstrap.PropertyClass
	 * @generated
	 */
	EClass getPropertyClass();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.MargesProperty <em>Marges Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marges Property</em>'.
	 * @see idm.bstrap.mm.bstrap.MargesProperty
	 * @generated
	 */
	EClass getMargesProperty();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.MargesProperty#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see idm.bstrap.mm.bstrap.MargesProperty#getLevel()
	 * @see #getMargesProperty()
	 * @generated
	 */
	EAttribute getMargesProperty_Level();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.MargesProperty#getAlignement <em>Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignement</em>'.
	 * @see idm.bstrap.mm.bstrap.MargesProperty#getAlignement()
	 * @see #getMargesProperty()
	 * @generated
	 */
	EAttribute getMargesProperty_Alignement();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Margin</em>'.
	 * @see idm.bstrap.mm.bstrap.Margin
	 * @generated
	 */
	EClass getMargin();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Padding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Padding</em>'.
	 * @see idm.bstrap.mm.bstrap.Padding
	 * @generated
	 */
	EClass getPadding();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background</em>'.
	 * @see idm.bstrap.mm.bstrap.Background
	 * @generated
	 */
	EClass getBackground();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.Background#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see idm.bstrap.mm.bstrap.Background#getColor()
	 * @see #getBackground()
	 * @generated
	 */
	EAttribute getBackground_Color();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.BorderProperty <em>Border Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Property</em>'.
	 * @see idm.bstrap.mm.bstrap.BorderProperty
	 * @generated
	 */
	EClass getBorderProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see idm.bstrap.mm.bstrap.Border
	 * @generated
	 */
	EClass getBorder();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ColoredBorder <em>Colored Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colored Border</em>'.
	 * @see idm.bstrap.mm.bstrap.ColoredBorder
	 * @generated
	 */
	EClass getColoredBorder();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.ColoredBorder#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see idm.bstrap.mm.bstrap.ColoredBorder#getColor()
	 * @see #getColoredBorder()
	 * @generated
	 */
	EAttribute getColoredBorder_Color();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.DisplayProperty <em>Display Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display Property</em>'.
	 * @see idm.bstrap.mm.bstrap.DisplayProperty
	 * @generated
	 */
	EClass getDisplayProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Display1 <em>Display1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display1</em>'.
	 * @see idm.bstrap.mm.bstrap.Display1
	 * @generated
	 */
	EClass getDisplay1();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Display2 <em>Display2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display2</em>'.
	 * @see idm.bstrap.mm.bstrap.Display2
	 * @generated
	 */
	EClass getDisplay2();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Display3 <em>Display3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display3</em>'.
	 * @see idm.bstrap.mm.bstrap.Display3
	 * @generated
	 */
	EClass getDisplay3();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Display4 <em>Display4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Display4</em>'.
	 * @see idm.bstrap.mm.bstrap.Display4
	 * @generated
	 */
	EClass getDisplay4();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ButtonProperty <em>Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Property</em>'.
	 * @see idm.bstrap.mm.bstrap.ButtonProperty
	 * @generated
	 */
	EClass getButtonProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ImageProperty <em>Image Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Property</em>'.
	 * @see idm.bstrap.mm.bstrap.ImageProperty
	 * @generated
	 */
	EClass getImageProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ImageShape <em>Image Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Shape</em>'.
	 * @see idm.bstrap.mm.bstrap.ImageShape
	 * @generated
	 */
	EClass getImageShape();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ImageAligning <em>Image Aligning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Aligning</em>'.
	 * @see idm.bstrap.mm.bstrap.ImageAligning
	 * @generated
	 */
	EClass getImageAligning();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Rounded <em>Rounded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rounded</em>'.
	 * @see idm.bstrap.mm.bstrap.Rounded
	 * @generated
	 */
	EClass getRounded();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Thumbnail <em>Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thumbnail</em>'.
	 * @see idm.bstrap.mm.bstrap.Thumbnail
	 * @generated
	 */
	EClass getThumbnail();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see idm.bstrap.mm.bstrap.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Float</em>'.
	 * @see idm.bstrap.mm.bstrap.Float
	 * @generated
	 */
	EClass getFloat();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.Float#getAlignement <em>Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignement</em>'.
	 * @see idm.bstrap.mm.bstrap.Float#getAlignement()
	 * @see #getFloat()
	 * @generated
	 */
	EAttribute getFloat_Alignement();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Center <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Center</em>'.
	 * @see idm.bstrap.mm.bstrap.Center
	 * @generated
	 */
	EClass getCenter();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Responsive <em>Responsive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Responsive</em>'.
	 * @see idm.bstrap.mm.bstrap.Responsive
	 * @generated
	 */
	EClass getResponsive();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Style</em>'.
	 * @see idm.bstrap.mm.bstrap.ButtonStyle
	 * @generated
	 */
	EClass getButtonStyle();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.ButtonStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see idm.bstrap.mm.bstrap.ButtonStyle#getColor()
	 * @see #getButtonStyle()
	 * @generated
	 */
	EAttribute getButtonStyle_Color();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ButtonSize <em>Button Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Size</em>'.
	 * @see idm.bstrap.mm.bstrap.ButtonSize
	 * @generated
	 */
	EClass getButtonSize();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.ButtonSize#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see idm.bstrap.mm.bstrap.ButtonSize#getSize()
	 * @see #getButtonSize()
	 * @generated
	 */
	EAttribute getButtonSize_Size();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ButtonLink <em>Button Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Link</em>'.
	 * @see idm.bstrap.mm.bstrap.ButtonLink
	 * @generated
	 */
	EClass getButtonLink();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ButtonState <em>Button State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button State</em>'.
	 * @see idm.bstrap.mm.bstrap.ButtonState
	 * @generated
	 */
	EClass getButtonState();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Disabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disabled</em>'.
	 * @see idm.bstrap.mm.bstrap.Disabled
	 * @generated
	 */
	EClass getDisabled();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Active <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Active</em>'.
	 * @see idm.bstrap.mm.bstrap.Active
	 * @generated
	 */
	EClass getActive();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see idm.bstrap.mm.bstrap.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Button#getButtonproperties <em>Buttonproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttonproperties</em>'.
	 * @see idm.bstrap.mm.bstrap.Button#getButtonproperties()
	 * @see #getButton()
	 * @generated
	 */
	EReference getButton_Buttonproperties();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Content</em>'.
	 * @see idm.bstrap.mm.bstrap.PageContent
	 * @generated
	 */
	EClass getPageContent();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.PageContent#getGeneralProperties <em>General Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>General Properties</em>'.
	 * @see idm.bstrap.mm.bstrap.PageContent#getGeneralProperties()
	 * @see #getPageContent()
	 * @generated
	 */
	EReference getPageContent_GeneralProperties();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TextPageContent <em>Text Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Page Content</em>'.
	 * @see idm.bstrap.mm.bstrap.TextPageContent
	 * @generated
	 */
	EClass getTextPageContent();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Element</em>'.
	 * @see idm.bstrap.mm.bstrap.ListElement
	 * @generated
	 */
	EClass getListElement();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.ListElement#getListitems <em>Listitems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listitems</em>'.
	 * @see idm.bstrap.mm.bstrap.ListElement#getListitems()
	 * @see #getListElement()
	 * @generated
	 */
	EReference getListElement_Listitems();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.ListElement#getListproperty <em>Listproperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listproperty</em>'.
	 * @see idm.bstrap.mm.bstrap.ListElement#getListproperty()
	 * @see #getListElement()
	 * @generated
	 */
	EReference getListElement_Listproperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.OrderList <em>Order List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order List</em>'.
	 * @see idm.bstrap.mm.bstrap.OrderList
	 * @generated
	 */
	EClass getOrderList();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.UnOrderedList <em>Un Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Un Ordered List</em>'.
	 * @see idm.bstrap.mm.bstrap.UnOrderedList
	 * @generated
	 */
	EClass getUnOrderedList();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see idm.bstrap.mm.bstrap.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.ListItem#getListitemelements <em>Listitemelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listitemelements</em>'.
	 * @see idm.bstrap.mm.bstrap.ListItem#getListitemelements()
	 * @see #getListItem()
	 * @generated
	 */
	EReference getListItem_Listitemelements();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.ListItem#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see idm.bstrap.mm.bstrap.ListItem#isActive()
	 * @see #getListItem()
	 * @generated
	 */
	EAttribute getListItem_Active();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ListItemElement <em>List Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Element</em>'.
	 * @see idm.bstrap.mm.bstrap.ListItemElement
	 * @generated
	 */
	EClass getListItemElement();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation</em>'.
	 * @see idm.bstrap.mm.bstrap.Navigation
	 * @generated
	 */
	EClass getNavigation();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Navigation#getListelement <em>Listelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listelement</em>'.
	 * @see idm.bstrap.mm.bstrap.Navigation#getListelement()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_Listelement();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Navigation#getNavbar <em>Navbar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navbar</em>'.
	 * @see idm.bstrap.mm.bstrap.Navigation#getNavbar()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_Navbar();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Navigation#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see idm.bstrap.mm.bstrap.Navigation#getLinks()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_Links();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Centered <em>Centered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Centered</em>'.
	 * @see idm.bstrap.mm.bstrap.Centered
	 * @generated
	 */
	EClass getCentered();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ListProperty <em>List Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Property</em>'.
	 * @see idm.bstrap.mm.bstrap.ListProperty
	 * @generated
	 */
	EClass getListProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.BasicList <em>Basic List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic List</em>'.
	 * @see idm.bstrap.mm.bstrap.BasicList
	 * @generated
	 */
	EClass getBasicList();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.HorizontalList <em>Horizontal List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal List</em>'.
	 * @see idm.bstrap.mm.bstrap.HorizontalList
	 * @generated
	 */
	EClass getHorizontalList();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.NavBarProperty <em>Nav Bar Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nav Bar Property</em>'.
	 * @see idm.bstrap.mm.bstrap.NavBarProperty
	 * @generated
	 */
	EClass getNavBarProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic</em>'.
	 * @see idm.bstrap.mm.bstrap.Basic
	 * @generated
	 */
	EClass getBasic();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Vertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical</em>'.
	 * @see idm.bstrap.mm.bstrap.Vertical
	 * @generated
	 */
	EClass getVertical();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Emphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasis</em>'.
	 * @see idm.bstrap.mm.bstrap.Emphasis
	 * @generated
	 */
	EClass getEmphasis();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ItalicProperty <em>Italic Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic Property</em>'.
	 * @see idm.bstrap.mm.bstrap.ItalicProperty
	 * @generated
	 */
	EClass getItalicProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Bold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bold</em>'.
	 * @see idm.bstrap.mm.bstrap.Bold
	 * @generated
	 */
	EClass getBold();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see idm.bstrap.mm.bstrap.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Link#getLinkproperties <em>Linkproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Linkproperties</em>'.
	 * @see idm.bstrap.mm.bstrap.Link#getLinkproperties()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Linkproperties();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Link#getButtonproperties <em>Buttonproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buttonproperties</em>'.
	 * @see idm.bstrap.mm.bstrap.Link#getButtonproperties()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Buttonproperties();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Link#getBadgeproperties <em>Badgeproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Badgeproperties</em>'.
	 * @see idm.bstrap.mm.bstrap.Link#getBadgeproperties()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Badgeproperties();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Strong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong</em>'.
	 * @see idm.bstrap.mm.bstrap.Strong
	 * @generated
	 */
	EClass getStrong();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Italic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic</em>'.
	 * @see idm.bstrap.mm.bstrap.Italic
	 * @generated
	 */
	EClass getItalic();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TextContainable <em>Text Containable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Containable</em>'.
	 * @see idm.bstrap.mm.bstrap.TextContainable
	 * @generated
	 */
	EClass getTextContainable();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TextNested <em>Text Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Nested</em>'.
	 * @see idm.bstrap.mm.bstrap.TextNested
	 * @generated
	 */
	EClass getTextNested();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.TextNested#getTextnestedelements <em>Textnestedelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textnestedelements</em>'.
	 * @see idm.bstrap.mm.bstrap.TextNested#getTextnestedelements()
	 * @see #getTextNested()
	 * @generated
	 */
	EReference getTextNested_Textnestedelements();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TextNestedElement <em>Text Nested Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Nested Element</em>'.
	 * @see idm.bstrap.mm.bstrap.TextNestedElement
	 * @generated
	 */
	EClass getTextNestedElement();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Brand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brand</em>'.
	 * @see idm.bstrap.mm.bstrap.Brand
	 * @generated
	 */
	EClass getBrand();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.LinkProperty <em>Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Property</em>'.
	 * @see idm.bstrap.mm.bstrap.LinkProperty
	 * @generated
	 */
	EClass getLinkProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.LinkBrand <em>Link Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Brand</em>'.
	 * @see idm.bstrap.mm.bstrap.LinkBrand
	 * @generated
	 */
	EClass getLinkBrand();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see idm.bstrap.mm.bstrap.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Table#getTablesections <em>Tablesections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablesections</em>'.
	 * @see idm.bstrap.mm.bstrap.Table#getTablesections()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Tablesections();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Table#getTableproperties <em>Tableproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tableproperties</em>'.
	 * @see idm.bstrap.mm.bstrap.Table#getTableproperties()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Tableproperties();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Thead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thead</em>'.
	 * @see idm.bstrap.mm.bstrap.Thead
	 * @generated
	 */
	EClass getThead();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Tbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tbody</em>'.
	 * @see idm.bstrap.mm.bstrap.Tbody
	 * @generated
	 */
	EClass getTbody();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Tfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tfoot</em>'.
	 * @see idm.bstrap.mm.bstrap.Tfoot
	 * @generated
	 */
	EClass getTfoot();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Section</em>'.
	 * @see idm.bstrap.mm.bstrap.TableSection
	 * @generated
	 */
	EClass getTableSection();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.TableSection#getTablerows <em>Tablerows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablerows</em>'.
	 * @see idm.bstrap.mm.bstrap.TableSection#getTablerows()
	 * @see #getTableSection()
	 * @generated
	 */
	EReference getTableSection_Tablerows();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.TableSection#getGenerals <em>Generals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generals</em>'.
	 * @see idm.bstrap.mm.bstrap.TableSection#getGenerals()
	 * @see #getTableSection()
	 * @generated
	 */
	EReference getTableSection_Generals();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see idm.bstrap.mm.bstrap.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.TableRow#getTablecells <em>Tablecells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tablecells</em>'.
	 * @see idm.bstrap.mm.bstrap.TableRow#getTablecells()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Tablecells();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.TableRow#getGenerals <em>Generals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generals</em>'.
	 * @see idm.bstrap.mm.bstrap.TableRow#getGenerals()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Generals();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see idm.bstrap.mm.bstrap.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.TableCell#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see idm.bstrap.mm.bstrap.TableCell#getAlignment()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.TableCell#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see idm.bstrap.mm.bstrap.TableCell#getSpan()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Span();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TableProperty <em>Table Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Property</em>'.
	 * @see idm.bstrap.mm.bstrap.TableProperty
	 * @generated
	 */
	EClass getTableProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.BasicTable <em>Basic Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Table</em>'.
	 * @see idm.bstrap.mm.bstrap.BasicTable
	 * @generated
	 */
	EClass getBasicTable();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.StripedRows <em>Striped Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Striped Rows</em>'.
	 * @see idm.bstrap.mm.bstrap.StripedRows
	 * @generated
	 */
	EClass getStripedRows();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.BorderedTable <em>Bordered Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bordered Table</em>'.
	 * @see idm.bstrap.mm.bstrap.BorderedTable
	 * @generated
	 */
	EClass getBorderedTable();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.HoverRows <em>Hover Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hover Rows</em>'.
	 * @see idm.bstrap.mm.bstrap.HoverRows
	 * @generated
	 */
	EClass getHoverRows();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.DarkTable <em>Dark Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dark Table</em>'.
	 * @see idm.bstrap.mm.bstrap.DarkTable
	 * @generated
	 */
	EClass getDarkTable();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.BlockQuote <em>Block Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Quote</em>'.
	 * @see idm.bstrap.mm.bstrap.BlockQuote
	 * @generated
	 */
	EClass getBlockQuote();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.BlockQuote#getPagecontents <em>Pagecontents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagecontents</em>'.
	 * @see idm.bstrap.mm.bstrap.BlockQuote#getPagecontents()
	 * @see #getBlockQuote()
	 * @generated
	 */
	EReference getBlockQuote_Pagecontents();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see idm.bstrap.mm.bstrap.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.CodeBlock#getCodelines <em>Codelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codelines</em>'.
	 * @see idm.bstrap.mm.bstrap.CodeBlock#getCodelines()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_Codelines();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.CodeLine <em>Code Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Line</em>'.
	 * @see idm.bstrap.mm.bstrap.CodeLine
	 * @generated
	 */
	EClass getCodeLine();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.CodeLine#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see idm.bstrap.mm.bstrap.CodeLine#getContent()
	 * @see #getCodeLine()
	 * @generated
	 */
	EAttribute getCodeLine_Content();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.HorizontalLine <em>Horizontal Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Line</em>'.
	 * @see idm.bstrap.mm.bstrap.HorizontalLine
	 * @generated
	 */
	EClass getHorizontalLine();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ButtonOutLine <em>Button Out Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Out Line</em>'.
	 * @see idm.bstrap.mm.bstrap.ButtonOutLine
	 * @generated
	 */
	EClass getButtonOutLine();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.ButtonOutLine#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see idm.bstrap.mm.bstrap.ButtonOutLine#getColor()
	 * @see #getButtonOutLine()
	 * @generated
	 */
	EAttribute getButtonOutLine_Color();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.ButtonSpinner <em>Button Spinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button Spinner</em>'.
	 * @see idm.bstrap.mm.bstrap.ButtonSpinner
	 * @generated
	 */
	EClass getButtonSpinner();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Span <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span</em>'.
	 * @see idm.bstrap.mm.bstrap.Span
	 * @generated
	 */
	EClass getSpan();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Span#getBadgeproperties <em>Badgeproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Badgeproperties</em>'.
	 * @see idm.bstrap.mm.bstrap.Span#getBadgeproperties()
	 * @see #getSpan()
	 * @generated
	 */
	EReference getSpan_Badgeproperties();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.BadgeProperty <em>Badge Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge Property</em>'.
	 * @see idm.bstrap.mm.bstrap.BadgeProperty
	 * @generated
	 */
	EClass getBadgeProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.BadgeStyle <em>Badge Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge Style</em>'.
	 * @see idm.bstrap.mm.bstrap.BadgeStyle
	 * @generated
	 */
	EClass getBadgeStyle();

	/**
	 * Returns the meta object for the attribute '{@link idm.bstrap.mm.bstrap.BadgeStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see idm.bstrap.mm.bstrap.BadgeStyle#getColor()
	 * @see #getBadgeStyle()
	 * @generated
	 */
	EAttribute getBadgeStyle_Color();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.BadgePill <em>Badge Pill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Badge Pill</em>'.
	 * @see idm.bstrap.mm.bstrap.BadgePill
	 * @generated
	 */
	EClass getBadgePill();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.AlertProperty <em>Alert Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Property</em>'.
	 * @see idm.bstrap.mm.bstrap.AlertProperty
	 * @generated
	 */
	EClass getAlertProperty();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.AlertStyle <em>Alert Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Style</em>'.
	 * @see idm.bstrap.mm.bstrap.AlertStyle
	 * @generated
	 */
	EClass getAlertStyle();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.AlertAnimated <em>Alert Animated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Animated</em>'.
	 * @see idm.bstrap.mm.bstrap.AlertAnimated
	 * @generated
	 */
	EClass getAlertAnimated();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.AlertLink <em>Alert Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alert Link</em>'.
	 * @see idm.bstrap.mm.bstrap.AlertLink
	 * @generated
	 */
	EClass getAlertLink();

	/**
	 * Returns the meta object for enum '{@link idm.bstrap.mm.bstrap.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see idm.bstrap.mm.bstrap.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the meta object for enum '{@link idm.bstrap.mm.bstrap.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size</em>'.
	 * @see idm.bstrap.mm.bstrap.Size
	 * @generated
	 */
	EEnum getSize();

	/**
	 * Returns the meta object for enum '{@link idm.bstrap.mm.bstrap.Alignement <em>Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Alignement</em>'.
	 * @see idm.bstrap.mm.bstrap.Alignement
	 * @generated
	 */
	EEnum getAlignement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BstrapFactory getBstrapFactory();

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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.PageImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPage()
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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ContainerImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Pagecontents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__PAGECONTENTS = eINSTANCE.getContainer_Pagecontents();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.FixContainerImpl <em>Fix Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.FixContainerImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getFixContainer()
		 * @generated
		 */
		EClass FIX_CONTAINER = eINSTANCE.getFixContainer();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.FluidContainerImpl <em>Fluid Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.FluidContainerImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getFluidContainer()
		 * @generated
		 */
		EClass FLUID_CONTAINER = eINSTANCE.getFluidContainer();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TextContainerImpl <em>Text Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TextContainerImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextContainer()
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
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CONTAINER__EMPHASIS = eINSTANCE.getTextContainer_Emphasis();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ParagrapheImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getParagraphe()
		 * @generated
		 */
		EClass PARAGRAPHE = eINSTANCE.getParagraphe();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TitleImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTitle()
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
		 * The meta object literal for the '<em><b>Displayproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE__DISPLAYPROPERTIES = eINSTANCE.getTitle_Displayproperties();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.TextElements <em>Text Elements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.TextElements
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextElements()
		 * @generated
		 */
		EClass TEXT_ELEMENTS = eINSTANCE.getTextElements();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TextImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getText()
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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.CodeImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.CompositeTextElementImpl <em>Composite Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.CompositeTextElementImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCompositeTextElement()
		 * @generated
		 */
		EClass COMPOSITE_TEXT_ELEMENT = eINSTANCE.getCompositeTextElement();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.UrlBasedLinkImpl <em>Url Based Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.UrlBasedLinkImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getUrlBasedLink()
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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ImageImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getImage()
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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ContainableTextElementImpl <em>Containable Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ContainableTextElementImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getContainableTextElement()
		 * @generated
		 */
		EClass CONTAINABLE_TEXT_ELEMENT = eINSTANCE.getContainableTextElement();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.GeneralImpl <em>General</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.GeneralImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getGeneral()
		 * @generated
		 */
		EClass GENERAL = eINSTANCE.getGeneral();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.PropertyClassImpl <em>Property Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.PropertyClassImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPropertyClass()
		 * @generated
		 */
		EClass PROPERTY_CLASS = eINSTANCE.getPropertyClass();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.MargesPropertyImpl <em>Marges Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.MargesPropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getMargesProperty()
		 * @generated
		 */
		EClass MARGES_PROPERTY = eINSTANCE.getMargesProperty();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGES_PROPERTY__LEVEL = eINSTANCE.getMargesProperty_Level();

		/**
		 * The meta object literal for the '<em><b>Alignement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARGES_PROPERTY__ALIGNEMENT = eINSTANCE.getMargesProperty_Alignement();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.MarginImpl <em>Margin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.MarginImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getMargin()
		 * @generated
		 */
		EClass MARGIN = eINSTANCE.getMargin();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.PaddingImpl <em>Padding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.PaddingImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPadding()
		 * @generated
		 */
		EClass PADDING = eINSTANCE.getPadding();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BackgroundImpl <em>Background</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BackgroundImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBackground()
		 * @generated
		 */
		EClass BACKGROUND = eINSTANCE.getBackground();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BACKGROUND__COLOR = eINSTANCE.getBackground_Color();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BorderPropertyImpl <em>Border Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BorderPropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBorderProperty()
		 * @generated
		 */
		EClass BORDER_PROPERTY = eINSTANCE.getBorderProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BorderImpl <em>Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BorderImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBorder()
		 * @generated
		 */
		EClass BORDER = eINSTANCE.getBorder();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ColoredBorderImpl <em>Colored Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ColoredBorderImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getColoredBorder()
		 * @generated
		 */
		EClass COLORED_BORDER = eINSTANCE.getColoredBorder();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORED_BORDER__COLOR = eINSTANCE.getColoredBorder_Color();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.DisplayPropertyImpl <em>Display Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.DisplayPropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplayProperty()
		 * @generated
		 */
		EClass DISPLAY_PROPERTY = eINSTANCE.getDisplayProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.Display1Impl <em>Display1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.Display1Impl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplay1()
		 * @generated
		 */
		EClass DISPLAY1 = eINSTANCE.getDisplay1();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.Display2Impl <em>Display2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.Display2Impl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplay2()
		 * @generated
		 */
		EClass DISPLAY2 = eINSTANCE.getDisplay2();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.Display3Impl <em>Display3</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.Display3Impl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplay3()
		 * @generated
		 */
		EClass DISPLAY3 = eINSTANCE.getDisplay3();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.Display4Impl <em>Display4</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.Display4Impl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplay4()
		 * @generated
		 */
		EClass DISPLAY4 = eINSTANCE.getDisplay4();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ButtonPropertyImpl <em>Button Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ButtonPropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonProperty()
		 * @generated
		 */
		EClass BUTTON_PROPERTY = eINSTANCE.getButtonProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ImagePropertyImpl <em>Image Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ImagePropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getImageProperty()
		 * @generated
		 */
		EClass IMAGE_PROPERTY = eINSTANCE.getImageProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ImageShapeImpl <em>Image Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ImageShapeImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getImageShape()
		 * @generated
		 */
		EClass IMAGE_SHAPE = eINSTANCE.getImageShape();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ImageAligningImpl <em>Image Aligning</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ImageAligningImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getImageAligning()
		 * @generated
		 */
		EClass IMAGE_ALIGNING = eINSTANCE.getImageAligning();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.RoundedImpl <em>Rounded</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.RoundedImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getRounded()
		 * @generated
		 */
		EClass ROUNDED = eINSTANCE.getRounded();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ThumbnailImpl <em>Thumbnail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ThumbnailImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getThumbnail()
		 * @generated
		 */
		EClass THUMBNAIL = eINSTANCE.getThumbnail();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.CircleImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.FloatImpl <em>Float</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.FloatImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getFloat()
		 * @generated
		 */
		EClass FLOAT = eINSTANCE.getFloat();

		/**
		 * The meta object literal for the '<em><b>Alignement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOAT__ALIGNEMENT = eINSTANCE.getFloat_Alignement();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.CenterImpl <em>Center</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.CenterImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCenter()
		 * @generated
		 */
		EClass CENTER = eINSTANCE.getCenter();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ResponsiveImpl <em>Responsive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ResponsiveImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getResponsive()
		 * @generated
		 */
		EClass RESPONSIVE = eINSTANCE.getResponsive();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ButtonStyleImpl <em>Button Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ButtonStyleImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonStyle()
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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ButtonSizeImpl <em>Button Size</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ButtonSizeImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonSize()
		 * @generated
		 */
		EClass BUTTON_SIZE = eINSTANCE.getButtonSize();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_SIZE__SIZE = eINSTANCE.getButtonSize_Size();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ButtonLinkImpl <em>Button Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ButtonLinkImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonLink()
		 * @generated
		 */
		EClass BUTTON_LINK = eINSTANCE.getButtonLink();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ButtonStateImpl <em>Button State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ButtonStateImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonState()
		 * @generated
		 */
		EClass BUTTON_STATE = eINSTANCE.getButtonState();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.DisabledImpl <em>Disabled</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.DisabledImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisabled()
		 * @generated
		 */
		EClass DISABLED = eINSTANCE.getDisabled();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ActiveImpl <em>Active</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ActiveImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getActive()
		 * @generated
		 */
		EClass ACTIVE = eINSTANCE.getActive();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ButtonImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButton()
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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.PageContentImpl <em>Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.PageContentImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPageContent()
		 * @generated
		 */
		EClass PAGE_CONTENT = eINSTANCE.getPageContent();

		/**
		 * The meta object literal for the '<em><b>General Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTENT__GENERAL_PROPERTIES = eINSTANCE.getPageContent_GeneralProperties();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TextPageContentImpl <em>Text Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TextPageContentImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextPageContent()
		 * @generated
		 */
		EClass TEXT_PAGE_CONTENT = eINSTANCE.getTextPageContent();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ListElementImpl <em>List Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ListElementImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getListElement()
		 * @generated
		 */
		EClass LIST_ELEMENT = eINSTANCE.getListElement();

		/**
		 * The meta object literal for the '<em><b>Listitems</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ELEMENT__LISTITEMS = eINSTANCE.getListElement_Listitems();

		/**
		 * The meta object literal for the '<em><b>Listproperty</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ELEMENT__LISTPROPERTY = eINSTANCE.getListElement_Listproperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.OrderListImpl <em>Order List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.OrderListImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getOrderList()
		 * @generated
		 */
		EClass ORDER_LIST = eINSTANCE.getOrderList();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.UnOrderedListImpl <em>Un Ordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.UnOrderedListImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getUnOrderedList()
		 * @generated
		 */
		EClass UN_ORDERED_LIST = eINSTANCE.getUnOrderedList();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ListItemImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Listitemelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM__LISTITEMELEMENTS = eINSTANCE.getListItem_Listitemelements();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIST_ITEM__ACTIVE = eINSTANCE.getListItem_Active();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.ListItemElement <em>List Item Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.ListItemElement
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getListItemElement()
		 * @generated
		 */
		EClass LIST_ITEM_ELEMENT = eINSTANCE.getListItemElement();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.NavigationImpl <em>Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.NavigationImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getNavigation()
		 * @generated
		 */
		EClass NAVIGATION = eINSTANCE.getNavigation();

		/**
		 * The meta object literal for the '<em><b>Listelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__LISTELEMENT = eINSTANCE.getNavigation_Listelement();

		/**
		 * The meta object literal for the '<em><b>Navbar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__NAVBAR = eINSTANCE.getNavigation_Navbar();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__LINKS = eINSTANCE.getNavigation_Links();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.CenteredImpl <em>Centered</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.CenteredImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCentered()
		 * @generated
		 */
		EClass CENTERED = eINSTANCE.getCentered();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ListPropertyImpl <em>List Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ListPropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getListProperty()
		 * @generated
		 */
		EClass LIST_PROPERTY = eINSTANCE.getListProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BasicListImpl <em>Basic List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BasicListImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBasicList()
		 * @generated
		 */
		EClass BASIC_LIST = eINSTANCE.getBasicList();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.HorizontalListImpl <em>Horizontal List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.HorizontalListImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getHorizontalList()
		 * @generated
		 */
		EClass HORIZONTAL_LIST = eINSTANCE.getHorizontalList();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.NavBarPropertyImpl <em>Nav Bar Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.NavBarPropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getNavBarProperty()
		 * @generated
		 */
		EClass NAV_BAR_PROPERTY = eINSTANCE.getNavBarProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BasicImpl <em>Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BasicImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBasic()
		 * @generated
		 */
		EClass BASIC = eINSTANCE.getBasic();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.VerticalImpl <em>Vertical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.VerticalImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getVertical()
		 * @generated
		 */
		EClass VERTICAL = eINSTANCE.getVertical();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.EmphasisImpl <em>Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.EmphasisImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getEmphasis()
		 * @generated
		 */
		EClass EMPHASIS = eINSTANCE.getEmphasis();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ItalicPropertyImpl <em>Italic Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ItalicPropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getItalicProperty()
		 * @generated
		 */
		EClass ITALIC_PROPERTY = eINSTANCE.getItalicProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BoldImpl <em>Bold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BoldImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBold()
		 * @generated
		 */
		EClass BOLD = eINSTANCE.getBold();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.LinkImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getLink()
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
		 * The meta object literal for the '<em><b>Buttonproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__BUTTONPROPERTIES = eINSTANCE.getLink_Buttonproperties();

		/**
		 * The meta object literal for the '<em><b>Badgeproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__BADGEPROPERTIES = eINSTANCE.getLink_Badgeproperties();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.StrongImpl <em>Strong</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.StrongImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getStrong()
		 * @generated
		 */
		EClass STRONG = eINSTANCE.getStrong();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ItalicImpl <em>Italic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ItalicImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getItalic()
		 * @generated
		 */
		EClass ITALIC = eINSTANCE.getItalic();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TextContainableImpl <em>Text Containable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TextContainableImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextContainable()
		 * @generated
		 */
		EClass TEXT_CONTAINABLE = eINSTANCE.getTextContainable();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.TextNested <em>Text Nested</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.TextNested
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextNested()
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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.TextNestedElement <em>Text Nested Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.TextNestedElement
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextNestedElement()
		 * @generated
		 */
		EClass TEXT_NESTED_ELEMENT = eINSTANCE.getTextNestedElement();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BrandImpl <em>Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BrandImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBrand()
		 * @generated
		 */
		EClass BRAND = eINSTANCE.getBrand();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.LinkPropertyImpl <em>Link Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.LinkPropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getLinkProperty()
		 * @generated
		 */
		EClass LINK_PROPERTY = eINSTANCE.getLinkProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.LinkBrandImpl <em>Link Brand</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.LinkBrandImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getLinkBrand()
		 * @generated
		 */
		EClass LINK_BRAND = eINSTANCE.getLinkBrand();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TableImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Tablesections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLESECTIONS = eINSTANCE.getTable_Tablesections();

		/**
		 * The meta object literal for the '<em><b>Tableproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLEPROPERTIES = eINSTANCE.getTable_Tableproperties();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TheadImpl <em>Thead</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TheadImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getThead()
		 * @generated
		 */
		EClass THEAD = eINSTANCE.getThead();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TbodyImpl <em>Tbody</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TbodyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTbody()
		 * @generated
		 */
		EClass TBODY = eINSTANCE.getTbody();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TfootImpl <em>Tfoot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TfootImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTfoot()
		 * @generated
		 */
		EClass TFOOT = eINSTANCE.getTfoot();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TableSectionImpl <em>Table Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TableSectionImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTableSection()
		 * @generated
		 */
		EClass TABLE_SECTION = eINSTANCE.getTableSection();

		/**
		 * The meta object literal for the '<em><b>Tablerows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_SECTION__TABLEROWS = eINSTANCE.getTableSection_Tablerows();

		/**
		 * The meta object literal for the '<em><b>Generals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_SECTION__GENERALS = eINSTANCE.getTableSection_Generals();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TableRowImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Tablecells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__TABLECELLS = eINSTANCE.getTableRow_Tablecells();

		/**
		 * The meta object literal for the '<em><b>Generals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__GENERALS = eINSTANCE.getTableRow_Generals();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TableCellImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__ALIGNMENT = eINSTANCE.getTableCell_Alignment();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__SPAN = eINSTANCE.getTableCell_Span();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TablePropertyImpl <em>Table Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TablePropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTableProperty()
		 * @generated
		 */
		EClass TABLE_PROPERTY = eINSTANCE.getTableProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BasicTableImpl <em>Basic Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BasicTableImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBasicTable()
		 * @generated
		 */
		EClass BASIC_TABLE = eINSTANCE.getBasicTable();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.StripedRowsImpl <em>Striped Rows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.StripedRowsImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getStripedRows()
		 * @generated
		 */
		EClass STRIPED_ROWS = eINSTANCE.getStripedRows();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BorderedTableImpl <em>Bordered Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BorderedTableImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBorderedTable()
		 * @generated
		 */
		EClass BORDERED_TABLE = eINSTANCE.getBorderedTable();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.HoverRowsImpl <em>Hover Rows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.HoverRowsImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getHoverRows()
		 * @generated
		 */
		EClass HOVER_ROWS = eINSTANCE.getHoverRows();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.DarkTableImpl <em>Dark Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.DarkTableImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDarkTable()
		 * @generated
		 */
		EClass DARK_TABLE = eINSTANCE.getDarkTable();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BlockQuoteImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBlockQuote()
		 * @generated
		 */
		EClass BLOCK_QUOTE = eINSTANCE.getBlockQuote();

		/**
		 * The meta object literal for the '<em><b>Pagecontents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_QUOTE__PAGECONTENTS = eINSTANCE.getBlockQuote_Pagecontents();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.CodeBlockImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Codelines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__CODELINES = eINSTANCE.getCodeBlock_Codelines();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.CodeLineImpl <em>Code Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.CodeLineImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getCodeLine()
		 * @generated
		 */
		EClass CODE_LINE = eINSTANCE.getCodeLine();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LINE__CONTENT = eINSTANCE.getCodeLine_Content();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.HorizontalLineImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getHorizontalLine()
		 * @generated
		 */
		EClass HORIZONTAL_LINE = eINSTANCE.getHorizontalLine();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ButtonOutLineImpl <em>Button Out Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ButtonOutLineImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonOutLine()
		 * @generated
		 */
		EClass BUTTON_OUT_LINE = eINSTANCE.getButtonOutLine();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUTTON_OUT_LINE__COLOR = eINSTANCE.getButtonOutLine_Color();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ButtonSpinnerImpl <em>Button Spinner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ButtonSpinnerImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonSpinner()
		 * @generated
		 */
		EClass BUTTON_SPINNER = eINSTANCE.getButtonSpinner();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.SpanImpl <em>Span</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.SpanImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getSpan()
		 * @generated
		 */
		EClass SPAN = eINSTANCE.getSpan();

		/**
		 * The meta object literal for the '<em><b>Badgeproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN__BADGEPROPERTIES = eINSTANCE.getSpan_Badgeproperties();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BadgePropertyImpl <em>Badge Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BadgePropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBadgeProperty()
		 * @generated
		 */
		EClass BADGE_PROPERTY = eINSTANCE.getBadgeProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BadgeStyleImpl <em>Badge Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BadgeStyleImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBadgeStyle()
		 * @generated
		 */
		EClass BADGE_STYLE = eINSTANCE.getBadgeStyle();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BADGE_STYLE__COLOR = eINSTANCE.getBadgeStyle_Color();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BadgePillImpl <em>Badge Pill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BadgePillImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBadgePill()
		 * @generated
		 */
		EClass BADGE_PILL = eINSTANCE.getBadgePill();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.AlertPropertyImpl <em>Alert Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.AlertPropertyImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getAlertProperty()
		 * @generated
		 */
		EClass ALERT_PROPERTY = eINSTANCE.getAlertProperty();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.AlertStyleImpl <em>Alert Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.AlertStyleImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getAlertStyle()
		 * @generated
		 */
		EClass ALERT_STYLE = eINSTANCE.getAlertStyle();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.AlertAnimatedImpl <em>Alert Animated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.AlertAnimatedImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getAlertAnimated()
		 * @generated
		 */
		EClass ALERT_ANIMATED = eINSTANCE.getAlertAnimated();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.AlertLinkImpl <em>Alert Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.AlertLinkImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getAlertLink()
		 * @generated
		 */
		EClass ALERT_LINK = eINSTANCE.getAlertLink();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.Color
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.Size <em>Size</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.Size
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getSize()
		 * @generated
		 */
		EEnum SIZE = eINSTANCE.getSize();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.Alignement <em>Alignement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.Alignement
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getAlignement()
		 * @generated
		 */
		EEnum ALIGNEMENT = eINSTANCE.getAlignement();

	}

} //BstrapPackage
