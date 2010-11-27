/**
 * <copyright>
 * </copyright>
 *
 * $Id: RunImpl.java,v 1.2 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.amp.amf.adata.DataPackage;
import org.eclipse.amp.amf.adata.DataPoint;
import org.eclipse.amp.amf.adata.Measurement;
import org.eclipse.amp.amf.adata.ParameterSet;
import org.eclipse.amp.amf.adata.Parameter;
import org.eclipse.amp.amf.adata.Run;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.FlatEObjectImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.metaabm.SContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.RunImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.RunImpl#getStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.RunImpl#getFinished <em>Finished</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.RunImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.RunImpl#getParameterSets <em>Parameter Sets</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.RunImpl#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RunImpl extends FlatEObjectImpl implements Run {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * The cached value of the '{@link #getParameterSets() <em>Parameter Sets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParameterSets()
	 * @generated
	 * @ordered
	 */
    protected EList<ParameterSet> parameterSets;

    /**
	 * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMeasurements()
	 * @generated
	 * @ordered
	 */
    protected EList<Measurement> measurements;

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
		return DataPackage.Literals.RUN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.RUN__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RUN__MODEL, oldModel, model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RUN__STARTED, oldStarted, started));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RUN__FINISHED, oldFinished, finished));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RUN__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ParameterSet> getParameterSets() {
		if (parameterSets == null) {
			parameterSets = new EObjectContainmentEList<ParameterSet>(ParameterSet.class, this, DataPackage.RUN__PARAMETER_SETS);
		}
		return parameterSets;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Measurement> getMeasurements() {
		if (measurements == null) {
			measurements = new EObjectContainmentWithInverseEList<Measurement>(Measurement.class, this, DataPackage.RUN__MEASUREMENTS, DataPackage.MEASUREMENT__RUN);
		}
		return measurements;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.RUN__MEASUREMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeasurements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.RUN__PARAMETER_SETS:
				return ((InternalEList<?>)getParameterSets()).basicRemove(otherEnd, msgs);
			case DataPackage.RUN__MEASUREMENTS:
				return ((InternalEList<?>)getMeasurements()).basicRemove(otherEnd, msgs);
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
			case DataPackage.RUN__MODEL:
				if (resolve) return getModel();
				return basicGetModel();
			case DataPackage.RUN__STARTED:
				return getStarted();
			case DataPackage.RUN__FINISHED:
				return getFinished();
			case DataPackage.RUN__NAME:
				return getName();
			case DataPackage.RUN__PARAMETER_SETS:
				return getParameterSets();
			case DataPackage.RUN__MEASUREMENTS:
				return getMeasurements();
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
			case DataPackage.RUN__MODEL:
				setModel((SContext)newValue);
				return;
			case DataPackage.RUN__STARTED:
				setStarted((Date)newValue);
				return;
			case DataPackage.RUN__FINISHED:
				setFinished((Date)newValue);
				return;
			case DataPackage.RUN__NAME:
				setName((String)newValue);
				return;
			case DataPackage.RUN__PARAMETER_SETS:
				getParameterSets().clear();
				getParameterSets().addAll((Collection<? extends ParameterSet>)newValue);
				return;
			case DataPackage.RUN__MEASUREMENTS:
				getMeasurements().clear();
				getMeasurements().addAll((Collection<? extends Measurement>)newValue);
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
			case DataPackage.RUN__MODEL:
				setModel((SContext)null);
				return;
			case DataPackage.RUN__STARTED:
				setStarted(STARTED_EDEFAULT);
				return;
			case DataPackage.RUN__FINISHED:
				setFinished(FINISHED_EDEFAULT);
				return;
			case DataPackage.RUN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.RUN__PARAMETER_SETS:
				getParameterSets().clear();
				return;
			case DataPackage.RUN__MEASUREMENTS:
				getMeasurements().clear();
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
			case DataPackage.RUN__MODEL:
				return model != null;
			case DataPackage.RUN__STARTED:
				return STARTED_EDEFAULT == null ? started != null : !STARTED_EDEFAULT.equals(started);
			case DataPackage.RUN__FINISHED:
				return FINISHED_EDEFAULT == null ? finished != null : !FINISHED_EDEFAULT.equals(finished);
			case DataPackage.RUN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.RUN__PARAMETER_SETS:
				return parameterSets != null && !parameterSets.isEmpty();
			case DataPackage.RUN__MEASUREMENTS:
				return measurements != null && !measurements.isEmpty();
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
		result.append(" (started: ");
		result.append(started);
		result.append(", finished: ");
		result.append(finished);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RunImpl
