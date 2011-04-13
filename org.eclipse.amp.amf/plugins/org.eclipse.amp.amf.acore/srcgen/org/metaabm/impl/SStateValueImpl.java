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

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SAttributeType;
import org.metaabm.SContext;
import org.metaabm.SState;
import org.metaabm.SStateValue;
import org.metaabm.act.AAct;
import org.metaabm.act.AGroup;
import org.metaabm.act.AInput;
import org.metaabm.act.ASet;
import org.metaabm.act.ASink;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SState
 * Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SStateValueImpl#getAccessors <em>Accessors</em>}</li>
 *   <li>{@link org.metaabm.impl.SStateValueImpl#getAvailableTypes <em>Available Types</em>}</li>
 *   <li>{@link org.metaabm.impl.SStateValueImpl#getSet <em>Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SStateValueImpl extends SNamedImpl implements SStateValue {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SStateValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SSTATE_VALUE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<EObject> getAccessors() {
		if (getSet() != null) {
			SAgent parent = (SAgent) getSet().getOwner();
			Collection<SAgent> searchAgents = new HashSet<SAgent>();
			searchAgents.add(parent);
			if (parent instanceof SContext) {
				searchAgents.addAll(((SContext) parent).getAllSubAgents());
			}
			Collection<EObject> accessors = new HashSet<EObject>();
			for (SAgent agent : searchAgents) {
				for (AAct act : ((AGroup) agent.getRootActivity()).getMembers()) {
					if (accesses(act)) {
						accessors.add(act);
					}
				}
			}
			return new EcoreEList.UnmodifiableEList.FastCompare<EObject>(this, MetaABMPackage.Literals.IVALUE__ACCESSORS, accessors.size(), accessors.toArray());
		}
		return new EcoreEList.UnmodifiableEList.FastCompare<EObject>(this, MetaABMPackage.Literals.IVALUE__ACCESSORS, 0, new EObject[] {});
	}

	public boolean accesses(AAct act) {
		if (act instanceof ASet && ((ASet) act).getParameter() == this) {
			return true;
		} else if (act instanceof ASink) {
			for (AInput input : ((ASink) act).getInputs()) {
				if (input.getValue() == this) {
					return true;
				}
			}
		}
		return false;
	}

	// public void agentAccessors(SAgent parent, Collection<EObject>
	// searchObjects) {
	// if (parent != null && parent.getRootActivity() != null) {
	// // searchObjects.add(parent.getRootActivity());
	// for (Object object : parent.getRootActivity().eContents()) {
	// if (object instanceof ASink) {
	// searchObjects.add((EObject) object);
	// EList<AInput> inputs = ((ASink) object).getInputs();
	// for (AInput input : inputs) {
	// if (input.getValue() != this) {
	// searchObjects.add(input.getValue());
	// }
	// }
	// }
	// if (object instanceof AAccessor) {
	// searchObjects.add((EObject) object);
	// }
	// }
	// }
	// if (parent instanceof SContext) {
	// for (SAgent agent : ((SContext) parent).getAgents()) {
	// agentAccessors(agent, searchObjects);
	// }
	// }
	// }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SAttributeType> getAvailableTypes() {
		// TODO: implement this method to return the 'Available Types' attribute
		// list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement
		// org.eclipse.emf.ecore.util.InternalEList and
		// org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of
		// org.eclipse.emf.ecore.util.EcoreEList should be used.
		return SAttributeType.EMPTY_TYPES;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SState getSet() {
		if (eContainerFeatureID() != MetaABMPackage.SSTATE_VALUE__SET)
			return null;
		return (SState) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSet(SState newSet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSet, MetaABMPackage.SSTATE_VALUE__SET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSet(SState newSet) {
		if (newSet != eInternalContainer() || (eContainerFeatureID() != MetaABMPackage.SSTATE_VALUE__SET && newSet != null)) {
			if (EcoreUtil.isAncestor(this, newSet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSet != null)
				msgs = ((InternalEObject) newSet).eInverseAdd(this, MetaABMPackage.SSTATE__OPTIONS, SState.class, msgs);
			msgs = basicSetSet(newSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SSTATE_VALUE__SET, newSet, newSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SSTATE_VALUE__SET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSet((SState) otherEnd, msgs);
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
			case MetaABMPackage.SSTATE_VALUE__SET:
				return basicSetSet(null, msgs);
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
			case MetaABMPackage.SSTATE_VALUE__SET:
				return eInternalContainer().eInverseRemove(this, MetaABMPackage.SSTATE__OPTIONS, SState.class, msgs);
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
			case MetaABMPackage.SSTATE_VALUE__ACCESSORS:
				return getAccessors();
			case MetaABMPackage.SSTATE_VALUE__AVAILABLE_TYPES:
				return getAvailableTypes();
			case MetaABMPackage.SSTATE_VALUE__SET:
				return getSet();
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
			case MetaABMPackage.SSTATE_VALUE__AVAILABLE_TYPES:
				getAvailableTypes().clear();
				getAvailableTypes().addAll((Collection<? extends SAttributeType>) newValue);
				return;
			case MetaABMPackage.SSTATE_VALUE__SET:
				setSet((SState) newValue);
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
			case MetaABMPackage.SSTATE_VALUE__AVAILABLE_TYPES:
				getAvailableTypes().clear();
				return;
			case MetaABMPackage.SSTATE_VALUE__SET:
				setSet((SState) null);
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
			case MetaABMPackage.SSTATE_VALUE__ACCESSORS:
				return !getAccessors().isEmpty();
			case MetaABMPackage.SSTATE_VALUE__AVAILABLE_TYPES:
				return !getAvailableTypes().isEmpty();
			case MetaABMPackage.SSTATE_VALUE__SET:
				return getSet() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == IValue.class) {
			switch (derivedFeatureID) {
				case MetaABMPackage.SSTATE_VALUE__ACCESSORS:
					return MetaABMPackage.IVALUE__ACCESSORS;
				case MetaABMPackage.SSTATE_VALUE__AVAILABLE_TYPES:
					return MetaABMPackage.IVALUE__AVAILABLE_TYPES;
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
		if (baseClass == IValue.class) {
			switch (baseFeatureID) {
				case MetaABMPackage.IVALUE__ACCESSORS:
					return MetaABMPackage.SSTATE_VALUE__ACCESSORS;
				case MetaABMPackage.IVALUE__AVAILABLE_TYPES:
					return MetaABMPackage.SSTATE_VALUE__AVAILABLE_TYPES;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	public boolean references(IValue value) {
		return value == this;
	}
} // SStateValueImpl
