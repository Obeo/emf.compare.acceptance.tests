/**
 */
package types;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link types.SingleTypes#getString <em>String</em>}</li>
 *   <li>{@link types.SingleTypes#getInteger <em>Integer</em>}</li>
 *   <li>{@link types.SingleTypes#getIntegerObject <em>Integer Object</em>}</li>
 *   <li>{@link types.SingleTypes#getLong <em>Long</em>}</li>
 *   <li>{@link types.SingleTypes#getLongObject <em>Long Object</em>}</li>
 *   <li>{@link types.SingleTypes#getDouble <em>Double</em>}</li>
 *   <li>{@link types.SingleTypes#getDoubleObject <em>Double Object</em>}</li>
 *   <li>{@link types.SingleTypes#getFloat <em>Float</em>}</li>
 *   <li>{@link types.SingleTypes#getFloatObject <em>Float Object</em>}</li>
 *   <li>{@link types.SingleTypes#getClazz <em>Clazz</em>}</li>
 *   <li>{@link types.SingleTypes#getChar <em>Char</em>}</li>
 *   <li>{@link types.SingleTypes#getCharObject <em>Char Object</em>}</li>
 *   <li>{@link types.SingleTypes#getByte <em>Byte</em>}</li>
 *   <li>{@link types.SingleTypes#getByteObject <em>Byte Object</em>}</li>
 *   <li>{@link types.SingleTypes#getByteArray <em>Byte Array</em>}</li>
 *   <li>{@link types.SingleTypes#getBigDecimal <em>Big Decimal</em>}</li>
 *   <li>{@link types.SingleTypes#getBigInteger <em>Big Integer</em>}</li>
 *   <li>{@link types.SingleTypes#getEnum <em>Enum</em>}</li>
 *   <li>{@link types.SingleTypes#getDate <em>Date</em>}</li>
 *   <li>{@link types.SingleTypes#getStringArray <em>String Array</em>}</li>
 *   <li>{@link types.SingleTypes#getLongArray <em>Long Array</em>}</li>
 *   <li>{@link types.SingleTypes#getNextEnum <em>Next Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @see types.TypesPackage#getSingleTypes()
 * @model
 * @generated
 */
public interface SingleTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * The default value is <code>"test\"test"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(String)
	 * @see types.TypesPackage#getSingleTypes_String()
	 * @model default="test\"test"
	 * @generated
	 */
	String getString();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #getString()
	 * @generated
	 */
	void setString(String value);

	/**
	 * Returns the value of the '<em><b>Integer</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer</em>' attribute.
	 * @see #setInteger(int)
	 * @see types.TypesPackage#getSingleTypes_Integer()
	 * @model default="100"
	 * @generated
	 */
	int getInteger();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getInteger <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer</em>' attribute.
	 * @see #getInteger()
	 * @generated
	 */
	void setInteger(int value);

	/**
	 * Returns the value of the '<em><b>Integer Object</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Object</em>' attribute.
	 * @see #setIntegerObject(Integer)
	 * @see types.TypesPackage#getSingleTypes_IntegerObject()
	 * @model default="100"
	 * @generated
	 */
	Integer getIntegerObject();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getIntegerObject <em>Integer Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Object</em>' attribute.
	 * @see #getIntegerObject()
	 * @generated
	 */
	void setIntegerObject(Integer value);

	/**
	 * Returns the value of the '<em><b>Long</b></em>' attribute.
	 * The default value is <code>"200"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long</em>' attribute.
	 * @see #setLong(long)
	 * @see types.TypesPackage#getSingleTypes_Long()
	 * @model default="200" ordered="false"
	 * @generated
	 */
	long getLong();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getLong <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long</em>' attribute.
	 * @see #getLong()
	 * @generated
	 */
	void setLong(long value);

	/**
	 * Returns the value of the '<em><b>Long Object</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Object</em>' attribute.
	 * @see #setLongObject(Long)
	 * @see types.TypesPackage#getSingleTypes_LongObject()
	 * @model default="100" ordered="false"
	 * @generated
	 */
	Long getLongObject();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getLongObject <em>Long Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Object</em>' attribute.
	 * @see #getLongObject()
	 * @generated
	 */
	void setLongObject(Long value);

	/**
	 * Returns the value of the '<em><b>Double</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double</em>' attribute.
	 * @see #setDouble(double)
	 * @see types.TypesPackage#getSingleTypes_Double()
	 * @model default="100" ordered="false"
	 * @generated
	 */
	double getDouble();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getDouble <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double</em>' attribute.
	 * @see #getDouble()
	 * @generated
	 */
	void setDouble(double value);

	/**
	 * Returns the value of the '<em><b>Double Object</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Object</em>' attribute.
	 * @see #setDoubleObject(Double)
	 * @see types.TypesPackage#getSingleTypes_DoubleObject()
	 * @model default="100" ordered="false"
	 * @generated
	 */
	Double getDoubleObject();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getDoubleObject <em>Double Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Object</em>' attribute.
	 * @see #getDoubleObject()
	 * @generated
	 */
	void setDoubleObject(Double value);

	/**
	 * Returns the value of the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' attribute.
	 * @see #setFloat(float)
	 * @see types.TypesPackage#getSingleTypes_Float()
	 * @model ordered="false"
	 * @generated
	 */
	float getFloat();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getFloat <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' attribute.
	 * @see #getFloat()
	 * @generated
	 */
	void setFloat(float value);

	/**
	 * Returns the value of the '<em><b>Float Object</b></em>' attribute.
	 * The default value is <code>"10f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float Object</em>' attribute.
	 * @see #setFloatObject(Float)
	 * @see types.TypesPackage#getSingleTypes_FloatObject()
	 * @model default="10f"
	 * @generated
	 */
	Float getFloatObject();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getFloatObject <em>Float Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float Object</em>' attribute.
	 * @see #getFloatObject()
	 * @generated
	 */
	void setFloatObject(Float value);

	/**
	 * Returns the value of the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clazz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clazz</em>' attribute.
	 * @see #setClazz(Class)
	 * @see types.TypesPackage#getSingleTypes_Clazz()
	 * @model ordered="false"
	 * @generated
	 */
	Class<?> getClazz();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getClazz <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clazz</em>' attribute.
	 * @see #getClazz()
	 * @generated
	 */
	void setClazz(Class<?> value);

	/**
	 * Returns the value of the '<em><b>Char</b></em>' attribute.
	 * The default value is <code>"z"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' attribute.
	 * @see #setChar(char)
	 * @see types.TypesPackage#getSingleTypes_Char()
	 * @model default="z"
	 * @generated
	 */
	char getChar();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getChar <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' attribute.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(char value);

	/**
	 * Returns the value of the '<em><b>Char Object</b></em>' attribute.
	 * The default value is <code>"z"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char Object</em>' attribute.
	 * @see #setCharObject(Character)
	 * @see types.TypesPackage#getSingleTypes_CharObject()
	 * @model default="z"
	 * @generated
	 */
	Character getCharObject();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getCharObject <em>Char Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char Object</em>' attribute.
	 * @see #getCharObject()
	 * @generated
	 */
	void setCharObject(Character value);

	/**
	 * Returns the value of the '<em><b>Byte</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte</em>' attribute.
	 * @see #setByte(byte)
	 * @see types.TypesPackage#getSingleTypes_Byte()
	 * @model default="5"
	 * @generated
	 */
	byte getByte();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getByte <em>Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte</em>' attribute.
	 * @see #getByte()
	 * @generated
	 */
	void setByte(byte value);

	/**
	 * Returns the value of the '<em><b>Byte Object</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Object</em>' attribute.
	 * @see #setByteObject(Byte)
	 * @see types.TypesPackage#getSingleTypes_ByteObject()
	 * @model default="5"
	 * @generated
	 */
	Byte getByteObject();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getByteObject <em>Byte Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Object</em>' attribute.
	 * @see #getByteObject()
	 * @generated
	 */
	void setByteObject(Byte value);

	/**
	 * Returns the value of the '<em><b>Byte Array</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Array</em>' attribute.
	 * @see #setByteArray(byte[])
	 * @see types.TypesPackage#getSingleTypes_ByteArray()
	 * @model default=""
	 * @generated
	 */
	byte[] getByteArray();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getByteArray <em>Byte Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Array</em>' attribute.
	 * @see #getByteArray()
	 * @generated
	 */
	void setByteArray(byte[] value);

	/**
	 * Returns the value of the '<em><b>Big Decimal</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Big Decimal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Decimal</em>' attribute.
	 * @see #setBigDecimal(BigDecimal)
	 * @see types.TypesPackage#getSingleTypes_BigDecimal()
	 * @model default="5"
	 * @generated
	 */
	BigDecimal getBigDecimal();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getBigDecimal <em>Big Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Decimal</em>' attribute.
	 * @see #getBigDecimal()
	 * @generated
	 */
	void setBigDecimal(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Big Integer</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Big Integer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Integer</em>' attribute.
	 * @see #setBigInteger(BigInteger)
	 * @see types.TypesPackage#getSingleTypes_BigInteger()
	 * @model default="5" ordered="false"
	 * @generated
	 */
	BigInteger getBigInteger();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getBigInteger <em>Big Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Integer</em>' attribute.
	 * @see #getBigInteger()
	 * @generated
	 */
	void setBigInteger(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link types.TestEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute.
	 * @see types.TestEnum
	 * @see #setEnum(TestEnum)
	 * @see types.TypesPackage#getSingleTypes_Enum()
	 * @model default=""
	 * @generated
	 */
	TestEnum getEnum();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getEnum <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum</em>' attribute.
	 * @see types.TestEnum
	 * @see #getEnum()
	 * @generated
	 */
	void setEnum(TestEnum value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see types.TypesPackage#getSingleTypes_Date()
	 * @model ordered="false"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>String Array</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Array</em>' attribute.
	 * @see #setStringArray(String[])
	 * @see types.TypesPackage#getSingleTypes_StringArray()
	 * @model default="" dataType="types.StringArray"
	 * @generated
	 */
	String[] getStringArray();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getStringArray <em>String Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Array</em>' attribute.
	 * @see #getStringArray()
	 * @generated
	 */
	void setStringArray(String[] value);

	/**
	 * Returns the value of the '<em><b>Long Array</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Array</em>' attribute.
	 * @see #setLongArray(long[])
	 * @see types.TypesPackage#getSingleTypes_LongArray()
	 * @model default="" dataType="types.LongArray"
	 * @generated
	 */
	long[] getLongArray();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getLongArray <em>Long Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Array</em>' attribute.
	 * @see #getLongArray()
	 * @generated
	 */
	void setLongArray(long[] value);

	/**
	 * Returns the value of the '<em><b>Next Enum</b></em>' attribute.
	 * The default value is <code>"Enum2"</code>.
	 * The literals are from the enumeration {@link types.TestNextEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Enum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Enum</em>' attribute.
	 * @see types.TestNextEnum
	 * @see #setNextEnum(TestNextEnum)
	 * @see types.TypesPackage#getSingleTypes_NextEnum()
	 * @model default="Enum2"
	 * @generated
	 */
	TestNextEnum getNextEnum();

	/**
	 * Sets the value of the '{@link types.SingleTypes#getNextEnum <em>Next Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Enum</em>' attribute.
	 * @see types.TestNextEnum
	 * @see #getNextEnum()
	 * @generated
	 */
	void setNextEnum(TestNextEnum value);

} // SingleTypes
