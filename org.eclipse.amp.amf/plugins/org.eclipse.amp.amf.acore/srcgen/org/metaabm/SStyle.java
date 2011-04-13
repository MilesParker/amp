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
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SStyle</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SStyle#getAgent <em>Agent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSStyle()
 * @model abstract="true"
 * @generated
 */
public interface SStyle extends SActable, SImplemented {
	/**
	 * Returns the value of the '<em><b>Agent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SAgent#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent</em>' container reference.
	 * @see #setAgent(SAgent)
	 * @see org.metaabm.MetaABMPackage#getSStyle_Agent()
	 * @see org.metaabm.SAgent#getStyles
	 * @model opposite="styles" required="true" transient="false"
	 * @generated
	 */
	SAgent getAgent();

	/**
	 * Sets the value of the '{@link org.metaabm.SStyle#getAgent <em>Agent</em>}' container reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent</em>' container reference.
	 * @see #getAgent()
	 * @generated
	 */
	void setAgent(SAgent value);

} // SStyle