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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SNamed;
import org.metaabm.SProjection;
import org.metaabm.act.ABuildProjection;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>ABuild
 * Projection</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link
 * org.metaabm.act.impl.ABuildProjectionImpl#getPluralLabel <em>Plural
 * Label</em>}</li> <li>{@link
 * org.metaabm.act.impl.ABuildProjectionImpl#getDescription
 * <em>Description</em>}</li> <li>{@link
 * org.metaabm.act.impl.ABuildProjectionImpl#getAgents <em>Agents</em>}</li>
 * <li>{@link org.metaabm.act.impl.ABuildProjectionImpl#getProjection
 * <em>Projection</em>}</li> <li>{@link
 * org.metaabm.act.impl.ABuildProjectionImpl#getAttributes
 * <em>Attributes</em>}</li> </ul> </p>
 * @generated
 */
public abstract class ABuildProjectionImpl extends AActImpl implements ABuildProjection {
	/**
	 * The default value of the '{@link #getPluralLabel() <em>Plural Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPluralLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String PLURAL_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPluralLabel() <em>Plural Label</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPluralLabel()
	 * @generated
	 * @ordered
	 */
	protected String pluralLabel = PLURAL_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<SAgent> agents;

	/**
	 * The cached value of the '{@link #getProjection() <em>Projection</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProjection()
	 * @generated
	 * @ordered
	 */
	protected SProjection projection;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<SAttribute> attributes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ABuildProjectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ABUILD_PROJECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getPluralLabel() {
		return pluralLabel;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPluralLabel(String newPluralLabel) {
		String oldPluralLabel = pluralLabel;
		pluralLabel = newPluralLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ABUILD_PROJECTION__PLURAL_LABEL, oldPluralLabel, pluralLabel));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ABUILD_PROJECTION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAgent> getAgents() {
		if (agents == null) {
			agents = new EObjectResolvingEList<SAgent>(SAgent.class, this, MetaABMActPackage.ABUILD_PROJECTION__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SProjection getProjection() {
		if (projection != null && projection.eIsProxy()) {
			InternalEObject oldProjection = (InternalEObject) projection;
			projection = (SProjection) eResolveProxy(oldProjection);
			if (projection != oldProjection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaABMActPackage.ABUILD_PROJECTION__PROJECTION, oldProjection, projection));
			}
		}
		return projection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SProjection basicGetProjection() {
		return projection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjection(SProjection newProjection) {
		SProjection oldProjection = projection;
		projection = newProjection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ABUILD_PROJECTION__PROJECTION, oldProjection, projection));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectResolvingEList<SAttribute>(SAttribute.class, this, MetaABMActPackage.ABUILD_PROJECTION__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ABUILD_PROJECTION__PLURAL_LABEL:
				return getPluralLabel();
			case MetaABMActPackage.ABUILD_PROJECTION__DESCRIPTION:
				return getDescription();
			case MetaABMActPackage.ABUILD_PROJECTION__AGENTS:
				return getAgents();
			case MetaABMActPackage.ABUILD_PROJECTION__PROJECTION:
				if (resolve)
					return getProjection();
				return basicGetProjection();
			case MetaABMActPackage.ABUILD_PROJECTION__ATTRIBUTES:
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
			case MetaABMActPackage.ABUILD_PROJECTION__PLURAL_LABEL:
				setPluralLabel((String) newValue);
				return;
			case MetaABMActPackage.ABUILD_PROJECTION__DESCRIPTION:
				setDescription((String) newValue);
				return;
			case MetaABMActPackage.ABUILD_PROJECTION__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends SAgent>) newValue);
				return;
			case MetaABMActPackage.ABUILD_PROJECTION__PROJECTION:
				setProjection((SProjection) newValue);
				return;
			case MetaABMActPackage.ABUILD_PROJECTION__ATTRIBUTES:
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
			case MetaABMActPackage.ABUILD_PROJECTION__PLURAL_LABEL:
				setPluralLabel(PLURAL_LABEL_EDEFAULT);
				return;
			case MetaABMActPackage.ABUILD_PROJECTION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MetaABMActPackage.ABUILD_PROJECTION__AGENTS:
				getAgents().clear();
				return;
			case MetaABMActPackage.ABUILD_PROJECTION__PROJECTION:
				setProjection((SProjection) null);
				return;
			case MetaABMActPackage.ABUILD_PROJECTION__ATTRIBUTES:
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
			case MetaABMActPackage.ABUILD_PROJECTION__PLURAL_LABEL:
				return PLURAL_LABEL_EDEFAULT == null ? pluralLabel != null : !PLURAL_LABEL_EDEFAULT.equals(pluralLabel);
			case MetaABMActPackage.ABUILD_PROJECTION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MetaABMActPackage.ABUILD_PROJECTION__AGENTS:
				return agents != null && !agents.isEmpty();
			case MetaABMActPackage.ABUILD_PROJECTION__PROJECTION:
				return projection != null;
			case MetaABMActPackage.ABUILD_PROJECTION__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SNamed.class) {
			switch (derivedFeatureID) {
				case MetaABMActPackage.ABUILD_PROJECTION__PLURAL_LABEL:
					return MetaABMPackage.SNAMED__PLURAL_LABEL;
				case MetaABMActPackage.ABUILD_PROJECTION__DESCRIPTION:
					return MetaABMPackage.SNAMED__DESCRIPTION;
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
		if (baseClass == SNamed.class) {
			switch (baseFeatureID) {
				case MetaABMPackage.SNAMED__PLURAL_LABEL:
					return MetaABMActPackage.ABUILD_PROJECTION__PLURAL_LABEL;
				case MetaABMPackage.SNAMED__DESCRIPTION:
					return MetaABMActPackage.ABUILD_PROJECTION__DESCRIPTION;
				default:
					return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (pluralLabel: ");
		result.append(pluralLabel);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} // ABuildProjectionImpl
