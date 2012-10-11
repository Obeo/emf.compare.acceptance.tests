/**
 * <copyright>
 * </copyright>
 *
 * $Id: ListOfDrivers.java,v 1.1 2008/09/24 14:01:08 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Of Drivers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.ListOfDrivers#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.ListOfDrivers#getPacketDriver <em>Packet Driver</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.ListOfDrivers#getCharacterPacketDriver <em>Character Packet Driver</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.ListOfDrivers#getRTEPPacketDriver <em>RTEP Packet Driver</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getListOfDrivers()
 * @model extendedMetaData="name='List_of_Drivers' kind='elementOnly'"
 * @generated
 */
public interface ListOfDrivers extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getListOfDrivers_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Packet Driver</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.MASTDefinition.PacketDriver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packet Driver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packet Driver</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getListOfDrivers_PacketDriver()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Packet_Driver' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<PacketDriver> getPacketDriver();

	/**
	 * Returns the value of the '<em><b>Character Packet Driver</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.MASTDefinition.CharacterPacketDriver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character Packet Driver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Packet Driver</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getListOfDrivers_CharacterPacketDriver()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Character_Packet_Driver' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<CharacterPacketDriver> getCharacterPacketDriver();

	/**
	 * Returns the value of the '<em><b>RTEP Packet Driver</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.MASTDefinition.RTEPPacketDriver}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RTEP Packet Driver</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RTEP Packet Driver</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getListOfDrivers_RTEPPacketDriver()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RTEP_Packet_Driver' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RTEPPacketDriver> getRTEPPacketDriver();

} // ListOfDrivers
