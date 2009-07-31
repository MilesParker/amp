/**
 * <copyright>
 * </copyright>
 *
 * $Id: AresPackage.java,v 1.1 2009/07/31 21:48:19 mparker Exp $
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
     * The feature id for the '<em><b>Test Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUN__TEST_MODEL = 1;

    /**
     * The feature id for the '<em><b>Parameter Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUN__PARAMETER_MODEL = 2;

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
     * The feature id for the '<em><b>Constraints</b></em>' reference list.
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
     * The number of structural features of the '<em>Run</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUN_FEATURE_COUNT = 8;

    /**
     * The meta object id for the '{@link org.eclipse.amp.amf.testing.ares.impl.FailureImpl <em>Failure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.testing.ares.impl.FailureImpl
     * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getFailure()
     * @generated
     */
    int FAILURE = 1;

    /**
     * The feature id for the '<em><b>Constraint</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAILURE__CONSTRAINT = 0;

    /**
     * The feature id for the '<em><b>Issue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAILURE__ISSUE = 1;

    /**
     * The feature id for the '<em><b>Actual Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAILURE__ACTUAL_VALUE = 2;

    /**
     * The number of structural features of the '<em>Failure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FAILURE_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link org.eclipse.amp.amf.testing.ares.Result <em>Result</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.testing.ares.Result
     * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getResult()
     * @generated
     */
    int RESULT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.amp.amf.testing.ares.Issue <em>Issue</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.testing.ares.Issue
     * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getIssue()
     * @generated
     */
    int ISSUE = 3;


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
     * Returns the meta object for the reference '{@link org.eclipse.amp.amf.testing.ares.Run#getTestModel <em>Test Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Test Model</em>'.
     * @see org.eclipse.amp.amf.testing.ares.Run#getTestModel()
     * @see #getRun()
     * @generated
     */
    EReference getRun_TestModel();

    /**
     * Returns the meta object for the reference '{@link org.eclipse.amp.amf.testing.ares.Run#getParameterModel <em>Parameter Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parameter Model</em>'.
     * @see org.eclipse.amp.amf.testing.ares.Run#getParameterModel()
     * @see #getRun()
     * @generated
     */
    EReference getRun_ParameterModel();

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
     * Returns the meta object for the reference list '{@link org.eclipse.amp.amf.testing.ares.Run#getConstraints <em>Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Constraints</em>'.
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
     * Returns the meta object for class '{@link org.eclipse.amp.amf.testing.ares.Failure <em>Failure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Failure</em>'.
     * @see org.eclipse.amp.amf.testing.ares.Failure
     * @generated
     */
    EClass getFailure();

    /**
     * Returns the meta object for the reference '{@link org.eclipse.amp.amf.testing.ares.Failure#getConstraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Constraint</em>'.
     * @see org.eclipse.amp.amf.testing.ares.Failure#getConstraint()
     * @see #getFailure()
     * @generated
     */
    EReference getFailure_Constraint();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.Failure#getIssue <em>Issue</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Issue</em>'.
     * @see org.eclipse.amp.amf.testing.ares.Failure#getIssue()
     * @see #getFailure()
     * @generated
     */
    EAttribute getFailure_Issue();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.ares.Failure#getActualValue <em>Actual Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Actual Value</em>'.
     * @see org.eclipse.amp.amf.testing.ares.Failure#getActualValue()
     * @see #getFailure()
     * @generated
     */
    EAttribute getFailure_ActualValue();

    /**
     * Returns the meta object for enum '{@link org.eclipse.amp.amf.testing.ares.Result <em>Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Result</em>'.
     * @see org.eclipse.amp.amf.testing.ares.Result
     * @generated
     */
    EEnum getResult();

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
         * The meta object literal for the '<em><b>Test Model</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RUN__TEST_MODEL = eINSTANCE.getRun_TestModel();

        /**
         * The meta object literal for the '<em><b>Parameter Model</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RUN__PARAMETER_MODEL = eINSTANCE.getRun_ParameterModel();

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
         * The meta object literal for the '<em><b>Constraints</b></em>' reference list feature.
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
         * The meta object literal for the '{@link org.eclipse.amp.amf.testing.ares.impl.FailureImpl <em>Failure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.amp.amf.testing.ares.impl.FailureImpl
         * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getFailure()
         * @generated
         */
        EClass FAILURE = eINSTANCE.getFailure();

        /**
         * The meta object literal for the '<em><b>Constraint</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FAILURE__CONSTRAINT = eINSTANCE.getFailure_Constraint();

        /**
         * The meta object literal for the '<em><b>Issue</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FAILURE__ISSUE = eINSTANCE.getFailure_Issue();

        /**
         * The meta object literal for the '<em><b>Actual Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FAILURE__ACTUAL_VALUE = eINSTANCE.getFailure_ActualValue();

        /**
         * The meta object literal for the '{@link org.eclipse.amp.amf.testing.ares.Result <em>Result</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.amp.amf.testing.ares.Result
         * @see org.eclipse.amp.amf.testing.ares.impl.AresPackageImpl#getResult()
         * @generated
         */
        EEnum RESULT = eINSTANCE.getResult();

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
