/**
 */
package idm.bstrap.mm.bstrap.util;

import idm.bstrap.mm.bstrap.*;

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
		public Adapter caseBorder(Border object) {
			return createBorderAdapter();
		}

		@Override
		public Adapter caseDark(Dark object) {
			return createDarkAdapter();
		}

		@Override
		public Adapter casePrimary(Primary object) {
			return createPrimaryAdapter();
		}

		@Override
		public Adapter caseNewEClass13(NewEClass13 object) {
			return createNewEClass13Adapter();
		}

		@Override
		public Adapter caseNewEClass14(NewEClass14 object) {
			return createNewEClass14Adapter();
		}

		@Override
		public Adapter caseGeneral(General object) {
			return createGeneralAdapter();
		}

		@Override
		public Adapter caseTextElement(TextElement object) {
			return createTextElementAdapter();
		}

		@Override
		public Adapter caseTitle(Title object) {
			return createTitleAdapter();
		}

		@Override
		public Adapter caseParagraphe(Paragraphe object) {
			return createParagrapheAdapter();
		}

		@Override
		public Adapter casePageContent(PageContent object) {
			return createPageContentAdapter();
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
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Dark <em>Dark</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Dark
	 * @generated
	 */
	public Adapter createDarkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.Primary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.Primary
	 * @generated
	 */
	public Adapter createPrimaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.NewEClass13 <em>New EClass13</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.NewEClass13
	 * @generated
	 */
	public Adapter createNewEClass13Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.NewEClass14 <em>New EClass14</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.NewEClass14
	 * @generated
	 */
	public Adapter createNewEClass14Adapter() {
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
	 * Creates a new adapter for an object of class '{@link idm.bstrap.mm.bstrap.TextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see idm.bstrap.mm.bstrap.TextElement
	 * @generated
	 */
	public Adapter createTextElementAdapter() {
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
