/**
 */
package idm.bstrap.mm.bstrap.util;

import idm.bstrap.mm.bstrap.Active;
import idm.bstrap.mm.bstrap.Background;
import idm.bstrap.mm.bstrap.Basic;
import idm.bstrap.mm.bstrap.BasicList;
import idm.bstrap.mm.bstrap.BasicTable;
import idm.bstrap.mm.bstrap.BlockQuote;
import idm.bstrap.mm.bstrap.Bold;
import idm.bstrap.mm.bstrap.Border;
import idm.bstrap.mm.bstrap.BorderProperty;
import idm.bstrap.mm.bstrap.BorderedTable;
import idm.bstrap.mm.bstrap.Brand;
import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.Button;
import idm.bstrap.mm.bstrap.ButtonLink;
import idm.bstrap.mm.bstrap.ButtonProperty;
import idm.bstrap.mm.bstrap.ButtonSize;
import idm.bstrap.mm.bstrap.ButtonState;
import idm.bstrap.mm.bstrap.ButtonStyle;
import idm.bstrap.mm.bstrap.Center;
import idm.bstrap.mm.bstrap.Centered;
import idm.bstrap.mm.bstrap.Circle;
import idm.bstrap.mm.bstrap.Code;
import idm.bstrap.mm.bstrap.CodeBlock;
import idm.bstrap.mm.bstrap.CodeLine;
import idm.bstrap.mm.bstrap.ColoredBorder;
import idm.bstrap.mm.bstrap.CompositeTextElement;
import idm.bstrap.mm.bstrap.ContainableTextElement;
import idm.bstrap.mm.bstrap.Container;
import idm.bstrap.mm.bstrap.DarkTable;
import idm.bstrap.mm.bstrap.Disabled;
import idm.bstrap.mm.bstrap.Display1;
import idm.bstrap.mm.bstrap.Display2;
import idm.bstrap.mm.bstrap.Display3;
import idm.bstrap.mm.bstrap.Display4;
import idm.bstrap.mm.bstrap.DisplayProperty;
import idm.bstrap.mm.bstrap.Emphasis;
import idm.bstrap.mm.bstrap.FixContainer;
import idm.bstrap.mm.bstrap.FluidContainer;
import idm.bstrap.mm.bstrap.General;
import idm.bstrap.mm.bstrap.HorizontalLine;
import idm.bstrap.mm.bstrap.HorizontalList;
import idm.bstrap.mm.bstrap.HoverRows;
import idm.bstrap.mm.bstrap.Image;
import idm.bstrap.mm.bstrap.ImageAligning;
import idm.bstrap.mm.bstrap.ImageProperty;
import idm.bstrap.mm.bstrap.ImageShape;
import idm.bstrap.mm.bstrap.Italic;
import idm.bstrap.mm.bstrap.ItalicProperty;
import idm.bstrap.mm.bstrap.Link;
import idm.bstrap.mm.bstrap.LinkBrand;
import idm.bstrap.mm.bstrap.LinkProperty;
import idm.bstrap.mm.bstrap.ListElement;
import idm.bstrap.mm.bstrap.ListItem;
import idm.bstrap.mm.bstrap.ListItemElement;
import idm.bstrap.mm.bstrap.ListProperty;
import idm.bstrap.mm.bstrap.MargesProperty;
import idm.bstrap.mm.bstrap.Margin;
import idm.bstrap.mm.bstrap.NavBarProperty;
import idm.bstrap.mm.bstrap.Navigation;
import idm.bstrap.mm.bstrap.OrderList;
import idm.bstrap.mm.bstrap.Padding;
import idm.bstrap.mm.bstrap.Page;
import idm.bstrap.mm.bstrap.PageContent;
import idm.bstrap.mm.bstrap.Paragraphe;
import idm.bstrap.mm.bstrap.PropertyClass;
import idm.bstrap.mm.bstrap.Responsive;
import idm.bstrap.mm.bstrap.Rounded;
import idm.bstrap.mm.bstrap.StripedRows;
import idm.bstrap.mm.bstrap.Strong;
import idm.bstrap.mm.bstrap.Table;
import idm.bstrap.mm.bstrap.TableCell;
import idm.bstrap.mm.bstrap.TableProperty;
import idm.bstrap.mm.bstrap.TableRow;
import idm.bstrap.mm.bstrap.TableSection;
import idm.bstrap.mm.bstrap.Tbody;
import idm.bstrap.mm.bstrap.Text;
import idm.bstrap.mm.bstrap.TextContainable;
import idm.bstrap.mm.bstrap.TextContainer;
import idm.bstrap.mm.bstrap.TextElements;
import idm.bstrap.mm.bstrap.TextNested;
import idm.bstrap.mm.bstrap.TextNestedElement;
import idm.bstrap.mm.bstrap.TextPageContent;
import idm.bstrap.mm.bstrap.Tfoot;
import idm.bstrap.mm.bstrap.Thead;
import idm.bstrap.mm.bstrap.Thumbnail;
import idm.bstrap.mm.bstrap.Title;
import idm.bstrap.mm.bstrap.UnOrderedList;
import idm.bstrap.mm.bstrap.UrlBasedLink;
import idm.bstrap.mm.bstrap.Vertical;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see idm.bstrap.mm.bstrap.BstrapPackage
 * @generated
 */
