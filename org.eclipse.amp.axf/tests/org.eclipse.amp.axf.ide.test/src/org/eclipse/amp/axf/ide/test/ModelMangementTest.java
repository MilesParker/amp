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

package org.eclipse.amp.axf.ide.test;

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
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
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
@SuppressWarnings("deprecation")
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

	public static void copyFiles(String srcPluginID, String srcFileLoc, String destProjectName, String destFileLoc) throws CoreException, IOException {
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
	 * In future you will not need to create this instance. You need to extend
	 * SWTBotEclipseTestCase which holds an instance of SWTEclipseBot.
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

	// protected void setUp() throws Exception {
	// super.setUp();
	// setupProject();
	// }

	public void testOne() {
		setupProject();
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

	public void testCloseOne() {
		setupProject();
		bot.sleep(2000);
		// start new
		launchModel();
		bot.sleep(4000);
		IModel modelA_1 = activeModel();
		assertNotNull(modelA_1);

		subtestCloseViews(modelA_1);
		SWTBotView swtGraphicsView = gefViews().get(0);
		swtGraphicsView.close();
		bot.sleep(3000);
		IModel iModel = manager().getModels().get(0);
		assertTrue(iModel.getPeriod() + "too big!", iModel.getPeriod() < 500);
		control().menu("Close").click();
		bot.sleep(3000);

		// start new
		launchModel();
		IModel modelA_1_2 = activeModel();
		assertNotNull(modelA_1_2);
		subtestCloseViews(modelA_1_2);
		SWTBotView swtChartView = chartViews().get(0);
		swtChartView.close();
		bot.sleep(3000);
		IModel iModel2 = manager().getModels().get(0);
		assertTrue(iModel2.getPeriod() + "too big!", iModel2.getPeriod() < 500);
		control().menu("Close").click();

		bot.sleep(3000);

		modelA_1 = activeModel();
		assertNull(modelA_1);

		assertEquals(manager().getModels().size(), 0);
	}

	private void subtestCloseViews(IModel modelA_1) {
		List<IViewPart> viewsA_1 = manager().getViews(modelA_1);
		assertEquals(viewsA_1.size(), 2);
		IViewPart chartView = viewsA_1.get(0);
		assertEquals(chartView.getTitle(), "Demographic Prisoner_s Dilemma Chart View");
		IViewPart gefView = viewsA_1.get(1);
		assertEquals(gefView.getTitle(), "Demographic Prisoner_s Dilemma Graphic View");
	}

	public void testTwo() {
		setupProject();
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
		assertEquals(viewsA_1.size(), 2);
		activateView(viewsA_1);
		bot.sleep(2000);
		assertEquals(activeModel(), modelA_1);

		control().menu("Pause").click();
		bot.sleep(1000);
		assertTrue(activeModel().getEngine().isPaused());

		List<IViewPart> viewsA_2 = manager().getViews(modelA_2);
		assertEquals(viewsA_2.size(), 2);
		activateView(viewsA_2);
		bot.sleep(2000);
		assertEquals(activeModel(), modelA_2);
		assertTrue(!activeModel().getEngine().isPaused());

		activateView(viewsA_1);
		bot.sleep(2000);
		assertTrue(activeModel().getEngine().isPaused());

		// rapid cycle
		for (int i = 0; i < 4; i++) {
			activateView(viewsA_1);
			bot.sleep(1000);
			assertEquals(activeModel(), modelA_1);
			assertTrue(control().menu("Restart").isEnabled());
			assertTrue(!control().menu("Pause").isEnabled());
			assertTrue(control().menu("Stop").isEnabled());
			assertTrue(control().menu("Resume").isEnabled());
			assertTrue(!control().menu("Start").isEnabled());
			activateView(viewsA_2);
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
		assertTrue(manager().getActiveModel() == modelA_1);
		assertEquals(gefViews().size(), 1);
		activateView(viewsA_1);
		assertTrue(control().menu("Restart").isEnabled());
		assertTrue(!control().menu("Pause").isEnabled());
		assertTrue(control().menu("Stop").isEnabled());
		assertTrue(control().menu("Resume").isEnabled());
		assertTrue(!control().menu("Start").isEnabled());
		control().menu("Resume").click();
		bot.sleep(1500);
		subTestPauseResume(modelA_1);
		subTestStopStartRestart(modelA_1);
		control().menu("Close").click();
		bot.sleep(2000);
		assertEquals(gefViews().size(), 0);
		assertEquals(manager().getModels().size(), 0);
		assertNull(manager().getActiveModel());
	}

	public void testStopPause() {
		setupProject();
		bot.sleep(2000);
		// start new
		launchModel();
		IModel modelA_1 = activeModel();
		control().menu("Pause").click();
		bot.sleep(1000);
		assertTrue(activeModel().getEngine().isPaused());

		// start another
		launchModel();

		control().menu("Close").click();
		bot.sleep(2000);
		assertTrue(activeModel().getEngine().isPaused());
		assertEquals(activeModel(), modelA_1);
		assertEquals(manager().getModels().size(), 1);
		assertTrue(control().menu("Restart").isEnabled());
		assertTrue(!control().menu("Pause").isEnabled());
		assertTrue(control().menu("Stop").isEnabled());
		assertTrue(control().menu("Resume").isEnabled());
		assertTrue(!control().menu("Start").isEnabled());

		control().menu("Close").click();
		bot.sleep(2000);
		assertNull(manager().getActiveModel());
		assertNull(control().menu("Restart"));
	}

	public void testStopTwo() {
		setupProject();
		bot.sleep(2000);
		// start new
		launchModel();
		IModel modelA_1 = activeModel();

		// start another
		launchModel();
		IModel modelA_2 = activeModel();

		control().menu("Close").click();
		bot.sleep(2000);
		assertEquals(activeModel(), modelA_1);
		assertEquals(manager().getModels().size(), 1);
		assertTrue(modelA_1.getEngine().isRunning());
		assertFalse(modelA_2.getEngine().isRunning());
		if (!control().menu("Restart").isEnabled()) {
			assertTrue(control().menu("Restart").isEnabled());
		}
		assertTrue(control().menu("Pause").isEnabled());
		assertTrue(control().menu("Stop").isEnabled());
		assertTrue(!control().menu("Resume").isEnabled());
		assertTrue(!control().menu("Start").isEnabled());

		control().menu("Close").click();
		bot.sleep(2000);
		assertNull(manager().getActiveModel());
		assertTrue(control() == null || control().menu("Start") == null);
	}

	private void launchModel() {
		tree().setFocus();
		tree().select(testProjectName);
		SWTBotTreeItem projectNode = tree().expandNode(testProjectName);
		bot.sleep(2000);
		projectNode.expandNode("TestModel.metaabm").doubleClick();
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

	private void activateView(final List<IViewPart> views) {
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
		return null;
		// return
		// bot.views(WidgetMatcherFactory.withPartName("Demographic Prisoner_s Dilemma Graphic View"));
	}

	private List<SWTBotView> chartViews() {
		return null;
		// return
		// bot.views(WidgetMatcherFactory.withPartName("Demographic Prisoner_s Dilemma Chart View"));
	}

	private SWTBotMenu control() {
		return bot.menu("Control");
	}

	public static ModelViewManager manager() {
		return ModelViewManager.getInstance();
	}

	public static IModel activeModel() {
		return (IModel) manager().getActiveModel();
	}

	private void setupProject() {
		bot.sleep(3000);
		bot.viewByTitle("Welcome").close();
		bot.perspectiveByLabel("Agent Modeling").activate();
		bot.viewByTitle("Package Explorer").setFocus();
		try {
			tree().expandNode(testProjectName);
		} catch (WidgetNotFoundException e) {
			bot.sleep(3000);
			bot.menu("File").menu("New").menu("Agent Modeling Escape Project").click();
			// 'com.swtbot.test.project' is the java project name to create
			bot.sleep(2000);

			bot.text(0).setText(testProjectName);
			// Click the Finish button

			bot.button("Finish").click();
			try {
				copyFiles("org.eclipse.amp.axf.ide.test", "res/TestModel.metaabm", testProjectName, "TestModel.metaabm");
			} catch (CoreException e1) {
				throw new RuntimeException(e1);
			} catch (IOException e1) {
				throw new RuntimeException(e1);
			}
			bot.sleep(5000);
		}
	}

}
