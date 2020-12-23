/**
 */
package idm.bstrap.mm.bstrap.util;

import idm.bstrap.mm.bstrap.*;

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
		case BstrapPackage.BORDER: {
			Border border = (Border) theEObject;
			T result = caseBorder(border);
			if (result == null)
				result = caseGeneral(border);
			if (result == null)
				result = casePropertyClass(border);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.DARK: {
			Dark dark = (Dark) theEObject;
			T result = caseDark(dark);
			if (result == null)
				result = caseBackground(dark);
			if (result == null)
				result = caseGeneral(dark);
			if (result == null)
				result = casePropertyClass(dark);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.PRIMARY: {
			Primary primary = (Primary) theEObject;
			T result = casePrimary(primary);
			if (result == null)
				result = caseBackground(primary);
			if (result == null)
				result = caseGeneral(primary);
			if (result == null)
				result = casePropertyClass(primary);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.NEW_ECLASS13: {
			NewEClass13 newEClass13 = (NewEClass13) theEObject;
			T result = caseNewEClass13(newEClass13);
			if (result == null)
				result = caseBorder(newEClass13);
			if (result == null)
				result = caseGeneral(newEClass13);
			if (result == null)
				result = casePropertyClass(newEClass13);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.NEW_ECLASS14: {
			NewEClass14 newEClass14 = (NewEClass14) theEObject;
			T result = caseNewEClass14(newEClass14);
			if (result == null)
				result = caseBorder(newEClass14);
			if (result == null)
				result = caseGeneral(newEClass14);
			if (result == null)
				result = casePropertyClass(newEClass14);
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
		case BstrapPackage.TEXT_ELEMENT: {
			TextElement textElement = (TextElement) theEObject;
			T result = caseTextElement(textElement);
			if (result == null)
				result = casePageContent(textElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.TITLE: {
			Title title = (Title) theEObject;
			T result = caseTitle(title);
			if (result == null)
				result = caseTextElement(title);
			if (result == null)
				result = casePageContent(title);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case BstrapPackage.PARAGRAPHE: {
			Paragraphe paragraphe = (Paragraphe) theEObject;
			T result = caseParagraphe(paragraphe);
			if (result == null)
				result = caseTextElement(paragraphe);
			if (result == null)
				result = casePageContent(paragraphe);
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
	 * Returns the result of interpreting the object as an instance of '<em>Dark</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dark</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDark(Dark object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimary(Primary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass13</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass13</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass13(NewEClass13 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass14</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass14</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass14(NewEClass14 object) {
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
