/**
 * <copyright>
 * </copyright>
 *
 * $Id: AresPackage.java,v 1.5 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.amp.amf.testing.ares.AresFactory
 * @model kind="package"
 * @generated
 */
public interface AresPackage extends EPackage {
    /**
	 * The package name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNAME = "ares";

    /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_URI = "http://eclipse.org/amp/ares";

    /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    String eNS_PREFIX = "ares";

    /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    AresPackage eINSTANCE = org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl.init();

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl <em>Run</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.testing.ares.impl.RunImpl
	 * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getRun()
	 * @generated
	 */
    int RUN = 0;

    /**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__MODEL = 0;

    /**
	 * The feature id for the '<em><b>Test</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__TEST = 1;

    /**
	 * The feature id for the '<em><b>Parameterization</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__PARAMETERIZATION = 2;

    /**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__RESULT = 3;

    /**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__PARAMETERS = 4;

    /**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__CONSTRAINTS = 5;

    /**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__STARTED = 6;

    /**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__FINISHED = 7;

    /**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN__RESULTS = 8;

    /**
	 * The number of structural features of the '<em>Run</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN_FEATURE_COUNT = 9;

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.testing.ares.impl.ConstraintTestImpl <em>Constraint Test</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.testing.ares.impl.ConstraintTestImpl
	 * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getConstraintTest()
	 * @generated
	 */
    int CONSTRAINT_TEST = 1;

    /**
	 * The feature id for the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONSTRAINT_TEST__CONSTRAINT = 0;

    /**
	 * The feature id for the '<em><b>Issue</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONSTRAINT_TEST__ISSUE = 1;

    /**
	 * The feature id for the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONSTRAINT_TEST__ACTUAL_VALUE = 2;

    /**
	 * The feature id for the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONSTRAINT_TEST__FAILURE = 3;

    /**
	 * The number of structural features of the '<em>Constraint Test</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int CONSTRAINT_TEST_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.testing.ares.impl.RunSetImpl <em>Run Set</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.testing.ares.impl.RunSetImpl
	 * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getRunSet()
	 * @generated
	 */
    int RUN_SET = 2;

    /**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN_SET__RESULT = 0;

    /**
	 * The feature id for the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN_SET__STARTED = 1;

    /**
	 * The feature id for the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN_SET__FINISHED = 2;

    /**
	 * The feature id for the '<em><b>Runs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN_SET__RUNS = 3;

    /**
	 * The number of structural features of the '<em>Run Set</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int RUN_SET_FEATURE_COUNT = 4;

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.testing.ares.ResultType <em>Result Type</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.testing.ares.ResultType
	 * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getResultType()
	 * @generated
	 */
    int RESULT_TYPE = 3;

    /**
	 * The meta object id for the '{@link org.eclipse.amp.amf.testing.ares.Issue <em>Issue</em>}' enum.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.testing.ares.Issue
	 * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getIssue()
	 * @generated
	 */
    int ISSUE = 4;


    /**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.testing.ares.Run <em>Run</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Run
	 * @generated
	 */
    EClass getRun();

    /**
	 * Returns the meta object for the reference '{@link org.eclipse.amp.amf.testing.ares.Run#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Run#getModel()
	 * @see #getRun()
	 * @generated
	 */
    EReference getRun_Model();

    /**
	 * Returns the meta object for the reference '{@link org.eclipse.amp.amf.testing.ares.Run#getTest <em>Test</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Run#getTest()
	 * @see #getRun()
	 * @generated
	 */
    EReference getRun_Test();

    /**
	 * Returns the meta object for the reference '{@link org.eclipse.amp.amf.testing.ares.Run#getParameterization <em>Parameterization</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameterization</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Run#getParameterization()
	 * @see #getRun()
	 * @generated
	 */
    EReference getRun_Parameterization();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.Run#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Run#getResult()
	 * @see #getRun()
	 * @generated
	 */
    EAttribute getRun_Result();

    /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.testing.ares.Run#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Run#getParameters()
	 * @see #getRun()
	 * @generated
	 */
    EReference getRun_Parameters();

    /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.testing.ares.Run#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Run#getConstraints()
	 * @see #getRun()
	 * @generated
	 */
    EReference getRun_Constraints();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.Run#getStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Run#getStarted()
	 * @see #getRun()
	 * @generated
	 */
    EAttribute getRun_Started();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.Run#getFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Run#getFinished()
	 * @see #getRun()
	 * @generated
	 */
    EAttribute getRun_Finished();

    /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.testing.ares.Run#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Run#getResults()
	 * @see #getRun()
	 * @generated
	 */
    EReference getRun_Results();

    /**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.testing.ares.ConstraintTest <em>Constraint Test</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Test</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.ConstraintTest
	 * @generated
	 */
    EClass getConstraintTest();

