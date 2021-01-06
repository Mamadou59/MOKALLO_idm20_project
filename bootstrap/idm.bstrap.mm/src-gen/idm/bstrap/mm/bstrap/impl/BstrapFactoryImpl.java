/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.Active;
import idm.bstrap.mm.bstrap.AlertAnimated;
import idm.bstrap.mm.bstrap.AlertLink;
import idm.bstrap.mm.bstrap.AlertStyle;
import idm.bstrap.mm.bstrap.Alignement;
import idm.bstrap.mm.bstrap.Background;
import idm.bstrap.mm.bstrap.BadgePill;
import idm.bstrap.mm.bstrap.BadgeStyle;
import idm.bstrap.mm.bstrap.Basic;
import idm.bstrap.mm.bstrap.BasicList;
import idm.bstrap.mm.bstrap.BasicTable;
import idm.bstrap.mm.bstrap.BlockQuote;
import idm.bstrap.mm.bstrap.Bold;
import idm.bstrap.mm.bstrap.Border;
import idm.bstrap.mm.bstrap.BorderedTable;
import idm.bstrap.mm.bstrap.Brand;
import idm.bstrap.mm.bstrap.BstrapFactory;
import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.Button;
import idm.bstrap.mm.bstrap.ButtonLink;
import idm.bstrap.mm.bstrap.ButtonOutLine;
import idm.bstrap.mm.bstrap.ButtonSize;
import idm.bstrap.mm.bstrap.ButtonSpinner;
import idm.bstrap.mm.bstrap.ButtonStyle;
import idm.bstrap.mm.bstrap.Center;
import idm.bstrap.mm.bstrap.Centered;
import idm.bstrap.mm.bstrap.Circle;
import idm.bstrap.mm.bstrap.Code;
import idm.bstrap.mm.bstrap.CodeBlock;
import idm.bstrap.mm.bstrap.CodeLine;
import idm.bstrap.mm.bstrap.Color;
import idm.bstrap.mm.bstrap.ColoredBorder;
import idm.bstrap.mm.bstrap.DarkTable;
import idm.bstrap.mm.bstrap.Disabled;
import idm.bstrap.mm.bstrap.Display1;
import idm.bstrap.mm.bstrap.Display2;
import idm.bstrap.mm.bstrap.Display3;
import idm.bstrap.mm.bstrap.Display4;
import idm.bstrap.mm.bstrap.FixContainer;
import idm.bstrap.mm.bstrap.FluidContainer;
import idm.bstrap.mm.bstrap.HorizontalLine;
import idm.bstrap.mm.bstrap.HorizontalList;
import idm.bstrap.mm.bstrap.HoverRows;
import idm.bstrap.mm.bstrap.Image;
import idm.bstrap.mm.bstrap.Italic;
import idm.bstrap.mm.bstrap.ItalicProperty;
import idm.bstrap.mm.bstrap.Link;
import idm.bstrap.mm.bstrap.LinkBrand;
import idm.bstrap.mm.bstrap.ListItem;
import idm.bstrap.mm.bstrap.Margin;
import idm.bstrap.mm.bstrap.Navigation;
import idm.bstrap.mm.bstrap.OrderList;
import idm.bstrap.mm.bstrap.Padding;
import idm.bstrap.mm.bstrap.Page;
import idm.bstrap.mm.bstrap.Paragraphe;
import idm.bstrap.mm.bstrap.Responsive;
import idm.bstrap.mm.bstrap.Rounded;
import idm.bstrap.mm.bstrap.Size;
import idm.bstrap.mm.bstrap.Span;
import idm.bstrap.mm.bstrap.StripedRows;
import idm.bstrap.mm.bstrap.Strong;
import idm.bstrap.mm.bstrap.Table;
import idm.bstrap.mm.bstrap.TableCell;
import idm.bstrap.mm.bstrap.TableRow;
import idm.bstrap.mm.bstrap.Tbody;
import idm.bstrap.mm.bstrap.Text;
import idm.bstrap.mm.bstrap.Tfoot;
import idm.bstrap.mm.bstrap.Thead;
import idm.bstrap.mm.bstrap.Thumbnail;
import idm.bstrap.mm.bstrap.Title;
import idm.bstrap.mm.bstrap.UnOrderedList;
import idm.bstrap.mm.bstrap.Vertical;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BstrapFactoryImpl extends EFactoryImpl implements BstrapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BstrapFactory init() {
		try {
			BstrapFactory theBstrapFactory = (BstrapFactory) EPackage.Registry.INSTANCE
					.getEFactory(BstrapPackage.eNS_URI);
			if (theBstrapFactory != null) {
				return theBstrapFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BstrapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BstrapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BstrapPackage.PAGE:
			return createPage();
		case BstrapPackage.FIX_CONTAINER:
			return createFixContainer();
		case BstrapPackage.FLUID_CONTAINER:
			return createFluidContainer();
		case BstrapPackage.PARAGRAPHE:
			return createParagraphe();
		case BstrapPackage.TITLE:
			return createTitle();
		case BstrapPackage.TEXT:
			return createText();
		case BstrapPackage.CODE:
			return createCode();
		case BstrapPackage.IMAGE:
			return createImage();
		case BstrapPackage.MARGIN:
			return createMargin();
		case BstrapPackage.PADDING:
			return createPadding();
		case BstrapPackage.BACKGROUND:
			return createBackground();
		case BstrapPackage.BORDER:
			return createBorder();
		case BstrapPackage.COLORED_BORDER:
			return createColoredBorder();
		case BstrapPackage.DISPLAY1:
			return createDisplay1();
		case BstrapPackage.DISPLAY2:
			return createDisplay2();
		case BstrapPackage.DISPLAY3:
			return createDisplay3();
		case BstrapPackage.DISPLAY4:
			return createDisplay4();
		case BstrapPackage.ROUNDED:
			return createRounded();
		case BstrapPackage.THUMBNAIL:
			return createThumbnail();
		case BstrapPackage.CIRCLE:
			return createCircle();
		case BstrapPackage.FLOAT:
			return createFloat();
		case BstrapPackage.CENTER:
			return createCenter();
		case BstrapPackage.RESPONSIVE:
			return createResponsive();
		case BstrapPackage.BUTTON_STYLE:
			return createButtonStyle();
		case BstrapPackage.BUTTON_SIZE:
			return createButtonSize();
		case BstrapPackage.BUTTON_LINK:
			return createButtonLink();
		case BstrapPackage.DISABLED:
			return createDisabled();
		case BstrapPackage.ACTIVE:
			return createActive();
		case BstrapPackage.BUTTON:
			return createButton();
		case BstrapPackage.ORDER_LIST:
			return createOrderList();
		case BstrapPackage.UN_ORDERED_LIST:
			return createUnOrderedList();
		case BstrapPackage.LIST_ITEM:
			return createListItem();
		case BstrapPackage.NAVIGATION:
			return createNavigation();
		case BstrapPackage.CENTERED:
			return createCentered();
		case BstrapPackage.BASIC_LIST:
			return createBasicList();
		case BstrapPackage.HORIZONTAL_LIST:
			return createHorizontalList();
		case BstrapPackage.BASIC:
			return createBasic();
		case BstrapPackage.VERTICAL:
			return createVertical();
		case BstrapPackage.ITALIC_PROPERTY:
			return createItalicProperty();
		case BstrapPackage.BOLD:
			return createBold();
		case BstrapPackage.LINK:
			return createLink();
		case BstrapPackage.STRONG:
			return createStrong();
		case BstrapPackage.ITALIC:
			return createItalic();
		case BstrapPackage.BRAND:
			return createBrand();
		case BstrapPackage.LINK_BRAND:
			return createLinkBrand();
		case BstrapPackage.TABLE:
			return createTable();
		case BstrapPackage.THEAD:
			return createThead();
		case BstrapPackage.TBODY:
			return createTbody();
		case BstrapPackage.TFOOT:
			return createTfoot();
		case BstrapPackage.TABLE_ROW:
			return createTableRow();
		case BstrapPackage.TABLE_CELL:
			return createTableCell();
		case BstrapPackage.BASIC_TABLE:
			return createBasicTable();
		case BstrapPackage.STRIPED_ROWS:
			return createStripedRows();
		case BstrapPackage.BORDERED_TABLE:
			return createBorderedTable();
		case BstrapPackage.HOVER_ROWS:
			return createHoverRows();
		case BstrapPackage.DARK_TABLE:
			return createDarkTable();
		case BstrapPackage.BLOCK_QUOTE:
			return createBlockQuote();
		case BstrapPackage.CODE_BLOCK:
			return createCodeBlock();
		case BstrapPackage.CODE_LINE:
			return createCodeLine();
		case BstrapPackage.HORIZONTAL_LINE:
			return createHorizontalLine();
		case BstrapPackage.BUTTON_OUT_LINE:
			return createButtonOutLine();
		case BstrapPackage.BUTTON_SPINNER:
			return createButtonSpinner();
		case BstrapPackage.SPAN:
			return createSpan();
		case BstrapPackage.BADGE_STYLE:
			return createBadgeStyle();
		case BstrapPackage.BADGE_PILL:
			return createBadgePill();
		case BstrapPackage.ALERT_STYLE:
			return createAlertStyle();
		case BstrapPackage.ALERT_ANIMATED:
			return createAlertAnimated();
		case BstrapPackage.ALERT_LINK:
			return createAlertLink();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case BstrapPackage.COLOR:
			return createColorFromString(eDataType, initialValue);
		case BstrapPackage.SIZE:
			return createSizeFromString(eDataType, initialValue);
		case BstrapPackage.ALIGNEMENT:
			return createAlignementFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case BstrapPackage.COLOR:
			return convertColorToString(eDataType, instanceValue);
		case BstrapPackage.SIZE:
			return convertSizeToString(eDataType, instanceValue);
		case BstrapPackage.ALIGNEMENT:
			return convertAlignementToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixContainer createFixContainer() {
		FixContainerImpl fixContainer = new FixContainerImpl();
		return fixContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FluidContainer createFluidContainer() {
		FluidContainerImpl fluidContainer = new FluidContainerImpl();
		return fluidContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Paragraphe createParagraphe() {
		ParagrapheImpl paragraphe = new ParagrapheImpl();
		return paragraphe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Title createTitle() {
		TitleImpl title = new TitleImpl();
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Margin createMargin() {
		MarginImpl margin = new MarginImpl();
		return margin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Padding createPadding() {
		PaddingImpl padding = new PaddingImpl();
		return padding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Background createBackground() {
		BackgroundImpl background = new BackgroundImpl();
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Border createBorder() {
		BorderImpl border = new BorderImpl();
		return border;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColoredBorder createColoredBorder() {
		ColoredBorderImpl coloredBorder = new ColoredBorderImpl();
		return coloredBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display1 createDisplay1() {
		Display1Impl display1 = new Display1Impl();
		return display1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display2 createDisplay2() {
		Display2Impl display2 = new Display2Impl();
		return display2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display3 createDisplay3() {
		Display3Impl display3 = new Display3Impl();
		return display3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Display4 createDisplay4() {
		Display4Impl display4 = new Display4Impl();
		return display4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rounded createRounded() {
		RoundedImpl rounded = new RoundedImpl();
		return rounded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thumbnail createThumbnail() {
		ThumbnailImpl thumbnail = new ThumbnailImpl();
		return thumbnail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public idm.bstrap.mm.bstrap.Float createFloat() {
		FloatImpl float_ = new FloatImpl();
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Center createCenter() {
		CenterImpl center = new CenterImpl();
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Responsive createResponsive() {
		ResponsiveImpl responsive = new ResponsiveImpl();
		return responsive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonStyle createButtonStyle() {
		ButtonStyleImpl buttonStyle = new ButtonStyleImpl();
		return buttonStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonSize createButtonSize() {
		ButtonSizeImpl buttonSize = new ButtonSizeImpl();
		return buttonSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonLink createButtonLink() {
		ButtonLinkImpl buttonLink = new ButtonLinkImpl();
		return buttonLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disabled createDisabled() {
		DisabledImpl disabled = new DisabledImpl();
		return disabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Active createActive() {
		ActiveImpl active = new ActiveImpl();
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Button createButton() {
		ButtonImpl button = new ButtonImpl();
		return button;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderList createOrderList() {
		OrderListImpl orderList = new OrderListImpl();
		return orderList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnOrderedList createUnOrderedList() {
		UnOrderedListImpl unOrderedList = new UnOrderedListImpl();
		return unOrderedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListItem createListItem() {
		ListItemImpl listItem = new ListItemImpl();
		return listItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Navigation createNavigation() {
		NavigationImpl navigation = new NavigationImpl();
		return navigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Centered createCentered() {
		CenteredImpl centered = new CenteredImpl();
		return centered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicList createBasicList() {
		BasicListImpl basicList = new BasicListImpl();
		return basicList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalList createHorizontalList() {
		HorizontalListImpl horizontalList = new HorizontalListImpl();
		return horizontalList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertical createVertical() {
		VerticalImpl vertical = new VerticalImpl();
		return vertical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItalicProperty createItalicProperty() {
		ItalicPropertyImpl italicProperty = new ItalicPropertyImpl();
		return italicProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bold createBold() {
		BoldImpl bold = new BoldImpl();
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Strong createStrong() {
		StrongImpl strong = new StrongImpl();
		return strong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Italic createItalic() {
		ItalicImpl italic = new ItalicImpl();
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Brand createBrand() {
		BrandImpl brand = new BrandImpl();
		return brand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkBrand createLinkBrand() {
		LinkBrandImpl linkBrand = new LinkBrandImpl();
		return linkBrand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Table createTable() {
		TableImpl table = new TableImpl();
		return table;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Thead createThead() {
		TheadImpl thead = new TheadImpl();
		return thead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tbody createTbody() {
		TbodyImpl tbody = new TbodyImpl();
		return tbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tfoot createTfoot() {
		TfootImpl tfoot = new TfootImpl();
		return tfoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableRow createTableRow() {
		TableRowImpl tableRow = new TableRowImpl();
		return tableRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableCell createTableCell() {
		TableCellImpl tableCell = new TableCellImpl();
		return tableCell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicTable createBasicTable() {
		BasicTableImpl basicTable = new BasicTableImpl();
		return basicTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StripedRows createStripedRows() {
		StripedRowsImpl stripedRows = new StripedRowsImpl();
		return stripedRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderedTable createBorderedTable() {
		BorderedTableImpl borderedTable = new BorderedTableImpl();
		return borderedTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HoverRows createHoverRows() {
		HoverRowsImpl hoverRows = new HoverRowsImpl();
		return hoverRows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DarkTable createDarkTable() {
		DarkTableImpl darkTable = new DarkTableImpl();
		return darkTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockQuote createBlockQuote() {
		BlockQuoteImpl blockQuote = new BlockQuoteImpl();
		return blockQuote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeBlock createCodeBlock() {
		CodeBlockImpl codeBlock = new CodeBlockImpl();
		return codeBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeLine createCodeLine() {
		CodeLineImpl codeLine = new CodeLineImpl();
		return codeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalLine createHorizontalLine() {
		HorizontalLineImpl horizontalLine = new HorizontalLineImpl();
		return horizontalLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonOutLine createButtonOutLine() {
		ButtonOutLineImpl buttonOutLine = new ButtonOutLineImpl();
		return buttonOutLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonSpinner createButtonSpinner() {
		ButtonSpinnerImpl buttonSpinner = new ButtonSpinnerImpl();
		return buttonSpinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Span createSpan() {
		SpanImpl span = new SpanImpl();
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadgeStyle createBadgeStyle() {
		BadgeStyleImpl badgeStyle = new BadgeStyleImpl();
		return badgeStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadgePill createBadgePill() {
		BadgePillImpl badgePill = new BadgePillImpl();
		return badgePill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertStyle createAlertStyle() {
		AlertStyleImpl alertStyle = new AlertStyleImpl();
		return alertStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertAnimated createAlertAnimated() {
		AlertAnimatedImpl alertAnimated = new AlertAnimatedImpl();
		return alertAnimated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlertLink createAlertLink() {
		AlertLinkImpl alertLink = new AlertLinkImpl();
		return alertLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color createColorFromString(EDataType eDataType, String initialValue) {
		Color result = Color.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSizeFromString(EDataType eDataType, String initialValue) {
		Size result = Size.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSizeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alignement createAlignementFromString(EDataType eDataType, String initialValue) {
		Alignement result = Alignement.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignementToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BstrapPackage getBstrapPackage() {
		return (BstrapPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BstrapPackage getPackage() {
		return BstrapPackage.eINSTANCE;
	}

} //BstrapFactoryImpl
