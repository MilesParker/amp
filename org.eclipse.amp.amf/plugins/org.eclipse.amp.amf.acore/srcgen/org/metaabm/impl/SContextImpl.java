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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.AbstractTreeIterator;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.IArtifact;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SContext;
import org.metaabm.SProjection;
import org.metaabm.SValueLayer;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SContext</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SContextImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.metaabm.impl.SContextImpl#getProjections <em>Projections</em>}</li>
 *   <li>{@link org.metaabm.impl.SContextImpl#getValueLayers <em>Value Layers</em>}</li>
 *   <li>{@link org.metaabm.impl.SContextImpl#getLibrary <em>Library</em>}</li>
 *   <li>{@link org.metaabm.impl.SContextImpl#getAllAgents <em>All Agents</em>}</li>
 *   <li>{@link org.metaabm.impl.SContextImpl#getAllContexts <em>All Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SContextImpl extends SAgentImpl implements SContext {
	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<SAgent> agents;

	/**
	 * The cached value of the '{@link #getProjections() <em>Projections</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProjections()
	 * @generated
	 * @ordered
	 */
	protected EList<SProjection> projections;

	/**
	 * The cached value of the '{@link #getValueLayers() <em>Value Layers</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValueLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<SValueLayer> valueLayers;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<IArtifact> library;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SCONTEXT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SProjection> getProjections() {
		if (projections == null) {
			projections = new EObjectContainmentWithInverseEList<SProjection>(SProjection.class, this, MetaABMPackage.SCONTEXT__PROJECTIONS, MetaABMPackage.SPROJECTION__OWNER);
		}
		return projections;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAgent> getAgents() {
		if (agents == null) {
			agents = new EObjectContainmentWithInverseEList<SAgent>(SAgent.class, this, MetaABMPackage.SCONTEXT__AGENTS, MetaABMPackage.SAGENT__OWNER);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SValueLayer> getValueLayers() {
		if (valueLayers == null) {
			valueLayers = new EObjectContainmentEList<SValueLayer>(SValueLayer.class, this, MetaABMPackage.SCONTEXT__VALUE_LAYERS);
		}
		return valueLayers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IArtifact> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<IArtifact>(IArtifact.class, this, MetaABMPackage.SCONTEXT__LIBRARY);
		}
		return library;
	}

	public Collection<SContext> getSubContexts() {
		// there is prob a better way to do this
		Collection<SContext> l = new ArrayList<SContext>();
		for (SAgent agent : getAgents()) {
			if (agent instanceof SContext) {
				l.add((SContext) agent);
			}
		}
		return l;
	}

	public EList<EObject> getAllAgents() {
		Object[] all = IteratorUtils.toArray(allAgentsTree());
		return new EcoreEList.UnmodifiableEList.FastCompare<EObject>(this, MetaABMPackage.Literals.IVALUE__ACCESSORS, all.length, all);
	}

	@SuppressWarnings("unchecked")
	public List<SAgent> getAllSubAgents() {
		List<SAgent> res = IteratorUtils.toList(allAgentsTree());
		res.remove(this);
		return res;
	}

	public EList<EObject> getAllContexts() {
		Object[] all = IteratorUtils.toArray(allContextsTree());
		return new EcoreEList.UnmodifiableEList.FastCompare<EObject>(this, MetaABMPackage.Literals.IVALUE__ACCESSORS, all.length, all);
	}

	protected TreeIterator<Object> allAgentsTree() {
		return new AbstractTreeIterator<Object>(this) {
			private static final long serialVersionUID = 1L;

			@SuppressWarnings("unchecked")
			protected Iterator<SAgent> getChildren(Object obj) {
				if (obj instanceof SContext) {
					return ((SContext) obj).getAgents().iterator();
				} else {
					return (Iterator<SAgent>) ECollections.EMPTY_ELIST.iterator();
				}
			}
		};
	}

	protected TreeIterator<Object> allContextsTree() {
		return new AbstractTreeIterator<Object>(this) {
			private static final long serialVersionUID = 1L;

			@SuppressWarnings("unchecked")
			protected Iterator<SContext> getChildren(Object obj) {
				if (obj instanceof SContext) {
					return ((SContext) obj).getSubContexts().iterator();
				} else {
					return (Iterator<SContext>) ECollections.EMPTY_ELIST.iterator();
				}
			}
		};
	}

	public SAgent findChild(String name) {
		for (TreeIterator<?> children = eAllContents(); children.hasNext();) {
			EObject child = (EObject) children.next();
			if (child instanceof SAgent) {
				if (((SAgent) child).getLabel().equals(name)) {
					return (SAgent) child;
				}
			} else {
				children.prune();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SCONTEXT__AGENTS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getAgents()).basicAdd(otherEnd, msgs);
			case MetaABMPackage.SCONTEXT__PROJECTIONS:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getProjections()).basicAdd(otherEnd, msgs);
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
			case MetaABMPackage.SCONTEXT__AGENTS:
				return ((InternalEList<?>) getAgents()).basicRemove(otherEnd, msgs);
			case MetaABMPackage.SCONTEXT__PROJECTIONS:
				return ((InternalEList<?>) getProjections()).basicRemove(otherEnd, msgs);
			case MetaABMPackage.SCONTEXT__VALUE_LAYERS:
				return ((InternalEList<?>) getValueLayers()).basicRemove(otherEnd, msgs);
			case MetaABMPackage.SCONTEXT__LIBRARY:
				return ((InternalEList<?>) getLibrary()).basicRemove(otherEnd, msgs);
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
			case MetaABMPackage.SCONTEXT__AGENTS:
				return getAgents();
			case MetaABMPackage.SCONTEXT__PROJECTIONS:
				return getProjections();
			case MetaABMPackage.SCONTEXT__VALUE_LAYERS:
				return getValueLayers();
			case MetaABMPackage.SCONTEXT__LIBRARY:
				return getLibrary();
			case MetaABMPackage.SCONTEXT__ALL_AGENTS:
				return getAllAgents();
			case MetaABMPackage.SCONTEXT__ALL_CONTEXTS:
				return getAllContexts();
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
			case MetaABMPackage.SCONTEXT__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends SAgent>) newValue);
				return;
			case MetaABMPackage.SCONTEXT__PROJECTIONS:
				getProjections().clear();
				getProjections().addAll((Collection<? extends SProjection>) newValue);
				return;
			case MetaABMPackage.SCONTEXT__VALUE_LAYERS:
				getValueLayers().clear();
				getValueLayers().addAll((Collection<? extends SValueLayer>) newValue);
				return;
			case MetaABMPackage.SCONTEXT__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends IArtifact>) newValue);
				return;
			case MetaABMPackage.SCONTEXT__ALL_AGENTS:
				getAllAgents().clear();
				getAllAgents().addAll((Collection<? extends SAgent>) newValue);
				return;
			case MetaABMPackage.SCONTEXT__ALL_CONTEXTS:
				getAllContexts().clear();
				getAllContexts().addAll((Collection<? extends SContext>) newValue);
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
			case MetaABMPackage.SCONTEXT__AGENTS:
				getAgents().clear();
				return;
			case MetaABMPackage.SCONTEXT__PROJECTIONS:
				getProjections().clear();
				return;
			case MetaABMPackage.SCONTEXT__VALUE_LAYERS:
				getValueLayers().clear();
				return;
			case MetaABMPackage.SCONTEXT__LIBRARY:
				getLibrary().clear();
				return;
			case MetaABMPackage.SCONTEXT__ALL_AGENTS:
				getAllAgents().clear();
				return;
			case MetaABMPackage.SCONTEXT__ALL_CONTEXTS:
				getAllContexts().clear();
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
			case MetaABMPackage.SCONTEXT__AGENTS:
				return agents != null && !agents.isEmpty();
			case MetaABMPackage.SCONTEXT__PROJECTIONS:
				return projections != null && !projections.isEmpty();
			case MetaABMPackage.SCONTEXT__VALUE_LAYERS:
				return valueLayers != null && !valueLayers.isEmpty();
			case MetaABMPackage.SCONTEXT__LIBRARY:
				return library != null && !library.isEmpty();
			case MetaABMPackage.SCONTEXT__ALL_AGENTS:
				return !getAllAgents().isEmpty();
			case MetaABMPackage.SCONTEXT__ALL_CONTEXTS:
				return !getAllContexts().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Returns the agent with the supplied <i>usage</i> name.
	 */
	public SAgent findAgent(String id) {
		for (SAgent agent : getAgents()) {
			if (agent.getID().equals(id)) {
				return agent;
			}
		}
		return null;
	}

	@Override
	public boolean references(IValue value) {
		if (super.references(value)) {
			return true;
		} else {
			for (SAgent subAgent : getAgents()) {
				if (subAgent.references(value)) {
					return true;
				}
			}
		}
		return false;
	}

} // SContextImpl
