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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metaabm.IValue;
import org.metaabm.SAttributeType;
import org.metaabm.act.ALiteral;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.impl.IIDImpl;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ALiteral</b></em>'. <!-- end-user-doc --> <p> The following features
 * are implemented: <ul> <li>{@link
 * org.metaabm.act.impl.ALiteralImpl#getAccessors <em>Accessors</em>}</li>
 * <li>{@link org.metaabm.act.impl.ALiteralImpl#getAvailableTypes <em>Available
 * Types</em>}</li> <li>{@link org.metaabm.act.impl.ALiteralImpl#getValueLiteral
 * <em>Value Literal</em>}</li> </ul> </p>
 * @generated
 */
public class ALiteralImpl extends IIDImpl implements ALiteral {
	/**
	 * The default value of the '{@link #getValueLiteral() <em>Value Literal</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueLiteral() <em>Value Literal</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String valueLiteral = VALUE_LITERAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ALiteralImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ALITERAL;
	}

	static EList<EObject> EMPTY_LIST = new BasicEList.UnmodifiableEList<EObject>(0, null);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<EObject> getAccessors() {
		return EMPTY_LIST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SAttributeType> getAvailableTypes() {
		return SAttributeType.UNDEFINED_ACCEPTS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueLiteral() {
		return valueLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueLiteral(String newValueLiteral) {
		String oldValueLiteral = valueLiteral;
		valueLiteral = newValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ALITERAL__VALUE_LITERAL, oldValueLiteral, valueLiteral));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ALITERAL__ACCESSORS:
				return getAccessors();
			case MetaABMActPackage.ALITERAL__AVAILABLE_TYPES:
				return getAvailableTypes();
			case MetaABMActPackage.ALITERAL__VALUE_LITERAL:
				return getValueLiteral();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaABMActPackage.ALITERAL__AVAILABLE_TYPES:
				getAvailableTypes().clear();
				getAvailableTypes().addAll((Collection<? extends SAttributeType>) newValue);
				return;
			case MetaABMActPackage.ALITERAL__VALUE_LITERAL:
				setValueLiteral((String) newValue);
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
			case MetaABMActPackage.ALITERAL__AVAILABLE_TYPES:
				getAvailableTypes().clear();
				return;
			case MetaABMActPackage.ALITERAL__VALUE_LITERAL:
				setValueLiteral(VALUE_LITERAL_EDEFAULT);
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
			case MetaABMActPackage.ALITERAL__ACCESSORS:
				return !getAccessors().isEmpty();
			case MetaABMActPackage.ALITERAL__AVAILABLE_TYPES:
				return !getAvailableTypes().isEmpty();
			case MetaABMActPackage.ALITERAL__VALUE_LITERAL:
				return VALUE_LITERAL_EDEFAULT == null ? valueLiteral != null : !VALUE_LITERAL_EDEFAULT.equals(valueLiteral);
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
		result.append(" (valueLiteral: ");
		result.append(valueLiteral);
		result.append(')');
		return result.toString();
	}

	public boolean references(IValue value) {
		return false;
	}
} // ALiteralImpl
