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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.metaabm.IID;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;

public class ModelIDsCommandTest extends CommandTest {

    public ModelIDsCommandTest(String name) {
        super(name);
    }

    public void testSetLabelAttribute() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), model, MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                         MetaABMFactory.eINSTANCE.createSAttribute());
            }
        });
        cmds.add(new SetLabel("Attribute", "Test Attribute") {
            public IID getIID() {
                return model.getAttributes().get(0);
            }
        });
        executeTests(cmds);
    }

    public void testRenameRootContext() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildBasic(cmds);
        // cmds.add(new SetTransformer(MetaABMPackage.Literals.IID__ID,
        // "testModel"));
        // cmds.add(new SetTransformer(MetaABMPackage.Literals.IID__LABEL,
        // "Test Model"));
        cmds.add(new SetLabel("Root Context", "Test Model") {
            public void preCondition() {
                super.preCondition();
            }

            public void postCondition() {
                super.postCondition();
                assertEquals(model.getLabel(), "Test Model");
                assertEquals(model.getAgents().get(0).getLabel(), "Root Context Agent");
            }
        });
        executeTests(cmds);
    }

    public void testRenameAgents() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildBasic(cmds);
        cmds.add(new RenameAgentCommand());
        cmds.add(new RenameSubContextCommand());
        executeTests(cmds);
    }

    public void testNoOverwriteIDs() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildBasic(cmds);
        cmds.add(new SetID("rootContext", "thx1295") {
            public Command getCommand() {
                return super.getCommand();
            }
        });
        cmds.add(new SetLabel("Root Context", "Another Context") {

            public void addPrePost(List<PrePostCondition> list) {
            }

            public void preCondition() {
                super.preCondition();
                assertEquals(model.getID(), "thx1295");
            }

            public void postCondition() {
                assertEquals(model.getID(), "thx1295");
            }
        });
        cmds.add(new SetID("thx1295", "anotherContext") {
            public void postCondition() {
                assertEquals(model.getID(), "anotherContext");
            }
        });
        cmds.add(new SetLabel("Another Context", "Some Other Context") {

            public void addPrePost(List<PrePostCondition> list) {
            }

            public void postCondition() {
                assertEquals(model.getID(), "someOtherContext");
            }
        });
        executeTests(cmds);
    }

    public void testNoOverwritePlurals() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildBasic(cmds);
        cmds.add(new SetLabel("Root Context Agent", "Wolf") {
            public void postCondition() {
                super.postCondition();
                assertEquals(getSNamed().getPluralLabel(), "Wolfs");
            }

            public IID getIID() {
                return model.getAgents().get(0);
            }
        });
        cmds.add(new SetTransformer(MetaABMPackage.Literals.SNAMED__PLURAL_LABEL, "Wolves") {
            public void postCondition() {
                super.postCondition();
                assertEquals(getSNamed().getPluralLabel(), "Wolves");
            }

            public IID getIID() {
                return model.getAgents().get(0);
            }
        });
        cmds.add(new SetLabel("Wolf", "Wombat") {

            public void addPrePost(List<PrePostCondition> list) {
            }

            public void postCondition() {
                super.postCondition();
                assertEquals(getSNamed().getPluralLabel(), "Wolves");
            }

            public IID getIID() {
                return model.getAgents().get(0);
            }
        });
        executeTests(cmds);
    }

    public void testNoOverwritePluralNames() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildBasic(cmds);
        cmds.add(new SetLabel("Root Context Agent", "Sheep") {
            public void postCondition() {
                super.postCondition();
                // :D
                assertEquals(getSNamed().getPluralLabel(), "Sheeps");
                assertEquals(model.getAttributes().get(0).getLabel(), "Sheep Count");
                assertEquals(model.getAttributes().get(0).getDescription(), "The number of sheeps to create.");
            }

            public IID getIID() {
                return model.getAgents().get(0);
            }
        });
        cmds.add(new SetTransformer(MetaABMPackage.Literals.SNAMED__PLURAL_LABEL, "Sheep") {
            public void postCondition() {
                super.postCondition();
                assertEquals(getSNamed().getPluralLabel(), "Sheep");
                assertEquals(model.getAttributes().get(0).getLabel(), "Sheep Count");
                // this does not work -- yet!
                assertEquals(model.getAttributes().get(0).getDescription(), "The number of sheeps to create.");
            }

            public IID getIID() {
                return model.getAttributes().get(0);
            }
        });
        cmds.add(new SetTransformer(MetaABMPackage.Literals.SNAMED__DESCRIPTION, "Sheep!!!") {
            public void postCondition() {
                super.postCondition();
                assertEquals(model.getAttributes().get(0).getDescription(), "Sheep!!!");
            }

            public IID getIID() {
                return model.getAttributes().get(0);
            }
        });
        cmds.add(new SetLabel("Sheep", "Wolf") {
            public void postCondition() {
                super.postCondition();
                assertEquals(getSNamed().getPluralLabel(), "Wolfs");
                assertEquals(model.getAttributes().get(0).getLabel(), "Wolf Count");
                assertEquals(model.getAttributes().get(0).getDescription(), "Sheep!!!");
            }

            public IID getIID() {
                return model.getAgents().get(0);
            }
        });
        executeTests(cmds);
    }

    public void testUniqueLabels() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildBasic(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), model, MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                         MetaABMFactory.eINSTANCE.createSAttribute());
            }

            public void preCondition() {
                CommandTest.assertEquals(model.getAttributes().size(), 2);
            }

            public void postCondition() {
                CommandTest.assertEquals(model.getAttributes().size(), 3);
                CommandTest.assertEquals(model.getAttributes().get(2).getLabel(), "Attribute");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), model, MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                         MetaABMFactory.eINSTANCE.createSAttribute());
            }

            public void preCondition() {
                CommandTest.assertEquals(model.getAttributes().size(), 3);
            }

            public void postCondition() {
                CommandTest.assertEquals(model.getAttributes().size(), 4);
                CommandTest.assertEquals(model.getAttributes().get(3).getLabel(), "Attribute Copy");
            }
        });
        cmds.add(new SetLabel("Attribute", "An Attribute") {
            public void postCondition() {
                super.postCondition();
                assertEquals(model.getAttributes().get(2).getLabel(), "An Attribute");
                assertEquals(model.getAttributes().get(3).getLabel(), "Attribute Copy");
            }

            public IID getIID() {
                return model.getAttributes().get(2);
            }
        });
        cmds.add(new SetLabel("Attribute Copy", "Another Attribute") {
            public void addPrePost(List<PrePostCondition> list) {
            }

            public void postCondition() {
                super.postCondition();
                assertEquals(model.getAttributes().get(2).getLabel(), "An Attribute");
                assertEquals(model.getAttributes().get(3).getLabel(), "Another Attribute");
            }

            public IID getIID() {
                return model.getAttributes().get(3);
            }
        });
        cmds.add(new SetLabel("An Attribute", "Another Attribute") {
            public void addPrePost(List<PrePostCondition> list) {
            }

            public void postCondition() {
                assertEquals(model.getAttributes().get(2).getLabel(), "Another Attribute Copy");
                assertEquals(model.getAttributes().get(3).getLabel(), "Another Attribute");
            }

            public IID getIID() {
                return model.getAttributes().get(2);
            }
        });
        cmds.add(new SetLabel("Another Attribute", "Another Attribute Copy") {
            public void addPrePost(List<PrePostCondition> list) {
            }

            public void postCondition() {
                assertEquals(model.getAttributes().get(2).getLabel(), "Another Attribute Copy");
                assertEquals(model.getAttributes().get(3).getLabel(), "Another Attribute Copy Copy");
            }

            public IID getIID() {
                return model.getAttributes().get(3);
            }
        });
        executeTests(cmds);
    }

    public void testStyleAndNames() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildBasic(cmds);
        cmds.add(new AddStyle2D());
        cmds.add(new SetStyleAgent());
        cmds.add(new SetLabel("Root Context Agent", "Test Agent") {
            public IID getIID() {
                return model.getAgents().get(0);
            }

            public void postCondition() {
                assertEquals(model.getAgents().get(0).getStyles().get(0).getLabel(), "Test Agent Style 2D");
            }
        });
        cmds.add(new SetLabel("Test Agent Style 2D", "My Style") {
            public IID getIID() {
                return model.getAgents().get(0).getStyles().get(0);
            }
        });
        cmds.add(new SetLabel("Test Agent", "Test Agent 2") {
            public IID getIID() {
                return model.getAgents().get(0);
            }

            public void postCondition() {
                assertEquals(model.getAgents().get(0).getStyles().get(0).getLabel(), "My Style");
            }
        });
        cmds.add(new SetLabel("My Style", "Test Agent 2 Style 2D Copy") {
            public IID getIID() {
                return model.getAgents().get(0).getStyles().get(0);
            }
        });
        cmds.add(new SetLabel("Test Agent 2", "Test Agent 3") {
            public IID getIID() {
                return model.getAgents().get(0);
            }

            public void postCondition() {
                assertEquals(model.getAgents().get(0).getStyles().get(0).getLabel(), "Test Agent 3 Style 2D");
            }
        });
        executeTests(cmds);
    }
}
