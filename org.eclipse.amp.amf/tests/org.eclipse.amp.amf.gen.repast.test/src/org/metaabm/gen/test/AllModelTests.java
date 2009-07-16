package org.metaabm.gen.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllModelTests extends TestSuite {
    public static Test suite() {
        TestSuite suite = new TestSuite("Test Suite for Base Generation");
        suite.addTest(AllBasicModelTests.suite());
        suite.addTest(AllBasicMovementModelTests.suite());
        suite.addTest(AllSpatialModelTests.suite());
        return suite;
    }
}
