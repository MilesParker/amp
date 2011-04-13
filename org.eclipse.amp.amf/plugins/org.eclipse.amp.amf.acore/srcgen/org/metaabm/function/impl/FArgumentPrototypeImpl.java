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

import org.apache.commons.collections.CollectionUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.metaabm.ITypedArray;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAttributeType;
import org.metaabm.SNamed;
import org.metaabm.function.FArgumentPrototype;
import org.metaabm.function.FFunction;
import org.metaabm.function.FGenericFunction;
import org.metaabm.function.MetaABMFunctionPackage;
import org.metaabm.impl.IIDImpl;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>FArgument Prototype</b></em>'. <!-- end-user-doc --> <p> The following
 * features are implemented: <ul> <li>{@link
 * org.metaabm.function.impl.FArgumentPrototypeImpl#getSType
 * <em>SType</em>}</li> <li>{@link
 * org.metaabm.function.impl.FArgumentPrototypeImpl#getPluralLabel <em>Plural
 * Label</em>}</li> <li>{@link
 * org.metaabm.function.impl.FArgumentPrototypeImpl#getDescription
 * <em>Description</em>}</li> <li>{@link
 * org.metaabm.function.impl.FArgumentPrototypeImpl#getInputFunction <em>Input
 * Function</em>}</li> <li>{@link
 * org.metaabm.function.impl.FArgumentPrototypeImpl#getOutputFunction <em>Output
 * Function</em>}</li> <li>{@link
 * org.metaabm.function.impl.FArgumentPrototypeImpl#isOptional
 * <em>Optional</em>}</li> </ul> </p>
 * @generated
 */
public class FArgumentPrototypeImpl extends IIDImpl implements FArgumentPrototype {
	/**
	 * The default value of the '{@link #getSType() <em>SType</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSType()
	 * @generated
	 * @ordered
	 */
	protected static final SAttributeType STYPE_EDEFAULT = SAttributeType.INTEGER_LITERAL;

	/**
	 * The cached value of the '{@link #getSType() <em>SType</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSType()
	 * @generated
	 * @ordered
	 */
	protected SAttributeType sType = STYPE_EDEFAULT;

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
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FArgumentPrototypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMFunctionPackage.Literals.FARGUMENT_PROTOTYPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttributeType getSType() {
		return sType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSType(SAttributeType newSType) {
		SAttributeType oldSType = sType;
		sType = newSType == null ? STYPE_EDEFAULT : newSType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__STYPE, oldSType, sType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__PLURAL_LABEL, oldPluralLabel, pluralLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FFunction getInputFunction() {
		if (eContainerFeatureID() != MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION)
			return null;
		return (FFunction) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputFunction(FFunction newInputFunction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInputFunction, MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputFunction(FFunction newInputFunction) {
		if (newInputFunction != eInternalContainer() || (eContainerFeatureID() != MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION && newInputFunction != null)) {
			if (EcoreUtil.isAncestor(this, newInputFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInputFunction != null)
				msgs = ((InternalEObject) newInputFunction).eInverseAdd(this, MetaABMFunctionPackage.FFUNCTION__INPUT_PROTOTYPES, FFunction.class, msgs);
			msgs = basicSetInputFunction(newInputFunction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION, newInputFunction, newInputFunction));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FGenericFunction getOutputFunction() {
		if (eContainerFeatureID() != MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION)
			return null;
		return (FGenericFunction) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputFunction(FGenericFunction newOutputFunction, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOutputFunction, MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFunction(FGenericFunction newOutputFunction) {
		if (newOutputFunction != eInternalContainer() || (eContainerFeatureID() != MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION && newOutputFunction != null)) {
			if (EcoreUtil.isAncestor(this, newOutputFunction))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOutputFunction != null)
				msgs = ((InternalEObject) newOutputFunction).eInverseAdd(this, MetaABMFunctionPackage.FGENERIC_FUNCTION__OUTPUT_PROTOTYPES, FGenericFunction.class, msgs);
			msgs = basicSetOutputFunction(newOutputFunction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION, newOutputFunction, newOutputFunction));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInputFunction((FFunction) otherEnd, msgs);
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOutputFunction((FGenericFunction) otherEnd, msgs);
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
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION:
				return basicSetInputFunction(null, msgs);
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION:
				return basicSetOutputFunction(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION:
				return eInternalContainer().eInverseRemove(this, MetaABMFunctionPackage.FFUNCTION__INPUT_PROTOTYPES, FFunction.class, msgs);
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION:
				return eInternalContainer().eInverseRemove(this, MetaABMFunctionPackage.FGENERIC_FUNCTION__OUTPUT_PROTOTYPES, FGenericFunction.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__STYPE:
				return getSType();
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__PLURAL_LABEL:
				return getPluralLabel();
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__DESCRIPTION:
				return getDescription();
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION:
				return getInputFunction();
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION:
				return getOutputFunction();
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OPTIONAL:
				return isOptional();
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
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__STYPE:
				setSType((SAttributeType) newValue);
				return;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__PLURAL_LABEL:
				setPluralLabel((String) newValue);
				return;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__DESCRIPTION:
				setDescription((String) newValue);
				return;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION:
				setInputFunction((FFunction) newValue);
				return;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION:
				setOutputFunction((FGenericFunction) newValue);
				return;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OPTIONAL:
				setOptional((Boolean) newValue);
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
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__STYPE:
				setSType(STYPE_EDEFAULT);
				return;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__PLURAL_LABEL:
				setPluralLabel(PLURAL_LABEL_EDEFAULT);
				return;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION:
				setInputFunction((FFunction) null);
				return;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION:
				setOutputFunction((FGenericFunction) null);
				return;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
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
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__STYPE:
				return sType != STYPE_EDEFAULT;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__PLURAL_LABEL:
				return PLURAL_LABEL_EDEFAULT == null ? pluralLabel != null : !PLURAL_LABEL_EDEFAULT.equals(pluralLabel);
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__INPUT_FUNCTION:
				return getInputFunction() != null;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION:
				return getOutputFunction() != null;
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
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
				case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__PLURAL_LABEL:
					return MetaABMPackage.SNAMED__PLURAL_LABEL;
				case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__DESCRIPTION:
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
					return MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__PLURAL_LABEL;
				case MetaABMPackage.SNAMED__DESCRIPTION:
					return MetaABMFunctionPackage.FARGUMENT_PROTOTYPE__DESCRIPTION;
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
		result.append(" (sType: ");
		result.append(sType);
		result.append(", pluralLabel: ");
		result.append(pluralLabel);
		result.append(", description: ");
		result.append(description);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

	public boolean accepts(IValue value) {
		return !(value instanceof ITypedArray) && CollectionUtils.containsAny(SAttributeType.getAvailableTypes(getSType()), value.getAvailableTypes());
	}
} // FArgumentPrototypeImpl
