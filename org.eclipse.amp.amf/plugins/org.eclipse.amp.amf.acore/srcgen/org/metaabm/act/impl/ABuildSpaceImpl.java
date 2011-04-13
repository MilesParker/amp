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
import org.metaabm.act.ABuildSpace;
import org.metaabm.act.ABuildSpaceTypes;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>ABuild
 * Space</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link
 * org.metaabm.act.impl.ABuildSpaceImpl#getSpaceType <em>Space Type</em>}</li>
 * </ul> </p>
 * @generated
 */
public class ABuildSpaceImpl extends ABuildProjectionImpl implements ABuildSpace {
	/**
	 * The default value of the '{@link #getSpaceType() <em>Space Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSpaceType()
	 * @generated
	 * @ordered
	 */
	protected static final ABuildSpaceTypes SPACE_TYPE_EDEFAULT = ABuildSpaceTypes.RANDOM;

	/**
	 * The cached value of the '{@link #getSpaceType() <em>Space Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSpaceType()
	 * @generated
	 * @ordered
	 */
	protected ABuildSpaceTypes spaceType = SPACE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ABuildSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ABUILD_SPACE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ABuildSpaceTypes getSpaceType() {
		return spaceType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceType(ABuildSpaceTypes newSpaceType) {
		ABuildSpaceTypes oldSpaceType = spaceType;
		spaceType = newSpaceType == null ? SPACE_TYPE_EDEFAULT : newSpaceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ABUILD_SPACE__SPACE_TYPE, oldSpaceType, spaceType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ABUILD_SPACE__SPACE_TYPE:
				return getSpaceType();
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
			case MetaABMActPackage.ABUILD_SPACE__SPACE_TYPE:
				setSpaceType((ABuildSpaceTypes) newValue);
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
			case MetaABMActPackage.ABUILD_SPACE__SPACE_TYPE:
				setSpaceType(SPACE_TYPE_EDEFAULT);
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
			case MetaABMActPackage.ABUILD_SPACE__SPACE_TYPE:
				return spaceType != SPACE_TYPE_EDEFAULT;
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
		result.append(" (spaceType: ");
		result.append(spaceType);
		result.append(')');
		return result.toString();
	}

} // ABuildSpaceImpl
