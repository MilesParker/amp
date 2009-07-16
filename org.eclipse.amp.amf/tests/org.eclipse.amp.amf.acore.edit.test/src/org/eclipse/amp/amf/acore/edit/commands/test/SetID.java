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

public class SetID extends SetTransformer {

    String newID;
    String oldID;

    public SetID(String oldID, String newID) {
        super(MetaABMPackage.Literals.IID__ID, newID);
        this.oldID = oldID;
        this.newID = newID;
    }

    public void preCondition() {
        CommandTest.assertEquals(getIID().getID(), oldID);
    }

    public void postCondition() {
        CommandTest.assertEquals(getIID().getID(), newID);
    }
}