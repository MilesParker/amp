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
package org.metaabm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.SState;
import org.metaabm.SStateValue;
import org.metaabm.act.AEvaluate;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SState</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SStateImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link org.metaabm.impl.SStateImpl#getDefaultOption <em>Default Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SStateImpl extends SAttributeImpl implements SState {
	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<SStateValue> options;

	/**
	 * The cached value of the '{@link #getDefaultOption() <em>Default Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultOption()
	 * @generated
	 * @ordered
	 */
	protected SStateValue defaultOption;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SSTATE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SStateValue> getOptions() {
		if (options == null) {
			options = new EObjectContainmentWithInverseEList<SStateValue>(SStateValue.class, this, MetaABMPackage.SSTATE__OPTIONS, MetaABMPackage.SSTATE_VALUE__SET);
		}
		return options;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SStateValue getDefaultOption() {
		if (defaultOption != null && defaultOption.eIsProxy()) {
			InternalEObject oldDefaultOption = (InternalEObject) defaultOption;
			defaultOption = (SStateValue) eResolveProxy(oldDefaultOption);
			if (defaultOption != oldDefaultOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMPackage.SSTATE__DEFAULT_OPTION, oldDefaultOption, defaultOption));
			}
		}
		return defaultOption;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SStateValue basicGetDefaultOption() {
		return defaultOption;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultOption(SStateValue newDefaultOption) {
		SStateValue oldDefaultOption = defaultOption;
		defaultOption = newDefaultOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SSTATE__DEFAULT_OPTION, oldDefaultOption, defaultOption));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SSTATE__OPTIONS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getOptions()).basicAdd(otherEnd, msgs);
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
			case MetaABMPackage.SSTATE__OPTIONS:
				return ((InternalEList<?>) getOptions()).basicRemove(otherEnd, msgs);
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
			case MetaABMPackage.SSTATE__OPTIONS:
				return getOptions();
			case MetaABMPackage.SSTATE__DEFAULT_OPTION:
				if (resolve)
					return getDefaultOption();
				return basicGetDefaultOption();
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
			case MetaABMPackage.SSTATE__OPTIONS:
				getOptions().clear();
				getOptions().addAll((Collection<? extends SStateValue>) newValue);
				return;
			case MetaABMPackage.SSTATE__DEFAULT_OPTION:
				setDefaultOption((SStateValue) newValue);
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
			case MetaABMPackage.SSTATE__OPTIONS:
				getOptions().clear();
				return;
			case MetaABMPackage.SSTATE__DEFAULT_OPTION:
				setDefaultOption((SStateValue) null);
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
			case MetaABMPackage.SSTATE__OPTIONS:
				return options != null && !options.isEmpty();
			case MetaABMPackage.SSTATE__DEFAULT_OPTION:
				return defaultOption != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public boolean accepts(IValue value) {
		return getOptions().contains(value) || value instanceof AEvaluate && ((AEvaluate) value).getFunction().getID().equals("randomState") && ((AEvaluate) value).getInputs().size() > 0 && ((AEvaluate) value).getInputs().get(0).getValue() == this;
	}
} // SStateImpl
