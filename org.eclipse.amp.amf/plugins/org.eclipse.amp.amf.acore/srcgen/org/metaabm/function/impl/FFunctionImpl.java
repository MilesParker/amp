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
package org.metaabm.function.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.IValue;
import org.metaabm.SAttributeType;
import org.metaabm.function.FArgumentPrototype;
import org.metaabm.function.FFunction;
import org.metaabm.function.FMultiArgumentPrototype;
import org.metaabm.function.MetaABMFunctionPackage;
import org.metaabm.impl.IIDImpl;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>FFunction</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link
 * org.metaabm.function.impl.FFunctionImpl#getAvailableTypes <em>Available
 * Types</em>}</li> <li>{@link
 * org.metaabm.function.impl.FFunctionImpl#getInputPrototypes <em>Input
 * Prototypes</em>}</li> <li>{@link
 * org.metaabm.function.impl.FFunctionImpl#isMultiValue <em>Multi
 * Value</em>}</li> </ul> </p>
 * @generated
 */
public abstract class FFunctionImpl extends IIDImpl implements FFunction {
	/**
	 * The cached value of the '{@link #getInputPrototypes()
	 * <em>Input Prototypes</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInputPrototypes()
	 * @generated
	 * @ordered
	 */
	protected EList<FArgumentPrototype> inputPrototypes;

	/**
	 * The default value of the '{@link #isMultiValue() <em>Multi Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isMultiValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_VALUE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMFunctionPackage.Literals.FFUNCTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAttributeType> getAvailableTypes() {
		// TODO: implement this method to return the 'Available Types' attribute list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FArgumentPrototype> getInputPrototypes() {
		if (inputPrototypes == null) {
			inputPrototypes = new EObjectContainmentWithInverseEList<FArgumentPrototype>(FArgumentPrototype.class, this, MetaABMFunctionPackage.FFUNCTION__INPUT_PROTOTYPES, MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION);
		}
		return inputPrototypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMFunctionPackage.FFUNCTION__INPUT_PROTOTYPES:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputPrototypes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMFunctionPackage.FFUNCTION__INPUT_PROTOTYPES:
				return ((InternalEList<?>) getInputPrototypes()).basicRemove(otherEnd, msgs);
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
			case MetaABMFunctionPackage.FFUNCTION__AVAILABLE_TYPES:
				return getAvailableTypes();
			case MetaABMFunctionPackage.FFUNCTION__INPUT_PROTOTYPES:
				return getInputPrototypes();
			case MetaABMFunctionPackage.FFUNCTION__MULTI_VALUE:
				return isMultiValue();
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
			case MetaABMFunctionPackage.FFUNCTION__AVAILABLE_TYPES:
				getAvailableTypes().clear();
				getAvailableTypes().addAll((Collection<? extends SAttributeType>) newValue);
				return;
			case MetaABMFunctionPackage.FFUNCTION__INPUT_PROTOTYPES:
				getInputPrototypes().clear();
				getInputPrototypes().addAll((Collection<? extends FArgumentPrototype>) newValue);
				return;
			case MetaABMFunctionPackage.FFUNCTION__MULTI_VALUE:
				setMultiValue((Boolean) newValue);
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
			case MetaABMFunctionPackage.FFUNCTION__AVAILABLE_TYPES:
				getAvailableTypes().clear();
				return;
			case MetaABMFunctionPackage.FFUNCTION__INPUT_PROTOTYPES:
				getInputPrototypes().clear();
				return;
			case MetaABMFunctionPackage.FFUNCTION__MULTI_VALUE:
				setMultiValue(MULTI_VALUE_EDEFAULT);
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
			case MetaABMFunctionPackage.FFUNCTION__AVAILABLE_TYPES:
				return !getAvailableTypes().isEmpty();
			case MetaABMFunctionPackage.FFUNCTION__INPUT_PROTOTYPES:
				return inputPrototypes != null && !inputPrototypes.isEmpty();
			case MetaABMFunctionPackage.FFUNCTION__MULTI_VALUE:
				return isMultiValue() != MULTI_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	public boolean accepts(IValue value, int place) {
		return (getInputPrototypes().size() > place) && getInputPrototypes().get(place).accepts(value);
	}

	public boolean isMultiValue() {
		return !getInputPrototypes().isEmpty() && getInputPrototypes().get(0) instanceof FMultiArgumentPrototype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiValue(boolean newMultiValue) {
		// TODO: implement this method to set the 'Multi Value' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}
} // FFunctionImpl
