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
 * </copyright> $Id: AgentImporter.java,v 1.1 2009/07/16 20:49:35 mparker Exp $
 */

package org.metaabm.ide;

import org.apache.commons.lang.CharUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.jobs.Job;
import org.metaabm.SAgent;
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;
import org.metaabm.SNamed;
import org.metaabm.commands.TargetTranslator;

/**
 * Imports Java class information into a meta-model class.
 * 
 * @author milesparker
 * 
 */
public abstract class AgentImporter extends Job {

    protected SAgent agent;

    protected String path;

    public AgentImporter(SAgent agent, String path, String name) {
        super(name);
        this.agent = agent;
        this.path = path;
    }

    protected void importAsSName(SNamed named, String name, String description) {
        String label = StringUtils.capitalize(insertSpaces(name));
        named.setLabel(label);
        named.setID(TargetTranslator.LABEL_TO_ID_TRANSLATOR.translateName(label, named));
        named.setPluralLabel(TargetTranslator.LABEL_TO_PLURAL_NAME_TRANSLATOR.translateName(label, null));
        if (named instanceof SImplemented) {
            SImplementation impl = ((SImplemented) named).getImplementation();
            if (impl != null) {
                impl.setClassName(TargetTranslator.LABEL_TO_CLASSNAME_TRANSLATOR.translateName(label, null));
            }
        }
        if (description != null) {
            named.setDescription(description);
        }
    }

    protected final static String insertSpaces(String propertyName) {
        StringBuilder propertyBuilder = new StringBuilder();
        boolean lastLower = false;
        for (char c : propertyName.toCharArray()) {
            if (lastLower && CharUtils.isAsciiAlphaUpper(c)) {
                propertyBuilder.append(' ');
            } else {
                lastLower = true;
            }
            propertyBuilder.append(c);
        }
        return propertyBuilder.toString();
    }
}
