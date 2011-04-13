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
package org.metaabm;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SN
 * Dimensional</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SNDimensional#getDimensionality <em>Dimensionality</em>}</li>
 *   <li>{@link org.metaabm.SNDimensional#getBorderRule <em>Border Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSNDimensional()
 * @model abstract="true"
 * @generated
 */
public interface SNDimensional extends SProjection {
	/**
	 * Returns the value of the '<em><b>Dimensionality</b></em>' attribute. The default value is <code>"0"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensionality</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Dimensionality</em>' attribute.
	 * @see #setDimensionality(int)
	 * @see org.metaabm.MetaABMPackage#getSNDimensional_Dimensionality()
	 * @model default="0"
	 * @generated
	 */
	int getDimensionality();

	/**
	 * Sets the value of the '{@link org.metaabm.SNDimensional#getDimensionality <em>Dimensionality</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Dimensionality</em>' attribute.
	 * @see #getDimensionality()
	 * @generated
	 */
	void setDimensionality(int value);

	/**
	 * Returns the value of the '<em><b>Border Rule</b></em>' attribute.
	 * The default value is <code>"STICKY"</code>.
	 * The literals are from the enumeration {@link org.metaabm.SBorderRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Rule</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Rule</em>' attribute.
	 * @see org.metaabm.SBorderRule
	 * @see #setBorderRule(SBorderRule)
	 * @see org.metaabm.MetaABMPackage#getSNDimensional_BorderRule()
	 * @model default="STICKY"
	 * @generated
	 */
	SBorderRule getBorderRule();

	/**
	 * Sets the value of the '{@link org.metaabm.SNDimensional#getBorderRule <em>Border Rule</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Border Rule</em>' attribute.
	 * @see org.metaabm.SBorderRule
	 * @see #getBorderRule()
	 * @generated
	 */
	void setBorderRule(SBorderRule value);

} // SNDimensional
