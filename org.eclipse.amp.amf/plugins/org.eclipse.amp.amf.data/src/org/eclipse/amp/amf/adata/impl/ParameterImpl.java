/**
 * <copyright>
 * </copyright>
 *
 * $Id: ParameterImpl.java,v 1.1 2010/02/13 03:59:10 mparker Exp $
 */
package org.eclipse.amp.amf.adata.impl;

import java.util.Collection;
import org.eclipse.amp.amf.abase.aBase.Value;

import org.eclipse.amp.amf.adata.DataPackage;
import org.eclipse.amp.amf.adata.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.metaabm.SAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.ParameterImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.ParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends EObjectImpl implements Parameter {
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
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataPackage.Literals.PARAMETER;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PARAMETER__ATTRIBUTE, oldAttribute, attribute));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.PARAMETER__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DataPackage.PARAMETER__ATTRIBUTE:
                return getAttribute();
            case DataPackage.PARAMETER__VALUE:
                return getValue();
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
            case DataPackage.PARAMETER__ATTRIBUTE:
                setAttribute((String)newValue);
                return;
            case DataPackage.PARAMETER__VALUE:
                setValue((String)newValue);
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
            case DataPackage.PARAMETER__ATTRIBUTE:
                setAttribute(ATTRIBUTE_EDEFAULT);
                return;
            case DataPackage.PARAMETER__VALUE:
                setValue(VALUE_EDEFAULT);
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
            case DataPackage.PARAMETER__ATTRIBUTE:
                return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
            case DataPackage.PARAMETER__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
        result.append(" (attribute: ");
        result.append(attribute);
        result.append(", value: ");
        result.append(value);
        result.append(')');
        return result.toString();
    }

} //ParameterImpl
