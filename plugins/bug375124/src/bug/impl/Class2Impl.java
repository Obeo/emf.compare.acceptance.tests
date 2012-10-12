/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bug.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import bug.BugPackage;
import bug.Class2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bug.impl.Class2Impl#getKey1 <em>Key1</em>}</li>
 *   <li>{@link bug.impl.Class2Impl#getKey2 <em>Key2</em>}</li>
 *   <li>{@link bug.impl.Class2Impl#getKey3 <em>Key3</em>}</li>
 *   <li>{@link bug.impl.Class2Impl#getKey4 <em>Key4</em>}</li>
 *   <li>{@link bug.impl.Class2Impl#getKey5 <em>Key5</em>}</li>
 *   <li>{@link bug.impl.Class2Impl#getKey6 <em>Key6</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Class2Impl extends EObjectImpl implements Class2 {
	/**
	 * The default value of the '{@link #getKey1() <em>Key1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey1()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKey1() <em>Key1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey1()
	 * @generated
	 * @ordered
	 */
	protected int key1 = KEY1_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey2() <em>Key2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey2()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY2_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKey2() <em>Key2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey2()
	 * @generated
	 * @ordered
	 */
	protected int key2 = KEY2_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey3() <em>Key3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey3()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY3_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKey3() <em>Key3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey3()
	 * @generated
	 * @ordered
	 */
	protected int key3 = KEY3_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey4() <em>Key4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey4()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY4_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKey4() <em>Key4</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey4()
	 * @generated
	 * @ordered
	 */
	protected int key4 = KEY4_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey5() <em>Key5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey5()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY5_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKey5() <em>Key5</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey5()
	 * @generated
	 * @ordered
	 */
	protected int key5 = KEY5_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey6() <em>Key6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey6()
	 * @generated
	 * @ordered
	 */
	protected static final int KEY6_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getKey6() <em>Key6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey6()
	 * @generated
	 * @ordered
	 */
	protected int key6 = KEY6_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BugPackage.Literals.CLASS2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKey1() {
		return key1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey1(int newKey1) {
		int oldKey1 = key1;
		key1 = newKey1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.CLASS2__KEY1, oldKey1, key1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKey2() {
		return key2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey2(int newKey2) {
		int oldKey2 = key2;
		key2 = newKey2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.CLASS2__KEY2, oldKey2, key2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKey3() {
		return key3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey3(int newKey3) {
		int oldKey3 = key3;
		key3 = newKey3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.CLASS2__KEY3, oldKey3, key3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKey4() {
		return key4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey4(int newKey4) {
		int oldKey4 = key4;
		key4 = newKey4;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.CLASS2__KEY4, oldKey4, key4));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKey5() {
		return key5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey5(int newKey5) {
		int oldKey5 = key5;
		key5 = newKey5;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.CLASS2__KEY5, oldKey5, key5));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getKey6() {
		return key6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey6(int newKey6) {
		int oldKey6 = key6;
		key6 = newKey6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.CLASS2__KEY6, oldKey6, key6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BugPackage.CLASS2__KEY1:
				return getKey1();
			case BugPackage.CLASS2__KEY2:
				return getKey2();
			case BugPackage.CLASS2__KEY3:
				return getKey3();
			case BugPackage.CLASS2__KEY4:
				return getKey4();
			case BugPackage.CLASS2__KEY5:
				return getKey5();
			case BugPackage.CLASS2__KEY6:
				return getKey6();
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
			case BugPackage.CLASS2__KEY1:
				setKey1((Integer)newValue);
				return;
			case BugPackage.CLASS2__KEY2:
				setKey2((Integer)newValue);
				return;
			case BugPackage.CLASS2__KEY3:
				setKey3((Integer)newValue);
				return;
			case BugPackage.CLASS2__KEY4:
				setKey4((Integer)newValue);
				return;
			case BugPackage.CLASS2__KEY5:
				setKey5((Integer)newValue);
				return;
			case BugPackage.CLASS2__KEY6:
				setKey6((Integer)newValue);
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
			case BugPackage.CLASS2__KEY1:
				setKey1(KEY1_EDEFAULT);
				return;
			case BugPackage.CLASS2__KEY2:
				setKey2(KEY2_EDEFAULT);
				return;
			case BugPackage.CLASS2__KEY3:
				setKey3(KEY3_EDEFAULT);
				return;
			case BugPackage.CLASS2__KEY4:
				setKey4(KEY4_EDEFAULT);
				return;
			case BugPackage.CLASS2__KEY5:
				setKey5(KEY5_EDEFAULT);
				return;
			case BugPackage.CLASS2__KEY6:
				setKey6(KEY6_EDEFAULT);
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
			case BugPackage.CLASS2__KEY1:
				return key1 != KEY1_EDEFAULT;
			case BugPackage.CLASS2__KEY2:
				return key2 != KEY2_EDEFAULT;
			case BugPackage.CLASS2__KEY3:
				return key3 != KEY3_EDEFAULT;
			case BugPackage.CLASS2__KEY4:
				return key4 != KEY4_EDEFAULT;
			case BugPackage.CLASS2__KEY5:
				return key5 != KEY5_EDEFAULT;
			case BugPackage.CLASS2__KEY6:
				return key6 != KEY6_EDEFAULT;
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
		result.append(" (key1: ");
		result.append(key1);
		result.append(", key2: ");
		result.append(key2);
		result.append(", key3: ");
		result.append(key3);
		result.append(", key4: ");
		result.append(key4);
		result.append(", key5: ");
		result.append(key5);
		result.append(", key6: ");
		result.append(key6);
		result.append(')');
		return result.toString();
	}

} //Class2Impl
