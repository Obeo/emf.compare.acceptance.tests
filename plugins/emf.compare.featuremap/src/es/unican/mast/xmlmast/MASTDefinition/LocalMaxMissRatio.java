/**
 * <copyright>
 * </copyright>
 *
 * $Id: LocalMaxMissRatio.java,v 1.1 2008/09/24 14:01:08 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Max Miss Ratio</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.LocalMaxMissRatio#getDeadline <em>Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.LocalMaxMissRatio#getRatio <em>Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getLocalMaxMissRatio()
 * @model extendedMetaData="name='Local_Max_Miss_Ratio' kind='empty'"
 * @generated
 */
public interface LocalMaxMissRatio extends EObject {
	/**
	 * Returns the value of the '<em><b>Deadline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deadline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #setDeadline(float)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getLocalMaxMissRatio_Deadline()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.MASTDefinition.Time"
	 *        extendedMetaData="kind='attribute' name='Deadline'"
	 * @generated
	 */
	float getDeadline();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.LocalMaxMissRatio#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadline</em>' attribute.
	 * @see #isSetDeadline()
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @generated
	 */
	void setDeadline(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.LocalMaxMissRatio#getDeadline <em>Deadline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(float)
	 * @generated
	 */
	void unsetDeadline();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.LocalMaxMissRatio#getDeadline <em>Deadline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Deadline</em>' attribute is set.
	 * @see #unsetDeadline()
	 * @see #getDeadline()
	 * @see #setDeadline(float)
	 * @generated
	 */
	boolean isSetDeadline();

	/**
	 * Returns the value of the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ratio</em>' attribute.
	 * @see #isSetRatio()
	 * @see #unsetRatio()
	 * @see #setRatio(float)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getLocalMaxMissRatio_Ratio()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.MASTDefinition.Percentage"
	 *        extendedMetaData="kind='attribute' name='Ratio'"
	 * @generated
	 */
	float getRatio();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.LocalMaxMissRatio#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ratio</em>' attribute.
	 * @see #isSetRatio()
	 * @see #unsetRatio()
	 * @see #getRatio()
	 * @generated
	 */
	void setRatio(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.LocalMaxMissRatio#getRatio <em>Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRatio()
	 * @see #getRatio()
	 * @see #setRatio(float)
	 * @generated
	 */
	void unsetRatio();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.LocalMaxMissRatio#getRatio <em>Ratio</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ratio</em>' attribute is set.
	 * @see #unsetRatio()
	 * @see #getRatio()
	 * @see #setRatio(float)
	 * @generated
	 */
	boolean isSetRatio();

} // LocalMaxMissRatio
