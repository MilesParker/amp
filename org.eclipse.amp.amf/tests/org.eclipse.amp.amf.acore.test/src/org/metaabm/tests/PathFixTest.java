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

import java.io.File;

import junit.framework.TestCase;

import org.metaabm.xsd.MetaABMPersist;

public class PathFixTest extends TestCase {

    protected static String p = File.pathSeparator;

    protected static String s = File.separator;

    public PathFixTest(String name) {
        super(name);
    }

    // Note that this test may pass on one machine/platform and fail on another!
    public void testPathPlatform() {
        String r = System.getProperty("user.dir");
        String os = System.getProperty("os.name");
        String prefix = "";
        if (os.contains("Windows") || os.contains("windows")) {
            prefix = "C:";
        }

        checkPathPlatform("\\Users\\test", prefix + s + "Users" + s + "test");

        checkPathPlatform("/Users/test", prefix + s + "Users" + s + "test");
        checkPathPlatform("/Users/../Users/test", prefix + s + "Users" + s + "test");
        checkPathPlatform("\\Users\\test;\\Users\\test2", prefix + s + "Users" + s + "test" + p + prefix + s + "Users"
                        + s + "test2");
        checkPathPlatform("/Users/test;/Users/test2", prefix + s + "Users" + s + "test" + p + prefix + s + "Users" + s
                        + "test2");
        // Windows -- would break if we actually tried to use this path on a
        // *nix machine
        // Here we add an initial path seperator even though this isn't a valid
        // path opn either platform to test parsing of ':'
        // checkPathPlatform("\\C:\\Users\\test;\\C:\\Users\\test2", s + "C:" +
        // s + "Users" + s + "test" + p + s + "C:" + s + "Users" + s + "test2");

        // Relative
        checkPathPlatform("Users\\test", r + s + "Users" + s + "test");
        checkPathPlatform("Users/test", r + s + "Users" + s + "test");
        checkPathPlatform("Users/../Users/test", r + s + "Users" + s + "test");
        checkPathPlatform("Users\\test;\\Users\\test2", r + s + "Users" + s + "test" + p + prefix + s + "Users" + s
                        + "test2");
        checkPathPlatform("Users/test;Users/test2", r + s + "Users" + s + "test" + p + r + s + "Users" + s + "test2");
    }

    protected void checkPathPlatform(String input, String expected) {
        String result = MetaABMPersist.platformPath(input);
        assertEquals(expected, result);
    }
}
