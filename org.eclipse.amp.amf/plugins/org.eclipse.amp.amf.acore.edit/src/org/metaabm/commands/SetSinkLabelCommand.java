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
 *   Metascape - Development and maintenance
 *
 * </copyright>
 */

package org.metaabm.commands;
import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.IValue;
import org.metaabm.MetaABMPackage;
import org.metaabm.act.AInput;
import org.metaabm.act.AMultiValue;
import org.metaabm.act.ASink;

/**
 * Maintain correct number of inputs for the sink and add distributions as Necessary.
 * 
 * @author milesparker
 */
public class SetSinkLabelCommand extends MultiValueCommand {

    String newSinkName;

    public SetSinkLabelCommand(EditingDomain domain, ASink sink, String newName) {
        super(domain, sink, sink.getFunction());
        this.newSinkName = newName;
        if (function != null && function.isMultiValue()) {
            int index = 0;
            for (AInput input : sink.getInputs()) {
                // don't replace input 0 which specifieds which states to use
                if (index > 0) {
                    replaceMultiValuesName(input, index);
                }
                index++;
            }
        }
    }

    protected void replaceMultiValuesName(AInput input, int index) {
        if (input.getValue() instanceof AMultiValue) {
            AMultiValue multiValue = (AMultiValue) input.getValue();
            String newValueName = StringUtils.replace(multiValue.getLabel(), sink.getLabel(), newSinkName);
            append(new SetLabelCommand(domain, multiValue, MetaABMPackage.Literals.IID__LABEL,
                                       newValueName, 0));
            for (IValue option : multiValue.getValues()) {
                String newOptionName = StringUtils.replace(option.getLabel(), sink.getLabel(), newSinkName);
                append(new SetLabelCommand(domain, option, MetaABMPackage.Literals.IID__LABEL,
                                           newOptionName, 0));
            }
        }
    }
}
