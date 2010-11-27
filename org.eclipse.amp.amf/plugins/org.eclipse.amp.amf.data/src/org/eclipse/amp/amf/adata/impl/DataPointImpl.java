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
import org.eclipse.emf.ecore.impl.FlatEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
 *   <li>{@link org.eclipse.amp.amf.adata.impl.DataPointImpl#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataPointImpl extends FlatEObjectImpl implements DataPoint {
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
	public Measurement getMeasurement() {
		if (eContainerFeatureID() != DataPackage.DATA_POINT__MEASUREMENT) return null;
		return (Measurement)eContainer();
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMeasurement(Measurement newMeasurement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMeasurement, DataPackage.DATA_POINT__MEASUREMENT, msgs);
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasurement(Measurement newMeasurement) {
		if (newMeasurement != eInternalContainer() || (eContainerFeatureID() != DataPackage.DATA_POINT__MEASUREMENT && newMeasurement != null)) {
			if (EcoreUtil.isAncestor(this, newMeasurement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMeasurement != null)
				msgs = ((InternalEObject)newMeasurement).eInverseAdd(this, DataPackage.MEASUREMENT__ENTRIES, Measurement.class, msgs);
			msgs = basicSetMeasurement(newMeasurement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.DATA_POINT__MEASUREMENT, newMeasurement, newMeasurement));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.DATA_POINT__MEASUREMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMeasurement((Measurement)otherEnd, msgs);
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
			case DataPackage.DATA_POINT__MEASUREMENT:
				return basicSetMeasurement(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DataPackage.DATA_POINT__MEASUREMENT:
				return eInternalContainer().eInverseRemove(this, DataPackage.MEASUREMENT__ENTRIES, Measurement.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case DataPackage.DATA_POINT__MEASUREMENT:
				return getMeasurement();
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
			case DataPackage.DATA_POINT__MEASUREMENT:
				setMeasurement((Measurement)newValue);
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
			case DataPackage.DATA_POINT__MEASUREMENT:
				setMeasurement((Measurement)null);
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
			case DataPackage.DATA_POINT__MEASUREMENT:
				return getMeasurement() != null;
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
