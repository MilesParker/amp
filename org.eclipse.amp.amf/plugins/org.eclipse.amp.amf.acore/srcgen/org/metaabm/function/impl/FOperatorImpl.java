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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAttributeType;
import org.metaabm.SNamed;
import org.metaabm.function.FOperator;
import org.metaabm.function.MetaABMFunctionPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>FOperator</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link
 * org.metaabm.function.impl.FOperatorImpl#getPluralLabel <em>Plural
 * Label</em>}</li> <li>{@link
 * org.metaabm.function.impl.FOperatorImpl#getDescription
 * <em>Description</em>}</li> <li>{@link
 * org.metaabm.function.impl.FOperatorImpl#getSymbol <em>Symbol</em>}</li>
 * <li>{@link org.metaabm.function.impl.FOperatorImpl#getArity
 * <em>Arity</em>}</li> </ul> </p>
 * @generated
 */
public class FOperatorImpl extends FFunctionImpl implements FOperator {
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
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getArity() <em>Arity</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getArity()
	 * @generated
	 * @ordered
	 */
	protected static final int ARITY_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMFunctionPackage.Literals.FOPERATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FOPERATOR__PLURAL_LABEL, oldPluralLabel, pluralLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FOPERATOR__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FOPERATOR__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getArity() {
		return getInputPrototypes().size();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMFunctionPackage.FOPERATOR__PLURAL_LABEL:
				return getPluralLabel();
			case MetaABMFunctionPackage.FOPERATOR__DESCRIPTION:
				return getDescription();
			case MetaABMFunctionPackage.FOPERATOR__SYMBOL:
				return getSymbol();
			case MetaABMFunctionPackage.FOPERATOR__ARITY:
				return getArity();
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
			case MetaABMFunctionPackage.FOPERATOR__PLURAL_LABEL:
				setPluralLabel((String) newValue);
				return;
			case MetaABMFunctionPackage.FOPERATOR__DESCRIPTION:
				setDescription((String) newValue);
				return;
			case MetaABMFunctionPackage.FOPERATOR__SYMBOL:
				setSymbol((String) newValue);
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
			case MetaABMFunctionPackage.FOPERATOR__PLURAL_LABEL:
				setPluralLabel(PLURAL_LABEL_EDEFAULT);
				return;
			case MetaABMFunctionPackage.FOPERATOR__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MetaABMFunctionPackage.FOPERATOR__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
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
			case MetaABMFunctionPackage.FOPERATOR__PLURAL_LABEL:
				return PLURAL_LABEL_EDEFAULT == null ? pluralLabel != null : !PLURAL_LABEL_EDEFAULT.equals(pluralLabel);
			case MetaABMFunctionPackage.FOPERATOR__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MetaABMFunctionPackage.FOPERATOR__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case MetaABMFunctionPackage.FOPERATOR__ARITY:
				return getArity() != ARITY_EDEFAULT;
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
				case MetaABMFunctionPackage.FOPERATOR__PLURAL_LABEL:
					return MetaABMPackage.SNAMED__PLURAL_LABEL;
				case MetaABMFunctionPackage.FOPERATOR__DESCRIPTION:
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
					return MetaABMFunctionPackage.FOPERATOR__PLURAL_LABEL;
				case MetaABMPackage.SNAMED__DESCRIPTION:
					return MetaABMFunctionPackage.FOPERATOR__DESCRIPTION;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SAttributeType> getAvailableTypes() {
		return new EcoreEList.UnmodifiableEList.FastCompare<SAttributeType>(this, MetaABMFunctionPackage.Literals.FFUNCTION__AVAILABLE_TYPES, SAttributeType.NUMERIC_ACCEPTS.size(), SAttributeType.NUMERIC_ACCEPTS.toArray());
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
		result.append(", symbol: ");
		result.append(symbol);
		result.append(')');
		return result.toString();
	}
} // FOperatorImpl
