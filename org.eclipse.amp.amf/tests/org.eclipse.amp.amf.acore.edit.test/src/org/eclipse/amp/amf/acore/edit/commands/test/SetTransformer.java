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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.metaabm.IID;
import org.metaabm.SNamed;

public class SetTransformer extends CommandTransformer {

    EStructuralFeature feature;
    Object value;

    public SetTransformer(EStructuralFeature feature, Object value) {
        this.feature = feature;
        this.value = value;
    }

    public IID getIID() {
        return model;
    }

    public SNamed getSNamed() {
        return (SNamed) getIID();
    }

    public Command getCommand() {
        return SetCommand.create(getDomain(), getIID(), feature, value, CommandParameter.NO_INDEX);
    }
}