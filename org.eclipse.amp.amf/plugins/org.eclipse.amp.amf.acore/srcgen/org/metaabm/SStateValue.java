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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SState
 * Value</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SStateValue#getSet <em>Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSStateValue()
 * @model
 * @generated
 */
public interface SStateValue extends SNamed, IValue {
	/**
	 * Returns the value of the '<em><b>Set</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SState#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set</em>' container reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set</em>' container reference.
	 * @see #setSet(SState)
	 * @see org.metaabm.MetaABMPackage#getSStateValue_Set()
	 * @see org.metaabm.SState#getOptions
	 * @model opposite="options" required="true" transient="false"
	 * @generated
	 */
	SState getSet();

	/**
	 * Sets the value of the '{@link org.metaabm.SStateValue#getSet <em>Set</em>}' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Set</em>' container reference.
	 * @see #getSet()
	 * @generated
	 */
	void setSet(SState value);

} // SStateValue
