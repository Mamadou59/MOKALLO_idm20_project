/**
 */
package idm.simpleusd.mm.usd;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link idm.simpleusd.mm.usd.CodeBlock#getCodeLines <em>Code Lines</em>}</li>
 * </ul>
 *
 * @see idm.simpleusd.mm.usd.UsdPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends PageContent, ListItemElement {
	/**
	 * Returns the value of the '<em><b>Code Lines</b></em>' containment reference list.
	 * The list contents are of type {@link idm.simpleusd.mm.usd.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Lines</em>' containment reference list.
	 * @see idm.simpleusd.mm.usd.UsdPackage#getCodeBlock_CodeLines()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getCodeLines();

} // CodeBlock
