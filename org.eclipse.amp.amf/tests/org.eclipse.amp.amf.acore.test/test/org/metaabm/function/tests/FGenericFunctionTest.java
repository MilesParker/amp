/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.function.tests;

import junit.textui.TestRunner;

import org.metaabm.function.FGenericFunction;
import org.metaabm.function.MetaABMFunctionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FGeneric Function</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FGenericFunctionTest extends FGenericTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FGenericFunctionTest.class);
	}

	/**
	 * Constructs a new FGeneric Function test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FGenericFunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FGeneric Function test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FGenericFunction getFixture() {
		return (FGenericFunction) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetaABMFunctionFactory.eINSTANCE.createFGenericFunction());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FGenericFunctionTest
