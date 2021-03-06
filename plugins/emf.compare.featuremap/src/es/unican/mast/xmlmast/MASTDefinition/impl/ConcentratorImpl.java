/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConcentratorImpl.java,v 1.1 2008/09/24 14:01:09 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition.impl;

import es.unican.mast.xmlmast.MASTDefinition.Concentrator;
import es.unican.mast.xmlmast.MASTDefinition.ModelPackage;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concentrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.impl.ConcentratorImpl#getInputEventsList <em>Input Events List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.impl.ConcentratorImpl#getOutputEvent <em>Output Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcentratorImpl extends EObjectImpl implements Concentrator {
	/**
	 * The default value of the '{@link #getInputEventsList() <em>Input Events List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEventsList()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> INPUT_EVENTS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputEventsList() <em>Input Events List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEventsList()
	 * @generated
	 * @ordered
	 */
	protected List<String> inputEventsList = INPUT_EVENTS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputEvent() <em>Output Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputEvent() <em>Output Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEvent()
	 * @generated
	 * @ordered
	 */
	protected String outputEvent = OUTPUT_EVENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcentratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.CONCENTRATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getInputEventsList() {
		return inputEventsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputEventsList(List<String> newInputEventsList) {
		List<String> oldInputEventsList = inputEventsList;
		inputEventsList = newInputEventsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONCENTRATOR__INPUT_EVENTS_LIST, oldInputEventsList, inputEventsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputEvent() {
		return outputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputEvent(String newOutputEvent) {
		String oldOutputEvent = outputEvent;
		outputEvent = newOutputEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.CONCENTRATOR__OUTPUT_EVENT, oldOutputEvent, outputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.CONCENTRATOR__INPUT_EVENTS_LIST:
				return getInputEventsList();
			case ModelPackage.CONCENTRATOR__OUTPUT_EVENT:
				return getOutputEvent();
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
			case ModelPackage.CONCENTRATOR__INPUT_EVENTS_LIST:
				setInputEventsList((List<String>)newValue);
				return;
			case ModelPackage.CONCENTRATOR__OUTPUT_EVENT:
				setOutputEvent((String)newValue);
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
			case ModelPackage.CONCENTRATOR__INPUT_EVENTS_LIST:
				setInputEventsList(INPUT_EVENTS_LIST_EDEFAULT);
				return;
			case ModelPackage.CONCENTRATOR__OUTPUT_EVENT:
				setOutputEvent(OUTPUT_EVENT_EDEFAULT);
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
			case ModelPackage.CONCENTRATOR__INPUT_EVENTS_LIST:
				return INPUT_EVENTS_LIST_EDEFAULT == null ? inputEventsList != null : !INPUT_EVENTS_LIST_EDEFAULT.equals(inputEventsList);
			case ModelPackage.CONCENTRATOR__OUTPUT_EVENT:
				return OUTPUT_EVENT_EDEFAULT == null ? outputEvent != null : !OUTPUT_EVENT_EDEFAULT.equals(outputEvent);
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
		result.append(" (inputEventsList: ");
		result.append(inputEventsList);
		result.append(", outputEvent: ");
		result.append(outputEvent);
		result.append(')');
		return result.toString();
	}

} //ConcentratorImpl
