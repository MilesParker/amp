/**
 * <copyright>
 * </copyright>
 *
 * $Id: RunSet.java,v 1.3 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.RunSet#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.RunSet#getStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.RunSet#getFinished <em>Finished</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.RunSet#getRuns <em>Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRunSet()
 * @model
 * @generated
 */
public interface RunSet extends EObject {
    /**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
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
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRunSet_Result()
	 * @model required="true"
	 * @generated
	 */
    ResultType getResult();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.RunSet#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see org.eclipse.amp.amf.testing.ares.ResultType
	 * @see #getResult()
	 * @generated
	 */
    void setResult(ResultType value);

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
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRunSet_Started()
	 * @model
	 * @generated
	 */
    Date getStarted();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.RunSet#getStarted <em>Started</em>}' attribute.
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
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRunSet_Finished()
	 * @model
	 * @generated
	 */
    Date getFinished();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.RunSet#getFinished <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished</em>' attribute.
	 * @see #getFinished()
	 * @generated
	 */
    void setFinished(Date value);

    /**
	 * Returns the value of the '<em><b>Runs</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amp.amf.testing.ares.Run}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Runs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs</em>' containment reference list.
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getRunSet_Runs()
	 * @model containment="true"
	 * @generated
	 */
    EList<Run> getRuns();

} // RunSet
