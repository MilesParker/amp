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

public class GenerateBaseTest extends AbstractGenerateBaseTest {

    public void testGenerate() {
        executeGeneration("org.eclipse.amp.amf.gen.test.target", "", AbstractGenerateBaseTest.BASE_ACT_MOVE_MODEL_NAMES, AbstractGenerateBaseTest.BASE_ACT_MOVE_CLASS_NAMES);
    }
}
