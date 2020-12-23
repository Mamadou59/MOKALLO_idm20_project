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
	int PAGE_CONTENT = 53;

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
	 * The feature id for the '<em><b>Textcontainers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TEXTCONTAINERS = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 2;

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
	 * The feature id for the '<em><b>Textcontainers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER__TEXTCONTAINERS = CONTAINER__TEXTCONTAINERS;

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
	 * The feature id for the '<em><b>Textcontainers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER__TEXTCONTAINERS = CONTAINER__TEXTCONTAINERS;

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
	int TEXT_CONTAINER__GENERAL_PROPERTIES = PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__TEXTELEMENTS = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

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
	int TEXT_ELEMENTS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Text Elements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENTS_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BlockquoteImpl <em>Blockquote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BlockquoteImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBlockquote()
	 * @generated
	 */
	int BLOCKQUOTE = 10;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__GENERAL_PROPERTIES = PAGE_CONTENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Pagecontents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE__PAGECONTENTS = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blockquote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blockquote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ContainableTextElementImpl <em>Containable Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ContainableTextElementImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getContainableTextElement()
	 * @generated
	 */
	int CONTAINABLE_TEXT_ELEMENT = 14;

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
	int COMPOSITE_TEXT_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT__GENERAL_PROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 1;

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
	int URL_BASED_LINK = 12;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__GENERAL_PROPERTIES = COMPOSITE_TEXT_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__SUB_TEXT_ELEMENTS = COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Url Based Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK_FEATURE_COUNT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 0;

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
	int IMAGE = 13;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__GENERAL_PROPERTIES = URL_BASED_LINK__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Sub Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SUB_TEXT_ELEMENTS = URL_BASED_LINK__SUB_TEXT_ELEMENTS;

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
	int PROPERTY_CLASS = 16;

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
	int GENERAL = 15;

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
	int MARGES_PROPERTY = 17;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY__LEVEL = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Marges Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 1;

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
	int MARGIN = 18;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGIN__LEVEL = MARGES_PROPERTY__LEVEL;

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
	int PADDING = 19;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PADDING__LEVEL = MARGES_PROPERTY__LEVEL;

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
	int BACKGROUND = 20;

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
	int BORDER_PROPERTY = 21;

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
	int BORDER = 22;

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
	int COLORED_BORDER = 23;

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
	int DISPLAY_PROPERTY = 24;

	/**
	 * The number of structural features of the '<em>Display Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Display Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISPLAY_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.Display1Impl <em>Display1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.Display1Impl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDisplay1()
	 * @generated
	 */
	int DISPLAY1 = 25;

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
	int DISPLAY2 = 26;

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
	int DISPLAY3 = 27;

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
	int DISPLAY4 = 28;

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
	int BUTTON_PROPERTY = 29;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonStyleImpl <em>Button Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonStyleImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonStyle()
	 * @generated
	 */
	int BUTTON_STYLE = 46;

	/**
	 * The number of structural features of the '<em>Button Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE_FEATURE_COUNT = BUTTON_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_STYLE_OPERATION_COUNT = BUTTON_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BasicImpl <em>Basic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BasicImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBasic()
	 * @generated
	 */
	int BASIC = 30;

	/**
	 * The number of structural features of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_FEATURE_COUNT = BUTTON_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Basic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OPERATION_COUNT = BUTTON_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.PrimaryImpl <em>Primary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.PrimaryImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPrimary()
	 * @generated
	 */
	int PRIMARY = 31;

	/**
	 * The number of structural features of the '<em>Primary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_FEATURE_COUNT = BUTTON_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OPERATION_COUNT = BUTTON_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.SecondaryImpl <em>Secondary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.SecondaryImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getSecondary()
	 * @generated
	 */
	int SECONDARY = 32;

	/**
	 * The number of structural features of the '<em>Secondary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_FEATURE_COUNT = BUTTON_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Secondary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_OPERATION_COUNT = BUTTON_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.DarkImpl <em>Dark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.DarkImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDark()
	 * @generated
	 */
	int DARK = 33;

	/**
	 * The number of structural features of the '<em>Dark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_FEATURE_COUNT = BUTTON_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_OPERATION_COUNT = BUTTON_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.InfoImpl <em>Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.InfoImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getInfo()
	 * @generated
	 */
	int INFO = 34;

	/**
	 * The number of structural features of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_FEATURE_COUNT = BUTTON_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_OPERATION_COUNT = BUTTON_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.LightImpl <em>Light</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.LightImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getLight()
	 * @generated
	 */
	int LIGHT = 35;

	/**
	 * The number of structural features of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_FEATURE_COUNT = BUTTON_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Light</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIGHT_OPERATION_COUNT = BUTTON_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ImagePropertyImpl <em>Image Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ImagePropertyImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getImageProperty()
	 * @generated
	 */
	int IMAGE_PROPERTY = 36;

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
	int IMAGE_SHAPE = 37;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.SuccesImpl <em>Succes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.SuccesImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getSucces()
	 * @generated
	 */
	int SUCCES = 38;

	/**
	 * The number of structural features of the '<em>Succes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCES_FEATURE_COUNT = BUTTON_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Succes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUCCES_OPERATION_COUNT = BUTTON_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ImageAligningImpl <em>Image Aligning</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ImageAligningImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getImageAligning()
	 * @generated
	 */
	int IMAGE_ALIGNING = 39;

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
	int ROUNDED = 40;

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
	int THUMBNAIL = 41;

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
	int CIRCLE = 42;

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
	int FLOAT = 43;

	/**
	 * The number of structural features of the '<em>Float</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOAT_FEATURE_COUNT = IMAGE_ALIGNING_FEATURE_COUNT + 0;

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
	int CENTER = 44;

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
	int RESPONSIVE = 45;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonSizeImpl <em>Button Size</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonSizeImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonSize()
	 * @generated
	 */
	int BUTTON_SIZE = 47;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.LinkImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 48;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = BUTTON_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = BUTTON_STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ButtonStateImpl <em>Button State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ButtonStateImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getButtonState()
	 * @generated
	 */
	int BUTTON_STATE = 49;

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
	int DISABLED = 50;

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
	int ACTIVE = 51;

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
	int BUTTON = 52;

	/**
	 * The feature id for the '<em><b>General Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__GENERAL_PROPERTIES = CONTAINABLE_TEXT_ELEMENT__GENERAL_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Buttonproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__BUTTONPROPERTIES = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.Color
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 54;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.Size <em>Size</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.Size
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getSize()
	 * @generated
	 */
	int SIZE = 55;

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
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Container#getTextcontainers <em>Textcontainers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textcontainers</em>'.
	 * @see idm.bstrap.mm.bstrap.Container#getTextcontainers()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Textcontainers();

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
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Blockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockquote</em>'.
	 * @see idm.bstrap.mm.bstrap.Blockquote
	 * @generated
	 */
	EClass getBlockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Blockquote#getPagecontents <em>Pagecontents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pagecontents</em>'.
	 * @see idm.bstrap.mm.bstrap.Blockquote#getPagecontents()
	 * @see #getBlockquote()
	 * @generated
	 */
	EReference getBlockquote_Pagecontents();

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
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.CompositeTextElement#getSubTextElements <em>Sub Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Text Elements</em>'.
	 * @see idm.bstrap.mm.bstrap.CompositeTextElement#getSubTextElements()
	 * @see #getCompositeTextElement()
	 * @generated
	 */
	EReference getCompositeTextElement_SubTextElements();

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
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic</em>'.
	 * @see idm.bstrap.mm.bstrap.Basic
	 * @generated
	 */
	EClass getBasic();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Primary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary</em>'.
	 * @see idm.bstrap.mm.bstrap.Primary
	 * @generated
	 */
	EClass getPrimary();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Secondary <em>Secondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary</em>'.
	 * @see idm.bstrap.mm.bstrap.Secondary
	 * @generated
	 */
	EClass getSecondary();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Dark <em>Dark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dark</em>'.
	 * @see idm.bstrap.mm.bstrap.Dark
	 * @generated
	 */
	EClass getDark();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Info <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info</em>'.
	 * @see idm.bstrap.mm.bstrap.Info
	 * @generated
	 */
	EClass getInfo();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Light <em>Light</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Light</em>'.
	 * @see idm.bstrap.mm.bstrap.Light
	 * @generated
	 */
	EClass getLight();

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
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Succes <em>Succes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Succes</em>'.
	 * @see idm.bstrap.mm.bstrap.Succes
	 * @generated
	 */
	EClass getSucces();

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
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see idm.bstrap.mm.bstrap.Link
	 * @generated
	 */
	EClass getLink();

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
		 * The meta object literal for the '<em><b>Textcontainers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__TEXTCONTAINERS = eINSTANCE.getContainer_Textcontainers();

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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BlockquoteImpl <em>Blockquote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BlockquoteImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBlockquote()
		 * @generated
		 */
		EClass BLOCKQUOTE = eINSTANCE.getBlockquote();

		/**
		 * The meta object literal for the '<em><b>Pagecontents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCKQUOTE__PAGECONTENTS = eINSTANCE.getBlockquote_Pagecontents();

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
		 * The meta object literal for the '<em><b>Sub Text Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS = eINSTANCE.getCompositeTextElement_SubTextElements();

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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BasicImpl <em>Basic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BasicImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBasic()
		 * @generated
		 */
		EClass BASIC = eINSTANCE.getBasic();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.PrimaryImpl <em>Primary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.PrimaryImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPrimary()
		 * @generated
		 */
		EClass PRIMARY = eINSTANCE.getPrimary();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.SecondaryImpl <em>Secondary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.SecondaryImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getSecondary()
		 * @generated
		 */
		EClass SECONDARY = eINSTANCE.getSecondary();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.DarkImpl <em>Dark</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.DarkImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDark()
		 * @generated
		 */
		EClass DARK = eINSTANCE.getDark();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.InfoImpl <em>Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.InfoImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getInfo()
		 * @generated
		 */
		EClass INFO = eINSTANCE.getInfo();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.LightImpl <em>Light</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.LightImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getLight()
		 * @generated
		 */
		EClass LIGHT = eINSTANCE.getLight();

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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.SuccesImpl <em>Succes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.SuccesImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getSucces()
		 * @generated
		 */
		EClass SUCCES = eINSTANCE.getSucces();

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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.LinkImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

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

	}

} //BstrapPackage
