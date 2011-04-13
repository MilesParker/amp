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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>AConnect</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.AConnect#isDirected <em>Directed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getAConnect()
 * @model
 * @generated
 */
public interface AConnect extends ANetwork {
	/**
	 * Returns the value of the '<em><b>Directed</b></em>' attribute. The default value is <code>"true"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directed</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Directed</em>' attribute.
	 * @see #setDirected(boolean)
	 * @see org.metaabm.act.MetaABMActPackage#getAConnect_Directed()
	 * @model default="true"
	 * @generated
	 */
	boolean isDirected();

	/**
	 * Sets the value of the '{@link org.metaabm.act.AConnect#isDirected <em>Directed</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Directed</em>' attribute.
	 * @see #isDirected()
	 * @generated
	 */
	void setDirected(boolean value);

} // AConnect
