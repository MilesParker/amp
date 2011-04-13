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

import org.eclipse.emf.common.util.EList;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SNamed;
import org.metaabm.SProjection;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ABuild
 * Projection</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ABuildProjection#getAgents <em>Agents</em>}</li>
 *   <li>{@link org.metaabm.act.ABuildProjection#getProjection <em>Projection</em>}</li>
 *   <li>{@link org.metaabm.act.ABuildProjection#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getABuildProjection()
 * @model abstract="true"
 * @generated
 */
public interface ABuildProjection extends AAct, SNamed {
	/**
	 * Returns the value of the '<em><b>Agents</b></em>' reference list.
	 * The list contents are of type {@link org.metaabm.SAgent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' reference list.
	 * @see org.metaabm.act.MetaABMActPackage#getABuildProjection_Agents()
	 * @model
	 * @generated
	 */
	EList<SAgent> getAgents();

	/**
	 * Returns the value of the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection</em>' reference.
	 * @see #setProjection(SProjection)
	 * @see org.metaabm.act.MetaABMActPackage#getABuildProjection_Projection()
	 * @model required="true"
	 * @generated
	 */
	SProjection getProjection();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ABuildProjection#getProjection <em>Projection</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Projection</em>' reference.
	 * @see #getProjection()
	 * @generated
	 */
	void setProjection(SProjection value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.metaabm.SAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see org.metaabm.act.MetaABMActPackage#getABuildProjection_Attributes()
	 * @model
	 * @generated
	 */
	EList<SAttribute> getAttributes();

} // ABuildProjection
