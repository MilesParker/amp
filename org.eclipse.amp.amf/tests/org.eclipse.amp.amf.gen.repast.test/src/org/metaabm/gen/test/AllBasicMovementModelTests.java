package org.metaabm.gen.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllBasicMovementModelTests extends TestSuite {
    public static Test suite() {
        TestSuite suite = new TestSuite("Generated Test Suite for Basic Movement Model");
        suite.addTestSuite(BasicMovementModelTestCase.class);
        suite.addTestSuite(BasicMovementAgentTestCase.class);
        suite.addTestSuite(BasicCellTestCase.class);
        suite.addTestSuite(NetworkAgentTestCase.class);
        suite.addTestSuite(BasicMovementStateAgentTestCase.class);

        return suite;
    }
}
