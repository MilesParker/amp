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

import org.metaabm.IValue;
import org.metaabm.SAgent;
import org.metaabm.SProjection;
import org.metaabm.act.ASelect;
import org.metaabm.act.ASelectTypes;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ASelect</b></em>'. <!-- end-user-doc --> <p> The following features
 * are implemented: <ul> <li>{@link org.metaabm.act.impl.ASelectImpl#getAgent
 * <em>Agent</em>}</li> <li>{@link org.metaabm.act.impl.ASelectImpl#getSpace
 * <em>Space</em>}</li> <li>{@link org.metaabm.act.impl.ASelectImpl#getFor
 * <em>For</em>}</li> </ul> </p>
 * @generated
 */
public class ASelectImpl extends AActImpl implements ASelect {
	/**
	 * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAgent()
	 * @generated
	 * @ordered
	 */
	protected SAgent agent;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected SProjection space;

	/**
	 * The default value of the '{@link #getFor() <em>For</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected static final ASelectTypes FOR_EDEFAULT = ASelectTypes.ONE;

	/**
	 * The cached value of the '{@link #getFor() <em>For</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFor()
	 * @generated
	 * @ordered
	 */
	protected ASelectTypes for_ = FOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ASelectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ASELECT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAgent getAgent() {
		if (agent != null && agent.eIsProxy()) {
			InternalEObject oldAgent = (InternalEObject) agent;
			agent = (SAgent) eResolveProxy(oldAgent);
			if (agent != oldAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.ASELECT__AGENT, oldAgent, agent));
			}
		}
		return agent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAgent basicGetAgent() {
		return agent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(SAgent newAgent) {
		SAgent oldAgent = agent;
		agent = newAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ASELECT__AGENT, oldAgent, agent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SProjection getSpace() {
		if (space != null && space.eIsProxy()) {
			InternalEObject oldSpace = (InternalEObject) space;
			space = (SProjection) eResolveProxy(oldSpace);
			if (space != oldSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.ASELECT__SPACE, oldSpace, space));
			}
		}
		return space;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SProjection basicGetSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(SProjection newSpace) {
		SProjection oldSpace = space;
		space = newSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ASELECT__SPACE, oldSpace, space));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASelectTypes getFor() {
		return for_;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFor(ASelectTypes newFor) {
		ASelectTypes oldFor = for_;
		for_ = newFor == null ? FOR_EDEFAULT : newFor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ASELECT__FOR, oldFor, for_));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ASELECT__AGENT:
				if (resolve)
					return getAgent();
				return basicGetAgent();
			case MetaABMActPackage.ASELECT__SPACE:
				if (resolve)
					return getSpace();
				return basicGetSpace();
			case MetaABMActPackage.ASELECT__FOR:
				return getFor();
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
			case MetaABMActPackage.ASELECT__AGENT:
				setAgent((SAgent) newValue);
				return;
			case MetaABMActPackage.ASELECT__SPACE:
				setSpace((SProjection) newValue);
				return;
			case MetaABMActPackage.ASELECT__FOR:
				setFor((ASelectTypes) newValue);
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
			case MetaABMActPackage.ASELECT__AGENT:
				setAgent((SAgent) null);
				return;
			case MetaABMActPackage.ASELECT__SPACE:
				setSpace((SProjection) null);
				return;
			case MetaABMActPackage.ASELECT__FOR:
				setFor(FOR_EDEFAULT);
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
			case MetaABMActPackage.ASELECT__AGENT:
				return agent != null;
			case MetaABMActPackage.ASELECT__SPACE:
				return space != null;
			case MetaABMActPackage.ASELECT__FOR:
				return for_ != FOR_EDEFAULT;
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
		result.append(" (for: ");
		result.append(for_);
		result.append(')');
		return result.toString();
	}

	public boolean isReachable(IValue value) {
		return super.isReachable(value) || getAgent() != null && getAgent().isReachable(value);
	}
} // ASelectImpl
