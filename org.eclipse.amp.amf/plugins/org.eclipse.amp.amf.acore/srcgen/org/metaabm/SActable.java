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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SActable</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SActable#getRootActivity <em>Root Activity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSActable()
 * @model abstract="true"
 * @generated
 */
public interface SActable extends SAttributed {
	/**
	 * Returns the value of the '<em><b>Root Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Activity</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Activity</em>' containment reference.
	 * @see #setRootActivity(IAct)
	 * @see org.metaabm.MetaABMPackage#getSActable_RootActivity()
	 * @model containment="true" keys="ID"
	 * @generated
	 */
	IAct getRootActivity();

	/**
	 * Sets the value of the '{@link org.metaabm.SActable#getRootActivity <em>Root Activity</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Activity</em>' containment reference.
	 * @see #getRootActivity()
	 * @generated
	 */
	void setRootActivity(IAct value);
} // SActable
