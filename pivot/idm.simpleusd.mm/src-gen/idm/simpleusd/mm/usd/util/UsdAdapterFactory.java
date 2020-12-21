/**
 */
package idm.simpleusd.mm.usd.util;

import idm.simpleusd.mm.usd.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see idm.simpleusd.mm.usd.UsdPackage
 * @generated
 */
public class UsdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UsdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UsdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UsdPackage.eINSTANCE;
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
	protected UsdSwitch<Adapter> modelSwitch = new UsdSwitch<Adapter>() {
		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter casePageContent(PageContent object) {
			return createPageContentAdapter();
		}

		@Override
		public Adapter caseTextContainer(TextContainer object) {
			return createTextContainerAdapter();
		}

		@Override
		public Adapter caseParagraph(Paragraph object) {
			return createParagraphAdapter();
		}

		@Override
		public Adapter caseTitle(Title object) {
			return createTitleAdapter();
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
		public Adapter caseCode(Code object) {
			return createCodeAdapter();
		}

		@Override
		public Adapter caseStrongEmphasis(StrongEmphasis object) {
			return createStrongEmphasisAdapter();
		}

		@Override
		public Adapter caseItalicEmphasis(ItalicEmphasis object) {
			return createItalicEmphasisAdapter();
		}

		@Override
		public Adapter caseListElement(ListElement object) {
			return createListElementAdapter();
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
		public Adapter caseOrderedList(OrderedList object) {
			return createOrderedListAdapter();
		}

		@Override
		public Adapter caseUnorderedList(UnorderedList object) {
			return createUnorderedListAdapter();
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
		public Adapter caseCompositeTextElement(CompositeTextElement object) {
			return createCompositeTextElementAdapter();
		}

		@Override
		public Adapter caseTable(Table object) {
			return createTableAdapter();
		}

		@Override
		public Adapter caseTableSection(TableSection object) {
			return createTableSectionAdapter();
		}

		@Override
		public Adapter caseTableBody(TableBody object) {
			return createTableBodyAdapter();
		}

		@Override
		public Adapter caseTableSeparator(TableSeparator object) {
			return createTableSeparatorAdapter();
		}

		@Override
		public Adapter caseTableHead(TableHead object) {
			return createTableHeadAdapter();
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
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.PageContent
	 * @generated
	 */
	public Adapter createPageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.TextContainer <em>Text Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.TextContainer
	 * @generated
	 */
	public Adapter createTextContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.Paragraph <em>Paragraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.Paragraph
	 * @generated
	 */
	public Adapter createParagraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.Title <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.Title
	 * @generated
	 */
	public Adapter createTitleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.TextElement
	 * @generated
	 */
	public Adapter createTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.Text
	 * @generated
	 */
	public Adapter createTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.UrlBasedLink <em>Url Based Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.UrlBasedLink
	 * @generated
	 */
	public Adapter createUrlBasedLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.Link
	 * @generated
	 */
	public Adapter createLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.Image
	 * @generated
	 */
	public Adapter createImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.Code
	 * @generated
	 */
	public Adapter createCodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.StrongEmphasis <em>Strong Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.StrongEmphasis
	 * @generated
	 */
	public Adapter createStrongEmphasisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.ItalicEmphasis <em>Italic Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.ItalicEmphasis
	 * @generated
	 */
	public Adapter createItalicEmphasisAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.ListElement <em>List Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.ListElement
	 * @generated
	 */
	public Adapter createListElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.ListItem <em>List Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.ListItem
	 * @generated
	 */
	public Adapter createListItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.ListItemElement <em>List Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.ListItemElement
	 * @generated
	 */
	public Adapter createListItemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.OrderedList <em>Ordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.OrderedList
	 * @generated
	 */
	public Adapter createOrderedListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.UnorderedList <em>Unordered List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.UnorderedList
	 * @generated
	 */
	public Adapter createUnorderedListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.BlockQuote <em>Block Quote</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.BlockQuote
	 * @generated
	 */
	public Adapter createBlockQuoteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.CodeBlock <em>Code Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.CodeBlock
	 * @generated
	 */
	public Adapter createCodeBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.CodeLine <em>Code Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.CodeLine
	 * @generated
	 */
	public Adapter createCodeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.HorizontalLine <em>Horizontal Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.HorizontalLine
	 * @generated
	 */
	public Adapter createHorizontalLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.CompositeTextElement <em>Composite Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.CompositeTextElement
	 * @generated
	 */
	public Adapter createCompositeTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.Table
	 * @generated
	 */
	public Adapter createTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.TableSection <em>Table Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.TableSection
	 * @generated
	 */
	public Adapter createTableSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.TableBody <em>Table Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.TableBody
	 * @generated
	 */
	public Adapter createTableBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.TableSeparator <em>Table Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.TableSeparator
	 * @generated
	 */
	public Adapter createTableSeparatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.TableHead <em>Table Head</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.TableHead
	 * @generated
	 */
	public Adapter createTableHeadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.TableRow <em>Table Row</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.TableRow
	 * @generated
	 */
	public Adapter createTableRowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.simpleusd.mm.usd.TableCell <em>Table Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.simpleusd.mm.usd.TableCell
	 * @generated
	 */
	public Adapter createTableCellAdapter() {
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

} //UsdAdapterFactory
