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
 * </copyright> $Id: AddMultiValueStateCommand.java,v 1.3 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.SState;
import org.metaabm.act.AInput;
import org.metaabm.act.AMultiValue;
import org.metaabm.act.ASink;

/**
 * Creates attributes to match new multi-value function.
 * 
 * @author milesparker
 * 
 */
public class AddMultiValueStateCommand extends MultiValueCommand implements Command {

    @SuppressWarnings("unchecked")
    public AddMultiValueStateCommand(EditingDomain domain, ASink sink, List<AInput> inputs, Collection<?> collection,
            int index) {
        super(domain, sink, sink.getFunction());
        if (sink.isMultiValue()) {
            clearMultiFunction(inputs);
            Collection<SState> commonStates = new ArrayList(((AMultiValue) inputs.get(0).getValue()).getValues());
            for (Object added : collection) {
                if (added instanceof SState) {
                    commonStates.add((SState) added);
                }
            }
            if (sink.getFunction().getID().contains("cross")) {
                addAttributesCross(inputs, commonStates, new ArrayList());
            } else {
                addAttributesSingle(inputs, commonStates, new ArrayList());
            }
        }
    }
}
