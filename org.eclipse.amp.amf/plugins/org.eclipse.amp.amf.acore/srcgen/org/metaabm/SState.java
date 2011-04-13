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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SState</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SState#getOptions <em>Options</em>}</li>
 *   <li>{@link org.metaabm.SState#getDefaultOption <em>Default Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSState()
 * @model
 * @generated
 */
public interface SState extends SAttribute {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.SStateValue}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SStateValue#getSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see org.metaabm.MetaABMPackage#getSState_Options()
	 * @see org.metaabm.SStateValue#getSet
	 * @model opposite="set" containment="true" required="true"
	 * @generated
	 */
	EList<SStateValue> getOptions();

	/**
	 * Returns the value of the '<em><b>Default Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Option</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Option</em>' reference.
	 * @see #setDefaultOption(SStateValue)
	 * @see org.metaabm.MetaABMPackage#getSState_DefaultOption()
	 * @model
	 * @generated
	 */
	SStateValue getDefaultOption();

	/**
	 * Sets the value of the '{@link org.metaabm.SState#getDefaultOption <em>Default Option</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Default Option</em>' reference.
	 * @see #getDefaultOption()
	 * @generated
	 */
	void setDefaultOption(SStateValue value);

} // SState
