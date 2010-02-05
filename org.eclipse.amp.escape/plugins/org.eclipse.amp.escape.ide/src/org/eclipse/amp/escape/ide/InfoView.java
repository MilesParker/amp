package org.eclipse.amp.escape.ide;

import java.net.MalformedURLException;
import java.net.URL;

import org.ascape.model.Scape;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.view.ActiveModelViewPart;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Composite;

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
public class InfoView extends ActiveModelViewPart {

    private Browser browser;

    /**
     * @param parent
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    public void createPartControl(Composite parent) {
        browser = new Browser(parent, SWT.NONE);
        super.createPartControl(parent);
    }

    protected void modelChanged(IModel model) {
        if (model instanceof ScapeWrapperModel) {
            Scape scape = ((ScapeWrapperModel) model).getScape();
            EclipseEscapeRunner runner = (EclipseEscapeRunner) scape.getRunner();
            IPath path = new Path("res/" + scape.getClass().getName().replace('.', '/'));
            path = path.removeLastSegments(1).append("About" + path.lastSegment()).addFileExtension("html");
            final IFile file = runner.getExecutingProject().getFile(path);
            browser.getDisplay().asyncExec(new Runnable() {
                public void run() {
                    if (file.exists()) {
                        try {
                            final URL url = file.getLocationURI().toURL();
                            browser.setUrl(url.getFile());
                            browser.setBackground(browser.getDisplay().getSystemColor(SWT.COLOR_WHITE));
                        } catch (MalformedURLException e) {
                            browser.setText("<b>[Bad URL:" + e + "]");
                            browser.setBackground(browser.getDisplay().getSystemColor(SWT.COLOR_GRAY));
                        }
                    } else {
                        browser.setBackground(browser.getDisplay().getSystemColor(SWT.COLOR_GRAY));
                        browser.setText("<b>[Empty]");
                    }
                }
            });
        }
    }

    public void dispose() {
        browser.dispose();
        super.dispose();
    }
}
