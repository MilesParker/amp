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

import org.metaabm.SAgent;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ABuild
 * Grid</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ABuildGrid#getFillAgent <em>Fill Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getABuildGrid()
 * @model
 * @generated
 */
public interface ABuildGrid extends ABuildSpace {
	/**
	 * Returns the value of the '<em><b>Fill Agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Agent</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Agent</em>' reference.
	 * @see #setFillAgent(SAgent)
	 * @see org.metaabm.act.MetaABMActPackage#getABuildGrid_FillAgent()
	 * @model
	 * @generated
	 */
	SAgent getFillAgent();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ABuildGrid#getFillAgent <em>Fill Agent</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Fill Agent</em>' reference.
	 * @see #getFillAgent()
	 * @generated
	 */
	void setFillAgent(SAgent value);

} // ABuildGrid
