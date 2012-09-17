/**
 */
package types.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import types.ManyTypes;
import types.TestEnum;
import types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Many Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link types.impl.ManyTypesImpl#getString <em>String</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getIntegerObject <em>Integer Object</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getLong <em>Long</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getDoubleObject <em>Double Object</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getFloatObject <em>Float Object</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getCharObject <em>Char Object</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getByteObject <em>Byte Object</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getByteArray <em>Byte Array</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getBigDecimal <em>Big Decimal</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getBigInteger <em>Big Integer</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getDate <em>Date</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getStringArray <em>String Array</em>}</li>
 *   <li>{@link types.impl.ManyTypesImpl#getLongArray <em>Long Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManyTypesImpl extends EObjectImpl implements ManyTypes {
	/**
	 * The cached value of the '{@link #getString() <em>String</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString()
	 * @generated
	 * @ordered
	 */
	protected EList<String> string;

	/**
	 * The cached value of the '{@link #getIntegerObject() <em>Integer Object</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegerObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> integerObject;

	/**
	 * The cached value of the '{@link #getLong() <em>Long</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLong()
	 * @generated
	 * @ordered
	 */
	protected EList<Long> long_;

	/**
	 * The cached value of the '{@link #getDoubleObject() <em>Double Object</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> doubleObject;

	/**
	 * The cached value of the '{@link #getFloatObject() <em>Float Object</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloatObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Float> floatObject;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected EList<Class<?>> clazz;

	/**
	 * The cached value of the '{@link #getCharObject() <em>Char Object</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Character> charObject;

	/**
	 * The cached value of the '{@link #getByteObject() <em>Byte Object</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteObject()
	 * @generated
	 * @ordered
	 */
	protected EList<Byte> byteObject;

	/**
	 * The cached value of the '{@link #getByteArray() <em>Byte Array</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArray()
	 * @generated
	 * @ordered
	 */
	protected EList<byte[]> byteArray;

	/**
	 * The cached value of the '{@link #getBigDecimal() <em>Big Decimal</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigDecimal()
	 * @generated
	 * @ordered
	 */
	protected EList<BigDecimal> bigDecimal;

	/**
	 * The cached value of the '{@link #getBigInteger() <em>Big Integer</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigInteger()
	 * @generated
	 * @ordered
	 */
	protected EList<BigInteger> bigInteger;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<TestEnum> enum_;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> date;

	/**
	 * The cached value of the '{@link #getStringArray() <em>String Array</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringArray()
	 * @generated
	 * @ordered
	 */
	protected EList<String[]> stringArray;

	/**
	 * The cached value of the '{@link #getLongArray() <em>Long Array</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongArray()
	 * @generated
	 * @ordered
	 */
	protected EList<long[]> longArray;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManyTypesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.MANY_TYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getString() {
		if (string == null) {
			string = new EDataTypeUniqueEList<String>(String.class, this, TypesPackage.MANY_TYPES__STRING);
		}
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIntegerObject() {
		if (integerObject == null) {
			integerObject = new EDataTypeUniqueEList<Integer>(Integer.class, this, TypesPackage.MANY_TYPES__INTEGER_OBJECT);
		}
		return integerObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Long> getLong() {
		if (long_ == null) {
			long_ = new EDataTypeUniqueEList<Long>(Long.class, this, TypesPackage.MANY_TYPES__LONG);
		}
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getDoubleObject() {
		if (doubleObject == null) {
			doubleObject = new EDataTypeUniqueEList<Double>(Double.class, this, TypesPackage.MANY_TYPES__DOUBLE_OBJECT);
		}
		return doubleObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Float> getFloatObject() {
		if (floatObject == null) {
			floatObject = new EDataTypeUniqueEList<Float>(Float.class, this, TypesPackage.MANY_TYPES__FLOAT_OBJECT);
		}
		return floatObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Class<?>> getClazz() {
		if (clazz == null) {
			clazz = new EDataTypeUniqueEList<Class<?>>(Class.class, this, TypesPackage.MANY_TYPES__CLAZZ);
		}
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Character> getCharObject() {
		if (charObject == null) {
			charObject = new EDataTypeUniqueEList<Character>(Character.class, this, TypesPackage.MANY_TYPES__CHAR_OBJECT);
		}
		return charObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Byte> getByteObject() {
		if (byteObject == null) {
			byteObject = new EDataTypeUniqueEList<Byte>(Byte.class, this, TypesPackage.MANY_TYPES__BYTE_OBJECT);
		}
		return byteObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<byte[]> getByteArray() {
		if (byteArray == null) {
			byteArray = new EDataTypeUniqueEList<byte[]>(byte[].class, this, TypesPackage.MANY_TYPES__BYTE_ARRAY);
		}
		return byteArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigDecimal> getBigDecimal() {
		if (bigDecimal == null) {
			bigDecimal = new EDataTypeUniqueEList<BigDecimal>(BigDecimal.class, this, TypesPackage.MANY_TYPES__BIG_DECIMAL);
		}
		return bigDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigInteger> getBigInteger() {
		if (bigInteger == null) {
			bigInteger = new EDataTypeUniqueEList<BigInteger>(BigInteger.class, this, TypesPackage.MANY_TYPES__BIG_INTEGER);
		}
		return bigInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestEnum> getEnum() {
		if (enum_ == null) {
			enum_ = new EDataTypeUniqueEList<TestEnum>(TestEnum.class, this, TypesPackage.MANY_TYPES__ENUM);
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Date> getDate() {
		if (date == null) {
			date = new EDataTypeUniqueEList<Date>(Date.class, this, TypesPackage.MANY_TYPES__DATE);
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String[]> getStringArray() {
		if (stringArray == null) {
			stringArray = new EDataTypeUniqueEList<String[]>(String[].class, this, TypesPackage.MANY_TYPES__STRING_ARRAY);
		}
		return stringArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<long[]> getLongArray() {
		if (longArray == null) {
			longArray = new EDataTypeUniqueEList<long[]>(long[].class, this, TypesPackage.MANY_TYPES__LONG_ARRAY);
		}
		return longArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TypesPackage.MANY_TYPES__STRING:
				return getString();
			case TypesPackage.MANY_TYPES__INTEGER_OBJECT:
				return getIntegerObject();
			case TypesPackage.MANY_TYPES__LONG:
				return getLong();
			case TypesPackage.MANY_TYPES__DOUBLE_OBJECT:
				return getDoubleObject();
			case TypesPackage.MANY_TYPES__FLOAT_OBJECT:
				return getFloatObject();
			case TypesPackage.MANY_TYPES__CLAZZ:
				return getClazz();
			case TypesPackage.MANY_TYPES__CHAR_OBJECT:
				return getCharObject();
			case TypesPackage.MANY_TYPES__BYTE_OBJECT:
				return getByteObject();
			case TypesPackage.MANY_TYPES__BYTE_ARRAY:
				return getByteArray();
			case TypesPackage.MANY_TYPES__BIG_DECIMAL:
				return getBigDecimal();
			case TypesPackage.MANY_TYPES__BIG_INTEGER:
				return getBigInteger();
			case TypesPackage.MANY_TYPES__ENUM:
				return getEnum();
			case TypesPackage.MANY_TYPES__DATE:
				return getDate();
			case TypesPackage.MANY_TYPES__STRING_ARRAY:
				return getStringArray();
			case TypesPackage.MANY_TYPES__LONG_ARRAY:
				return getLongArray();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TypesPackage.MANY_TYPES__STRING:
				getString().clear();
				getString().addAll((Collection<? extends String>)newValue);
				return;
			case TypesPackage.MANY_TYPES__INTEGER_OBJECT:
				getIntegerObject().clear();
				getIntegerObject().addAll((Collection<? extends Integer>)newValue);
				return;
			case TypesPackage.MANY_TYPES__LONG:
				getLong().clear();
				getLong().addAll((Collection<? extends Long>)newValue);
				return;
			case TypesPackage.MANY_TYPES__DOUBLE_OBJECT:
				getDoubleObject().clear();
				getDoubleObject().addAll((Collection<? extends Double>)newValue);
				return;
			case TypesPackage.MANY_TYPES__FLOAT_OBJECT:
				getFloatObject().clear();
				getFloatObject().addAll((Collection<? extends Float>)newValue);
				return;
			case TypesPackage.MANY_TYPES__CLAZZ:
				getClazz().clear();
				getClazz().addAll((Collection<? extends Class<?>>)newValue);
				return;
			case TypesPackage.MANY_TYPES__CHAR_OBJECT:
				getCharObject().clear();
				getCharObject().addAll((Collection<? extends Character>)newValue);
				return;
			case TypesPackage.MANY_TYPES__BYTE_OBJECT:
				getByteObject().clear();
				getByteObject().addAll((Collection<? extends Byte>)newValue);
				return;
			case TypesPackage.MANY_TYPES__BYTE_ARRAY:
				getByteArray().clear();
				getByteArray().addAll((Collection<? extends byte[]>)newValue);
				return;
			case TypesPackage.MANY_TYPES__BIG_DECIMAL:
				getBigDecimal().clear();
				getBigDecimal().addAll((Collection<? extends BigDecimal>)newValue);
				return;
			case TypesPackage.MANY_TYPES__BIG_INTEGER:
				getBigInteger().clear();
				getBigInteger().addAll((Collection<? extends BigInteger>)newValue);
				return;
			case TypesPackage.MANY_TYPES__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends TestEnum>)newValue);
				return;
			case TypesPackage.MANY_TYPES__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends Date>)newValue);
				return;
			case TypesPackage.MANY_TYPES__STRING_ARRAY:
				getStringArray().clear();
				getStringArray().addAll((Collection<? extends String[]>)newValue);
				return;
			case TypesPackage.MANY_TYPES__LONG_ARRAY:
				getLongArray().clear();
				getLongArray().addAll((Collection<? extends long[]>)newValue);
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
			case TypesPackage.MANY_TYPES__STRING:
				getString().clear();
				return;
			case TypesPackage.MANY_TYPES__INTEGER_OBJECT:
				getIntegerObject().clear();
				return;
			case TypesPackage.MANY_TYPES__LONG:
				getLong().clear();
				return;
			case TypesPackage.MANY_TYPES__DOUBLE_OBJECT:
				getDoubleObject().clear();
				return;
			case TypesPackage.MANY_TYPES__FLOAT_OBJECT:
				getFloatObject().clear();
				return;
			case TypesPackage.MANY_TYPES__CLAZZ:
				getClazz().clear();
				return;
			case TypesPackage.MANY_TYPES__CHAR_OBJECT:
				getCharObject().clear();
				return;
			case TypesPackage.MANY_TYPES__BYTE_OBJECT:
				getByteObject().clear();
				return;
			case TypesPackage.MANY_TYPES__BYTE_ARRAY:
				getByteArray().clear();
				return;
			case TypesPackage.MANY_TYPES__BIG_DECIMAL:
				getBigDecimal().clear();
				return;
			case TypesPackage.MANY_TYPES__BIG_INTEGER:
				getBigInteger().clear();
				return;
			case TypesPackage.MANY_TYPES__ENUM:
				getEnum().clear();
				return;
			case TypesPackage.MANY_TYPES__DATE:
				getDate().clear();
				return;
			case TypesPackage.MANY_TYPES__STRING_ARRAY:
				getStringArray().clear();
				return;
			case TypesPackage.MANY_TYPES__LONG_ARRAY:
				getLongArray().clear();
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
			case TypesPackage.MANY_TYPES__STRING:
				return string != null && !string.isEmpty();
			case TypesPackage.MANY_TYPES__INTEGER_OBJECT:
				return integerObject != null && !integerObject.isEmpty();
			case TypesPackage.MANY_TYPES__LONG:
				return long_ != null && !long_.isEmpty();
			case TypesPackage.MANY_TYPES__DOUBLE_OBJECT:
				return doubleObject != null && !doubleObject.isEmpty();
			case TypesPackage.MANY_TYPES__FLOAT_OBJECT:
				return floatObject != null && !floatObject.isEmpty();
			case TypesPackage.MANY_TYPES__CLAZZ:
				return clazz != null && !clazz.isEmpty();
			case TypesPackage.MANY_TYPES__CHAR_OBJECT:
				return charObject != null && !charObject.isEmpty();
			case TypesPackage.MANY_TYPES__BYTE_OBJECT:
				return byteObject != null && !byteObject.isEmpty();
			case TypesPackage.MANY_TYPES__BYTE_ARRAY:
				return byteArray != null && !byteArray.isEmpty();
			case TypesPackage.MANY_TYPES__BIG_DECIMAL:
				return bigDecimal != null && !bigDecimal.isEmpty();
			case TypesPackage.MANY_TYPES__BIG_INTEGER:
				return bigInteger != null && !bigInteger.isEmpty();
			case TypesPackage.MANY_TYPES__ENUM:
				return enum_ != null && !enum_.isEmpty();
			case TypesPackage.MANY_TYPES__DATE:
				return date != null && !date.isEmpty();
			case TypesPackage.MANY_TYPES__STRING_ARRAY:
				return stringArray != null && !stringArray.isEmpty();
			case TypesPackage.MANY_TYPES__LONG_ARRAY:
				return longArray != null && !longArray.isEmpty();
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
		result.append(", integerObject: ");
		result.append(integerObject);
		result.append(", long: ");
		result.append(long_);
		result.append(", doubleObject: ");
		result.append(doubleObject);
		result.append(", floatObject: ");
		result.append(floatObject);
		result.append(", clazz: ");
		result.append(clazz);
		result.append(", charObject: ");
		result.append(charObject);
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
		result.append(')');
		return result.toString();
	}

} //ManyTypesImpl
