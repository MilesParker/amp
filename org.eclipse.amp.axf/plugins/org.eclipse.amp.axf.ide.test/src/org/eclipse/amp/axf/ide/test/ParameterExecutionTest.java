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

import junit.framework.TestCase;

import org.ascape.model.Scape;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.exceptions.WidgetNotFoundException;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem;

/**
 * 
 * @author mparker
 * 
 */
public class ParameterExecutionTest extends TestCase {

    String testProjectName = "test.escape";
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

    public void testLaunch() {
        launchParameter();
        bot.sleep(1000);
        Scape model = ((ScapeWrapperModel) ModelMangementTest.activeModel()).getScape();
        try {
            Class pd = Class.forName("edu.brook.DemographicPrisonersDilemma");
            assertEquals(pd.getField("MaximumAge").getInt(model), 1000);
            assertEquals(pd.getField("StopPeriod").getInt(model), 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    private void launchParameter() {
        tree().setFocus();
        tree().select(testProjectName);
        SWTBotTreeItem projectNode = tree().expandNode(testProjectName);
        bot.sleep(2000);
        projectNode.expandNode("Test1.apar").doubleClick();
        packageExplorer().setFocus();
        bot.sleep(2000);

        control().menu("Execute").click();
        bot.sleep(2500);
    }
    private SWTBotMenu control() {
        return bot.menu("Control");
    }

}
