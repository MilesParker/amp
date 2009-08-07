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

package org.eclipse.axf.ide.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.net.URL;

import junit.framework.TestCase;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.AXFWorkbenchPlugin;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.osgi.framework.Bundle;

/**
 * 
 * @author mparker
 * 
 */
public class CreateProjectsTest extends TestCase {


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
        IFile destFile = ResourcesPlugin.getWorkspace().getRoot().getProject(destProjectName).getFile(destFileLoc);
        destFile.create(is, true, null);
    }

    /**
     * In future you will not need to create this instance. You need to extend SWTBotEclipseTestCase which holds an
     * instance of SWTEclipseBot.
     */
    protected SWTWorkbenchBot bot = new SWTWorkbenchBot();

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

    private SWTBotMenu control() {
        return bot.menu("Control");
    }

    public static ModelViewManager manager() {
        return AXFWorkbenchPlugin.getDefault().getManager();
    }

    public static IModel activeModel() {
        return (IModel) AXFWorkbenchPlugin.getDefault().getManager().getActiveModel();
    }

    public void testAscapeProject() {
        // SWTBotView viewByTitle = bot.viewByTitle("Welcome");
        // if (viewByTitle != null) {
        // viewByTitle.close();
        // }
        bot.perspectiveByLabel("Agent Modeling").activate();
        bot.viewByTitle("Package Explorer").setFocus();
        bot.sleep(3000);
        bot.menu("File").menu("New").menu("Ascape MetaABM Project").click();
        // 'com.swtbot.test.project' is the java project name to create

        String projectName = "test.ascape";
        bot.text(0).setText(projectName);
        // Click the Finish button
        bot.button("Finish").click();
        try {
            copyFiles("org.eclipse.amp.axf.ide.test", "res/TestModel.metaabm", projectName, "TestModel.metaabm");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void testEscapeProject() {
        // bot.text(0).setText(projectName);
        // SWTBotView viewByTitle = bot.viewByTitle("Welcome");
        // if (viewByTitle != null) {
        // viewByTitle.close();
        // }
        bot.perspectiveByLabel("Agent Modeling").activate();
        bot.viewByTitle("Package Explorer").setFocus();
        bot.sleep(3000);
        bot.menu("File").menu("New").menu("Escape Project").click();
        // 'com.swtbot.test.project' is the java project name to create

        String projectName = "test.escape";
        bot.text(0).setText(projectName);
        // Click the Finish button
        bot.button("Finish").click();
        try {
            copyFiles("org.eclipse.amp.axf.ide.test", "res/TestModel.metaabm", projectName, "TestModel.metaabm");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
