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
package org.metaabm.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllStructureTests extends TestSuite {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.metaabm.tests");
        // $JUnit-BEGIN$
        // Note that tests that have been commented out are deliberately ignored as they are abstract classes.
        // suite.addTestSuite(IIDTest.class);
        // suite.addTestSuite(ILabeledTest.class);
        // suite.addTestSuite(IValueTest.class);
        suite.addTestSuite(SContextTest.class);
        suite.addTestSuite(SGridTest.class);
        // suite.addTestSuite(SStyleTest.class);
        suite.addTestSuite(SStyle2DTest.class);
        suite.addTestSuite(SContinuousSpaceTest.class);
        suite.addTestSuite(SImplementationTest.class);
        // suite.addTestSuite(SImplementedTest.class);
        suite.addTestSuite(ModelPersistTest.class);
        suite.addTestSuite(SStyle3DTest.class);
        suite.addTestSuite(SAgentTest.class);
        suite.addTestSuite(SAttributeTest.class);
        suite.addTestSuite(SAttributeArrayTest.class);
        suite.addTestSuite(PathFixTest.class);
        suite.addTestSuite(SGeographyTest.class);
        suite.addTestSuite(SNetworkTest.class);
        suite.addTestSuite(SValueLayerTest.class);
        // $JUnit-END$
        return suite;
    }

}