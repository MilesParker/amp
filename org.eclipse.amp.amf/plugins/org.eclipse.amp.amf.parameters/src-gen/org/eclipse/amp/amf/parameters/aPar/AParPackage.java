/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.parameters.aPar;

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
   * The feature id for the '<em><b>Model</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MODEL = 0;

  /**
   * The feature id for the '<em><b>Incorporates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__INCORPORATES = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__PARAMETERS = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Attribute</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.ValueImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getValue()
   * @generated
   */
  int VALUE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.IntValueImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.FloatValueImpl <em>Float Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.FloatValueImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getFloatValue()
   * @generated
   */
  int FLOAT_VALUE = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Float Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.StringValueImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.impl.BooleanValueImpl
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.Engine <em>Engine</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.Engine
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getEngine()
   * @generated
   */
  int ENGINE = 9;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.parameters.aPar.BOOLEAN <em>BOOLEAN</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.parameters.aPar.BOOLEAN
   * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getBOOLEAN()
   * @generated
   */
  int BOOLEAN = 10;


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
   * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.parameters.aPar.Model#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Model</em>'.
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
   * Returns the meta object for the reference '{@link org.eclipse.amp.amf.parameters.aPar.Parameter#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attribute</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Parameter#getAttribute()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amp.amf.parameters.aPar.Parameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Parameter#getValue()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.amp.amf.parameters.aPar.Value#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Value#getValue()
   * @see #getValue()
   * @generated
   */
  EReference getValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.parameters.aPar.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.FloatValue <em>Float Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.FloatValue
   * @generated
   */
  EClass getFloatValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.parameters.aPar.FloatValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.FloatValue#getValue()
   * @see #getFloatValue()
   * @generated
   */
  EAttribute getFloatValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.parameters.aPar.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.parameters.aPar.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.parameters.aPar.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for enum '{@link org.eclipse.amp.amf.parameters.aPar.Engine <em>Engine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Engine</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.Engine
   * @generated
   */
  EEnum getEngine();

  /**
   * Returns the meta object for enum '{@link org.eclipse.amp.amf.parameters.aPar.BOOLEAN <em>BOOLEAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BOOLEAN</em>'.
   * @see org.eclipse.amp.amf.parameters.aPar.BOOLEAN
   * @generated
   */
  EEnum getBOOLEAN();

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
     * The meta object literal for the '<em><b>Model</b></em>' containment reference list feature.
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
     * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__ATTRIBUTE = eINSTANCE.getParameter_Attribute();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.ValueImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE__VALUE = eINSTANCE.getValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.IntValueImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.FloatValueImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getFloatValue()
     * @generated
     */
    EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_VALUE__VALUE = eINSTANCE.getFloatValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.StringValueImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getStringValue()
     * @generated
     */
    EClass STRING_VALUE = eINSTANCE.getStringValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.impl.BooleanValueImpl
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.Engine <em>Engine</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.Engine
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getEngine()
     * @generated
     */
    EEnum ENGINE = eINSTANCE.getEngine();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.parameters.aPar.BOOLEAN <em>BOOLEAN</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.parameters.aPar.BOOLEAN
     * @see org.eclipse.amp.amf.parameters.aPar.impl.AParPackageImpl#getBOOLEAN()
     * @generated
     */
    EEnum BOOLEAN = eINSTANCE.getBOOLEAN();

  }

} //AParPackage
