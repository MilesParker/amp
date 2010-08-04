/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.function.tests;

import junit.textui.TestRunner;

import org.metaabm.function.FOperator;
import org.metaabm.function.MetaABMFunctionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>FOperator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.metaabm.function.FOperator#getArity() <em>Arity</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class FOperatorTest extends FFunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FOperatorTest.class);
	}

	/**
	 * Constructs a new FOperator test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FOperatorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this FOperator test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FOperator getFixture() {
		return (FOperator) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetaABMFunctionFactory.eINSTANCE.createFOperator());
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

	/**
	 * Tests the '{@link org.metaabm.function.FOperator#getArity() <em>Arity</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.function.FOperator#getArity()
	 * @generated
	 */
	public void testGetArity() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //FOperatorTest
