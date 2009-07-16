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

import org.metaabm.IID;
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;
import org.metaabm.SNamed;
import org.metaabm.commands.TargetTranslator;

public class SetLabelPropogationCondition extends PrePostCondition {

    IID id;

    String labelString;

    public SetLabelPropogationCondition(String labelString) {
        super();
        this.labelString = labelString;
    }

    public void postCondition() {
        super.postCondition();
        // This is not a good general test is we are using code assumptions to
        // check code..use actual names in most cases!
        // Use to ensure that propogation is occuring correctly
        if (!t.isUndo()) {
            CommandTest.assertEqualNull(id.getID(), TargetTranslator.LABEL_TO_ID_TRANSLATOR.translateName(
                            id.getLabel(), id));
            if (id instanceof SImplemented) {
                SImplemented i = (SImplemented) id;
                SImplementation impl = i.getImplementation();
                if (impl != null) {
                    CommandTest.assertEquals(impl.getClassName(), TargetTranslator.LABEL_TO_CLASSNAME_TRANSLATOR
                                    .translateName(id.getLabel(), id));
                    // CommandTesCommandTest.assertEquals(impl.getID(),
                    //SetLabelCommand.LABEL_TO_IMPL_ID_TRANSLATOR.translateName(
                    // labelString));
                    // CommandTesCommandTest.assertEquals(impl.getLabel(),
                    // SetLabelCommand
                    // .LABEL_TO_IMPL_LABEL_TRANSLATOR.translateName(id
                    // .getLabel()));
                    // if (impl instanceof SNamed) {
                    // SNamed i2 = (SNamed) impl;
                    // CommandTesCommandTest.assertEquals(i2.getPluralLabel(),
                    // SetLabelCommand.LABEL_TO_PLURAL_NAME_TRANSLATOR
                    // .translateName(impl.getLabel()));
                    // }
                }
            }
            if (id instanceof SNamed) {
                SNamed i = (SNamed) id;
                CommandTest.assertEqualNull(i.getPluralLabel(), TargetTranslator.LABEL_TO_PLURAL_NAME_TRANSLATOR
                                .translateName(id.getLabel(), id));
            }
        }
    }
}