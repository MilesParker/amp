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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;
import org.metaabm.SStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SStyle</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SStyleImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.metaabm.impl.SStyleImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.metaabm.impl.SStyleImpl#getAgent <em>Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SStyleImpl extends SActableImpl implements SStyle {
	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected SImplementation implementation;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SSTYLE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SImplementation getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementation(SImplementation newImplementation, NotificationChain msgs) {
		SImplementation oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaABMPackage.SSTYLE__IMPLEMENTATION, oldImplementation, newImplementation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(SImplementation newImplementation) {
		if (newImplementation != implementation) {
			NotificationChain msgs = null;
			if (implementation != null)
				msgs = ((InternalEObject) implementation).eInverseRemove(this, MetaABMPackage.SIMPLEMENTATION__TARGET, SImplementation.class, msgs);
			if (newImplementation != null)
				msgs = ((InternalEObject) newImplementation).eInverseAdd(this, MetaABMPackage.SIMPLEMENTATION__TARGET, SImplementation.class, msgs);
			msgs = basicSetImplementation(newImplementation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SSTYLE__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SImplemented getParent() {
		SImplemented parent = basicGetParent();
		return parent != null && parent.eIsProxy() ? (SImplemented) eResolveProxy((InternalEObject) parent) : parent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAgent getAgent() {
		if (eContainerFeatureID() != MetaABMPackage.SSTYLE__AGENT)
			return null;
		return (SAgent) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAgent(SAgent newAgent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAgent, MetaABMPackage.SSTYLE__AGENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgent(SAgent newAgent) {
		if (newAgent != eInternalContainer() || (eContainerFeatureID() != MetaABMPackage.SSTYLE__AGENT && newAgent != null)) {
			if (EcoreUtil.isAncestor(this, newAgent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAgent != null)
				msgs = ((InternalEObject) newAgent).eInverseAdd(this, MetaABMPackage.SAGENT__STYLES, SAgent.class, msgs);
			msgs = basicSetAgent(newAgent, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SSTYLE__AGENT, newAgent, newAgent));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SImplemented basicGetParent() {
		return getAgent();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SSTYLE__IMPLEMENTATION:
				if (implementation != null)
					msgs = ((InternalEObject) implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaABMPackage.SSTYLE__IMPLEMENTATION, null, msgs);
				return basicSetImplementation((SImplementation) otherEnd, msgs);
			case MetaABMPackage.SSTYLE__AGENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAgent((SAgent) otherEnd, msgs);
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
			case MetaABMPackage.SSTYLE__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case MetaABMPackage.SSTYLE__AGENT:
				return basicSetAgent(null, msgs);
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
			case MetaABMPackage.SSTYLE__AGENT:
				return eInternalContainer().eInverseRemove(this, MetaABMPackage.SAGENT__STYLES, SAgent.class, msgs);
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
			case MetaABMPackage.SSTYLE__IMPLEMENTATION:
				return getImplementation();
			case MetaABMPackage.SSTYLE__PARENT:
				if (resolve)
					return getParent();
				return basicGetParent();
			case MetaABMPackage.SSTYLE__AGENT:
				return getAgent();
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
			case MetaABMPackage.SSTYLE__IMPLEMENTATION:
				setImplementation((SImplementation) newValue);
				return;
			case MetaABMPackage.SSTYLE__AGENT:
				setAgent((SAgent) newValue);
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
			case MetaABMPackage.SSTYLE__IMPLEMENTATION:
				setImplementation((SImplementation) null);
				return;
			case MetaABMPackage.SSTYLE__AGENT:
				setAgent((SAgent) null);
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
			case MetaABMPackage.SSTYLE__IMPLEMENTATION:
				return implementation != null;
			case MetaABMPackage.SSTYLE__PARENT:
				return basicGetParent() != null;
			case MetaABMPackage.SSTYLE__AGENT:
				return getAgent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SImplemented.class) {
			switch (derivedFeatureID) {
				case MetaABMPackage.SSTYLE__IMPLEMENTATION:
					return MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION;
				case MetaABMPackage.SSTYLE__PARENT:
					return MetaABMPackage.SIMPLEMENTED__PARENT;
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
		if (baseClass == SImplemented.class) {
			switch (baseFeatureID) {
				case MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION:
					return MetaABMPackage.SSTYLE__IMPLEMENTATION;
				case MetaABMPackage.SIMPLEMENTED__PARENT:
					return MetaABMPackage.SSTYLE__PARENT;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} // SStyleImpl
