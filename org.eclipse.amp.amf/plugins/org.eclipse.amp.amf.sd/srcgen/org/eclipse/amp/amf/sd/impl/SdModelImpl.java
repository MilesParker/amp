/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.sd.impl;

import java.util.Collection;

import org.eclipse.amp.amf.sd.SdAbstractVariable;
import org.eclipse.amp.amf.sd.SdModel;
import org.eclipse.amp.amf.sd.SdPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.metaabm.IAgentChild;
import org.metaabm.IModelExtension;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.sd.impl.SdModelImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.sd.impl.SdModelImpl#getAbstractVariables <em>Abstract Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SdModelImpl extends SdGeneratableImpl implements SdModel {
	/**
	 * The cached value of the '{@link #getAbstractVariables() <em>Abstract Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<SdAbstractVariable> abstractVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SdModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SdPackage.Literals.SD_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SAgent getParent() {
		if (eContainerFeatureID() != SdPackage.SD_MODEL__PARENT) return null;
		return (SAgent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(SAgent newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, SdPackage.SD_MODEL__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SAgent newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != SdPackage.SD_MODEL__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MetaABMPackage.SAGENT__CHILDREN, SAgent.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SdPackage.SD_MODEL__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SdAbstractVariable> getAbstractVariables() {
		if (abstractVariables == null) {
			abstractVariables = new EObjectContainmentWithInverseEList<SdAbstractVariable>(SdAbstractVariable.class, this, SdPackage.SD_MODEL__ABSTRACT_VARIABLES, SdPackage.SD_ABSTRACT_VARIABLE__PARENT);
		}
		return abstractVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SdPackage.SD_MODEL__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((SAgent)otherEnd, msgs);
			case SdPackage.SD_MODEL__ABSTRACT_VARIABLES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAbstractVariables()).basicAdd(otherEnd, msgs);
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
			case SdPackage.SD_MODEL__PARENT:
				return basicSetParent(null, msgs);
			case SdPackage.SD_MODEL__ABSTRACT_VARIABLES:
				return ((InternalEList<?>)getAbstractVariables()).basicRemove(otherEnd, msgs);
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
			case SdPackage.SD_MODEL__PARENT:
				return eInternalContainer().eInverseRemove(this, MetaABMPackage.SAGENT__CHILDREN, SAgent.class, msgs);
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
			case SdPackage.SD_MODEL__PARENT:
				return getParent();
			case SdPackage.SD_MODEL__ABSTRACT_VARIABLES:
				return getAbstractVariables();
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
			case SdPackage.SD_MODEL__PARENT:
				setParent((SAgent)newValue);
				return;
			case SdPackage.SD_MODEL__ABSTRACT_VARIABLES:
				getAbstractVariables().clear();
				getAbstractVariables().addAll((Collection<? extends SdAbstractVariable>)newValue);
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
			case SdPackage.SD_MODEL__PARENT:
				setParent((SAgent)null);
				return;
			case SdPackage.SD_MODEL__ABSTRACT_VARIABLES:
				getAbstractVariables().clear();
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
			case SdPackage.SD_MODEL__PARENT:
				return getParent() != null;
			case SdPackage.SD_MODEL__ABSTRACT_VARIABLES:
				return abstractVariables != null && !abstractVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IModelExtension.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IAgentChild.class) {
			switch (derivedFeatureID) {
				case SdPackage.SD_MODEL__PARENT: return MetaABMPackage.IAGENT_CHILD__PARENT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == IModelExtension.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == IAgentChild.class) {
			switch (baseFeatureID) {
				case MetaABMPackage.IAGENT_CHILD__PARENT: return SdPackage.SD_MODEL__PARENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SdModelImpl