public class BstrapAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BstrapPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BstrapAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BstrapPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BstrapSwitch<Adapter> modelSwitch = new BstrapSwitch<Adapter>() {
		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter caseContainer(Container object) {
			return createContainerAdapter();
		}

		@Override
		public Adapter caseFixContainer(FixContainer object) {
			return createFixContainerAdapter();
		}

		@Override
		public Adapter caseFluidContainer(FluidContainer object) {
			return createFluidContainerAdapter();
		}

		@Override
		public Adapter caseTextContainer(TextContainer object) {
			return createTextContainerAdapter();
		}

		@Override
		public Adapter caseParagraphe(Paragraphe object) {
			return createParagrapheAdapter();
		}

		@Override
		public Adapter caseTitle(Title object) {
			return createTitleAdapter();
		}

		@Override
		public Adapter caseTextElements(TextElements object) {
			return createTextElementsAdapter();
		}

		@Override
		public Adapter caseText(Text object) {
			return createTextAdapter();
		}

		@Override
		public Adapter caseCode(Code object) {
			return createCodeAdapter();
		}

		@Override
		public Adapter caseCompositeTextElement(CompositeTextElement object) {
			return createCompositeTextElementAdapter();
		}

		@Override
		public Adapter caseUrlBasedLink(UrlBasedLink object) {
			return createUrlBasedLinkAdapter();
		}

		@Override
		public Adapter caseImage(Image object) {
			return createImageAdapter();
		}

		@Override
		public Adapter caseContainableTextElement(ContainableTextElement object) {
			return createContainableTextElementAdapter();
		}

		@Override
		public Adapter caseGeneral(General object) {
			return createGeneralAdapter();
		}

		@Override
		public Adapter casePropertyClass(PropertyClass object) {
			return createPropertyClassAdapter();
		}

		@Override
		public Adapter caseMargesProperty(MargesProperty object) {
			return createMargesPropertyAdapter();
		}

		@Override
		public Adapter caseMargin(Margin object) {
			return createMarginAdapter();
		}

		@Override
		public Adapter casePadding(Padding object) {
			return createPaddingAdapter();
		}

		@Override
		public Adapter caseBackground(Background object) {
			return createBackgroundAdapter();
		}

		@Override
		public Adapter caseBorderProperty(BorderProperty object) {
			return createBorderPropertyAdapter();
		}

		@Override
		public Adapter caseBorder(Border object) {
			return createBorderAdapter();
		}

		@Override
		public Adapter caseColoredBorder(ColoredBorder object) {
			return createColoredBorderAdapter();
		}

		@Override
		public Adapter caseDisplayProperty(DisplayProperty object) {
			return createDisplayPropertyAdapter();
		}

		@Override
		public Adapter caseDisplay1(Display1 object) {
			return createDisplay1Adapter();
		}

		@Override
		public Adapter caseDisplay2(Display2 object) {
			return createDisplay2Adapter();
		}

		@Override
		public Adapter caseDisplay3(Display3 object) {
			return createDisplay3Adapter();
		}

		@Override
		public Adapter caseDisplay4(Display4 object) {
			return createDisplay4Adapter();
		}

		@Override
		public Adapter caseButtonProperty(ButtonProperty object) {
			return createButtonPropertyAdapter();
		}

		@Override
		public Adapter caseImageProperty(ImageProperty object) {
			return createImagePropertyAdapter();
		}

		@Override
		public Adapter caseImageShape(ImageShape object) {
			return createImageShapeAdapter();
		}

		@Override
		public Adapter caseImageAligning(ImageAligning object) {
			return createImageAligningAdapter();
		}

		@Override
		public Adapter caseRounded(Rounded object) {
			return createRoundedAdapter();
		}

