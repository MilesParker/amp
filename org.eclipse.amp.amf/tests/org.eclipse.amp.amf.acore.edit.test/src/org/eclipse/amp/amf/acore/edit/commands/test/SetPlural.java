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

import org.metaabm.MetaABMPackage;
import org.metaabm.SNamed;

public class SetPlural extends SetTransformer {

    String newLabel;
    String oldLabel;

    public SetPlural(String oldLabel, String newLabel) {
        super(MetaABMPackage.Literals.SNAMED__PLURAL_LABEL, newLabel);
        this.oldLabel = oldLabel;
        this.newLabel = newLabel;
    }

    public void preCondition() {
        CommandTest.assertEquals(((SNamed) getIID()).getPluralLabel(), oldLabel);
    }

    public void postCondition() {
        CommandTest.assertEquals(((SNamed) getIID()).getPluralLabel(), newLabel);
    }
}