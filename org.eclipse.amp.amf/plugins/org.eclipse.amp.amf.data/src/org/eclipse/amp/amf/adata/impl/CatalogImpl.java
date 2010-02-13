/**
 * <copyright>
 * </copyright>
 *
 * $Id: CatalogImpl.java,v 1.1 2010/02/13 03:59:09 mparker Exp $
 */
package org.eclipse.amp.amf.adata.impl;

import java.util.Collection;

import org.eclipse.amp.amf.adata.Catalog;
import org.eclipse.amp.amf.adata.DataPackage;
import org.eclipse.amp.amf.adata.DataPoint;
import org.eclipse.amp.amf.adata.Run;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.CatalogImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.CatalogImpl#getRuns <em>Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CatalogImpl extends EObjectImpl implements Catalog {
    /**
     * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEntries()
     * @generated
     * @ordered
     */
    protected EList<DataPoint> entries;

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
    protected CatalogImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataPackage.Literals.CATALOG;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DataPoint> getEntries() {
        if (entries == null) {
            entries = new EObjectContainmentEList<DataPoint>(DataPoint.class, this, DataPackage.CATALOG__ENTRIES);
        }
        return entries;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Run> getRuns() {
        if (runs == null) {
            runs = new EObjectContainmentEList<Run>(Run.class, this, DataPackage.CATALOG__RUNS);
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
            case DataPackage.CATALOG__ENTRIES:
                return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
            case DataPackage.CATALOG__RUNS:
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
            case DataPackage.CATALOG__ENTRIES:
                return getEntries();
            case DataPackage.CATALOG__RUNS:
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
            case DataPackage.CATALOG__ENTRIES:
                getEntries().clear();
                getEntries().addAll((Collection<? extends DataPoint>)newValue);
                return;
            case DataPackage.CATALOG__RUNS:
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
            case DataPackage.CATALOG__ENTRIES:
                getEntries().clear();
                return;
            case DataPackage.CATALOG__RUNS:
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
            case DataPackage.CATALOG__ENTRIES:
                return entries != null && !entries.isEmpty();
            case DataPackage.CATALOG__RUNS:
                return runs != null && !runs.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //CatalogImpl
