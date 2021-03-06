/**
 * <copyright>
 * </copyright>
 *
 * $Id: QueryServerImpl.java,v 1.1 2008/09/24 14:01:09 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition.impl;

import es.unican.mast.xmlmast.MASTDefinition.ModelPackage;
import es.unican.mast.xmlmast.MASTDefinition.QueryServer;
import es.unican.mast.xmlmast.MASTDefinition.RequestPolicy;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Server</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.impl.QueryServerImpl#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.impl.QueryServerImpl#getOutputEventsList <em>Output Events List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.impl.QueryServerImpl#getRequestPolicy <em>Request Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryServerImpl extends EObjectImpl implements QueryServer {
	/**
	 * The default value of the '{@link #getInputEvent() <em>Input Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEvent()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_EVENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputEvent() <em>Input Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEvent()
	 * @generated
	 * @ordered
	 */
	protected String inputEvent = INPUT_EVENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputEventsList() <em>Output Events List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEventsList()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> OUTPUT_EVENTS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputEventsList() <em>Output Events List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputEventsList()
	 * @generated
	 * @ordered
	 */
	protected List<String> outputEventsList = OUTPUT_EVENTS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequestPolicy() <em>Request Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final RequestPolicy REQUEST_POLICY_EDEFAULT = RequestPolicy.PRIORITY;

	/**
	 * The cached value of the '{@link #getRequestPolicy() <em>Request Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestPolicy()
	 * @generated
	 * @ordered
	 */
	protected RequestPolicy requestPolicy = REQUEST_POLICY_EDEFAULT;

	/**
	 * This is true if the Request Policy attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean requestPolicyESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.QUERY_SERVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputEvent() {
		return inputEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputEvent(String newInputEvent) {
		String oldInputEvent = inputEvent;
		inputEvent = newInputEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY_SERVER__INPUT_EVENT, oldInputEvent, inputEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getOutputEventsList() {
		return outputEventsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputEventsList(List<String> newOutputEventsList) {
		List<String> oldOutputEventsList = outputEventsList;
		outputEventsList = newOutputEventsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY_SERVER__OUTPUT_EVENTS_LIST, oldOutputEventsList, outputEventsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestPolicy getRequestPolicy() {
		return requestPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestPolicy(RequestPolicy newRequestPolicy) {
		RequestPolicy oldRequestPolicy = requestPolicy;
		requestPolicy = newRequestPolicy == null ? REQUEST_POLICY_EDEFAULT : newRequestPolicy;
		boolean oldRequestPolicyESet = requestPolicyESet;
		requestPolicyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.QUERY_SERVER__REQUEST_POLICY, oldRequestPolicy, requestPolicy, !oldRequestPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRequestPolicy() {
		RequestPolicy oldRequestPolicy = requestPolicy;
		boolean oldRequestPolicyESet = requestPolicyESet;
		requestPolicy = REQUEST_POLICY_EDEFAULT;
		requestPolicyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.QUERY_SERVER__REQUEST_POLICY, oldRequestPolicy, REQUEST_POLICY_EDEFAULT, oldRequestPolicyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequestPolicy() {
		return requestPolicyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.QUERY_SERVER__INPUT_EVENT:
				return getInputEvent();
			case ModelPackage.QUERY_SERVER__OUTPUT_EVENTS_LIST:
				return getOutputEventsList();
			case ModelPackage.QUERY_SERVER__REQUEST_POLICY:
				return getRequestPolicy();
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
			case ModelPackage.QUERY_SERVER__INPUT_EVENT:
				setInputEvent((String)newValue);
				return;
			case ModelPackage.QUERY_SERVER__OUTPUT_EVENTS_LIST:
				setOutputEventsList((List<String>)newValue);
				return;
			case ModelPackage.QUERY_SERVER__REQUEST_POLICY:
				setRequestPolicy((RequestPolicy)newValue);
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
			case ModelPackage.QUERY_SERVER__INPUT_EVENT:
				setInputEvent(INPUT_EVENT_EDEFAULT);
				return;
			case ModelPackage.QUERY_SERVER__OUTPUT_EVENTS_LIST:
				setOutputEventsList(OUTPUT_EVENTS_LIST_EDEFAULT);
				return;
			case ModelPackage.QUERY_SERVER__REQUEST_POLICY:
				unsetRequestPolicy();
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
			case ModelPackage.QUERY_SERVER__INPUT_EVENT:
				return INPUT_EVENT_EDEFAULT == null ? inputEvent != null : !INPUT_EVENT_EDEFAULT.equals(inputEvent);
			case ModelPackage.QUERY_SERVER__OUTPUT_EVENTS_LIST:
				return OUTPUT_EVENTS_LIST_EDEFAULT == null ? outputEventsList != null : !OUTPUT_EVENTS_LIST_EDEFAULT.equals(outputEventsList);
			case ModelPackage.QUERY_SERVER__REQUEST_POLICY:
				return isSetRequestPolicy();
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
		result.append(" (inputEvent: ");
		result.append(inputEvent);
		result.append(", outputEventsList: ");
		result.append(outputEventsList);
		result.append(", requestPolicy: ");
		if (requestPolicyESet) result.append(requestPolicy); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //QueryServerImpl
