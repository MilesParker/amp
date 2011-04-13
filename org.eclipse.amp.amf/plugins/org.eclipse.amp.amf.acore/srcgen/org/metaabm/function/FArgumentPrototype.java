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

import org.metaabm.ITyped;
import org.metaabm.IValue;
import org.metaabm.SNamed;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>FArgument Prototype</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.function.FArgumentPrototype#getInputFunction <em>Input Function</em>}</li>
 *   <li>{@link org.metaabm.function.FArgumentPrototype#getOutputFunction <em>Output Function</em>}</li>
 *   <li>{@link org.metaabm.function.FArgumentPrototype#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.function.MetaABMFunctionPackage#getFArgumentPrototype()
 * @model
 * @generated
 */
public interface FArgumentPrototype extends ITyped, SNamed {
	/**
	 * Returns the value of the '<em><b>Input Function</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.function.FFunction#getInputPrototypes <em>Input Prototypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Function</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Function</em>' container reference.
	 * @see #setInputFunction(FFunction)
	 * @see org.metaabm.function.MetaABMFunctionPackage#getFArgumentPrototype_InputFunction()
	 * @see org.metaabm.function.FFunction#getInputPrototypes
	 * @model opposite="inputPrototypes" transient="false"
	 * @generated
	 */
	FFunction getInputFunction();

	/**
	 * Sets the value of the '{@link org.metaabm.function.FArgumentPrototype#getInputFunction <em>Input Function</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Function</em>' container reference.
	 * @see #getInputFunction()
	 * @generated
	 */
	void setInputFunction(FFunction value);

	/**
	 * Returns the value of the '<em><b>Output Function</b></em>' container reference. It is bidirectional and its
	 * opposite is '{@link org.metaabm.function.FGenericFunction#getOutputPrototypes <em>Output Prototypes</em>}'. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Function</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Output Function</em>' container reference.
	 * @see #setOutputFunction(FGenericFunction)
	 * @see org.metaabm.function.MetaABMFunctionPackage#getFArgumentPrototype_OutputFunction()
	 * @see org.metaabm.function.FGenericFunction#getOutputPrototypes
	 * @model opposite="outputPrototypes" resolveProxies="false" transient="false"
	 * @generated
	 */
	FGenericFunction getOutputFunction();

	/**
	 * Sets the value of the '{@link org.metaabm.function.FArgumentPrototype#getOutputFunction <em>Output Function</em>}' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Function</em>' container reference.
	 * @see #getOutputFunction()
	 * @generated
	 */
	void setOutputFunction(FGenericFunction value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.metaabm.function.MetaABMFunctionPackage#getFArgumentPrototype_Optional()
	 * @model
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.metaabm.function.FArgumentPrototype#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	public boolean accepts(IValue value);
} // FArgumentPrototype
