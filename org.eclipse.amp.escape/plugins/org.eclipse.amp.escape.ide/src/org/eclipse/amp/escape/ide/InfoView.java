package org.eclipse.amp.escape.ide;

import java.io.IOException;
import java.net.URL;

import org.ascape.model.Scape;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.view.ActiveModelViewPart;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.core.runtime.FileLocator;
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
 * The 'About this Model' view.
 * 
 * The 'About this Model' view displays information about a (AMF or Java based)
 * model if it has been provided by the developer. In order to appear in this
 * dialog, create a file named "About[MyModel].html" where "MyModel" is the
 * model's Scape Class Name (not the AMF model file name). The file should be an
 * html fragment -- that is, without body and head tags -- and can include any
 * valid html tags, including links.
 * <p>
 * The model's class loader is used to locate the file. If the model is a
 * workspace resource then {@link ProjectLoader} will be used to locate the
 * file. See {@link ProjectLoader} for more info.
 * <p>
 * If the model is part of a loaded bundle then
 * {@link org.eclipse.osgi.internal.loader.BundleLoader#findResource(String)} 
 * will be the class loader code used
 * to locate the file using this <a href=
 * "http://wiki.eclipse.org/index.php/Context_Class_Loader_Enhancements#Search_Order"
 * > search logic</a>. To have the class loader search a res folder in the
 * model's bundle add this entry to the model bundle's MANIFEST.MF:
 * <p>
 * {@code Bundle-Classpath: bin;res}
 * <p>
 * Then place the "About[MyModel].html" file in a "res" source folder in
 * bundle's root directory in a parallel directory path to the Java class
 * package. For example, an about file for a model defined by the scape
 * "edu.brook.norms.Norms" could be placed at
 * "res/edu/brook/norms/AboutNorms.html".
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

			String aboutFileName = "About" + scape.getClass().getSimpleName()
					+ ".html";

			// get a URL to the resource. aboutFileName does not contain a
			// package name so this will prefixed by the scape's package
			// eg: AboutCoordinationGame.html ->
			// the class loader will search its class path for
			// ede/model/brook/AboutCoordinationGame.html
			final URL aboutURL = scape.getClass().getResource(aboutFileName);

			browser.getDisplay().asyncExec(new Runnable() {
				public void run() {
					if (aboutURL != null) {
						try {
							// resolve bundleresource URLs to file URLs
							final URL url = FileLocator.resolve(aboutURL);
							browser.setUrl(url.toString());
							browser.setBackground(browser.getDisplay()
									.getSystemColor(SWT.COLOR_WHITE));
						} catch (IOException e) {
							browser.setText("<b>[Bad URL:" + e + "]");
							browser.setBackground(browser.getDisplay()
									.getSystemColor(SWT.COLOR_GRAY));
						}
					} else {
						browser.setBackground(browser.getDisplay()
								.getSystemColor(SWT.COLOR_GRAY));
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
