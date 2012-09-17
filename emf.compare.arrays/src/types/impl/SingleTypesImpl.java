/**
 */
package types.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import types.SingleTypes;
import types.TestEnum;
import types.TestNextEnum;
import types.TypesFactory;
import types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link types.impl.SingleTypesImpl#getString <em>String</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getIntegerObject <em>Integer Object</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getLong <em>Long</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getLongObject <em>Long Object</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getDouble <em>Double</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getDoubleObject <em>Double Object</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getFloatObject <em>Float Object</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getChar <em>Char</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getCharObject <em>Char Object</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getByte <em>Byte</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getByteObject <em>Byte Object</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getByteArray <em>Byte Array</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getBigDecimal <em>Big Decimal</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getBigInteger <em>Big Integer</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getDate <em>Date</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getStringArray <em>String Array</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getLongArray <em>Long Array</em>}</li>
 *   <li>{@link types.impl.SingleTypesImpl#getNextEnum <em>Next Enum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleTypesImpl extends EObjectImpl implements SingleTypes {
	/**
	 * The default value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_EDEFAULT = "test\"test";

	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected String string = STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #getInteger() <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected static final int INTEGER_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getInteger() <em>Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteger()
	 * @generated
	 * @ordered
	 */
	protected int integer = INTEGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegerObject() <em>Integer Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerObject()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INTEGER_OBJECT_EDEFAULT = new Integer(100);

	/**
	 * The cached value of the '{@link #getIntegerObject() <em>Integer Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerObject()
	 * @generated
	 * @ordered
	 */
	protected Integer integerObject = INTEGER_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected static final long LONG_EDEFAULT = 200L;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected long long_ = LONG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongObject() <em>Long Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongObject()
	 * @generated
	 * @ordered
	 */
	protected static final Long LONG_OBJECT_EDEFAULT = new Long(100L);

	/**
	 * The cached value of the '{@link #getLongObject() <em>Long Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongObject()
	 * @generated
	 * @ordered
	 */
	protected Long longObject = LONG_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBLE_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected double double_ = DOUBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoubleObject() <em>Double Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleObject()
	 * @generated
	 * @ordered
	 */
	protected static final Double DOUBLE_OBJECT_EDEFAULT = new Double(100.0);

	/**
	 * The cached value of the '{@link #getDoubleObject() <em>Double Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleObject()
	 * @generated
	 * @ordered
	 */
	protected Double doubleObject = DOUBLE_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected float float_ = FLOAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloatObject() <em>Float Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatObject()
	 * @generated
	 * @ordered
	 */
	protected static final Float FLOAT_OBJECT_EDEFAULT = new Float(10.0F);

	/**
	 * The cached value of the '{@link #getFloatObject() <em>Float Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatObject()
	 * @generated
	 * @ordered
	 */
	protected Float floatObject = FLOAT_OBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected Class<?> clazz;

	/**
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final char CHAR_EDEFAULT = 'z';

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected char char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharObject() <em>Char Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharObject()
	 * @generated
	 * @ordered
	 */
	protected static final Character CHAR_OBJECT_EDEFAULT = new Character('z');

	/**
	 * The cached value of the '{@link #getCharObject() <em>Char Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharObject()
	 * @generated
	 * @ordered
	 */
	protected Character charObject = CHAR_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getByte() <em>Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByte()
	 * @generated
	 * @ordered
	 */
	protected static final byte BYTE_EDEFAULT = 0x05;

	/**
	 * The cached value of the '{@link #getByte() <em>Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByte()
	 * @generated
	 * @ordered
	 */
	protected byte byte_ = BYTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getByteObject() <em>Byte Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteObject()
	 * @generated
	 * @ordered
	 */
	protected static final Byte BYTE_OBJECT_EDEFAULT = new Byte((byte)0x05);

	/**
	 * The cached value of the '{@link #getByteObject() <em>Byte Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteObject()
	 * @generated
	 * @ordered
	 */
	protected Byte byteObject = BYTE_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getByteArray() <em>Byte Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArray()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BYTE_ARRAY_EDEFAULT = {};

	/**
	 * The cached value of the '{@link #getByteArray() <em>Byte Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArray()
	 * @generated
	 * @ordered
	 */
	protected byte[] byteArray = BYTE_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBigDecimal() <em>Big Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimal()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BIG_DECIMAL_EDEFAULT = new BigDecimal("5");

	/**
	 * The cached value of the '{@link #getBigDecimal() <em>Big Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimal()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal bigDecimal = BIG_DECIMAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBigInteger() <em>Big Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigInteger()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIG_INTEGER_EDEFAULT = new BigInteger("5");

	/**
	 * The cached value of the '{@link #getBigInteger() <em>Big Integer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigInteger()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bigInteger = BIG_INTEGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected static final TestEnum ENUM_EDEFAULT = TestEnum.ENUM0;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected TestEnum enum_ = ENUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStringArray() <em>String Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringArray()
	 * @generated
	 * @ordered
	 */
	protected static final String[] STRING_ARRAY_EDEFAULT = (String[])TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getStringArray(), "");

	/**
	 * The cached value of the '{@link #getStringArray() <em>String Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringArray()
	 * @generated
	 * @ordered
	 */
	protected String[] stringArray = STRING_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongArray() <em>Long Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongArray()
	 * @generated
	 * @ordered
	 */
	protected static final long[] LONG_ARRAY_EDEFAULT = (long[])TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getLongArray(), "");

	/**
	 * The cached value of the '{@link #getLongArray() <em>Long Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongArray()
	 * @generated
	 * @ordered
	 */
	protected long[] longArray = LONG_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getNextEnum() <em>Next Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextEnum()
	 * @generated
	 * @ordered
	 */
	protected static final TestNextEnum NEXT_ENUM_EDEFAULT = TestNextEnum.ENUM2;

	/**
	 * The cached value of the '{@link #getNextEnum() <em>Next Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextEnum()
	 * @generated
	 * @ordered
	 */
	protected TestNextEnum nextEnum = NEXT_ENUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.SINGLE_TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getString() {
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setString(String newString) {
		String oldString = string;
		string = newString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__STRING, oldString, string));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInteger() {
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteger(int newInteger) {
		int oldInteger = integer;
		integer = newInteger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__INTEGER, oldInteger, integer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIntegerObject() {
		return integerObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegerObject(Integer newIntegerObject) {
		Integer oldIntegerObject = integerObject;
		integerObject = newIntegerObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__INTEGER_OBJECT, oldIntegerObject, integerObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLong() {
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLong(long newLong) {
		long oldLong = long_;
		long_ = newLong;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__LONG, oldLong, long_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getLongObject() {
		return longObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongObject(Long newLongObject) {
		Long oldLongObject = longObject;
		longObject = newLongObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__LONG_OBJECT, oldLongObject, longObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDouble() {
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble(double newDouble) {
		double oldDouble = double_;
		double_ = newDouble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__DOUBLE, oldDouble, double_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDoubleObject() {
		return doubleObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleObject(Double newDoubleObject) {
		Double oldDoubleObject = doubleObject;
		doubleObject = newDoubleObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__DOUBLE_OBJECT, oldDoubleObject, doubleObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloat() {
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat(float newFloat) {
		float oldFloat = float_;
		float_ = newFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__FLOAT, oldFloat, float_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getFloatObject() {
		return floatObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloatObject(Float newFloatObject) {
		Float oldFloatObject = floatObject;
		floatObject = newFloatObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__FLOAT_OBJECT, oldFloatObject, floatObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<?> getClazz() {
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClazz(Class<?> newClazz) {
		Class<?> oldClazz = clazz;
		clazz = newClazz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__CLAZZ, oldClazz, clazz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChar(char newChar) {
		char oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character getCharObject() {
		return charObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharObject(Character newCharObject) {
		Character oldCharObject = charObject;
		charObject = newCharObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__CHAR_OBJECT, oldCharObject, charObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getByte() {
		return byte_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByte(byte newByte) {
		byte oldByte = byte_;
		byte_ = newByte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__BYTE, oldByte, byte_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte getByteObject() {
		return byteObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteObject(Byte newByteObject) {
		Byte oldByteObject = byteObject;
		byteObject = newByteObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__BYTE_OBJECT, oldByteObject, byteObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getByteArray() {
		return byteArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteArray(byte[] newByteArray) {
		byte[] oldByteArray = byteArray;
		byteArray = newByteArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__BYTE_ARRAY, oldByteArray, byteArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBigDecimal() {
		return bigDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigDecimal(BigDecimal newBigDecimal) {
		BigDecimal oldBigDecimal = bigDecimal;
		bigDecimal = newBigDecimal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__BIG_DECIMAL, oldBigDecimal, bigDecimal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBigInteger() {
		return bigInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigInteger(BigInteger newBigInteger) {
		BigInteger oldBigInteger = bigInteger;
		bigInteger = newBigInteger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__BIG_INTEGER, oldBigInteger, bigInteger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestEnum getEnum() {
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnum(TestEnum newEnum) {
		TestEnum oldEnum = enum_;
		enum_ = newEnum == null ? ENUM_EDEFAULT : newEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__ENUM, oldEnum, enum_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String[] getStringArray() {
		return stringArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringArray(String[] newStringArray) {
		String[] oldStringArray = stringArray;
		stringArray = newStringArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__STRING_ARRAY, oldStringArray, stringArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long[] getLongArray() {
		return longArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongArray(long[] newLongArray) {
		long[] oldLongArray = longArray;
		longArray = newLongArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__LONG_ARRAY, oldLongArray, longArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestNextEnum getNextEnum() {
		return nextEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextEnum(TestNextEnum newNextEnum) {
		TestNextEnum oldNextEnum = nextEnum;
		nextEnum = newNextEnum == null ? NEXT_ENUM_EDEFAULT : newNextEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.SINGLE_TYPES__NEXT_ENUM, oldNextEnum, nextEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.SINGLE_TYPES__STRING:
				return getString();
			case TypesPackage.SINGLE_TYPES__INTEGER:
				return getInteger();
			case TypesPackage.SINGLE_TYPES__INTEGER_OBJECT:
				return getIntegerObject();
			case TypesPackage.SINGLE_TYPES__LONG:
				return getLong();
			case TypesPackage.SINGLE_TYPES__LONG_OBJECT:
				return getLongObject();
			case TypesPackage.SINGLE_TYPES__DOUBLE:
				return getDouble();
			case TypesPackage.SINGLE_TYPES__DOUBLE_OBJECT:
				return getDoubleObject();
			case TypesPackage.SINGLE_TYPES__FLOAT:
				return getFloat();
			case TypesPackage.SINGLE_TYPES__FLOAT_OBJECT:
				return getFloatObject();
			case TypesPackage.SINGLE_TYPES__CLAZZ:
				return getClazz();
			case TypesPackage.SINGLE_TYPES__CHAR:
				return getChar();
			case TypesPackage.SINGLE_TYPES__CHAR_OBJECT:
				return getCharObject();
			case TypesPackage.SINGLE_TYPES__BYTE:
				return getByte();
			case TypesPackage.SINGLE_TYPES__BYTE_OBJECT:
				return getByteObject();
			case TypesPackage.SINGLE_TYPES__BYTE_ARRAY:
				return getByteArray();
			case TypesPackage.SINGLE_TYPES__BIG_DECIMAL:
				return getBigDecimal();
			case TypesPackage.SINGLE_TYPES__BIG_INTEGER:
				return getBigInteger();
			case TypesPackage.SINGLE_TYPES__ENUM:
				return getEnum();
			case TypesPackage.SINGLE_TYPES__DATE:
				return getDate();
			case TypesPackage.SINGLE_TYPES__STRING_ARRAY:
				return getStringArray();
			case TypesPackage.SINGLE_TYPES__LONG_ARRAY:
				return getLongArray();
			case TypesPackage.SINGLE_TYPES__NEXT_ENUM:
				return getNextEnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.SINGLE_TYPES__STRING:
				setString((String)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__INTEGER:
				setInteger((Integer)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__INTEGER_OBJECT:
				setIntegerObject((Integer)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__LONG:
				setLong((Long)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__LONG_OBJECT:
				setLongObject((Long)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__DOUBLE:
				setDouble((Double)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__DOUBLE_OBJECT:
				setDoubleObject((Double)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__FLOAT:
				setFloat((Float)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__FLOAT_OBJECT:
				setFloatObject((Float)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__CLAZZ:
				setClazz((Class<?>)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__CHAR:
				setChar((Character)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__CHAR_OBJECT:
				setCharObject((Character)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__BYTE:
				setByte((Byte)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__BYTE_OBJECT:
				setByteObject((Byte)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__BYTE_ARRAY:
				setByteArray((byte[])newValue);
				return;
			case TypesPackage.SINGLE_TYPES__BIG_DECIMAL:
				setBigDecimal((BigDecimal)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__BIG_INTEGER:
				setBigInteger((BigInteger)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__ENUM:
				setEnum((TestEnum)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__DATE:
				setDate((Date)newValue);
				return;
			case TypesPackage.SINGLE_TYPES__STRING_ARRAY:
				setStringArray((String[])newValue);
				return;
			case TypesPackage.SINGLE_TYPES__LONG_ARRAY:
				setLongArray((long[])newValue);
				return;
			case TypesPackage.SINGLE_TYPES__NEXT_ENUM:
				setNextEnum((TestNextEnum)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TypesPackage.SINGLE_TYPES__STRING:
				setString(STRING_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__INTEGER:
				setInteger(INTEGER_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__INTEGER_OBJECT:
				setIntegerObject(INTEGER_OBJECT_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__LONG:
				setLong(LONG_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__LONG_OBJECT:
				setLongObject(LONG_OBJECT_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__DOUBLE:
				setDouble(DOUBLE_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__DOUBLE_OBJECT:
				setDoubleObject(DOUBLE_OBJECT_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__FLOAT:
				setFloat(FLOAT_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__FLOAT_OBJECT:
				setFloatObject(FLOAT_OBJECT_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__CLAZZ:
				setClazz((Class<?>)null);
				return;
			case TypesPackage.SINGLE_TYPES__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__CHAR_OBJECT:
				setCharObject(CHAR_OBJECT_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__BYTE:
				setByte(BYTE_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__BYTE_OBJECT:
				setByteObject(BYTE_OBJECT_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__BYTE_ARRAY:
				setByteArray(BYTE_ARRAY_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__BIG_DECIMAL:
				setBigDecimal(BIG_DECIMAL_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__BIG_INTEGER:
				setBigInteger(BIG_INTEGER_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__ENUM:
				setEnum(ENUM_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__STRING_ARRAY:
				setStringArray(STRING_ARRAY_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__LONG_ARRAY:
				setLongArray(LONG_ARRAY_EDEFAULT);
				return;
			case TypesPackage.SINGLE_TYPES__NEXT_ENUM:
				setNextEnum(NEXT_ENUM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TypesPackage.SINGLE_TYPES__STRING:
				return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
			case TypesPackage.SINGLE_TYPES__INTEGER:
				return integer != INTEGER_EDEFAULT;
			case TypesPackage.SINGLE_TYPES__INTEGER_OBJECT:
				return INTEGER_OBJECT_EDEFAULT == null ? integerObject != null : !INTEGER_OBJECT_EDEFAULT.equals(integerObject);
			case TypesPackage.SINGLE_TYPES__LONG:
				return long_ != LONG_EDEFAULT;
			case TypesPackage.SINGLE_TYPES__LONG_OBJECT:
				return LONG_OBJECT_EDEFAULT == null ? longObject != null : !LONG_OBJECT_EDEFAULT.equals(longObject);
			case TypesPackage.SINGLE_TYPES__DOUBLE:
				return double_ != DOUBLE_EDEFAULT;
			case TypesPackage.SINGLE_TYPES__DOUBLE_OBJECT:
				return DOUBLE_OBJECT_EDEFAULT == null ? doubleObject != null : !DOUBLE_OBJECT_EDEFAULT.equals(doubleObject);
			case TypesPackage.SINGLE_TYPES__FLOAT:
				return float_ != FLOAT_EDEFAULT;
			case TypesPackage.SINGLE_TYPES__FLOAT_OBJECT:
				return FLOAT_OBJECT_EDEFAULT == null ? floatObject != null : !FLOAT_OBJECT_EDEFAULT.equals(floatObject);
			case TypesPackage.SINGLE_TYPES__CLAZZ:
				return clazz != null;
			case TypesPackage.SINGLE_TYPES__CHAR:
				return char_ != CHAR_EDEFAULT;
			case TypesPackage.SINGLE_TYPES__CHAR_OBJECT:
				return CHAR_OBJECT_EDEFAULT == null ? charObject != null : !CHAR_OBJECT_EDEFAULT.equals(charObject);
			case TypesPackage.SINGLE_TYPES__BYTE:
				return byte_ != BYTE_EDEFAULT;
			case TypesPackage.SINGLE_TYPES__BYTE_OBJECT:
				return BYTE_OBJECT_EDEFAULT == null ? byteObject != null : !BYTE_OBJECT_EDEFAULT.equals(byteObject);
			case TypesPackage.SINGLE_TYPES__BYTE_ARRAY:
				return BYTE_ARRAY_EDEFAULT == null ? byteArray != null : !BYTE_ARRAY_EDEFAULT.equals(byteArray);
			case TypesPackage.SINGLE_TYPES__BIG_DECIMAL:
				return BIG_DECIMAL_EDEFAULT == null ? bigDecimal != null : !BIG_DECIMAL_EDEFAULT.equals(bigDecimal);
			case TypesPackage.SINGLE_TYPES__BIG_INTEGER:
				return BIG_INTEGER_EDEFAULT == null ? bigInteger != null : !BIG_INTEGER_EDEFAULT.equals(bigInteger);
			case TypesPackage.SINGLE_TYPES__ENUM:
				return enum_ != ENUM_EDEFAULT;
			case TypesPackage.SINGLE_TYPES__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case TypesPackage.SINGLE_TYPES__STRING_ARRAY:
				return STRING_ARRAY_EDEFAULT == null ? stringArray != null : !STRING_ARRAY_EDEFAULT.equals(stringArray);
			case TypesPackage.SINGLE_TYPES__LONG_ARRAY:
				return LONG_ARRAY_EDEFAULT == null ? longArray != null : !LONG_ARRAY_EDEFAULT.equals(longArray);
			case TypesPackage.SINGLE_TYPES__NEXT_ENUM:
				return nextEnum != NEXT_ENUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (string: ");
		result.append(string);
		result.append(", integer: ");
		result.append(integer);
		result.append(", integerObject: ");
		result.append(integerObject);
		result.append(", long: ");
		result.append(long_);
		result.append(", longObject: ");
		result.append(longObject);
		result.append(", double: ");
		result.append(double_);
		result.append(", doubleObject: ");
		result.append(doubleObject);
		result.append(", float: ");
		result.append(float_);
		result.append(", floatObject: ");
		result.append(floatObject);
		result.append(", clazz: ");
		result.append(clazz);
		result.append(", char: ");
		result.append(char_);
		result.append(", charObject: ");
		result.append(charObject);
		result.append(", byte: ");
		result.append(byte_);
		result.append(", byteObject: ");
		result.append(byteObject);
		result.append(", byteArray: ");
		result.append(byteArray);
		result.append(", bigDecimal: ");
		result.append(bigDecimal);
		result.append(", bigInteger: ");
		result.append(bigInteger);
		result.append(", enum: ");
		result.append(enum_);
		result.append(", date: ");
		result.append(date);
		result.append(", stringArray: ");
		result.append(stringArray);
		result.append(", longArray: ");
		result.append(longArray);
		result.append(", nextEnum: ");
		result.append(nextEnum);
		result.append(')');
		return result.toString();
	}

} //SingleTypesImpl
