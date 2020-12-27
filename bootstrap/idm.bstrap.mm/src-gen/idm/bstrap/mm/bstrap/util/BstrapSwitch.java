/**
 */
package idm.bstrap.mm.bstrap.util;

import idm.bstrap.mm.bstrap.Active;
import idm.bstrap.mm.bstrap.Background;
import idm.bstrap.mm.bstrap.Basic;
import idm.bstrap.mm.bstrap.BasicList;
import idm.bstrap.mm.bstrap.Bold;
import idm.bstrap.mm.bstrap.Border;
import idm.bstrap.mm.bstrap.BorderProperty;
import idm.bstrap.mm.bstrap.Brand;
import idm.bstrap.mm.bstrap.BstrapPackage;
import idm.bstrap.mm.bstrap.Button;
import idm.bstrap.mm.bstrap.ButtonProperty;
import idm.bstrap.mm.bstrap.ButtonSize;
import idm.bstrap.mm.bstrap.ButtonState;
import idm.bstrap.mm.bstrap.ButtonStyle;
import idm.bstrap.mm.bstrap.Center;
import idm.bstrap.mm.bstrap.Centered;
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
import idm.bstrap.mm.bstrap.Emphasis;
import idm.bstrap.mm.bstrap.FixContainer;
import idm.bstrap.mm.bstrap.FluidContainer;
import idm.bstrap.mm.bstrap.General;
import idm.bstrap.mm.bstrap.HorizontalList;
import idm.bstrap.mm.bstrap.Image;
import idm.bstrap.mm.bstrap.ImageAligning;
import idm.bstrap.mm.bstrap.ImageProperty;
import idm.bstrap.mm.bstrap.ImageShape;
import idm.bstrap.mm.bstrap.Italic;
import idm.bstrap.mm.bstrap.ItalicProperty;
import idm.bstrap.mm.bstrap.Link;
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
import idm.bstrap.mm.bstrap.Strong;
import idm.bstrap.mm.bstrap.TestNestedElement;
import idm.bstrap.mm.bstrap.Text;
import idm.bstrap.mm.bstrap.TextContainable;
import idm.bstrap.mm.bstrap.TextContainer;
import idm.bstrap.mm.bstrap.TextElements;
import idm.bstrap.mm.bstrap.TextNested;
import idm.bstrap.mm.bstrap.TextPageContent;
import idm.bstrap.mm.bstrap.Thumbnail;
import idm.bstrap.mm.bstrap.Title;
import idm.bstrap.mm.bstrap.UnOrderedList;
import idm.bstrap.mm.bstrap.UrlBasedLink;
import idm.bstrap.mm.bstrap.Vertical;

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
 * @see idm.bstrap.mm.bstrap.BstrapPackage
 * @generated
 */
