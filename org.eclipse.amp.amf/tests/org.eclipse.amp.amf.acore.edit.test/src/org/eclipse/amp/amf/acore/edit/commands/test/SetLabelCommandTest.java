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

import junit.framework.TestCase;

import org.metaabm.MetaABMFactory;
import org.metaabm.SContext;
import org.metaabm.SImplementation;
import org.metaabm.commands.TargetTranslator;

public class SetLabelCommandTest extends TestCase {

    public void testTransformationsSimple() {
        SContext model = MetaABMFactory.eINSTANCE.createSContext();
        SImplementation impl = MetaABMFactory.eINSTANCE.createSImplementation();
        model.setImplementation(impl);
        model.setLabel("Root Context");
        model.setID(TargetTranslator.LABEL_TO_ID_TRANSLATOR.translateName(model.getLabel(), null));
        model.setPluralLabel(TargetTranslator.LABEL_TO_PLURAL_NAME_TRANSLATOR.translateName(model.getLabel(), null));
        impl.setClassName(TargetTranslator.LABEL_TO_CLASSNAME_TRANSLATOR.translateName(model.getLabel(), null));
        assertEquals(model.getLabel(), "Root Context");
        assertEquals(model.getID(), "rootContext");
        assertEquals(model.getPluralLabel(), "Root Contexts");
        assertEquals(model.getImplementation().getClassName(), "RootContext");
    }

    public void testTransformationsSimpleTarget() {
        SContext model = MetaABMFactory.eINSTANCE.createSContext();
        SImplementation impl = MetaABMFactory.eINSTANCE.createSImplementation();
        model.setImplementation(impl);
        model.setLabel("Root Context");
        ((SContext) TargetTranslator.LABEL_TO_ID_TRANSLATOR.targetFor(model))
                        .setID(TargetTranslator.LABEL_TO_ID_TRANSLATOR.translateName(model.getLabel(), null));
        ((SContext) TargetTranslator.LABEL_TO_PLURAL_NAME_TRANSLATOR.targetFor(model))
                        .setPluralLabel(TargetTranslator.LABEL_TO_PLURAL_NAME_TRANSLATOR.translateName(
                                        model.getLabel(), null));
        ((SImplementation) TargetTranslator.LABEL_TO_CLASSNAME_TRANSLATOR.targetFor(model))
                        .setClassName(TargetTranslator.LABEL_TO_CLASSNAME_TRANSLATOR.translateName(model.getLabel(),
                                        null));
        assertEquals(model.getLabel(), "Root Context");
        assertEquals(model.getID(), "rootContext");
        assertEquals(model.getPluralLabel(), "Root Contexts");
        assertEquals(model.getImplementation().getClassName(), "RootContext");
    }
}
