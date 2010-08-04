/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.tests;

import junit.textui.TestRunner;

import org.metaabm.MetaABMFactory;
import org.metaabm.SContext;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>SContext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.metaabm.SContext#getAllAgents() <em>All Agents</em>}</li>
 *   <li>{@link org.metaabm.SContext#getAllContexts() <em>All Contexts</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SContextTest extends SAgentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SContextTest.class);
	}

	/**
	 * Constructs a new SContext test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SContextTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this SContext test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SContext getFixture() {
		return (SContext) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetaABMFactory.eINSTANCE.createSContext());
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
	 * Tests the '{@link org.metaabm.SContext#getAllAgents() <em>All Agents</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.SContext#getAllAgents()
	 * @generated
	 */
	public void testGetAllAgents() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.metaabm.SContext#getAllContexts() <em>All Contexts</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.SContext#getAllContexts()
	 * @generated
	 */
	public void testGetAllContexts() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //SContextTest
