/**
 */
package types;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Many Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link types.ManyTypes#getString <em>String</em>}</li>
 *   <li>{@link types.ManyTypes#getIntegerObject <em>Integer Object</em>}</li>
 *   <li>{@link types.ManyTypes#getLong <em>Long</em>}</li>
 *   <li>{@link types.ManyTypes#getDoubleObject <em>Double Object</em>}</li>
 *   <li>{@link types.ManyTypes#getFloatObject <em>Float Object</em>}</li>
 *   <li>{@link types.ManyTypes#getClazz <em>Clazz</em>}</li>
 *   <li>{@link types.ManyTypes#getCharObject <em>Char Object</em>}</li>
 *   <li>{@link types.ManyTypes#getByteObject <em>Byte Object</em>}</li>
 *   <li>{@link types.ManyTypes#getByteArray <em>Byte Array</em>}</li>
 *   <li>{@link types.ManyTypes#getBigDecimal <em>Big Decimal</em>}</li>
 *   <li>{@link types.ManyTypes#getBigInteger <em>Big Integer</em>}</li>
 *   <li>{@link types.ManyTypes#getEnum <em>Enum</em>}</li>
 *   <li>{@link types.ManyTypes#getDate <em>Date</em>}</li>
 *   <li>{@link types.ManyTypes#getStringArray <em>String Array</em>}</li>
 *   <li>{@link types.ManyTypes#getLongArray <em>Long Array</em>}</li>
 * </ul>
 * </p>
 *
 * @see types.TypesPackage#getManyTypes()
 * @model
 * @generated
 */
public interface ManyTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_String()
	 * @model default="test\"test"
	 * @generated
	 */
	EList<String> getString();

	/**
	 * Returns the value of the '<em><b>Integer Object</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Object</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Object</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_IntegerObject()
	 * @model default="100"
	 * @generated
	 */
	EList<Integer> getIntegerObject();

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_Long()
	 * @model default="100" ordered="false"
	 * @generated
	 */
	EList<Long> getLong();

	/**
	 * Returns the value of the '<em><b>Double Object</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Object</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Object</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_DoubleObject()
	 * @model default="100" ordered="false"
	 * @generated
	 */
	EList<Double> getDoubleObject();

	/**
	 * Returns the value of the '<em><b>Float Object</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Float}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Object</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Object</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_FloatObject()
	 * @model default="10f"
	 * @generated
	 */
	EList<Float> getFloatObject();

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Class}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_Clazz()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Class<?>> getClazz();

	/**
	 * Returns the value of the '<em><b>Char Object</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Character}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Object</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Object</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_CharObject()
	 * @model default="z"
	 * @generated
	 */
	EList<Character> getCharObject();

	/**
	 * Returns the value of the '<em><b>Byte Object</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Byte}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Object</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Object</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_ByteObject()
	 * @model default="5"
	 * @generated
	 */
	EList<Byte> getByteObject();

	/**
	 * Returns the value of the '<em><b>Byte Array</b></em>' attribute list.
	 * The list contents are of type {@link byte}[].
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Array</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Array</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_ByteArray()
	 * @model default=""
	 * @generated
	 */
	EList<byte[]> getByteArray();

	/**
	 * Returns the value of the '<em><b>Big Decimal</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigDecimal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Big Decimal</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Decimal</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_BigDecimal()
	 * @model default="5"
	 * @generated
	 */
	EList<BigDecimal> getBigDecimal();

	/**
	 * Returns the value of the '<em><b>Big Integer</b></em>' attribute list.
	 * The list contents are of type {@link java.math.BigInteger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Big Integer</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Integer</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_BigInteger()
	 * @model default="5" ordered="false"
	 * @generated
	 */
	EList<BigInteger> getBigInteger();

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute list.
	 * The list contents are of type {@link types.TestEnum}.
	 * The literals are from the enumeration {@link types.TestEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute list.
	 * @see types.TestEnum
	 * @see types.TypesPackage#getManyTypes_Enum()
	 * @model default="test\"test"
	 * @generated
	 */
	EList<TestEnum> getEnum();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute list.
	 * The list contents are of type {@link java.util.Date}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_Date()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Date> getDate();

	/**
	 * Returns the value of the '<em><b>String Array</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}[].
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Array</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Array</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_StringArray()
	 * @model default="" dataType="types.StringArray"
	 * @generated
	 */
	EList<String[]> getStringArray();

	/**
	 * Returns the value of the '<em><b>Long Array</b></em>' attribute list.
	 * The list contents are of type {@link long}[].
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Array</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Array</em>' attribute list.
	 * @see types.TypesPackage#getManyTypes_LongArray()
	 * @model default="" dataType="types.LongArray"
	 * @generated
	 */
	EList<long[]> getLongArray();

} // ManyTypes
