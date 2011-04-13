/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd.impl;

import org.eclipse.amp.amf.sd.SdPackage;
import org.eclipse.amp.amf.sd.SdStockVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stock Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.sd.impl.SdStockVariableImpl#getIntegral <em>Integral</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.sd.impl.SdStockVariableImpl#getInitialValue <em>Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SdStockVariableImpl extends SdAbstractVariableImpl implements SdStockVariable {
	/**
	 * The default value of the '{@link #getIntegral() <em>Integral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegral()
	 * @generated
	 * @ordered
	 */
	protected static final String INTEGRAL_EDEFAULT = "return 0;";

	/**
	 * The cached value of the '{@link #getIntegral() <em>Integral</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegral()
	 * @generated
	 * @ordered
	 */
	protected String integral = INTEGRAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIAL_VALUE_EDEFAULT = "return 0;";

	/**
	 * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected String initialValue = INITIAL_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdStockVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdPackage.Literals.SD_STOCK_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIntegral() {
		return integral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntegral(String newIntegral) {
		String oldIntegral = integral;
		integral = newIntegral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SdPackage.SD_STOCK_VARIABLE__INTEGRAL, oldIntegral, integral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitialValue() {
		return initialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialValue(String newInitialValue) {
		String oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SdPackage.SD_STOCK_VARIABLE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SdPackage.SD_STOCK_VARIABLE__INTEGRAL:
				return getIntegral();
			case SdPackage.SD_STOCK_VARIABLE__INITIAL_VALUE:
				return getInitialValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SdPackage.SD_STOCK_VARIABLE__INTEGRAL:
				setIntegral((String)newValue);
				return;
			case SdPackage.SD_STOCK_VARIABLE__INITIAL_VALUE:
				setInitialValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SdPackage.SD_STOCK_VARIABLE__INTEGRAL:
				setIntegral(INTEGRAL_EDEFAULT);
				return;
			case SdPackage.SD_STOCK_VARIABLE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SdPackage.SD_STOCK_VARIABLE__INTEGRAL:
				return INTEGRAL_EDEFAULT == null ? integral != null : !INTEGRAL_EDEFAULT.equals(integral);
			case SdPackage.SD_STOCK_VARIABLE__INITIAL_VALUE:
				return INITIAL_VALUE_EDEFAULT == null ? initialValue != null : !INITIAL_VALUE_EDEFAULT.equals(initialValue);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (integral: ");
		result.append(integral);
		result.append(", initialValue: ");
		result.append(initialValue);
		result.append(')');
		return result.toString();
	}

} //SdStockVariableImpl
