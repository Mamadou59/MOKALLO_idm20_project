/**
 */
package idm.bstrap.mm.bstrap;

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
	int PAGE_CONTENT = 18;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ContainerImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 1;

	/**
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__GENERALPROPERTIES = PAGE_CONTENT__GENERALPROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__TEXTELEMENTS = PAGE_CONTENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER__GENERALPROPERTIES = CONTAINER__GENERALPROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIX_CONTAINER__TEXTELEMENTS = CONTAINER__TEXTELEMENTS;

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
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER__GENERALPROPERTIES = CONTAINER__GENERALPROPERTIES;

	/**
	 * The feature id for the '<em><b>Textelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUID_CONTAINER__TEXTELEMENTS = CONTAINER__TEXTELEMENTS;

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
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.PropertyClassImpl <em>Property Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.PropertyClassImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPropertyClass()
	 * @generated
	 */
	int PROPERTY_CLASS = 4;

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
	int MARGES_PROPERTY = 5;

	/**
	 * The number of structural features of the '<em>Marges Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARGES_PROPERTY_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 0;

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
	int MARGIN = 6;

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
	int PADDING = 7;

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
	int BACKGROUND = 8;

	/**
	 * The number of structural features of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Background</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BACKGROUND_OPERATION_COUNT = GENERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.BorderImpl <em>Border</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.BorderImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBorder()
	 * @generated
	 */
	int BORDER = 9;

	/**
	 * The number of structural features of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_FEATURE_COUNT = GENERAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Border</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OPERATION_COUNT = GENERAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.DarkImpl <em>Dark</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.DarkImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getDark()
	 * @generated
	 */
	int DARK = 10;

	/**
	 * The number of structural features of the '<em>Dark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_FEATURE_COUNT = BACKGROUND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dark</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DARK_OPERATION_COUNT = BACKGROUND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.PrimaryImpl <em>Primary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.PrimaryImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPrimary()
	 * @generated
	 */
	int PRIMARY = 11;

	/**
	 * The number of structural features of the '<em>Primary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_FEATURE_COUNT = BACKGROUND_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OPERATION_COUNT = BACKGROUND_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.NewEClass13Impl <em>New EClass13</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.NewEClass13Impl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getNewEClass13()
	 * @generated
	 */
	int NEW_ECLASS13 = 12;

	/**
	 * The number of structural features of the '<em>New EClass13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS13_FEATURE_COUNT = BORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>New EClass13</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS13_OPERATION_COUNT = BORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.NewEClass14Impl <em>New EClass14</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.NewEClass14Impl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getNewEClass14()
	 * @generated
	 */
	int NEW_ECLASS14 = 13;

	/**
	 * The number of structural features of the '<em>New EClass14</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS14_FEATURE_COUNT = BORDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>New EClass14</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS14_OPERATION_COUNT = BORDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TextElementImpl <em>Text Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TextElementImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextElement()
	 * @generated
	 */
	int TEXT_ELEMENT = 15;

	/**
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT__GENERALPROPERTIES = PAGE_CONTENT__GENERALPROPERTIES;

	/**
	 * The number of structural features of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_ELEMENT_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.TitleImpl <em>Title</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.TitleImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTitle()
	 * @generated
	 */
	int TITLE = 16;

	/**
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE__GENERALPROPERTIES = TEXT_ELEMENT__GENERALPROPERTIES;

	/**
	 * The number of structural features of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Title</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link idm.bstrap.mm.bstrap.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see idm.bstrap.mm.bstrap.impl.ParagrapheImpl
	 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getParagraphe()
	 * @generated
	 */
	int PARAGRAPHE = 17;

	/**
	 * The feature id for the '<em><b>Generalproperties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE__GENERALPROPERTIES = TEXT_ELEMENT__GENERALPROPERTIES;

	/**
	 * The number of structural features of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_FEATURE_COUNT = TEXT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Paragraphe</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPHE_OPERATION_COUNT = TEXT_ELEMENT_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.Container#getTextelements <em>Textelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Textelements</em>'.
	 * @see idm.bstrap.mm.bstrap.Container#getTextelements()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Textelements();

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
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border</em>'.
	 * @see idm.bstrap.mm.bstrap.Border
	 * @generated
	 */
	EClass getBorder();

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
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Primary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary</em>'.
	 * @see idm.bstrap.mm.bstrap.Primary
	 * @generated
	 */
	EClass getPrimary();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.NewEClass13 <em>New EClass13</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass13</em>'.
	 * @see idm.bstrap.mm.bstrap.NewEClass13
	 * @generated
	 */
	EClass getNewEClass13();

	/**
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.NewEClass14 <em>New EClass14</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass14</em>'.
	 * @see idm.bstrap.mm.bstrap.NewEClass14
	 * @generated
	 */
	EClass getNewEClass14();

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
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Element</em>'.
	 * @see idm.bstrap.mm.bstrap.TextElement
	 * @generated
	 */
	EClass getTextElement();

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
	 * Returns the meta object for class '{@link idm.bstrap.mm.bstrap.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraphe</em>'.
	 * @see idm.bstrap.mm.bstrap.Paragraphe
	 * @generated
	 */
	EClass getParagraphe();

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
	 * Returns the meta object for the containment reference list '{@link idm.bstrap.mm.bstrap.PageContent#getGeneralproperties <em>Generalproperties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generalproperties</em>'.
	 * @see idm.bstrap.mm.bstrap.PageContent#getGeneralproperties()
	 * @see #getPageContent()
	 * @generated
	 */
	EReference getPageContent_Generalproperties();

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
		 * The meta object literal for the '<em><b>Textelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__TEXTELEMENTS = eINSTANCE.getContainer_Textelements();

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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.BorderImpl <em>Border</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.BorderImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getBorder()
		 * @generated
		 */
		EClass BORDER = eINSTANCE.getBorder();

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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.PrimaryImpl <em>Primary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.PrimaryImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getPrimary()
		 * @generated
		 */
		EClass PRIMARY = eINSTANCE.getPrimary();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.NewEClass13Impl <em>New EClass13</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.NewEClass13Impl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getNewEClass13()
		 * @generated
		 */
		EClass NEW_ECLASS13 = eINSTANCE.getNewEClass13();

		/**
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.NewEClass14Impl <em>New EClass14</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.NewEClass14Impl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getNewEClass14()
		 * @generated
		 */
		EClass NEW_ECLASS14 = eINSTANCE.getNewEClass14();

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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.TextElementImpl <em>Text Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.TextElementImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getTextElement()
		 * @generated
		 */
		EClass TEXT_ELEMENT = eINSTANCE.getTextElement();

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
		 * The meta object literal for the '{@link idm.bstrap.mm.bstrap.impl.ParagrapheImpl <em>Paragraphe</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see idm.bstrap.mm.bstrap.impl.ParagrapheImpl
		 * @see idm.bstrap.mm.bstrap.impl.BstrapPackageImpl#getParagraphe()
		 * @generated
		 */
		EClass PARAGRAPHE = eINSTANCE.getParagraphe();

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
		 * The meta object literal for the '<em><b>Generalproperties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_CONTENT__GENERALPROPERTIES = eINSTANCE.getPageContent_Generalproperties();

	}

} //BstrapPackage
