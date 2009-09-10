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

public class AllTests extends TestSuite {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.metaabm.tests");
        // $JUnit-BEGIN$
        suite.addTest(AllStructureTests.suite());
        suite.addTest(org.metaabm.act.tests.AllTests.suite());
        suite.addTest(org.metaabm.function.tests.AllTests.suite());
        // $JUnit-END$
        return suite;
    }

}