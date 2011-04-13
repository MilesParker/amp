/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.act;

import org.metaabm.SAttribute;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>ADiffuse</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ADiffuse#getDiffused <em>Diffused</em>}</li>
 *   <li>{@link org.metaabm.act.ADiffuse#getDiffusionRate <em>Diffusion Rate</em>}</li>
 *   <li>{@link org.metaabm.act.ADiffuse#getEvaporationRate <em>Evaporation Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getADiffuse()
 * @model
 * @generated
 */
public interface ADiffuse extends ARoot {

	/**
	 * Returns the value of the '<em><b>Diffused</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffused</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Diffused</em>' reference.
	 * @see #setDiffused(SAttribute)
	 * @see org.metaabm.act.MetaABMActPackage#getADiffuse_Diffused()
	 * @model required="true"
	 * @generated
	 */
	SAttribute getDiffused();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ADiffuse#getDiffused
	 * <em>Diffused</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Diffused</em>' reference.
	 * @see #getDiffused()
	 * @generated
	 */
	void setDiffused(SAttribute value);

	/**
	 * Returns the value of the '<em><b>Diffusion Rate</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diffusion Rate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Diffusion Rate</em>' reference.
	 * @see #setDiffusionRate(SAttribute)
	 * @see org.metaabm.act.MetaABMActPackage#getADiffuse_DiffusionRate()
	 * @model
	 * @generated
	 */
	SAttribute getDiffusionRate();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ADiffuse#getDiffusionRate <em>Diffusion Rate</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Diffusion Rate</em>' reference.
	 * @see #getDiffusionRate()
	 * @generated
	 */
	void setDiffusionRate(SAttribute value);

	/**
	 * Returns the value of the '<em><b>Evaporation Rate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaporation Rate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaporation Rate</em>' reference.
	 * @see #setEvaporationRate(SAttribute)
	 * @see org.metaabm.act.MetaABMActPackage#getADiffuse_EvaporationRate()
	 * @model
	 * @generated
	 */
	SAttribute getEvaporationRate();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ADiffuse#getEvaporationRate <em>Evaporation Rate</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Evaporation Rate</em>' reference.
	 * @see #getEvaporationRate()
	 * @generated
	 */
	void setEvaporationRate(SAttribute value);
} // ADiffuse
