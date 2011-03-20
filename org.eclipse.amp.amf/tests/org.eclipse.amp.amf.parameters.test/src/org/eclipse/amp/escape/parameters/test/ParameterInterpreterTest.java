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

package org.eclipse.amp.escape.parameters.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.net.URL;

import junit.framework.TestCase;

import org.eclipse.amp.amf.parameters.AParFactory;
import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.osgi.framework.Bundle;

/**
 * To setup projects (first time), use setupProject(), otherwise comment it out.
 * 
 * @author mparker
 * 
 */
public class ParameterInterpreterTest extends TestCase {

    public static boolean SETUP_PROJECT = true;

    private static final String TEST_PLUGIN_NAME = "org.eclipse.amp.amf.parameters.test";
    private static final String TEST_PROJECT_NAME = "org.eclipse.amp.amf.parameters.test.project";
    /**
     * In future you will not need to create this instance. You need to extend SWTBotEclipseTestCase which holds an
     * instance of SWTEclipseBot.
     */
    protected SWTWorkbenchBot bot = new SWTWorkbenchBot();

    private IProject testProject;

    /**
     * @throws Exception
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        openProject();
        copyFiles("TestModel.metaabm");
    }

    //@Test
    public void testFileAccess() {
        // Note that for below actual ordering isn't significant so that can be relaxed as implementations change.
        subtestVars("Test.apar", new String[] { "StopPeriod=100", "TestSymbol=Hello", "TestFloat=1.234",
            "Testint=1234", "TestBoolean=false" });

        subtestVars("TestSub.apar", new String[] { "TestSymbol=Goodbye", "Testint=111", "StopPeriod=100",
            "TestFloat=1.234", "TestBoolean=false" });

        subtestVars("TestSubLevel2.apar", new String[] { "Testint=4321", "TestSymbol=Goodbye", "StopPeriod=100",
            "TestFloat=1.234", "TestBoolean=false" });

        subtestVars("TestIncorporateOrder.apar", new String[] { "TestSymbol=Goodbye", "Testint=111", "StopPeriod=100",
            "TestFloat=1.234", "TestBoolean=false" });

        subtestVars("relative/RelTest.apar", new String[] { "TestSymbol=Ola", "StopPeriod=100", "TestFloat=1.234",
            "Testint=1234", "TestBoolean=false" });
    }

    private void subtestVars(String fileName, String[] expectedArgs) {
        copyFiles(fileName);
        IProject testProject = ResourcesPlugin.getPlugin().getWorkspace().getRoot()
        .getProject(TEST_PROJECT_NAME);
        IResource testFile = testProject.getFile("" + fileName);
        assertTrue("Couldn't find file: " + testFile, testFile.exists());
        bot.sleep(1000);
        AParInterpreter interpreter = (AParInterpreter) AParFactory.create(null).getInterpreter(testFile);
        String[] args = interpreter.getArgs();
        for (int i = 0; i < expectedArgs.length; i++) {
            assertEquals(args[i], expectedArgs[i]);
        }
        assertEquals(args.length, expectedArgs.length);
    }

    /**
     * @return
     * @throws WidgetNotFoundException
     */
    private SWTBotTree tree() throws WidgetNotFoundException {
        return packageExplorer().bot().tree();
    }

    /**
     * @return
     * @throws WidgetNotFoundException
     */
    private SWTBotView packageExplorer() throws WidgetNotFoundException {
        return bot.viewByTitle("Package Explorer");
    }

    public void testRun() {
        tree().setFocus();
        tree().select(TEST_PROJECT_NAME);
        SWTBotTreeItem projectNode = tree().expandNode(TEST_PROJECT_NAME);
        bot.sleep(2000);
        projectNode.expandNode("Test.apar").doubleClick();
        packageExplorer().setFocus();
        bot.sleep(2000);

        bot.menu("Control").menu("Execute").click();
        bot.sleep(4000);
    }

    private void openProject() {
        if (SETUP_PROJECT && !ResourcesPlugin.getWorkspace().getRoot().getProject(TEST_PROJECT_NAME).isOpen()) {
            setupProject();
        }
        // testProject = ResourcesPlugin.getWorkspace().getRoot().getProject(TEST_PROJECT_NAME);
        // try {
        // testProject.open(IResource.NONE, null);
        // } catch (CoreException e) {
        // throw new RuntimeException(e);
        // }
    }

    public void setupProject() {
        // bot.viewByTitle("Welcome").close();
        bot.perspectiveByLabel("Agent Modeling").activate();
        bot.viewByTitle("Package Explorer").setFocus();
        bot.menu("File").menu("New").menu("Escape Project").click();
        // 'com.swtbot.test.project' is the java project name to create

        bot.text(0).setText(TEST_PROJECT_NAME);
        bot.sleep(100);
        // Click the Finish button
        bot.button("Finish").click();
    }

    private void copyFiles(String srcFileLoc) {
        try {
            copyFiles(srcFileLoc, srcFileLoc);
        } catch (CoreException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void copyFiles(String srcFileLoc, String destFileLoc) throws CoreException, IOException {
        copyFiles(TEST_PLUGIN_NAME, srcFileLoc, TEST_PROJECT_NAME, destFileLoc);
    }

    public static void createFolders(IFolder folder) {
        IContainer parent = folder.getParent();
        if (parent instanceof IFolder) {
            createFolders((IFolder) parent);
        }
        if (!folder.exists()) {
            try {
                folder.create(true, false, null);
            } catch (CoreException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void copyFiles(String srcPluginID, String srcFileLoc, String destProjectName, String destFileLoc)
    throws CoreException, IOException {
        InputStream srcStream = streamFromPlugin(srcPluginID, srcFileLoc.toString());
        BufferedReader srcReader = new BufferedReader(new InputStreamReader(srcStream));
        StringBuffer buffer = new StringBuffer();
        String next = srcReader.readLine();
        while (next != null) {
            buffer.append(next + "\r\n");
            next = srcReader.readLine();
        }
        String parsedText = buffer.toString();
        InputStream is = new StringBufferInputStream(parsedText);
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(destProjectName);
        IFile destFile = project.getFile(destFileLoc);
        Path path = new Path(destFileLoc);
        if (path.segmentCount() > 1) {
            createFolders(project.getFolder(path.removeLastSegments(1).toString()));
        }
        if (destFile.exists()) {
            destFile.delete(true, null);
        }
        destFile.create(is, true, null);
    }

    public static InputStream streamFromPlugin(String pluginID, String path) {
        try {
            Bundle bundle = Platform.getBundle(pluginID);
            URL entry = bundle.getEntry(path);
            if (entry == null) {
                throw new RuntimeException("No resource:" + path + " found in plugin: " + pluginID);
            }
            return entry.openStream();
        } catch (IOException e) {
            throw new RuntimeException("Couldn't load project resource from plugin.", e);
        }
    }

}
