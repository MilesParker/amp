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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.function.FFunction;
import org.metaabm.function.FLibrary;
import org.metaabm.function.MetaABMFunctionPackage;
import org.metaabm.impl.SNamedImpl;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>FLibrary</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link
 * org.metaabm.function.impl.FLibraryImpl#getFunctions <em>Functions</em>}</li>
 * <li>{@link org.metaabm.function.impl.FLibraryImpl#getSubs <em>Subs</em>}</li>
 * </ul> </p>
 * @generated
 */
public class FLibraryImpl extends SNamedImpl implements FLibrary {
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<FFunction> functions;

	/**
	 * The cached value of the '{@link #getSubs() <em>Subs</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSubs()
	 * @generated
	 * @ordered
	 */
	protected EList<FLibrary> subs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMFunctionPackage.Literals.FLIBRARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<FFunction>(FFunction.class, this, MetaABMFunctionPackage.FLIBRARY__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FLibrary> getSubs() {
		if (subs == null) {
			subs = new EObjectContainmentEList<FLibrary>(FLibrary.class, this, MetaABMFunctionPackage.FLIBRARY__SUBS);
		}
		return subs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMFunctionPackage.FLIBRARY__FUNCTIONS:
				return ((InternalEList<?>) getFunctions()).basicRemove(otherEnd, msgs);
			case MetaABMFunctionPackage.FLIBRARY__SUBS:
				return ((InternalEList<?>) getSubs()).basicRemove(otherEnd, msgs);
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
			case MetaABMFunctionPackage.FLIBRARY__FUNCTIONS:
				return getFunctions();
			case MetaABMFunctionPackage.FLIBRARY__SUBS:
				return getSubs();
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
			case MetaABMFunctionPackage.FLIBRARY__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends FFunction>) newValue);
				return;
			case MetaABMFunctionPackage.FLIBRARY__SUBS:
				getSubs().clear();
				getSubs().addAll((Collection<? extends FLibrary>) newValue);
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
			case MetaABMFunctionPackage.FLIBRARY__FUNCTIONS:
				getFunctions().clear();
				return;
			case MetaABMFunctionPackage.FLIBRARY__SUBS:
				getSubs().clear();
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
			case MetaABMFunctionPackage.FLIBRARY__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case MetaABMFunctionPackage.FLIBRARY__SUBS:
				return subs != null && !subs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Returns the function with the supplied <i>usage</i> name.
	 */
	public FFunction findFunction(String id) {
		for (FFunction func : getFunctions()) {
			if (func.getID().equals(id)) {
				return func;
			}
		}
		return null;
	}

	/**
	 * Returns the sub library with the supplied <i>usage</i> name.
	 */
	public FLibrary findSub(String id) {
		for (FLibrary lib : getSubs()) {
			if (lib.getID().equals(id)) {
				return lib;
			}
		}
		return null;
	}

} // FLibraryImpl
