/**
 * <copyright>
 * </copyright>
 *
 * $Id: AresPackageImpl.java,v 1.5 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares.impl;

import org.eclipse.amp.amf.parameters.aPar.AParPackage;
import org.eclipse.amp.amf.testing.aTest.ATestPackage;
import org.eclipse.amp.amf.testing.ares.AresFactory;
import org.eclipse.amp.amf.testing.ares.AresPackage;
import org.eclipse.amp.amf.testing.ares.ConstraintTest;
import org.eclipse.amp.amf.testing.ares.Issue;
import org.eclipse.amp.amf.testing.ares.ResultType;
import org.eclipse.amp.amf.testing.ares.Run;
import org.eclipse.amp.amf.testing.ares.RunSet;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class AresPackageImpl extends EPackageImpl implements AresPackage {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass runEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass constraintTestEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass runSetEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EEnum resultTypeEEnum = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EEnum issueEEnum = null;

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
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
    private AresPackageImpl() {
		super(eNS_URI, AresFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AresPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
    public static AresPackage init() {
		if (isInited) return (AresPackage)EPackage.Registry.INSTANCE.getEPackage(AresPackage.eNS_URI);

		// Obtain or create and register package
		AresPackageImpl theAresPackage = (AresPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AresPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AresPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		AParPackage.eINSTANCE.eClass();
		ATestPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAresPackage.createPackageContents();

		// Initialize created meta-data
		theAresPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAresPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AresPackage.eNS_URI, theAresPackage);
		return theAresPackage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRun() {
		return runEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRun_Model() {
		return (EReference)runEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRun_Test() {
		return (EReference)runEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRun_Parameterization() {
		return (EReference)runEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRun_Result() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRun_Parameters() {
		return (EReference)runEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRun_Constraints() {
		return (EReference)runEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRun_Started() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRun_Finished() {
		return (EAttribute)runEClass.getEStructuralFeatures().get(7);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRun_Results() {
		return (EReference)runEClass.getEStructuralFeatures().get(8);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getConstraintTest() {
		return constraintTestEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getConstraintTest_Constraint() {
		return (EReference)constraintTestEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getConstraintTest_Issue() {
		return (EAttribute)constraintTestEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getConstraintTest_ActualValue() {
		return (EAttribute)constraintTestEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getConstraintTest_Failure() {
		return (EAttribute)constraintTestEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRunSet() {
		return runSetEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRunSet_Result() {
		return (EAttribute)runSetEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRunSet_Started() {
		return (EAttribute)runSetEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getRunSet_Finished() {
		return (EAttribute)runSetEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRunSet_Runs() {
		return (EReference)runSetEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EEnum getResultType() {
		return resultTypeEEnum;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EEnum getIssue() {
		return issueEEnum;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AresFactory getAresFactory() {
		return (AresFactory)getEFactoryInstance();
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
		runEClass = createEClass(RUN);
		createEReference(runEClass, RUN__MODEL);
		createEReference(runEClass, RUN__TEST);
		createEReference(runEClass, RUN__PARAMETERIZATION);
		createEAttribute(runEClass, RUN__RESULT);
		createEReference(runEClass, RUN__PARAMETERS);
		createEReference(runEClass, RUN__CONSTRAINTS);
		createEAttribute(runEClass, RUN__STARTED);
		createEAttribute(runEClass, RUN__FINISHED);
		createEReference(runEClass, RUN__RESULTS);

		constraintTestEClass = createEClass(CONSTRAINT_TEST);
		createEReference(constraintTestEClass, CONSTRAINT_TEST__CONSTRAINT);
		createEAttribute(constraintTestEClass, CONSTRAINT_TEST__ISSUE);
		createEAttribute(constraintTestEClass, CONSTRAINT_TEST__ACTUAL_VALUE);
		createEAttribute(constraintTestEClass, CONSTRAINT_TEST__FAILURE);

		runSetEClass = createEClass(RUN_SET);
		createEAttribute(runSetEClass, RUN_SET__RESULT);
		createEAttribute(runSetEClass, RUN_SET__STARTED);
		createEAttribute(runSetEClass, RUN_SET__FINISHED);
		createEReference(runSetEClass, RUN_SET__RUNS);

		// Create enums
		resultTypeEEnum = createEEnum(RESULT_TYPE);
		issueEEnum = createEEnum(ISSUE);
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
		ATestPackage theATestPackage = (ATestPackage)EPackage.Registry.INSTANCE.getEPackage(ATestPackage.eNS_URI);
		AParPackage theAParPackage = (AParPackage)EPackage.Registry.INSTANCE.getEPackage(AParPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(runEClass, Run.class, "Run", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRun_Model(), theMetaABMPackage.getSContext(), null, "model", null, 1, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRun_Test(), theATestPackage.getModel(), null, "test", null, 1, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRun_Parameterization(), theAParPackage.getModel(), null, "parameterization", null, 1, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_Result(), this.getResultType(), "result", "", 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRun_Parameters(), theAParPackage.getSingleParameter(), null, "parameters", null, 0, -1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRun_Constraints(), theATestPackage.getConstraint(), null, "constraints", null, 0, -1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_Started(), ecorePackage.getEDate(), "started", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRun_Finished(), ecorePackage.getEDate(), "finished", null, 0, 1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRun_Results(), this.getConstraintTest(), null, "results", null, 0, -1, Run.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintTestEClass, ConstraintTest.class, "ConstraintTest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintTest_Constraint(), theATestPackage.getConstraint(), null, "constraint", null, 0, 1, ConstraintTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintTest_Issue(), this.getIssue(), "issue", null, 1, 1, ConstraintTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintTest_ActualValue(), ecorePackage.getEDouble(), "actualValue", null, 1, 1, ConstraintTest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstraintTest_Failure(), ecorePackage.getEBoolean(), "failure", null, 1, 1, ConstraintTest.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(runSetEClass, RunSet.class, "RunSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRunSet_Result(), this.getResultType(), "result", null, 1, 1, RunSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunSet_Started(), ecorePackage.getEDate(), "started", null, 0, 1, RunSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRunSet_Finished(), ecorePackage.getEDate(), "finished", null, 0, 1, RunSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRunSet_Runs(), this.getRun(), null, "runs", null, 0, -1, RunSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(resultTypeEEnum, ResultType.class, "ResultType");
		addEEnumLiteral(resultTypeEEnum, ResultType.INCOMPLETE);
		addEEnumLiteral(resultTypeEEnum, ResultType.SUCCESS);
		addEEnumLiteral(resultTypeEEnum, ResultType.FAILURE);
		addEEnumLiteral(resultTypeEEnum, ResultType.ERROR);

		initEEnum(issueEEnum, Issue.class, "Issue");
		addEEnumLiteral(issueEEnum, Issue.BELOW_RANGE);
		addEEnumLiteral(issueEEnum, Issue.ABOVE_RANGE);
		addEEnumLiteral(issueEEnum, Issue.NONE);
		addEEnumLiteral(issueEEnum, Issue.NOT_FOUND);

		// Create resource
		createResource(eNS_URI);
	}

} //AresPackageImpl
