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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.metaabm.IValue;
import org.metaabm.SState;
import org.metaabm.act.AInput;
import org.metaabm.act.ALiteral;
import org.metaabm.act.ASelect;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>AInput</b></em>'. <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link org.metaabm.act.impl.AInputImpl#getSink
 * <em>Sink</em>}</li> <li>{@link org.metaabm.act.impl.AInputImpl#getSelected
 * <em>Selected</em>}</li> <li>{@link org.metaabm.act.impl.AInputImpl#getLiteral
 * <em>Literal</em>}</li> <li>{@link org.metaabm.act.impl.AInputImpl#getValue
 * <em>Value</em>}</li> </ul> </p>
 * @generated
 */
public class AInputImpl extends EObjectImpl implements AInput {
	/**
	 * The cached value of the '{@link #getSelected() <em>Selected</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSelected()
	 * @generated
	 * @ordered
	 */
	protected ASelect selected;

	/**
	 * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLiteral()
	 * @generated
	 * @ordered
	 */
	protected ALiteral literal;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected IValue value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AInputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.AINPUT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IValue getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject) value;
			value = (IValue) eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.AINPUT__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public IValue basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(IValue newValue) {
		IValue oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.AINPUT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASink getSink() {
		if (eContainerFeatureID() != MetaABMActPackage.AINPUT__SINK)
			return null;
		return (ASink) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSink(ASink newSink, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newSink, MetaABMActPackage.AINPUT__SINK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSink(ASink newSink) {
		if (newSink != eInternalContainer() || (eContainerFeatureID() != MetaABMActPackage.AINPUT__SINK && newSink != null)) {
			if (EcoreUtil.isAncestor(this, newSink))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSink != null)
				msgs = ((InternalEObject) newSink).eInverseAdd(this, MetaABMActPackage.ASINK__INPUTS, ASink.class, msgs);
			msgs = basicSetSink(newSink, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.AINPUT__SINK, newSink, newSink));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.AINPUT__SELECTED, oldSelected, selected));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.AINPUT__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ALiteral getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLiteral(ALiteral newLiteral, NotificationChain msgs) {
		ALiteral oldLiteral = literal;
		literal = newLiteral;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaABMActPackage.AINPUT__LITERAL, oldLiteral, newLiteral);
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
	public void setLiteral(ALiteral newLiteral) {
		if (newLiteral != literal) {
			NotificationChain msgs = null;
			if (literal != null)
				msgs = ((InternalEObject) literal).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaABMActPackage.AINPUT__LITERAL, null, msgs);
			if (newLiteral != null)
				msgs = ((InternalEObject) newLiteral).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaABMActPackage.AINPUT__LITERAL, null, msgs);
			msgs = basicSetLiteral(newLiteral, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.AINPUT__LITERAL, newLiteral, newLiteral));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMActPackage.AINPUT__SINK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSink((ASink) otherEnd, msgs);
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
			case MetaABMActPackage.AINPUT__SINK:
				return basicSetSink(null, msgs);
			case MetaABMActPackage.AINPUT__LITERAL:
				return basicSetLiteral(null, msgs);
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
			case MetaABMActPackage.AINPUT__SINK:
				return eInternalContainer().eInverseRemove(this, MetaABMActPackage.ASINK__INPUTS, ASink.class, msgs);
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
			case MetaABMActPackage.AINPUT__SINK:
				return getSink();
			case MetaABMActPackage.AINPUT__SELECTED:
				if (resolve)
					return getSelected();
				return basicGetSelected();
			case MetaABMActPackage.AINPUT__LITERAL:
				return getLiteral();
			case MetaABMActPackage.AINPUT__VALUE:
				if (resolve)
					return getValue();
				return basicGetValue();
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
			case MetaABMActPackage.AINPUT__SINK:
				setSink((ASink) newValue);
				return;
			case MetaABMActPackage.AINPUT__SELECTED:
				setSelected((ASelect) newValue);
				return;
			case MetaABMActPackage.AINPUT__LITERAL:
				setLiteral((ALiteral) newValue);
				return;
			case MetaABMActPackage.AINPUT__VALUE:
				setValue((IValue) newValue);
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
			case MetaABMActPackage.AINPUT__SINK:
				setSink((ASink) null);
				return;
			case MetaABMActPackage.AINPUT__SELECTED:
				setSelected((ASelect) null);
				return;
			case MetaABMActPackage.AINPUT__LITERAL:
				setLiteral((ALiteral) null);
				return;
			case MetaABMActPackage.AINPUT__VALUE:
				setValue((IValue) null);
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
			case MetaABMActPackage.AINPUT__SINK:
				return getSink() != null;
			case MetaABMActPackage.AINPUT__SELECTED:
				return selected != null;
			case MetaABMActPackage.AINPUT__LITERAL:
				return literal != null;
			case MetaABMActPackage.AINPUT__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}

	public boolean isPotentialValue(IValue value) {
		return isReachable(value) && acceptsValue(value) || value == literal || value == null;
	}

	public boolean isReachable(IValue value) {
		return getSink().isReachable(value);
	}

	private boolean acceptsValue(IValue value) {
		return getSink() == null || getSink().accepts(value, inputNumber());
	}

	public Collection<?> potentialValues(Collection<IValue> suggestValues) {
		Collection<IValue> potential = new ArrayList<IValue>();
		for (AInput input : getSink().getInputs()) {
			// For now if any value is a state, allow that or compatible values
			if (input.getValue() instanceof SState) {
				Collection<IValue> options = new HashSet<IValue>();
				options.add(input.getValue());
				options.addAll(((SState) input.getValue()).getOptions());
				return options;
			}
		}
		for (IValue candidate : suggestValues) {
			if (candidate != null && isPotentialValue(candidate)) {
				potential.add(candidate);
			}
		}
		return potential;
	}

	private int inputNumber() {
		return getSink().getInputs().indexOf(this);
	}

	public boolean references(IValue value) {
		return getValue() != null && getValue().references(value);
	}
} // AInputImpl
