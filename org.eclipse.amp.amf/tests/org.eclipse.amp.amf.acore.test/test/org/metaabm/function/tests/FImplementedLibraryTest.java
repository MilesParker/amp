/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.function.tests;

import junit.textui.TestRunner;

import org.metaabm.function.FImplementedLibrary;
import org.metaabm.function.MetaABMFunctionFactory;

import org.metaabm.tests.SImplementedTest;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FImplemented Library</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FImplementedLibraryTest extends SImplementedTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FImplementedLibraryTest.class);
	}

	/**
	 * Constructs a new FImplemented Library test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FImplementedLibraryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FImplemented Library test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FImplementedLibrary getFixture() {
		return (FImplementedLibrary) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetaABMFunctionFactory.eINSTANCE.createFImplementedLibrary());
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

} //FImplementedLibraryTest
