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
package org.metaabm;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SGrid</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SGrid#isMultiOccupant <em>Multi Occupant</em>}</li>
 *   <li>{@link org.metaabm.SGrid#getNeighborhood <em>Neighborhood</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSGrid()
 * @model
 * @generated
 */
public interface SGrid extends SNDimensional {
	/**
	 * Returns the value of the '<em><b>Multi Occupant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Occupant</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Occupant</em>' attribute.
	 * @see #setMultiOccupant(boolean)
	 * @see org.metaabm.MetaABMPackage#getSGrid_MultiOccupant()
	 * @model default="false"
	 * @generated
	 */
	boolean isMultiOccupant();

	/**
	 * Sets the value of the '{@link org.metaabm.SGrid#isMultiOccupant <em>Multi Occupant</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Multi Occupant</em>' attribute.
	 * @see #isMultiOccupant()
	 * @generated
	 */
	void setMultiOccupant(boolean value);

	/**
	 * Returns the value of the '<em><b>Neighborhood</b></em>' attribute.
	 * The literals are from the enumeration {@link org.metaabm.SNeighborhoodType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neighborhood</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighborhood</em>' attribute.
	 * @see org.metaabm.SNeighborhoodType
	 * @see #setNeighborhood(SNeighborhoodType)
	 * @see org.metaabm.MetaABMPackage#getSGrid_Neighborhood()
	 * @model required="true"
	 * @generated
	 */
	SNeighborhoodType getNeighborhood();

	/**
	 * Sets the value of the '{@link org.metaabm.SGrid#getNeighborhood <em>Neighborhood</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Neighborhood</em>' attribute.
	 * @see org.metaabm.SNeighborhoodType
	 * @see #getNeighborhood()
	 * @generated
	 */
	void setNeighborhood(SNeighborhoodType value);

} // SGrid
