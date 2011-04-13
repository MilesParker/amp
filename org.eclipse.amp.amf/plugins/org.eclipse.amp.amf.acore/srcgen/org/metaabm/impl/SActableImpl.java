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
package org.metaabm.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metaabm.IAct;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.SActable;
import org.metaabm.act.AAct;
import org.metaabm.act.AGroup;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SActable</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SActableImpl#getRootActivity <em>Root Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SActableImpl extends SAttributedImpl implements SActable {
	/**
	 * The cached value of the '{@link #getRootActivity() <em>Root Activity</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRootActivity()
	 * @generated
	 * @ordered
	 */
	protected IAct rootActivity;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SActableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SACTABLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IAct getRootActivity() {
		return rootActivity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootActivity(IAct newRootActivity, NotificationChain msgs) {
		IAct oldRootActivity = rootActivity;
		rootActivity = newRootActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaABMPackage.SACTABLE__ROOT_ACTIVITY, oldRootActivity, newRootActivity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootActivity(IAct newRootActivity) {
		if (newRootActivity != rootActivity) {
			NotificationChain msgs = null;
			if (rootActivity != null)
				msgs = ((InternalEObject) rootActivity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaABMPackage.SACTABLE__ROOT_ACTIVITY, null, msgs);
			if (newRootActivity != null)
				msgs = ((InternalEObject) newRootActivity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaABMPackage.SACTABLE__ROOT_ACTIVITY, null, msgs);
			msgs = basicSetRootActivity(newRootActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SACTABLE__ROOT_ACTIVITY, newRootActivity, newRootActivity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SACTABLE__ROOT_ACTIVITY:
				return basicSetRootActivity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMPackage.SACTABLE__ROOT_ACTIVITY:
				return getRootActivity();
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
			case MetaABMPackage.SACTABLE__ROOT_ACTIVITY:
				setRootActivity((IAct) newValue);
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
			case MetaABMPackage.SACTABLE__ROOT_ACTIVITY:
				setRootActivity((IAct) null);
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
			case MetaABMPackage.SACTABLE__ROOT_ACTIVITY:
				return rootActivity != null;
		}
		return super.eIsSet(featureID);
	}

	public boolean references(IValue value) {
		if ((AGroup) getRootActivity() != null) {
			for (AAct act : ((AGroup) getRootActivity()).getMembers()) {
				if (act.references(value)) {
					return true;
				}
			}
		}
		return false;
	}
} // SActableImpl
