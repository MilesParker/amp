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
package org.metaabm.function.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.metaabm.function.tests");
        // $JUnit-BEGIN$
        suite.addTestSuite(FArgumentPrototypeTest.class);
        suite.addTestSuite(FGenericLogicalTest.class);
        suite.addTestSuite(FLogicalOperatorTest.class);
        suite.addTestSuite(FOperatorTest.class);
        suite.addTestSuite(FLibraryTest.class);
        suite.addTestSuite(FGenericFunctionTest.class);
        suite.addTestSuite(FArgumentArrayPrototypeTest.class);
        // $JUnit-END$
        return suite;
    }

}
