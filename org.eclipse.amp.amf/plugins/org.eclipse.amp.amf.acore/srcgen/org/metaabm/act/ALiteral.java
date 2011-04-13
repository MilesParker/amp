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

import org.metaabm.IValue;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ALiteral</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ALiteral#getValueLiteral <em>Value Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getALiteral()
 * @model
 * @generated
 */
public interface ALiteral extends IValue {
	/**
	 * Returns the value of the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Literal</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Literal</em>' attribute.
	 * @see #setValueLiteral(String)
	 * @see org.metaabm.act.MetaABMActPackage#getALiteral_ValueLiteral()
	 * @model required="true"
	 * @generated
	 */
	String getValueLiteral();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ALiteral#getValueLiteral <em>Value Literal</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Value Literal</em>' attribute.
	 * @see #getValueLiteral()
	 * @generated
	 */
	void setValueLiteral(String value);

} // ALiteral
