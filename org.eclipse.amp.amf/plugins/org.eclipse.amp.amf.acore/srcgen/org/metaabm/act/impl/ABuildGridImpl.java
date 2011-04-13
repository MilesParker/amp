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
import org.metaabm.SAgent;
import org.metaabm.act.ABuildGrid;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>ABuild
 * Grid</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link org.metaabm.act.impl.ABuildGridImpl#getFillAgent
 * <em>Fill Agent</em>}</li> </ul> </p>
 * @generated
 */
public class ABuildGridImpl extends ABuildSpaceImpl implements ABuildGrid {
	/**
	 * The cached value of the '{@link #getFillAgent() <em>Fill Agent</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFillAgent()
	 * @generated
	 * @ordered
	 */
	protected SAgent fillAgent;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ABuildGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ABUILD_GRID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAgent getFillAgent() {
		if (fillAgent != null && fillAgent.eIsProxy()) {
			InternalEObject oldFillAgent = (InternalEObject) fillAgent;
			fillAgent = (SAgent) eResolveProxy(oldFillAgent);
			if (fillAgent != oldFillAgent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.ABUILD_GRID__FILL_AGENT, oldFillAgent, fillAgent));
			}
		}
		return fillAgent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAgent basicGetFillAgent() {
		return fillAgent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFillAgent(SAgent newFillAgent) {
		SAgent oldFillAgent = fillAgent;
		fillAgent = newFillAgent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ABUILD_GRID__FILL_AGENT, oldFillAgent, fillAgent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ABUILD_GRID__FILL_AGENT:
				if (resolve)
					return getFillAgent();
				return basicGetFillAgent();
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
			case MetaABMActPackage.ABUILD_GRID__FILL_AGENT:
				setFillAgent((SAgent) newValue);
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
			case MetaABMActPackage.ABUILD_GRID__FILL_AGENT:
				setFillAgent((SAgent) null);
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
			case MetaABMActPackage.ABUILD_GRID__FILL_AGENT:
				return fillAgent != null;
		}
		return super.eIsSet(featureID);
	}

} // ABuildGridImpl
