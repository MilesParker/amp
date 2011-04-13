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
 * </copyright> $Id: ALoadAgentsImpl.java,v 1.3 2010/06/16 18:01:15 mparker Exp $
 */
package org.metaabm.act.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metaabm.act.ALoadAgents;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>ALoad
 * Agents</b></em>'. <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link
 * org.metaabm.act.impl.ALoadAgentsImpl#getSourceURL <em>Source URL</em>}</li>
 * </ul> </p>
 * @generated
 */
public class ALoadAgentsImpl extends ACreateAgentsImpl implements ALoadAgents {
	/**
	 * The default value of the '{@link #getSourceURL() <em>Source URL</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSourceURL()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceURL() <em>Source URL</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSourceURL()
	 * @generated
	 * @ordered
	 */
	protected String sourceURL = SOURCE_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ALoadAgentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ALOAD_AGENTS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceURL() {
		return sourceURL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceURL(String newSourceURL) {
		String oldSourceURL = sourceURL;
		sourceURL = newSourceURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ALOAD_AGENTS__SOURCE_URL, oldSourceURL, sourceURL));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ALOAD_AGENTS__SOURCE_URL:
				return getSourceURL();
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
			case MetaABMActPackage.ALOAD_AGENTS__SOURCE_URL:
				setSourceURL((String) newValue);
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
			case MetaABMActPackage.ALOAD_AGENTS__SOURCE_URL:
				setSourceURL(SOURCE_URL_EDEFAULT);
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
			case MetaABMActPackage.ALOAD_AGENTS__SOURCE_URL:
				return SOURCE_URL_EDEFAULT == null ? sourceURL != null : !SOURCE_URL_EDEFAULT.equals(sourceURL);
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
		result.append(" (sourceURL: ");
		result.append(sourceURL);
		result.append(')');
		return result.toString();
	}

} // ALoadAgentsImpl
