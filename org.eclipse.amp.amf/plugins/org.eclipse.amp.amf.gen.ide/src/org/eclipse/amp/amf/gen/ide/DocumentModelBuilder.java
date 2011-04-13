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
 * </copyright> $Id: DocumentModelBuilder.java,v 1.1 2009/07/16 21:01:08 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;

import org.metaabm.gen.AMFGenPlugin;

/**
 * Generates default documentation for project models.
 * 
 * @author milesparker
 * 
 */
public class DocumentModelBuilder extends MetaABMBuilder {

	public final static String DOCUMENT_BUILDER_ID = "docBuilder";

	private static MetaABMBuilder docBuilder;

	public DocumentModelBuilder() {
		super("Generating HTML Documentation", AMFGenPlugin.PLUGIN_ID, "model/generate_html_docs.mwe", false);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static MetaABMBuilder getDocumentBuilderDefault() {
		if (docBuilder == null) {
			docBuilder = new DocumentModelBuilder();
		}
		return docBuilder;
	}
}
