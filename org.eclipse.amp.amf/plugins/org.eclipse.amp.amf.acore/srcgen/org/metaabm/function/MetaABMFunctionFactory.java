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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @see org.metaabm.function.MetaABMFunctionPackage
 * @generated
 */
public interface MetaABMFunctionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	MetaABMFunctionFactory eINSTANCE = org.metaabm.function.impl.MetaABMFunctionFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FArgument Prototype</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>FArgument Prototype</em>'.
	 * @generated
	 */
	FArgumentPrototype createFArgumentPrototype();

	/**
	 * Returns a new object of class '<em>FOperator</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>FOperator</em>'.
	 * @generated
	 */
	FOperator createFOperator();

	/**
	 * Returns a new object of class '<em>FLogical Operator</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>FLogical Operator</em>'.
	 * @generated
	 */
	FLogicalOperator createFLogicalOperator();

	/**
	 * Returns a new object of class '<em>FGeneric Function</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>FGeneric Function</em>'.
	 * @generated
	 */
	FGenericFunction createFGenericFunction();

	/**
	 * Returns a new object of class '<em>FGeneric Logical</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>FGeneric Logical</em>'.
	 * @generated
	 */
	FGenericLogical createFGenericLogical();

	/**
	 * Returns a new object of class '<em>FLibrary</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>FLibrary</em>'.
	 * @generated
	 */
	FLibrary createFLibrary();

	/**
	 * Returns a new object of class '<em>FImplemented Library</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>FImplemented Library</em>'.
	 * @generated
	 */
	FImplementedLibrary createFImplementedLibrary();

	/**
	 * Returns a new object of class '<em>FMulti Argument Prototype</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>FMulti Argument Prototype</em>'.
	 * @generated
	 */
	FMultiArgumentPrototype createFMultiArgumentPrototype();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetaABMFunctionPackage getMetaABMFunctionPackage();

	/**
	 * Returns a new object of class '<em>FArgument Array Prototype</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>FArgument Array Prototype</em>'.
	 * @generated
	 */
	FArgumentArrayPrototype createFArgumentArrayPrototype();

} // MetaABMFunctionFactory
