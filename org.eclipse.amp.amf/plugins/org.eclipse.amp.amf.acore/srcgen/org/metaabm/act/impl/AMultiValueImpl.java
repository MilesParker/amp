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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.metaabm.IValue;
import org.metaabm.act.AMultiValue;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>AMulti
 * Value</b></em>'. <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link org.metaabm.act.impl.AMultiValueImpl#getValues
 * <em>Values</em>}</li> </ul> </p>
 * @generated
 */
public class AMultiValueImpl extends ALiteralImpl implements AMultiValue {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<IValue> values;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AMultiValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.AMULTI_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IValue> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<IValue>(IValue.class, this, MetaABMActPackage.AMULTI_VALUE__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.AMULTI_VALUE__VALUES:
				return getValues();
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
			case MetaABMActPackage.AMULTI_VALUE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends IValue>) newValue);
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
			case MetaABMActPackage.AMULTI_VALUE__VALUES:
				getValues().clear();
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
			case MetaABMActPackage.AMULTI_VALUE__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public boolean references(IValue value) {
		for (IValue multiValue : getValues()) {
			// assume no nesting
			if (multiValue == value) {
				return true;
			}
		}
		return false;
	}
} // AMultiValueImpl
