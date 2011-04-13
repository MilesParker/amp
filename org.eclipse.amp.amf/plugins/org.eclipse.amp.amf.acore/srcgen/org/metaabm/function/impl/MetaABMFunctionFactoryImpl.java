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
package org.metaabm.function.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.metaabm.function.*;
import org.metaabm.function.FArgumentArrayPrototype;
import org.metaabm.function.FArgumentPrototype;
import org.metaabm.function.FGenericFunction;
import org.metaabm.function.FGenericLogical;
import org.metaabm.function.FImplementedLibrary;
import org.metaabm.function.FLibrary;
import org.metaabm.function.FLogicalOperator;
import org.metaabm.function.FMultiArgumentPrototype;
import org.metaabm.function.FOperator;
import org.metaabm.function.MetaABMFunctionFactory;
import org.metaabm.function.MetaABMFunctionPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class MetaABMFunctionFactoryImpl extends EFactoryImpl implements MetaABMFunctionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static MetaABMFunctionFactory init() {
		try {
			MetaABMFunctionFactory theMetaABMFunctionFactory = (MetaABMFunctionFactory) EPackage.Registry.INSTANCE.getEFactory("http://metaabm.org/function");
			if (theMetaABMFunctionFactory != null) {
				return theMetaABMFunctionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaABMFunctionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public MetaABMFunctionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetaABMFunctionPackage.FARGUMENT_PROTOTYPE:
				return createFArgumentPrototype();
			case MetaABMFunctionPackage.FARGUMENT_ARRAY_PROTOTYPE:
				return createFArgumentArrayPrototype();
			case MetaABMFunctionPackage.FOPERATOR:
				return createFOperator();
			case MetaABMFunctionPackage.FLOGICAL_OPERATOR:
				return createFLogicalOperator();
			case MetaABMFunctionPackage.FGENERIC_FUNCTION:
				return createFGenericFunction();
			case MetaABMFunctionPackage.FGENERIC_LOGICAL:
				return createFGenericLogical();
			case MetaABMFunctionPackage.FLIBRARY:
				return createFLibrary();
			case MetaABMFunctionPackage.FIMPLEMENTED_LIBRARY:
				return createFImplementedLibrary();
			case MetaABMFunctionPackage.FMULTI_ARGUMENT_PROTOTYPE:
				return createFMultiArgumentPrototype();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FArgumentPrototype createFArgumentPrototype() {
		FArgumentPrototypeImpl fArgumentPrototype = new FArgumentPrototypeImpl();
		return fArgumentPrototype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FArgumentArrayPrototype createFArgumentArrayPrototype() {
		FArgumentArrayPrototypeImpl fArgumentArrayPrototype = new FArgumentArrayPrototypeImpl();
		return fArgumentArrayPrototype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FOperator createFOperator() {
		FOperatorImpl fOperator = new FOperatorImpl();
		return fOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FLogicalOperator createFLogicalOperator() {
		FLogicalOperatorImpl fLogicalOperator = new FLogicalOperatorImpl();
		return fLogicalOperator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FGenericFunction createFGenericFunction() {
		FGenericFunctionImpl fGenericFunction = new FGenericFunctionImpl();
		return fGenericFunction;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FGenericLogical createFGenericLogical() {
		FGenericLogicalImpl fGenericLogical = new FGenericLogicalImpl();
		return fGenericLogical;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FLibrary createFLibrary() {
		FLibraryImpl fLibrary = new FLibraryImpl();
		return fLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FImplementedLibrary createFImplementedLibrary() {
		FImplementedLibraryImpl fImplementedLibrary = new FImplementedLibraryImpl();
		return fImplementedLibrary;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public FMultiArgumentPrototype createFMultiArgumentPrototype() {
		FMultiArgumentPrototypeImpl fMultiArgumentPrototype = new FMultiArgumentPrototypeImpl();
		return fMultiArgumentPrototype;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMFunctionPackage getMetaABMFunctionPackage() {
		return (MetaABMFunctionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaABMFunctionPackage getPackage() {
		return MetaABMFunctionPackage.eINSTANCE;
	}

} // MetaABMFunctionFactoryImpl
