/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.metaabm.act.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.metaabm.act.tests");
        // $JUnit-BEGIN$
        suite.addTestSuite(AQueryTest.class);
        suite.addTestSuite(ACreateAgentsTest.class);
        suite.addTestSuite(AAnyTest.class);
        suite.addTestSuite(AScheduleTest.class);
        suite.addTestSuite(ABuildSpaceTest.class);
        suite.addTestSuite(ABuildTest.class);
        suite.addTestSuite(AConnectTest.class);
        suite.addTestSuite(AMethodTest.class);
        suite.addTestSuite(AGroupTest.class);
        suite.addTestSuite(AAllTest.class);
        suite.addTestSuite(ASetTest.class);
        suite.addTestSuite(ASelectTest.class);
        suite.addTestSuite(ADisconnectTest.class);
        suite.addTestSuite(AInitializeTest.class);
        suite.addTestSuite(ADieTest.class);
        suite.addTestSuite(ALeaveTest.class);
        suite.addTestSuite(AReplaceTest.class);
        suite.addTestSuite(ABuildGridTest.class);
        suite.addTestSuite(AEvaluateTest.class);
        suite.addTestSuite(AMoveTest.class);
        suite.addTestSuite(ANoneTest.class);
        suite.addTestSuite(ARuleTest.class);
        suite.addTestSuite(AWatchTest.class);
        suite.addTestSuite(ABuildNetworkTest.class);
        // $JUnit-END$
        return suite;
    }

}
