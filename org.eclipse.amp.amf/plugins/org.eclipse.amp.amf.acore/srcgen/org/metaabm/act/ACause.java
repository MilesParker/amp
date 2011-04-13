/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.act;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>ACause</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ACause#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getACause()
 * @model
 * @generated
 */
public interface ACause extends ACommand {

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see #setResult(ARoot)
	 * @see org.metaabm.act.MetaABMActPackage#getACause_Result()
	 * @model required="true"
	 * @generated
	 */
	ARoot getResult();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ACause#getResult <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' reference.
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ARoot value);
} // ACause
