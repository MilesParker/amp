/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd.impl;

import org.eclipse.amp.amf.sd.SdEquationVariable;
import org.eclipse.amp.amf.sd.SdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equation Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.sd.impl.SdEquationVariableImpl#getEquation <em>Equation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SdEquationVariableImpl extends SdAbstractVariableImpl implements SdEquationVariable {
	/**
	 * The default value of the '{@link #getEquation() <em>Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquation()
	 * @generated
	 * @ordered
	 */
	protected static final String EQUATION_EDEFAULT = "return 0;";

	/**
	 * The cached value of the '{@link #getEquation() <em>Equation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEquation()
	 * @generated
	 * @ordered
	 */
	protected String equation = EQUATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdEquationVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdPackage.Literals.SD_EQUATION_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEquation() {
		return equation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEquation(String newEquation) {
		String oldEquation = equation;
		equation = newEquation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SdPackage.SD_EQUATION_VARIABLE__EQUATION, oldEquation, equation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SdPackage.SD_EQUATION_VARIABLE__EQUATION:
				return getEquation();
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
			case SdPackage.SD_EQUATION_VARIABLE__EQUATION:
				setEquation((String)newValue);
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
			case SdPackage.SD_EQUATION_VARIABLE__EQUATION:
				setEquation(EQUATION_EDEFAULT);
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
			case SdPackage.SD_EQUATION_VARIABLE__EQUATION:
				return EQUATION_EDEFAULT == null ? equation != null : !EQUATION_EDEFAULT.equals(equation);
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
		result.append(" (equation: ");
		result.append(equation);
		result.append(')');
		return result.toString();
	}

} //SdEquationVariableImpl
