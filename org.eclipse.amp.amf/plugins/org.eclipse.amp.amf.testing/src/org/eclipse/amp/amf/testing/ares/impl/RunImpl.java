/**
 * <copyright>
 * </copyright>
 *
 * $Id: RunImpl.java,v 1.4 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.amp.amf.parameters.aPar.SingleParameter;
import org.eclipse.amp.amf.parameters.aPar.Parameter;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.aTest.Model;
import org.eclipse.amp.amf.testing.ares.AresPackage;
import org.eclipse.amp.amf.testing.ares.ConstraintTest;
import org.eclipse.amp.amf.testing.ares.ResultType;
import org.eclipse.amp.amf.testing.ares.Run;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.SContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl#getParameterization <em>Parameterization</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl#getFinished <em>Finished</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.testing.ares.impl.RunImpl#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunImpl extends EObjectImpl implements Run {
    /**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
    protected SContext model;

    /**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
    protected Model test;

    /**
	 * The cached value of the '{@link #getParameterization() <em>Parameterization</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParameterization()
	 * @generated
	 * @ordered
	 */
    protected org.eclipse.amp.amf.parameters.aPar.Model parameterization;

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
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
    protected EList<SingleParameter> parameters;

    /**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
    protected EList<Constraint> constraints;

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
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
    protected EList<ConstraintTest> results;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RunImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return AresPackage.Literals.RUN;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SContext getModel() {
		if (model != null && model.eIsProxy()) {
			InternalEObject oldModel = (InternalEObject)model;
			model = (SContext)eResolveProxy(oldModel);
			if (model != oldModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AresPackage.RUN__MODEL, oldModel, model));
			}
		}
		return model;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SContext basicGetModel() {
		return model;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setModel(SContext newModel) {
		SContext oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.RUN__MODEL, oldModel, model));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Model getTest() {
		if (test != null && test.eIsProxy()) {
			InternalEObject oldTest = (InternalEObject)test;
			test = (Model)eResolveProxy(oldTest);
			if (test != oldTest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AresPackage.RUN__TEST, oldTest, test));
			}
		}
		return test;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Model basicGetTest() {
		return test;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTest(Model newTest) {
		Model oldTest = test;
		test = newTest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.RUN__TEST, oldTest, test));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public org.eclipse.amp.amf.parameters.aPar.Model getParameterization() {
		if (parameterization != null && parameterization.eIsProxy()) {
			InternalEObject oldParameterization = (InternalEObject)parameterization;
			parameterization = (org.eclipse.amp.amf.parameters.aPar.Model)eResolveProxy(oldParameterization);
			if (parameterization != oldParameterization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AresPackage.RUN__PARAMETERIZATION, oldParameterization, parameterization));
			}
		}
		return parameterization;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public org.eclipse.amp.amf.parameters.aPar.Model basicGetParameterization() {
		return parameterization;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setParameterization(org.eclipse.amp.amf.parameters.aPar.Model newParameterization) {
		org.eclipse.amp.amf.parameters.aPar.Model oldParameterization = parameterization;
		parameterization = newParameterization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.RUN__PARAMETERIZATION, oldParameterization, parameterization));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.RUN__RESULT, oldResult, result));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<SingleParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<SingleParameter>(SingleParameter.class, this, AresPackage.RUN__PARAMETERS);
		}
		return parameters;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Constraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<Constraint>(Constraint.class, this, AresPackage.RUN__CONSTRAINTS);
		}
		return constraints;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.RUN__STARTED, oldStarted, started));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AresPackage.RUN__FINISHED, oldFinished, finished));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ConstraintTest> getResults() {
		if (results == null) {
			results = new EObjectContainmentEList<ConstraintTest>(ConstraintTest.class, this, AresPackage.RUN__RESULTS);
		}
		return results;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AresPackage.RUN__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case AresPackage.RUN__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case AresPackage.RUN__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
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
			case AresPackage.RUN__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case AresPackage.RUN__TEST:
				if (resolve) return getTest();
				return basicGetTest();
			case AresPackage.RUN__PARAMETERIZATION:
				if (resolve) return getParameterization();
				return basicGetParameterization();
			case AresPackage.RUN__RESULT:
				return getResult();
			case AresPackage.RUN__PARAMETERS:
				return getParameters();
			case AresPackage.RUN__CONSTRAINTS:
				return getConstraints();
			case AresPackage.RUN__STARTED:
				return getStarted();
			case AresPackage.RUN__FINISHED:
				return getFinished();
			case AresPackage.RUN__RESULTS:
				return getResults();
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
			case AresPackage.RUN__MODEL:
				setModel((SContext)newValue);
				return;
			case AresPackage.RUN__TEST:
				setTest((Model)newValue);
				return;
			case AresPackage.RUN__PARAMETERIZATION:
				setParameterization((org.eclipse.amp.amf.parameters.aPar.Model)newValue);
				return;
			case AresPackage.RUN__RESULT:
				setResult((ResultType)newValue);
				return;
			case AresPackage.RUN__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SingleParameter>)newValue);
				return;
			case AresPackage.RUN__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends Constraint>)newValue);
				return;
			case AresPackage.RUN__STARTED:
				setStarted((Date)newValue);
				return;
			case AresPackage.RUN__FINISHED:
				setFinished((Date)newValue);
				return;
			case AresPackage.RUN__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends ConstraintTest>)newValue);
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
			case AresPackage.RUN__MODEL:
				setModel((SContext)null);
				return;
			case AresPackage.RUN__TEST:
				setTest((Model)null);
				return;
			case AresPackage.RUN__PARAMETERIZATION:
				setParameterization((org.eclipse.amp.amf.parameters.aPar.Model)null);
				return;
			case AresPackage.RUN__RESULT:
				setResult(RESULT_EDEFAULT);
				return;
			case AresPackage.RUN__PARAMETERS:
				getParameters().clear();
				return;
			case AresPackage.RUN__CONSTRAINTS:
				getConstraints().clear();
				return;
			case AresPackage.RUN__STARTED:
				setStarted(STARTED_EDEFAULT);
				return;
			case AresPackage.RUN__FINISHED:
				setFinished(FINISHED_EDEFAULT);
				return;
			case AresPackage.RUN__RESULTS:
				getResults().clear();
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
			case AresPackage.RUN__MODEL:
				return model != null;
			case AresPackage.RUN__TEST:
				return test != null;
			case AresPackage.RUN__PARAMETERIZATION:
				return parameterization != null;
			case AresPackage.RUN__RESULT:
				return result != RESULT_EDEFAULT;
			case AresPackage.RUN__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case AresPackage.RUN__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case AresPackage.RUN__STARTED:
				return STARTED_EDEFAULT == null ? started != null : !STARTED_EDEFAULT.equals(started);
			case AresPackage.RUN__FINISHED:
				return FINISHED_EDEFAULT == null ? finished != null : !FINISHED_EDEFAULT.equals(finished);
			case AresPackage.RUN__RESULTS:
				return results != null && !results.isEmpty();
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

} //RunImpl
