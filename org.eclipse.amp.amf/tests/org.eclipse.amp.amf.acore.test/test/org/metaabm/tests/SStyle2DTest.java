/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.tests;

import junit.textui.TestRunner;

import org.metaabm.MetaABMFactory;
import org.metaabm.SStyle2D;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SStyle2 D</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SStyle2DTest extends SStyleTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SStyle2DTest.class);
	}

	/**
	 * Constructs a new SStyle2 D test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SStyle2DTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SStyle2 D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SStyle2D getFixture() {
		return (SStyle2D) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetaABMFactory.eINSTANCE.createSStyle2D());
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

} //SStyle2DTest
