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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @see org.metaabm.MetaABMPackage
 * @generated
 */
public interface MetaABMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	MetaABMFactory eINSTANCE = org.metaabm.impl.MetaABMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SAttribute</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SAttribute</em>'.
	 * @generated
	 */
	SAttribute createSAttribute();

	/**
	 * Returns a new object of class '<em>SAttribute Array</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SAttribute Array</em>'.
	 * @generated
	 */
	SAttributeArray createSAttributeArray();

	/**
	 * Returns a new object of class '<em>SAgent</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SAgent</em>'.
	 * @generated
	 */
	SAgent createSAgent();

	/**
	 * Returns a new object of class '<em>SContext</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SContext</em>'.
	 * @generated
	 */
	SContext createSContext();

	/**
	 * Returns a new object of class '<em>SContinuous Space</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SContinuous Space</em>'.
	 * @generated
	 */
	SContinuousSpace createSContinuousSpace();

	/**
	 * Returns a new object of class '<em>SGrid</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SGrid</em>'.
	 * @generated
	 */
	SGrid createSGrid();

	/**
	 * Returns a new object of class '<em>SNetwork</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SNetwork</em>'.
	 * @generated
	 */
	SNetwork createSNetwork();

	/**
	 * Returns a new object of class '<em>SGeography</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SGeography</em>'.
	 * @generated
	 */
	SGeography createSGeography();

	/**
	 * Returns a new object of class '<em>SValue Layer</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SValue Layer</em>'.
	 * @generated
	 */
	SValueLayer createSValueLayer();

	/**
	 * Returns a new object of class '<em>SStyle3 D</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SStyle3 D</em>'.
	 * @generated
	 */
	SStyle3D createSStyle3D();

	/**
	 * Returns a new object of class '<em>SStyle2 D</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SStyle2 D</em>'.
	 * @generated
	 */
	SStyle2D createSStyle2D();

	/**
	 * Returns a new object of class '<em>SStyle Shape</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SStyle Shape</em>'.
	 * @generated
	 */
	SStyleShape createSStyleShape();

	/**
	 * Returns a new object of class '<em>SImplementation</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SImplementation</em>'.
	 * @generated
	 */
	SImplementation createSImplementation();

	/**
	 * Returns a new object of class '<em>SState</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SState</em>'.
	 * @generated
	 */
	SState createSState();

	/**
	 * Returns a new object of class '<em>SState Value</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>SState Value</em>'.
	 * @generated
	 */
	SStateValue createSStateValue();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetaABMPackage getMetaABMPackage();

} // MetaABMFactory
