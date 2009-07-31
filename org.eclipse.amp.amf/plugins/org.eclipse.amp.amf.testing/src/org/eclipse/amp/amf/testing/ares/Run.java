/**
 * <copyright>
 * </copyright>
 *
 * $Id: Run.java,v 1.1 2009/07/31 21:48:19 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares;

import java.util.Date;

import org.eclipse.amp.amf.parameters.aPar.Parameter;

import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.aTest.Model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.metaabm.SContinuousSpace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getTestModel <em>Test Model</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getParameterModel <em>Parameter Model</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.Run#getFinished <em>Finished</em>}</li>
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
     * @see #setModel(SContinuousSpace)
     * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Model()
     * @model required="true"
     * @generated
     */
    SContinuousSpace getModel();

    /**
     * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.Run#getModel <em>Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model</em>' reference.
     * @see #getModel()
     * @generated
     */
    void setModel(SContinuousSpace value);

    /**
     * Returns the value of the '<em><b>Test Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Test Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Test Model</em>' reference.
     * @see #setTestModel(Model)
     * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_TestModel()
     * @model required="true"
     * @generated
     */
    Model getTestModel();

    /**
     * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.Run#getTestModel <em>Test Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Test Model</em>' reference.
     * @see #getTestModel()
     * @generated
     */
    void setTestModel(Model value);

    /**
     * Returns the value of the '<em><b>Parameter Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter Model</em>' reference.
     * @see #setParameterModel(org.eclipse.amp.amf.parameters.aPar.Model)
     * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_ParameterModel()
     * @model
     * @generated
     */
    org.eclipse.amp.amf.parameters.aPar.Model getParameterModel();

    /**
     * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.Run#getParameterModel <em>Parameter Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameter Model</em>' reference.
     * @see #getParameterModel()
     * @generated
     */
    void setParameterModel(org.eclipse.amp.amf.parameters.aPar.Model value);

    /**
     * Returns the value of the '<em><b>Result</b></em>' attribute.
     * The default value is <code>""</code>.
     * The literals are from the enumeration {@link org.eclipse.amp.amf.testing.ares.Result}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Result</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result</em>' attribute.
     * @see org.eclipse.amp.amf.testing.ares.Result
     * @see #setResult(Result)
     * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Result()
     * @model default=""
     * @generated
     */
    Result getResult();

    /**
     * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.Run#getResult <em>Result</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result</em>' attribute.
     * @see org.eclipse.amp.amf.testing.ares.Result
     * @see #getResult()
     * @generated
     */
    void setResult(Result value);

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.amp.amf.parameters.aPar.Parameter}.
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
    EList<Parameter> getParameters();

    /**
     * Returns the value of the '<em><b>Constraints</b></em>' reference list.
     * The list contents are of type {@link org.eclipse.amp.amf.testing.aTest.Constraint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraints</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constraints</em>' reference list.
     * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRun_Constraints()
     * @model
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

} // Run
