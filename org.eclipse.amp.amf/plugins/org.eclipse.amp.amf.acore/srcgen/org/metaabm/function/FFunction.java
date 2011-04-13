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

import org.eclipse.emf.common.util.EList;
import org.metaabm.IID;
import org.metaabm.IValue;
import org.metaabm.SAttributeType;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>FFunction</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.function.FFunction#getAvailableTypes <em>Available Types</em>}</li>
 *   <li>{@link org.metaabm.function.FFunction#getInputPrototypes <em>Input Prototypes</em>}</li>
 *   <li>{@link org.metaabm.function.FFunction#isMultiValue <em>Multi Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.function.MetaABMFunctionPackage#getFFunction()
 * @model abstract="true"
 * @generated
 */
public interface FFunction extends IID {
	/**
	 * Returns the value of the '<em><b>Available Types</b></em>' attribute list. The list contents are of type
	 * {@link org.metaabm.SAttributeType}. The literals are from the enumeration {@link org.metaabm.SAttributeType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Types</em>' attribute list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Available Types</em>' attribute list.
	 * @see org.metaabm.SAttributeType
	 * @see org.metaabm.function.MetaABMFunctionPackage#getFFunction_AvailableTypes()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<SAttributeType> getAvailableTypes();

	/**
	 * Returns the value of the '<em><b>Input Prototypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.function.FArgumentPrototype}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.function.FArgumentPrototype#getInputFunction <em>Input Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Prototypes</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Prototypes</em>' containment reference list.
	 * @see org.metaabm.function.MetaABMFunctionPackage#getFFunction_InputPrototypes()
	 * @see org.metaabm.function.FArgumentPrototype#getInputFunction
	 * @model opposite="inputFunction" containment="true"
	 * @generated
	 */
	EList<FArgumentPrototype> getInputPrototypes();

	public boolean accepts(IValue value, int place);

	boolean isMultiValue();

	/**
	 * Sets the value of the '{@link org.metaabm.function.FFunction#isMultiValue <em>Multi Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Multi Value</em>' attribute.
	 * @see #isMultiValue()
	 * @generated
	 */
	void setMultiValue(boolean value);
	// todo, needa a way to support key-value matching as well as place
} // FFunction
