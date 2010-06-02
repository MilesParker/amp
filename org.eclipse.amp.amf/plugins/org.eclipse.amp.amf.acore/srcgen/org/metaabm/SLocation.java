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
 * <em><b>SLocation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.metaabm.SLocation#getProjection <em>Projection</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.metaabm.MetaABMPackage#getSLocation()
 * @model
 * @generated
 */
public interface SLocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Projection</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Projection</em>' reference.
	 * @see #setProjection(SProjection)
	 * @see org.metaabm.MetaABMPackage#getSLocation_Projection()
	 * @model resolveProxies="false"
	 * @generated
	 */
	SProjection getProjection();

	/**
	 * Sets the value of the '{@link org.metaabm.SLocation#getProjection
	 * <em>Projection</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Projection</em>' reference.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(SProjection value);

} // SLocation
