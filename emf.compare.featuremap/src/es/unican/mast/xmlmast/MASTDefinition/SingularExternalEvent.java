/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingularExternalEvent.java,v 1.1 2008/09/24 14:01:08 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Singular External Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.SingularExternalEvent#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.SingularExternalEvent#getPhase <em>Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getSingularExternalEvent()
 * @model extendedMetaData="name='Singular_External_Event' kind='empty'"
 * @generated
 */
public interface SingularExternalEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getSingularExternalEvent_Name()
	 * @model dataType="es.unican.mast.xmlmast.MASTDefinition.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.SingularExternalEvent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Phase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phase</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #setPhase(float)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getSingularExternalEvent_Phase()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.MASTDefinition.AbsoluteTime"
	 *        extendedMetaData="kind='attribute' name='Phase'"
	 * @generated
	 */
	float getPhase();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.SingularExternalEvent#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phase</em>' attribute.
	 * @see #isSetPhase()
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @generated
	 */
	void setPhase(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.SingularExternalEvent#getPhase <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPhase()
	 * @see #getPhase()
	 * @see #setPhase(float)
	 * @generated
	 */
	void unsetPhase();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.SingularExternalEvent#getPhase <em>Phase</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Phase</em>' attribute is set.
	 * @see #unsetPhase()
	 * @see #getPhase()
	 * @see #setPhase(float)
	 * @generated
	 */
	boolean isSetPhase();

} // SingularExternalEvent
