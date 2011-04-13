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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metaabm.MetaABMPackage;
import org.metaabm.SNamed;
import org.metaabm.act.ASchedule;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>ASchedule</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> The following features are
 * implemented: <ul> <li>{@link
 * org.metaabm.act.impl.AScheduleImpl#getPluralLabel <em>Plural Label</em>}</li>
 * <li>{@link org.metaabm.act.impl.AScheduleImpl#getDescription
 * <em>Description</em>}</li> <li>{@link
 * org.metaabm.act.impl.AScheduleImpl#getStart <em>Start</em>}</li> <li>{@link
 * org.metaabm.act.impl.AScheduleImpl#getInterval <em>Interval</em>}</li>
 * <li>{@link org.metaabm.act.impl.AScheduleImpl#getPriority
 * <em>Priority</em>}</li> <li>{@link org.metaabm.act.impl.AScheduleImpl#getPick
 * <em>Pick</em>}</li> </ul> </p>
 * @generated
 */
public class AScheduleImpl extends ASelectImpl implements ASchedule {
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
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected int interval = INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPick() <em>Pick</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPick()
	 * @generated
	 * @ordered
	 */
	protected static final int PICK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPick() <em>Pick</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPick()
	 * @generated
	 * @ordered
	 */
	protected int pick = PICK_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMActPackage.Literals.ASCHEDULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ASCHEDULE__PLURAL_LABEL, oldPluralLabel, pluralLabel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ASCHEDULE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(int newStart) {
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ASCHEDULE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(int newInterval) {
		int oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ASCHEDULE__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ASCHEDULE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getPick() {
		return pick;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setPick(int newPick) {
		int oldPick = pick;
		pick = newPick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMActPackage.ASCHEDULE__PICK, oldPick, pick));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMActPackage.ASCHEDULE__PLURAL_LABEL:
				return getPluralLabel();
			case MetaABMActPackage.ASCHEDULE__DESCRIPTION:
				return getDescription();
			case MetaABMActPackage.ASCHEDULE__START:
				return getStart();
			case MetaABMActPackage.ASCHEDULE__INTERVAL:
				return getInterval();
			case MetaABMActPackage.ASCHEDULE__PRIORITY:
				return getPriority();
			case MetaABMActPackage.ASCHEDULE__PICK:
				return getPick();
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
			case MetaABMActPackage.ASCHEDULE__PLURAL_LABEL:
				setPluralLabel((String) newValue);
				return;
			case MetaABMActPackage.ASCHEDULE__DESCRIPTION:
				setDescription((String) newValue);
				return;
			case MetaABMActPackage.ASCHEDULE__START:
				setStart((Integer) newValue);
				return;
			case MetaABMActPackage.ASCHEDULE__INTERVAL:
				setInterval((Integer) newValue);
				return;
			case MetaABMActPackage.ASCHEDULE__PRIORITY:
				setPriority((Integer) newValue);
				return;
			case MetaABMActPackage.ASCHEDULE__PICK:
				setPick((Integer) newValue);
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
			case MetaABMActPackage.ASCHEDULE__PLURAL_LABEL:
				setPluralLabel(PLURAL_LABEL_EDEFAULT);
				return;
			case MetaABMActPackage.ASCHEDULE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MetaABMActPackage.ASCHEDULE__START:
				setStart(START_EDEFAULT);
				return;
			case MetaABMActPackage.ASCHEDULE__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case MetaABMActPackage.ASCHEDULE__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case MetaABMActPackage.ASCHEDULE__PICK:
				setPick(PICK_EDEFAULT);
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
			case MetaABMActPackage.ASCHEDULE__PLURAL_LABEL:
				return PLURAL_LABEL_EDEFAULT == null ? pluralLabel != null : !PLURAL_LABEL_EDEFAULT.equals(pluralLabel);
			case MetaABMActPackage.ASCHEDULE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case MetaABMActPackage.ASCHEDULE__START:
				return start != START_EDEFAULT;
			case MetaABMActPackage.ASCHEDULE__INTERVAL:
				return interval != INTERVAL_EDEFAULT;
			case MetaABMActPackage.ASCHEDULE__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case MetaABMActPackage.ASCHEDULE__PICK:
				return pick != PICK_EDEFAULT;
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
				case MetaABMActPackage.ASCHEDULE__PLURAL_LABEL:
					return MetaABMPackage.SNAMED__PLURAL_LABEL;
				case MetaABMActPackage.ASCHEDULE__DESCRIPTION:
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
					return MetaABMActPackage.ASCHEDULE__PLURAL_LABEL;
				case MetaABMPackage.SNAMED__DESCRIPTION:
					return MetaABMActPackage.ASCHEDULE__DESCRIPTION;
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
		result.append(", start: ");
		result.append(start);
		result.append(", interval: ");
		result.append(interval);
		result.append(", priority: ");
		result.append(priority);
		result.append(", pick: ");
		result.append(pick);
		result.append(')');
		return result.toString();
	}
} // AScheduleImpl
