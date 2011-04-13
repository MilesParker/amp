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
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.SAttributeType;
import org.metaabm.function.FArgumentPrototype;
import org.metaabm.function.FGenericFunction;
import org.metaabm.function.MetaABMFunctionPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>FGeneric Function</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link
 * org.metaabm.function.impl.FGenericFunctionImpl#getOutputPrototypes <em>Output
 * Prototypes</em>}</li> </ul> </p>
 * @generated
 */
public class FGenericFunctionImpl extends FGenericImpl implements FGenericFunction {
	/**
	 * The cached value of the '{@link #getOutputPrototypes()
	 * <em>Output Prototypes</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutputPrototypes()
	 * @generated
	 * @ordered
	 */
	protected EList<FArgumentPrototype> outputPrototypes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FGenericFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMFunctionPackage.Literals.FGENERIC_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FArgumentPrototype> getOutputPrototypes() {
		if (outputPrototypes == null) {
			outputPrototypes = new EObjectContainmentWithInverseEList<FArgumentPrototype>(FArgumentPrototype.class, this, MetaABMFunctionPackage.FGENERIC_FUNCTION__OUTPUT_PROTOTYPES, MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION);
		}
		return outputPrototypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMFunctionPackage.FGENERIC_FUNCTION__OUTPUT_PROTOTYPES:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutputPrototypes()).basicAdd(otherEnd, msgs);
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
			case MetaABMFunctionPackage.FGENERIC_FUNCTION__OUTPUT_PROTOTYPES:
				return ((InternalEList<?>) getOutputPrototypes()).basicRemove(otherEnd, msgs);
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
			case MetaABMFunctionPackage.FGENERIC_FUNCTION__OUTPUT_PROTOTYPES:
				return getOutputPrototypes();
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
			case MetaABMFunctionPackage.FGENERIC_FUNCTION__OUTPUT_PROTOTYPES:
				getOutputPrototypes().clear();
				getOutputPrototypes().addAll((Collection<? extends FArgumentPrototype>) newValue);
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
			case MetaABMFunctionPackage.FGENERIC_FUNCTION__OUTPUT_PROTOTYPES:
				getOutputPrototypes().clear();
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
			case MetaABMFunctionPackage.FGENERIC_FUNCTION__OUTPUT_PROTOTYPES:
				return outputPrototypes != null && !outputPrototypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SAttributeType> getAvailableTypes() {
		EList<SAttributeType> types = new UniqueEList<SAttributeType>();
		for (FArgumentPrototype proto : getOutputPrototypes()) {
			types.add(proto.getSType());
		}
		return new EcoreEList.UnmodifiableEList.FastCompare<SAttributeType>(this, MetaABMFunctionPackage.Literals.FFUNCTION__AVAILABLE_TYPES, types.size(), types.toArray());
	}

} // FGenericFunctionImpl
