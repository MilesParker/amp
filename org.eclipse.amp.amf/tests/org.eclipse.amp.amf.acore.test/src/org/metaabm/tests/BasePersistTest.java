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
package org.metaabm.tests;

import java.io.IOException;

import junit.framework.TestCase;
import junit.framework.TestResult;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.metaabm.MetaABMFactory;
import org.metaabm.SContext;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.xsd.MetaABMPersist;

public abstract class BasePersistTest extends TestCase {

    protected static MetaABMFactory f = MetaABMFactory.eINSTANCE;

    protected static MetaABMActFactory fa = MetaABMActFactory.eINSTANCE;

    protected SContext referenceContext;

    protected Command referenceCommand;

    protected SContext testContext;

    protected Command testCommand;

    protected SContext persistContext;

    protected String persistName;

    protected MetaABMPersist referencePersist;

    protected MetaABMPersist doPersist;

    protected MetaABMPersist undoPersist;

    protected MetaABMPersist redoPersist;

    protected MetaABMPersist testPersist;

    protected String path = "test/results/";

    public BasePersistTest(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        referenceContext = f.createSContext();
        testContext = f.createSContext();
        persistName = path + getName() + "Test.metaabm";
        referencePersist = MetaABMPersist.create(referenceContext, persistName);
        referencePersist.save();
        doPersist = MetaABMPersist.create(testContext, path + getName() + "TestDo.metaabm");
        testPersist = MetaABMPersist.create(testContext, path + getName() + "TestComp.metaabm");
        undoPersist = MetaABMPersist.create(testContext, path + getName() + "TestUndo.metaabm");
        redoPersist = MetaABMPersist.create(testContext, path + getName() + "TestRedo.metaabm");
        // testPersist.save();
    }

    protected void execTransform(Transformer transformer) {
        execTransform(transformer, 0);
    }

    protected void execTransform(Transformer transformer, int commandIndex) {
        try {
            // confirm equivalance
            assertTrue(EcoreUtil.equals(testContext, referenceContext));
            // apply transform to reference context
            transformer.prepare(referenceContext);
            try {
                transformer.exec();
            } catch (UnsupportedOperationException e) {
                throw new RuntimeException("Unexecutable Command: " + transformer, e);
            }
            referencePersist.save();
            // confirm ecore equivalence shows a real difference
            if (transformer.modifies()) {
                assertFalse("No change resulting from command " + commandIndex, EcoreUtil.equals(testContext,
                                                                                                 referenceContext));
            }
            // apply transform to test context
            transformer.prepare(testContext);
            transformer.exec();

            assertNotSame(referencePersist, testPersist);
            assertNotSame(referenceContext, testContext);
            referencePersist.save();
            testPersist.save();
            doPersist.save();

            assertTrue("Model cannot be saved properly.", EcoreUtil.equals(testContext, referenceContext));
            // save and load context
            checkPersist();
            // confirm that persistence works and that it preserves equivalent
            // state
            boolean equals = EcoreUtil.equals(referenceContext, persistContext);
            if (!equals) {
                System.out.println(new StringBuffer(" : " + referenceContext).insert(0,
                "[BasePersistTest.checkTransform] referenceContext.eAllContents())"));
                System.out.println(new StringBuffer(" : " + persistContext).insert(0,
                "[BasePersistTest.checkTransform] referenceContext.eAllContents())"));
            }
            assertTrue("Persistence failure", equals);
        } catch (IOException e) {
            throw new RuntimeException("Exception while executing " + commandIndex + ": " + transformer, e);
        }
    }

    protected void undoTransform(Transformer transformer, int commandIndex) {
        try {
            // confirm equivalance
            assertTrue(EcoreUtil.equals(testContext, referenceContext));
            // apply transform to reference context
            transformer.prepare(referenceContext);
            transformer.undo();
            referencePersist.save();
            // confirm ecore equivalence shows a real difference
            if (transformer.modifies()) {
                assertFalse(EcoreUtil.equals(testContext, referenceContext));
            }
            // apply transform to test context
            transformer.prepare(testContext);
            transformer.undo();

            referencePersist.save();
            testPersist.save();
            undoPersist.save();

            assertTrue(EcoreUtil.equals(testContext, referenceContext));
            // save and load context
            checkPersist();
            // confirm that persitence works and that it preserves equivalent
            // state
            boolean equals = EcoreUtil.equals(referenceContext, persistContext);
            if (!equals) {
                System.out.println("***not equal***");

                System.out.println("Reference: " + referenceContext);
                System.out.println("Persist:" + persistContext);
            }

            assertTrue(equals);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Exception while undoing " + commandIndex + ": " + transformer + "\r\n" + e);
        }
    }

    protected void redoTransform(Transformer transformer, int commandIndex) {
        try {
            // confirm equivalance
            assertTrue(EcoreUtil.equals(testContext, referenceContext));
            // apply transform to reference context
            transformer.prepare(referenceContext);
            transformer.redo();
            referencePersist.save();
            // confirm ecore equivalence shows a real difference
            if (transformer.modifies()) {
                assertFalse(EcoreUtil.equals(testContext, referenceContext));
            }
            // apply transform to test context
            transformer.prepare(testContext);
            transformer.redo();

            referencePersist.save();
            testPersist.save();
            redoPersist.save();

            assertTrue(EcoreUtil.equals(testContext, referenceContext));
            // save and load context
            checkPersist();
            // confirm that persitence works and that it preserves equivalent
            // state
            boolean equals = EcoreUtil.equals(referenceContext, persistContext);
            if (!equals) {
                System.out.println(new StringBuffer(" : " + referenceContext).insert(0,
                "[BasePersistTest.checkTransform] referenceContext.eAllContents())"));
                System.out.println(new StringBuffer(" : " + persistContext).insert(0,
                "[BasePersistTest.checkTransform] referenceContext.eAllContents())"));
            }
            assertTrue(equals);
        } catch (Exception e) {
            fail("Exception while redoing " + commandIndex + ": " + transformer + "\r\n" + e);
        }
    }

    protected void checkPersist() throws IOException {
        referencePersist = MetaABMPersist.create(referenceContext, persistName);
        referencePersist.save();
        referencePersist.setResource(null);
        persistContext = referencePersist.load();
        // make sure that we aren't simply referring to same context
        assertTrue(persistContext != referenceContext);
        referencePersist.save();

    }

    protected void tearDown() throws Exception {
        TestResult res = createResult();
        // iff no errors or failures occurred, delete file, otherwise keep it
        // for inspection
        if (res.failureCount() + res.errorCount() == 0) {
            // The file should exist in all cases, otherwise we want an error or
            // failure..
            // assertTrue(persistFile.delete());
        }
    }

}