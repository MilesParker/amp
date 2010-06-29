/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright> $Id: AddAgentsCommand.java,v 1.4 2010/06/29 19:47:22 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Collection;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.IID;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SContext;
import org.metaabm.SStyle;
import org.metaabm.act.AEvaluate;
import org.metaabm.act.ARule;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.function.FFunction;
import org.metaabm.function.FLibrary;

/**
 * Add agent implementation and base acts.
 * 
 * @author milesparker
 * 
 */
public class AddAgentsCommand extends AddCommand {

    CompoundCommand command;

    public AddAgentsCommand(EditingDomain domain, EObject owner, Collection<?> collection, int index) {
        super(domain, owner, MetaABMPackage.Literals.SCONTEXT__AGENTS, collection, index);
    }

    public boolean doCanExecute() {
        return true;
    }

    public boolean doCanUndo() {
        return true;
    }

    @SuppressWarnings("unchecked")
    public void doExecute() {
        super.doExecute();
        command = new CompoundCommand();
        command.appendAndExecute(new AddImplementatedCommand(domain, collection));
        command.appendAndExecute(new AddAgentsActsCommand(domain, (SContext) owner, collection));
        FFunction colorBlue = null;
        FFunction shapeOval = null;
        FFunction graphicFill = null;
        ResourceSet resourceSet = owner.eResource().getResourceSet();
        if (resourceSet != null) {
            for (Resource res : resourceSet.getResources()) {
                SContext context = (SContext) res.getContents().get(0);
                if (context.getLibrary().size() > 0) {
                    FLibrary library = (FLibrary) context.getLibrary().get(0);
                    for (TreeIterator<?> children = library.eAllContents(); children.hasNext();) {
                        EObject child = (EObject) children.next();
                        if (child instanceof FFunction && ((FFunction) child).getID().equals("colorBlue")) {
                            colorBlue = (FFunction) child;
                        } else if (child instanceof FFunction && ((FFunction) child).getID().equals("shapeOval")) {
                            shapeOval = (FFunction) child;
                        } else if (child instanceof FFunction && ((FFunction) child).getID().equals("graphicFill")) {
                            graphicFill = (FFunction) child;
                        }
                    }
                }
            }
        }
        command.appendAndExecute(new SuggestLabelCommand(domain, (Collection<IID>) collection));

        for (Object object : collection) {
            SAgent agent = (SAgent) object;
            SStyle style = MetaABMFactory.eINSTANCE.createSStyle2D();
            command.appendAndExecute(AddCommand.create(domain, agent, MetaABMPackage.Literals.SAGENT__STYLES, style));
            Object group = style.getRootActivity();

            ARule styleRule = MetaABMActFactory.eINSTANCE.createARule();
            command.appendAndExecute(AddCommand.create(domain, group, MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                                       styleRule));
            command.appendAndExecute(SetCommand.create(domain, styleRule, MetaABMPackage.Literals.IID__LABEL,
                                                       "Default " + agent.getLabel() + " Style"));

            if (colorBlue != null) {
                AEvaluate evalColor = MetaABMActFactory.eINSTANCE.createAEvaluate();
                command.appendAndExecute(AddCommand.create(domain, styleRule, MetaABMActPackage.Literals.AACT__TARGETS,
                                                           evalColor));
                command.appendAndExecute(SetCommand.create(domain, evalColor, MetaABMPackage.Literals.IID__LABEL,
                                                           "Default " + agent.getLabel() + " Color"));
                command.appendAndExecute(SetCommand.create(domain, evalColor,
                                                           MetaABMActPackage.Literals.ASINK__FUNCTION, colorBlue));

                AEvaluate evalShape = MetaABMActFactory.eINSTANCE.createAEvaluate();
                command.appendAndExecute(AddCommand.create(domain, evalColor, MetaABMActPackage.Literals.AACT__TARGETS,
                                                           evalShape));
                command.appendAndExecute(SetCommand.create(domain, evalShape, MetaABMPackage.Literals.IID__LABEL,
                                                           "Default " + agent.getLabel() + " Shape"));
                command.appendAndExecute(SetCommand.create(domain, evalShape,
                                                           MetaABMActPackage.Literals.ASINK__FUNCTION, shapeOval));

                AEvaluate evalFill = MetaABMActFactory.eINSTANCE.createAEvaluate();
                command.appendAndExecute(AddCommand.create(domain, evalShape, MetaABMActPackage.Literals.AACT__TARGETS,
                                                           evalFill));
                command.appendAndExecute(SetCommand.create(domain, evalFill, MetaABMPackage.Literals.IID__LABEL,
                                                           "Default " + agent.getLabel() + " Paint"));
                command.appendAndExecute(SetCommand.create(domain, evalFill,
                                                           MetaABMActPackage.Literals.ASINK__FUNCTION, graphicFill));
            }
        }
    }

    public void doRedo() {
        super.doRedo();
        command.redo();
    }

    public void doUndo() {
        command.undo();
        super.doUndo();
    }

}
