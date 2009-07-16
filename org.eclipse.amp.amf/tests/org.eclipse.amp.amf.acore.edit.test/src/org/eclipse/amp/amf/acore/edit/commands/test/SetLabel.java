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

import java.util.ArrayList;
import java.util.List;

import org.metaabm.MetaABMPackage;

public class SetLabel extends SetTransformer {

    private String newLabel;

    private String oldLabel;

    SetLabelPropogationCondition cond;

    public SetLabel(String oldLabel, String newLabel) {
        super(MetaABMPackage.Literals.IID__LABEL, newLabel);
        this.oldLabel = oldLabel;
        this.newLabel = newLabel;
    }

    public void addPrePost(List<PrePostCondition> list) {
        super.addPrePost(list);
        cond = new SetLabelPropogationCondition(newLabel);
        // model = target;
        if (conditions == null) {
            conditions = new ArrayList<PrePostCondition>();
            addPrePost(conditions);
        }
        if (cond != null) {
            cond.id = getIID();
            cond.labelString = newLabel;
        }
        list.add(cond);
    }

    public void preCondition() {
        CommandTest.assertEquals(getIID().getLabel(), oldLabel);
    }

    public void postCondition() {
        CommandTest.assertEquals(getIID().getLabel(), newLabel);
    }
}