/**
 * <copyright>
 * </copyright>
 *
 * $Id: OverriddenFixedPriorityImpl.java,v 1.1 2008/09/24 14:01:09 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition.impl;

import es.unican.mast.xmlmast.MASTDefinition.ModelPackage;
import es.unican.mast.xmlmast.MASTDefinition.OverriddenFixedPriority;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overridden Fixed Priority</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.impl.OverriddenFixedPriorityImpl#getThePriority <em>The Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OverriddenFixedPriorityImpl extends EObjectImpl implements OverriddenFixedPriority {
	/**
	 * The default value of the '{@link #getThePriority() <em>The Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThePriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger THE_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThePriority() <em>The Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThePriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger thePriority = THE_PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OverriddenFixedPriorityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.OVERRIDDEN_FIXED_PRIORITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getThePriority() {
		return thePriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThePriority(BigInteger newThePriority) {
		BigInteger oldThePriority = thePriority;
		thePriority = newThePriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.OVERRIDDEN_FIXED_PRIORITY__THE_PRIORITY, oldThePriority, thePriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.OVERRIDDEN_FIXED_PRIORITY__THE_PRIORITY:
				return getThePriority();
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
			case ModelPackage.OVERRIDDEN_FIXED_PRIORITY__THE_PRIORITY:
				setThePriority((BigInteger)newValue);
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
			case ModelPackage.OVERRIDDEN_FIXED_PRIORITY__THE_PRIORITY:
				setThePriority(THE_PRIORITY_EDEFAULT);
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
			case ModelPackage.OVERRIDDEN_FIXED_PRIORITY__THE_PRIORITY:
				return THE_PRIORITY_EDEFAULT == null ? thePriority != null : !THE_PRIORITY_EDEFAULT.equals(thePriority);
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
		result.append(" (thePriority: ");
		result.append(thePriority);
		result.append(')');
		return result.toString();
	}

} //OverriddenFixedPriorityImpl
