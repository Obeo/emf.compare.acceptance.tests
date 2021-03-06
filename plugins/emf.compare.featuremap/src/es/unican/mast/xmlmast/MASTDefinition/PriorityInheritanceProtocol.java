/**
 * <copyright>
 * </copyright>
 *
 * $Id: PriorityInheritanceProtocol.java,v 1.1 2008/09/24 14:01:08 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Priority Inheritance Protocol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getPriorityInheritanceProtocol()
 * @model extendedMetaData="name='Priority_Inheritance_Protocol'"
 * @generated
 */
public enum PriorityInheritanceProtocol implements Enumerator {
	/**
	 * The '<em><b>STRICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRICT_VALUE
	 * @generated
	 * @ordered
	 */
	STRICT(0, "STRICT", "STRICT"),

	/**
	 * The '<em><b>POSIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POSIX_VALUE
	 * @generated
	 * @ordered
	 */
	POSIX(1, "POSIX", "POSIX");

	/**
	 * The '<em><b>STRICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRICT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRICT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRICT_VALUE = 0;

	/**
	 * The '<em><b>POSIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POSIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POSIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POSIX_VALUE = 1;

	/**
	 * An array of all the '<em><b>Priority Inheritance Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PriorityInheritanceProtocol[] VALUES_ARRAY =
		new PriorityInheritanceProtocol[] {
			STRICT,
			POSIX,
		};

	/**
	 * A public read-only list of all the '<em><b>Priority Inheritance Protocol</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PriorityInheritanceProtocol> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Priority Inheritance Protocol</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorityInheritanceProtocol get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorityInheritanceProtocol result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Priority Inheritance Protocol</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorityInheritanceProtocol getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorityInheritanceProtocol result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Priority Inheritance Protocol</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorityInheritanceProtocol get(int value) {
		switch (value) {
			case STRICT_VALUE: return STRICT;
			case POSIX_VALUE: return POSIX;
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
	private PriorityInheritanceProtocol(int value, String name, String literal) {
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
	
} //PriorityInheritanceProtocol
