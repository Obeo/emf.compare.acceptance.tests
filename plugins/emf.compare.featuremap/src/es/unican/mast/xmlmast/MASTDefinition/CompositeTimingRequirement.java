/**
 * <copyright>
 * </copyright>
 *
 * $Id: CompositeTimingRequirement.java,v 1.1 2008/09/24 14:01:08 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Timing Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.CompositeTimingRequirement#getGroup <em>Group</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.CompositeTimingRequirement#getMaxOutputJitterReq <em>Max Output Jitter Req</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.CompositeTimingRequirement#getHardGlobalDeadline <em>Hard Global Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.CompositeTimingRequirement#getSoftGlobalDeadline <em>Soft Global Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.CompositeTimingRequirement#getGlobalMaxMissRatio <em>Global Max Miss Ratio</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.CompositeTimingRequirement#getHardLocalDeadline <em>Hard Local Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.CompositeTimingRequirement#getSoftLocalDeadline <em>Soft Local Deadline</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.CompositeTimingRequirement#getLocalMaxMissRatio <em>Local Max Miss Ratio</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getCompositeTimingRequirement()
 * @model extendedMetaData="name='Composite_Timing_Requirement' kind='elementOnly'"
 * @generated
 */
public interface CompositeTimingRequirement extends EObject {
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
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getCompositeTimingRequirement_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Max Output Jitter Req</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.MASTDefinition.MaxOutputJitterReq}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Output Jitter Req</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Output Jitter Req</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getCompositeTimingRequirement_MaxOutputJitterReq()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Max_Output_Jitter_Req' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<MaxOutputJitterReq> getMaxOutputJitterReq();

	/**
	 * Returns the value of the '<em><b>Hard Global Deadline</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.MASTDefinition.HardGlobalDeadline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hard Global Deadline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hard Global Deadline</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getCompositeTimingRequirement_HardGlobalDeadline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Hard_Global_Deadline' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<HardGlobalDeadline> getHardGlobalDeadline();

	/**
	 * Returns the value of the '<em><b>Soft Global Deadline</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.MASTDefinition.SoftGlobalDeadline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Global Deadline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Global Deadline</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getCompositeTimingRequirement_SoftGlobalDeadline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Soft_Global_Deadline' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SoftGlobalDeadline> getSoftGlobalDeadline();

	/**
	 * Returns the value of the '<em><b>Global Max Miss Ratio</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.MASTDefinition.GlobalMaxMissRatio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Max Miss Ratio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Max Miss Ratio</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getCompositeTimingRequirement_GlobalMaxMissRatio()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Global_Max_Miss_Ratio' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<GlobalMaxMissRatio> getGlobalMaxMissRatio();

	/**
	 * Returns the value of the '<em><b>Hard Local Deadline</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.MASTDefinition.HardLocalDeadline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hard Local Deadline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hard Local Deadline</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getCompositeTimingRequirement_HardLocalDeadline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Hard_Local_Deadline' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<HardLocalDeadline> getHardLocalDeadline();

	/**
	 * Returns the value of the '<em><b>Soft Local Deadline</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.MASTDefinition.SoftLocalDeadline}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Soft Local Deadline</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Soft Local Deadline</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getCompositeTimingRequirement_SoftLocalDeadline()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Soft_Local_Deadline' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SoftLocalDeadline> getSoftLocalDeadline();

	/**
	 * Returns the value of the '<em><b>Local Max Miss Ratio</b></em>' containment reference list.
	 * The list contents are of type {@link es.unican.mast.xmlmast.MASTDefinition.LocalMaxMissRatio}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Max Miss Ratio</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Max Miss Ratio</em>' containment reference list.
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getCompositeTimingRequirement_LocalMaxMissRatio()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Local_Max_Miss_Ratio' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<LocalMaxMissRatio> getLocalMaxMissRatio();

} // CompositeTimingRequirement
