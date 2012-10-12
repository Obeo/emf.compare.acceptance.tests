/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bug;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link bug.Class1#getRefA <em>Ref A</em>}</li>
 *   <li>{@link bug.Class1#getRefB <em>Ref B</em>}</li>
 * </ul>
 * </p>
 *
 * @see bug.BugPackage#getClass1()
 * @model
 * @generated
 */
public interface Class1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref A</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref A</em>' containment reference.
	 * @see #setRefA(Class2)
	 * @see bug.BugPackage#getClass1_RefA()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Class2 getRefA();

	/**
	 * Sets the value of the '{@link bug.Class1#getRefA <em>Ref A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref A</em>' containment reference.
	 * @see #getRefA()
	 * @generated
	 */
	void setRefA(Class2 value);

	/**
	 * Returns the value of the '<em><b>Ref B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref B</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref B</em>' containment reference.
	 * @see #setRefB(Class2)
	 * @see bug.BugPackage#getClass1_RefB()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Class2 getRefB();

	/**
	 * Sets the value of the '{@link bug.Class1#getRefB <em>Ref B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref B</em>' containment reference.
	 * @see #getRefB()
	 * @generated
	 */
	void setRefB(Class2 value);

} // Class1
