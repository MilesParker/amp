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

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>FGeneric Function</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.function.FGenericFunction#getOutputPrototypes <em>Output Prototypes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.function.MetaABMFunctionPackage#getFGenericFunction()
 * @model
 * @generated
 */
public interface FGenericFunction extends FGeneric, FFunction {
	/**
	 * Returns the value of the '<em><b>Output Prototypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.function.FArgumentPrototype}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.function.FArgumentPrototype#getOutputFunction <em>Output Function</em>}'.
	 * <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Output Prototypes</em>' containment reference list isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Prototypes</em>' containment reference list.
	 * @see org.metaabm.function.MetaABMFunctionPackage#getFGenericFunction_OutputPrototypes()
	 * @see org.metaabm.function.FArgumentPrototype#getOutputFunction
	 * @model opposite="outputFunction" containment="true"
	 * @generated
	 */
	EList<FArgumentPrototype> getOutputPrototypes();

} // FGenericFunction
