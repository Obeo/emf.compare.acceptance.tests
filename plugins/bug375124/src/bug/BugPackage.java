/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package bug;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bug.BugFactory
 * @model kind="package"
 * @generated
 */
public interface BugPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bug";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.example.emf.compare";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.example.emf.compare";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BugPackage eINSTANCE = bug.impl.BugPackageImpl.init();

	/**
	 * The meta object id for the '{@link bug.impl.Class1Impl <em>Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bug.impl.Class1Impl
	 * @see bug.impl.BugPackageImpl#getClass1()
	 * @generated
	 */
	int CLASS1 = 0;

	/**
	 * The feature id for the '<em><b>Ref A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1__REF_A = 0;

	/**
	 * The feature id for the '<em><b>Ref B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1__REF_B = 1;

	/**
	 * The number of structural features of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link bug.impl.Class2Impl <em>Class2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bug.impl.Class2Impl
	 * @see bug.impl.BugPackageImpl#getClass2()
	 * @generated
	 */
	int CLASS2 = 1;

	/**
	 * The feature id for the '<em><b>Key1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2__KEY1 = 0;

	/**
	 * The feature id for the '<em><b>Key2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2__KEY2 = 1;

	/**
	 * The feature id for the '<em><b>Key3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2__KEY3 = 2;

	/**
	 * The feature id for the '<em><b>Key4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2__KEY4 = 3;

	/**
	 * The feature id for the '<em><b>Key5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2__KEY5 = 4;

	/**
	 * The feature id for the '<em><b>Key6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2__KEY6 = 5;

	/**
	 * The number of structural features of the '<em>Class2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS2_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link bug.Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class1</em>'.
	 * @see bug.Class1
	 * @generated
	 */
	EClass getClass1();

	/**
	 * Returns the meta object for the containment reference '{@link bug.Class1#getRefA <em>Ref A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref A</em>'.
	 * @see bug.Class1#getRefA()
	 * @see #getClass1()
	 * @generated
	 */
	EReference getClass1_RefA();

	/**
	 * Returns the meta object for the containment reference '{@link bug.Class1#getRefB <em>Ref B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ref B</em>'.
	 * @see bug.Class1#getRefB()
	 * @see #getClass1()
	 * @generated
	 */
	EReference getClass1_RefB();

	/**
	 * Returns the meta object for class '{@link bug.Class2 <em>Class2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class2</em>'.
	 * @see bug.Class2
	 * @generated
	 */
	EClass getClass2();

	/**
	 * Returns the meta object for the attribute '{@link bug.Class2#getKey1 <em>Key1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key1</em>'.
	 * @see bug.Class2#getKey1()
	 * @see #getClass2()
	 * @generated
	 */
	EAttribute getClass2_Key1();

	/**
	 * Returns the meta object for the attribute '{@link bug.Class2#getKey2 <em>Key2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key2</em>'.
	 * @see bug.Class2#getKey2()
	 * @see #getClass2()
	 * @generated
	 */
	EAttribute getClass2_Key2();

	/**
	 * Returns the meta object for the attribute '{@link bug.Class2#getKey3 <em>Key3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key3</em>'.
	 * @see bug.Class2#getKey3()
	 * @see #getClass2()
	 * @generated
	 */
	EAttribute getClass2_Key3();

	/**
	 * Returns the meta object for the attribute '{@link bug.Class2#getKey4 <em>Key4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key4</em>'.
	 * @see bug.Class2#getKey4()
	 * @see #getClass2()
	 * @generated
	 */
	EAttribute getClass2_Key4();

	/**
	 * Returns the meta object for the attribute '{@link bug.Class2#getKey5 <em>Key5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key5</em>'.
	 * @see bug.Class2#getKey5()
	 * @see #getClass2()
	 * @generated
	 */
	EAttribute getClass2_Key5();

	/**
	 * Returns the meta object for the attribute '{@link bug.Class2#getKey6 <em>Key6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key6</em>'.
	 * @see bug.Class2#getKey6()
	 * @see #getClass2()
	 * @generated
	 */
	EAttribute getClass2_Key6();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BugFactory getBugFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bug.impl.Class1Impl <em>Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bug.impl.Class1Impl
		 * @see bug.impl.BugPackageImpl#getClass1()
		 * @generated
		 */
		EClass CLASS1 = eINSTANCE.getClass1();

		/**
		 * The meta object literal for the '<em><b>Ref A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS1__REF_A = eINSTANCE.getClass1_RefA();

		/**
		 * The meta object literal for the '<em><b>Ref B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS1__REF_B = eINSTANCE.getClass1_RefB();

		/**
		 * The meta object literal for the '{@link bug.impl.Class2Impl <em>Class2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bug.impl.Class2Impl
		 * @see bug.impl.BugPackageImpl#getClass2()
		 * @generated
		 */
		EClass CLASS2 = eINSTANCE.getClass2();

		/**
		 * The meta object literal for the '<em><b>Key1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS2__KEY1 = eINSTANCE.getClass2_Key1();

		/**
		 * The meta object literal for the '<em><b>Key2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS2__KEY2 = eINSTANCE.getClass2_Key2();

		/**
		 * The meta object literal for the '<em><b>Key3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS2__KEY3 = eINSTANCE.getClass2_Key3();

		/**
		 * The meta object literal for the '<em><b>Key4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS2__KEY4 = eINSTANCE.getClass2_Key4();

		/**
		 * The meta object literal for the '<em><b>Key5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS2__KEY5 = eINSTANCE.getClass2_Key5();

		/**
		 * The meta object literal for the '<em><b>Key6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS2__KEY6 = eINSTANCE.getClass2_Key6();

	}

} //BugPackage
