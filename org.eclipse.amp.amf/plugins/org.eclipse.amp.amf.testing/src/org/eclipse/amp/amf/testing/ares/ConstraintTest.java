/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintTest.java,v 1.2 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares;

import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Test</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#isFailure <em>Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getConstraintTest()
 * @model
 * @generated
 */
public interface ConstraintTest extends EObject {
    /**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constraint</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(Constraint)
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getConstraintTest_Constraint()
	 * @model
	 * @generated
	 */
    Constraint getConstraint();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
    void setConstraint(Constraint value);

    /**
	 * Returns the value of the '<em><b>Issue</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amp.amf.testing.ares.Issue}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Issue</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue</em>' attribute.
	 * @see org.eclipse.amp.amf.testing.ares.Issue
	 * @see #setIssue(Issue)
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getConstraintTest_Issue()
	 * @model required="true"
	 * @generated
	 */
    Issue getIssue();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#getIssue <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue</em>' attribute.
	 * @see org.eclipse.amp.amf.testing.ares.Issue
	 * @see #getIssue()
	 * @generated
	 */
    void setIssue(Issue value);

    /**
	 * Returns the value of the '<em><b>Actual Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Actual Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Value</em>' attribute.
	 * @see #setActualValue(double)
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getConstraintTest_ActualValue()
	 * @model required="true"
	 * @generated
	 */
    double getActualValue();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.testing.ares.ConstraintTest#getActualValue <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Value</em>' attribute.
	 * @see #getActualValue()
	 * @generated
	 */
    void setActualValue(double value);

    /**
	 * Returns the value of the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Failure</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' attribute.
	 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getConstraintTest_Failure()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
    boolean isFailure();

} // ConstraintTest
