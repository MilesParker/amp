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
package org.metaabm.act;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ABuild
 * Space</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ABuildSpace#getSpaceType <em>Space Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getABuildSpace()
 * @model
 * @generated
 */
public interface ABuildSpace extends ABuildProjection {
	/**
	 * Returns the value of the '<em><b>Space Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.metaabm.act.ABuildSpaceTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space Type</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space Type</em>' attribute.
	 * @see org.metaabm.act.ABuildSpaceTypes
	 * @see #setSpaceType(ABuildSpaceTypes)
	 * @see org.metaabm.act.MetaABMActPackage#getABuildSpace_SpaceType()
	 * @model required="true"
	 * @generated
	 */
	ABuildSpaceTypes getSpaceType();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ABuildSpace#getSpaceType <em>Space Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Space Type</em>' attribute.
	 * @see org.metaabm.act.ABuildSpaceTypes
	 * @see #getSpaceType()
	 * @generated
	 */
	void setSpaceType(ABuildSpaceTypes value);

} // ABuildSpace
