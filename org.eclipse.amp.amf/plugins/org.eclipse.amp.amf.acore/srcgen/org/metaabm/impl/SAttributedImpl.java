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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAttribute;
import org.metaabm.SAttributed;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SAttributed</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SAttributedImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SAttributedImpl extends SNamedImpl implements SAttributed {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<SAttribute> attributes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SAttributedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SATTRIBUTED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentWithInverseEList<SAttribute>(SAttribute.class, this, MetaABMPackage.SATTRIBUTED__ATTRIBUTES, MetaABMPackage.SATTRIBUTE__OWNER);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SATTRIBUTED__ATTRIBUTES:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getAttributes()).basicAdd(otherEnd, msgs);
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
			case MetaABMPackage.SATTRIBUTED__ATTRIBUTES:
				return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
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
			case MetaABMPackage.SATTRIBUTED__ATTRIBUTES:
				return getAttributes();
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
			case MetaABMPackage.SATTRIBUTED__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends SAttribute>) newValue);
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
			case MetaABMPackage.SATTRIBUTED__ATTRIBUTES:
				getAttributes().clear();
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
			case MetaABMPackage.SATTRIBUTED__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Returns the attribute with the supplied <i>usage</i> name.
	 */
	public SAttribute findAttribute(String id) {
		for (SAttribute attr : getAttributes()) {
			if (attr.getID().equals(id)) {
				return attr;
			}
		}
		return null;
	}

	public boolean isReachable(IValue value) {
		if (getAttributes().contains(value)) {
			return true;
		}
		return false;
	}

} // SAttributedImpl