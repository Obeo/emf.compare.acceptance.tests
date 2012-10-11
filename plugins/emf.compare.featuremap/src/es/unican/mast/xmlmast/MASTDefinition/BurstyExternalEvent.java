/**
 * <copyright>
 * </copyright>
 *
 * $Id: BurstyExternalEvent.java,v 1.1 2008/09/24 14:01:08 any Exp $
 */
package es.unican.mast.xmlmast.MASTDefinition;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bursty External Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getBoundInterval <em>Bound Interval</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getDistribution <em>Distribution</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getMaxArrivals <em>Max Arrivals</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getBurstyExternalEvent()
 * @model extendedMetaData="name='Bursty_External_Event' kind='empty'"
 * @generated
 */
public interface BurstyExternalEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Avg Interarrival</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Interarrival</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Interarrival</em>' attribute.
	 * @see #isSetAvgInterarrival()
	 * @see #unsetAvgInterarrival()
	 * @see #setAvgInterarrival(float)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getBurstyExternalEvent_AvgInterarrival()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.MASTDefinition.Time"
	 *        extendedMetaData="kind='attribute' name='Avg_Interarrival'"
	 * @generated
	 */
	float getAvgInterarrival();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Interarrival</em>' attribute.
	 * @see #isSetAvgInterarrival()
	 * @see #unsetAvgInterarrival()
	 * @see #getAvgInterarrival()
	 * @generated
	 */
	void setAvgInterarrival(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAvgInterarrival()
	 * @see #getAvgInterarrival()
	 * @see #setAvgInterarrival(float)
	 * @generated
	 */
	void unsetAvgInterarrival();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getAvgInterarrival <em>Avg Interarrival</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Avg Interarrival</em>' attribute is set.
	 * @see #unsetAvgInterarrival()
	 * @see #getAvgInterarrival()
	 * @see #setAvgInterarrival(float)
	 * @generated
	 */
	boolean isSetAvgInterarrival();

	/**
	 * Returns the value of the '<em><b>Bound Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bound Interval</em>' attribute.
	 * @see #isSetBoundInterval()
	 * @see #unsetBoundInterval()
	 * @see #setBoundInterval(float)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getBurstyExternalEvent_BoundInterval()
	 * @model unsettable="true" dataType="es.unican.mast.xmlmast.MASTDefinition.Time"
	 *        extendedMetaData="kind='attribute' name='Bound_Interval'"
	 * @generated
	 */
	float getBoundInterval();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getBoundInterval <em>Bound Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bound Interval</em>' attribute.
	 * @see #isSetBoundInterval()
	 * @see #unsetBoundInterval()
	 * @see #getBoundInterval()
	 * @generated
	 */
	void setBoundInterval(float value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getBoundInterval <em>Bound Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoundInterval()
	 * @see #getBoundInterval()
	 * @see #setBoundInterval(float)
	 * @generated
	 */
	void unsetBoundInterval();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getBoundInterval <em>Bound Interval</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Bound Interval</em>' attribute is set.
	 * @see #unsetBoundInterval()
	 * @see #getBoundInterval()
	 * @see #setBoundInterval(float)
	 * @generated
	 */
	boolean isSetBoundInterval();

	/**
	 * Returns the value of the '<em><b>Distribution</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unican.mast.xmlmast.MASTDefinition.DistributionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distribution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distribution</em>' attribute.
	 * @see es.unican.mast.xmlmast.MASTDefinition.DistributionType
	 * @see #isSetDistribution()
	 * @see #unsetDistribution()
	 * @see #setDistribution(DistributionType)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getBurstyExternalEvent_Distribution()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='Distribution'"
	 * @generated
	 */
	DistributionType getDistribution();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getDistribution <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distribution</em>' attribute.
	 * @see es.unican.mast.xmlmast.MASTDefinition.DistributionType
	 * @see #isSetDistribution()
	 * @see #unsetDistribution()
	 * @see #getDistribution()
	 * @generated
	 */
	void setDistribution(DistributionType value);

	/**
	 * Unsets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getDistribution <em>Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDistribution()
	 * @see #getDistribution()
	 * @see #setDistribution(DistributionType)
	 * @generated
	 */
	void unsetDistribution();

	/**
	 * Returns whether the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getDistribution <em>Distribution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Distribution</em>' attribute is set.
	 * @see #unsetDistribution()
	 * @see #getDistribution()
	 * @see #setDistribution(DistributionType)
	 * @generated
	 */
	boolean isSetDistribution();

	/**
	 * Returns the value of the '<em><b>Max Arrivals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Arrivals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Arrivals</em>' attribute.
	 * @see #setMaxArrivals(BigInteger)
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getBurstyExternalEvent_MaxArrivals()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='Max_Arrivals'"
	 * @generated
	 */
	BigInteger getMaxArrivals();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getMaxArrivals <em>Max Arrivals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Arrivals</em>' attribute.
	 * @see #getMaxArrivals()
	 * @generated
	 */
	void setMaxArrivals(BigInteger value);

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
	 * @see es.unican.mast.xmlmast.MASTDefinition.ModelPackage#getBurstyExternalEvent_Name()
	 * @model dataType="es.unican.mast.xmlmast.MASTDefinition.Identifier" required="true"
	 *        extendedMetaData="kind='attribute' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link es.unican.mast.xmlmast.MASTDefinition.BurstyExternalEvent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // BurstyExternalEvent
