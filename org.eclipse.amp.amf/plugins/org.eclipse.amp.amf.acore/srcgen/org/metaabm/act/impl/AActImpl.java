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
package org.metaabm.act.impl;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.metaabm.IValue;
import org.metaabm.SAgent;
import org.metaabm.act.AAct;
import org.metaabm.act.AGroup;
import org.metaabm.act.ASelect;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.impl.IIDImpl;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>AAct</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link org.metaabm.act.impl.AActImpl#getSources
 * <em>Sources</em>}</li> <li>{@link org.metaabm.act.impl.AActImpl#getTargets
 * <em>Targets</em>}</li> <li>{@link org.metaabm.act.impl.AActImpl#getReference
 * <em>Reference</em>}</li> <li>{@link org.metaabm.act.impl.AActImpl#getGroup
 * <em>Group</em>}</li> <li>{@link org.metaabm.act.impl.AActImpl#getSelected
 * <em>Selected</em>}</li> <li>{@link
 * org.metaabm.act.impl.AActImpl#getAllSources <em>All Sources</em>}</li>
 * <li>{@link org.metaabm.act.impl.AActImpl#getAllTargets <em>All
 * Targets</em>}</li> <li>{@link org.metaabm.act.impl.AActImpl#getRootSelected
 * <em>Root Selected</em>}</li> </ul> </p>
 * @generated
 */
public abstract class AActImpl extends IIDImpl implements AAct {
	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<AAct> sources;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<AAct> targets;

	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected ASelect selected;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.AACT;
	}

	// /**
	// * <!-- begin-user-doc -->
	// * <!-- end-user-doc -->
	// * @generated NOT
	// */
	// public abstract String getID();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AAct> getSources() {
		if (sources == null) {
			sources = new EObjectWithInverseResolvingEList.ManyInverse<AAct>(AAct.class, this, MetaABMActPackage.AACT__SOURCES, MetaABMActPackage.AACT__TARGETS);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AAct> getTargets() {
		if (targets == null) {
			targets = new EObjectWithInverseResolvingEList.ManyInverse<AAct>(AAct.class, this, MetaABMActPackage.AACT__TARGETS, MetaABMActPackage.AACT__SOURCES);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAgent getReference() {
		SAgent reference = basicGetReference();
		return reference != null && reference.eIsProxy() ? (SAgent) eResolveProxy((InternalEObject) reference) : reference;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SAgent basicGetReference() {
		return getGroup() != null ? getGroup().getReference() : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AGroup getGroup() {
		if (eContainerFeatureID() != MetaABMActPackage.AACT__GROUP)
			return null;
		return (AGroup) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroup(AGroup newGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newGroup, MetaABMActPackage.AACT__GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(AGroup newGroup) {
		if (newGroup != eInternalContainer() || (eContainerFeatureID() != MetaABMActPackage.AACT__GROUP && newGroup != null)) {
			if (EcoreUtil.isAncestor(this, newGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGroup != null)
				msgs = ((InternalEObject) newGroup).eInverseAdd(this, MetaABMActPackage.AGROUP__MEMBERS, AGroup.class, msgs);
			msgs = basicSetGroup(newGroup, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.AACT__GROUP, newGroup, newGroup));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASelect getSelected() {
		if (selected != null && selected.eIsProxy()) {
			InternalEObject oldSelected = (InternalEObject) selected;
			selected = (ASelect) eResolveProxy(oldSelected);
			if (selected != oldSelected) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.AACT__SELECTED, oldSelected, selected));
			}
		}
		return selected;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASelect basicGetSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(ASelect newSelected) {
		ASelect oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.AACT__SELECTED, oldSelected, selected));
	}

	protected Collection<AAct> computeAllSources(Collection<AAct> priorSources) {
		for (AAct source : getSources()) {
			if (!priorSources.contains(source)) {
				((AActImpl) source).computeAllSources(priorSources);
				priorSources.add(source);
			} else {
				// this is actually invalid case, but we want to provide a list
				// including self so that tools can
				// evaluate it
			}
		}
		return priorSources;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<AAct> getAllSources() {
		Collection<AAct> allSources = computeAllSources(new HashSet<AAct>());
		return new EcoreEList.UnmodifiableEList.FastCompare<AAct>(this, MetaABMActPackage.Literals.AACT__ALL_SOURCES, allSources.size(), allSources.toArray());
	}

	protected Collection<AAct> computeAllTargets() {
		Collection<AAct> allTargets = new HashSet<AAct>(getTargets());
		for (AAct target : getTargets()) {
			if (target != this) {
				allTargets.addAll(((AActImpl) target).computeAllTargets());
			} else {
				// this is actually invalid case, but we want to provide a list
				// including self so that tools can
				// evaluate it
				allTargets.add(this);
			}
		}
		return allTargets;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<AAct> getAllTargets() {
		Collection<AAct> allTargets = computeAllTargets();
		return new EcoreEList.UnmodifiableEList.FastCompare<AAct>(this, MetaABMActPackage.Literals.AACT__ALL_TARGETS, allTargets.size(), allTargets.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASelect getRootSelected() {
		ASelect rootSelected = basicGetRootSelected();
		return rootSelected != null && rootSelected.eIsProxy() ? (ASelect) eResolveProxy((InternalEObject) rootSelected) : rootSelected;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public ASelect basicGetRootSelected() {
		return getSelected() != null && getSelected() != this ? getSelected().getRootSelected() : this instanceof ASelect ? (ASelect) this : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMActPackage.AACT__SOURCES:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getSources()).basicAdd(otherEnd, msgs);
			case MetaABMActPackage.AACT__TARGETS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getTargets()).basicAdd(otherEnd, msgs);
			case MetaABMActPackage.AACT__GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGroup((AGroup) otherEnd, msgs);
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
			case MetaABMActPackage.AACT__SOURCES:
				return ((InternalEList<?>) getSources()).basicRemove(otherEnd, msgs);
			case MetaABMActPackage.AACT__TARGETS:
				return ((InternalEList<?>) getTargets()).basicRemove(otherEnd, msgs);
			case MetaABMActPackage.AACT__GROUP:
				return basicSetGroup(null, msgs);
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
			case MetaABMActPackage.AACT__GROUP:
				return eInternalContainer().eInverseRemove(this, MetaABMActPackage.AGROUP__MEMBERS, AGroup.class, msgs);
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
			case MetaABMActPackage.AACT__SOURCES:
				return getSources();
			case MetaABMActPackage.AACT__TARGETS:
				return getTargets();
			case MetaABMActPackage.AACT__REFERENCE:
				if (resolve)
					return getReference();
				return basicGetReference();
			case MetaABMActPackage.AACT__GROUP:
				return getGroup();
			case MetaABMActPackage.AACT__SELECTED:
				if (resolve)
					return getSelected();
				return basicGetSelected();
			case MetaABMActPackage.AACT__ALL_SOURCES:
				return getAllSources();
			case MetaABMActPackage.AACT__ALL_TARGETS:
				return getAllTargets();
			case MetaABMActPackage.AACT__ROOT_SELECTED:
				if (resolve)
					return getRootSelected();
				return basicGetRootSelected();
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
			case MetaABMActPackage.AACT__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends AAct>) newValue);
				return;
			case MetaABMActPackage.AACT__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends AAct>) newValue);
				return;
			case MetaABMActPackage.AACT__GROUP:
				setGroup((AGroup) newValue);
				return;
			case MetaABMActPackage.AACT__SELECTED:
				setSelected((ASelect) newValue);
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
			case MetaABMActPackage.AACT__SOURCES:
				getSources().clear();
				return;
			case MetaABMActPackage.AACT__TARGETS:
				getTargets().clear();
				return;
			case MetaABMActPackage.AACT__GROUP:
				setGroup((AGroup) null);
				return;
			case MetaABMActPackage.AACT__SELECTED:
				setSelected((ASelect) null);
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
			case MetaABMActPackage.AACT__SOURCES:
				return sources != null && !sources.isEmpty();
			case MetaABMActPackage.AACT__TARGETS:
				return targets != null && !targets.isEmpty();
			case MetaABMActPackage.AACT__REFERENCE:
				return basicGetReference() != null;
			case MetaABMActPackage.AACT__GROUP:
				return getGroup() != null;
			case MetaABMActPackage.AACT__SELECTED:
				return selected != null;
			case MetaABMActPackage.AACT__ALL_SOURCES:
				return !getAllSources().isEmpty();
			case MetaABMActPackage.AACT__ALL_TARGETS:
				return !getAllTargets().isEmpty();
			case MetaABMActPackage.AACT__ROOT_SELECTED:
				return basicGetRootSelected() != null;
		}
		return super.eIsSet(featureID);
	}

	public boolean isTargetOf(Object check) {
		if (this == check) {
			return true;
		} else {
			for (AAct source : getSources()) {
				if (source.isTargetOf(check)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean isReachable(IValue value) {
		boolean b = isTargetOf(value) || getSelected() != null && getSelected() != this && getSelected().isReachable(value) || value != null && value.eResource() != this.eResource();
		return b;
	}

	public boolean references(IValue value) {
		return false;
	}
} // AActImpl
