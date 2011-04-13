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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.IAgentChild;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SContext;
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;
import org.metaabm.SStyle;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SAgent</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SAgentImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.metaabm.impl.SAgentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.metaabm.impl.SAgentImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.metaabm.impl.SAgentImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.metaabm.impl.SAgentImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAgentImpl extends SActableImpl implements SAgent {
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
	 * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyles()
	 * @generated
	 * @ordered
	 */
	protected EList<SStyle> styles;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<IAgentChild> children;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SAgentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SAGENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaABMPackage.SAGENT__IMPLEMENTATION, oldImplementation, newImplementation);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SAGENT__IMPLEMENTATION, newImplementation, newImplementation));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SStyle> getStyles() {
		if (styles == null) {
			styles = new EObjectContainmentWithInverseEList<SStyle>(SStyle.class, this, MetaABMPackage.SAGENT__STYLES, MetaABMPackage.SSTYLE__AGENT);
		}
		return styles;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SContext getOwner() {
		if (eContainerFeatureID() != MetaABMPackage.SAGENT__OWNER)
			return null;
		return (SContext) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(SContext newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwner, MetaABMPackage.SAGENT__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(SContext newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != MetaABMPackage.SAGENT__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject) newOwner).eInverseAdd(this, MetaABMPackage.SCONTEXT__AGENTS, SContext.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SAGENT__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IAgentChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<IAgentChild>(IAgentChild.class, this, MetaABMPackage.SAGENT__CHILDREN, MetaABMPackage.IAGENT_CHILD__PARENT);
		}
		return children;
	}

	public SAgent getParent() {
		if (eContainerFeatureID != MetaABMPackage.SAGENT__OWNER)
			return null;
		return (SContext) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public SImplemented basicGetParent() {
		return getOwner();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SAGENT__IMPLEMENTATION:
				if (implementation != null)
					msgs = ((InternalEObject) implementation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaABMPackage.SAGENT__IMPLEMENTATION, null, msgs);
				return basicSetImplementation((SImplementation) otherEnd, msgs);
			case MetaABMPackage.SAGENT__STYLES:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getStyles()).basicAdd(otherEnd, msgs);
			case MetaABMPackage.SAGENT__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((SContext) otherEnd, msgs);
			case MetaABMPackage.SAGENT__CHILDREN:
				return ((InternalEList<InternalEObject>) (InternalEList<?>) getChildren()).basicAdd(otherEnd, msgs);
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
			case MetaABMPackage.SAGENT__IMPLEMENTATION:
				return basicSetImplementation(null, msgs);
			case MetaABMPackage.SAGENT__STYLES:
				return ((InternalEList<?>) getStyles()).basicRemove(otherEnd, msgs);
			case MetaABMPackage.SAGENT__OWNER:
				return basicSetOwner(null, msgs);
			case MetaABMPackage.SAGENT__CHILDREN:
				return ((InternalEList<?>) getChildren()).basicRemove(otherEnd, msgs);
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
			case MetaABMPackage.SAGENT__OWNER:
				return eInternalContainer().eInverseRemove(this, MetaABMPackage.SCONTEXT__AGENTS, SContext.class, msgs);
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
			case MetaABMPackage.SAGENT__IMPLEMENTATION:
				return getImplementation();
			case MetaABMPackage.SAGENT__PARENT:
				if (resolve)
					return getParent();
				return basicGetParent();
			case MetaABMPackage.SAGENT__STYLES:
				return getStyles();
			case MetaABMPackage.SAGENT__OWNER:
				return getOwner();
			case MetaABMPackage.SAGENT__CHILDREN:
				return getChildren();
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
			case MetaABMPackage.SAGENT__IMPLEMENTATION:
				setImplementation((SImplementation) newValue);
				return;
			case MetaABMPackage.SAGENT__STYLES:
				getStyles().clear();
				getStyles().addAll((Collection<? extends SStyle>) newValue);
				return;
			case MetaABMPackage.SAGENT__OWNER:
				setOwner((SContext) newValue);
				return;
			case MetaABMPackage.SAGENT__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends IAgentChild>) newValue);
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
			case MetaABMPackage.SAGENT__IMPLEMENTATION:
				setImplementation((SImplementation) null);
				return;
			case MetaABMPackage.SAGENT__STYLES:
				getStyles().clear();
				return;
			case MetaABMPackage.SAGENT__OWNER:
				setOwner((SContext) null);
				return;
			case MetaABMPackage.SAGENT__CHILDREN:
				getChildren().clear();
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
			case MetaABMPackage.SAGENT__IMPLEMENTATION:
				return implementation != null;
			case MetaABMPackage.SAGENT__PARENT:
				return basicGetParent() != null;
			case MetaABMPackage.SAGENT__STYLES:
				return styles != null && !styles.isEmpty();
			case MetaABMPackage.SAGENT__OWNER:
				return getOwner() != null;
			case MetaABMPackage.SAGENT__CHILDREN:
				return children != null && !children.isEmpty();
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
				case MetaABMPackage.SAGENT__IMPLEMENTATION:
					return MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION;
				case MetaABMPackage.SAGENT__PARENT:
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
					return MetaABMPackage.SAGENT__IMPLEMENTATION;
				case MetaABMPackage.SIMPLEMENTED__PARENT:
					return MetaABMPackage.SAGENT__PARENT;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	public boolean isReachable(IValue value) {
		if (super.isReachable(value)) {
			return true;
		} else if (getOwner() != null) {
			return getOwner().isReachable(value);
		}
		return false;
	}
} // SAgentImpl