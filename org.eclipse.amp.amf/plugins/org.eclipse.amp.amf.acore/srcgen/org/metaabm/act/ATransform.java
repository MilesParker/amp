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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ATransform</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ATransform#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getATransform()
 * @model abstract="true"
 * @generated
 */
public interface ATransform extends ACommand {

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(ASelect)
	 * @see org.metaabm.act.MetaABMActPackage#getATransform_Destination()
	 * @model required="true"
	 * @generated
	 */
	ASelect getDestination();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ATransform#getDestination <em>Destination</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(ASelect value);

} // ATransform
