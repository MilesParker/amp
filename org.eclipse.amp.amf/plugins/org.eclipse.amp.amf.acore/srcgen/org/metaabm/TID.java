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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>TID</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are supported:
 *         <ul>
 *         <li>{@link org.metaabm.TID#getID <em>ID</em>}</li>
 *         </ul>
 *         </p>
 * @see org.metaabmPackage#getTID()
 * @model
 * @generated
 */
public interface TID extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "";

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute. The default
	 * value is <code>""</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see org.metaabmPackage#getTID_ID()
	 * @model default=""
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link org.metaabm.TID#getID <em>ID</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

} // TID
