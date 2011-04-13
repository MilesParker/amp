/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd.impl;

import java.util.Collection;

import org.eclipse.amp.amf.sd.SdAbstractVariable;
import org.eclipse.amp.amf.sd.SdConnector;
import org.eclipse.amp.amf.sd.SdModel;
import org.eclipse.amp.amf.sd.SdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.sd.impl.SdAbstractVariableImpl#getToElement <em>To Element</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.sd.impl.SdAbstractVariableImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SdAbstractVariableImpl extends SdGeneratableImpl implements SdAbstractVariable {
	/**
	 * The cached value of the '{@link #getToElement() <em>To Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToElement()
	 * @generated
	 * @ordered
	 */
	protected EList<SdConnector> toElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdAbstractVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdPackage.Literals.SD_ABSTRACT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SdConnector> getToElement() {
		if (toElement == null) {
			toElement = new EObjectContainmentEList<SdConnector>(SdConnector.class, this, SdPackage.SD_ABSTRACT_VARIABLE__TO_ELEMENT);
		}
		return toElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SdModel getParent() {
		if (eContainerFeatureID() != SdPackage.SD_ABSTRACT_VARIABLE__PARENT) return null;
		return (SdModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(SdModel newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, SdPackage.SD_ABSTRACT_VARIABLE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SdModel newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != SdPackage.SD_ABSTRACT_VARIABLE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, SdPackage.SD_MODEL__ABSTRACT_VARIABLES, SdModel.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SdPackage.SD_ABSTRACT_VARIABLE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SdPackage.SD_ABSTRACT_VARIABLE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((SdModel)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SdPackage.SD_ABSTRACT_VARIABLE__TO_ELEMENT:
				return ((InternalEList<?>)getToElement()).basicRemove(otherEnd, msgs);
			case SdPackage.SD_ABSTRACT_VARIABLE__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SdPackage.SD_ABSTRACT_VARIABLE__PARENT:
				return eInternalContainer().eInverseRemove(this, SdPackage.SD_MODEL__ABSTRACT_VARIABLES, SdModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SdPackage.SD_ABSTRACT_VARIABLE__TO_ELEMENT:
				return getToElement();
			case SdPackage.SD_ABSTRACT_VARIABLE__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SdPackage.SD_ABSTRACT_VARIABLE__TO_ELEMENT:
				getToElement().clear();
				getToElement().addAll((Collection<? extends SdConnector>)newValue);
				return;
			case SdPackage.SD_ABSTRACT_VARIABLE__PARENT:
				setParent((SdModel)newValue);
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
			case SdPackage.SD_ABSTRACT_VARIABLE__TO_ELEMENT:
				getToElement().clear();
				return;
			case SdPackage.SD_ABSTRACT_VARIABLE__PARENT:
				setParent((SdModel)null);
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
			case SdPackage.SD_ABSTRACT_VARIABLE__TO_ELEMENT:
				return toElement != null && !toElement.isEmpty();
			case SdPackage.SD_ABSTRACT_VARIABLE__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

} //SdAbstractVariableImpl
