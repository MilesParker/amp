/*
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */

package org.metaabm.commands;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.act.AInput;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.function.FFunction;
import org.metaabm.function.FGeneric;
import org.metaabm.function.FOperator;

/**
 * Maintain correct number of inputs for the sink and add distributions as
 * neccessary.
 * 
 * @author milesparker
 */
public class SetSinkFunctionCommand extends MultiValueCommand {

    private FFunction oldFunction;

    public SetSinkFunctionCommand(EditingDomain domain, ASink sink, FFunction newFunction) {
        super(domain, sink, newFunction);
        oldFunction = sink.getFunction();
    }

    @Override
    protected boolean prepare() {
        // (0 is case where relacing function is null, e.g. no inputs
        int newCount = 0;
        if (function instanceof FGeneric) {
            newCount = ((FGeneric) function).getInputPrototypes().size();
        } else if (function instanceof FOperator) {
            newCount = ((FOperator) function).getArity();
        }
        // Create Inputs
        int oldCount = sink.getInputs().size();
        List<AInput> commonInputs = null;
        List<AInput> orphanedInputs = Collections.<AInput> emptyList();
        if (newCount < oldCount) {
            orphanedInputs = sink.getInputs().subList(newCount, oldCount);
            append(RemoveCommand.create(domain, sink, MetaABMActPackage.Literals.ASINK__INPUTS,
                                        orphanedInputs));
            commonInputs = sink.getInputs().subList(0, newCount);
        } else if (newCount > oldCount) {
            commonInputs = new ArrayList<AInput>();
            commonInputs.addAll(sink.getInputs());
            List<AInput> newInputs = new ArrayList<AInput>();
            for (int i = 0; i < newCount - oldCount; i++) {
                AInput newInput = MetaABMActFactory.eINSTANCE.createAInput();
                newInputs.add(newInput);
                commonInputs.add(newInput);
            }
            append(AddCommand.create(domain, sink, MetaABMActPackage.Literals.ASINK__INPUTS,
                                     newInputs, oldCount));
        } else {
            commonInputs = sink.getInputs();
        }
        // int index = 0;
        // for (AInput common : commonInputs) {
        // if (common.getValue() != null) {
        // if (!function.accepts(common.getValue(), index++)) {
        // append(SetCommand.create(domain, common,
        // (EStructuralFeature) MetaABMActPackage.Literals.AINPUT__VALUE,
        // null));
        // } else {
        // append(SetCommand.create(domain, common,
        // (EStructuralFeature) MetaABMActPackage.Literals.AINPUT__VALUE,
        // common.getValue()));
        // }
        // }
        // }
        // Manage distributions
        if (function != null && function.isMultiValue()) {
            createMultiFunction(commonInputs);
            if (oldFunction != null && oldFunction.isMultiValue()) {
                removeMultiFunction(orphanedInputs);
            }
        } else if (oldFunction != null && oldFunction.isMultiValue()) {
            removeMultiFunction(sink.getInputs());
        }
        return super.prepare();
    }

}
