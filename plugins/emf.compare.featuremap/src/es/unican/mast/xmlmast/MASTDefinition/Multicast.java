/**
 * <copyright>
 * </copyright>
 *
 * $Id: Multicast.java,v 1.1 2008/09/24 14:01:08 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multicast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.Multicast#getInputEvent <em>Input Event</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.Multicast#getOutputEventsList <em>Output Events List</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getMulticast()
 * @model extendedMetaData="name='Multicast' kind='empty'"
 * @generated
 */
public interface Multicast extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Event</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Event</em>' attribute.
	 * @see #setInputEvent(String)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getMulticast_InputEvent()
	 * @model dataType="es.unican.mast.xmlmast.MASTDefinition.IdentifierRef" required="true"
	 *        extendedMetaData="kind='attribute' name='Input_Event'"
	 * @generated
	 */
	String getInputEvent();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.Multicast#getInputEvent <em>Input Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Event</em>' attribute.
	 * @see #getInputEvent()
	 * @generated
	 */
	void setInputEvent(String value);

	/**
	 * Returns the value of the '<em><b>Output Events List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Events List</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Events List</em>' attribute.
	 * @see #setOutputEventsList(List)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getMulticast_OutputEventsList()
	 * @model dataType="es.unican.mast.xmlmast.MASTDefinition.IdentifierRefList" required="true" many="false"
	 *        extendedMetaData="kind='attribute' name='Output_Events_List'"
	 * @generated
	 */
	List<String> getOutputEventsList();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.Multicast#getOutputEventsList <em>Output Events List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Events List</em>' attribute.
	 * @see #getOutputEventsList()
	 * @generated
	 */
	void setOutputEventsList(List<String> value);

} // Multicast
