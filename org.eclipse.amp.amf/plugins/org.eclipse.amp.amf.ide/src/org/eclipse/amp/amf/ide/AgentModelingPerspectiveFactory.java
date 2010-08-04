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
 *   Metascape - Development and maintenance
 *
 * </copyright> $Id: AgentModelingPerspectiveFactory.java,v 1.2 2010/08/04 01:54:58 mparker Exp $
 */
package org.eclipse.amp.amf.ide;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * Simple support for the AMF Agent Modeling perspective.
 * 
 * @author Miles Parker
 */
public class AgentModelingPerspectiveFactory implements IPerspectiveFactory {

    // private static final String METAABM_ACTION_ID =
    // "com.qualityeclipse.favorites.workbenchActionSet";

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui
     * .IPageLayout)
     */
    public void createInitialLayout(IPageLayout layout) {
        // Get the editor area.
        // String editorArea = layout.getEditorArea();

        //        IFolderLayout folder = layout.createFolder("left", IPageLayout.LEFT, (float) 0.25, editorArea); //$NON-NLS-1$
        // folder.addView(JavaUI.ID_PACKAGES);
        // folder.addView(JavaUI.ID_TYPE_HIERARCHY);
        // folder.addPlaceholder(IPageLayout.ID_RES_NAV);
        //
        //        IFolderLayout statusViews = layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.75, editorArea); //$NON-NLS-1$
        // statusViews.addView(IPageLayout.ID_PROBLEM_VIEW);
        // statusViews.addView(JavaUI.ID_JAVADOC_VIEW);
        // statusViews.addView(JavaUI.ID_SOURCE_VIEW);
        // statusViews.addPlaceholder(IProgressConstants.PROGRESS_VIEW_ID);
        // PDE
        // layout.addActionSet(IDebugUIConstants.LAUNCH_ACTION_SET);
        // layout.addActionSet(JavaUI.ID_ACTION_SET);
        // layout.addActionSet(JavaUI.ID_ELEMENT_CREATION_ACTION_SET);
        // layout.addActionSet(IPageLayout.ID_NAVIGATE_ACTION_SET);
        //
        // // views - java
        // layout.addShowViewShortcut(JavaUI.ID_PACKAGES);
        // layout.addShowViewShortcut(JavaUI.ID_TYPE_HIERARCHY);
        // layout.addShowViewShortcut(JavaUI.ID_SOURCE_VIEW);
        // layout.addShowViewShortcut(JavaUI.ID_JAVADOC_VIEW);
        // layout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
        // layout.addShowViewShortcut(IConsoleConstants.ID_CONSOLE_VIEW);
        // layout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        // layout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
        // layout.addShowViewShortcut(IPageLayout.ID_RES_NAV);
        // layout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
        // layout.addShowViewShortcut(IProgressConstants.PROGRESS_VIEW_ID);
    }
}
