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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metaabm.MetaABMPackage;
import org.metaabm.SNamed;
import org.metaabm.function.FGeneric;
import org.metaabm.function.MetaABMFunctionPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>FGeneric</b></em>'. <!-- end-user-doc --> <p> The following features
 * are implemented: <ul> <li>{@link
 * org.metaabm.function.impl.FGenericImpl#getPluralLabel <em>Plural
 * Label</em>}</li> <li>{@link
 * org.metaabm.function.impl.FGenericImpl#getDescription
 * <em>Description</em>}</li> </ul> </p>
 * @generated
 */
public abstract class FGenericImpl extends FFunctionImpl implements FGeneric {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FGenericImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMFunctionPackage.Literals.FGENERIC;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FGENERIC__PLURAL_LABEL, oldPluralLabel, pluralLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FGENERIC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMFunctionPackage.FGENERIC__PLURAL_LABEL:
				return getPluralLabel();
			case MetaABMFunctionPackage.FGENERIC__DESCRIPTION:
				return getDescription();
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
			case MetaABMFunctionPackage.FGENERIC__PLURAL_LABEL:
				setPluralLabel((String) newValue);
				return;
			case MetaABMFunctionPackage.FGENERIC__DESCRIPTION:
				setDescription((String) newValue);
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
			case MetaABMFunctionPackage.FGENERIC__PLURAL_LABEL:
				setPluralLabel(PLURAL_LABEL_EDEFAULT);
				return;
			case MetaABMFunctionPackage.FGENERIC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case MetaABMFunctionPackage.FGENERIC__PLURAL_LABEL:
				return PLURAL_LABEL_EDEFAULT == null ? pluralLabel != null : !PLURAL_LABEL_EDEFAULT.equals(pluralLabel);
			case MetaABMFunctionPackage.FGENERIC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
				case MetaABMFunctionPackage.FGENERIC__PLURAL_LABEL:
					return MetaABMPackage.SNAMED__PLURAL_LABEL;
				case MetaABMFunctionPackage.FGENERIC__DESCRIPTION:
					return MetaABMPackage.SNAMED__DESCRIPTION;
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
					return MetaABMFunctionPackage.FGENERIC__PLURAL_LABEL;
				case MetaABMPackage.SNAMED__DESCRIPTION:
					return MetaABMFunctionPackage.FGENERIC__DESCRIPTION;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} // FGenericImpl
