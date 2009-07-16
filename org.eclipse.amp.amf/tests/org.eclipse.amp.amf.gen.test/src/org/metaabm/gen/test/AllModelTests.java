package org.metaabm.gen.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.Test;
import junit.framework.TestSuite;
@RunWith(Suite.class)
@Suite.SuiteClasses({AllBasicMovementModelTests.class, 
    AllSpatialModelTests.class})
public class AllModelTests {
}