		@Override
		public Adapter caseThumbnail(Thumbnail object) {
			return createThumbnailAdapter();
		}

		@Override
		public Adapter caseCircle(Circle object) {
			return createCircleAdapter();
		}

		@Override
		public Adapter caseFloat(idm.bstrap.mm.bstrap.Float object) {
			return createFloatAdapter();
		}

		@Override
		public Adapter caseCenter(Center object) {
			return createCenterAdapter();
		}

		@Override
		public Adapter caseResponsive(Responsive object) {
			return createResponsiveAdapter();
		}

		@Override
		public Adapter caseButtonStyle(ButtonStyle object) {
			return createButtonStyleAdapter();
		}

		@Override
		public Adapter caseButtonSize(ButtonSize object) {
			return createButtonSizeAdapter();
		}

		@Override
		public Adapter caseButtonLink(ButtonLink object) {
			return createButtonLinkAdapter();
		}

		@Override
		public Adapter caseButtonState(ButtonState object) {
			return createButtonStateAdapter();
		}

		@Override
		public Adapter caseDisabled(Disabled object) {
			return createDisabledAdapter();
		}

		@Override
		public Adapter caseActive(Active object) {
			return createActiveAdapter();
		}

		@Override
		public Adapter caseButton(Button object) {
			return createButtonAdapter();
		}

		@Override
		public Adapter casePageContent(PageContent object) {
			return createPageContentAdapter();
		}

		@Override
		public Adapter caseTextPageContent(TextPageContent object) {
			return createTextPageContentAdapter();
		}

		@Override
		public Adapter caseListElement(ListElement object) {
			return createListElementAdapter();
		}

		@Override
		public Adapter caseOrderList(OrderList object) {
			return createOrderListAdapter();
		}

		@Override
		public Adapter caseUnOrderedList(UnOrderedList object) {
			return createUnOrderedListAdapter();
		}

		@Override
		public Adapter caseListItem(ListItem object) {
			return createListItemAdapter();
		}

		@Override
		public Adapter caseListItemElement(ListItemElement object) {
			return createListItemElementAdapter();
		}

		@Override
		public Adapter caseNavigation(Navigation object) {
			return createNavigationAdapter();
		}

		@Override
		public Adapter caseCentered(Centered object) {
			return createCenteredAdapter();
		}

		@Override
		public Adapter caseListProperty(ListProperty object) {
			return createListPropertyAdapter();
		}

		@Override
		public Adapter caseBasicList(BasicList object) {
			return createBasicListAdapter();
		}

		@Override
		public Adapter caseHorizontalList(HorizontalList object) {
			return createHorizontalListAdapter();
		}

		@Override
		public Adapter caseNavBarProperty(NavBarProperty object) {
			return createNavBarPropertyAdapter();
		}

		@Override
		public Adapter caseBasic(Basic object) {
			return createBasicAdapter();
		}

		@Override
		public Adapter caseVertical(Vertical object) {
			return createVerticalAdapter();
		}

		@Override
		public Adapter caseEmphasis(Emphasis object) {
			return createEmphasisAdapter();
		}

		@Override
		public Adapter caseItalicProperty(ItalicProperty object) {
			return createItalicPropertyAdapter();
		}

		@Override
		public Adapter caseBold(Bold object) {
			return createBoldAdapter();
		}

		@Override
		public Adapter caseLink(Link object) {
			return createLinkAdapter();
		}

		@Override
		public Adapter caseStrong(Strong object) {
			return createStrongAdapter();
		}

		@Override
		public Adapter caseItalic(Italic object) {
			return createItalicAdapter();
		}

		@Override
		public Adapter caseTextContainable(TextContainable object) {
			return createTextContainableAdapter();
		}

		@Override
		public Adapter caseTextNested(TextNested object) {
			return createTextNestedAdapter();
		}

		@Override
		public Adapter caseTextNestedElement(TextNestedElement object) {
			return createTextNestedElementAdapter();
		}

		@Override
		public Adapter caseBrand(Brand object) {
			return createBrandAdapter();
		}

		@Override
		public Adapter caseLinkProperty(LinkProperty object) {
			return createLinkPropertyAdapter();
		}

		@Override
		public Adapter caseLinkBrand(LinkBrand object) {
			return createLinkBrandAdapter();
		}

		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseThead(Thead object) {
			return createTheadAdapter();
		}

		@Override
		public Adapter caseTbody(Tbody object) {
			return createTbodyAdapter();
		}

		@Override
		public Adapter caseTfoot(Tfoot object) {
			return createTfootAdapter();
		}

