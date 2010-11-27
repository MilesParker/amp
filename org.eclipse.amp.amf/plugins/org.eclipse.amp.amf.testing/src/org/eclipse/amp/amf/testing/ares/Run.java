/**
 * <copyright>
 * </copyright>
 *
 * $Id: Run.java,v 1.4 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares;

import java.util.Date;

import org.eclipse.amp.amf.parameters.aPar.SingleParameter;
import org.eclipse.amp.amf.parameters.aPar.Parameter;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.aTest.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.metaabm.SContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getTest <em>Test</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getParameterization <em>Parameterization</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getFinished <em>Finished</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun()
 * @model
 * @generated
 */
public interface Run extends EObject {
    /**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(SContext)
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Model()
	 * @model required="true"
	 * @generated
	 */
    SContext getModel();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.Run#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
    void setModel(SContext value);

    /**
	 * Returns the value of the '<em><b>Test</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' reference.
	 * @see #setTest(Model)
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Test()
	 * @model required="true"
	 * @generated
	 */
    Model getTest();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.Run#getTest <em>Test</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test</em>' reference.
	 * @see #getTest()
	 * @generated
	 */
    void setTest(Model value);

    /**
	 * Returns the value of the '<em><b>Parameterization</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameterization</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameterization</em>' reference.
	 * @see #setParameterization(org.eclipse.amp.amf.parameters.aPar.Model)
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Parameterization()
	 * @model required="true"
	 * @generated
	 */
    org.eclipse.amp.amf.parameters.aPar.Model getParameterization();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.Run#getParameterization <em>Parameterization</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameterization</em>' reference.
	 * @see #getParameterization()
	 * @generated
	 */
    void setParameterization(org.eclipse.amp.amf.parameters.aPar.Model value);

    /**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * The literals are from the enumeration {@link org.eclipse.amp.amf.testing.ares.ResultType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see org.eclipse.amp.amf.testing.ares.ResultType
	 * @see #setResult(ResultType)
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Result()
	 * @model default=""
	 * @generated
	 */
    ResultType getResult();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.Run#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see org.eclipse.amp.amf.testing.ares.ResultType
	 * @see #getResult()
	 * @generated
	 */
    void setResult(ResultType value);

    /**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amp.amf.parameters.aPar.SingleParameter}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Parameters()
	 * @model containment="true"
	 * @generated
	 */
    EList<SingleParameter> getParameters();

    /**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amp.amf.testing.aTest.Constraint}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Constraints()
	 * @model containment="true"
	 * @generated
	 */
    EList<Constraint> getConstraints();

    /**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Started</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(Date)
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Started()
	 * @model
	 * @generated
	 */
    Date getStarted();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.Run#getStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #getStarted()
	 * @generated
	 */
    void setStarted(Date value);

    /**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Finished</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see #setFinished(Date)
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Finished()
	 * @model
	 * @generated
	 */
    Date getFinished();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.Run#getFinished <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished</em>' attribute.
	 * @see #getFinished()
	 * @generated
	 */
    void setFinished(Date value);

    /**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amp.amf.testing.ares.ConstraintTest}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Results()
	 * @model containment="true"
	 * @generated
	 */
    EList<ConstraintTest> getResults();

} // Run
