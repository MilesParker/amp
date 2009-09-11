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
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.metaabm.SContext;
import org.metaabm.act.provider.MetaABMActItemProviderAdapterFactory;
import org.metaabm.function.FFunction;
import org.metaabm.function.FLibrary;
import org.metaabm.function.provider.MetaABMFunctionItemProviderAdapterFactory;
import org.metaabm.provider.MetaABMItemProviderAdapterFactory;
import org.metaabm.tests.BasePersistTest;
import org.metaabm.tests.Transformer;
import org.metaabm.xsd.MetaABMPersist;

public abstract class CommandTest extends BasePersistTest {

    private EditingDomain domain;

    private AdapterFactory adapterFactory;

    public boolean trace = false;

    public boolean execOnly = false;

    boolean undo;

    protected static SContext lib;

    protected static FLibrary library;
    protected static FLibrary funcLog;
    protected static FLibrary funcNum;
    protected static FFunction funcAdd;
    protected static FFunction funcEq;
    protected static FFunction funcNot;

    public CommandTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {

        List<AdapterFactory> factories = new ArrayList<AdapterFactory>();
        factories.add(new ResourceItemProviderAdapterFactory());
        factories.add(new MetaABMFunctionItemProviderAdapterFactory());
        factories.add(new MetaABMItemProviderAdapterFactory());
        factories.add(new MetaABMActItemProviderAdapterFactory());
        factories.add(new ReflectiveItemProviderAdapterFactory());

        adapterFactory = new ComposedAdapterFactory(factories);
        // Create the command stack that will notify this editor as commands are
        // executed.
        BasicCommandStack commandStack;

        if (trace) {
            commandStack = new BasicCommandStack() {
                int level = 0;

                public void execute(Command command) {
                    System.out.println(StringUtils.repeat("    ", level) + "Executing: " + command);
                    level++;
                    super.execute(command);
                    level--;
                    System.out.println(StringUtils.repeat("    ", level) + "Executed : " + command);
                }
            };
            commandStack.addCommandStackListener(new CommandStackListener() {
                public void commandStackChanged(EventObject event) {
                    System.out.println("                                   Cmd Event: " + event);
                }
            });
        } else {
            commandStack = new BasicCommandStack();
        }
        domain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());

        MetaABMPersist libPersist = MetaABMPersist.createURI(URI.createURI("http://metaabm.org/core_library.metaabm"));
        lib = libPersist.load();
        library = (FLibrary) lib.getLibrary().get(0);
        funcLog = library.findSub("operators").findSub("logicalOperators");
        funcNum = library.findSub("operators").findSub("numericOperators");
        funcAdd = funcNum.findFunction("add");
        funcEq = funcLog.findFunction("equal");
        funcNot = funcLog.findFunction("not");

        super.setUp();
    }

    protected void execTransform(Transformer transformer) {
        Command command = ((CommandTransformer) transformer).getCommand();
        if (command instanceof CompoundCommand) {
            for (Command subCmd : ((CompoundCommand) command).getCommandList()) {
                assertTrue("Couldn't execute: " + subCmd.getLabel(), subCmd.canExecute());
            }
        }
        assertTrue(command.canExecute());
        super.execTransform(transformer);
    }

    public void executeTests(List<CommandTransformer> commandList) {
        int commandIndex = 0;
        for (CommandTransformer transformer : commandList) {
            transformer.setDomain(getDomain());
            transformer.setTestCase(this);
            execTransform(transformer, commandIndex);
            if (!execOnly) {
                undo = true;
                undoTransform(transformer, commandIndex);
                undo = false;
                redoTransform(transformer, commandIndex);
            }
            domain.getCommandStack().flush();
            commandIndex++;
        }
    }

    // public void executeNoTests(List<CommandTransformer> commandList) {
    // for (CommandTransformer transformer : commandList) {
    // transformer.setDomain(getDomain());
    // transformer.setTestCase(this);
    // execOnly(transformer);
    // domain.getCommandStack().flush();
    // }
    // }

    public boolean isUndo() {
        return undo;
    }

    public EditingDomain getDomain() {
        return domain;
    }

    public void setDomain(EditingDomain domain) {
        this.domain = domain;
    }

    public AdapterFactory getAdapterFactory() {
        return adapterFactory;
    }

    public void setAdapterFactory(AdapterFactory adapterFactory) {
        this.adapterFactory = adapterFactory;
    }

    protected void tearDown() throws Exception {
        // super.tearDown();
    }

    public static void assertEqualNull(String str0, String str1) {
        if (StringUtils.isEmpty(str0) && StringUtils.isEmpty(str1)) {
            return;
        }
        assertEquals(str0, str1);
    }
}
