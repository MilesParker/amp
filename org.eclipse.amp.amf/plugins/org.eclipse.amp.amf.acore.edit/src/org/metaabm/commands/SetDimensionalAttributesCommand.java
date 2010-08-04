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
 * </copyright> $Id: SetDimensionalAttributesCommand.java,v 1.5 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import org.metaabm.MetaABMPackage;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
import org.metaabm.SNDimensional;
import org.metaabm.impl.MetaABMFactoryImpl;

/**
 * Creates dimensional attributes for a given projection based on dimensions provided. For example, when setting
 * dimensionality of 2, attributes for width and height will be created.
 * 
 * @author milesparker
 * 
 */
public class SetDimensionalAttributesCommand extends SetCommand {

    CompoundCommand command;
    SuggestLabelCommand suggestLabelCommand;

    public SetDimensionalAttributesCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
            Object value, int index) {
        super(domain, owner, feature, value, index);
    }

    static class DimAttributeVals {
        String name;

        String desc;

        DimAttributeVals(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }
    }

    static DimAttributeVals[][] ATTR_DESCS =
    {
        {},
        { new DimAttributeVals("Length", "The extent and size of the space.") },
        { new DimAttributeVals("Width", "The horizontal extent of the space."),
            new DimAttributeVals("Height", "The vertical extent of the space.") },
            { new DimAttributeVals("X Extent", "The horizontal extent of the space."),
                new DimAttributeVals("Y Extent", "The vertical extent of the space."),
                new DimAttributeVals("Z Extent", "The depth extent of the space.") } };

    static DimAttributeVals ARRAY_DESC = new DimAttributeVals("Dimensions", "The size of each dimension.");

    protected Command createDependents(EditingDomain domain, SNDimensional proj, int newDim) {
        command = new CompoundCommand();
        EList<SAttribute> attrs = proj.getAttributes();
        if (newDim > 0) {
            // SAttributeArray dims = (SAttributeArray) proj.findAttribute(ARRAY_DESC.name.toLowerCase());
            // if (dims == null) {
            // dims = MetaABMFactoryImpl.eINSTANCE.createSAttributeArray();
            // // todo make this all into a composite command
            // command.appendAndExecute(AddCommand.create(domain, proj,
            // MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, dims));
            // command.appendAndExecute(SetLabelCommand
            // .create(domain, dims, MetaABMPackage.Literals.IID__LABEL,
            // ARRAY_DESC.name));
            // command.appendAndExecute(SetCommand.create(domain, dims, MetaABMPackage.Literals.SNAMED__DESCRIPTION,
            // ARRAY_DESC.desc));
            // command.appendAndExecute(SetCommand.create(domain, dims, MetaABMPackage.Literals.ITYPED__STYPE,
            // SAttributeType.INTEGER_LITERAL));
            // }
            // command.appendAndExecute(SetCommand
            // .create(domain, dims, MetaABMPackage.Literals.ITYPED_ARRAY__SIZE, newDim));
            while (attrs.size() > newDim) {
                command.appendAndExecute(RemoveCommand.create(domain, proj,
                                                              MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, attrs.get(attrs.size() - 1)));
            }
            while (attrs.size() < newDim) {
                SAttribute attr = MetaABMFactoryImpl.eINSTANCE.createSAttribute();
                command.appendAndExecute(AddCommand.create(domain, proj,
                                                           MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, attr));
            }
            if (newDim > 3) {
                newDim = 0;
            }
            if (newDim > 0) {
                int index = 0;
                for (DimAttributeVals attrVal : ATTR_DESCS[newDim]) {
                    SAttribute attr = attrs.get(index);
                    command.appendAndExecute(SetLabelCommand.create(domain, attr, MetaABMPackage.Literals.IID__LABEL,
                                                                    attrVal.name));
                    command.appendAndExecute(SetCommand.create(domain, attr,
                                                               MetaABMPackage.Literals.SNAMED__DESCRIPTION, attrVal.desc));
                    command.appendAndExecute(SetCommand.create(domain, attr, MetaABMPackage.Literals.ITYPED__STYPE,
                                                               SAttributeType.INTEGER_LITERAL));
                    index++;
                }
            }
        } else {
            command.appendAndExecute(RemoveCommand.create(domain, proj,
                                                          MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, attrs));
        }
        // getDomain().getCommandStack().execute(cmd);
        return command;
    }

    @Override
    public void doRedo() {
        // TODO Auto-generated method stub
        super.doRedo();
        command.redo();
    }

    @Override
    public void doUndo() {
        // TODO Auto-generated method stub
        suggestLabelCommand = new SuggestLabelCommand(domain, (SNDimensional) getOwner());
        command.undo();
        super.doUndo();
        suggestLabelCommand.execute();
        // int oldDim = -1;
        // if (getOldValue() instanceof Integer) {
        // oldDim = (Integer) oldValue;
        // }
        // createCommand(getDomain(), (SNDimensional) getOwner(), (Integer)
        // getValue(), oldDim);
    }

    @Override
    public void doExecute() {
        oldValue = owner.eGet(getFeature());
        suggestLabelCommand = new SuggestLabelCommand(domain, (SNDimensional) getOwner());
        super.doExecute();
        createDependents(getDomain(), (SNDimensional) getOwner(), (Integer) getValue());
        command.appendAndExecute(suggestLabelCommand);
        suggestLabelCommand.execute();
    }
}
