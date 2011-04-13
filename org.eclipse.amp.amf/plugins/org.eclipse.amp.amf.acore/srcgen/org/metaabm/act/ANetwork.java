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

import org.metaabm.SNetwork;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ANetwork</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ANetwork#getWithin <em>Within</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getANetwork()
 * @model abstract="true"
 * @generated
 */
public interface ANetwork extends ATransform {
	/**
	 * Returns the value of the '<em><b>Within</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Within</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Within</em>' reference.
	 * @see #setWithin(SNetwork)
	 * @see org.metaabm.act.MetaABMActPackage#getANetwork_Within()
	 * @model required="true"
	 * @generated
	 */
	SNetwork getWithin();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ANetwork#getWithin <em>Within</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Within</em>' reference.
	 * @see #getWithin()
	 * @generated
	 */
	void setWithin(SNetwork value);

} // ANetwork
