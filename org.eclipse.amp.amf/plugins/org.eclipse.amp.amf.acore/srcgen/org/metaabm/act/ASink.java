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

import org.eclipse.emf.common.util.EList;
import org.metaabm.IValue;
import org.metaabm.function.FFunction;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ASink</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ASink#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.metaabm.act.ASink#getFunction <em>Function</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getASink()
 * @model abstract="true"
 * @generated
 */
public interface ASink extends AAct, IValue {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.act.AInput}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.act.AInput#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' containment reference list.
	 * @see org.metaabm.act.MetaABMActPackage#getASink_Inputs()
	 * @see org.metaabm.act.AInput#getSink
	 * @model opposite="sink" containment="true"
	 * @generated
	 */
	EList<AInput> getInputs();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' reference.
	 * @see #setFunction(FFunction)
	 * @see org.metaabm.act.MetaABMActPackage#getASink_Function()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FFunction getFunction();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ASink#getFunction <em>Function</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' reference.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(FFunction value);

	boolean accepts(IValue value, int place);

	boolean isMultiValue();
} // ASink
