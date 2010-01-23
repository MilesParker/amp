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

package org.eclipse.amp.escape.ide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PerspectiveAdapter;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.Perspective;
import org.eclipse.ui.internal.WorkbenchPage;
import org.eclipse.ui.internal.registry.IActionSetDescriptor;

/**
 * On activation of a perspective, disables provided action sets. Note: uses Eclipse internal APIs. Note that there is
 * not currently a mechanism to uninstall though it would be pretty simple to write one.
 * 
 * Inspired by code snippet from Dimitri Missoh.
 * 
 * @author mparker
 * 
 */
@SuppressWarnings("restriction")
public class ActionSetDisabler {

    /**
     * Install a perspective listener that disable supplied action sets whenever supplied target perspective is
     * activated. Should only be called when platform workbench window is available, i.e. at early startup.
     * 
     * @param targetPerspective the target perspective id
     * @param disabledActionSets all actions sets that should be disabled
     */
    public static void install(final String targetPerspective, final String... disabledActionSets) {
        Display.getDefault().asyncExec(new Runnable() {
            public void run() {
                final IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                if (workbenchWindow != null) {
                    workbenchWindow.addPerspectiveListener(new PerspectiveAdapter() {

                        @Override
                        public void perspectiveActivated(IWorkbenchPage page,
                                IPerspectiveDescriptor perspectiveDescriptor) {
                            super.perspectiveActivated(page, perspectiveDescriptor);
                            if (perspectiveDescriptor.getId().equals(targetPerspective)) {
                                if (workbenchWindow.getActivePage() instanceof WorkbenchPage) {
                                    WorkbenchPage worbenchPage = (WorkbenchPage) workbenchWindow.getActivePage();
                                    Perspective perspective = worbenchPage.findPerspective(perspectiveDescriptor);
                                    ArrayList<IActionSetDescriptor> disableActionSSets = new ArrayList<IActionSetDescriptor>();
                                    if (perspective != null) {
                                        List<String> disabledActionSetsList = Arrays.asList(disabledActionSets);
                                        for (IActionSetDescriptor actionSet : perspective.getAlwaysOnActionSets()) {
                                            if (disabledActionSetsList.contains(actionSet.getId())) {
                                                disableActionSSets.add(actionSet);
                                            }
                                        }
                                        perspective.turnOffActionSets(disableActionSSets
                                                                      .toArray(new IActionSetDescriptor[disableActionSSets.size()]));
                                    }
                                }
                            }
                        }
                    });
                }
            }

        });

    }

}
