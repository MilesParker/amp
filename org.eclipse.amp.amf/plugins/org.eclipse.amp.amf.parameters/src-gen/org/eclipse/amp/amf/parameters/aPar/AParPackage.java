/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.parameters.aPar;

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
 * @see org.eclipse.amp.amf.parameters.aPar.AParFactory
 * @model kind="package"
 * @generated
 */
public interface AParPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aPar";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/amp/amf/parameters/APar";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aPar";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AParPackage eINSTANCE = org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.ModelImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getModel()
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
   * The feature id for the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODEL = 1;

  /**
   * The feature id for the '<em><b>Incorporates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INCORPORATES = 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PARAMETERS = 3;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.ImportImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.IncorporatesImpl <em>Incorporates</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.IncorporatesImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getIncorporates()
   * @generated
   */
  int INCORPORATES = 2;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCORPORATES__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Incorporates</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCORPORATES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.ParameterImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 3;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.SingleParameterImpl <em>Single Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.SingleParameterImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getSingleParameter()
   * @generated
   */
  int SINGLE_PARAMETER = 4;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_PARAMETER__ATTRIBUTE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_PARAMETER__VALUE = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Single Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.SweepParameterImpl <em>Sweep Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.SweepParameterImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getSweepParameter()
   * @generated
   */
  int SWEEP_PARAMETER = 5;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWEEP_PARAMETER__ATTRIBUTE = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Start Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWEEP_PARAMETER__START_VALUE = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>End Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWEEP_PARAMETER__END_VALUE = PARAMETER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Increment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWEEP_PARAMETER__INCREMENT = PARAMETER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Sweep Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWEEP_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.SweepLinkImpl <em>Sweep Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.SweepLinkImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getSweepLink()
   * @generated
   */
  int SWEEP_LINK = 6;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWEEP_LINK__PARAMETERS = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Sweep Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWEEP_LINK_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.parameters.aPar.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amp.amf.parameters.aPar.Model#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Model</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Model#getModel()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Model();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.parameters.aPar.Model#getIncorporates <em>Incorporates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Incorporates</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Model#getIncorporates()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Incorporates();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.parameters.aPar.Model#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Model#getParameters()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Parameters();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.parameters.aPar.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.Incorporates <em>Incorporates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Incorporates</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Incorporates
   * @generated
   */
  EClass getIncorporates();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.parameters.aPar.Incorporates#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Incorporates#getImportURI()
   * @see #getIncorporates()
   * @generated
   */
  EAttribute getIncorporates_ImportURI();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.SingleParameter <em>Single Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Parameter</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.SingleParameter
   * @generated
   */
  EClass getSingleParameter();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amp.amf.parameters.aPar.SingleParameter#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.SingleParameter#getAttribute()
   * @see #getSingleParameter()
   * @generated
   */
  EReference getSingleParameter_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amp.amf.parameters.aPar.SingleParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.SingleParameter#getValue()
   * @see #getSingleParameter()
   * @generated
   */
  EReference getSingleParameter_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter <em>Sweep Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sweep Parameter</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.SweepParameter
   * @generated
   */
  EClass getSweepParameter();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.SweepParameter#getAttribute()
   * @see #getSweepParameter()
   * @generated
   */
  EReference getSweepParameter_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getStartValue <em>Start Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Start Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.SweepParameter#getStartValue()
   * @see #getSweepParameter()
   * @generated
   */
  EReference getSweepParameter_StartValue();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getEndValue <em>End Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>End Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.SweepParameter#getEndValue()
   * @see #getSweepParameter()
   * @generated
   */
  EReference getSweepParameter_EndValue();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amp.amf.parameters.aPar.SweepParameter#getIncrement <em>Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Increment</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.SweepParameter#getIncrement()
   * @see #getSweepParameter()
   * @generated
   */
  EReference getSweepParameter_Increment();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.SweepLink <em>Sweep Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sweep Link</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.SweepLink
   * @generated
   */
  EClass getSweepLink();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.parameters.aPar.SweepLink#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.SweepLink#getParameters()
   * @see #getSweepLink()
   * @generated
   */
  EReference getSweepLink_Parameters();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AParFactory getAParFactory();

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
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.ModelImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getModel()
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
     * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MODEL = eINSTANCE.getModel_Model();

    /**
     * The meta object literal for the '<em><b>Incorporates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__INCORPORATES = eINSTANCE.getModel_Incorporates();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__PARAMETERS = eINSTANCE.getModel_Parameters();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.ImportImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.IncorporatesImpl <em>Incorporates</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.IncorporatesImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getIncorporates()
     * @generated
     */
    EClass INCORPORATES = eINSTANCE.getIncorporates();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCORPORATES__IMPORT_URI = eINSTANCE.getIncorporates_ImportURI();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.ParameterImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.SingleParameterImpl <em>Single Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.SingleParameterImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getSingleParameter()
     * @generated
     */
    EClass SINGLE_PARAMETER = eINSTANCE.getSingleParameter();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_PARAMETER__ATTRIBUTE = eINSTANCE.getSingleParameter_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_PARAMETER__VALUE = eINSTANCE.getSingleParameter_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.SweepParameterImpl <em>Sweep Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.SweepParameterImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getSweepParameter()
     * @generated
     */
    EClass SWEEP_PARAMETER = eINSTANCE.getSweepParameter();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWEEP_PARAMETER__ATTRIBUTE = eINSTANCE.getSweepParameter_Attribute();

    /**
     * The meta object literal for the '<em><b>Start Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWEEP_PARAMETER__START_VALUE = eINSTANCE.getSweepParameter_StartValue();

    /**
     * The meta object literal for the '<em><b>End Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWEEP_PARAMETER__END_VALUE = eINSTANCE.getSweepParameter_EndValue();

    /**
     * The meta object literal for the '<em><b>Increment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWEEP_PARAMETER__INCREMENT = eINSTANCE.getSweepParameter_Increment();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.SweepLinkImpl <em>Sweep Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.SweepLinkImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getSweepLink()
     * @generated
     */
    EClass SWEEP_LINK = eINSTANCE.getSweepLink();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWEEP_LINK__PARAMETERS = eINSTANCE.getSweepLink_Parameters();

  }

} //AParPackage
