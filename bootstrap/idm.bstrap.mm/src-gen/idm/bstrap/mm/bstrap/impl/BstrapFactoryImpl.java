/**
 */
package idm.bstrap.mm.bstrap.impl;

import idm.bstrap.mm.bstrap.*;

import org.eclipse.emf.ecore.EClass;
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
		case BstrapPackage.MARGIN:
			return createMargin();
		case BstrapPackage.PADDING:
			return createPadding();
		case BstrapPackage.DARK:
			return createDark();
		case BstrapPackage.PRIMARY:
			return createPrimary();
		case BstrapPackage.NEW_ECLASS13:
			return createNewEClass13();
		case BstrapPackage.NEW_ECLASS14:
			return createNewEClass14();
		case BstrapPackage.GENERAL:
			return createGeneral();
		case BstrapPackage.TITLE:
			return createTitle();
		case BstrapPackage.PARAGRAPHE:
			return createParagraphe();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public Dark createDark() {
		DarkImpl dark = new DarkImpl();
		return dark;
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
	public NewEClass13 createNewEClass13() {
		NewEClass13Impl newEClass13 = new NewEClass13Impl();
		return newEClass13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewEClass14 createNewEClass14() {
		NewEClass14Impl newEClass14 = new NewEClass14Impl();
		return newEClass14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public General createGeneral() {
		GeneralImpl general = new GeneralImpl();
		return general;
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
	public Paragraphe createParagraphe() {
		ParagrapheImpl paragraphe = new ParagrapheImpl();
		return paragraphe;
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
