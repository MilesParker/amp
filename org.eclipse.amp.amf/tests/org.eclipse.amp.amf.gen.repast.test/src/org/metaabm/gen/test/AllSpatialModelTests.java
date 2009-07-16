package org.metaabm.gen.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllSpatialModelTests extends TestSuite {
    public static Test suite() {
        TestSuite suite = new TestSuite("Generated Test Suite for Spatial Model");
        suite.addTestSuite(SpatialModelTestCase.class);
        suite.addTestSuite(ComplexMovementAgentTestCase.class);
        suite.addTestSuite(ComplexLocationTestCase.class);

        return suite;
    }
}
