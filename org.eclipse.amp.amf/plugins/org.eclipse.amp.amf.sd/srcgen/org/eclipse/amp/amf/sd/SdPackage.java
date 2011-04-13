/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd;

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
 * @see org.eclipse.amp.amf.sd.SdFactory
 * @model kind="package"
 * @generated
 */
public interface SdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "sd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SdPackage eINSTANCE = org.eclipse.amp.amf.sd.impl.SdPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.amp.amf.sd.impl.SdNamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.sd.impl.SdNamedElementImpl
	 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdNamedElement()
	 * @generated
	 */
	int SD_NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_NAMED_ELEMENT__COMMENT = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amp.amf.sd.impl.SdGeneratableImpl <em>Generatable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.sd.impl.SdGeneratableImpl
	 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdGeneratable()
	 * @generated
	 */
	int SD_GENERATABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GENERATABLE__NAME = SD_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GENERATABLE__COMMENT = SD_NAMED_ELEMENT__COMMENT;

	/**
	 * The number of structural features of the '<em>Generatable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_GENERATABLE_FEATURE_COUNT = SD_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amp.amf.sd.impl.SdAbstractVariableImpl <em>Abstract Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.sd.impl.SdAbstractVariableImpl
	 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdAbstractVariable()
	 * @generated
	 */
	int SD_ABSTRACT_VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ABSTRACT_VARIABLE__NAME = SD_GENERATABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ABSTRACT_VARIABLE__COMMENT = SD_GENERATABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ABSTRACT_VARIABLE__TO_ELEMENT = SD_GENERATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ABSTRACT_VARIABLE__PARENT = SD_GENERATABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_ABSTRACT_VARIABLE_FEATURE_COUNT = SD_GENERATABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amp.amf.sd.impl.SdEquationVariableImpl <em>Equation Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.sd.impl.SdEquationVariableImpl
	 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdEquationVariable()
	 * @generated
	 */
	int SD_EQUATION_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EQUATION_VARIABLE__NAME = SD_ABSTRACT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EQUATION_VARIABLE__COMMENT = SD_ABSTRACT_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EQUATION_VARIABLE__TO_ELEMENT = SD_ABSTRACT_VARIABLE__TO_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EQUATION_VARIABLE__PARENT = SD_ABSTRACT_VARIABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EQUATION_VARIABLE__EQUATION = SD_ABSTRACT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Equation Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_EQUATION_VARIABLE_FEATURE_COUNT = SD_ABSTRACT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.amp.amf.sd.impl.SdModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.sd.impl.SdModelImpl
	 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdModel()
	 * @generated
	 */
	int SD_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MODEL__NAME = SD_GENERATABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MODEL__COMMENT = SD_GENERATABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MODEL__PARENT = SD_GENERATABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MODEL__ABSTRACT_VARIABLES = SD_GENERATABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MODEL_FEATURE_COUNT = SD_GENERATABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amp.amf.sd.impl.SdAuxVariableImpl <em>Aux Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.sd.impl.SdAuxVariableImpl
	 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdAuxVariable()
	 * @generated
	 */
	int SD_AUX_VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_AUX_VARIABLE__NAME = SD_EQUATION_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_AUX_VARIABLE__COMMENT = SD_EQUATION_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_AUX_VARIABLE__TO_ELEMENT = SD_EQUATION_VARIABLE__TO_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_AUX_VARIABLE__PARENT = SD_EQUATION_VARIABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_AUX_VARIABLE__EQUATION = SD_EQUATION_VARIABLE__EQUATION;

	/**
	 * The number of structural features of the '<em>Aux Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_AUX_VARIABLE_FEATURE_COUNT = SD_EQUATION_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amp.amf.sd.impl.SdStockVariableImpl <em>Stock Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.sd.impl.SdStockVariableImpl
	 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdStockVariable()
	 * @generated
	 */
	int SD_STOCK_VARIABLE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_STOCK_VARIABLE__NAME = SD_ABSTRACT_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_STOCK_VARIABLE__COMMENT = SD_ABSTRACT_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_STOCK_VARIABLE__TO_ELEMENT = SD_ABSTRACT_VARIABLE__TO_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_STOCK_VARIABLE__PARENT = SD_ABSTRACT_VARIABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Integral</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_STOCK_VARIABLE__INTEGRAL = SD_ABSTRACT_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_STOCK_VARIABLE__INITIAL_VALUE = SD_ABSTRACT_VARIABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stock Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_STOCK_VARIABLE_FEATURE_COUNT = SD_ABSTRACT_VARIABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.amp.amf.sd.impl.SdFlowVariableImpl <em>Flow Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.sd.impl.SdFlowVariableImpl
	 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdFlowVariable()
	 * @generated
	 */
	int SD_FLOW_VARIABLE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FLOW_VARIABLE__NAME = SD_EQUATION_VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FLOW_VARIABLE__COMMENT = SD_EQUATION_VARIABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FLOW_VARIABLE__TO_ELEMENT = SD_EQUATION_VARIABLE__TO_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FLOW_VARIABLE__PARENT = SD_EQUATION_VARIABLE__PARENT;

	/**
	 * The feature id for the '<em><b>Equation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FLOW_VARIABLE__EQUATION = SD_EQUATION_VARIABLE__EQUATION;

	/**
	 * The number of structural features of the '<em>Flow Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_FLOW_VARIABLE_FEATURE_COUNT = SD_EQUATION_VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.amp.amf.sd.impl.SdConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.amp.amf.sd.impl.SdConnectorImpl
	 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdConnector()
	 * @generated
	 */
	int SD_CONNECTOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_CONNECTOR__NAME = SD_GENERATABLE__NAME;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_CONNECTOR__COMMENT = SD_GENERATABLE__COMMENT;

	/**
	 * The feature id for the '<em><b>To Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_CONNECTOR__TO_ELEMENT = SD_GENERATABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_CONNECTOR_FEATURE_COUNT = SD_GENERATABLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.sd.SdNamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.eclipse.amp.amf.sd.SdNamedElement
	 * @generated
	 */
	EClass getSdNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.sd.SdNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.amp.amf.sd.SdNamedElement#getName()
	 * @see #getSdNamedElement()
	 * @generated
	 */
	EAttribute getSdNamedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.sd.SdNamedElement#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see org.eclipse.amp.amf.sd.SdNamedElement#getComment()
	 * @see #getSdNamedElement()
	 * @generated
	 */
	EAttribute getSdNamedElement_Comment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.sd.SdAbstractVariable <em>Abstract Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Variable</em>'.
	 * @see org.eclipse.amp.amf.sd.SdAbstractVariable
	 * @generated
	 */
	EClass getSdAbstractVariable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.sd.SdAbstractVariable#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>To Element</em>'.
	 * @see org.eclipse.amp.amf.sd.SdAbstractVariable#getToElement()
	 * @see #getSdAbstractVariable()
	 * @generated
	 */
	EReference getSdAbstractVariable_ToElement();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipse.amp.amf.sd.SdAbstractVariable#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.eclipse.amp.amf.sd.SdAbstractVariable#getParent()
	 * @see #getSdAbstractVariable()
	 * @generated
	 */
	EReference getSdAbstractVariable_Parent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.sd.SdEquationVariable <em>Equation Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation Variable</em>'.
	 * @see org.eclipse.amp.amf.sd.SdEquationVariable
	 * @generated
	 */
	EClass getSdEquationVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.sd.SdEquationVariable#getEquation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Equation</em>'.
	 * @see org.eclipse.amp.amf.sd.SdEquationVariable#getEquation()
	 * @see #getSdEquationVariable()
	 * @generated
	 */
	EAttribute getSdEquationVariable_Equation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.sd.SdModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.eclipse.amp.amf.sd.SdModel
	 * @generated
	 */
	EClass getSdModel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.amp.amf.sd.SdModel#getAbstractVariables <em>Abstract Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abstract Variables</em>'.
	 * @see org.eclipse.amp.amf.sd.SdModel#getAbstractVariables()
	 * @see #getSdModel()
	 * @generated
	 */
	EReference getSdModel_AbstractVariables();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.sd.SdAuxVariable <em>Aux Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aux Variable</em>'.
	 * @see org.eclipse.amp.amf.sd.SdAuxVariable
	 * @generated
	 */
	EClass getSdAuxVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.sd.SdStockVariable <em>Stock Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stock Variable</em>'.
	 * @see org.eclipse.amp.amf.sd.SdStockVariable
	 * @generated
	 */
	EClass getSdStockVariable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.sd.SdStockVariable#getIntegral <em>Integral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integral</em>'.
	 * @see org.eclipse.amp.amf.sd.SdStockVariable#getIntegral()
	 * @see #getSdStockVariable()
	 * @generated
	 */
	EAttribute getSdStockVariable_Integral();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.amp.amf.sd.SdStockVariable#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see org.eclipse.amp.amf.sd.SdStockVariable#getInitialValue()
	 * @see #getSdStockVariable()
	 * @generated
	 */
	EAttribute getSdStockVariable_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.sd.SdFlowVariable <em>Flow Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow Variable</em>'.
	 * @see org.eclipse.amp.amf.sd.SdFlowVariable
	 * @generated
	 */
	EClass getSdFlowVariable();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.sd.SdConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see org.eclipse.amp.amf.sd.SdConnector
	 * @generated
	 */
	EClass getSdConnector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.amp.amf.sd.SdConnector#getToElement <em>To Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Element</em>'.
	 * @see org.eclipse.amp.amf.sd.SdConnector#getToElement()
	 * @see #getSdConnector()
	 * @generated
	 */
	EReference getSdConnector_ToElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.amp.amf.sd.SdGeneratable <em>Generatable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generatable</em>'.
	 * @see org.eclipse.amp.amf.sd.SdGeneratable
	 * @generated
	 */
	EClass getSdGeneratable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SdFactory getSdFactory();

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
		 * The meta object literal for the '{@link org.eclipse.amp.amf.sd.impl.SdNamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.sd.impl.SdNamedElementImpl
		 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdNamedElement()
		 * @generated
		 */
		EClass SD_NAMED_ELEMENT = eINSTANCE.getSdNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD_NAMED_ELEMENT__NAME = eINSTANCE.getSdNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD_NAMED_ELEMENT__COMMENT = eINSTANCE.getSdNamedElement_Comment();

		/**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.sd.impl.SdAbstractVariableImpl <em>Abstract Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.sd.impl.SdAbstractVariableImpl
		 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdAbstractVariable()
		 * @generated
		 */
		EClass SD_ABSTRACT_VARIABLE = eINSTANCE.getSdAbstractVariable();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_ABSTRACT_VARIABLE__TO_ELEMENT = eINSTANCE.getSdAbstractVariable_ToElement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_ABSTRACT_VARIABLE__PARENT = eINSTANCE.getSdAbstractVariable_Parent();

		/**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.sd.impl.SdEquationVariableImpl <em>Equation Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.sd.impl.SdEquationVariableImpl
		 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdEquationVariable()
		 * @generated
		 */
		EClass SD_EQUATION_VARIABLE = eINSTANCE.getSdEquationVariable();

		/**
		 * The meta object literal for the '<em><b>Equation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD_EQUATION_VARIABLE__EQUATION = eINSTANCE.getSdEquationVariable_Equation();

		/**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.sd.impl.SdModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.sd.impl.SdModelImpl
		 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdModel()
		 * @generated
		 */
		EClass SD_MODEL = eINSTANCE.getSdModel();

		/**
		 * The meta object literal for the '<em><b>Abstract Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_MODEL__ABSTRACT_VARIABLES = eINSTANCE.getSdModel_AbstractVariables();

		/**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.sd.impl.SdAuxVariableImpl <em>Aux Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.sd.impl.SdAuxVariableImpl
		 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdAuxVariable()
		 * @generated
		 */
		EClass SD_AUX_VARIABLE = eINSTANCE.getSdAuxVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.sd.impl.SdStockVariableImpl <em>Stock Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.sd.impl.SdStockVariableImpl
		 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdStockVariable()
		 * @generated
		 */
		EClass SD_STOCK_VARIABLE = eINSTANCE.getSdStockVariable();

		/**
		 * The meta object literal for the '<em><b>Integral</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD_STOCK_VARIABLE__INTEGRAL = eINSTANCE.getSdStockVariable_Integral();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SD_STOCK_VARIABLE__INITIAL_VALUE = eINSTANCE.getSdStockVariable_InitialValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.sd.impl.SdFlowVariableImpl <em>Flow Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.sd.impl.SdFlowVariableImpl
		 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdFlowVariable()
		 * @generated
		 */
		EClass SD_FLOW_VARIABLE = eINSTANCE.getSdFlowVariable();

		/**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.sd.impl.SdConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.sd.impl.SdConnectorImpl
		 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdConnector()
		 * @generated
		 */
		EClass SD_CONNECTOR = eINSTANCE.getSdConnector();

		/**
		 * The meta object literal for the '<em><b>To Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_CONNECTOR__TO_ELEMENT = eINSTANCE.getSdConnector_ToElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.amp.amf.sd.impl.SdGeneratableImpl <em>Generatable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.amp.amf.sd.impl.SdGeneratableImpl
		 * @see org.eclipse.amp.amf.sd.impl.SdPackageImpl#getSdGeneratable()
		 * @generated
		 */
		EClass SD_GENERATABLE = eINSTANCE.getSdGeneratable();

	}

} //SdPackage
