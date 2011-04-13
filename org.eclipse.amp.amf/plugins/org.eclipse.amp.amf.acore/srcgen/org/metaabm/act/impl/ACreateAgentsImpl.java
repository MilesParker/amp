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
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ACreate Agents</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link
 * org.metaabm.act.impl.ACreateAgentsImpl#getAgentCount <em>Agent
 * Count</em>}</li> </ul> </p>
 * @generated
 */
public class ACreateAgentsImpl extends ASelectImpl implements ACreateAgents {
	/**
	 * The cached value of the '{@link #getAgentCount() <em>Agent Count</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAgentCount()
	 * @generated
	 * @ordered
	 */
	protected IValue agentCount;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ACreateAgentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ACREATE_AGENTS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IValue getAgentCount() {
		if (agentCount != null && agentCount.eIsProxy()) {
			InternalEObject oldAgentCount = (InternalEObject) agentCount;
			agentCount = (IValue) eResolveProxy(oldAgentCount);
			if (agentCount != oldAgentCount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.ACREATE_AGENTS__AGENT_COUNT, oldAgentCount, agentCount));
			}
		}
		return agentCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IValue basicGetAgentCount() {
		return agentCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentCount(IValue newAgentCount) {
		IValue oldAgentCount = agentCount;
		agentCount = newAgentCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ACREATE_AGENTS__AGENT_COUNT, oldAgentCount, agentCount));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ACREATE_AGENTS__AGENT_COUNT:
				if (resolve)
					return getAgentCount();
				return basicGetAgentCount();
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
			case MetaABMActPackage.ACREATE_AGENTS__AGENT_COUNT:
				setAgentCount((IValue) newValue);
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
			case MetaABMActPackage.ACREATE_AGENTS__AGENT_COUNT:
				setAgentCount((IValue) null);
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
			case MetaABMActPackage.ACREATE_AGENTS__AGENT_COUNT:
				return agentCount != null;
		}
		return super.eIsSet(featureID);
	}

} // ACreateAgentsImpl