		@Override
		public Adapter caseTableSection(TableSection object) {
			return createTableSectionAdapter();
		}

		@Override
		public Adapter caseTableRow(TableRow object) {
			return createTableRowAdapter();
		}

		@Override
		public Adapter caseTableCell(TableCell object) {
			return createTableCellAdapter();
		}

		@Override
		public Adapter caseTableProperty(TableProperty object) {
			return createTablePropertyAdapter();
		}

		@Override
		public Adapter caseBasicTable(BasicTable object) {
			return createBasicTableAdapter();
		}

		@Override
		public Adapter caseStripedRows(StripedRows object) {
			return createStripedRowsAdapter();
		}

		@Override
		public Adapter caseBorderedTable(BorderedTable object) {
			return createBorderedTableAdapter();
		}

		@Override
		public Adapter caseHoverRows(HoverRows object) {
			return createHoverRowsAdapter();
		}

		@Override
		public Adapter caseDarkTable(DarkTable object) {
			return createDarkTableAdapter();
		}

		@Override
		public Adapter caseBlockQuote(BlockQuote object) {
			return createBlockQuoteAdapter();
		}

		@Override
		public Adapter caseCodeBlock(CodeBlock object) {
			return createCodeBlockAdapter();
		}

		@Override
		public Adapter caseCodeLine(CodeLine object) {
			return createCodeLineAdapter();
		}

