/**
 */
package types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see types.TypesFactory
 * @model kind="package"
 * @generated
 */
public interface TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/texo/test/model//types";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypesPackage eINSTANCE = types.impl.TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link types.impl.SingleTypesImpl <em>Single Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see types.impl.SingleTypesImpl
	 * @see types.impl.TypesPackageImpl#getSingleTypes()
	 * @generated
	 */
	int SINGLE_TYPES = 0;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__STRING = 0;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__INTEGER = 1;

	/**
	 * The feature id for the '<em><b>Integer Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__INTEGER_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__LONG = 3;

	/**
	 * The feature id for the '<em><b>Long Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__LONG_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__DOUBLE = 5;

	/**
	 * The feature id for the '<em><b>Double Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__DOUBLE_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__FLOAT = 7;

	/**
	 * The feature id for the '<em><b>Float Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__FLOAT_OBJECT = 8;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__CLAZZ = 9;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__CHAR = 10;

	/**
	 * The feature id for the '<em><b>Char Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__CHAR_OBJECT = 11;

	/**
	 * The feature id for the '<em><b>Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__BYTE = 12;

	/**
	 * The feature id for the '<em><b>Byte Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__BYTE_OBJECT = 13;

	/**
	 * The feature id for the '<em><b>Byte Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__BYTE_ARRAY = 14;

	/**
	 * The feature id for the '<em><b>Big Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__BIG_DECIMAL = 15;

	/**
	 * The feature id for the '<em><b>Big Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__BIG_INTEGER = 16;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__ENUM = 17;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__DATE = 18;

	/**
	 * The feature id for the '<em><b>String Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__STRING_ARRAY = 19;

	/**
	 * The feature id for the '<em><b>Long Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__LONG_ARRAY = 20;

	/**
	 * The feature id for the '<em><b>Next Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES__NEXT_ENUM = 21;

	/**
	 * The number of structural features of the '<em>Single Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_TYPES_FEATURE_COUNT = 22;

	/**
	 * The meta object id for the '{@link types.impl.ManyTypesImpl <em>Many Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see types.impl.ManyTypesImpl
	 * @see types.impl.TypesPackageImpl#getManyTypes()
	 * @generated
	 */
	int MANY_TYPES = 1;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__STRING = 0;

	/**
	 * The feature id for the '<em><b>Integer Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__INTEGER_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__LONG = 2;

	/**
	 * The feature id for the '<em><b>Double Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__DOUBLE_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Float Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__FLOAT_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__CLAZZ = 5;

	/**
	 * The feature id for the '<em><b>Char Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__CHAR_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Byte Object</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__BYTE_OBJECT = 7;

	/**
	 * The feature id for the '<em><b>Byte Array</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__BYTE_ARRAY = 8;

	/**
	 * The feature id for the '<em><b>Big Decimal</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__BIG_DECIMAL = 9;

	/**
	 * The feature id for the '<em><b>Big Integer</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__BIG_INTEGER = 10;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__ENUM = 11;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__DATE = 12;

	/**
	 * The feature id for the '<em><b>String Array</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__STRING_ARRAY = 13;

	/**
	 * The feature id for the '<em><b>Long Array</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES__LONG_ARRAY = 14;

	/**
	 * The number of structural features of the '<em>Many Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_TYPES_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link types.TestEnum <em>Test Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see types.TestEnum
	 * @see types.impl.TypesPackageImpl#getTestEnum()
	 * @generated
	 */
	int TEST_ENUM = 2;

	/**
	 * The meta object id for the '{@link types.TestNextEnum <em>Test Next Enum</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see types.TestNextEnum
	 * @see types.impl.TypesPackageImpl#getTestNextEnum()
	 * @generated
	 */
	int TEST_NEXT_ENUM = 3;

	/**
	 * The meta object id for the '<em>Long Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see types.impl.TypesPackageImpl#getLongArray()
	 * @generated
	 */
	int LONG_ARRAY = 4;

	/**
	 * The meta object id for the '<em>String Array</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see types.impl.TypesPackageImpl#getStringArray()
	 * @generated
	 */
	int STRING_ARRAY = 5;


	/**
	 * Returns the meta object for class '{@link types.SingleTypes <em>Single Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Types</em>'.
	 * @see types.SingleTypes
	 * @generated
	 */
	EClass getSingleTypes();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see types.SingleTypes#getString()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_String();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see types.SingleTypes#getInteger()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_Integer();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getIntegerObject <em>Integer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Object</em>'.
	 * @see types.SingleTypes#getIntegerObject()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_IntegerObject();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see types.SingleTypes#getLong()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_Long();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getLongObject <em>Long Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Object</em>'.
	 * @see types.SingleTypes#getLongObject()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_LongObject();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double</em>'.
	 * @see types.SingleTypes#getDouble()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_Double();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getDoubleObject <em>Double Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Object</em>'.
	 * @see types.SingleTypes#getDoubleObject()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_DoubleObject();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float</em>'.
	 * @see types.SingleTypes#getFloat()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_Float();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getFloatObject <em>Float Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float Object</em>'.
	 * @see types.SingleTypes#getFloatObject()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_FloatObject();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clazz</em>'.
	 * @see types.SingleTypes#getClazz()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_Clazz();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see types.SingleTypes#getChar()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_Char();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getCharObject <em>Char Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char Object</em>'.
	 * @see types.SingleTypes#getCharObject()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_CharObject();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getByte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte</em>'.
	 * @see types.SingleTypes#getByte()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_Byte();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getByteObject <em>Byte Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Object</em>'.
	 * @see types.SingleTypes#getByteObject()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_ByteObject();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getByteArray <em>Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Array</em>'.
	 * @see types.SingleTypes#getByteArray()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_ByteArray();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getBigDecimal <em>Big Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Decimal</em>'.
	 * @see types.SingleTypes#getBigDecimal()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_BigDecimal();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getBigInteger <em>Big Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Integer</em>'.
	 * @see types.SingleTypes#getBigInteger()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_BigInteger();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enum</em>'.
	 * @see types.SingleTypes#getEnum()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_Enum();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see types.SingleTypes#getDate()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_Date();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getStringArray <em>String Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Array</em>'.
	 * @see types.SingleTypes#getStringArray()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_StringArray();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getLongArray <em>Long Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Array</em>'.
	 * @see types.SingleTypes#getLongArray()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_LongArray();

	/**
	 * Returns the meta object for the attribute '{@link types.SingleTypes#getNextEnum <em>Next Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Next Enum</em>'.
	 * @see types.SingleTypes#getNextEnum()
	 * @see #getSingleTypes()
	 * @generated
	 */
	EAttribute getSingleTypes_NextEnum();

	/**
	 * Returns the meta object for class '{@link types.ManyTypes <em>Many Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Types</em>'.
	 * @see types.ManyTypes
	 * @generated
	 */
	EClass getManyTypes();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String</em>'.
	 * @see types.ManyTypes#getString()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_String();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getIntegerObject <em>Integer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Integer Object</em>'.
	 * @see types.ManyTypes#getIntegerObject()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_IntegerObject();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Long</em>'.
	 * @see types.ManyTypes#getLong()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_Long();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getDoubleObject <em>Double Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Double Object</em>'.
	 * @see types.ManyTypes#getDoubleObject()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_DoubleObject();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getFloatObject <em>Float Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Float Object</em>'.
	 * @see types.ManyTypes#getFloatObject()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_FloatObject();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Clazz</em>'.
	 * @see types.ManyTypes#getClazz()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_Clazz();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getCharObject <em>Char Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Char Object</em>'.
	 * @see types.ManyTypes#getCharObject()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_CharObject();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getByteObject <em>Byte Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Byte Object</em>'.
	 * @see types.ManyTypes#getByteObject()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_ByteObject();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getByteArray <em>Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Byte Array</em>'.
	 * @see types.ManyTypes#getByteArray()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_ByteArray();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getBigDecimal <em>Big Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Big Decimal</em>'.
	 * @see types.ManyTypes#getBigDecimal()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_BigDecimal();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getBigInteger <em>Big Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Big Integer</em>'.
	 * @see types.ManyTypes#getBigInteger()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_BigInteger();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum</em>'.
	 * @see types.ManyTypes#getEnum()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_Enum();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Date</em>'.
	 * @see types.ManyTypes#getDate()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_Date();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getStringArray <em>String Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>String Array</em>'.
	 * @see types.ManyTypes#getStringArray()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_StringArray();

	/**
	 * Returns the meta object for the attribute list '{@link types.ManyTypes#getLongArray <em>Long Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Long Array</em>'.
	 * @see types.ManyTypes#getLongArray()
	 * @see #getManyTypes()
	 * @generated
	 */
	EAttribute getManyTypes_LongArray();

	/**
	 * Returns the meta object for enum '{@link types.TestEnum <em>Test Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Enum</em>'.
	 * @see types.TestEnum
	 * @generated
	 */
	EEnum getTestEnum();

	/**
	 * Returns the meta object for enum '{@link types.TestNextEnum <em>Test Next Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Test Next Enum</em>'.
	 * @see types.TestNextEnum
	 * @generated
	 */
	EEnum getTestNextEnum();

	/**
	 * Returns the meta object for data type '<em>Long Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Long Array</em>'.
	 * @model instanceClass="long[]"
	 * @generated
	 */
	EDataType getLongArray();

	/**
	 * Returns the meta object for data type '<em>String Array</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Array</em>'.
	 * @model instanceClass="java.lang.String[]"
	 * @generated
	 */
	EDataType getStringArray();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypesFactory getTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link types.impl.SingleTypesImpl <em>Single Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see types.impl.SingleTypesImpl
		 * @see types.impl.TypesPackageImpl#getSingleTypes()
		 * @generated
		 */
		EClass SINGLE_TYPES = eINSTANCE.getSingleTypes();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__STRING = eINSTANCE.getSingleTypes_String();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__INTEGER = eINSTANCE.getSingleTypes_Integer();

		/**
		 * The meta object literal for the '<em><b>Integer Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__INTEGER_OBJECT = eINSTANCE.getSingleTypes_IntegerObject();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__LONG = eINSTANCE.getSingleTypes_Long();

		/**
		 * The meta object literal for the '<em><b>Long Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__LONG_OBJECT = eINSTANCE.getSingleTypes_LongObject();

		/**
		 * The meta object literal for the '<em><b>Double</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__DOUBLE = eINSTANCE.getSingleTypes_Double();

		/**
		 * The meta object literal for the '<em><b>Double Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__DOUBLE_OBJECT = eINSTANCE.getSingleTypes_DoubleObject();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__FLOAT = eINSTANCE.getSingleTypes_Float();

		/**
		 * The meta object literal for the '<em><b>Float Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__FLOAT_OBJECT = eINSTANCE.getSingleTypes_FloatObject();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__CLAZZ = eINSTANCE.getSingleTypes_Clazz();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__CHAR = eINSTANCE.getSingleTypes_Char();

		/**
		 * The meta object literal for the '<em><b>Char Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__CHAR_OBJECT = eINSTANCE.getSingleTypes_CharObject();

		/**
		 * The meta object literal for the '<em><b>Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__BYTE = eINSTANCE.getSingleTypes_Byte();

		/**
		 * The meta object literal for the '<em><b>Byte Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__BYTE_OBJECT = eINSTANCE.getSingleTypes_ByteObject();

		/**
		 * The meta object literal for the '<em><b>Byte Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__BYTE_ARRAY = eINSTANCE.getSingleTypes_ByteArray();

		/**
		 * The meta object literal for the '<em><b>Big Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__BIG_DECIMAL = eINSTANCE.getSingleTypes_BigDecimal();

		/**
		 * The meta object literal for the '<em><b>Big Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__BIG_INTEGER = eINSTANCE.getSingleTypes_BigInteger();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__ENUM = eINSTANCE.getSingleTypes_Enum();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__DATE = eINSTANCE.getSingleTypes_Date();

		/**
		 * The meta object literal for the '<em><b>String Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__STRING_ARRAY = eINSTANCE.getSingleTypes_StringArray();

		/**
		 * The meta object literal for the '<em><b>Long Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__LONG_ARRAY = eINSTANCE.getSingleTypes_LongArray();

		/**
		 * The meta object literal for the '<em><b>Next Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_TYPES__NEXT_ENUM = eINSTANCE.getSingleTypes_NextEnum();

		/**
		 * The meta object literal for the '{@link types.impl.ManyTypesImpl <em>Many Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see types.impl.ManyTypesImpl
		 * @see types.impl.TypesPackageImpl#getManyTypes()
		 * @generated
		 */
		EClass MANY_TYPES = eINSTANCE.getManyTypes();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__STRING = eINSTANCE.getManyTypes_String();

		/**
		 * The meta object literal for the '<em><b>Integer Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__INTEGER_OBJECT = eINSTANCE.getManyTypes_IntegerObject();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__LONG = eINSTANCE.getManyTypes_Long();

		/**
		 * The meta object literal for the '<em><b>Double Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__DOUBLE_OBJECT = eINSTANCE.getManyTypes_DoubleObject();

		/**
		 * The meta object literal for the '<em><b>Float Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__FLOAT_OBJECT = eINSTANCE.getManyTypes_FloatObject();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__CLAZZ = eINSTANCE.getManyTypes_Clazz();

		/**
		 * The meta object literal for the '<em><b>Char Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__CHAR_OBJECT = eINSTANCE.getManyTypes_CharObject();

		/**
		 * The meta object literal for the '<em><b>Byte Object</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__BYTE_OBJECT = eINSTANCE.getManyTypes_ByteObject();

		/**
		 * The meta object literal for the '<em><b>Byte Array</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__BYTE_ARRAY = eINSTANCE.getManyTypes_ByteArray();

		/**
		 * The meta object literal for the '<em><b>Big Decimal</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__BIG_DECIMAL = eINSTANCE.getManyTypes_BigDecimal();

		/**
		 * The meta object literal for the '<em><b>Big Integer</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__BIG_INTEGER = eINSTANCE.getManyTypes_BigInteger();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__ENUM = eINSTANCE.getManyTypes_Enum();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__DATE = eINSTANCE.getManyTypes_Date();

		/**
		 * The meta object literal for the '<em><b>String Array</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__STRING_ARRAY = eINSTANCE.getManyTypes_StringArray();

		/**
		 * The meta object literal for the '<em><b>Long Array</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANY_TYPES__LONG_ARRAY = eINSTANCE.getManyTypes_LongArray();

		/**
		 * The meta object literal for the '{@link types.TestEnum <em>Test Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see types.TestEnum
		 * @see types.impl.TypesPackageImpl#getTestEnum()
		 * @generated
		 */
		EEnum TEST_ENUM = eINSTANCE.getTestEnum();

		/**
		 * The meta object literal for the '{@link types.TestNextEnum <em>Test Next Enum</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see types.TestNextEnum
		 * @see types.impl.TypesPackageImpl#getTestNextEnum()
		 * @generated
		 */
		EEnum TEST_NEXT_ENUM = eINSTANCE.getTestNextEnum();

		/**
		 * The meta object literal for the '<em>Long Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see types.impl.TypesPackageImpl#getLongArray()
		 * @generated
		 */
		EDataType LONG_ARRAY = eINSTANCE.getLongArray();

		/**
		 * The meta object literal for the '<em>String Array</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see types.impl.TypesPackageImpl#getStringArray()
		 * @generated
		 */
		EDataType STRING_ARRAY = eINSTANCE.getStringArray();

	}

} //TypesPackage
