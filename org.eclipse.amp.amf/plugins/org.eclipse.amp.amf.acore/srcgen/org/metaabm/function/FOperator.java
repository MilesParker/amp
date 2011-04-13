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
package org.metaabm.function;

import org.metaabm.SNamed;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>FOperator</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.function.FOperator#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.metaabm.function.FOperator#getArity <em>Arity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.function.MetaABMFunctionPackage#getFOperator()
 * @model
 * @generated
 */
public interface FOperator extends FFunction, SNamed {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.metaabm.function.MetaABMFunctionPackage#getFOperator_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link org.metaabm.function.FOperator#getSymbol <em>Symbol</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arity</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arity</em>' attribute.
	 * @see org.metaabm.function.MetaABMFunctionPackage#getFOperator_Arity()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	int getArity();

} // FOperator
