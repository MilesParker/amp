/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */
package org.metaabm.act.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metaabm.SNetwork;
import org.metaabm.act.ANetwork;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ANetwork</b></em>'. <!-- end-user-doc --> <p> The following features
 * are implemented: <ul> <li>{@link org.metaabm.act.impl.ANetworkImpl#getWithin
 * <em>Within</em>}</li> </ul> </p>
 * @generated
 */
public abstract class ANetworkImpl extends ATransformImpl implements ANetwork {
	/**
	 * The cached value of the '{@link #getWithin() <em>Within</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWithin()
	 * @generated
	 * @ordered
	 */
	protected SNetwork within;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ANetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ANETWORK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SNetwork getWithin() {
		if (within != null && within.eIsProxy()) {
			InternalEObject oldWithin = (InternalEObject) within;
			within = (SNetwork) eResolveProxy(oldWithin);
			if (within != oldWithin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.ANETWORK__WITHIN, oldWithin, within));
			}
		}
		return within;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SNetwork basicGetWithin() {
		return within;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithin(SNetwork newWithin) {
		SNetwork oldWithin = within;
		within = newWithin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ANETWORK__WITHIN, oldWithin, within));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ANETWORK__WITHIN:
				if (resolve)
					return getWithin();
				return basicGetWithin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaABMActPackage.ANETWORK__WITHIN:
				setWithin((SNetwork) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetaABMActPackage.ANETWORK__WITHIN:
				setWithin((SNetwork) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetaABMActPackage.ANETWORK__WITHIN:
				return within != null;
		}
		return super.eIsSet(featureID);
	}

} // ANetworkImpl
