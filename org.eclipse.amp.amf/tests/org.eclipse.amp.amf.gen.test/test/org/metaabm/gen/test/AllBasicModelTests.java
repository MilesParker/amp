/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
*/
package org.metaabm.gen.test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllBasicModelTests extends TestSuite {
    public static Test suite() {
        TestSuite suite = new TestSuite("Generated Test Suite for Basic Model");
        suite.addTestSuite(BasicModelTestCase.class);
        suite.addTestSuite(OperationsAgentTestCase.class);
        suite.addTestSuite(StateAgentTestCase.class);

        return suite;
    }
}
