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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAttributeType;
import org.metaabm.act.AAct;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.AInput;
import org.metaabm.act.ASet;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.function.FFunction;
import org.metaabm.impl.SAttributeImpl;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ASink</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link org.metaabm.act.impl.ASinkImpl#getAccessors
 * <em>Accessors</em>}</li> <li>{@link
 * org.metaabm.act.impl.ASinkImpl#getAvailableTypes <em>Available
 * Types</em>}</li> <li>{@link org.metaabm.act.impl.ASinkImpl#getInputs
 * <em>Inputs</em>}</li> <li>{@link org.metaabm.act.impl.ASinkImpl#getFunction
 * <em>Function</em>}</li> </ul> </p>
 * @generated
 */
public abstract class ASinkImpl extends AActImpl implements ASink {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<AInput> inputs;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected FFunction function;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ASinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ASINK;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<EObject> getAccessors() {
		EList<EObject> searchObjects = new BasicEList<EObject>();
		for (AAct target : getAllTargets()) {
			if (target instanceof ASink) {
				searchObjects.addAll(((ASink) target).getInputs());
			}
			if (target instanceof ASet || target instanceof ACreateAgents) {
				searchObjects.add(target);
			}
		}
		return SAttributeImpl.collectAccessors(this, searchObjects);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SAttributeType> getAvailableTypes() {
		if (getFunction() != null && !getFunction().getID().equals("item")) {
			return function.getAvailableTypes();
		} else {
			return inputs.size() > 0 && inputs.get(0).getValue() != null ? inputs.get(0).getValue().getAvailableTypes() : SAttributeType.UNDEFINED_ACCEPTS;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AInput> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentWithInverseEList<AInput>(AInput.class, this, MetaABMActPackage.ASINK__INPUTS, MetaABMActPackage.AINPUT__SINK);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FFunction getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject) function;
			function = (FFunction) eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.ASINK__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	public boolean accepts(IValue value, int place) {
		return getFunction() == null || getFunction().accepts(value, place);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FFunction basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(FFunction newFunction) {
		FFunction oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ASINK__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMActPackage.ASINK__INPUTS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getInputs()).basicAdd(otherEnd, msgs);
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
			case MetaABMActPackage.ASINK__INPUTS:
				return ((InternalEList<?>) getInputs()).basicRemove(otherEnd, msgs);
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
			case MetaABMActPackage.ASINK__ACCESSORS:
				return getAccessors();
			case MetaABMActPackage.ASINK__AVAILABLE_TYPES:
				return getAvailableTypes();
			case MetaABMActPackage.ASINK__INPUTS:
				return getInputs();
			case MetaABMActPackage.ASINK__FUNCTION:
				if (resolve)
					return getFunction();
				return basicGetFunction();
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
			case MetaABMActPackage.ASINK__AVAILABLE_TYPES:
				getAvailableTypes().clear();
				getAvailableTypes().addAll((Collection<? extends SAttributeType>) newValue);
				return;
			case MetaABMActPackage.ASINK__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends AInput>) newValue);
				return;
			case MetaABMActPackage.ASINK__FUNCTION:
				setFunction((FFunction) newValue);
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
			case MetaABMActPackage.ASINK__AVAILABLE_TYPES:
				getAvailableTypes().clear();
				return;
			case MetaABMActPackage.ASINK__INPUTS:
				getInputs().clear();
				return;
			case MetaABMActPackage.ASINK__FUNCTION:
				setFunction((FFunction) null);
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
			case MetaABMActPackage.ASINK__ACCESSORS:
				return !getAccessors().isEmpty();
			case MetaABMActPackage.ASINK__AVAILABLE_TYPES:
				return !getAvailableTypes().isEmpty();
			case MetaABMActPackage.ASINK__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case MetaABMActPackage.ASINK__FUNCTION:
				return function != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IValue.class) {
			switch (derivedFeatureID) {
				case MetaABMActPackage.ASINK__ACCESSORS:
					return MetaABMPackage.IVALUE__ACCESSORS;
				case MetaABMActPackage.ASINK__AVAILABLE_TYPES:
					return MetaABMPackage.IVALUE__AVAILABLE_TYPES;
				default:
					return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IValue.class) {
			switch (baseFeatureID) {
				case MetaABMPackage.IVALUE__ACCESSORS:
					return MetaABMActPackage.ASINK__ACCESSORS;
				case MetaABMPackage.IVALUE__AVAILABLE_TYPES:
					return MetaABMActPackage.ASINK__AVAILABLE_TYPES;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	public boolean isMultiValue() {
		return function != null && function.isMultiValue();
	}

	@Override
	public boolean references(IValue value) {
		for (AInput input : getInputs()) {
			if (input.references(value)) {
				return true;
			}
		}
		return false;
	}
} // ASinkImpl
