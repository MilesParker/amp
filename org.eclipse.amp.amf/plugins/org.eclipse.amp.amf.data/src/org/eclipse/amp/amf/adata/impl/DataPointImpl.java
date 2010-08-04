/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataPointImpl.java,v 1.2 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata.impl;

import org.eclipse.amp.amf.adata.DataPackage;
import org.eclipse.amp.amf.adata.DataPoint;
import org.eclipse.amp.amf.adata.Measurement;
import org.eclipse.amp.amf.adata.Run;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.DataPointImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.DataPointImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.DataPointImpl#getRun <em>Run</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.DataPointImpl#getMeasure <em>Measure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPointImpl extends EObjectImpl implements DataPoint {
    /**
     * The default value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
    protected static final long PERIOD_EDEFAULT = 0L;

    /**
     * The cached value of the '{@link #getPeriod() <em>Period</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeriod()
     * @generated
     * @ordered
     */
    protected long period = PERIOD_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final double VALUE_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected double value = VALUE_EDEFAULT;

    /**
     * The cached value of the '{@link #getRun() <em>Run</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRun()
     * @generated
     * @ordered
     */
    protected Run run;

    /**
     * The cached value of the '{@link #getMeasure() <em>Measure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasure()
     * @generated
     * @ordered
     */
    protected Measurement measure;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DataPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataPackage.Literals.DATA_POINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public long getPeriod() {
        return period;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPeriod(long newPeriod) {
        long oldPeriod = period;
        period = newPeriod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_POINT__PERIOD, oldPeriod, period));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(double newValue) {
        double oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_POINT__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Run getRun() {
        if (run != null && run.eIsProxy()) {
            InternalEObject oldRun = (InternalEObject)run;
            run = (Run)eResolveProxy(oldRun);
            if (run != oldRun) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_POINT__RUN, oldRun, run));
            }
        }
        return run;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Run basicGetRun() {
        return run;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRun(Run newRun, NotificationChain msgs) {
        Run oldRun = run;
        run = newRun;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.DATA_POINT__RUN, oldRun, newRun);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRun(Run newRun) {
        if (newRun != run) {
            NotificationChain msgs = null;
            if (run != null)
                msgs = ((InternalEObject)run).eInverseRemove(this, DataPackage.RUN__ENTRIES, Run.class, msgs);
            if (newRun != null)
                msgs = ((InternalEObject)newRun).eInverseAdd(this, DataPackage.RUN__ENTRIES, Run.class, msgs);
            msgs = basicSetRun(newRun, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_POINT__RUN, newRun, newRun));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Measurement getMeasure() {
        if (measure != null && measure.eIsProxy()) {
            InternalEObject oldMeasure = (InternalEObject)measure;
            measure = (Measurement)eResolveProxy(oldMeasure);
            if (measure != oldMeasure) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.DATA_POINT__MEASURE, oldMeasure, measure));
            }
        }
        return measure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Measurement basicGetMeasure() {
        return measure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMeasure(Measurement newMeasure) {
        Measurement oldMeasure = measure;
        measure = newMeasure;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_POINT__MEASURE, oldMeasure, measure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataPackage.DATA_POINT__RUN:
                if (run != null)
                    msgs = ((InternalEObject)run).eInverseRemove(this, DataPackage.RUN__ENTRIES, Run.class, msgs);
                return basicSetRun((Run)otherEnd, msgs);
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
            case DataPackage.DATA_POINT__RUN:
                return basicSetRun(null, msgs);
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
            case DataPackage.DATA_POINT__PERIOD:
                return getPeriod();
            case DataPackage.DATA_POINT__VALUE:
                return getValue();
            case DataPackage.DATA_POINT__RUN:
                if (resolve) return getRun();
                return basicGetRun();
            case DataPackage.DATA_POINT__MEASURE:
                if (resolve) return getMeasure();
                return basicGetMeasure();
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
            case DataPackage.DATA_POINT__PERIOD:
                setPeriod((Long)newValue);
                return;
            case DataPackage.DATA_POINT__VALUE:
                setValue((Double)newValue);
                return;
            case DataPackage.DATA_POINT__RUN:
                setRun((Run)newValue);
                return;
            case DataPackage.DATA_POINT__MEASURE:
                setMeasure((Measurement)newValue);
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
            case DataPackage.DATA_POINT__PERIOD:
                setPeriod(PERIOD_EDEFAULT);
                return;
            case DataPackage.DATA_POINT__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case DataPackage.DATA_POINT__RUN:
                setRun((Run)null);
                return;
            case DataPackage.DATA_POINT__MEASURE:
                setMeasure((Measurement)null);
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
            case DataPackage.DATA_POINT__PERIOD:
                return period != PERIOD_EDEFAULT;
            case DataPackage.DATA_POINT__VALUE:
                return value != VALUE_EDEFAULT;
            case DataPackage.DATA_POINT__RUN:
                return run != null;
            case DataPackage.DATA_POINT__MEASURE:
                return measure != null;
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
        result.append(" (period: ");
        result.append(period);
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //DataPointImpl
