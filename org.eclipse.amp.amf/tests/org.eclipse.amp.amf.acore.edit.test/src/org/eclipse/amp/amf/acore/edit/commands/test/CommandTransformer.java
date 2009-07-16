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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.metaabm.SContext;
import org.metaabm.tests.Transformer;

public abstract class CommandTransformer extends PrePostCondition implements Transformer, PrePostAsserts {

    String name;

    List<PrePostCondition> conditions;

    Map<SContext, Command> commandForModel = new HashMap<SContext, Command>();

    public CommandTransformer(String name) {
        super();
        this.name = name;
    }

    public CommandTransformer() {
        this("");
    }

    public void prepare(SContext target) {
        this.model = target;
        if (conditions == null) {
            conditions = new ArrayList<PrePostCondition>();
            addPrePost(conditions);
        }
    }

    public void doPreCondition() {
        preCondition();
        for (PrePostCondition condition : conditions) {
            condition.setDomain(domain);
            condition.setModel(model);
            condition.setTestCase(t);
            condition.preCondition();
        }
    }

    public void doPostCondition() {
        postCondition();
        for (PrePostCondition condition : conditions) {
            condition.setDomain(domain);
            condition.setModel(model);
            condition.setTestCase(t);
            condition.postCondition();
        }
    }

    // public void execOnly() {
    // if (commandForModel.get(getModel()) != null) {
    // t.fail();
    // }
    // Command command = getCommand();
    // command.execute();
    // }

    public void exec() {
        doPreCondition();
        if (commandForModel.get(getModel()) != null) {
            CommandTest.fail();
        }
        Command command = getCommand();
        commandForModel.put(getModel(), command);
        command.execute();
        doPostCondition();
    }

    public void undo() {
        doPostCondition();
        commandForModel.get(getModel()).undo();
        doPreCondition();
    }

    public void redo() {
        doPreCondition();
        commandForModel.get(getModel()).redo();
        doPostCondition();
    }

    public void addPrePost(List<PrePostCondition> list) {
    }

    public abstract Command getCommand();

    public String toString() {
        Command command = commandForModel.get(getModel());
        String desc =
                        command != null
                                        ? command.getLabel() + "  " + (name != null ? name + "Name: " : "") + command
                                                        .getDescription() : "Unknown Command";
        if (command.canExecute()) {
            desc += command.getAffectedObjects() == null ? "No Affected" : "Affected: ";
            for (Object object : command.getAffectedObjects()) {
                desc += object.toString();
            }
        } else {
            desc += "*Can't Execute*";
        }
        return desc;
    }

    public boolean modifies() {
        return true;
    }
}