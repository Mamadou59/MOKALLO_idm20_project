/**
 */
package idm.bstrap.mm.bstrap;

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
 *   <li>{@link idm.bstrap.mm.bstrap.CodeBlock#getCodelines <em>Codelines</em>}</li>
 * </ul>
 *
 * @see idm.bstrap.mm.bstrap.BstrapPackage#getCodeBlock()
 * @model
 * @generated
 */
public interface CodeBlock extends TextPageContent, ListItemElement {

	/**
	 * Returns the value of the '<em><b>Codelines</b></em>' containment reference list.
	 * The list contents are of type {@link idm.bstrap.mm.bstrap.CodeLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Codelines</em>' containment reference list.
	 * @see idm.bstrap.mm.bstrap.BstrapPackage#getCodeBlock_Codelines()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeLine> getCodelines();
} // CodeBlock
