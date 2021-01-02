/**
 */
package idm.uikit.mm.uikit;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see idm.uikit.mm.uikit.UikitPackage#getColor()
 * @model
 * @generated
 */
public enum Color implements Enumerator {
	/**
	 * The '<em><b>MUTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUTED_VALUE
	 * @generated
	 * @ordered
	 */
	MUTED(0, "MUTED", "MUTED"),

	/**
	 * The '<em><b>EMPHASIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPHASIS_VALUE
	 * @generated
	 * @ordered
	 */
	EMPHASIS(1, "EMPHASIS", "EMPHASIS"),

	/**
	 * The '<em><b>PRIMARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY(2, "PRIMARY", "PRIMARY"),

	/**
	 * The '<em><b>SECONDARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDARY_VALUE
	 * @generated
	 * @ordered
	 */
	SECONDARY(3, "SECONDARY", "SECONDARY"),

	/**
	 * The '<em><b>SUCCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESS_VALUE
	 * @generated
	 * @ordered
	 */
	SUCCESS(4, "SUCCESS", "SUCCESS"),

	/**
	 * The '<em><b>WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING(5, "WARNING", "WARNING"),

	/**
	 * The '<em><b>DANGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DANGER_VALUE
	 * @generated
	 * @ordered
	 */
	DANGER(6, "DANGER", "DANGER");

	/**
	 * The '<em><b>MUTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MUTED_VALUE = 0;

	/**
	 * The '<em><b>EMPHASIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPHASIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMPHASIS_VALUE = 1;

	/**
	 * The '<em><b>PRIMARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_VALUE = 2;

	/**
	 * The '<em><b>SECONDARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECONDARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECONDARY_VALUE = 3;

	/**
	 * The '<em><b>SUCCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUCCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUCCESS_VALUE = 4;

	/**
	 * The '<em><b>WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_VALUE = 5;

	/**
	 * The '<em><b>DANGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DANGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DANGER_VALUE = 6;

	/**
	 * An array of all the '<em><b>Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Color[] VALUES_ARRAY = new Color[] { MUTED, EMPHASIS, PRIMARY, SECONDARY, SUCCESS, WARNING,
			DANGER, };

	/**
	 * A public read-only list of all the '<em><b>Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Color get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Color result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Color getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Color result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Color get(int value) {
		switch (value) {
		case MUTED_VALUE:
			return MUTED;
		case EMPHASIS_VALUE:
			return EMPHASIS;
		case PRIMARY_VALUE:
			return PRIMARY;
		case SECONDARY_VALUE:
			return SECONDARY;
		case SUCCESS_VALUE:
			return SUCCESS;
		case WARNING_VALUE:
			return WARNING;
		case DANGER_VALUE:
			return DANGER;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Color(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Color
