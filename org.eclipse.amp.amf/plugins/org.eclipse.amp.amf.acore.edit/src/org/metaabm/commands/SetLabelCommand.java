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
 * </copyright> $Id: SetLabelCommand.java,v 1.3 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import org.apache.commons.collections.CollectionUtils;
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SContext;
import org.metaabm.SImplementationMode;
import org.metaabm.SImplemented;
import org.metaabm.SNamed;
import org.metaabm.SProjection;

/**
 * Propagates name changes to other object identifiers.
 * 
 * @author milesparker
 * 
 */
public class SetLabelCommand extends SetCommand {

    IID source;

    List<TargetTranslator> translators;

    Command dependentCommands;

    public SetLabelCommand(final EditingDomain domain, List<TargetTranslator> translators, EObject owner,
            EStructuralFeature feature, Object value, int index) {
        super(domain, owner, feature, value, index);
        source = (IID) owner;
        this.translators = translators;
    }

    public SetLabelCommand(final EditingDomain domain, EObject owner, EStructuralFeature feature, Object value,
            int index) {
        super(domain, owner, feature, value, index);
        source = (IID) owner;
        translators = new ArrayList<TargetTranslator>(translatorsFor(source, feature));
        CollectionUtils.filter(translators, new org.apache.commons.collections.Predicate() {
            public boolean evaluate(Object object) {
                boolean includeFor = ((TargetTranslator) object).includeFor(domain, source);
                return includeFor;
            }
        });
    }

    public Command createDependent() {
        CompoundCommand cmd = new CompoundCommand();
        for (TargetTranslator translator : translators) {
            Command created = translator.createCommand(domain, (IID) owner);
            cmd.appendAndExecute(created);
        }
        return cmd;
    }

    // This is neccessary for the time being because the inheirtance hierarchy
    // for ItempProviders is incomplete
    public List<TargetTranslator> translatorsFor(IID source, EStructuralFeature feature) {
        if (feature == MetaABMPackage.Literals.IID__LABEL) {
            if (source instanceof SAgent
                    && (((SAgent) source).getOwner() == null || ((SAgent) source).getOwner().getImplementation()
                            .getMode() != SImplementationMode.GENERATE_LITERAL)) {
                return TargetTranslator.NAMED_IMPLEMENTED_TRANSLATORS;
            } else if (source instanceof SAgent) {
                return TargetTranslator.AGENT_TRANSLATORS;
            } else if (source instanceof SProjection) {
                return TargetTranslator.SAPCE_TRANSLATORS;
            } else if (source instanceof SImplemented && source instanceof SNamed) {
                return TargetTranslator.NAMED_IMPLEMENTED_TRANSLATORS;
            } else if (source instanceof SImplemented) {
                return TargetTranslator.IMPLEMENTED_TRANSLATORS;
            } else if (source instanceof SNamed) {
                return TargetTranslator.NAMED_TRANSLATORS;
            } else if (source instanceof IID) {
                return TargetTranslator.ID_TRANSLATORS;
            }
        } else if (feature == MetaABMPackage.Literals.SNAMED__PLURAL_LABEL) {
            if (source instanceof SContext
                    && ((SAgent) source).getOwner() != null
                    && ((SAgent) source).getOwner().getImplementation().getMode() == SImplementationMode.GENERATE_LITERAL) {
                return TargetTranslator.PLURAL_TRANSLATORS;
            } else {
                return new ArrayList<TargetTranslator>();
            }
        }
        throw new InternalError("Should not be possible to reach this line.");
    }

    /**
     * This creates a command to set the owner's feature to the specified value.
     * It is recommended to use the index form from
     * ItemProvider.createSetCommand in order to ensure proper overriding
     * behavior.
     */
    public static Command create(EditingDomain domain, final Object source, Object feature, Object value) {
        return create(domain, source, feature, value, CommandParameter.NO_INDEX);
    }

    public static Command create(EditingDomain domain, final Object source, Object value) {
        return create(domain, source, MetaABMPackage.Literals.IID__LABEL, value, CommandParameter.NO_INDEX);
    }

    /**
     * This creates a command to set the owner's feature to the specified value.
     */
    public static Command create(EditingDomain domain, final Object source, Object feature, Object value, int index) {
        EObject eSource = (EObject) source;
        if (eSource.eContainer() != null) {
            Object container = eSource.eContainer().eGet(eSource.eContainingFeature());
            if (container instanceof EList) {
                value = uniqueIn(source, (List<?>) container, (String) value);
            }
        }
        SetLabelCommand setLabelCommand =
            new SetLabelCommand(domain, (EObject) source, (EStructuralFeature) feature, value, index);
        setLabelCommand.prepare();
        return setLabelCommand;
    }

    public void doExecute() {
        super.doExecute();
        dependentCommands = createDependent();
    }

    public void doRedo() {
        super.doRedo();
        dependentCommands.redo();
    }

    public void doUndo() {
        dependentCommands.undo();
        super.doUndo();
    }

    private static Object uniqueIn(Object source, List<?> container, String proposed) {
        for (Object object : container) {
            if (source != object && ((IID) object).getLabel() != null && ((IID) object).getLabel().equals(proposed)) {
                return uniqueIn(source, container, proposed + " Copy");
            }
        }
        return proposed;
    }
}
