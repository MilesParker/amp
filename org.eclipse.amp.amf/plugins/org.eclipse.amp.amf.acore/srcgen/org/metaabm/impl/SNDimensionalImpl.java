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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metaabm.MetaABMPackage;
import org.metaabm.SBorderRule;
import org.metaabm.SNDimensional;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SN
 * Dimensional</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SNDimensionalImpl#getDimensionality <em>Dimensionality</em>}</li>
 *   <li>{@link org.metaabm.impl.SNDimensionalImpl#getBorderRule <em>Border Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SNDimensionalImpl extends SProjectionImpl implements SNDimensional {
	/**
	 * The default value of the '{@link #getDimensionality() <em>Dimensionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionality()
	 * @generated
	 * @ordered
	 */
	protected static final int DIMENSIONALITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDimensionality() <em>Dimensionality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensionality()
	 * @generated
	 * @ordered
	 */
	protected int dimensionality = DIMENSIONALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderRule() <em>Border Rule</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBorderRule()
	 * @generated
	 * @ordered
	 */
	protected static final SBorderRule BORDER_RULE_EDEFAULT = SBorderRule.STICKY_LITERAL;

	/**
	 * The cached value of the '{@link #getBorderRule() <em>Border Rule</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getBorderRule()
	 * @generated
	 * @ordered
	 */
	protected SBorderRule borderRule = BORDER_RULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SNDimensionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SN_DIMENSIONAL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getDimensionality() {
		return dimensionality;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensionality(int newDimensionality) {
		int oldDimensionality = dimensionality;
		dimensionality = newDimensionality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SN_DIMENSIONAL__DIMENSIONALITY, oldDimensionality, dimensionality));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SBorderRule getBorderRule() {
		return borderRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderRule(SBorderRule newBorderRule) {
		SBorderRule oldBorderRule = borderRule;
		borderRule = newBorderRule == null ? BORDER_RULE_EDEFAULT : newBorderRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SN_DIMENSIONAL__BORDER_RULE, oldBorderRule, borderRule));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMPackage.SN_DIMENSIONAL__DIMENSIONALITY:
				return getDimensionality();
			case MetaABMPackage.SN_DIMENSIONAL__BORDER_RULE:
				return getBorderRule();
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
			case MetaABMPackage.SN_DIMENSIONAL__DIMENSIONALITY:
				setDimensionality((Integer) newValue);
				return;
			case MetaABMPackage.SN_DIMENSIONAL__BORDER_RULE:
				setBorderRule((SBorderRule) newValue);
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
			case MetaABMPackage.SN_DIMENSIONAL__DIMENSIONALITY:
				setDimensionality(DIMENSIONALITY_EDEFAULT);
				return;
			case MetaABMPackage.SN_DIMENSIONAL__BORDER_RULE:
				setBorderRule(BORDER_RULE_EDEFAULT);
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
			case MetaABMPackage.SN_DIMENSIONAL__DIMENSIONALITY:
				return dimensionality != DIMENSIONALITY_EDEFAULT;
			case MetaABMPackage.SN_DIMENSIONAL__BORDER_RULE:
				return borderRule != BORDER_RULE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (dimensionality: ");
		result.append(dimensionality);
		result.append(", borderRule: ");
		result.append(borderRule);
		result.append(')');
		return result.toString();
	}

} // SNDimensionalImpl
