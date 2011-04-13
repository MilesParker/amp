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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SProjection</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SProjection#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSProjection()
 * @model abstract="true"
 * @generated
 */
public interface SProjection extends SAttributed, IID {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SContext#getProjections <em>Projections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(SContext)
	 * @see org.metaabm.MetaABMPackage#getSProjection_Owner()
	 * @see org.metaabm.SContext#getProjections
	 * @model opposite="projections" transient="false"
	 * @generated
	 */
	SContext getOwner();

	/**
	 * Sets the value of the '{@link org.metaabm.SProjection#getOwner <em>Owner</em>}' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(SContext value);

} // SProjection