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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>IAttribute Client</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are supported:
 *         <ul>
 *         <li>{@link org.metaabm.IAttributeClient#getAttribute <em>Attribute
 *         </em>}</li>
 *         </ul>
 *         </p>
 * @see org.metaabmPackage#getIAttributeClient()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IAttributeClient extends IID {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference. It is
	 * bidirectional and its opposite is '
	 * {@link org.metaabm.SAttribute#getAccessors <em>Accessors</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(SAttribute)
	 * @see org.metaabmPackage#getIAttributeClient_Attribute()
	 * @see org.metaabm.SAttribute#getAccessors
	 * @model opposite="accessors" required="true" ordered="false"
	 * @generated
	 */
	SAttribute getAttribute();

	/**
	 * Sets the value of the '{@link org.metaabm.IAttributeClient#getAttribute
	 * <em>Attribute</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(SAttribute value);

} // IAttributeClient
