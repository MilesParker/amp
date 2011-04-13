/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd.impl;

import org.eclipse.amp.amf.sd.SdAbstractVariable;
import org.eclipse.amp.amf.sd.SdConnector;
import org.eclipse.amp.amf.sd.SdPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.sd.impl.SdConnectorImpl#getToElement <em>To Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SdConnectorImpl extends SdGeneratableImpl implements SdConnector {
	/**
	 * The cached value of the '{@link #getToElement() <em>To Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElement()
	 * @generated
	 * @ordered
	 */
	protected SdAbstractVariable toElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdPackage.Literals.SD_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdAbstractVariable getToElement() {
		if (toElement != null && toElement.eIsProxy()) {
			InternalEObject oldToElement = (InternalEObject)toElement;
			toElement = (SdAbstractVariable)eResolveProxy(oldToElement);
			if (toElement != oldToElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SdPackage.SD_CONNECTOR__TO_ELEMENT, oldToElement, toElement));
			}
		}
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdAbstractVariable basicGetToElement() {
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToElement(SdAbstractVariable newToElement) {
		SdAbstractVariable oldToElement = toElement;
		toElement = newToElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SdPackage.SD_CONNECTOR__TO_ELEMENT, oldToElement, toElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SdPackage.SD_CONNECTOR__TO_ELEMENT:
				if (resolve) return getToElement();
				return basicGetToElement();
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
			case SdPackage.SD_CONNECTOR__TO_ELEMENT:
				setToElement((SdAbstractVariable)newValue);
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
			case SdPackage.SD_CONNECTOR__TO_ELEMENT:
				setToElement((SdAbstractVariable)null);
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
			case SdPackage.SD_CONNECTOR__TO_ELEMENT:
				return toElement != null;
		}
		return super.eIsSet(featureID);
	}

} //SdConnectorImpl
