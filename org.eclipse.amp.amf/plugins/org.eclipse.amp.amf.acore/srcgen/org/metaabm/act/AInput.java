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

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.metaabm.IValue;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>AInput</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.AInput#getSink <em>Sink</em>}</li>
 *   <li>{@link org.metaabm.act.AInput#getSelected <em>Selected</em>}</li>
 *   <li>{@link org.metaabm.act.AInput#getLiteral <em>Literal</em>}</li>
 *   <li>{@link org.metaabm.act.AInput#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getAInput()
 * @model
 * @generated
 */
public interface AInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Sink</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.act.ASink#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink</em>' container reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' container reference.
	 * @see #setSink(ASink)
	 * @see org.metaabm.act.MetaABMActPackage#getAInput_Sink()
	 * @see org.metaabm.act.ASink#getInputs
	 * @model opposite="inputs" required="true" transient="false"
	 * @generated
	 */
	ASink getSink();

	/**
	 * Sets the value of the '{@link org.metaabm.act.AInput#getSink <em>Sink</em>}' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Sink</em>' container reference.
	 * @see #getSink()
	 * @generated
	 */
	void setSink(ASink value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' reference isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' reference.
	 * @see #setSelected(ASelect)
	 * @see org.metaabm.act.MetaABMActPackage#getAInput_Selected()
	 * @model
	 * @generated
	 */
	ASelect getSelected();

	/**
	 * Sets the value of the '{@link org.metaabm.act.AInput#getSelected <em>Selected</em>}' reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' reference.
	 * @see #getSelected()
	 * @generated
	 */
	void setSelected(ASelect value);

	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference.
	 * @see #setLiteral(ALiteral)
	 * @see org.metaabm.act.MetaABMActPackage#getAInput_Literal()
	 * @model containment="true"
	 * @generated
	 */
	ALiteral getLiteral();

	/**
	 * Sets the value of the '{@link org.metaabm.act.AInput#getLiteral <em>Literal</em>}' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Literal</em>' containment reference.
	 * @see #getLiteral()
	 * @generated
	 */
	void setLiteral(ALiteral value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(IValue)
	 * @see org.metaabm.act.MetaABMActPackage#getAInput_Value()
	 * @model
	 * @generated
	 */
	IValue getValue();

	/**
	 * Sets the value of the '{@link org.metaabm.act.AInput#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(IValue value);

	boolean isReachable(IValue value);

	boolean isPotentialValue(IValue value);

	Collection<?> potentialValues(Collection<IValue> suggestValues);

	boolean references(IValue value);
} // AInput
