/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.Active;
import idm.bstrap.mm.bstrap.Background;
import idm.bstrap.mm.bstrap.Basic;
import idm.bstrap.mm.bstrap.Blockquote;
import idm.bstrap.mm.bstrap.Border;
import idm.bstrap.mm.bstrap.BstrapFactory;
import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.Button;
import idm.bstrap.mm.bstrap.ButtonSize;
import idm.bstrap.mm.bstrap.Center;
import idm.bstrap.mm.bstrap.Circle;
import idm.bstrap.mm.bstrap.Code;
import idm.bstrap.mm.bstrap.Color;
import idm.bstrap.mm.bstrap.ColoredBorder;
import idm.bstrap.mm.bstrap.CompositeTextElement;
import idm.bstrap.mm.bstrap.ContainableTextElement;
import idm.bstrap.mm.bstrap.Dark;
import idm.bstrap.mm.bstrap.Disabled;
import idm.bstrap.mm.bstrap.Display1;
import idm.bstrap.mm.bstrap.Display2;
import idm.bstrap.mm.bstrap.Display3;
import idm.bstrap.mm.bstrap.Display4;
import idm.bstrap.mm.bstrap.FixContainer;
import idm.bstrap.mm.bstrap.FluidContainer;
import idm.bstrap.mm.bstrap.Image;
import idm.bstrap.mm.bstrap.Info;
import idm.bstrap.mm.bstrap.Light;
import idm.bstrap.mm.bstrap.Link;
import idm.bstrap.mm.bstrap.Margin;
import idm.bstrap.mm.bstrap.Padding;
import idm.bstrap.mm.bstrap.Page;
import idm.bstrap.mm.bstrap.PageContent;
import idm.bstrap.mm.bstrap.Paragraphe;
import idm.bstrap.mm.bstrap.Primary;
import idm.bstrap.mm.bstrap.Responsive;
import idm.bstrap.mm.bstrap.Rounded;
import idm.bstrap.mm.bstrap.Secondary;
import idm.bstrap.mm.bstrap.Size;
import idm.bstrap.mm.bstrap.Succes;
import idm.bstrap.mm.bstrap.Text;
import idm.bstrap.mm.bstrap.Thumbnail;
import idm.bstrap.mm.bstrap.Title;

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
		case BstrapPackage.BLOCKQUOTE:
			return createBlockquote();
		case BstrapPackage.COMPOSITE_TEXT_ELEMENT:
			return createCompositeTextElement();
		case BstrapPackage.IMAGE:
			return createImage();
		case BstrapPackage.CONTAINABLE_TEXT_ELEMENT:
			return createContainableTextElement();
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
		case BstrapPackage.BASIC:
			return createBasic();
		case BstrapPackage.PRIMARY:
			return createPrimary();
		case BstrapPackage.SECONDARY:
			return createSecondary();
		case BstrapPackage.DARK:
			return createDark();
		case BstrapPackage.INFO:
			return createInfo();
		case BstrapPackage.LIGHT:
			return createLight();
		case BstrapPackage.SUCCES:
			return createSucces();
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
		case BstrapPackage.BUTTON_SIZE:
			return createButtonSize();
		case BstrapPackage.LINK:
			return createLink();
		case BstrapPackage.DISABLED:
			return createDisabled();
		case BstrapPackage.ACTIVE:
			return createActive();
		case BstrapPackage.BUTTON:
			return createButton();
		case BstrapPackage.PAGE_CONTENT:
			return createPageContent();
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
	public Blockquote createBlockquote() {
		BlockquoteImpl blockquote = new BlockquoteImpl();
		return blockquote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeTextElement createCompositeTextElement() {
		CompositeTextElementImpl compositeTextElement = new CompositeTextElementImpl();
		return compositeTextElement;
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
	public ContainableTextElement createContainableTextElement() {
		ContainableTextElementImpl containableTextElement = new ContainableTextElementImpl();
		return containableTextElement;
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
	public Basic createBasic() {
		BasicImpl basic = new BasicImpl();
		return basic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Primary createPrimary() {
		PrimaryImpl primary = new PrimaryImpl();
		return primary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Secondary createSecondary() {
		SecondaryImpl secondary = new SecondaryImpl();
		return secondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dark createDark() {
		DarkImpl dark = new DarkImpl();
		return dark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info createInfo() {
		InfoImpl info = new InfoImpl();
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Light createLight() {
		LightImpl light = new LightImpl();
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Succes createSucces() {
		SuccesImpl succes = new SuccesImpl();
		return succes;
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
	public ButtonSize createButtonSize() {
		ButtonSizeImpl buttonSize = new ButtonSizeImpl();
		return buttonSize;
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
	public PageContent createPageContent() {
		PageContentImpl pageContent = new PageContentImpl();
		return pageContent;
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
