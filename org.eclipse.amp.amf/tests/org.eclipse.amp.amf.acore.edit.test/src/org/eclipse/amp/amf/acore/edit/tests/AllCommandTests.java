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
package org.eclipse.amp.amf.acore.edit.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.amp.amf.acore.edit.commands.test.ModelActsCommandTest;
import org.eclipse.amp.amf.acore.edit.commands.test.ModelConstructionCommandTest;
import org.eclipse.amp.amf.acore.edit.commands.test.ModelIDsCommandTest;
import org.eclipse.amp.amf.acore.edit.commands.test.ModelImplementationCommandTest;
import org.eclipse.amp.amf.acore.edit.commands.test.ModelProjectionsCommandTest;
import org.eclipse.amp.amf.acore.edit.commands.test.SetLabelCommandTest;
import org.eclipse.amp.amf.acore.edit.commands.test.SetSinkFunctionCommandTest;
import org.eclipse.amp.amf.acore.edit.commands.test.StateTest;




public class AllCommandTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.eclipse.amp.amf.acore.edit.commands.test");
        // $JUnit-BEGIN$
        suite.addTestSuite(SetLabelCommandTest.class);
        suite.addTestSuite(ModelProjectionsCommandTest.class);
        suite.addTestSuite(ModelConstructionCommandTest.class);
        suite.addTestSuite(ModelActsCommandTest.class);
        suite.addTestSuite(ModelIDsCommandTest.class);
        suite.addTestSuite(ModelImplementationCommandTest.class);
        suite.addTestSuite(StateTest.class);
        suite.addTestSuite(SetSinkFunctionCommandTest.class);
        // $JUnit-END$
        return suite;
    }

}
