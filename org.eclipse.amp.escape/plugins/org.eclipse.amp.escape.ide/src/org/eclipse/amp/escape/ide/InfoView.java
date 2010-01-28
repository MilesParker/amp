package org.eclipse.amp.escape.ide;

import java.net.MalformedURLException;
import java.net.URL;

import org.ascape.model.Scape;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.AXFWorkbenchPlugin;
import org.eclipse.amp.axf.ide.AbstractModelWorkbenchListener;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

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

/**
 * 
 * @author mparker
 * 
 */
public class InfoView extends ViewPart {

    /**
     * @param parent
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    public void createPartControl(Composite parent) {
        final Browser b = new Browser(parent, SWT.NONE); // Uses IE on MS Windows
        ModelViewManager manager = AXFWorkbenchPlugin.getDefault().getManager();
        if (manager.getActiveModel() != null) {
            onModelChange(b, (IModel) manager.getActiveModel());
        }
        manager.getManagerListeners().addModelManagerListener(new AbstractModelWorkbenchListener() {

            public void modelActivated(IModel model) {
                onModelChange(b, model);
            }

        });
    }

    private void onModelChange(final Browser b, IModel model) {
        if (model instanceof ScapeWrapperModel) {
            Scape scape = ((ScapeWrapperModel) model).getScape();
            EclipseEscapeRunner runner = (EclipseEscapeRunner) scape.getRunner();
            IPath path = new Path("res/" + scape.getClass().getName().replace('.', '/'));
            path = path.removeLastSegments(1).append("About" + path.lastSegment()).addFileExtension("html");
            final IFile file = runner.getExecutingProject().getFile(path);
            b.getDisplay().asyncExec(new Runnable() {
                public void run() {
                    if (file.exists()) {
                        try {
                            final URL url = file.getLocationURI().toURL();
                            b.setUrl(url.getFile());
                            b.setBackground(b.getDisplay().getSystemColor(SWT.COLOR_WHITE));
                        } catch (MalformedURLException e) {
                            b.setText("<b>[Bad URL:" + e + "]");
                            b.setBackground(b.getDisplay().getSystemColor(SWT.COLOR_GRAY));
                        }
                    } else {
                        b.setBackground(b.getDisplay().getSystemColor(SWT.COLOR_GRAY));
                        b.setText("<b>[Empty]");
                    }
                }
            });
        }
    }
    /**
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
     */
    public void setFocus() {
    }

}