		@Override
		public Adapter caseHorizontalLine(HorizontalLine object) {
			return createHorizontalLineAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.FixContainer <em>Fix Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.FixContainer
	 * @generated
	 */
	public Adapter createFixContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.FluidContainer <em>Fluid Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.FluidContainer
	 * @generated
	 */
	public Adapter createFluidContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TextContainer
	 * @generated
	 */
	public Adapter createTextContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Paragraphe
	 * @generated
	 */
	public Adapter createParagrapheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TextElements <em>Text Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TextElements
	 * @generated
	 */
	public Adapter createTextElementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.CompositeTextElement <em>Composite Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.CompositeTextElement
	 * @generated
	 */
	public Adapter createCompositeTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.UrlBasedLink <em>Url Based Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.UrlBasedLink
	 * @generated
	 */
	public Adapter createUrlBasedLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ContainableTextElement <em>Containable Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ContainableTextElement
	 * @generated
	 */
	public Adapter createContainableTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.General <em>General</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.General
	 * @generated
	 */
	public Adapter createGeneralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.PropertyClass <em>Property Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.PropertyClass
	 * @generated
	 */
	public Adapter createPropertyClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.MargesProperty <em>Marges Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.MargesProperty
	 * @generated
	 */
	public Adapter createMargesPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Margin
	 * @generated
	 */
	public Adapter createMarginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Padding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Padding
	 * @generated
	 */
	public Adapter createPaddingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Background <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Background
	 * @generated
	 */
	public Adapter createBackgroundAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.BorderProperty <em>Border Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.BorderProperty
	 * @generated
	 */
	public Adapter createBorderPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Border <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Border
	 * @generated
	 */
	public Adapter createBorderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ColoredBorder <em>Colored Border</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ColoredBorder
	 * @generated
	 */
	public Adapter createColoredBorderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.DisplayProperty <em>Display Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.DisplayProperty
	 * @generated
	 */
	public Adapter createDisplayPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Display1 <em>Display1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Display1
	 * @generated
	 */
	public Adapter createDisplay1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Display2 <em>Display2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Display2
	 * @generated
	 */
	public Adapter createDisplay2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Display3 <em>Display3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Display3
	 * @generated
	 */
	public Adapter createDisplay3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Display4 <em>Display4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Display4
	 * @generated
	 */
	public Adapter createDisplay4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ButtonProperty <em>Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ButtonProperty
	 * @generated
	 */
	public Adapter createButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ImageProperty <em>Image Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ImageProperty
	 * @generated
	 */
	public Adapter createImagePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ImageShape <em>Image Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ImageShape
	 * @generated
	 */
	public Adapter createImageShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ImageAligning <em>Image Aligning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ImageAligning
	 * @generated
	 */
	public Adapter createImageAligningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Rounded <em>Rounded</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Rounded
	 * @generated
	 */
	public Adapter createRoundedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Thumbnail <em>Thumbnail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Thumbnail
	 * @generated
	 */
	public Adapter createThumbnailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Float <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Float
	 * @generated
	 */
	public Adapter createFloatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Center <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Center
	 * @generated
	 */
	public Adapter createCenterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Responsive <em>Responsive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Responsive
	 * @generated
	 */
	public Adapter createResponsiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ButtonStyle
	 * @generated
	 */
	public Adapter createButtonStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ButtonSize <em>Button Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ButtonSize
	 * @generated
	 */
	public Adapter createButtonSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ButtonLink <em>Button Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ButtonLink
	 * @generated
	 */
	public Adapter createButtonLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ButtonState <em>Button State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ButtonState
	 * @generated
	 */
	public Adapter createButtonStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Disabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Disabled
	 * @generated
	 */
	public Adapter createDisabledAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Active <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Active
	 * @generated
	 */
	public Adapter createActiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.PageContent
	 * @generated
	 */
	public Adapter createPageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TextPageContent <em>Text Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TextPageContent
	 * @generated
	 */
	public Adapter createTextPageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ListElement
	 * @generated
	 */
	public Adapter createListElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.OrderList <em>Order List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.OrderList
	 * @generated
	 */
	public Adapter createOrderListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.UnOrderedList <em>Un Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.UnOrderedList
	 * @generated
	 */
	public Adapter createUnOrderedListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ListItem
	 * @generated
	 */
	public Adapter createListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ListItemElement <em>List Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ListItemElement
	 * @generated
	 */
	public Adapter createListItemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Navigation <em>Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Navigation
	 * @generated
	 */
	public Adapter createNavigationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Centered <em>Centered</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Centered
	 * @generated
	 */
	public Adapter createCenteredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ListProperty <em>List Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ListProperty
	 * @generated
	 */
	public Adapter createListPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.BasicList <em>Basic List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.BasicList
	 * @generated
	 */
	public Adapter createBasicListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.HorizontalList <em>Horizontal List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.HorizontalList
	 * @generated
	 */
	public Adapter createHorizontalListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.NavBarProperty <em>Nav Bar Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.NavBarProperty
	 * @generated
	 */
	public Adapter createNavBarPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Basic <em>Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Basic
	 * @generated
	 */
	public Adapter createBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Vertical <em>Vertical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Vertical
	 * @generated
	 */
	public Adapter createVerticalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Emphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Emphasis
	 * @generated
	 */
	public Adapter createEmphasisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.ItalicProperty <em>Italic Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.ItalicProperty
	 * @generated
	 */
	public Adapter createItalicPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Bold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Bold
	 * @generated
	 */
	public Adapter createBoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Strong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Strong
	 * @generated
	 */
	public Adapter createStrongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Italic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Italic
	 * @generated
	 */
	public Adapter createItalicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TextContainable <em>Text Containable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TextContainable
	 * @generated
	 */
	public Adapter createTextContainableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TextNested <em>Text Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TextNested
	 * @generated
	 */
	public Adapter createTextNestedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TextNestedElement <em>Text Nested Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TextNestedElement
	 * @generated
	 */
	public Adapter createTextNestedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Brand <em>Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Brand
	 * @generated
	 */
	public Adapter createBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.LinkProperty <em>Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.LinkProperty
	 * @generated
	 */
	public Adapter createLinkPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.LinkBrand <em>Link Brand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.LinkBrand
	 * @generated
	 */
	public Adapter createLinkBrandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Thead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Thead
	 * @generated
	 */
	public Adapter createTheadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Tbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Tbody
	 * @generated
	 */
	public Adapter createTbodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Tfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Tfoot
	 * @generated
	 */
	public Adapter createTfootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TableSection
	 * @generated
	 */
	public Adapter createTableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TableCell
	 * @generated
	 */
	public Adapter createTableCellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TableProperty <em>Table Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TableProperty
	 * @generated
	 */
	public Adapter createTablePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.BasicTable <em>Basic Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.BasicTable
	 * @generated
	 */
	public Adapter createBasicTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.StripedRows <em>Striped Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.StripedRows
	 * @generated
	 */
	public Adapter createStripedRowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.BorderedTable <em>Bordered Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.BorderedTable
	 * @generated
	 */
	public Adapter createBorderedTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.HoverRows <em>Hover Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.HoverRows
	 * @generated
	 */
	public Adapter createHoverRowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.DarkTable <em>Dark Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.DarkTable
	 * @generated
	 */
	public Adapter createDarkTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.BlockQuote <em>Block Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.BlockQuote
	 * @generated
	 */
	public Adapter createBlockQuoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.CodeBlock
	 * @generated
	 */
	public Adapter createCodeBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.CodeLine <em>Code Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.CodeLine
	 * @generated
	 */
	public Adapter createCodeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.HorizontalLine <em>Horizontal Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.HorizontalLine
	 * @generated
	 */
	public Adapter createHorizontalLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BstrapAdapterFactory
