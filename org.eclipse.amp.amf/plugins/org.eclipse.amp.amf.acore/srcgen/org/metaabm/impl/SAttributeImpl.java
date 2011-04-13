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

import org.apache.commons.collections.CollectionUtils;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.metaabm.IAttributeChild;
import org.metaabm.ITyped;
import org.metaabm.ITypedArray;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
import org.metaabm.SAttributed;
import org.metaabm.SContext;
import org.metaabm.SProjection;
import org.metaabm.SState;
import org.metaabm.act.AAccessor;
import org.metaabm.act.AAct;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.AGroup;
import org.metaabm.act.AInput;
import org.metaabm.act.AMultiValue;
import org.metaabm.act.ASet;
import org.metaabm.act.ASink;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SAttribute</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SAttributeImpl#getAccessors <em>Accessors</em>}</li>
 *   <li>{@link org.metaabm.impl.SAttributeImpl#getAvailableTypes <em>Available Types</em>}</li>
 *   <li>{@link org.metaabm.impl.SAttributeImpl#getSType <em>SType</em>}</li>
 *   <li>{@link org.metaabm.impl.SAttributeImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.metaabm.impl.SAttributeImpl#isGatherData <em>Gather Data</em>}</li>
 *   <li>{@link org.metaabm.impl.SAttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.metaabm.impl.SAttributeImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link org.metaabm.impl.SAttributeImpl#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link org.metaabm.impl.SAttributeImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link org.metaabm.impl.SAttributeImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SAttributeImpl extends SNamedImpl implements SAttribute {
	/**
	 * The default value of the '{@link #getSType() <em>SType</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getSType()
	 * @generated
	 * @ordered
	 */
	protected static final SAttributeType STYPE_EDEFAULT = SAttributeType.INTEGER_LITERAL;

	/**
	 * The cached value of the '{@link #getSType() <em>SType</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getSType()
	 * @generated
	 * @ordered
	 */
	protected SAttributeType sType = STYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isGatherData() <em>Gather Data</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isGatherData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GATHER_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGatherData() <em>Gather Data</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isGatherData()
	 * @generated
	 * @ordered
	 */
	protected boolean gatherData = GATHER_DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final String UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected String units = UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isImmutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMMUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImmutable() <em>Immutable</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isImmutable()
	 * @generated
	 * @ordered
	 */
	protected boolean immutable = IMMUTABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<IAttributeChild> children;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<EObject> getAccessors() {
		Collection<EObject> searchObjects = new HashSet<EObject>();
		SAgent agent = null;
		if (getOwner() instanceof SAgent) {
			agent = (SAgent) getOwner();
		} else if (getOwner() instanceof SProjection) {
			agent = ((SProjection) getOwner()).getOwner();
		}
		agentAccessors(searchObjects, agent);
		if (agent instanceof SContext) {
			for (SAgent childAgent : ((SContext) agent).getAgents()) {
				agentAccessors(searchObjects, childAgent);
			}
		}
		return new EcoreEList.UnmodifiableEList.FastCompare<EObject>(this, MetaABMPackage.Literals.IVALUE__ACCESSORS, searchObjects.size(), searchObjects.toArray());
	}

	private void agentAccessors(Collection<EObject> searchObjects, SAgent parent) {
		agentAccessors(parent, this, searchObjects);
		if (this instanceof SState) {
			for (IValue value : ((SState) this).getOptions()) {
				agentAccessors(parent, value, searchObjects);
			}
		}
	}

	public static void agentAccessors(SAgent parent, IValue attribute, Collection<EObject> searchObjects) {
		if (parent != null && parent.getRootActivity() != null) {
			for (AAct act : ((AGroup) parent.getRootActivity()).getMembers()) {
				if (act instanceof ASink) {
					// searchObjects.add((EObject) object);
					for (AInput input : ((ASink) act).getInputs()) {
						if (input.getValue() instanceof AMultiValue) {
							for (IValue value : ((AMultiValue) input.getValue()).getValues()) {
								if (value == attribute) {
									searchObjects.add(input);
								}
							}
						} else {
							if (input.getValue() == attribute) {
								searchObjects.add(input);
							}
						}
					}
				}
				if (act instanceof AAccessor && ((AAccessor) act).getAttribute() == attribute) {
					searchObjects.add(act);
				}
				if (act instanceof ASet && ((ASet) act).getParameter() == attribute) {
					searchObjects.add(act);
				}
				if (act instanceof ACreateAgents && ((ACreateAgents) act).getAgentCount() == attribute) {
					searchObjects.add(act);
				}
			}
		}
		if (parent instanceof SContext) {
			for (SAgent agent : ((SContext) parent).getAgents()) {
				agentAccessors(agent, attribute, searchObjects);
			}
		}
	}

	public static EList<EObject> collectAccessors(EObject value, Collection<EObject> searchObjects) {

		Collection<Setting> find = EcoreUtil.UsageCrossReferencer.find(value, searchObjects);
		Collection<EObject> referencers = new HashSet<EObject>();
		for (Setting setting : find) {
			referencers.add(setting.getEObject());
		}
		return new EcoreEList.UnmodifiableEList.FastCompare<EObject>((InternalEObject) value, MetaABMPackage.Literals.IVALUE__ACCESSORS, referencers.size(), referencers.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttributeType getSType() {
		return sType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSType(SAttributeType newSType) {
		SAttributeType oldSType = sType;
		sType = newSType == null ? STYPE_EDEFAULT : newSType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SATTRIBUTE__STYPE, oldSType, sType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttributed getOwner() {
		if (eContainerFeatureID() != MetaABMPackage.SATTRIBUTE__OWNER)
			return null;
		return (SAttributed) eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(SAttributed newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwner, MetaABMPackage.SATTRIBUTE__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(SAttributed newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != MetaABMPackage.SATTRIBUTE__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject) newOwner).eInverseAdd(this, MetaABMPackage.SATTRIBUTED__ATTRIBUTES, SAttributed.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SATTRIBUTE__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGatherData() {
		return gatherData;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGatherData(boolean newGatherData) {
		boolean oldGatherData = gatherData;
		gatherData = newGatherData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SATTRIBUTE__GATHER_DATA, oldGatherData, gatherData));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnits(String newUnits) {
		String oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SATTRIBUTE__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImmutable() {
		return immutable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmutable(boolean newImmutable) {
		boolean oldImmutable = immutable;
		immutable = newImmutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SATTRIBUTE__IMMUTABLE, oldImmutable, immutable));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerived(boolean newDerived) {
		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SATTRIBUTE__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IAttributeChild> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<IAttributeChild>(IAttributeChild.class, this, MetaABMPackage.SATTRIBUTE__CHILDREN, MetaABMPackage.IATTRIBUTE_CHILD__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaABMPackage.SATTRIBUTE__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((SAttributed) otherEnd, msgs);
			case MetaABMPackage.SATTRIBUTE__CHILDREN:
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
			case MetaABMPackage.SATTRIBUTE__OWNER:
				return basicSetOwner(null, msgs);
			case MetaABMPackage.SATTRIBUTE__CHILDREN:
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
			case MetaABMPackage.SATTRIBUTE__OWNER:
				return eInternalContainer().eInverseRemove(this, MetaABMPackage.SATTRIBUTED__ATTRIBUTES, SAttributed.class, msgs);
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
			case MetaABMPackage.SATTRIBUTE__ACCESSORS:
				return getAccessors();
			case MetaABMPackage.SATTRIBUTE__AVAILABLE_TYPES:
				return getAvailableTypes();
			case MetaABMPackage.SATTRIBUTE__STYPE:
				return getSType();
			case MetaABMPackage.SATTRIBUTE__OWNER:
				return getOwner();
			case MetaABMPackage.SATTRIBUTE__GATHER_DATA:
				return isGatherData();
			case MetaABMPackage.SATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case MetaABMPackage.SATTRIBUTE__UNITS:
				return getUnits();
			case MetaABMPackage.SATTRIBUTE__IMMUTABLE:
				return isImmutable();
			case MetaABMPackage.SATTRIBUTE__DERIVED:
				return isDerived();
			case MetaABMPackage.SATTRIBUTE__CHILDREN:
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
			case MetaABMPackage.SATTRIBUTE__AVAILABLE_TYPES:
				getAvailableTypes().clear();
				getAvailableTypes().addAll((Collection<? extends SAttributeType>) newValue);
				return;
			case MetaABMPackage.SATTRIBUTE__STYPE:
				setSType((SAttributeType) newValue);
				return;
			case MetaABMPackage.SATTRIBUTE__OWNER:
				setOwner((SAttributed) newValue);
				return;
			case MetaABMPackage.SATTRIBUTE__GATHER_DATA:
				setGatherData((Boolean) newValue);
				return;
			case MetaABMPackage.SATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((String) newValue);
				return;
			case MetaABMPackage.SATTRIBUTE__UNITS:
				setUnits((String) newValue);
				return;
			case MetaABMPackage.SATTRIBUTE__IMMUTABLE:
				setImmutable((Boolean) newValue);
				return;
			case MetaABMPackage.SATTRIBUTE__DERIVED:
				setDerived((Boolean) newValue);
				return;
			case MetaABMPackage.SATTRIBUTE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends IAttributeChild>) newValue);
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
			case MetaABMPackage.SATTRIBUTE__AVAILABLE_TYPES:
				getAvailableTypes().clear();
				return;
			case MetaABMPackage.SATTRIBUTE__STYPE:
				setSType(STYPE_EDEFAULT);
				return;
			case MetaABMPackage.SATTRIBUTE__OWNER:
				setOwner((SAttributed) null);
				return;
			case MetaABMPackage.SATTRIBUTE__GATHER_DATA:
				setGatherData(GATHER_DATA_EDEFAULT);
				return;
			case MetaABMPackage.SATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case MetaABMPackage.SATTRIBUTE__UNITS:
				setUnits(UNITS_EDEFAULT);
				return;
			case MetaABMPackage.SATTRIBUTE__IMMUTABLE:
				setImmutable(IMMUTABLE_EDEFAULT);
				return;
			case MetaABMPackage.SATTRIBUTE__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case MetaABMPackage.SATTRIBUTE__CHILDREN:
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
			case MetaABMPackage.SATTRIBUTE__ACCESSORS:
				return !getAccessors().isEmpty();
			case MetaABMPackage.SATTRIBUTE__AVAILABLE_TYPES:
				return !getAvailableTypes().isEmpty();
			case MetaABMPackage.SATTRIBUTE__STYPE:
				return sType != STYPE_EDEFAULT;
			case MetaABMPackage.SATTRIBUTE__OWNER:
				return getOwner() != null;
			case MetaABMPackage.SATTRIBUTE__GATHER_DATA:
				return gatherData != GATHER_DATA_EDEFAULT;
			case MetaABMPackage.SATTRIBUTE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case MetaABMPackage.SATTRIBUTE__UNITS:
				return UNITS_EDEFAULT == null ? units != null : !UNITS_EDEFAULT.equals(units);
			case MetaABMPackage.SATTRIBUTE__IMMUTABLE:
				return immutable != IMMUTABLE_EDEFAULT;
			case MetaABMPackage.SATTRIBUTE__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case MetaABMPackage.SATTRIBUTE__CHILDREN:
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
		if (baseClass == IValue.class) {
			switch (derivedFeatureID) {
				case MetaABMPackage.SATTRIBUTE__ACCESSORS:
					return MetaABMPackage.IVALUE__ACCESSORS;
				case MetaABMPackage.SATTRIBUTE__AVAILABLE_TYPES:
					return MetaABMPackage.IVALUE__AVAILABLE_TYPES;
				default:
					return -1;
			}
		}
		if (baseClass == ITyped.class) {
			switch (derivedFeatureID) {
				case MetaABMPackage.SATTRIBUTE__STYPE:
					return MetaABMPackage.ITYPED__STYPE;
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
					return MetaABMPackage.SATTRIBUTE__ACCESSORS;
				case MetaABMPackage.IVALUE__AVAILABLE_TYPES:
					return MetaABMPackage.SATTRIBUTE__AVAILABLE_TYPES;
				default:
					return -1;
			}
		}
		if (baseClass == ITyped.class) {
			switch (baseFeatureID) {
				case MetaABMPackage.ITYPED__STYPE:
					return MetaABMPackage.SATTRIBUTE__STYPE;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	public EList<SAttributeType> getAvailableTypes() {
		return SAttributeType.getAvailableTypes(sType);
	}

	public boolean accepts(IValue value) {
		return !(value instanceof ITypedArray) && CollectionUtils.containsAny(SAttributeType.getAvailableTypes(getSType()), value.getAvailableTypes());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (sType: ");
		result.append(sType);
		result.append(", gatherData: ");
		result.append(gatherData);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", units: ");
		result.append(units);
		result.append(", immutable: ");
		result.append(immutable);
		result.append(", derived: ");
		result.append(derived);
		result.append(')');
		return result.toString();
	}

	public boolean references(IValue value) {
		return value == this;
	}
} // SAttributeImpl
