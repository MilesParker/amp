/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd.impl;

import org.eclipse.amp.amf.sd.SdAbstractVariable;
import org.eclipse.amp.amf.sd.SdAuxVariable;
import org.eclipse.amp.amf.sd.SdConnector;
import org.eclipse.amp.amf.sd.SdEquationVariable;
import org.eclipse.amp.amf.sd.SdFactory;
import org.eclipse.amp.amf.sd.SdFlowVariable;
import org.eclipse.amp.amf.sd.SdGeneratable;
import org.eclipse.amp.amf.sd.SdModel;
import org.eclipse.amp.amf.sd.SdNamedElement;
import org.eclipse.amp.amf.sd.SdPackage;
import org.eclipse.amp.amf.sd.SdStockVariable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.metaabm.MetaABMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SdPackageImpl extends EPackageImpl implements SdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdAbstractVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdEquationVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdAuxVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdStockVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdFlowVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdConnectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdGeneratableEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.amp.amf.sd.SdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SdPackageImpl() {
		super(eNS_URI, SdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SdPackage init() {
		if (isInited) return (SdPackage)EPackage.Registry.INSTANCE.getEPackage(SdPackage.eNS_URI);

		// Obtain or create and register package
		SdPackageImpl theSdPackage = (SdPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SdPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MetaABMPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSdPackage.createPackageContents();

		// Initialize created meta-data
		theSdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSdPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SdPackage.eNS_URI, theSdPackage);
		return theSdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSdNamedElement() {
		return sdNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSdNamedElement_Name() {
		return (EAttribute)sdNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSdNamedElement_Comment() {
		return (EAttribute)sdNamedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSdAbstractVariable() {
		return sdAbstractVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSdAbstractVariable_ToElement() {
		return (EReference)sdAbstractVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSdAbstractVariable_Parent() {
		return (EReference)sdAbstractVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSdEquationVariable() {
		return sdEquationVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSdEquationVariable_Equation() {
		return (EAttribute)sdEquationVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSdModel() {
		return sdModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSdModel_AbstractVariables() {
		return (EReference)sdModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSdAuxVariable() {
		return sdAuxVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSdStockVariable() {
		return sdStockVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSdStockVariable_Integral() {
		return (EAttribute)sdStockVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSdStockVariable_InitialValue() {
		return (EAttribute)sdStockVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSdFlowVariable() {
		return sdFlowVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSdConnector() {
		return sdConnectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSdConnector_ToElement() {
		return (EReference)sdConnectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSdGeneratable() {
		return sdGeneratableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdFactory getSdFactory() {
		return (SdFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sdNamedElementEClass = createEClass(SD_NAMED_ELEMENT);
		createEAttribute(sdNamedElementEClass, SD_NAMED_ELEMENT__NAME);
		createEAttribute(sdNamedElementEClass, SD_NAMED_ELEMENT__COMMENT);

		sdAbstractVariableEClass = createEClass(SD_ABSTRACT_VARIABLE);
		createEReference(sdAbstractVariableEClass, SD_ABSTRACT_VARIABLE__TO_ELEMENT);
		createEReference(sdAbstractVariableEClass, SD_ABSTRACT_VARIABLE__PARENT);

		sdEquationVariableEClass = createEClass(SD_EQUATION_VARIABLE);
		createEAttribute(sdEquationVariableEClass, SD_EQUATION_VARIABLE__EQUATION);

		sdModelEClass = createEClass(SD_MODEL);
		createEReference(sdModelEClass, SD_MODEL__ABSTRACT_VARIABLES);

		sdAuxVariableEClass = createEClass(SD_AUX_VARIABLE);

		sdStockVariableEClass = createEClass(SD_STOCK_VARIABLE);
		createEAttribute(sdStockVariableEClass, SD_STOCK_VARIABLE__INTEGRAL);
		createEAttribute(sdStockVariableEClass, SD_STOCK_VARIABLE__INITIAL_VALUE);

		sdFlowVariableEClass = createEClass(SD_FLOW_VARIABLE);

		sdConnectorEClass = createEClass(SD_CONNECTOR);
		createEReference(sdConnectorEClass, SD_CONNECTOR__TO_ELEMENT);

		sdGeneratableEClass = createEClass(SD_GENERATABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MetaABMPackage theMetaABMPackage = (MetaABMPackage)EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sdAbstractVariableEClass.getESuperTypes().add(this.getSdGeneratable());
		sdEquationVariableEClass.getESuperTypes().add(this.getSdAbstractVariable());
		sdModelEClass.getESuperTypes().add(this.getSdGeneratable());
		sdModelEClass.getESuperTypes().add(theMetaABMPackage.getIAgentChild());
		sdAuxVariableEClass.getESuperTypes().add(this.getSdEquationVariable());
		sdStockVariableEClass.getESuperTypes().add(this.getSdAbstractVariable());
		sdFlowVariableEClass.getESuperTypes().add(this.getSdEquationVariable());
		sdConnectorEClass.getESuperTypes().add(this.getSdGeneratable());
		sdGeneratableEClass.getESuperTypes().add(this.getSdNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(sdNamedElementEClass, SdNamedElement.class, "SdNamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSdNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, SdNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSdNamedElement_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, SdNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sdAbstractVariableEClass, SdAbstractVariable.class, "SdAbstractVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSdAbstractVariable_ToElement(), this.getSdConnector(), null, "toElement", null, 0, -1, SdAbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSdAbstractVariable_Parent(), this.getSdModel(), this.getSdModel_AbstractVariables(), "parent", null, 0, 1, SdAbstractVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sdEquationVariableEClass, SdEquationVariable.class, "SdEquationVariable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSdEquationVariable_Equation(), ecorePackage.getEString(), "equation", "return 0;", 1, 1, SdEquationVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sdModelEClass, SdModel.class, "SdModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSdModel_AbstractVariables(), this.getSdAbstractVariable(), this.getSdAbstractVariable_Parent(), "abstractVariables", null, 0, -1, SdModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sdAuxVariableEClass, SdAuxVariable.class, "SdAuxVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sdStockVariableEClass, SdStockVariable.class, "SdStockVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSdStockVariable_Integral(), ecorePackage.getEString(), "integral", "return 0;", 1, 1, SdStockVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSdStockVariable_InitialValue(), ecorePackage.getEString(), "initialValue", "return 0;", 1, 1, SdStockVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sdFlowVariableEClass, SdFlowVariable.class, "SdFlowVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sdConnectorEClass, SdConnector.class, "SdConnector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSdConnector_ToElement(), this.getSdAbstractVariable(), null, "toElement", null, 1, 1, SdConnector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sdGeneratableEClass, SdGeneratable.class, "SdGeneratable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SdPackageImpl
