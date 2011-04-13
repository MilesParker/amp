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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ITyped</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.ITyped#getSType <em>SType</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getITyped()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ITyped extends IID {
	/**
	 * Returns the value of the '<em><b>SType</b></em>' attribute.
	 * The default value is <code>"INTEGER"</code>.
	 * The literals are from the enumeration {@link org.metaabm.SAttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SType</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SType</em>' attribute.
	 * @see org.metaabm.SAttributeType
	 * @see #setSType(SAttributeType)
	 * @see org.metaabm.MetaABMPackage#getITyped_SType()
	 * @model default="INTEGER" required="true"
	 * @generated
	 */
	SAttributeType getSType();

	/**
	 * Sets the value of the '{@link org.metaabm.ITyped#getSType <em>SType</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>SType</em>' attribute.
	 * @see org.metaabm.SAttributeType
	 * @see #getSType()
	 * @generated
	 */
	void setSType(SAttributeType value);

} // ITyped
