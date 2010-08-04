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
 *   Metascape - Development and maintenance
 *
 * </copyright> $Id: MultiValueCommand.java,v 1.3 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.IValue;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
import org.metaabm.SState;
import org.metaabm.SStateValue;
import org.metaabm.act.AInput;
import org.metaabm.act.AMultiValue;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.function.FFunction;

/**
 * Manages common operations on multi-valued functions.
 * 
 * @author milesparker
 * 
 */
public class MultiValueCommand extends CompoundCommand {

    protected EditingDomain domain;
    protected ASink sink;
    protected FFunction function;

    public MultiValueCommand(EditingDomain domain, ASink sink, FFunction newFunction) {
        super();
        this.domain = domain;
        this.sink = sink;
        this.function = newFunction;
    }

    public void addAttributesCross(List<AInput> inputs, Collection<SState> states, Collection<SStateValue> optionsPath) {
        Iterator<SState> iterator = states.iterator();
        if (iterator.hasNext()) {
            SState currentState = iterator.next();
            Collection<SState> remainingStates = new LinkedList<SState>();
            while (iterator.hasNext()) {
                remainingStates.add(iterator.next());
            }
            for (SStateValue option : currentState.getOptions()) {
                Collection<SStateValue> nextOptions = new LinkedList<SStateValue>(optionsPath);
                nextOptions.add(option);
                addAttributesCross(inputs, remainingStates, nextOptions);
            }
        } else {
            addAttributes(inputs, optionsPath);
        }
    }

    public void addAttributesSingle(List<AInput> inputs, Collection<SState> states, Collection<SStateValue> optionsPath) {
        Iterator<AInput> inputIter = inputs.iterator();
        inputIter.next();
        while (inputIter.hasNext()) {
            AMultiValue value = (AMultiValue) inputIter.next().getValue();
            addAtrributeCommand(value, value.getLabel() + " Base");
        }
        for (SState state : states) {
            for (SStateValue stateValue : state.getOptions()) {
                addAttributes(inputs, Collections.singleton(stateValue));
            }
        }
    }

    protected void addAttributes(List<AInput> inputs, Collection<SStateValue> processedOptions) {
        Iterator<AInput> inputIter = inputs.iterator();
        inputIter.next();
        int index = 1;
        while (inputIter.hasNext()) {
            addAttribute((AMultiValue) inputIter.next().getValue(), processedOptions, index);
            index++;
        }
    }

    public void addAttribute(AMultiValue multiValue, Collection<SStateValue> processedOptions, int paramIndex) {
        String attrLabel = sink.getLabel();
        for (SStateValue stateValue : processedOptions) {
            attrLabel += " " + stateValue.getLabel();
        }
        attrLabel += " " + getInputLabel(paramIndex);
        addAtrributeCommand(multiValue, attrLabel);
    }

    private void addAtrributeCommand(AMultiValue multiValue, String attrLabel) {
        SAttribute multiAttr = MetaABMFactory.eINSTANCE.createSAttribute();
        append(AddCommand.create(domain, multiValue,
                                 MetaABMActPackage.Literals.AMULTI_VALUE__VALUES, multiAttr));
        append(AddCommand.create(domain, sink.getReference().getOwner(),
                                 MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, multiAttr));
        append(SetCommand.create(domain, multiAttr, MetaABMPackage.Literals.ITYPED__STYPE,
                                 SAttributeType.REAL_LITERAL));
        append(SetCommand.create(domain, multiAttr, MetaABMPackage.Literals.IID__LABEL, attrLabel));
    }

    protected EList<IValue> getMultiValues(AInput input) {
        return ((AMultiValue) input.getValue()).getValues();
    }

    protected void removeAttribute(IValue value) {
        if (value instanceof AMultiValue) {
            for (IValue multiValue : ((AMultiValue) value).getValues()) {
                removeAttribute(multiValue);
            }
        } else if (value instanceof SAttribute) {
            append(RemoveCommand.create(domain, sink.getReference().getOwner(),
                                        MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, value));
        }
    }

    protected void createMultiValue(AInput input, int index) {
        AMultiValue multiValue = MetaABMActFactory.eINSTANCE.createAMultiValue();
        append(SetCommand.create(domain, input, MetaABMActPackage.Literals.AINPUT__VALUE,
                                 multiValue));
        setValueName(multiValue, index);
        if (index > 0) {
            addAttribute(multiValue, Collections.<SStateValue> emptyList(), index);
        }
    }

    protected void clearMultiValues(IValue value) {
        if (value instanceof AMultiValue) {
            append(RemoveCommand.create(domain, value,
                                        MetaABMActPackage.Literals.AMULTI_VALUE__VALUES, ((AMultiValue) value)
                                        .getValues()));
        }
        removeAttribute(value);
    }

    protected void clearMultiFunction(List<AInput> inputs) {
        Iterator<AInput> inputIter = inputs.iterator();
        inputIter.next();
        while (inputIter.hasNext()) {
            clearMultiValues(inputIter.next().getValue());
        }
    }

    protected void createMultiFunction(List<AInput> inputs) {
        int index = 0;
        for (AInput input : inputs) {
            createMultiValue(input, index);
            index++;
        }
    }

    public void removeMultiFunction(List<AInput> inputs) {
        for (AInput input : inputs) {
            removeAttribute(input.getValue());
            append(SetCommand
                   .create(domain, input, MetaABMActPackage.Literals.AINPUT__VALUE, null));
        }
    }

    protected void setValueName(AMultiValue value, int index) {
        String name = sink.getLabel() + " " + getInputLabel(index);
        append(new SetLabelCommand(domain, value, MetaABMPackage.Literals.IID__LABEL, name, 0));
    }

    private String getInputLabel(int inputIndex) {
        return function.getInputPrototypes().get(inputIndex).getLabel();
    }
}