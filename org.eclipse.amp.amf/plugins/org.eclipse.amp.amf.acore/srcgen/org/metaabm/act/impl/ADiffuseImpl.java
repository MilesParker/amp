/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.act.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metaabm.SAttribute;
import org.metaabm.act.ADiffuse;
import org.metaabm.act.MetaABMActPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ADiffuse</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.act.impl.ADiffuseImpl#getDiffused <em>Diffused</em>}</li>
 *   <li>{@link org.metaabm.act.impl.ADiffuseImpl#getDiffusionRate <em>Diffusion Rate</em>}</li>
 *   <li>{@link org.metaabm.act.impl.ADiffuseImpl#getEvaporationRate <em>Evaporation Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ADiffuseImpl extends ASelectImpl implements ADiffuse {
	/**
	 * The cached value of the '{@link #getDiffused() <em>Diffused</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDiffused()
	 * @generated
	 * @ordered
	 */
	protected SAttribute diffused;

	/**
	 * The cached value of the '{@link #getDiffusionRate() <em>Diffusion Rate</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDiffusionRate()
	 * @generated
	 * @ordered
	 */
	protected SAttribute diffusionRate;

	/**
	 * The cached value of the '{@link #getEvaporationRate() <em>Evaporation Rate</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getEvaporationRate()
	 * @generated
	 * @ordered
	 */
	protected SAttribute evaporationRate;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ADiffuseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ADIFFUSE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttribute getDiffused() {
		if (diffused != null && diffused.eIsProxy()) {
			InternalEObject oldDiffused = (InternalEObject) diffused;
			diffused = (SAttribute) eResolveProxy(oldDiffused);
			if (diffused != oldDiffused) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.ADIFFUSE__DIFFUSED, oldDiffused, diffused));
			}
		}
		return diffused;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttribute basicGetDiffused() {
		return diffused;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffused(SAttribute newDiffused) {
		SAttribute oldDiffused = diffused;
		diffused = newDiffused;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ADIFFUSE__DIFFUSED, oldDiffused, diffused));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttribute getDiffusionRate() {
		if (diffusionRate != null && diffusionRate.eIsProxy()) {
			InternalEObject oldDiffusionRate = (InternalEObject) diffusionRate;
			diffusionRate = (SAttribute) eResolveProxy(oldDiffusionRate);
			if (diffusionRate != oldDiffusionRate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.ADIFFUSE__DIFFUSION_RATE, oldDiffusionRate, diffusionRate));
			}
		}
		return diffusionRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttribute basicGetDiffusionRate() {
		return diffusionRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffusionRate(SAttribute newDiffusionRate) {
		SAttribute oldDiffusionRate = diffusionRate;
		diffusionRate = newDiffusionRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ADIFFUSE__DIFFUSION_RATE, oldDiffusionRate, diffusionRate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttribute getEvaporationRate() {
		if (evaporationRate != null && evaporationRate.eIsProxy()) {
			InternalEObject oldEvaporationRate = (InternalEObject) evaporationRate;
			evaporationRate = (SAttribute) eResolveProxy(oldEvaporationRate);
			if (evaporationRate != oldEvaporationRate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.ADIFFUSE__EVAPORATION_RATE, oldEvaporationRate, evaporationRate));
			}
		}
		return evaporationRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttribute basicGetEvaporationRate() {
		return evaporationRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaporationRate(SAttribute newEvaporationRate) {
		SAttribute oldEvaporationRate = evaporationRate;
		evaporationRate = newEvaporationRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ADIFFUSE__EVAPORATION_RATE, oldEvaporationRate, evaporationRate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ADIFFUSE__DIFFUSED:
				if (resolve)
					return getDiffused();
				return basicGetDiffused();
			case MetaABMActPackage.ADIFFUSE__DIFFUSION_RATE:
				if (resolve)
					return getDiffusionRate();
				return basicGetDiffusionRate();
			case MetaABMActPackage.ADIFFUSE__EVAPORATION_RATE:
				if (resolve)
					return getEvaporationRate();
				return basicGetEvaporationRate();
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
			case MetaABMActPackage.ADIFFUSE__DIFFUSED:
				setDiffused((SAttribute) newValue);
				return;
			case MetaABMActPackage.ADIFFUSE__DIFFUSION_RATE:
				setDiffusionRate((SAttribute) newValue);
				return;
			case MetaABMActPackage.ADIFFUSE__EVAPORATION_RATE:
				setEvaporationRate((SAttribute) newValue);
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
			case MetaABMActPackage.ADIFFUSE__DIFFUSED:
				setDiffused((SAttribute) null);
				return;
			case MetaABMActPackage.ADIFFUSE__DIFFUSION_RATE:
				setDiffusionRate((SAttribute) null);
				return;
			case MetaABMActPackage.ADIFFUSE__EVAPORATION_RATE:
				setEvaporationRate((SAttribute) null);
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
			case MetaABMActPackage.ADIFFUSE__DIFFUSED:
				return diffused != null;
			case MetaABMActPackage.ADIFFUSE__DIFFUSION_RATE:
				return diffusionRate != null;
			case MetaABMActPackage.ADIFFUSE__EVAPORATION_RATE:
				return evaporationRate != null;
		}
		return super.eIsSet(featureID);
	}

} // ADiffuseImpl
