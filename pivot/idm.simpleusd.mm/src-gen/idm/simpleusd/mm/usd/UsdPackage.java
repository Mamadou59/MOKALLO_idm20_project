/**
 */
package idm.simpleusd.mm.usd;

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
 * @see idm.simpleusd.mm.usd.UsdFactory
 * @model kind="package"
 * @generated
 */
public interface UsdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "usd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/usd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "usd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UsdPackage eINSTANCE = idm.simpleusd.mm.usd.impl.UsdPackageImpl.init();

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.PageImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getPage()
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
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONTENTS = 1;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.PageContentImpl <em>Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.PageContentImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getPageContent()
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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.TextContainerImpl <em>Text Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.TextContainerImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTextContainer()
	 * @generated
	 */
	int TEXT_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTAINER__TEXT_ELEMENTS = PAGE_CONTENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.ParagraphImpl <em>Paragraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.ParagraphImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getParagraph()
	 * @generated
	 */
	int PARAGRAPH = 3;

	/**
	 * The feature id for the '<em><b>Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH__TEXT_ELEMENTS = TEXT_CONTAINER__TEXT_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.TitleImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 4;

	/**
	 * The feature id for the '<em><b>Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__TEXT_ELEMENTS = TEXT_CONTAINER__TEXT_ELEMENTS;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.TextElement <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.TextElement
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 5;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.TextImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 6;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.ContainableTextElementImpl <em>Containable Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.ContainableTextElementImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getContainableTextElement()
	 * @generated
	 */
	int CONTAINABLE_TEXT_ELEMENT = 33;

	/**
	 * The number of structural features of the '<em>Containable Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Containable Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.CompositeTextElementImpl <em>Composite Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.CompositeTextElementImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getCompositeTextElement()
	 * @generated
	 */
	int COMPOSITE_TEXT_ELEMENT = 22;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.UrlBasedLinkImpl <em>Url Based Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.UrlBasedLinkImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getUrlBasedLink()
	 * @generated
	 */
	int URL_BASED_LINK = 7;

	/**
	 * The feature id for the '<em><b>Sub Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int URL_BASED_LINK__SUB_TEXT_ELEMENTS = COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.LinkImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 8;

	/**
	 * The feature id for the '<em><b>Sub Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SUB_TEXT_ELEMENTS = URL_BASED_LINK__SUB_TEXT_ELEMENTS;

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
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = URL_BASED_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = URL_BASED_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.ImageImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 9;

	/**
	 * The feature id for the '<em><b>Sub Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__SUB_TEXT_ELEMENTS = URL_BASED_LINK__SUB_TEXT_ELEMENTS;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.CodeImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 10;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.StrongEmphasisImpl <em>Strong Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.StrongEmphasisImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getStrongEmphasis()
	 * @generated
	 */
	int STRONG_EMPHASIS = 11;

	/**
	 * The feature id for the '<em><b>Sub Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EMPHASIS__SUB_TEXT_ELEMENTS = COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Strong Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EMPHASIS_FEATURE_COUNT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strong Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_EMPHASIS_OPERATION_COUNT = COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.ItalicEmphasisImpl <em>Italic Emphasis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.ItalicEmphasisImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getItalicEmphasis()
	 * @generated
	 */
	int ITALIC_EMPHASIS = 12;

	/**
	 * The feature id for the '<em><b>Sub Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_EMPHASIS__SUB_TEXT_ELEMENTS = COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS;

	/**
	 * The number of structural features of the '<em>Italic Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_EMPHASIS_FEATURE_COUNT = COMPOSITE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Italic Emphasis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITALIC_EMPHASIS_OPERATION_COUNT = COMPOSITE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.ListElementImpl <em>List Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.ListElementImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getListElement()
	 * @generated
	 */
	int LIST_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT__ITEMS = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ELEMENT_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.ListItemImpl <em>List Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.ListItemImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getListItem()
	 * @generated
	 */
	int LIST_ITEM = 14;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>List Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.ListItemElement <em>List Item Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.ListItemElement
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getListItemElement()
	 * @generated
	 */
	int LIST_ITEM_ELEMENT = 15;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.OrderedListImpl <em>Ordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.OrderedListImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getOrderedList()
	 * @generated
	 */
	int ORDERED_LIST = 16;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST__ITEMS = LIST_ELEMENT__ITEMS;

	/**
	 * The number of structural features of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LIST_OPERATION_COUNT = LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.UnorderedListImpl <em>Unordered List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.UnorderedListImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getUnorderedList()
	 * @generated
	 */
	int UNORDERED_LIST = 17;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST__ITEMS = LIST_ELEMENT__ITEMS;

	/**
	 * The number of structural features of the '<em>Unordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_FEATURE_COUNT = LIST_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unordered List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNORDERED_LIST_OPERATION_COUNT = LIST_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.BlockQuoteImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getBlockQuote()
	 * @generated
	 */
	int BLOCK_QUOTE = 18;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE__CONTENTS = LIST_ITEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_FEATURE_COUNT = LIST_ITEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block Quote</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_QUOTE_OPERATION_COUNT = LIST_ITEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.CodeBlockImpl <em>Code Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.CodeBlockImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getCodeBlock()
	 * @generated
	 */
	int CODE_BLOCK = 19;

	/**
	 * The feature id for the '<em><b>Code Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK__CODE_LINES = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_BLOCK_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.CodeLineImpl <em>Code Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.CodeLineImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getCodeLine()
	 * @generated
	 */
	int CODE_LINE = 20;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LINE__TEXT = 0;

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
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.HorizontalLineImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getHorizontalLine()
	 * @generated
	 */
	int HORIZONTAL_LINE = 21;

	/**
	 * The number of structural features of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Horizontal Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_LINE_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.TableImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 23;

	/**
	 * The feature id for the '<em><b>Table Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__TABLE_SECTIONS = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.TableSectionImpl <em>Table Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.TableSectionImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableSection()
	 * @generated
	 */
	int TABLE_SECTION = 24;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION__ROWS = 0;

	/**
	 * The number of structural features of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.TableBodyImpl <em>Table Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.TableBodyImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableBody()
	 * @generated
	 */
	int TABLE_BODY = 25;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The number of structural features of the '<em>Table Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_BODY_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.TableSeparatorImpl <em>Table Separator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.TableSeparatorImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableSeparator()
	 * @generated
	 */
	int TABLE_SEPARATOR = 26;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The number of structural features of the '<em>Table Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Separator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_SEPARATOR_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.TableHeadImpl <em>Table Head</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.TableHeadImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableHead()
	 * @generated
	 */
	int TABLE_HEAD = 27;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD__ROWS = TABLE_SECTION__ROWS;

	/**
	 * The number of structural features of the '<em>Table Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_FEATURE_COUNT = TABLE_SECTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Table Head</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_HEAD_OPERATION_COUNT = TABLE_SECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.TableRowImpl <em>Table Row</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.TableRowImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableRow()
	 * @generated
	 */
	int TABLE_ROW = 28;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW__CELLS = 0;

	/**
	 * The number of structural features of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Table Row</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_ROW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.TableCellImpl <em>Table Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.TableCellImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableCell()
	 * @generated
	 */
	int TABLE_CELL = 29;

	/**
	 * The feature id for the '<em><b>Text Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__TEXT_ELEMENTS = TEXT_CONTAINER__TEXT_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Alignement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL__ALIGNEMENT = TEXT_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_FEATURE_COUNT = TEXT_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_CELL_OPERATION_COUNT = TEXT_CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.ClickableElementImpl <em>Clickable Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.ClickableElementImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getClickableElement()
	 * @generated
	 */
	int CLICKABLE_ELEMENT = 32;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT__TEXT_CONTENT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT__TYPE = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT__URL = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Clickable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT_FEATURE_COUNT = CONTAINABLE_TEXT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Clickable Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLICKABLE_ELEMENT_OPERATION_COUNT = CONTAINABLE_TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.ButtonImpl <em>Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.ButtonImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getButton()
	 * @generated
	 */
	int BUTTON = 30;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TEXT_CONTENT = CLICKABLE_ELEMENT__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__TYPE = CLICKABLE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON__URL = CLICKABLE_ELEMENT__URL;

	/**
	 * The number of structural features of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_FEATURE_COUNT = CLICKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUTTON_OPERATION_COUNT = CLICKABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.NavigationImpl <em>Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.NavigationImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getNavigation()
	 * @generated
	 */
	int NAVIGATION = 31;

	/**
	 * The feature id for the '<em><b>Text Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__TEXT_CONTENT = CLICKABLE_ELEMENT__TEXT_CONTENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__TYPE = CLICKABLE_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__URL = CLICKABLE_ELEMENT__URL;

	/**
	 * The feature id for the '<em><b>Grouped Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION__GROUPED_ITEMS = CLICKABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_FEATURE_COUNT = CLICKABLE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_OPERATION_COUNT = CLICKABLE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.impl.SectionImpl <em>Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.impl.SectionImpl
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getSection()
	 * @generated
	 */
	int SECTION = 34;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION__CONTENTS = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.simpleusd.mm.usd.TableCellAlignement <em>Table Cell Alignement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.simpleusd.mm.usd.TableCellAlignement
	 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableCellAlignement()
	 * @generated
	 */
	int TABLE_CELL_ALIGNEMENT = 35;

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see idm.simpleusd.mm.usd.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link idm.simpleusd.mm.usd.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see idm.simpleusd.mm.usd.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.Page#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see idm.simpleusd.mm.usd.Page#getContents()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Contents();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Content</em>'.
	 * @see idm.simpleusd.mm.usd.PageContent
	 * @generated
	 */
	EClass getPageContent();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Container</em>'.
	 * @see idm.simpleusd.mm.usd.TextContainer
	 * @generated
	 */
	EClass getTextContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.TextContainer#getTextElements <em>Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text Elements</em>'.
	 * @see idm.simpleusd.mm.usd.TextContainer#getTextElements()
	 * @see #getTextContainer()
	 * @generated
	 */
	EReference getTextContainer_TextElements();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph</em>'.
	 * @see idm.simpleusd.mm.usd.Paragraph
	 * @generated
	 */
	EClass getParagraph();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title</em>'.
	 * @see idm.simpleusd.mm.usd.Title
	 * @generated
	 */
	EClass getTitle();

	/**
	 * Returns the meta object for the attribute '{@link idm.simpleusd.mm.usd.Title#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see idm.simpleusd.mm.usd.Title#getLevel()
	 * @see #getTitle()
	 * @generated
	 */
	EAttribute getTitle_Level();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see idm.simpleusd.mm.usd.TextElement
	 * @generated
	 */
	EClass getTextElement();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see idm.simpleusd.mm.usd.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link idm.simpleusd.mm.usd.Text#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see idm.simpleusd.mm.usd.Text#getText()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Text();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.UrlBasedLink <em>Url Based Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Url Based Link</em>'.
	 * @see idm.simpleusd.mm.usd.UrlBasedLink
	 * @generated
	 */
	EClass getUrlBasedLink();

	/**
	 * Returns the meta object for the attribute '{@link idm.simpleusd.mm.usd.UrlBasedLink#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see idm.simpleusd.mm.usd.UrlBasedLink#getUrl()
	 * @see #getUrlBasedLink()
	 * @generated
	 */
	EAttribute getUrlBasedLink_Url();

	/**
	 * Returns the meta object for the attribute '{@link idm.simpleusd.mm.usd.UrlBasedLink#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see idm.simpleusd.mm.usd.UrlBasedLink#getTitle()
	 * @see #getUrlBasedLink()
	 * @generated
	 */
	EAttribute getUrlBasedLink_Title();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see idm.simpleusd.mm.usd.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see idm.simpleusd.mm.usd.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see idm.simpleusd.mm.usd.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.StrongEmphasis <em>Strong Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Emphasis</em>'.
	 * @see idm.simpleusd.mm.usd.StrongEmphasis
	 * @generated
	 */
	EClass getStrongEmphasis();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.ItalicEmphasis <em>Italic Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Italic Emphasis</em>'.
	 * @see idm.simpleusd.mm.usd.ItalicEmphasis
	 * @generated
	 */
	EClass getItalicEmphasis();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Element</em>'.
	 * @see idm.simpleusd.mm.usd.ListElement
	 * @generated
	 */
	EClass getListElement();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.ListElement#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see idm.simpleusd.mm.usd.ListElement#getItems()
	 * @see #getListElement()
	 * @generated
	 */
	EReference getListElement_Items();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item</em>'.
	 * @see idm.simpleusd.mm.usd.ListItem
	 * @generated
	 */
	EClass getListItem();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.ListItem#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see idm.simpleusd.mm.usd.ListItem#getElements()
	 * @see #getListItem()
	 * @generated
	 */
	EReference getListItem_Elements();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.ListItemElement <em>List Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Item Element</em>'.
	 * @see idm.simpleusd.mm.usd.ListItemElement
	 * @generated
	 */
	EClass getListItemElement();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered List</em>'.
	 * @see idm.simpleusd.mm.usd.OrderedList
	 * @generated
	 */
	EClass getOrderedList();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.UnorderedList <em>Unordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unordered List</em>'.
	 * @see idm.simpleusd.mm.usd.UnorderedList
	 * @generated
	 */
	EClass getUnorderedList();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.BlockQuote <em>Block Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Quote</em>'.
	 * @see idm.simpleusd.mm.usd.BlockQuote
	 * @generated
	 */
	EClass getBlockQuote();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.BlockQuote#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see idm.simpleusd.mm.usd.BlockQuote#getContents()
	 * @see #getBlockQuote()
	 * @generated
	 */
	EReference getBlockQuote_Contents();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Block</em>'.
	 * @see idm.simpleusd.mm.usd.CodeBlock
	 * @generated
	 */
	EClass getCodeBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.CodeBlock#getCodeLines <em>Code Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code Lines</em>'.
	 * @see idm.simpleusd.mm.usd.CodeBlock#getCodeLines()
	 * @see #getCodeBlock()
	 * @generated
	 */
	EReference getCodeBlock_CodeLines();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.CodeLine <em>Code Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Line</em>'.
	 * @see idm.simpleusd.mm.usd.CodeLine
	 * @generated
	 */
	EClass getCodeLine();

	/**
	 * Returns the meta object for the attribute '{@link idm.simpleusd.mm.usd.CodeLine#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see idm.simpleusd.mm.usd.CodeLine#getText()
	 * @see #getCodeLine()
	 * @generated
	 */
	EAttribute getCodeLine_Text();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.HorizontalLine <em>Horizontal Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Line</em>'.
	 * @see idm.simpleusd.mm.usd.HorizontalLine
	 * @generated
	 */
	EClass getHorizontalLine();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.CompositeTextElement <em>Composite Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Text Element</em>'.
	 * @see idm.simpleusd.mm.usd.CompositeTextElement
	 * @generated
	 */
	EClass getCompositeTextElement();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.CompositeTextElement#getSubTextElements <em>Sub Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Text Elements</em>'.
	 * @see idm.simpleusd.mm.usd.CompositeTextElement#getSubTextElements()
	 * @see #getCompositeTextElement()
	 * @generated
	 */
	EReference getCompositeTextElement_SubTextElements();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see idm.simpleusd.mm.usd.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.Table#getTableSections <em>Table Sections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table Sections</em>'.
	 * @see idm.simpleusd.mm.usd.Table#getTableSections()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_TableSections();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Section</em>'.
	 * @see idm.simpleusd.mm.usd.TableSection
	 * @generated
	 */
	EClass getTableSection();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.TableSection#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rows</em>'.
	 * @see idm.simpleusd.mm.usd.TableSection#getRows()
	 * @see #getTableSection()
	 * @generated
	 */
	EReference getTableSection_Rows();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.TableBody <em>Table Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Body</em>'.
	 * @see idm.simpleusd.mm.usd.TableBody
	 * @generated
	 */
	EClass getTableBody();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.TableSeparator <em>Table Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Separator</em>'.
	 * @see idm.simpleusd.mm.usd.TableSeparator
	 * @generated
	 */
	EClass getTableSeparator();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.TableHead <em>Table Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Head</em>'.
	 * @see idm.simpleusd.mm.usd.TableHead
	 * @generated
	 */
	EClass getTableHead();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Row</em>'.
	 * @see idm.simpleusd.mm.usd.TableRow
	 * @generated
	 */
	EClass getTableRow();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.TableRow#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see idm.simpleusd.mm.usd.TableRow#getCells()
	 * @see #getTableRow()
	 * @generated
	 */
	EReference getTableRow_Cells();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Cell</em>'.
	 * @see idm.simpleusd.mm.usd.TableCell
	 * @generated
	 */
	EClass getTableCell();

	/**
	 * Returns the meta object for the attribute '{@link idm.simpleusd.mm.usd.TableCell#getAlignement <em>Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignement</em>'.
	 * @see idm.simpleusd.mm.usd.TableCell#getAlignement()
	 * @see #getTableCell()
	 * @generated
	 */
	EAttribute getTableCell_Alignement();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Button</em>'.
	 * @see idm.simpleusd.mm.usd.Button
	 * @generated
	 */
	EClass getButton();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation</em>'.
	 * @see idm.simpleusd.mm.usd.Navigation
	 * @generated
	 */
	EClass getNavigation();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.Navigation#getGroupedItems <em>Grouped Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Grouped Items</em>'.
	 * @see idm.simpleusd.mm.usd.Navigation#getGroupedItems()
	 * @see #getNavigation()
	 * @generated
	 */
	EReference getNavigation_GroupedItems();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.ClickableElement <em>Clickable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clickable Element</em>'.
	 * @see idm.simpleusd.mm.usd.ClickableElement
	 * @generated
	 */
	EClass getClickableElement();

	/**
	 * Returns the meta object for the attribute '{@link idm.simpleusd.mm.usd.ClickableElement#getTextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Content</em>'.
	 * @see idm.simpleusd.mm.usd.ClickableElement#getTextContent()
	 * @see #getClickableElement()
	 * @generated
	 */
	EAttribute getClickableElement_TextContent();

	/**
	 * Returns the meta object for the attribute '{@link idm.simpleusd.mm.usd.ClickableElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see idm.simpleusd.mm.usd.ClickableElement#getType()
	 * @see #getClickableElement()
	 * @generated
	 */
	EAttribute getClickableElement_Type();

	/**
	 * Returns the meta object for the attribute '{@link idm.simpleusd.mm.usd.ClickableElement#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see idm.simpleusd.mm.usd.ClickableElement#getUrl()
	 * @see #getClickableElement()
	 * @generated
	 */
	EAttribute getClickableElement_Url();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.ContainableTextElement <em>Containable Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable Text Element</em>'.
	 * @see idm.simpleusd.mm.usd.ContainableTextElement
	 * @generated
	 */
	EClass getContainableTextElement();

	/**
	 * Returns the meta object for class '{@link idm.simpleusd.mm.usd.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section</em>'.
	 * @see idm.simpleusd.mm.usd.Section
	 * @generated
	 */
	EClass getSection();

	/**
	 * Returns the meta object for the containment reference list '{@link idm.simpleusd.mm.usd.Section#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see idm.simpleusd.mm.usd.Section#getContents()
	 * @see #getSection()
	 * @generated
	 */
	EReference getSection_Contents();

	/**
	 * Returns the meta object for enum '{@link idm.simpleusd.mm.usd.TableCellAlignement <em>Table Cell Alignement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Table Cell Alignement</em>'.
	 * @see idm.simpleusd.mm.usd.TableCellAlignement
	 * @generated
	 */
	EEnum getTableCellAlignement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UsdFactory getUsdFactory();

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
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.PageImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getPage()
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
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONTENTS = eINSTANCE.getPage_Contents();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.PageContentImpl <em>Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.PageContentImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getPageContent()
		 * @generated
		 */
		EClass PAGE_CONTENT = eINSTANCE.getPageContent();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.TextContainerImpl <em>Text Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.TextContainerImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTextContainer()
		 * @generated
		 */
		EClass TEXT_CONTAINER = eINSTANCE.getTextContainer();

		/**
		 * The meta object literal for the '<em><b>Text Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_CONTAINER__TEXT_ELEMENTS = eINSTANCE.getTextContainer_TextElements();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.ParagraphImpl <em>Paragraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.ParagraphImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getParagraph()
		 * @generated
		 */
		EClass PARAGRAPH = eINSTANCE.getParagraph();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.TitleImpl <em>Title</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.TitleImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTitle()
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
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.TextElement <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.TextElement
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.TextImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getText()
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
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.UrlBasedLinkImpl <em>Url Based Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.UrlBasedLinkImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getUrlBasedLink()
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
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.LinkImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.ImageImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.CodeImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.StrongEmphasisImpl <em>Strong Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.StrongEmphasisImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getStrongEmphasis()
		 * @generated
		 */
		EClass STRONG_EMPHASIS = eINSTANCE.getStrongEmphasis();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.ItalicEmphasisImpl <em>Italic Emphasis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.ItalicEmphasisImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getItalicEmphasis()
		 * @generated
		 */
		EClass ITALIC_EMPHASIS = eINSTANCE.getItalicEmphasis();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.ListElementImpl <em>List Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.ListElementImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getListElement()
		 * @generated
		 */
		EClass LIST_ELEMENT = eINSTANCE.getListElement();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ELEMENT__ITEMS = eINSTANCE.getListElement_Items();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.ListItemImpl <em>List Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.ListItemImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getListItem()
		 * @generated
		 */
		EClass LIST_ITEM = eINSTANCE.getListItem();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ITEM__ELEMENTS = eINSTANCE.getListItem_Elements();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.ListItemElement <em>List Item Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.ListItemElement
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getListItemElement()
		 * @generated
		 */
		EClass LIST_ITEM_ELEMENT = eINSTANCE.getListItemElement();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.OrderedListImpl <em>Ordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.OrderedListImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getOrderedList()
		 * @generated
		 */
		EClass ORDERED_LIST = eINSTANCE.getOrderedList();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.UnorderedListImpl <em>Unordered List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.UnorderedListImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getUnorderedList()
		 * @generated
		 */
		EClass UNORDERED_LIST = eINSTANCE.getUnorderedList();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.BlockQuoteImpl <em>Block Quote</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.BlockQuoteImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getBlockQuote()
		 * @generated
		 */
		EClass BLOCK_QUOTE = eINSTANCE.getBlockQuote();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_QUOTE__CONTENTS = eINSTANCE.getBlockQuote_Contents();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.CodeBlockImpl <em>Code Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.CodeBlockImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getCodeBlock()
		 * @generated
		 */
		EClass CODE_BLOCK = eINSTANCE.getCodeBlock();

		/**
		 * The meta object literal for the '<em><b>Code Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE_BLOCK__CODE_LINES = eINSTANCE.getCodeBlock_CodeLines();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.CodeLineImpl <em>Code Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.CodeLineImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getCodeLine()
		 * @generated
		 */
		EClass CODE_LINE = eINSTANCE.getCodeLine();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LINE__TEXT = eINSTANCE.getCodeLine_Text();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.HorizontalLineImpl <em>Horizontal Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.HorizontalLineImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getHorizontalLine()
		 * @generated
		 */
		EClass HORIZONTAL_LINE = eINSTANCE.getHorizontalLine();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.CompositeTextElementImpl <em>Composite Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.CompositeTextElementImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getCompositeTextElement()
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
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.TableImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Table Sections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__TABLE_SECTIONS = eINSTANCE.getTable_TableSections();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.TableSectionImpl <em>Table Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.TableSectionImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableSection()
		 * @generated
		 */
		EClass TABLE_SECTION = eINSTANCE.getTableSection();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_SECTION__ROWS = eINSTANCE.getTableSection_Rows();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.TableBodyImpl <em>Table Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.TableBodyImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableBody()
		 * @generated
		 */
		EClass TABLE_BODY = eINSTANCE.getTableBody();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.TableSeparatorImpl <em>Table Separator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.TableSeparatorImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableSeparator()
		 * @generated
		 */
		EClass TABLE_SEPARATOR = eINSTANCE.getTableSeparator();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.TableHeadImpl <em>Table Head</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.TableHeadImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableHead()
		 * @generated
		 */
		EClass TABLE_HEAD = eINSTANCE.getTableHead();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.TableRowImpl <em>Table Row</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.TableRowImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableRow()
		 * @generated
		 */
		EClass TABLE_ROW = eINSTANCE.getTableRow();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_ROW__CELLS = eINSTANCE.getTableRow_Cells();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.TableCellImpl <em>Table Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.TableCellImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableCell()
		 * @generated
		 */
		EClass TABLE_CELL = eINSTANCE.getTableCell();

		/**
		 * The meta object literal for the '<em><b>Alignement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_CELL__ALIGNEMENT = eINSTANCE.getTableCell_Alignement();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.ButtonImpl <em>Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.ButtonImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getButton()
		 * @generated
		 */
		EClass BUTTON = eINSTANCE.getButton();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.NavigationImpl <em>Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.NavigationImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getNavigation()
		 * @generated
		 */
		EClass NAVIGATION = eINSTANCE.getNavigation();

		/**
		 * The meta object literal for the '<em><b>Grouped Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION__GROUPED_ITEMS = eINSTANCE.getNavigation_GroupedItems();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.ClickableElementImpl <em>Clickable Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.ClickableElementImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getClickableElement()
		 * @generated
		 */
		EClass CLICKABLE_ELEMENT = eINSTANCE.getClickableElement();

		/**
		 * The meta object literal for the '<em><b>Text Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLICKABLE_ELEMENT__TEXT_CONTENT = eINSTANCE.getClickableElement_TextContent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLICKABLE_ELEMENT__TYPE = eINSTANCE.getClickableElement_Type();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLICKABLE_ELEMENT__URL = eINSTANCE.getClickableElement_Url();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.ContainableTextElementImpl <em>Containable Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.ContainableTextElementImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getContainableTextElement()
		 * @generated
		 */
		EClass CONTAINABLE_TEXT_ELEMENT = eINSTANCE.getContainableTextElement();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.impl.SectionImpl <em>Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.impl.SectionImpl
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getSection()
		 * @generated
		 */
		EClass SECTION = eINSTANCE.getSection();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION__CONTENTS = eINSTANCE.getSection_Contents();

		/**
		 * The meta object literal for the '{@link idm.simpleusd.mm.usd.TableCellAlignement <em>Table Cell Alignement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.simpleusd.mm.usd.TableCellAlignement
		 * @see idm.simpleusd.mm.usd.impl.UsdPackageImpl#getTableCellAlignement()
		 * @generated
		 */
		EEnum TABLE_CELL_ALIGNEMENT = eINSTANCE.getTableCellAlignement();

	}

} //UsdPackage
