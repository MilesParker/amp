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




/**
 * 
 * @author mparker
 * 
 */
@SuppressWarnings("deprecation")
public class CreateProjectsTest extends CreateProjectsBase {

    public void testBasicProject() {
        subtestCreateSimpleProject("Basic MetaABM Project", "gen.test", new String[] { "TestBasics.metaabm" });
    }

    public static void subtestCreateSimpleProject(String projectMenuName, String projectName, String[] models) {
        subtestCreateProject(projectMenuName, projectName);

        // Click the Finish button
        bot.button("Finish").click();
        try {
            for (String model : models) {
                copyFiles("org.eclipse.amp.amf.gen.test", model, projectName, model);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void subtestCreateProject(String projectMenuName, String testProjectName) {
        bot.perspectiveByLabel("Agent Modeling").activate();
        bot.viewByTitle("Package Explorer").setFocus();
        bot.sleep(3000);
        bot.menu("File").menu("New").menu(projectMenuName).click();

        bot.text(0).setText(testProjectName);
    }
}
