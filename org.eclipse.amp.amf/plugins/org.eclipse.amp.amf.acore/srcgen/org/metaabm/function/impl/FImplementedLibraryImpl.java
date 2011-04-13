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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.IArtifact;
import org.metaabm.MetaABMPackage;
import org.metaabm.SNamed;
import org.metaabm.function.FFunction;
import org.metaabm.function.FImplementedLibrary;
import org.metaabm.function.FLibrary;
import org.metaabm.function.MetaABMFunctionPackage;
import org.metaabm.impl.SImplementedImpl;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>FImplemented Library</b></em>'. <!-- end-user-doc --> <p> The
 * following features are implemented: <ul> <li>{@link
 * org.metaabm.function.impl.FImplementedLibraryImpl#getPluralLabel <em>Plural
 * Label</em>}</li> <li>{@link
 * org.metaabm.function.impl.FImplementedLibraryImpl#getDescription
 * <em>Description</em>}</li> <li>{@link
 * org.metaabm.function.impl.FImplementedLibraryImpl#getFunctions
 * <em>Functions</em>}</li> <li>{@link
 * org.metaabm.function.impl.FImplementedLibraryImpl#getSubs <em>Subs</em>}</li>
 * </ul> </p>
 * @generated
 */
public class FImplementedLibraryImpl extends SImplementedImpl implements FImplementedLibrary {
	/**
	 * The default value of the '{@link #getPluralLabel() <em>Plural Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPluralLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String PLURAL_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluralLabel() <em>Plural Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPluralLabel()
	 * @generated
	 * @ordered
	 */
	protected String pluralLabel = PLURAL_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	protected FImplementedLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMFunctionPackage.Literals.FIMPLEMENTED_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluralLabel() {
		return pluralLabel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluralLabel(String newPluralLabel) {
		String oldPluralLabel = pluralLabel;
		pluralLabel = newPluralLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__PLURAL_LABEL, oldPluralLabel, pluralLabel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FFunction> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<FFunction>(FFunction.class, this, MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FLibrary> getSubs() {
		if (subs == null) {
			subs = new EObjectContainmentEList<FLibrary>(FLibrary.class, this, MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__SUBS);
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
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__FUNCTIONS:
				return ((InternalEList<?>) getFunctions()).basicRemove(otherEnd, msgs);
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__SUBS:
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
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__PLURAL_LABEL:
				return getPluralLabel();
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__DESCRIPTION:
				return getDescription();
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__FUNCTIONS:
				return getFunctions();
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__SUBS:
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
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__PLURAL_LABEL:
				setPluralLabel((String) newValue);
				return;
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__DESCRIPTION:
				setDescription((String) newValue);
				return;
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends FFunction>) newValue);
				return;
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__SUBS:
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
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__PLURAL_LABEL:
				setPluralLabel(PLURAL_LABEL_EDEFAULT);
				return;
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__FUNCTIONS:
				getFunctions().clear();
				return;
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__SUBS:
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
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__PLURAL_LABEL:
				return PLURAL_LABEL_EDEFAULT == null ? pluralLabel != null : !PLURAL_LABEL_EDEFAULT.equals(pluralLabel);
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__SUBS:
				return subs != null && !subs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SNamed.class) {
			switch (derivedFeatureID) {
				case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__PLURAL_LABEL:
					return MetaABMPackage.SNAMED__PLURAL_LABEL;
				case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__DESCRIPTION:
					return MetaABMPackage.SNAMED__DESCRIPTION;
				default:
					return -1;
			}
		}
		if (baseClass == IArtifact.class) {
			switch (derivedFeatureID) {
				default:
					return -1;
			}
		}
		if (baseClass == FLibrary.class) {
			switch (derivedFeatureID) {
				case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__FUNCTIONS:
					return MetaABMFunctionPackage.FLIBRARY__FUNCTIONS;
				case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__SUBS:
					return MetaABMFunctionPackage.FLIBRARY__SUBS;
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
		if (baseClass == SNamed.class) {
			switch (baseFeatureID) {
				case MetaABMPackage.SNAMED__PLURAL_LABEL:
					return MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__PLURAL_LABEL;
				case MetaABMPackage.SNAMED__DESCRIPTION:
					return MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__DESCRIPTION;
				default:
					return -1;
			}
		}
		if (baseClass == IArtifact.class) {
			switch (baseFeatureID) {
				default:
					return -1;
			}
		}
		if (baseClass == FLibrary.class) {
			switch (baseFeatureID) {
				case MetaABMFunctionPackage.FLIBRARY__FUNCTIONS:
					return MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__FUNCTIONS;
				case MetaABMFunctionPackage.FLIBRARY__SUBS:
					return MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY__SUBS;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (pluralLabel: ");
		result.append(pluralLabel);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // FImplementedLibraryImpl
