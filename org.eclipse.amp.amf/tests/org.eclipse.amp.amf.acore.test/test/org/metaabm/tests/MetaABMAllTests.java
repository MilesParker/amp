/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

import org.metaabm.act.tests.MetaABMActTests;

import org.metaabm.function.tests.MetaABMFunctionTests;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>metaabm</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaABMAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MetaABMAllTests("metaabm Tests");
		suite.addTest(MetaABMTests.suite());
		suite.addTest(MetaABMFunctionTests.suite());
		suite.addTest(MetaABMActTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMAllTests(String name) {
		super(name);
	}

} //MetaABMAllTests
