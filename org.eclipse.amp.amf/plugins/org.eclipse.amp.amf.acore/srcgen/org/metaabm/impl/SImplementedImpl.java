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
import org.metaabm.MetaABMPackage;
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SImplemented</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SImplementedImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.metaabm.impl.SImplementedImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SImplementedImpl extends IIDImpl implements SImplemented {
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
	protected SImplementedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SIMPLEMENTED;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION, oldImplementation, newImplementation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION, newImplementation, newImplementation));
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
	public SImplemented basicGetParent() {
		// TODO: implement this method to return the 'Parent' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION:
				if (implementation != null)
					msgs = ((InternalEObject) implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION, null, msgs);
				return basicSetImplementation((SImplementation) otherEnd, msgs);
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
			case MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION:
				return getImplementation();
			case MetaABMPackage.SIMPLEMENTED__PARENT:
				if (resolve)
					return getParent();
				return basicGetParent();
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
			case MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION:
				setImplementation((SImplementation) newValue);
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
			case MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION:
				setImplementation((SImplementation) null);
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
			case MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION:
				return implementation != null;
			case MetaABMPackage.SIMPLEMENTED__PARENT:
				return basicGetParent() != null;
		}
		return super.eIsSet(featureID);
	}
} // SImplementedImpl
