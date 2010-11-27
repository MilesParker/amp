/**
 * <copyright>
 * </copyright>
 *
 * $Id: AresFactoryImpl.java,v 1.5 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares.impl;

import org.eclipse.amp.amf.testing.ares.*;
import org.eclipse.amp.amf.testing.ares.AresFactory;
import org.eclipse.amp.amf.testing.ares.AresPackage;
import org.eclipse.amp.amf.testing.ares.ConstraintTest;
import org.eclipse.amp.amf.testing.ares.Issue;
import org.eclipse.amp.amf.testing.ares.ResultType;
import org.eclipse.amp.amf.testing.ares.Run;
import org.eclipse.amp.amf.testing.ares.RunSet;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AresFactoryImpl extends EFactoryImpl implements AresFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static AresFactory init() {
		try {
			AresFactory theAresFactory = (AresFactory)EPackage.Registry.INSTANCE.getEFactory("http://eclipse.org/amp/ares"); 
			if (theAresFactory != null) {
				return theAresFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AresFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AresFactoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AresPackage.RUN: return createRun();
			case AresPackage.CONSTRAINT_TEST: return createConstraintTest();
			case AresPackage.RUN_SET: return createRunSet();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AresPackage.RESULT_TYPE:
				return createResultTypeFromString(eDataType, initialValue);
			case AresPackage.ISSUE:
				return createIssueFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AresPackage.RESULT_TYPE:
				return convertResultTypeToString(eDataType, instanceValue);
			case AresPackage.ISSUE:
				return convertIssueToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Run createRun() {
		RunImpl run = new RunImpl();
		return run;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConstraintTest createConstraintTest() {
		ConstraintTestImpl constraintTest = new ConstraintTestImpl();
		return constraintTest;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RunSet createRunSet() {
		RunSetImpl runSet = new RunSetImpl();
		return runSet;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ResultType createResultTypeFromString(EDataType eDataType, String initialValue) {
		ResultType result = ResultType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertResultTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Issue createIssueFromString(EDataType eDataType, String initialValue) {
		Issue result = Issue.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertIssueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public AresPackage getAresPackage() {
		return (AresPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static AresPackage getPackage() {
		return AresPackage.eINSTANCE;
	}

} //AresFactoryImpl
