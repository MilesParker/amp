/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.act.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>act</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaABMActTests extends TestSuite {

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
		TestSuite suite = new MetaABMActTests("act Tests");
		suite.addTestSuite(ALiteralTest.class);
		suite.addTestSuite(AMultiValueTest.class);
		suite.addTestSuite(AGroupTest.class);
		suite.addTestSuite(AScheduleTest.class);
		suite.addTestSuite(ARuleTest.class);
		suite.addTestSuite(ABuildTest.class);
		suite.addTestSuite(AInitializeTest.class);
		suite.addTestSuite(AMethodTest.class);
		suite.addTestSuite(AAnyTest.class);
		suite.addTestSuite(AAllTest.class);
		suite.addTestSuite(ANoneTest.class);
		suite.addTestSuite(AQueryTest.class);
		suite.addTestSuite(AEvaluateTest.class);
		suite.addTestSuite(AWatchTest.class);
		suite.addTestSuite(ASetTest.class);
		suite.addTestSuite(ACreateAgentsTest.class);
		suite.addTestSuite(ACreateShapedAgentsTest.class);
		suite.addTestSuite(ALoadAgentsTest.class);
		suite.addTestSuite(ALoadShapedAgentsTest.class);
		suite.addTestSuite(ABuildNetworkTest.class);
		suite.addTestSuite(ABuildSpaceTest.class);
		suite.addTestSuite(ABuildGeographyTest.class);
		suite.addTestSuite(ABuildGridTest.class);
		suite.addTestSuite(ASelectTest.class);
		suite.addTestSuite(AMoveTest.class);
		suite.addTestSuite(ALeaveTest.class);
		suite.addTestSuite(ADieTest.class);
		suite.addTestSuite(AConnectTest.class);
		suite.addTestSuite(ADisconnectTest.class);
		suite.addTestSuite(AReplaceTest.class);
		suite.addTestSuite(ACauseTest.class);
		suite.addTestSuite(ADiffuseTest.class);
		suite.addTestSuite(APerformTest.class);
		suite.addTestSuite(ADeriveTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMActTests(String name) {
		super(name);
	}

} //MetaABMActTests
