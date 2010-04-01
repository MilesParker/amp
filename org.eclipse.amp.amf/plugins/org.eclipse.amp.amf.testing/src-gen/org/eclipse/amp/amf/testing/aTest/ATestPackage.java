/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.testing.aTest;

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
 * @see org.eclipse.amp.amf.testing.aTest.ATestFactory
 * @model kind="package"
 * @generated
 */
public interface ATestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aTest";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/amp/amf/testing/ATest";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aTest";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ATestPackage eINSTANCE = org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.testing.aTest.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.testing.aTest.impl.ModelImpl
   * @see org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Tests</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TESTS = 2;

  /**
   * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONTRAINTS = 3;

  /**
   * The feature id for the '<em><b>Contains</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__CONTAINS = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.testing.aTest.impl.TestsImpl <em>Tests</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.testing.aTest.impl.TestsImpl
   * @see org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl#getTests()
   * @generated
   */
  int TESTS = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTS__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Tests</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TESTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.testing.aTest.impl.TestMemberImpl <em>Test Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.testing.aTest.impl.TestMemberImpl
   * @see org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl#getTestMember()
   * @generated
   */
  int TEST_MEMBER = 2;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_MEMBER__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Test Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEST_MEMBER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.testing.aTest.impl.ConstraintImpl <em>Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.testing.aTest.impl.ConstraintImpl
   * @see org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl#getConstraint()
   * @generated
   */
  int CONSTRAINT = 3;

  /**
   * The feature id for the '<em><b>Measure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__MEASURE = 0;

  /**
   * The feature id for the '<em><b>Agent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__AGENT = 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__ATTRIBUTE = 2;

  /**
   * The feature id for the '<em><b>Qualifier</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__QUALIFIER = 3;

  /**
   * The feature id for the '<em><b>Min Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__MIN_VALUE = 4;

  /**
   * The feature id for the '<em><b>Max Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT__MAX_VALUE = 5;

  /**
   * The number of structural features of the '<em>Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRAINT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.testing.aTest.Measure <em>Measure</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.testing.aTest.Measure
   * @see org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl#getMeasure()
   * @generated
   */
  int MEASURE = 4;


  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.testing.aTest.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.aTest.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.aTest.Model#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Model#getDescription()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Description();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amp.amf.testing.aTest.Model#getTests <em>Tests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tests</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Model#getTests()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Tests();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.testing.aTest.Model#getContraints <em>Contraints</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contraints</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Model#getContraints()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Contraints();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.testing.aTest.Model#getContains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contains</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Model#getContains()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Contains();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.testing.aTest.Tests <em>Tests</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tests</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Tests
   * @generated
   */
  EClass getTests();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.aTest.Tests#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Tests#getImportURI()
   * @see #getTests()
   * @generated
   */
  EAttribute getTests_ImportURI();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.testing.aTest.TestMember <em>Test Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Test Member</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.TestMember
   * @generated
   */
  EClass getTestMember();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.aTest.TestMember#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.TestMember#getImportURI()
   * @see #getTestMember()
   * @generated
   */
  EAttribute getTestMember_ImportURI();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.testing.aTest.Constraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constraint</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Constraint
   * @generated
   */
  EClass getConstraint();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getMeasure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Measure</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Constraint#getMeasure()
   * @see #getConstraint()
   * @generated
   */
  EAttribute getConstraint_Measure();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Agent</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Constraint#getAgent()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Agent();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Constraint#getAttribute()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Attribute();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getQualifier <em>Qualifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Qualifier</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Constraint#getQualifier()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_Qualifier();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getMinValue <em>Min Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Min Value</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Constraint#getMinValue()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_MinValue();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amp.amf.testing.aTest.Constraint#getMaxValue <em>Max Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max Value</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Constraint#getMaxValue()
   * @see #getConstraint()
   * @generated
   */
  EReference getConstraint_MaxValue();

  /**
   * Returns the meta object for enum '{@link org.eclipse.amp.amf.testing.aTest.Measure <em>Measure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Measure</em>'.
   * @see org.eclipse.amp.amf.testing.aTest.Measure
   * @generated
   */
  EEnum getMeasure();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ATestFactory getATestFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.testing.aTest.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.testing.aTest.impl.ModelImpl
     * @see org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__DESCRIPTION = eINSTANCE.getModel_Description();

    /**
     * The meta object literal for the '<em><b>Tests</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TESTS = eINSTANCE.getModel_Tests();

    /**
     * The meta object literal for the '<em><b>Contraints</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONTRAINTS = eINSTANCE.getModel_Contraints();

    /**
     * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__CONTAINS = eINSTANCE.getModel_Contains();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.testing.aTest.impl.TestsImpl <em>Tests</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.testing.aTest.impl.TestsImpl
     * @see org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl#getTests()
     * @generated
     */
    EClass TESTS = eINSTANCE.getTests();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TESTS__IMPORT_URI = eINSTANCE.getTests_ImportURI();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.testing.aTest.impl.TestMemberImpl <em>Test Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.testing.aTest.impl.TestMemberImpl
     * @see org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl#getTestMember()
     * @generated
     */
    EClass TEST_MEMBER = eINSTANCE.getTestMember();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEST_MEMBER__IMPORT_URI = eINSTANCE.getTestMember_ImportURI();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.testing.aTest.impl.ConstraintImpl <em>Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.testing.aTest.impl.ConstraintImpl
     * @see org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl#getConstraint()
     * @generated
     */
    EClass CONSTRAINT = eINSTANCE.getConstraint();

    /**
     * The meta object literal for the '<em><b>Measure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRAINT__MEASURE = eINSTANCE.getConstraint_Measure();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__AGENT = eINSTANCE.getConstraint_Agent();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__ATTRIBUTE = eINSTANCE.getConstraint_Attribute();

    /**
     * The meta object literal for the '<em><b>Qualifier</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__QUALIFIER = eINSTANCE.getConstraint_Qualifier();

    /**
     * The meta object literal for the '<em><b>Min Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__MIN_VALUE = eINSTANCE.getConstraint_MinValue();

    /**
     * The meta object literal for the '<em><b>Max Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRAINT__MAX_VALUE = eINSTANCE.getConstraint_MaxValue();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.testing.aTest.Measure <em>Measure</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.testing.aTest.Measure
     * @see org.eclipse.amp.amf.testing.aTest.impl.ATestPackageImpl#getMeasure()
     * @generated
     */
    EEnum MEASURE = eINSTANCE.getMeasure();

  }

} //ATestPackage