    /**
	 * Returns the meta object for the reference '{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Constraint</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.ConstraintTest#getConstraint()
	 * @see #getConstraintTest()
	 * @generated
	 */
    EReference getConstraintTest_Constraint();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#getIssue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.ConstraintTest#getIssue()
	 * @see #getConstraintTest()
	 * @generated
	 */
    EAttribute getConstraintTest_Issue();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#getActualValue <em>Actual Value</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actual Value</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.ConstraintTest#getActualValue()
	 * @see #getConstraintTest()
	 * @generated
	 */
    EAttribute getConstraintTest_ActualValue();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#isFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.ConstraintTest#isFailure()
	 * @see #getConstraintTest()
	 * @generated
	 */
    EAttribute getConstraintTest_Failure();

    /**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.testing.ares.RunSet <em>Run Set</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Run Set</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.RunSet
	 * @generated
	 */
    EClass getRunSet();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.RunSet#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.RunSet#getResult()
	 * @see #getRunSet()
	 * @generated
	 */
    EAttribute getRunSet_Result();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.RunSet#getStarted <em>Started</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Started</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.RunSet#getStarted()
	 * @see #getRunSet()
	 * @generated
	 */
    EAttribute getRunSet_Started();

    /**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.RunSet#getFinished <em>Finished</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finished</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.RunSet#getFinished()
	 * @see #getRunSet()
	 * @generated
	 */
    EAttribute getRunSet_Finished();

    /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.testing.ares.RunSet#getRuns <em>Runs</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Runs</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.RunSet#getRuns()
	 * @see #getRunSet()
	 * @generated
	 */
    EReference getRunSet_Runs();

    /**
	 * Returns the meta object for enum '{@link org.eclipse.amp.amf.testing.ares.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Type</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.ResultType
	 * @generated
	 */
    EEnum getResultType();

    /**
	 * Returns the meta object for enum '{@link org.eclipse.amp.amf.testing.ares.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Issue</em>'.
	 * @see org.eclipse.amp.amf.testing.ares.Issue
	 * @generated
	 */
    EEnum getIssue();

    /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
    AresFactory getAresFactory();

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
		 * The meta object literal for the '{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl <em>Run</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.testing.ares.impl.RunImpl
		 * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getRun()
		 * @generated
		 */
        EClass RUN = eINSTANCE.getRun();

        /**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN__MODEL = eINSTANCE.getRun_Model();

        /**
		 * The meta object literal for the '<em><b>Test</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN__TEST = eINSTANCE.getRun_Test();

        /**
		 * The meta object literal for the '<em><b>Parameterization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN__PARAMETERIZATION = eINSTANCE.getRun_Parameterization();

        /**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RUN__RESULT = eINSTANCE.getRun_Result();

        /**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN__PARAMETERS = eINSTANCE.getRun_Parameters();

        /**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN__CONSTRAINTS = eINSTANCE.getRun_Constraints();

        /**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RUN__STARTED = eINSTANCE.getRun_Started();

        /**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RUN__FINISHED = eINSTANCE.getRun_Finished();

        /**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN__RESULTS = eINSTANCE.getRun_Results();

        /**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.testing.ares.impl.ConstraintTestImpl <em>Constraint Test</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.testing.ares.impl.ConstraintTestImpl
		 * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getConstraintTest()
		 * @generated
		 */
        EClass CONSTRAINT_TEST = eINSTANCE.getConstraintTest();

        /**
		 * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference CONSTRAINT_TEST__CONSTRAINT = eINSTANCE.getConstraintTest_Constraint();

        /**
		 * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CONSTRAINT_TEST__ISSUE = eINSTANCE.getConstraintTest_Issue();

        /**
		 * The meta object literal for the '<em><b>Actual Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CONSTRAINT_TEST__ACTUAL_VALUE = eINSTANCE.getConstraintTest_ActualValue();

        /**
		 * The meta object literal for the '<em><b>Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute CONSTRAINT_TEST__FAILURE = eINSTANCE.getConstraintTest_Failure();

        /**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.testing.ares.impl.RunSetImpl <em>Run Set</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.testing.ares.impl.RunSetImpl
		 * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getRunSet()
		 * @generated
		 */
        EClass RUN_SET = eINSTANCE.getRunSet();

        /**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RUN_SET__RESULT = eINSTANCE.getRunSet_Result();

        /**
		 * The meta object literal for the '<em><b>Started</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RUN_SET__STARTED = eINSTANCE.getRunSet_Started();

        /**
		 * The meta object literal for the '<em><b>Finished</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute RUN_SET__FINISHED = eINSTANCE.getRunSet_Finished();

        /**
		 * The meta object literal for the '<em><b>Runs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference RUN_SET__RUNS = eINSTANCE.getRunSet_Runs();

        /**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.testing.ares.ResultType <em>Result Type</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.testing.ares.ResultType
		 * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getResultType()
		 * @generated
		 */
        EEnum RESULT_TYPE = eINSTANCE.getResultType();

        /**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.testing.ares.Issue <em>Issue</em>}' enum.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.testing.ares.Issue
		 * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getIssue()
		 * @generated
		 */
        EEnum ISSUE = eINSTANCE.getIssue();

    }

} //AresPackage
