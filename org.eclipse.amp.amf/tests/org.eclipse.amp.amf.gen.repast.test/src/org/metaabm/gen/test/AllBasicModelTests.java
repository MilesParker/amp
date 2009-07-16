package org.metaabm.gen.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllBasicModelTests extends TestSuite {
    public static Test suite() {
        TestSuite suite = new TestSuite("Generated Test Suite for Basic Model");
        suite.addTestSuite(BasicModelTestCase.class);
        suite.addTestSuite(OperationsAgentTestCase.class);
        suite.addTestSuite(StateAgentTestCase.class);
        suite.addTestSuite(MethodsAgentTestCase.class);

        return suite;
    }
}
