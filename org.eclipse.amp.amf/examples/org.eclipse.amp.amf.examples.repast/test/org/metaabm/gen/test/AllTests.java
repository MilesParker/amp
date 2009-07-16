package org.metaabm.gen.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.metaabmabm.gen.test");
        //$JUnit-BEGIN$
        suite.addTestSuite(GeneratedModel.class);
        suite.addTestSuite(GeneratedMemberAgent.class);
        //$JUnit-END$
        return suite;
    }

}
