/**
 */
package idm.bstrap.mm.bstrap.util;

import idm.bstrap.mm.bstrap.Active;
import idm.bstrap.mm.bstrap.Background;
import idm.bstrap.mm.bstrap.Border;
import idm.bstrap.mm.bstrap.BorderProperty;
import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.Button;
import idm.bstrap.mm.bstrap.ButtonProperty;
import idm.bstrap.mm.bstrap.ButtonSize;
import idm.bstrap.mm.bstrap.ButtonState;
import idm.bstrap.mm.bstrap.ButtonStyle;
import idm.bstrap.mm.bstrap.Center;
import idm.bstrap.mm.bstrap.Circle;
import idm.bstrap.mm.bstrap.Code;
import idm.bstrap.mm.bstrap.ColoredBorder;
import idm.bstrap.mm.bstrap.CompositeTextElement;
import idm.bstrap.mm.bstrap.ContainableTextElement;
import idm.bstrap.mm.bstrap.Container;
import idm.bstrap.mm.bstrap.Disabled;
import idm.bstrap.mm.bstrap.Display1;
import idm.bstrap.mm.bstrap.Display2;
import idm.bstrap.mm.bstrap.Display3;
import idm.bstrap.mm.bstrap.Display4;
import idm.bstrap.mm.bstrap.DisplayProperty;
import idm.bstrap.mm.bstrap.FixContainer;
import idm.bstrap.mm.bstrap.FluidContainer;
import idm.bstrap.mm.bstrap.General;
import idm.bstrap.mm.bstrap.Image;
import idm.bstrap.mm.bstrap.ImageAligning;
import idm.bstrap.mm.bstrap.ImageProperty;
import idm.bstrap.mm.bstrap.ImageShape;
import idm.bstrap.mm.bstrap.Link;
import idm.bstrap.mm.bstrap.MargesProperty;
import idm.bstrap.mm.bstrap.Margin;
import idm.bstrap.mm.bstrap.Padding;
import idm.bstrap.mm.bstrap.Page;
import idm.bstrap.mm.bstrap.PageContent;
import idm.bstrap.mm.bstrap.Paragraphe;
import idm.bstrap.mm.bstrap.PropertyClass;
import idm.bstrap.mm.bstrap.Responsive;
import idm.bstrap.mm.bstrap.Rounded;
import idm.bstrap.mm.bstrap.Text;
import idm.bstrap.mm.bstrap.TextContainer;
import idm.bstrap.mm.bstrap.TextElements;
import idm.bstrap.mm.bstrap.TextPageContent;
import idm.bstrap.mm.bstrap.Thumbnail;
import idm.bstrap.mm.bstrap.Title;
import idm.bstrap.mm.bstrap.UrlBasedLink;

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
		public Adapter caseLink(Link object) {
			return createLinkAdapter();
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
