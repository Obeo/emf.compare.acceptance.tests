/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bug.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import bug.BugPackage;
import bug.Class1;
import bug.Class2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link bug.impl.Class1Impl#getRefA <em>Ref A</em>}</li>
 *   <li>{@link bug.impl.Class1Impl#getRefB <em>Ref B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Class1Impl extends EObjectImpl implements Class1 {
	/**
	 * The cached value of the '{@link #getRefA() <em>Ref A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefA()
	 * @generated
	 * @ordered
	 */
	protected Class2 refA;

	/**
	 * The cached value of the '{@link #getRefB() <em>Ref B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefB()
	 * @generated
	 * @ordered
	 */
	protected Class2 refB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Class1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BugPackage.Literals.CLASS1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class2 getRefA() {
		return refA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefA(Class2 newRefA, NotificationChain msgs) {
		Class2 oldRefA = refA;
		refA = newRefA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BugPackage.CLASS1__REF_A, oldRefA, newRefA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefA(Class2 newRefA) {
		if (newRefA != refA) {
			NotificationChain msgs = null;
			if (refA != null)
				msgs = ((InternalEObject)refA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BugPackage.CLASS1__REF_A, null, msgs);
			if (newRefA != null)
				msgs = ((InternalEObject)newRefA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BugPackage.CLASS1__REF_A, null, msgs);
			msgs = basicSetRefA(newRefA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.CLASS1__REF_A, newRefA, newRefA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class2 getRefB() {
		return refB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefB(Class2 newRefB, NotificationChain msgs) {
		Class2 oldRefB = refB;
		refB = newRefB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BugPackage.CLASS1__REF_B, oldRefB, newRefB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefB(Class2 newRefB) {
		if (newRefB != refB) {
			NotificationChain msgs = null;
			if (refB != null)
				msgs = ((InternalEObject)refB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BugPackage.CLASS1__REF_B, null, msgs);
			if (newRefB != null)
				msgs = ((InternalEObject)newRefB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BugPackage.CLASS1__REF_B, null, msgs);
			msgs = basicSetRefB(newRefB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BugPackage.CLASS1__REF_B, newRefB, newRefB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BugPackage.CLASS1__REF_A:
				return basicSetRefA(null, msgs);
			case BugPackage.CLASS1__REF_B:
				return basicSetRefB(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BugPackage.CLASS1__REF_A:
				return getRefA();
			case BugPackage.CLASS1__REF_B:
				return getRefB();
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
			case BugPackage.CLASS1__REF_A:
				setRefA((Class2)newValue);
				return;
			case BugPackage.CLASS1__REF_B:
				setRefB((Class2)newValue);
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
			case BugPackage.CLASS1__REF_A:
				setRefA((Class2)null);
				return;
			case BugPackage.CLASS1__REF_B:
				setRefB((Class2)null);
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
			case BugPackage.CLASS1__REF_A:
				return refA != null;
			case BugPackage.CLASS1__REF_B:
				return refB != null;
		}
		return super.eIsSet(featureID);
	}

} //Class1Impl
