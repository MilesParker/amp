/**
 * <copyright>
 * </copyright>
 *
 * $Id: RunSetImpl.java,v 1.3 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.amp.amf.testing.ares.AresPackage;
import org.eclipse.amp.amf.testing.ares.ResultType;
import org.eclipse.amp.amf.testing.ares.Run;
import org.eclipse.amp.amf.testing.ares.RunSet;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunSetImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunSetImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunSetImpl#getFinished <em>Finished</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunSetImpl#getRuns <em>Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunSetImpl extends EObjectImpl implements RunSet {
    /**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
    protected static final ResultType RESULT_EDEFAULT = ResultType.INCOMPLETE;

    /**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
    protected ResultType result = RESULT_EDEFAULT;

    /**
	 * The default value of the '{@link #getStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
    protected static final Date STARTED_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getStarted()
	 * @generated
	 * @ordered
	 */
    protected Date started = STARTED_EDEFAULT;

    /**
	 * The default value of the '{@link #getFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFinished()
	 * @generated
	 * @ordered
	 */
    protected static final Date FINISHED_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFinished()
	 * @generated
	 * @ordered
	 */
    protected Date finished = FINISHED_EDEFAULT;

    /**
	 * The cached value of the '{@link #getRuns() <em>Runs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRuns()
	 * @generated
	 * @ordered
	 */
    protected EList<Run> runs;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RunSetImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AresPackage.Literals.RUN_SET;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ResultType getResult() {
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setResult(ResultType newResult) {
		ResultType oldResult = result;
		result = newResult == null ? RESULT_EDEFAULT : newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.RUN_SET__RESULT, oldResult, result));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Date getStarted() {
		return started;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setStarted(Date newStarted) {
		Date oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.RUN_SET__STARTED, oldStarted, started));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Date getFinished() {
		return finished;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setFinished(Date newFinished) {
		Date oldFinished = finished;
		finished = newFinished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.RUN_SET__FINISHED, oldFinished, finished));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Run> getRuns() {
		if (runs == null) {
			runs = new EObjectContainmentEList<Run>(Run.class, this, AresPackage.RUN_SET__RUNS);
		}
		return runs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AresPackage.RUN_SET__RUNS:
				return ((InternalEList<?>)getRuns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AresPackage.RUN_SET__RESULT:
				return getResult();
			case AresPackage.RUN_SET__STARTED:
				return getStarted();
			case AresPackage.RUN_SET__FINISHED:
				return getFinished();
			case AresPackage.RUN_SET__RUNS:
				return getRuns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AresPackage.RUN_SET__RESULT:
				setResult((ResultType)newValue);
				return;
			case AresPackage.RUN_SET__STARTED:
				setStarted((Date)newValue);
				return;
			case AresPackage.RUN_SET__FINISHED:
				setFinished((Date)newValue);
				return;
			case AresPackage.RUN_SET__RUNS:
				getRuns().clear();
				getRuns().addAll((Collection<? extends Run>)newValue);
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
			case AresPackage.RUN_SET__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case AresPackage.RUN_SET__STARTED:
				setStarted(STARTED_EDEFAULT);
				return;
			case AresPackage.RUN_SET__FINISHED:
				setFinished(FINISHED_EDEFAULT);
				return;
			case AresPackage.RUN_SET__RUNS:
				getRuns().clear();
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
			case AresPackage.RUN_SET__RESULT:
				return result != RESULT_EDEFAULT;
			case AresPackage.RUN_SET__STARTED:
				return STARTED_EDEFAULT == null ? started != null : !STARTED_EDEFAULT.equals(started);
			case AresPackage.RUN_SET__FINISHED:
				return FINISHED_EDEFAULT == null ? finished != null : !FINISHED_EDEFAULT.equals(finished);
			case AresPackage.RUN_SET__RUNS:
				return runs != null && !runs.isEmpty();
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
		result.append(" (result: ");
		result.append(result);
		result.append(", started: ");
		result.append(started);
		result.append(", finished: ");
		result.append(finished);
		result.append(')');
		return result.toString();
	}

} //RunSetImpl
