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
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.amp.axf.core.AbstractLifecycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.ide.AXFWorkbenchPlugin;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.matchers.WidgetMatcherFactory;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PlatformUI;
import org.osgi.framework.Bundle;

/**
 * 
 * @author mparker
 * 
 */
public class ModelMangementTest extends TestCase {

    String testProjectName = "test.escape";

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

    public void utestOne() {
        // setupProject();
        assertEquals(gefViews().size(), 0);
        assertTrue(activeModel() == null);
        launchModel();
        assertEquals(gefViews().size(), 1);
        IModel model1 = activeModel();
        subtestPauseResumeStopStartRestart(model1);
        control().menu("Close").click();
        bot.sleep(2000);
        assertTrue(!model1.getEngine().isRunning());
        assertEquals(manager().getModels().size(), 0);
        assertNull("Model: " + activeModel(), activeModel());
        assertEquals(gefViews().size(), 0);
    }

    public void testTwo() {
        bot.sleep(2000);
        // start new
        launchModel();
        IModel modelA_1 = activeModel();
        assertNotNull(modelA_1);
        assertEquals(gefViews().size(), 1);

        // start another
        launchModel();
        IModel modelA_2 = activeModel();
        subtestPauseResumeStopStartRestart(modelA_2);
        assertNotSame(modelA_1, modelA_2);
        assertEquals(gefViews().size(), 2);

        List<IViewPart> viewsA_1 = manager().getViews(modelA_1);
        assertEquals(viewsA_1.size(), 1);
        activateFirstView(viewsA_1);
        bot.sleep(2000);
        assertEquals(activeModel(), modelA_1);

        control().menu("Pause").click();
        bot.sleep(1000);
        assertTrue(activeModel().getEngine().isPaused());

        List<IViewPart> viewsA_2 = manager().getViews(modelA_2);
        assertEquals(viewsA_2.size(), 1);
        activateFirstView(viewsA_2);
        bot.sleep(2000);
        assertEquals(activeModel(), modelA_2);
        assertTrue(!activeModel().getEngine().isPaused());

        activateFirstView(viewsA_1);
        bot.sleep(2000);
        assertTrue(activeModel().getEngine().isPaused());
        control().menu("Resume").click();
        bot.sleep(2000);

        // rapid cycle
        for (int i = 0; i < 10; i++) {
            activateFirstView(viewsA_1);
            bot.sleep(500);
            assertEquals(activeModel(), modelA_1);
            assertTrue(control().menu("Restart").isEnabled());
            assertTrue(control().menu("Pause").isEnabled());
            assertTrue(control().menu("Stop").isEnabled());
            assertTrue(!control().menu("Resume").isEnabled());
            assertTrue(!control().menu("Start").isEnabled());
            activateFirstView(viewsA_2);
            bot.sleep(500);
            assertEquals(activeModel(), modelA_2);
            assertTrue(control().menu("Restart").isEnabled());
            assertTrue(control().menu("Pause").isEnabled());
            assertTrue(control().menu("Stop").isEnabled());
            assertTrue(!control().menu("Resume").isEnabled());
            assertTrue(!control().menu("Start").isEnabled());
        }


        control().menu("Close").click();
        bot.sleep(4000);
        assertEquals(manager().getModels().size(), 1);
        assertTrue(manager().getActiveModel() == modelA_2);
        assertEquals(gefViews().size(), 1);
        subTestPauseResume(modelA_2);
        subTestStopStartRestart(modelA_2);
        control().menu("Close").click();
        bot.sleep(2000);
        assertEquals(gefViews().size(), 0);
        assertEquals(manager().getModels().size(), 0);
        assertNull(manager().getActiveModel());
    }

    private void launchModel() {
        tree().setFocus();
        tree().select(testProjectName);
        SWTBotTreeItem projectNode = tree().expandNode(testProjectName);
        bot.sleep(2000);
        projectNode.expandNode("TestModelSimple.metaabm").doubleClick();
        packageExplorer().setFocus();
        bot.sleep(2000);

        control().menu("Execute").click();
        bot.sleep(4000);
    }

    int count;

    public void utestWorkbenchModelListeners() {
        count = 0;
        manager().getActiveModelListeners().addListener(new AbstractLifecycleListener() {
            Object model;

            public void observing(IObservationProvider observed) {
                if (model != null) {
                    fail("More than one model listened to.");
                }
                model = observed;
                count++;
            }

            public void observationEnd(IObservationProvider observed) {
                model = null;
            }

            public void stateChange(Object key, Object updated) {
                super.stateChange(key, updated);
                assertTrue(updated == model || updated == null);
            }
        });
        launchModel();
        launchModel();
        assertEquals(count, 2);
    }

    private void activateFirstView(final List<IViewPart> views) {
        Display.getDefault().asyncExec(new Runnable() {

            public void run() {
                PlatformUI.getWorkbench().getWorkbenchWindows()[0].getActivePage().activate(views.get(0));
            }
        });
    }

    private void subtestPauseResumeStopStartRestart(IModel model1) {
        assertTrue(model1 != null);
        assertTrue(model1.getEngine().isRunning());
        for (int i = 0; i < 2; i++) {
            subTestPauseResume(model1);
        }
        subTestStopStartRestart(model1);
    }

    private void subTestStopStartRestart(IModel model1) {
        control().menu("Stop").click();
        bot.sleep(2000);
        assertTrue(!model1.getEngine().isRunning());
        control().menu("Start").click();
        bot.sleep(2000);
        assertTrue(model1.getEngine().isRunning());
        control().menu("Restart").click();
        bot.sleep(2000);
        assertTrue(model1.getEngine().isRunning());
    }

    private void subTestPauseResume(IModel model1) {
        control().menu("Pause").click();
        bot.sleep(1500);
        assertTrue(model1.getEngine().isPaused());
        control().menu("Resume").click();
        bot.sleep(1500);
        assertTrue(!model1.getEngine().isPaused());
    }

    private List<SWTBotView> gefViews() {
        return bot.views(WidgetMatcherFactory.withPartId("org.eclipse.amp.view.GEFView"));
    }

    private SWTBotMenu control() {
        return bot.menu("Control");
    }

    private ModelViewManager manager() {
        return AXFWorkbenchPlugin.getDefault().getManager();
    }

    private IModel activeModel() {
        return (IModel) AXFWorkbenchPlugin.getDefault().getManager().getActiveModel();
    }

    private void setupProject() {
        bot.viewByTitle("Welcome").close();
        bot.perspectiveByLabel("MetaABM").activate();
        bot.viewByTitle("Package Explorer").setFocus();
        bot.menu("File").menu("New").menu("Escape Project").click();
        // 'com.swtbot.test.project' is the java project name to create

        bot.text(0).setText(testProjectName);
        // Click the Finish button
        bot.button("Finish").click();
        try {
            copyFiles("org.eclipse.amp.axf.ide.test", "res/TestModel.metaabm", testProjectName, "TestModel.metaabm");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
