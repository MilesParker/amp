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
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.eclipse.amp.amf.acore.edit.commands.test;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SContext;
import org.metaabm.act.AGroup;
import org.metaabm.act.AInput;
import org.metaabm.act.AQuery;

public class PrePostCondition implements PrePostAsserts {

    SContext model;
    EditingDomain domain;
    CommandTest t;

    public void preCondition() {
    }

    public void postCondition() {
    }

    public EditingDomain getDomain() {
        return domain;
    }

    public void setDomain(EditingDomain domain) {
        this.domain = domain;
    }

    public SContext getModel() {
        return model;
    }

    public SAttribute attr(int ind) {
        return model.getAttributes().get(ind);
    }

    public SAttribute agAttr(int ind) {
        return memAgent().getAttributes().get(ind);
    }

    public AInput agInput(int ind) {
        return agQuery().getInputs().get(ind);
    }

    public AQuery agQuery() {
        return (AQuery) agentRootAct().getMembers().get(1);
    }

    public AGroup rootAct() {
        return (AGroup) model.getRootActivity();
    }

    public AGroup agentRootAct() {
        return (AGroup) memAgent().getRootActivity();
    }

    public SAgent memAgent() {
        return (SAgent) model.getAgents().get(0);
    }

    public SContext memContext() {
        return (SContext) model.getAgents().get(0);
    }

    public void setModel(SContext model) {
        this.model = model;
    }

    public void setTestCase(CommandTest t) {
        this.t = t;
    }
}
