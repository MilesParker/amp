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

import org.metaabm.SNamed;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>AMethod</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.AMethod#getBody <em>Body</em>}</li>
 *   <li>{@link org.metaabm.act.AMethod#isGenerate <em>Generate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getAMethod()
 * @model
 * @generated
 */
public interface AMethod extends AAct, SNamed {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see org.metaabm.act.MetaABMActPackage#getAMethod_Body()
	 * @model
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link org.metaabm.act.AMethod#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

	/**
	 * Returns the value of the '<em><b>Generate</b></em>' attribute. The default value is <code>"true"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Generate</em>' attribute.
	 * @see #setGenerate(boolean)
	 * @see org.metaabm.act.MetaABMActPackage#getAMethod_Generate()
	 * @model default="true"
	 * @generated
	 */
	boolean isGenerate();

	/**
	 * Sets the value of the '{@link org.metaabm.act.AMethod#isGenerate <em>Generate</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate</em>' attribute.
	 * @see #isGenerate()
	 * @generated
	 */
	void setGenerate(boolean value);

} // AMethod
