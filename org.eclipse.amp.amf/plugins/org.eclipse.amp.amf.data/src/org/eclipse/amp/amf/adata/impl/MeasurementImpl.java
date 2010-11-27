/**
 * <copyright>
 * </copyright>
 *
 * $Id: MeasurementImpl.java,v 1.5 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata.impl;

import java.util.Collection;
import org.eclipse.amp.amf.adata.DataPackage;
import org.eclipse.amp.amf.adata.DataPoint;
import org.eclipse.amp.amf.adata.Measurement;
import org.eclipse.amp.amf.adata.Run;
import org.eclipse.amp.amf.adata.ScaleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.FlatEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.IValue;
import org.metaabm.SAttribute;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.MeasurementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.MeasurementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.MeasurementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.MeasurementImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.impl.MeasurementImpl#getRun <em>Run</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasurementImpl extends FlatEObjectImpl implements Measurement {
    /**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected static final ScaleType TYPE_EDEFAULT = ScaleType.INDIVIDUAL;

    /**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
    protected ScaleType type = TYPE_EDEFAULT;

    /**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
    protected IValue value;

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
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
    protected EList<DataPoint> entries;

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
    public ScaleType getType() {
		return type;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setType(ScaleType newType) {
		ScaleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MEASUREMENT__TYPE, oldType, type));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IValue getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (IValue)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.MEASUREMENT__VALUE, oldValue, value));
			}
		}
		return value;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IValue basicGetValue() {
		return value;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValue(IValue newValue) {
		IValue oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MEASUREMENT__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MEASUREMENT__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<DataPoint> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList<DataPoint>(DataPoint.class, this, DataPackage.MEASUREMENT__ENTRIES, DataPackage.DATA_POINT__MEASUREMENT);
		}
		return entries;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Run getRun() {
		if (eContainerFeatureID() != DataPackage.MEASUREMENT__RUN) return null;
		return (Run)eContainer();
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRun(Run newRun, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRun, DataPackage.MEASUREMENT__RUN, msgs);
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRun(Run newRun) {
		if (newRun != eInternalContainer() || (eContainerFeatureID() != DataPackage.MEASUREMENT__RUN && newRun != null)) {
			if (EcoreUtil.isAncestor(this, newRun))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRun != null)
				msgs = ((InternalEObject)newRun).eInverseAdd(this, DataPackage.RUN__MEASUREMENTS, Run.class, msgs);
			msgs = basicSetRun(newRun, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.MEASUREMENT__RUN, newRun, newRun));
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
			case DataPackage.MEASUREMENT__ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntries()).basicAdd(otherEnd, msgs);
			case DataPackage.MEASUREMENT__RUN:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case DataPackage.MEASUREMENT__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
			case DataPackage.MEASUREMENT__RUN:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case DataPackage.MEASUREMENT__RUN:
				return eInternalContainer().eInverseRemove(this, DataPackage.RUN__MEASUREMENTS, Run.class, msgs);
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
			case DataPackage.MEASUREMENT__TYPE:
				return getType();
			case DataPackage.MEASUREMENT__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case DataPackage.MEASUREMENT__NAME:
				return getName();
			case DataPackage.MEASUREMENT__ENTRIES:
				return getEntries();
			case DataPackage.MEASUREMENT__RUN:
				return getRun();
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
			case DataPackage.MEASUREMENT__TYPE:
				setType((ScaleType)newValue);
				return;
			case DataPackage.MEASUREMENT__VALUE:
				setValue((IValue)newValue);
				return;
			case DataPackage.MEASUREMENT__NAME:
				setName((String)newValue);
				return;
			case DataPackage.MEASUREMENT__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends DataPoint>)newValue);
				return;
			case DataPackage.MEASUREMENT__RUN:
				setRun((Run)newValue);
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
			case DataPackage.MEASUREMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DataPackage.MEASUREMENT__VALUE:
				setValue((IValue)null);
				return;
			case DataPackage.MEASUREMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.MEASUREMENT__ENTRIES:
				getEntries().clear();
				return;
			case DataPackage.MEASUREMENT__RUN:
				setRun((Run)null);
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
			case DataPackage.MEASUREMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case DataPackage.MEASUREMENT__VALUE:
				return value != null;
			case DataPackage.MEASUREMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.MEASUREMENT__ENTRIES:
				return entries != null && !entries.isEmpty();
			case DataPackage.MEASUREMENT__RUN:
				return getRun() != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MeasurementImpl
