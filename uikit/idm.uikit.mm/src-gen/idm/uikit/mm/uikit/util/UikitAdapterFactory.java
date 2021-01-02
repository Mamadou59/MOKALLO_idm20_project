/**
 */
package idm.uikit.mm.uikit.util;

import idm.uikit.mm.uikit.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see idm.uikit.mm.uikit.UikitPackage
 * @generated
 */
public class UikitAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UikitPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UikitAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UikitPackage.eINSTANCE;
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
	protected UikitSwitch<Adapter> modelSwitch = new UikitSwitch<Adapter>() {
		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter casePageContent(PageContent object) {
			return createPageContentAdapter();
		}

		@Override
		public Adapter caseContainer(Container object) {
			return createContainerAdapter();
		}

		@Override
		public Adapter caseTextPageContent(TextPageContent object) {
			return createTextPageContentAdapter();
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
		public Adapter caseContainableTextElement(ContainableTextElement object) {
			return createContainableTextElementAdapter();
		}

		@Override
		public Adapter caseButton(Button object) {
			return createButtonAdapter();
		}

		@Override
		public Adapter caseCompositeTextElement(CompositeTextElement object) {
			return createCompositeTextElementAdapter();
		}

		@Override
		public Adapter caseTextContainable(TextContainable object) {
			return createTextContainableAdapter();
		}

		@Override
		public Adapter caseUrlBasedLink(UrlBasedLink object) {
			return createUrlBasedLinkAdapter();
		}

		@Override
		public Adapter caseLink(Link object) {
			return createLinkAdapter();
		}

		@Override
		public Adapter caseImage(Image object) {
			return createImageAdapter();
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
		public Adapter caseTextElement(TextElement object) {
			return createTextElementAdapter();
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
		public Adapter caseTextNested(TextNested object) {
			return createTextNestedAdapter();
		}

		@Override
		public Adapter caseTextNestedElement(TextNestedElement object) {
			return createTextNestedElementAdapter();
		}

		@Override
		public Adapter caseProperty(Property object) {
			return createPropertyAdapter();
		}

		@Override
		public Adapter caseGeneralProperty(GeneralProperty object) {
			return createGeneralPropertyAdapter();
		}

		@Override
		public Adapter caseSpecificProperty(SpecificProperty object) {
			return createSpecificPropertyAdapter();
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
		public Adapter caseBackgroundProperty(BackgroundProperty object) {
			return createBackgroundPropertyAdapter();
		}

		@Override
		public Adapter caseButtonProperty(ButtonProperty object) {
			return createButtonPropertyAdapter();
		}

		@Override
		public Adapter caseButtonBasic(ButtonBasic object) {
			return createButtonBasicAdapter();
		}

		@Override
		public Adapter caseButtonStyle(ButtonStyle object) {
			return createButtonStyleAdapter();
		}

		@Override
		public Adapter caseMuteLink(MuteLink object) {
			return createMuteLinkAdapter();
		}

		@Override
		public Adapter caseLinkProperty(LinkProperty object) {
			return createLinkPropertyAdapter();
		}

		@Override
		public Adapter caseButtonSIze(ButtonSIze object) {
			return createButtonSIzeAdapter();
		}

		@Override
		public Adapter caseImageProperty(ImageProperty object) {
			return createImagePropertyAdapter();
		}

		@Override
		public Adapter caseTextModifier(TextModifier object) {
			return createTextModifierAdapter();
		}

		@Override
		public Adapter caseHeadingModifier(HeadingModifier object) {
			return createHeadingModifierAdapter();
		}

		@Override
		public Adapter caseTitleProperty(TitleProperty object) {
			return createTitlePropertyAdapter();
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
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.PageContent
	 * @generated
	 */
	public Adapter createPageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.TextPageContent <em>Text Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.TextPageContent
	 * @generated
	 */
	public Adapter createTextPageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.TextContainer
	 * @generated
	 */
	public Adapter createTextContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Paragraphe <em>Paragraphe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Paragraphe
	 * @generated
	 */
	public Adapter createParagrapheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.ContainableTextElement <em>Containable Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.ContainableTextElement
	 * @generated
	 */
	public Adapter createContainableTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Button <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Button
	 * @generated
	 */
	public Adapter createButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.CompositeTextElement <em>Composite Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.CompositeTextElement
	 * @generated
	 */
	public Adapter createCompositeTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.TextContainable <em>Text Containable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.TextContainable
	 * @generated
	 */
	public Adapter createTextContainableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.UrlBasedLink <em>Url Based Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.UrlBasedLink
	 * @generated
	 */
	public Adapter createUrlBasedLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Strong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Strong
	 * @generated
	 */
	public Adapter createStrongAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Italic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Italic
	 * @generated
	 */
	public Adapter createItalicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.TextElement
	 * @generated
	 */
	public Adapter createTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.TextNested <em>Text Nested</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.TextNested
	 * @generated
	 */
	public Adapter createTextNestedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.TextNestedElement <em>Text Nested Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.TextNestedElement
	 * @generated
	 */
	public Adapter createTextNestedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.GeneralProperty <em>General Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.GeneralProperty
	 * @generated
	 */
	public Adapter createGeneralPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.SpecificProperty <em>Specific Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.SpecificProperty
	 * @generated
	 */
	public Adapter createSpecificPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.MargesProperty <em>Marges Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.MargesProperty
	 * @generated
	 */
	public Adapter createMargesPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Margin <em>Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Margin
	 * @generated
	 */
	public Adapter createMarginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.Padding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.Padding
	 * @generated
	 */
	public Adapter createPaddingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.BackgroundProperty <em>Background Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.BackgroundProperty
	 * @generated
	 */
	public Adapter createBackgroundPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.ButtonProperty <em>Button Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.ButtonProperty
	 * @generated
	 */
	public Adapter createButtonPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.ButtonBasic <em>Button Basic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.ButtonBasic
	 * @generated
	 */
	public Adapter createButtonBasicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.ButtonStyle <em>Button Style</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.ButtonStyle
	 * @generated
	 */
	public Adapter createButtonStyleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.MuteLink <em>Mute Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.MuteLink
	 * @generated
	 */
	public Adapter createMuteLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.LinkProperty <em>Link Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.LinkProperty
	 * @generated
	 */
	public Adapter createLinkPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.ButtonSIze <em>Button SIze</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.ButtonSIze
	 * @generated
	 */
	public Adapter createButtonSIzeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.ImageProperty <em>Image Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.ImageProperty
	 * @generated
	 */
	public Adapter createImagePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.TextModifier <em>Text Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.TextModifier
	 * @generated
	 */
	public Adapter createTextModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.HeadingModifier <em>Heading Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.HeadingModifier
	 * @generated
	 */
	public Adapter createHeadingModifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.uikit.mm.uikit.TitleProperty <em>Title Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.uikit.mm.uikit.TitleProperty
	 * @generated
	 */
	public Adapter createTitlePropertyAdapter() {
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

} //UikitAdapterFactory
