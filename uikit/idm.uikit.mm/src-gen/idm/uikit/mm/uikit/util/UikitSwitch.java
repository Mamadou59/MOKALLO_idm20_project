/**
 */
package idm.uikit.mm.uikit.util;

import idm.uikit.mm.uikit.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see idm.uikit.mm.uikit.UikitPackage
 * @generated
 */
public class UikitSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UikitPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UikitSwitch() {
		if (modelPackage == null) {
			modelPackage = UikitPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case UikitPackage.PAGE: {
			Page page = (Page) theEObject;
			T result = casePage(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.PAGE_CONTENT: {
			PageContent pageContent = (PageContent) theEObject;
			T result = casePageContent(pageContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = casePageContent(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.TEXT_PAGE_CONTENT: {
			TextPageContent textPageContent = (TextPageContent) theEObject;
			T result = caseTextPageContent(textPageContent);
			if (result == null)
				result = casePageContent(textPageContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.TEXT_CONTAINER: {
			TextContainer textContainer = (TextContainer) theEObject;
			T result = caseTextContainer(textContainer);
			if (result == null)
				result = caseTextPageContent(textContainer);
			if (result == null)
				result = casePageContent(textContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.PARAGRAPHE: {
			Paragraphe paragraphe = (Paragraphe) theEObject;
			T result = caseParagraphe(paragraphe);
			if (result == null)
				result = caseTextContainer(paragraphe);
			if (result == null)
				result = caseTextPageContent(paragraphe);
			if (result == null)
				result = casePageContent(paragraphe);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.TITLE: {
			Title title = (Title) theEObject;
			T result = caseTitle(title);
			if (result == null)
				result = caseTextContainer(title);
			if (result == null)
				result = caseTextPageContent(title);
			if (result == null)
				result = casePageContent(title);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.CONTAINABLE_TEXT_ELEMENT: {
			ContainableTextElement containableTextElement = (ContainableTextElement) theEObject;
			T result = caseContainableTextElement(containableTextElement);
			if (result == null)
				result = caseTextPageContent(containableTextElement);
			if (result == null)
				result = caseTextElement(containableTextElement);
			if (result == null)
				result = casePageContent(containableTextElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.BUTTON: {
			Button button = (Button) theEObject;
			T result = caseButton(button);
			if (result == null)
				result = caseContainableTextElement(button);
			if (result == null)
				result = caseTextNested(button);
			if (result == null)
				result = caseTextPageContent(button);
			if (result == null)
				result = caseTextElement(button);
			if (result == null)
				result = casePageContent(button);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.COMPOSITE_TEXT_ELEMENT: {
			CompositeTextElement compositeTextElement = (CompositeTextElement) theEObject;
			T result = caseCompositeTextElement(compositeTextElement);
			if (result == null)
				result = caseContainableTextElement(compositeTextElement);
			if (result == null)
				result = caseTextPageContent(compositeTextElement);
			if (result == null)
				result = caseTextElement(compositeTextElement);
			if (result == null)
				result = casePageContent(compositeTextElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.TEXT_CONTAINABLE: {
			TextContainable textContainable = (TextContainable) theEObject;
			T result = caseTextContainable(textContainable);
			if (result == null)
				result = caseContainableTextElement(textContainable);
			if (result == null)
				result = caseTextNestedElement(textContainable);
			if (result == null)
				result = caseTextNested(textContainable);
			if (result == null)
				result = caseTextPageContent(textContainable);
			if (result == null)
				result = caseTextElement(textContainable);
			if (result == null)
				result = casePageContent(textContainable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.URL_BASED_LINK: {
			UrlBasedLink urlBasedLink = (UrlBasedLink) theEObject;
			T result = caseUrlBasedLink(urlBasedLink);
			if (result == null)
				result = caseCompositeTextElement(urlBasedLink);
			if (result == null)
				result = caseContainableTextElement(urlBasedLink);
			if (result == null)
				result = caseTextPageContent(urlBasedLink);
			if (result == null)
				result = caseTextElement(urlBasedLink);
			if (result == null)
				result = casePageContent(urlBasedLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.LINK: {
			Link link = (Link) theEObject;
			T result = caseLink(link);
			if (result == null)
				result = caseUrlBasedLink(link);
			if (result == null)
				result = caseTextNested(link);
			if (result == null)
				result = caseCompositeTextElement(link);
			if (result == null)
				result = caseContainableTextElement(link);
			if (result == null)
				result = caseTextPageContent(link);
			if (result == null)
				result = caseTextElement(link);
			if (result == null)
				result = casePageContent(link);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = caseUrlBasedLink(image);
			if (result == null)
				result = caseCompositeTextElement(image);
			if (result == null)
				result = caseContainableTextElement(image);
			if (result == null)
				result = caseTextPageContent(image);
			if (result == null)
				result = caseTextElement(image);
			if (result == null)
				result = casePageContent(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.STRONG: {
			Strong strong = (Strong) theEObject;
			T result = caseStrong(strong);
			if (result == null)
				result = caseTextContainable(strong);
			if (result == null)
				result = caseContainableTextElement(strong);
			if (result == null)
				result = caseTextNestedElement(strong);
			if (result == null)
				result = caseTextNested(strong);
			if (result == null)
				result = caseTextPageContent(strong);
			if (result == null)
				result = caseTextElement(strong);
			if (result == null)
				result = casePageContent(strong);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.ITALIC: {
			Italic italic = (Italic) theEObject;
			T result = caseItalic(italic);
			if (result == null)
				result = caseTextContainable(italic);
			if (result == null)
				result = caseContainableTextElement(italic);
			if (result == null)
				result = caseTextNestedElement(italic);
			if (result == null)
				result = caseTextNested(italic);
			if (result == null)
				result = caseTextPageContent(italic);
			if (result == null)
				result = caseTextElement(italic);
			if (result == null)
				result = casePageContent(italic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.TEXT_ELEMENT: {
			TextElement textElement = (TextElement) theEObject;
			T result = caseTextElement(textElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.TEXT: {
			Text text = (Text) theEObject;
			T result = caseText(text);
			if (result == null)
				result = caseTextElement(text);
			if (result == null)
				result = caseTextNestedElement(text);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.CODE: {
			Code code = (Code) theEObject;
			T result = caseCode(code);
			if (result == null)
				result = caseText(code);
			if (result == null)
				result = caseTextElement(code);
			if (result == null)
				result = caseTextNestedElement(code);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.TEXT_NESTED: {
			TextNested textNested = (TextNested) theEObject;
			T result = caseTextNested(textNested);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.TEXT_NESTED_ELEMENT: {
			TextNestedElement textNestedElement = (TextNestedElement) theEObject;
			T result = caseTextNestedElement(textNestedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.PROPERTY: {
			Property property = (Property) theEObject;
			T result = caseProperty(property);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.GENERAL_PROPERTY: {
			GeneralProperty generalProperty = (GeneralProperty) theEObject;
			T result = caseGeneralProperty(generalProperty);
			if (result == null)
				result = caseProperty(generalProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.SPECIFIC_PROPERTY: {
			SpecificProperty specificProperty = (SpecificProperty) theEObject;
			T result = caseSpecificProperty(specificProperty);
			if (result == null)
				result = caseProperty(specificProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.MARGES_PROPERTY: {
			MargesProperty margesProperty = (MargesProperty) theEObject;
			T result = caseMargesProperty(margesProperty);
			if (result == null)
				result = caseGeneralProperty(margesProperty);
			if (result == null)
				result = caseProperty(margesProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.MARGIN: {
			Margin margin = (Margin) theEObject;
			T result = caseMargin(margin);
			if (result == null)
				result = caseMargesProperty(margin);
			if (result == null)
				result = caseGeneralProperty(margin);
			if (result == null)
				result = caseProperty(margin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.PADDING: {
			Padding padding = (Padding) theEObject;
			T result = casePadding(padding);
			if (result == null)
				result = caseMargesProperty(padding);
			if (result == null)
				result = caseGeneralProperty(padding);
			if (result == null)
				result = caseProperty(padding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.BACKGROUND_PROPERTY: {
			BackgroundProperty backgroundProperty = (BackgroundProperty) theEObject;
			T result = caseBackgroundProperty(backgroundProperty);
			if (result == null)
				result = caseGeneralProperty(backgroundProperty);
			if (result == null)
				result = caseProperty(backgroundProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.BUTTON_PROPERTY: {
			ButtonProperty buttonProperty = (ButtonProperty) theEObject;
			T result = caseButtonProperty(buttonProperty);
			if (result == null)
				result = caseSpecificProperty(buttonProperty);
			if (result == null)
				result = caseProperty(buttonProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.BUTTON_BASIC: {
			ButtonBasic buttonBasic = (ButtonBasic) theEObject;
			T result = caseButtonBasic(buttonBasic);
			if (result == null)
				result = caseButtonProperty(buttonBasic);
			if (result == null)
				result = caseSpecificProperty(buttonBasic);
			if (result == null)
				result = caseProperty(buttonBasic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.BUTTON_STYLE: {
			ButtonStyle buttonStyle = (ButtonStyle) theEObject;
			T result = caseButtonStyle(buttonStyle);
			if (result == null)
				result = caseButtonProperty(buttonStyle);
			if (result == null)
				result = caseSpecificProperty(buttonStyle);
			if (result == null)
				result = caseProperty(buttonStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.MUTE_LINK: {
			MuteLink muteLink = (MuteLink) theEObject;
			T result = caseMuteLink(muteLink);
			if (result == null)
				result = caseLinkProperty(muteLink);
			if (result == null)
				result = caseSpecificProperty(muteLink);
			if (result == null)
				result = caseProperty(muteLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.LINK_PROPERTY: {
			LinkProperty linkProperty = (LinkProperty) theEObject;
			T result = caseLinkProperty(linkProperty);
			if (result == null)
				result = caseSpecificProperty(linkProperty);
			if (result == null)
				result = caseProperty(linkProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.BUTTON_SIZE: {
			ButtonSIze buttonSIze = (ButtonSIze) theEObject;
			T result = caseButtonSIze(buttonSIze);
			if (result == null)
				result = caseButtonProperty(buttonSIze);
			if (result == null)
				result = caseSpecificProperty(buttonSIze);
			if (result == null)
				result = caseProperty(buttonSIze);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.IMAGE_PROPERTY: {
			ImageProperty imageProperty = (ImageProperty) theEObject;
			T result = caseImageProperty(imageProperty);
			if (result == null)
				result = caseSpecificProperty(imageProperty);
			if (result == null)
				result = caseProperty(imageProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.TEXT_MODIFIER: {
			TextModifier textModifier = (TextModifier) theEObject;
			T result = caseTextModifier(textModifier);
			if (result == null)
				result = caseLinkProperty(textModifier);
			if (result == null)
				result = caseSpecificProperty(textModifier);
			if (result == null)
				result = caseProperty(textModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.HEADING_MODIFIER: {
			HeadingModifier headingModifier = (HeadingModifier) theEObject;
			T result = caseHeadingModifier(headingModifier);
			if (result == null)
				result = caseLinkProperty(headingModifier);
			if (result == null)
				result = caseSpecificProperty(headingModifier);
			if (result == null)
				result = caseProperty(headingModifier);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UikitPackage.TITLE_PROPERTY: {
			TitleProperty titleProperty = (TitleProperty) theEObject;
			T result = caseTitleProperty(titleProperty);
			if (result == null)
				result = caseSpecificProperty(titleProperty);
			if (result == null)
				result = caseProperty(titleProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageContent(PageContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Page Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Page Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextPageContent(TextPageContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextContainer(TextContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraphe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraphe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraphe(Paragraphe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitle(Title object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containable Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containable Text Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainableTextElement(ContainableTextElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButton(Button object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Text Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeTextElement(CompositeTextElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Containable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Containable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextContainable(TextContainable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Url Based Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Url Based Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUrlBasedLink(UrlBasedLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrong(Strong object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Italic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Italic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItalic(Italic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextElement(TextElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseText(Text object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCode(Code object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Nested</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Nested</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextNested(TextNested object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Nested Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Nested Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextNestedElement(TextNestedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralProperty(GeneralProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificProperty(SpecificProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marges Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marges Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMargesProperty(MargesProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Margin</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Margin</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMargin(Margin object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Padding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Padding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePadding(Padding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Background Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackgroundProperty(BackgroundProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonProperty(ButtonProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonBasic(ButtonBasic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Style</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Style</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonStyle(ButtonStyle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mute Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mute Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMuteLink(MuteLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkProperty(LinkProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button SIze</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button SIze</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonSIze(ButtonSIze object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageProperty(ImageProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextModifier(TextModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Heading Modifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Heading Modifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadingModifier(HeadingModifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleProperty(TitleProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UikitSwitch
