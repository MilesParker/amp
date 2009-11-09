/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.abase.aBase;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see org.eclipse.amp.amf.abase.aBase.ABaseFactory
 * @model kind="package"
 * @generated
 */
public interface ABasePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aBase";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/amp/amf/abase/ABase";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aBase";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ABasePackage eINSTANCE = org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.abase.aBase.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.abase.aBase.impl.ValueImpl
   * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getValue()
   * @generated
   */
  int VALUE = 0;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.abase.aBase.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.abase.aBase.impl.IntValueImpl
   * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.abase.aBase.impl.RealValueImpl <em>Real Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.abase.aBase.impl.RealValueImpl
   * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getRealValue()
   * @generated
   */
  int REAL_VALUE = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Real Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.abase.aBase.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.abase.aBase.impl.StringValueImpl
   * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.abase.aBase.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.abase.aBase.impl.BooleanValueImpl
   * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.eclipse.amp.amf.abase.aBase.BOOLEAN <em>BOOLEAN</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.amp.amf.abase.aBase.BOOLEAN
   * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getBOOLEAN()
   * @generated
   */
  int BOOLEAN = 5;


  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.abase.aBase.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.eclipse.amp.amf.abase.aBase.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.abase.aBase.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see org.eclipse.amp.amf.abase.aBase.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.abase.aBase.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amp.amf.abase.aBase.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.abase.aBase.RealValue <em>Real Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Real Value</em>'.
   * @see org.eclipse.amp.amf.abase.aBase.RealValue
   * @generated
   */
  EClass getRealValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.abase.aBase.RealValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amp.amf.abase.aBase.RealValue#getValue()
   * @see #getRealValue()
   * @generated
   */
  EAttribute getRealValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.abase.aBase.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.eclipse.amp.amf.abase.aBase.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.abase.aBase.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amp.amf.abase.aBase.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.eclipse.amp.amf.abase.aBase.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see org.eclipse.amp.amf.abase.aBase.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.abase.aBase.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.eclipse.amp.amf.abase.aBase.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for enum '{@link org.eclipse.amp.amf.abase.aBase.BOOLEAN <em>BOOLEAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BOOLEAN</em>'.
   * @see org.eclipse.amp.amf.abase.aBase.BOOLEAN
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
  ABaseFactory getABaseFactory();

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
     * The meta object literal for the '{@link org.eclipse.amp.amf.abase.aBase.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.abase.aBase.impl.ValueImpl
     * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.abase.aBase.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.abase.aBase.impl.IntValueImpl
     * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getIntValue()
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
     * The meta object literal for the '{@link org.eclipse.amp.amf.abase.aBase.impl.RealValueImpl <em>Real Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.abase.aBase.impl.RealValueImpl
     * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getRealValue()
     * @generated
     */
    EClass REAL_VALUE = eINSTANCE.getRealValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL_VALUE__VALUE = eINSTANCE.getRealValue_Value();

    /**
     * The meta object literal for the '{@link org.eclipse.amp.amf.abase.aBase.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.abase.aBase.impl.StringValueImpl
     * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getStringValue()
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
     * The meta object literal for the '{@link org.eclipse.amp.amf.abase.aBase.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.abase.aBase.impl.BooleanValueImpl
     * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getBooleanValue()
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
     * The meta object literal for the '{@link org.eclipse.amp.amf.abase.aBase.BOOLEAN <em>BOOLEAN</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.amp.amf.abase.aBase.BOOLEAN
     * @see org.eclipse.amp.amf.abase.aBase.impl.ABasePackageImpl#getBOOLEAN()
     * @generated
     */
    EEnum BOOLEAN = eINSTANCE.getBOOLEAN();

  }

} //ABasePackage
