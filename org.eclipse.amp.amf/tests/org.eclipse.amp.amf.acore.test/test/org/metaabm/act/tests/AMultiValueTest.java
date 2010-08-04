/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.act.tests;

import junit.textui.TestRunner;

import org.metaabm.act.AMultiValue;
import org.metaabm.act.MetaABMActFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>AMulti Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AMultiValueTest extends ALiteralTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AMultiValueTest.class);
	}

	/**
	 * Constructs a new AMulti Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AMultiValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this AMulti Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AMultiValue getFixture() {
		return (AMultiValue) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetaABMActFactory.eINSTANCE.createAMultiValue());
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

} //AMultiValueTest
