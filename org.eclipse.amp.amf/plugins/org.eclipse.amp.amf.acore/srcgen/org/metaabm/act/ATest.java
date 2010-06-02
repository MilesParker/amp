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

import org.metaabm.function.FLogical;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>ATest</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are supported:
 *         <ul>
 *         <li>{@link org.metaabm.act.ATest#getFunction <em>Condition</em>}</li>
 *         </ul>
 *         </p>
 * @see org.metaabm.act.MetaABMActPackage#getATest()
 * @model
 * @generated
 */
public interface ATest extends AAct, ASink {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "";

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(FLogical)
	 * @see org.metaabm.act.MetaABMActPackage#getATest_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FLogical getFunction();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ATest#getFunction
	 * <em>Condition</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Condition</em>' containment
	 *            reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setCondition(FLogical value);

} // ATest
