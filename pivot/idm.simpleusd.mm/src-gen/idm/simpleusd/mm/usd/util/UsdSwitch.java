/**
 */
package idm.simpleusd.mm.usd.util;

import idm.simpleusd.mm.usd.*;

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
 * @see idm.simpleusd.mm.usd.UsdPackage
 * @generated
 */
public class UsdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UsdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsdSwitch() {
		if (modelPackage == null) {
			modelPackage = UsdPackage.eINSTANCE;
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
		case UsdPackage.PAGE: {
			Page page = (Page) theEObject;
			T result = casePage(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.PAGE_CONTENT: {
			PageContent pageContent = (PageContent) theEObject;
			T result = casePageContent(pageContent);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TEXT_CONTAINER: {
			TextContainer textContainer = (TextContainer) theEObject;
			T result = caseTextContainer(textContainer);
			if (result == null)
				result = casePageContent(textContainer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.PARAGRAPH: {
			Paragraph paragraph = (Paragraph) theEObject;
			T result = caseParagraph(paragraph);
			if (result == null)
				result = caseTextContainer(paragraph);
			if (result == null)
				result = caseListItemElement(paragraph);
			if (result == null)
				result = casePageContent(paragraph);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TITLE: {
			Title title = (Title) theEObject;
			T result = caseTitle(title);
			if (result == null)
				result = caseTextContainer(title);
			if (result == null)
				result = casePageContent(title);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TEXT_ELEMENT: {
			TextElement textElement = (TextElement) theEObject;
			T result = caseTextElement(textElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TEXT: {
			Text text = (Text) theEObject;
			T result = caseText(text);
			if (result == null)
				result = caseTextElement(text);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.URL_BASED_LINK: {
			UrlBasedLink urlBasedLink = (UrlBasedLink) theEObject;
			T result = caseUrlBasedLink(urlBasedLink);
			if (result == null)
				result = caseCompositeTextElement(urlBasedLink);
			if (result == null)
				result = caseContainableTextElement(urlBasedLink);
			if (result == null)
				result = casePageContent(urlBasedLink);
			if (result == null)
				result = caseTextElement(urlBasedLink);
			if (result == null)
				result = caseListItemElement(urlBasedLink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.LINK: {
			Link link = (Link) theEObject;
			T result = caseLink(link);
			if (result == null)
				result = caseUrlBasedLink(link);
			if (result == null)
				result = caseCompositeTextElement(link);
			if (result == null)
				result = caseContainableTextElement(link);
			if (result == null)
				result = casePageContent(link);
			if (result == null)
				result = caseTextElement(link);
			if (result == null)
				result = caseListItemElement(link);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.IMAGE: {
			Image image = (Image) theEObject;
			T result = caseImage(image);
			if (result == null)
				result = caseUrlBasedLink(image);
			if (result == null)
				result = caseCompositeTextElement(image);
			if (result == null)
				result = caseContainableTextElement(image);
			if (result == null)
				result = casePageContent(image);
			if (result == null)
				result = caseTextElement(image);
			if (result == null)
				result = caseListItemElement(image);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.CODE: {
			Code code = (Code) theEObject;
			T result = caseCode(code);
			if (result == null)
				result = caseText(code);
			if (result == null)
				result = caseTextElement(code);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.STRONG_EMPHASIS: {
			StrongEmphasis strongEmphasis = (StrongEmphasis) theEObject;
			T result = caseStrongEmphasis(strongEmphasis);
			if (result == null)
				result = caseCompositeTextElement(strongEmphasis);
			if (result == null)
				result = caseContainableTextElement(strongEmphasis);
			if (result == null)
				result = casePageContent(strongEmphasis);
			if (result == null)
				result = caseTextElement(strongEmphasis);
			if (result == null)
				result = caseListItemElement(strongEmphasis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.ITALIC_EMPHASIS: {
			ItalicEmphasis italicEmphasis = (ItalicEmphasis) theEObject;
			T result = caseItalicEmphasis(italicEmphasis);
			if (result == null)
				result = caseCompositeTextElement(italicEmphasis);
			if (result == null)
				result = caseContainableTextElement(italicEmphasis);
			if (result == null)
				result = casePageContent(italicEmphasis);
			if (result == null)
				result = caseTextElement(italicEmphasis);
			if (result == null)
				result = caseListItemElement(italicEmphasis);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.LIST_ELEMENT: {
			ListElement listElement = (ListElement) theEObject;
			T result = caseListElement(listElement);
			if (result == null)
				result = casePageContent(listElement);
			if (result == null)
				result = caseListItemElement(listElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.LIST_ITEM: {
			ListItem listItem = (ListItem) theEObject;
			T result = caseListItem(listItem);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.LIST_ITEM_ELEMENT: {
			ListItemElement listItemElement = (ListItemElement) theEObject;
			T result = caseListItemElement(listItemElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.ORDERED_LIST: {
			OrderedList orderedList = (OrderedList) theEObject;
			T result = caseOrderedList(orderedList);
			if (result == null)
				result = caseListElement(orderedList);
			if (result == null)
				result = casePageContent(orderedList);
			if (result == null)
				result = caseListItemElement(orderedList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.UNORDERED_LIST: {
			UnorderedList unorderedList = (UnorderedList) theEObject;
			T result = caseUnorderedList(unorderedList);
			if (result == null)
				result = caseListElement(unorderedList);
			if (result == null)
				result = casePageContent(unorderedList);
			if (result == null)
				result = caseListItemElement(unorderedList);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.BLOCK_QUOTE: {
			BlockQuote blockQuote = (BlockQuote) theEObject;
			T result = caseBlockQuote(blockQuote);
			if (result == null)
				result = caseListItemElement(blockQuote);
			if (result == null)
				result = casePageContent(blockQuote);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.CODE_BLOCK: {
			CodeBlock codeBlock = (CodeBlock) theEObject;
			T result = caseCodeBlock(codeBlock);
			if (result == null)
				result = casePageContent(codeBlock);
			if (result == null)
				result = caseListItemElement(codeBlock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.CODE_LINE: {
			CodeLine codeLine = (CodeLine) theEObject;
			T result = caseCodeLine(codeLine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.HORIZONTAL_LINE: {
			HorizontalLine horizontalLine = (HorizontalLine) theEObject;
			T result = caseHorizontalLine(horizontalLine);
			if (result == null)
				result = casePageContent(horizontalLine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.COMPOSITE_TEXT_ELEMENT: {
			CompositeTextElement compositeTextElement = (CompositeTextElement) theEObject;
			T result = caseCompositeTextElement(compositeTextElement);
			if (result == null)
				result = caseContainableTextElement(compositeTextElement);
			if (result == null)
				result = casePageContent(compositeTextElement);
			if (result == null)
				result = caseTextElement(compositeTextElement);
			if (result == null)
				result = caseListItemElement(compositeTextElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.BUTTON: {
			Button button = (Button) theEObject;
			T result = caseButton(button);
			if (result == null)
				result = caseCompositeTextElement(button);
			if (result == null)
				result = caseContainableTextElement(button);
			if (result == null)
				result = casePageContent(button);
			if (result == null)
				result = caseTextElement(button);
			if (result == null)
				result = caseListItemElement(button);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.NAVIGATION: {
			Navigation navigation = (Navigation) theEObject;
			T result = caseNavigation(navigation);
			if (result == null)
				result = caseContainableTextElement(navigation);
			if (result == null)
				result = casePageContent(navigation);
			if (result == null)
				result = caseTextElement(navigation);
			if (result == null)
				result = caseListItemElement(navigation);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.CONTAINABLE_TEXT_ELEMENT: {
			ContainableTextElement containableTextElement = (ContainableTextElement) theEObject;
			T result = caseContainableTextElement(containableTextElement);
			if (result == null)
				result = casePageContent(containableTextElement);
			if (result == null)
				result = caseTextElement(containableTextElement);
			if (result == null)
				result = caseListItemElement(containableTextElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.SECTION: {
			Section section = (Section) theEObject;
			T result = caseSection(section);
			if (result == null)
				result = casePageContent(section);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TABLE: {
			Table table = (Table) theEObject;
			T result = caseTable(table);
			if (result == null)
				result = casePageContent(table);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TABLE_SECTION: {
			TableSection tableSection = (TableSection) theEObject;
			T result = caseTableSection(tableSection);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TABLE_BODY: {
			TableBody tableBody = (TableBody) theEObject;
			T result = caseTableBody(tableBody);
			if (result == null)
				result = caseTableSection(tableBody);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TABLE_HEAD: {
			TableHead tableHead = (TableHead) theEObject;
			T result = caseTableHead(tableHead);
			if (result == null)
				result = caseTableSection(tableHead);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TABLE_SEPARATOR: {
			TableSeparator tableSeparator = (TableSeparator) theEObject;
			T result = caseTableSeparator(tableSeparator);
			if (result == null)
				result = caseTableSection(tableSeparator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TABLE_ROW: {
			TableRow tableRow = (TableRow) theEObject;
			T result = caseTableRow(tableRow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UsdPackage.TABLE_CELL: {
			TableCell tableCell = (TableCell) theEObject;
			T result = caseTableCell(tableCell);
			if (result == null)
				result = caseTextContainer(tableCell);
			if (result == null)
				result = casePageContent(tableCell);
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
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParagraph(Paragraph object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Strong Emphasis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Emphasis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongEmphasis(StrongEmphasis object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Italic Emphasis</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Italic Emphasis</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItalicEmphasis(ItalicEmphasis object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedList(OrderedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unordered List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unordered List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnorderedList(UnorderedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Quote</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Quote</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockQuote(BlockQuote object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeBlock(CodeBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeLine(CodeLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalLine(HorizontalLine object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSection(Section object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTable(Table object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableSection(TableSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableBody(TableBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Head</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Head</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableHead(TableHead object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Separator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Separator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableSeparator(TableSeparator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Row</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableRow(TableRow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Cell</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Cell</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableCell(TableCell object) {
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

} //UsdSwitch
