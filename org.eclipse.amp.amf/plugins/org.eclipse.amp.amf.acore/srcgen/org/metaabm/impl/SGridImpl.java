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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.metaabm.MetaABMPackage;
import org.metaabm.SGrid;
import org.metaabm.SNeighborhoodType;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SGrid</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.metaabm.impl.SGridImpl#isMultiOccupant <em>Multi Occupant</em>}</li>
 *   <li>{@link org.metaabm.impl.SGridImpl#getNeighborhood <em>Neighborhood</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SGridImpl extends SNDimensionalImpl implements SGrid {
	/**
	 * The default value of the '{@link #isMultiOccupant() <em>Multi Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiOccupant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_OCCUPANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMultiOccupant() <em>Multi Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMultiOccupant()
	 * @generated
	 * @ordered
	 */
	protected boolean multiOccupant = MULTI_OCCUPANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeighborhood() <em>Neighborhood</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNeighborhood()
	 * @generated
	 * @ordered
	 */
	protected static final SNeighborhoodType NEIGHBORHOOD_EDEFAULT = SNeighborhoodType.EUCLIDIAN;

	/**
	 * The cached value of the '{@link #getNeighborhood() <em>Neighborhood</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getNeighborhood()
	 * @generated
	 * @ordered
	 */
	protected SNeighborhoodType neighborhood = NEIGHBORHOOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SGRID;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMultiOccupant() {
		return multiOccupant;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiOccupant(boolean newMultiOccupant) {
		boolean oldMultiOccupant = multiOccupant;
		multiOccupant = newMultiOccupant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SGRID__MULTI_OCCUPANT, oldMultiOccupant, multiOccupant));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SNeighborhoodType getNeighborhood() {
		return neighborhood;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeighborhood(SNeighborhoodType newNeighborhood) {
		SNeighborhoodType oldNeighborhood = neighborhood;
		neighborhood = newNeighborhood == null ? NEIGHBORHOOD_EDEFAULT : newNeighborhood;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaABMPackage.SGRID__NEIGHBORHOOD, oldNeighborhood, neighborhood));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaABMPackage.SGRID__MULTI_OCCUPANT:
				return isMultiOccupant();
			case MetaABMPackage.SGRID__NEIGHBORHOOD:
				return getNeighborhood();
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
			case MetaABMPackage.SGRID__MULTI_OCCUPANT:
				setMultiOccupant((Boolean) newValue);
				return;
			case MetaABMPackage.SGRID__NEIGHBORHOOD:
				setNeighborhood((SNeighborhoodType) newValue);
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
			case MetaABMPackage.SGRID__MULTI_OCCUPANT:
				setMultiOccupant(MULTI_OCCUPANT_EDEFAULT);
				return;
			case MetaABMPackage.SGRID__NEIGHBORHOOD:
				setNeighborhood(NEIGHBORHOOD_EDEFAULT);
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
			case MetaABMPackage.SGRID__MULTI_OCCUPANT:
				return multiOccupant != MULTI_OCCUPANT_EDEFAULT;
			case MetaABMPackage.SGRID__NEIGHBORHOOD:
				return neighborhood != NEIGHBORHOOD_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (multiOccupant: ");
		result.append(multiOccupant);
		result.append(", neighborhood: ");
		result.append(neighborhood);
		result.append(')');
		return result.toString();
	}

} // SGridImpl
