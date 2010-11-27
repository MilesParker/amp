/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintTestImpl.java,v 1.2 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares.impl;

import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.ares.AresPackage;
import org.eclipse.amp.amf.testing.ares.ConstraintTest;
import org.eclipse.amp.amf.testing.ares.Issue;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.ConstraintTestImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.ConstraintTestImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.ConstraintTestImpl#getActualValue <em>Actual Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.ConstraintTestImpl#isFailure <em>Failure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintTestImpl extends EObjectImpl implements ConstraintTest {
    /**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
    protected Constraint constraint;

    /**
	 * The default value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
    protected static final Issue ISSUE_EDEFAULT = Issue.BELOW_RANGE;

    /**
	 * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getIssue()
	 * @generated
	 * @ordered
	 */
    protected Issue issue = ISSUE_EDEFAULT;

    /**
	 * The default value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
    protected static final double ACTUAL_VALUE_EDEFAULT = 0.0;

    /**
	 * The cached value of the '{@link #getActualValue() <em>Actual Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getActualValue()
	 * @generated
	 * @ordered
	 */
    protected double actualValue = ACTUAL_VALUE_EDEFAULT;

    /**
	 * The default value of the '{@link #isFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #isFailure()
	 * @generated
	 * @ordered
	 */
    protected static final boolean FAILURE_EDEFAULT = false;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ConstraintTestImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AresPackage.Literals.CONSTRAINT_TEST;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint getConstraint() {
		if (constraint != null && constraint.eIsProxy()) {
			InternalEObject oldConstraint = (InternalEObject)constraint;
			constraint = (Constraint)eResolveProxy(oldConstraint);
			if (constraint != oldConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AresPackage.CONSTRAINT_TEST__CONSTRAINT, oldConstraint, constraint));
			}
		}
		return constraint;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Constraint basicGetConstraint() {
		return constraint;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setConstraint(Constraint newConstraint) {
		Constraint oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.CONSTRAINT_TEST__CONSTRAINT, oldConstraint, constraint));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Issue getIssue() {
		return issue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setIssue(Issue newIssue) {
		Issue oldIssue = issue;
		issue = newIssue == null ? ISSUE_EDEFAULT : newIssue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.CONSTRAINT_TEST__ISSUE, oldIssue, issue));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public double getActualValue() {
		return actualValue;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setActualValue(double newActualValue) {
		double oldActualValue = actualValue;
		actualValue = newActualValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.CONSTRAINT_TEST__ACTUAL_VALUE, oldActualValue, actualValue));
	}

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public boolean isFailure() {
        return getIssue() != Issue.NONE;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AresPackage.CONSTRAINT_TEST__CONSTRAINT:
				if (resolve) return getConstraint();
				return basicGetConstraint();
			case AresPackage.CONSTRAINT_TEST__ISSUE:
				return getIssue();
			case AresPackage.CONSTRAINT_TEST__ACTUAL_VALUE:
				return getActualValue();
			case AresPackage.CONSTRAINT_TEST__FAILURE:
				return isFailure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AresPackage.CONSTRAINT_TEST__CONSTRAINT:
				setConstraint((Constraint)newValue);
				return;
			case AresPackage.CONSTRAINT_TEST__ISSUE:
				setIssue((Issue)newValue);
				return;
			case AresPackage.CONSTRAINT_TEST__ACTUAL_VALUE:
				setActualValue((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case AresPackage.CONSTRAINT_TEST__CONSTRAINT:
				setConstraint((Constraint)null);
				return;
			case AresPackage.CONSTRAINT_TEST__ISSUE:
				setIssue(ISSUE_EDEFAULT);
				return;
			case AresPackage.CONSTRAINT_TEST__ACTUAL_VALUE:
				setActualValue(ACTUAL_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AresPackage.CONSTRAINT_TEST__CONSTRAINT:
				return constraint != null;
			case AresPackage.CONSTRAINT_TEST__ISSUE:
				return issue != ISSUE_EDEFAULT;
			case AresPackage.CONSTRAINT_TEST__ACTUAL_VALUE:
				return actualValue != ACTUAL_VALUE_EDEFAULT;
			case AresPackage.CONSTRAINT_TEST__FAILURE:
				return isFailure() != FAILURE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (issue: ");
		result.append(issue);
		result.append(", actualValue: ");
		result.append(actualValue);
		result.append(')');
		return result.toString();
	}

} //ConstraintTestImpl