public class BstrapSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BstrapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BstrapSwitch() {
		if (modelPackage == null) {
			modelPackage = BstrapPackage.eINSTANCE;
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
		case BstrapPackage.PAGE: {
			Page page = (Page) theEObject;
			T result = casePage(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.CONTAINER: {
			Container container = (Container) theEObject;
			T result = caseContainer(container);
			if (result == null)
				result = casePageContent(container);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.FIX_CONTAINER: {
			FixContainer fixContainer = (FixContainer) theEObject;
			T result = caseFixContainer(fixContainer);
			if (result == null)
				result = caseContainer(fixContainer);
			if (result == null)
				result = casePageContent(fixContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.FLUID_CONTAINER: {
			FluidContainer fluidContainer = (FluidContainer) theEObject;
			T result = caseFluidContainer(fluidContainer);
			if (result == null)
				result = caseContainer(fluidContainer);
			if (result == null)
				result = casePageContent(fluidContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TEXT_CONTAINER: {
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
		case BstrapPackage.PARAGRAPHE: {
			Paragraphe paragraphe = (Paragraphe) theEObject;
			T result = caseParagraphe(paragraphe);
			if (result == null)
				result = caseTextContainer(paragraphe);
			if (result == null)
				result = caseListItemElement(paragraphe);
			if (result == null)
				result = caseTextPageContent(paragraphe);
			if (result == null)
				result = casePageContent(paragraphe);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TITLE: {
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
		case BstrapPackage.TEXT_ELEMENTS: {
			TextElements textElements = (TextElements) theEObject;
			T result = caseTextElements(textElements);
			if (result == null)
				result = caseListItemElement(textElements);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TEXT: {
			Text text = (Text) theEObject;
			T result = caseText(text);
			if (result == null)
				result = caseTextElements(text);
			if (result == null)
				result = caseTestNestedElement(text);
			if (result == null)
				result = caseListItemElement(text);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.CODE: {
			Code code = (Code) theEObject;
			T result = caseCode(code);
			if (result == null)
				result = caseText(code);
			if (result == null)
				result = caseTextElements(code);
			if (result == null)
				result = caseTestNestedElement(code);
			if (result == null)
				result = caseListItemElement(code);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.COMPOSITE_TEXT_ELEMENT: {
			CompositeTextElement compositeTextElement = (CompositeTextElement) theEObject;
			T result = caseCompositeTextElement(compositeTextElement);
			if (result == null)
				result = caseContainableTextElement(compositeTextElement);
			if (result == null)
				result = caseTextElements(compositeTextElement);
			if (result == null)
				result = caseTextPageContent(compositeTextElement);
			if (result == null)
				result = caseListItemElement(compositeTextElement);
			if (result == null)
				result = casePageContent(compositeTextElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.URL_BASED_LINK: {
			UrlBasedLink urlBasedLink = (UrlBasedLink) theEObject;
			T result = caseUrlBasedLink(urlBasedLink);
			if (result == null)
				result = caseCompositeTextElement(urlBasedLink);
			if (result == null)
				result = caseContainableTextElement(urlBasedLink);
			if (result == null)
				result = caseTextElements(urlBasedLink);
			if (result == null)
				result = caseTextPageContent(urlBasedLink);
			if (result == null)
				result = caseListItemElement(urlBasedLink);
			if (result == null)
				result = casePageContent(urlBasedLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = caseUrlBasedLink(image);
			if (result == null)
				result = caseCompositeTextElement(image);
			if (result == null)
				result = caseContainableTextElement(image);
			if (result == null)
				result = caseTextElements(image);
			if (result == null)
				result = caseTextPageContent(image);
			if (result == null)
				result = caseListItemElement(image);
			if (result == null)
				result = casePageContent(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.CONTAINABLE_TEXT_ELEMENT: {
			ContainableTextElement containableTextElement = (ContainableTextElement) theEObject;
			T result = caseContainableTextElement(containableTextElement);
			if (result == null)
				result = caseTextElements(containableTextElement);
			if (result == null)
				result = caseTextPageContent(containableTextElement);
			if (result == null)
				result = caseListItemElement(containableTextElement);
			if (result == null)
				result = casePageContent(containableTextElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.GENERAL: {
			General general = (General) theEObject;
			T result = caseGeneral(general);
			if (result == null)
				result = casePropertyClass(general);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.PROPERTY_CLASS: {
			PropertyClass propertyClass = (PropertyClass) theEObject;
			T result = casePropertyClass(propertyClass);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.MARGES_PROPERTY: {
			MargesProperty margesProperty = (MargesProperty) theEObject;
			T result = caseMargesProperty(margesProperty);
			if (result == null)
				result = caseGeneral(margesProperty);
			if (result == null)
				result = casePropertyClass(margesProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.MARGIN: {
			Margin margin = (Margin) theEObject;
			T result = caseMargin(margin);
			if (result == null)
				result = caseMargesProperty(margin);
			if (result == null)
				result = caseGeneral(margin);
			if (result == null)
				result = casePropertyClass(margin);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.PADDING: {
			Padding padding = (Padding) theEObject;
			T result = casePadding(padding);
			if (result == null)
				result = caseMargesProperty(padding);
			if (result == null)
				result = caseGeneral(padding);
			if (result == null)
				result = casePropertyClass(padding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BACKGROUND: {
			Background background = (Background) theEObject;
			T result = caseBackground(background);
			if (result == null)
				result = caseGeneral(background);
			if (result == null)
				result = casePropertyClass(background);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BORDER_PROPERTY: {
			BorderProperty borderProperty = (BorderProperty) theEObject;
			T result = caseBorderProperty(borderProperty);
			if (result == null)
				result = caseGeneral(borderProperty);
			if (result == null)
				result = casePropertyClass(borderProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BORDER: {
			Border border = (Border) theEObject;
			T result = caseBorder(border);
			if (result == null)
				result = caseBorderProperty(border);
			if (result == null)
				result = caseGeneral(border);
			if (result == null)
				result = casePropertyClass(border);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.COLORED_BORDER: {
			ColoredBorder coloredBorder = (ColoredBorder) theEObject;
			T result = caseColoredBorder(coloredBorder);
			if (result == null)
				result = caseBorderProperty(coloredBorder);
			if (result == null)
				result = caseGeneral(coloredBorder);
			if (result == null)
				result = casePropertyClass(coloredBorder);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.DISPLAY_PROPERTY: {
			DisplayProperty displayProperty = (DisplayProperty) theEObject;
			T result = caseDisplayProperty(displayProperty);
			if (result == null)
				result = casePropertyClass(displayProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.DISPLAY1: {
			Display1 display1 = (Display1) theEObject;
			T result = caseDisplay1(display1);
			if (result == null)
				result = caseDisplayProperty(display1);
			if (result == null)
				result = casePropertyClass(display1);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.DISPLAY2: {
			Display2 display2 = (Display2) theEObject;
			T result = caseDisplay2(display2);
			if (result == null)
				result = caseDisplayProperty(display2);
			if (result == null)
				result = casePropertyClass(display2);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.DISPLAY3: {
			Display3 display3 = (Display3) theEObject;
			T result = caseDisplay3(display3);
			if (result == null)
				result = caseDisplayProperty(display3);
			if (result == null)
				result = casePropertyClass(display3);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.DISPLAY4: {
			Display4 display4 = (Display4) theEObject;
			T result = caseDisplay4(display4);
			if (result == null)
				result = caseDisplayProperty(display4);
			if (result == null)
				result = casePropertyClass(display4);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BUTTON_PROPERTY: {
			ButtonProperty buttonProperty = (ButtonProperty) theEObject;
			T result = caseButtonProperty(buttonProperty);
			if (result == null)
				result = casePropertyClass(buttonProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.IMAGE_PROPERTY: {
			ImageProperty imageProperty = (ImageProperty) theEObject;
			T result = caseImageProperty(imageProperty);
			if (result == null)
				result = casePropertyClass(imageProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.IMAGE_SHAPE: {
			ImageShape imageShape = (ImageShape) theEObject;
			T result = caseImageShape(imageShape);
			if (result == null)
				result = caseImageProperty(imageShape);
			if (result == null)
				result = casePropertyClass(imageShape);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.IMAGE_ALIGNING: {
			ImageAligning imageAligning = (ImageAligning) theEObject;
			T result = caseImageAligning(imageAligning);
			if (result == null)
				result = caseImageProperty(imageAligning);
			if (result == null)
				result = casePropertyClass(imageAligning);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.ROUNDED: {
			Rounded rounded = (Rounded) theEObject;
			T result = caseRounded(rounded);
			if (result == null)
				result = caseImageShape(rounded);
			if (result == null)
				result = caseImageProperty(rounded);
			if (result == null)
				result = casePropertyClass(rounded);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.THUMBNAIL: {
			Thumbnail thumbnail = (Thumbnail) theEObject;
			T result = caseThumbnail(thumbnail);
			if (result == null)
				result = caseImageShape(thumbnail);
			if (result == null)
				result = caseImageProperty(thumbnail);
			if (result == null)
				result = casePropertyClass(thumbnail);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.CIRCLE: {
			Circle circle = (Circle) theEObject;
			T result = caseCircle(circle);
			if (result == null)
				result = caseImageShape(circle);
			if (result == null)
				result = caseImageProperty(circle);
			if (result == null)
				result = casePropertyClass(circle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.FLOAT: {
			idm.bstrap.mm.bstrap.Float float_ = (idm.bstrap.mm.bstrap.Float) theEObject;
			T result = caseFloat(float_);
			if (result == null)
				result = caseImageAligning(float_);
			if (result == null)
				result = caseImageProperty(float_);
			if (result == null)
				result = casePropertyClass(float_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.CENTER: {
			Center center = (Center) theEObject;
			T result = caseCenter(center);
			if (result == null)
				result = caseImageAligning(center);
			if (result == null)
				result = caseImageProperty(center);
			if (result == null)
				result = casePropertyClass(center);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.RESPONSIVE: {
			Responsive responsive = (Responsive) theEObject;
			T result = caseResponsive(responsive);
			if (result == null)
				result = caseImageAligning(responsive);
			if (result == null)
				result = caseImageProperty(responsive);
			if (result == null)
				result = casePropertyClass(responsive);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BUTTON_STYLE: {
			ButtonStyle buttonStyle = (ButtonStyle) theEObject;
			T result = caseButtonStyle(buttonStyle);
			if (result == null)
				result = caseButtonProperty(buttonStyle);
			if (result == null)
				result = casePropertyClass(buttonStyle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BUTTON_SIZE: {
			ButtonSize buttonSize = (ButtonSize) theEObject;
			T result = caseButtonSize(buttonSize);
			if (result == null)
				result = caseButtonProperty(buttonSize);
			if (result == null)
				result = casePropertyClass(buttonSize);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LINK_PROPERTY: {
			LinkProperty linkProperty = (LinkProperty) theEObject;
			T result = caseLinkProperty(linkProperty);
			if (result == null)
				result = caseButtonStyle(linkProperty);
			if (result == null)
				result = caseButtonProperty(linkProperty);
			if (result == null)
				result = casePropertyClass(linkProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BUTTON_STATE: {
			ButtonState buttonState = (ButtonState) theEObject;
			T result = caseButtonState(buttonState);
			if (result == null)
				result = caseButtonProperty(buttonState);
			if (result == null)
				result = casePropertyClass(buttonState);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.DISABLED: {
			Disabled disabled = (Disabled) theEObject;
			T result = caseDisabled(disabled);
			if (result == null)
				result = caseButtonState(disabled);
			if (result == null)
				result = caseButtonProperty(disabled);
			if (result == null)
				result = casePropertyClass(disabled);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.ACTIVE: {
			Active active = (Active) theEObject;
			T result = caseActive(active);
			if (result == null)
				result = caseButtonState(active);
			if (result == null)
				result = caseButtonProperty(active);
			if (result == null)
				result = casePropertyClass(active);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BUTTON: {
			Button button = (Button) theEObject;
			T result = caseButton(button);
			if (result == null)
				result = caseContainableTextElement(button);
			if (result == null)
				result = caseTextNested(button);
			if (result == null)
				result = caseTextElements(button);
			if (result == null)
				result = caseTextPageContent(button);
			if (result == null)
				result = caseListItemElement(button);
			if (result == null)
				result = casePageContent(button);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.PAGE_CONTENT: {
			PageContent pageContent = (PageContent) theEObject;
			T result = casePageContent(pageContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TEXT_PAGE_CONTENT: {
			TextPageContent textPageContent = (TextPageContent) theEObject;
			T result = caseTextPageContent(textPageContent);
			if (result == null)
				result = casePageContent(textPageContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LIST_ELEMENT: {
			ListElement listElement = (ListElement) theEObject;
			T result = caseListElement(listElement);
			if (result == null)
				result = caseTextPageContent(listElement);
			if (result == null)
				result = caseListItemElement(listElement);
			if (result == null)
				result = casePageContent(listElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.ORDER_LIST: {
			OrderList orderList = (OrderList) theEObject;
			T result = caseOrderList(orderList);
			if (result == null)
				result = caseListElement(orderList);
			if (result == null)
				result = caseTextPageContent(orderList);
			if (result == null)
				result = caseListItemElement(orderList);
			if (result == null)
				result = casePageContent(orderList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.UN_ORDERED_LIST: {
			UnOrderedList unOrderedList = (UnOrderedList) theEObject;
			T result = caseUnOrderedList(unOrderedList);
			if (result == null)
				result = caseListElement(unOrderedList);
			if (result == null)
				result = caseTextPageContent(unOrderedList);
			if (result == null)
				result = caseListItemElement(unOrderedList);
			if (result == null)
				result = casePageContent(unOrderedList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LIST_ITEM: {
			ListItem listItem = (ListItem) theEObject;
			T result = caseListItem(listItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LIST_ITEM_ELEMENT: {
			ListItemElement listItemElement = (ListItemElement) theEObject;
			T result = caseListItemElement(listItemElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.NAVIGATION: {
			Navigation navigation = (Navigation) theEObject;
			T result = caseNavigation(navigation);
			if (result == null)
				result = caseTextPageContent(navigation);
			if (result == null)
				result = casePageContent(navigation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.CENTERED: {
			Centered centered = (Centered) theEObject;
			T result = caseCentered(centered);
			if (result == null)
				result = caseNavBarProperty(centered);
			if (result == null)
				result = casePropertyClass(centered);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LIST_PROPERTY: {
			ListProperty listProperty = (ListProperty) theEObject;
			T result = caseListProperty(listProperty);
			if (result == null)
				result = casePropertyClass(listProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BASIC_LIST: {
			BasicList basicList = (BasicList) theEObject;
			T result = caseBasicList(basicList);
			if (result == null)
				result = caseListProperty(basicList);
			if (result == null)
				result = casePropertyClass(basicList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.HORIZONTAL_LIST: {
			HorizontalList horizontalList = (HorizontalList) theEObject;
			T result = caseHorizontalList(horizontalList);
			if (result == null)
				result = caseListProperty(horizontalList);
			if (result == null)
				result = casePropertyClass(horizontalList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.NAV_BAR_PROPERTY: {
			NavBarProperty navBarProperty = (NavBarProperty) theEObject;
			T result = caseNavBarProperty(navBarProperty);
			if (result == null)
				result = casePropertyClass(navBarProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BASIC: {
			Basic basic = (Basic) theEObject;
			T result = caseBasic(basic);
			if (result == null)
				result = caseNavBarProperty(basic);
			if (result == null)
				result = casePropertyClass(basic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.VERTICAL: {
			Vertical vertical = (Vertical) theEObject;
			T result = caseVertical(vertical);
			if (result == null)
				result = caseNavBarProperty(vertical);
			if (result == null)
				result = casePropertyClass(vertical);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.EMPHASIS: {
			Emphasis emphasis = (Emphasis) theEObject;
			T result = caseEmphasis(emphasis);
			if (result == null)
				result = casePropertyClass(emphasis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.ITALIC_PROPERTY: {
			ItalicProperty italicProperty = (ItalicProperty) theEObject;
			T result = caseItalicProperty(italicProperty);
			if (result == null)
				result = caseEmphasis(italicProperty);
			if (result == null)
				result = casePropertyClass(italicProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BOLD: {
			Bold bold = (Bold) theEObject;
			T result = caseBold(bold);
			if (result == null)
				result = caseEmphasis(bold);
			if (result == null)
				result = casePropertyClass(bold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.LINK: {
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
				result = caseTextElements(link);
			if (result == null)
				result = caseTextPageContent(link);
			if (result == null)
				result = caseListItemElement(link);
			if (result == null)
				result = casePageContent(link);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.STRONG: {
			Strong strong = (Strong) theEObject;
			T result = caseStrong(strong);
			if (result == null)
				result = caseTextContainable(strong);
			if (result == null)
				result = caseContainableTextElement(strong);
			if (result == null)
				result = caseTextNested(strong);
			if (result == null)
				result = caseTestNestedElement(strong);
			if (result == null)
				result = caseTextElements(strong);
			if (result == null)
				result = caseTextPageContent(strong);
			if (result == null)
				result = caseListItemElement(strong);
			if (result == null)
				result = casePageContent(strong);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.ITALIC: {
			Italic italic = (Italic) theEObject;
			T result = caseItalic(italic);
			if (result == null)
				result = caseTextContainable(italic);
			if (result == null)
				result = caseContainableTextElement(italic);
			if (result == null)
				result = caseTextNested(italic);
			if (result == null)
				result = caseTestNestedElement(italic);
			if (result == null)
				result = caseTextElements(italic);
			if (result == null)
				result = caseTextPageContent(italic);
			if (result == null)
				result = caseListItemElement(italic);
			if (result == null)
				result = casePageContent(italic);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TEXT_CONTAINABLE: {
			TextContainable textContainable = (TextContainable) theEObject;
			T result = caseTextContainable(textContainable);
			if (result == null)
				result = caseContainableTextElement(textContainable);
			if (result == null)
				result = caseTextNested(textContainable);
			if (result == null)
				result = caseTestNestedElement(textContainable);
			if (result == null)
				result = caseTextElements(textContainable);
			if (result == null)
				result = caseTextPageContent(textContainable);
			if (result == null)
				result = caseListItemElement(textContainable);
			if (result == null)
				result = casePageContent(textContainable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TEXT_NESTED: {
			TextNested textNested = (TextNested) theEObject;
			T result = caseTextNested(textNested);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TEST_NESTED_ELEMENT: {
			TestNestedElement testNestedElement = (TestNestedElement) theEObject;
			T result = caseTestNestedElement(testNestedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.BRAND: {
			Brand brand = (Brand) theEObject;
			T result = caseBrand(brand);
			if (result == null)
				result = caseNavBarProperty(brand);
			if (result == null)
				result = casePropertyClass(brand);
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
	 * Returns the result of interpreting the object as an instance of '<em>Fix Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fix Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixContainer(FixContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fluid Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fluid Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFluidContainer(FluidContainer object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Text Elements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Elements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextElements(TextElements object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>General</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneral(General object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyClass(PropertyClass object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Background</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Background</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackground(Background object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorderProperty(BorderProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBorder(Border object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colored Border</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colored Border</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColoredBorder(ColoredBorder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplayProperty(DisplayProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay1(Display1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay2(Display2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay3(Display3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Display4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Display4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisplay4(Display4 object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Image Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageShape(ImageShape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Aligning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Aligning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageAligning(ImageAligning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rounded</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rounded</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRounded(Rounded object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thumbnail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thumbnail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThumbnail(Thumbnail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Float</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Float</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFloat(idm.bstrap.mm.bstrap.Float object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Center</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Center</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenter(Center object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Responsive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Responsive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsive(Responsive object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Button Size</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Size</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonSize(ButtonSize object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Button State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonState(ButtonState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disabled</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disabled</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisabled(Disabled object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Active</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Active</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActive(Active object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>List Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListElement(ListElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderList(OrderList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Un Ordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Un Ordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnOrderedList(UnOrderedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItem(ListItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Item Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Item Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListItemElement(ListItemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigation(Navigation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Centered</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Centered</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCentered(Centered object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListProperty(ListProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicList(BasicList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalList(HorizontalList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nav Bar Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nav Bar Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavBarProperty(NavBarProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasic(Basic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertical(Vertical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emphasis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emphasis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmphasis(Emphasis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Italic Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Italic Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItalicProperty(ItalicProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBold(Bold object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Test Nested Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Nested Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestNestedElement(TestNestedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Brand</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Brand</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrand(Brand object) {
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

} //BstrapSwitch
