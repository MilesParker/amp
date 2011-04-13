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
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metaabm.act.ABuildNetwork;
import org.metaabm.act.ABuildNetworkTypes;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>ABuild
 * Network</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link
 * org.metaabm.act.impl.ABuildNetworkImpl#getNetworkType <em>Network
 * Type</em>}</li> </ul> </p>
 * @generated
 */
public class ABuildNetworkImpl extends ABuildProjectionImpl implements ABuildNetwork {
	/**
	 * The default value of the '{@link #getNetworkType() <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNetworkType()
	 * @generated
	 * @ordered
	 */
	protected static final ABuildNetworkTypes NETWORK_TYPE_EDEFAULT = ABuildNetworkTypes.BARABASI;

	/**
	 * The cached value of the '{@link #getNetworkType() <em>Network Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getNetworkType()
	 * @generated
	 * @ordered
	 */
	protected ABuildNetworkTypes networkType = NETWORK_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ABuildNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ABUILD_NETWORK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ABuildNetworkTypes getNetworkType() {
		return networkType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkType(ABuildNetworkTypes newNetworkType) {
		ABuildNetworkTypes oldNetworkType = networkType;
		networkType = newNetworkType == null ? NETWORK_TYPE_EDEFAULT : newNetworkType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ABUILD_NETWORK__NETWORK_TYPE, oldNetworkType, networkType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ABUILD_NETWORK__NETWORK_TYPE:
				return getNetworkType();
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
			case MetaABMActPackage.ABUILD_NETWORK__NETWORK_TYPE:
				setNetworkType((ABuildNetworkTypes) newValue);
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
			case MetaABMActPackage.ABUILD_NETWORK__NETWORK_TYPE:
				setNetworkType(NETWORK_TYPE_EDEFAULT);
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
			case MetaABMActPackage.ABUILD_NETWORK__NETWORK_TYPE:
				return networkType != NETWORK_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (networkType: ");
		result.append(networkType);
		result.append(')');
		return result.toString();
	}

} // ABuildNetworkImpl
