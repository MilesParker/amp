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

import org.metaabm.IID;
import org.metaabm.SAgent;
import org.metaabm.SProjection;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ASelect</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ASelect#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.metaabm.act.ASelect#getSpace <em>Space</em>}</li>
 *   <li>{@link org.metaabm.act.ASelect#getFor <em>For</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getASelect()
 * @model
 * @generated
 */
public interface ASelect extends AAct, IID {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' reference.
	 * @see #setAgent(SAgent)
	 * @see org.metaabm.act.MetaABMActPackage#getASelect_Agent()
	 * @model
	 * @generated
	 */
	SAgent getAgent();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ASelect#getAgent <em>Agent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(SAgent value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Space</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' reference.
	 * @see #setSpace(SProjection)
	 * @see org.metaabm.act.MetaABMActPackage#getASelect_Space()
	 * @model
	 * @generated
	 */
	SProjection getSpace();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ASelect#getSpace <em>Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' reference.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(SProjection value);

	/**
	 * Returns the value of the '<em><b>For</b></em>' attribute.
	 * The literals are from the enumeration {@link org.metaabm.act.ASelectTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>For</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>For</em>' attribute.
	 * @see org.metaabm.act.ASelectTypes
	 * @see #setFor(ASelectTypes)
	 * @see org.metaabm.act.MetaABMActPackage#getASelect_For()
	 * @model required="true"
	 * @generated
	 */
	ASelectTypes getFor();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ASelect#getFor <em>For</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>For</em>' attribute.
	 * @see org.metaabm.act.ASelectTypes
	 * @see #getFor()
	 * @generated
	 */
	void setFor(ASelectTypes value);

} // ASelect
