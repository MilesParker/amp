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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.net.URL;

import junit.framework.TestCase;

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
public abstract class CreateProjectsBase extends TestCase {

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

    @SuppressWarnings("deprecation")
    public static void copyFiles(String srcPluginID, String srcFileLoc, String destProjectName) throws CoreException,
            IOException {
        copyFiles(srcPluginID, srcFileLoc, destProjectName, srcFileLoc);
    }

    @SuppressWarnings("deprecation")
    public static void copyFiles(String srcPluginID, String srcFileLoc, String destProjectName, String destFileLoc) throws CoreException,
    IOException {
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
    protected static SWTWorkbenchBot bot = new SWTWorkbenchBot();

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

    /**
     * 
     */
    public CreateProjectsBase() {
        super();
    }

    /**
     * @param name
     */
    public CreateProjectsBase(String name) {
        super(name);
    }

}