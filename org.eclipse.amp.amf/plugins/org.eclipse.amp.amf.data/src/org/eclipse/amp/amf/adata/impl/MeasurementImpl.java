/**
 * <copyright>
 * </copyright>
 *
 * $Id: MeasurementImpl.java,v 1.1 2010/02/13 03:59:09 mparker Exp $
 */
package org.eclipse.amp.amf.adata.impl;

import org.eclipse.amp.amf.adata.DataPackage;
import org.eclipse.amp.amf.adata.Measurement;
import org.eclipse.amp.amf.adata.ScaleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.metaabm.SAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.MeasurementImpl#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.MeasurementImpl#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementImpl extends EObjectImpl implements Measurement {
    /**
     * The default value of the '{@link #getMeasure() <em>Measure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasure()
     * @generated
     * @ordered
     */
    protected static final ScaleType MEASURE_EDEFAULT = ScaleType.COUNT;

    /**
     * The cached value of the '{@link #getMeasure() <em>Measure</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasure()
     * @generated
     * @ordered
     */
    protected ScaleType measure = MEASURE_EDEFAULT;

    /**
     * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected static final String ATTRIBUTE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttribute()
     * @generated
     * @ordered
     */
    protected String attribute = ATTRIBUTE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MeasurementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataPackage.Literals.MEASUREMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttribute(String newAttribute) {
        String oldAttribute = attribute;
        attribute = newAttribute;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MEASUREMENT__ATTRIBUTE, oldAttribute, attribute));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ScaleType getMeasure() {
        return measure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMeasure(ScaleType newMeasure) {
        ScaleType oldMeasure = measure;
        measure = newMeasure == null ? MEASURE_EDEFAULT : newMeasure;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MEASUREMENT__MEASURE, oldMeasure, measure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DataPackage.MEASUREMENT__MEASURE:
                return getMeasure();
            case DataPackage.MEASUREMENT__ATTRIBUTE:
                return getAttribute();
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
            case DataPackage.MEASUREMENT__MEASURE:
                setMeasure((ScaleType)newValue);
                return;
            case DataPackage.MEASUREMENT__ATTRIBUTE:
                setAttribute((String)newValue);
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
            case DataPackage.MEASUREMENT__MEASURE:
                setMeasure(MEASURE_EDEFAULT);
                return;
            case DataPackage.MEASUREMENT__ATTRIBUTE:
                setAttribute(ATTRIBUTE_EDEFAULT);
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
            case DataPackage.MEASUREMENT__MEASURE:
                return measure != MEASURE_EDEFAULT;
            case DataPackage.MEASUREMENT__ATTRIBUTE:
                return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
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
        result.append(" (measure: ");
        result.append(measure);
        result.append(", attribute: ");
        result.append(attribute);
        result.append(')');
        return result.toString();
    }

} //MeasurementImpl
