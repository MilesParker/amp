/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */
package org.metaabm.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import junit.textui.TestRunner;

import org.metaabm.MetaABMFactory;
import org.metaabm.SAgent;
import org.metaabm.SContext;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>SContext</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 * @generated
 */
public class SContextTest extends SAgentTest {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SContextTest.class);
    }

    /**
     * Constructs a new SContext test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SContextTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this SContext test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected SContext getFixture() {
        return (SContext) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMFactory.eINSTANCE.createSContext());
        super.setUp();
    }

    public void testGetContext() {

        SContext ctxA1 = MetaABMFactory.eINSTANCE.createSContext();
        ctxA1.setLabel("ctxA1");
        SContext ctxB1 = MetaABMFactory.eINSTANCE.createSContext();
        ctxB1.setLabel("ctxB1");
        SContext ctxB2 = MetaABMFactory.eINSTANCE.createSContext();
        ctxB2.setLabel("ctxB2");
        SContext ctxC1 = MetaABMFactory.eINSTANCE.createSContext();
        ctxC1.setLabel("ctxC1");
        SAgent agtB1 = MetaABMFactory.eINSTANCE.createSAgent();
        agtB1.setLabel("agtB1");
        SAgent agtB2 = MetaABMFactory.eINSTANCE.createSAgent();
        agtB2.setLabel("agtB2");
        SAgent agtC1 = MetaABMFactory.eINSTANCE.createSAgent();
        agtC1.setLabel("agtC1");
        SAgent agtC2 = MetaABMFactory.eINSTANCE.createSAgent();
        agtC2.setLabel("agtC2");

        ctxA1.getAgents().add(ctxB1);
        ctxA1.getAgents().add(ctxB2);
        ctxA1.getAgents().add(agtB1);
        ctxA1.getAgents().add(agtB2);
        ctxB1.getAgents().add(ctxC1);
        ctxB1.getAgents().add(agtC1);
        ctxB1.getAgents().add(agtC2);

        helpContains(ctxA1.getAgents(), agtB2, ctxB1, ctxB2, agtB1);
        helpContains(ctxB1.getAgents(), agtC1, agtC2, ctxC1);

        helpContains(ctxA1.getSubContexts(), ctxB1, ctxB2);
        helpContains(ctxB1.getSubContexts(), ctxC1);

        helpContains(ctxA1.getAllAgents(), ctxA1, agtB1, agtB2, ctxB1, ctxB2, ctxC1, agtC1, agtC2);

        helpContains(ctxA1.getAllSubAgents(), agtB1, agtB2, ctxB1, ctxB2, ctxC1, agtC1, agtC2);

        helpContains(ctxA1.getAllContexts(), ctxA1, ctxB1, ctxB2, ctxC1);

        helpContains(ctxA1.getAllContexts(), ctxA1, ctxB1, ctxB2, ctxC1);
    }

    /**
     * @param ctxA1
     * @param ctxB1
     * @param ctxB2
     * @param agtB1
     */
    @SuppressWarnings("unchecked")
    private void helpContains(Collection parent, SAgent... agents) {
        List expAgents = new ArrayList(Arrays.asList(agents));
        for (Object a : parent) {
            assertTrue("Shouldn't Exclude: " + a + "   in:" + parent, expAgents.remove(a));
        }
        assertTrue("Shouldn't Include: " + expAgents, expAgents.isEmpty());
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#tearDown()
     * @generated
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }
} // SContextTest
