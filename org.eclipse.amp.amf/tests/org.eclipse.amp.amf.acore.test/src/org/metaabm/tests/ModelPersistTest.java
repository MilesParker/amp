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
package org.metaabm.tests;

import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SContext;
import org.metaabm.act.ABuild;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.AGroup;
import org.metaabm.act.ASet;

/**
 * Created by IntelliJ IDEA. User: milesparker Date: Jun 21, 2006 Time: 10:11:32
 * AM To change this template use File | Settings | File Templates.
 */
public class ModelPersistTest extends BasePersistTest {

    public ModelPersistTest(String name) {
        super(name);
    }

    abstract class ModelTransformer implements Transformer {
        SContext target;

        public void execOnly() {
        }

        public void exec() {
        }

        public void undo() {
        }

        public void redo() {
        }

        public void prepare(SContext target) {
            this.target = target;
        }

        public boolean modifies() {
            return true;
        }
    }

    public void testBuild() {
        execTransform(new ModelTransformer() {
            public void exec() {
                target.setID("root");
            }
        });
        execTransform(new ModelTransformer() {
            public void exec() {
                SAgent createAgent = f.createSAgent();
                createAgent.setID("childAgent");
                // used by createagents id
                createAgent.setPluralLabel("childAgents");
                target.getAgents().add(createAgent);
            }
        });
        assertEquals(persistContext.getAgents().get(0).getID(), "childAgent");
        execTransform(new ModelTransformer() {
            public void exec() {
                SAttribute attr = f.createSAttribute();
                attr.setID("contextVar");
                target.getAttributes().add(attr);
            }
        });
        execTransform(new ModelTransformer() {
            public void exec() {
                AGroup group = fa.createAGroup();
                target.setRootActivity(group);
                group.setID("rootActGroup");
            }
        });
        execTransform(new ModelTransformer() {
            public void exec() {
                AGroup group = ((AGroup) target.getRootActivity());
                ABuild build = fa.createABuild();
                build.setID("buildTest");
                group.getMembers().add(build);
                ACreateAgents create = fa.createACreateAgents();
                create.setID("createTest");
                create.setAgent(target.getAgents().get(0));
                group.getMembers().add(create);
                build.getTargets().add(create);
            }
        });
        AGroup group = ((AGroup) persistContext.getRootActivity());
        assertTrue(group.getMembers().get(0).getTargets().contains(group.getMembers().get(1)));
        assertTrue(group.getMembers().get(1).getSources().contains(group.getMembers().get(0)));
        execTransform(new ModelTransformer() {
            public void exec() {
                ASet set = fa.createASet();
                set.setID("setTest");
                ((AGroup) target.getRootActivity()).getMembers().add(set);
                set.setAttribute(target.findAttribute("contextVar"));
            }
        });
        execTransform(new ModelTransformer() {
            public void exec() {
                SContext subCtx = f.createSContext();
                subCtx.setID("subContext");
                target.getAgents().add(subCtx);

                SAttribute subAttr = f.createSAttribute();
                subAttr.setID("subAttr");
                subCtx.getAttributes().add(subAttr);

                AGroup subGroup = fa.createAGroup();
                subCtx.setRootActivity(subGroup);
                subGroup.setID("rootActGroup");

                ASet subSetter = fa.createASet();
                subSetter.setLabel("setSubTest");
                subGroup.getMembers().add(subSetter);
                subSetter.setAttribute(target.findAttribute("contextVar"));

                ASet parSet = (ASet) ((AGroup) target.getRootActivity()).getMembers().get(2);
                parSet.setAttribute(subAttr);
            }
        });
    }
}