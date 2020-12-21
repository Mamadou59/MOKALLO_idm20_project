/**
 */
package idm.simpleusd.mm.usd.impl;

import idm.simpleusd.mm.usd.BlockQuote;
import idm.simpleusd.mm.usd.Button;
import idm.simpleusd.mm.usd.Code;
import idm.simpleusd.mm.usd.CodeBlock;
import idm.simpleusd.mm.usd.CodeLine;
import idm.simpleusd.mm.usd.CompositeTextElement;
import idm.simpleusd.mm.usd.HorizontalLine;
import idm.simpleusd.mm.usd.Image;
import idm.simpleusd.mm.usd.ItalicEmphasis;
import idm.simpleusd.mm.usd.Link;
import idm.simpleusd.mm.usd.ListElement;
import idm.simpleusd.mm.usd.ListItem;
import idm.simpleusd.mm.usd.ListItemElement;
import idm.simpleusd.mm.usd.OrderedList;
import idm.simpleusd.mm.usd.Page;
import idm.simpleusd.mm.usd.PageContent;
import idm.simpleusd.mm.usd.Paragraph;
import idm.simpleusd.mm.usd.StrongEmphasis;
import idm.simpleusd.mm.usd.Table;
import idm.simpleusd.mm.usd.TableBody;
import idm.simpleusd.mm.usd.TableCell;
import idm.simpleusd.mm.usd.TableCellAlignement;
import idm.simpleusd.mm.usd.TableHead;
import idm.simpleusd.mm.usd.TableRow;
import idm.simpleusd.mm.usd.TableSection;
import idm.simpleusd.mm.usd.TableSeparator;
import idm.simpleusd.mm.usd.Text;
import idm.simpleusd.mm.usd.TextContainer;
import idm.simpleusd.mm.usd.TextElement;
import idm.simpleusd.mm.usd.Title;
import idm.simpleusd.mm.usd.UnorderedList;
import idm.simpleusd.mm.usd.UrlBasedLink;
import idm.simpleusd.mm.usd.UsdFactory;
import idm.simpleusd.mm.usd.UsdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UsdPackageImpl extends EPackageImpl implements UsdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass urlBasedLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strongEmphasisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass italicEmphasisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listItemElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unorderedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockQuoteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass horizontalLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTextElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableSeparatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableHeadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buttonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tableCellAlignementEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see idm.simpleusd.mm.usd.UsdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UsdPackageImpl() {
		super(eNS_URI, UsdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UsdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UsdPackage init() {
		if (isInited)
			return (UsdPackage) EPackage.Registry.INSTANCE.getEPackage(UsdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUsdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UsdPackageImpl theUsdPackage = registeredUsdPackage instanceof UsdPackageImpl
				? (UsdPackageImpl) registeredUsdPackage
				: new UsdPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUsdPackage.createPackageContents();

		// Initialize created meta-data
		theUsdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUsdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UsdPackage.eNS_URI, theUsdPackage);
		return theUsdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPage_Name() {
		return (EAttribute) pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Contents() {
		return (EReference) pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageContent() {
		return pageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextContainer() {
		return textContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextContainer_TextElements() {
		return (EReference) textContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraph() {
		return paragraphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitle() {
		return titleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitle_Level() {
		return (EAttribute) titleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextElement() {
		return textElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getText() {
		return textEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getText_Text() {
		return (EAttribute) textEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUrlBasedLink() {
		return urlBasedLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlBasedLink_Url() {
		return (EAttribute) urlBasedLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUrlBasedLink_Title() {
		return (EAttribute) urlBasedLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCode() {
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStrongEmphasis() {
		return strongEmphasisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItalicEmphasis() {
		return italicEmphasisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListElement() {
		return listElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListElement_Items() {
		return (EReference) listElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItem() {
		return listItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListItem_Elements() {
		return (EReference) listItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListItemElement() {
		return listItemElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedList() {
		return orderedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnorderedList() {
		return unorderedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockQuote() {
		return blockQuoteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlockQuote_Contents() {
		return (EReference) blockQuoteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeBlock() {
		return codeBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodeBlock_CodeLines() {
		return (EReference) codeBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodeLine() {
		return codeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodeLine_Text() {
		return (EAttribute) codeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHorizontalLine() {
		return horizontalLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeTextElement() {
		return compositeTextElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeTextElement_SubTextElements() {
		return (EReference) compositeTextElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTable() {
		return tableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTable_TableSections() {
		return (EReference) tableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableSection() {
		return tableSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableSection_Rows() {
		return (EReference) tableSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableBody() {
		return tableBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableSeparator() {
		return tableSeparatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableHead() {
		return tableHeadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableRow_Cells() {
		return (EReference) tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableCell() {
		return tableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableCell_Alignement() {
		return (EAttribute) tableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getButton() {
		return buttonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_TextContent() {
		return (EAttribute) buttonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getButton_Type() {
		return (EAttribute) buttonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTableCellAlignement() {
		return tableCellAlignementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsdFactory getUsdFactory() {
		return (UsdFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		pageEClass = createEClass(PAGE);
		createEAttribute(pageEClass, PAGE__NAME);
		createEReference(pageEClass, PAGE__CONTENTS);

		pageContentEClass = createEClass(PAGE_CONTENT);

		textContainerEClass = createEClass(TEXT_CONTAINER);
		createEReference(textContainerEClass, TEXT_CONTAINER__TEXT_ELEMENTS);

		paragraphEClass = createEClass(PARAGRAPH);

		titleEClass = createEClass(TITLE);
		createEAttribute(titleEClass, TITLE__LEVEL);

		textElementEClass = createEClass(TEXT_ELEMENT);

		textEClass = createEClass(TEXT);
		createEAttribute(textEClass, TEXT__TEXT);

		urlBasedLinkEClass = createEClass(URL_BASED_LINK);
		createEAttribute(urlBasedLinkEClass, URL_BASED_LINK__URL);
		createEAttribute(urlBasedLinkEClass, URL_BASED_LINK__TITLE);

		linkEClass = createEClass(LINK);

		imageEClass = createEClass(IMAGE);

		codeEClass = createEClass(CODE);

		strongEmphasisEClass = createEClass(STRONG_EMPHASIS);

		italicEmphasisEClass = createEClass(ITALIC_EMPHASIS);

		listElementEClass = createEClass(LIST_ELEMENT);
		createEReference(listElementEClass, LIST_ELEMENT__ITEMS);

		listItemEClass = createEClass(LIST_ITEM);
		createEReference(listItemEClass, LIST_ITEM__ELEMENTS);

		listItemElementEClass = createEClass(LIST_ITEM_ELEMENT);

		orderedListEClass = createEClass(ORDERED_LIST);

		unorderedListEClass = createEClass(UNORDERED_LIST);

		blockQuoteEClass = createEClass(BLOCK_QUOTE);
		createEReference(blockQuoteEClass, BLOCK_QUOTE__CONTENTS);

		codeBlockEClass = createEClass(CODE_BLOCK);
		createEReference(codeBlockEClass, CODE_BLOCK__CODE_LINES);

		codeLineEClass = createEClass(CODE_LINE);
		createEAttribute(codeLineEClass, CODE_LINE__TEXT);

		horizontalLineEClass = createEClass(HORIZONTAL_LINE);

		compositeTextElementEClass = createEClass(COMPOSITE_TEXT_ELEMENT);
		createEReference(compositeTextElementEClass, COMPOSITE_TEXT_ELEMENT__SUB_TEXT_ELEMENTS);

		tableEClass = createEClass(TABLE);
		createEReference(tableEClass, TABLE__TABLE_SECTIONS);

		tableSectionEClass = createEClass(TABLE_SECTION);
		createEReference(tableSectionEClass, TABLE_SECTION__ROWS);

		tableBodyEClass = createEClass(TABLE_BODY);

		tableSeparatorEClass = createEClass(TABLE_SEPARATOR);

		tableHeadEClass = createEClass(TABLE_HEAD);

		tableRowEClass = createEClass(TABLE_ROW);
		createEReference(tableRowEClass, TABLE_ROW__CELLS);

		tableCellEClass = createEClass(TABLE_CELL);
		createEAttribute(tableCellEClass, TABLE_CELL__ALIGNEMENT);

		buttonEClass = createEClass(BUTTON);
		createEAttribute(buttonEClass, BUTTON__TEXT_CONTENT);
		createEAttribute(buttonEClass, BUTTON__TYPE);

		// Create enums
		tableCellAlignementEEnum = createEEnum(TABLE_CELL_ALIGNEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		textContainerEClass.getESuperTypes().add(this.getPageContent());
		paragraphEClass.getESuperTypes().add(this.getTextContainer());
		paragraphEClass.getESuperTypes().add(this.getListItemElement());
		titleEClass.getESuperTypes().add(this.getTextContainer());
		textEClass.getESuperTypes().add(this.getTextElement());
		urlBasedLinkEClass.getESuperTypes().add(this.getCompositeTextElement());
		linkEClass.getESuperTypes().add(this.getUrlBasedLink());
		imageEClass.getESuperTypes().add(this.getUrlBasedLink());
		codeEClass.getESuperTypes().add(this.getText());
		strongEmphasisEClass.getESuperTypes().add(this.getCompositeTextElement());
		italicEmphasisEClass.getESuperTypes().add(this.getCompositeTextElement());
		listElementEClass.getESuperTypes().add(this.getPageContent());
		listElementEClass.getESuperTypes().add(this.getListItemElement());
		orderedListEClass.getESuperTypes().add(this.getListElement());
		unorderedListEClass.getESuperTypes().add(this.getListElement());
		blockQuoteEClass.getESuperTypes().add(this.getListItemElement());
		blockQuoteEClass.getESuperTypes().add(this.getPageContent());
		codeBlockEClass.getESuperTypes().add(this.getPageContent());
		codeBlockEClass.getESuperTypes().add(this.getListItemElement());
		horizontalLineEClass.getESuperTypes().add(this.getPageContent());
		compositeTextElementEClass.getESuperTypes().add(this.getTextElement());
		tableEClass.getESuperTypes().add(this.getPageContent());
		tableBodyEClass.getESuperTypes().add(this.getTableSection());
		tableSeparatorEClass.getESuperTypes().add(this.getTableSection());
		tableHeadEClass.getESuperTypes().add(this.getTableSection());
		tableCellEClass.getESuperTypes().add(this.getTextContainer());
		buttonEClass.getESuperTypes().add(this.getTextElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Page.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Contents(), this.getPageContent(), null, "contents", null, 0, -1, Page.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageContentEClass, PageContent.class, "PageContent", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(textContainerEClass, TextContainer.class, "TextContainer", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextContainer_TextElements(), this.getTextElement(), null, "textElements", null, 0, -1,
				TextContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphEClass, Paragraph.class, "Paragraph", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(titleEClass, Title.class, "Title", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitle_Level(), ecorePackage.getEInt(), "level", null, 0, 1, Title.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textElementEClass, TextElement.class, "TextElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(textEClass, Text.class, "Text", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getText_Text(), ecorePackage.getEString(), "text", null, 0, 1, Text.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(urlBasedLinkEClass, UrlBasedLink.class, "UrlBasedLink", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUrlBasedLink_Url(), ecorePackage.getEString(), "url", null, 0, 1, UrlBasedLink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUrlBasedLink_Title(), ecorePackage.getEString(), "title", null, 0, 1, UrlBasedLink.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strongEmphasisEClass, StrongEmphasis.class, "StrongEmphasis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(italicEmphasisEClass, ItalicEmphasis.class, "ItalicEmphasis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(listElementEClass, ListElement.class, "ListElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListElement_Items(), this.getListItem(), null, "items", null, 0, -1, ListElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemEClass, ListItem.class, "ListItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListItem_Elements(), this.getListItemElement(), null, "elements", null, 0, -1, ListItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listItemElementEClass, ListItemElement.class, "ListItemElement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedListEClass, OrderedList.class, "OrderedList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(unorderedListEClass, UnorderedList.class, "UnorderedList", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockQuoteEClass, BlockQuote.class, "BlockQuote", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockQuote_Contents(), this.getPageContent(), null, "contents", null, 0, -1, BlockQuote.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeBlockEClass, CodeBlock.class, "CodeBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCodeBlock_CodeLines(), this.getCodeLine(), null, "codeLines", null, 0, -1, CodeBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeLineEClass, CodeLine.class, "CodeLine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeLine_Text(), ecorePackage.getEString(), "text", null, 0, 1, CodeLine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(horizontalLineEClass, HorizontalLine.class, "HorizontalLine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeTextElementEClass, CompositeTextElement.class, "CompositeTextElement", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeTextElement_SubTextElements(), this.getTextElement(), null, "subTextElements", null,
				0, -1, CompositeTextElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableEClass, Table.class, "Table", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTable_TableSections(), this.getTableSection(), null, "tableSections", null, 0, -1,
				Table.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableSectionEClass, TableSection.class, "TableSection", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableSection_Rows(), this.getTableRow(), null, "rows", null, 0, -1, TableSection.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableBodyEClass, TableBody.class, "TableBody", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableSeparatorEClass, TableSeparator.class, "TableSeparator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableHeadEClass, TableHead.class, "TableHead", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRow_Cells(), this.getTableCell(), null, "cells", null, 0, -1, TableRow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableCellEClass, TableCell.class, "TableCell", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableCell_Alignement(), this.getTableCellAlignement(), "alignement", null, 0, 1,
				TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getButton_TextContent(), ecorePackage.getEString(), "textContent", null, 0, 1, Button.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getButton_Type(), ecorePackage.getEString(), "type", null, 0, 1, Button.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tableCellAlignementEEnum, TableCellAlignement.class, "TableCellAlignement");
		addEEnumLiteral(tableCellAlignementEEnum, TableCellAlignement.LEFT);
		addEEnumLiteral(tableCellAlignementEEnum, TableCellAlignement.RIGHT);
		addEEnumLiteral(tableCellAlignementEEnum, TableCellAlignement.CENTER);

		// Create resource
		createResource(eNS_URI);
	}

} //UsdPackageImpl
