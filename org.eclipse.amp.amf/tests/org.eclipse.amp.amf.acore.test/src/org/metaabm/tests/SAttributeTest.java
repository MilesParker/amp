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

import junit.textui.TestRunner;

import org.metaabm.MetaABMFactory;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.act.AGroup;
import org.metaabm.act.AInput;
import org.metaabm.act.AQuery;
import org.metaabm.act.ARule;
import org.metaabm.act.ASet;
import org.metaabm.act.MetaABMActFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>SAttribute</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are tested:
 *         <ul>
 *         <li>{@link org.metaabm.IValue#getAvailableTypes() <em>Available Types
 *         </em>}</li>
 *         </ul>
 *         </p>
 * @generated
 */
public class SAttributeTest extends SNamedTest {
    private ASet setAct;
    private ARule ruleAct;
    private AGroup rootAct;
    private AQuery queryAct;

    private ASet setSubAct;
    private ARule ruleSubAct;
    private AGroup rootSubAct;
    private AQuery querySubAct;
    private SAgent agent;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SAttributeTest.class);
    }

    /**
     * Constructs a new SAttribute test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SAttributeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this SAttribute test case. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected SAttribute getFixture() {
        return (SAttribute) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        if (getFixture() == null) {
            SAttribute attr = MetaABMFactory.eINSTANCE.createSAttribute();
            attr.setID("Test Attribute");
            setFixture(attr);
        }
        if (context == null) {
            context = MetaABMFactory.eINSTANCE.createSContext();
            agent = MetaABMFactory.eINSTANCE.createSAgent();
            context.getAgents().add(agent);

            context.getAttributes().add(getFixture());
            rootAct = MetaABMActFactory.eINSTANCE.createAGroup();
            context.setRootActivity(rootAct);
            ruleAct = MetaABMActFactory.eINSTANCE.createARule();
            rootAct.getMembers().add(ruleAct);
            rootAct.getTargets().add(ruleAct);
            setAct = MetaABMActFactory.eINSTANCE.createASet();
            rootAct.getMembers().add(setAct);
            ruleAct.getTargets().add(setAct);
            queryAct = MetaABMActFactory.eINSTANCE.createAQuery();
            rootAct.getMembers().add(queryAct);
            setAct.getTargets().add(queryAct);

            rootSubAct = MetaABMActFactory.eINSTANCE.createAGroup();
            agent.setRootActivity(rootSubAct);
            ruleSubAct = MetaABMActFactory.eINSTANCE.createARule();
            rootSubAct.getMembers().add(ruleSubAct);
            rootSubAct.getTargets().add(ruleSubAct);
            setSubAct = MetaABMActFactory.eINSTANCE.createASet();
            rootSubAct.getMembers().add(setSubAct);
            ruleSubAct.getTargets().add(setSubAct);
            querySubAct = MetaABMActFactory.eINSTANCE.createAQuery();
            rootSubAct.getMembers().add(querySubAct);
            setSubAct.getTargets().add(querySubAct);
        }
        super.setUp();
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

    /**
     * Tests the '{@link org.metaabm.IValue#getAvailableTypes()
     * <em>Available Types</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.IValue#getAvailableTypes()
     * @generated NOT
     */
    public void testGetAvailableTypes() {
        // TODO: implement this feature getter test method
        // Ensure that you remove @generated or mark it @generated NOT
    }

    /**
     * @generated NOT
     */
    public void testGetAccessors() {
        assertEquals(getFixture().getAccessors().size(), 0);
        setAct.setAttribute(getFixture());
        assertEquals(getFixture().getAccessors().size(), 1);
        AInput createAInput = MetaABMActFactory.eINSTANCE.createAInput();
        queryAct.getInputs().add(createAInput);
        createAInput.setValue(getFixture());
        assertEquals(getFixture().getAccessors().size(), 2);
    }

    /**
     * @generated NOT
     */
    public void testGetSubAccessors() {
        assertEquals(getFixture().getAccessors().size(), 0);
        setSubAct.setAttribute(getFixture());
        assertEquals(getFixture().getAccessors().size(), 1);
        AInput createAInput = MetaABMActFactory.eINSTANCE.createAInput();
        querySubAct.getInputs().add(createAInput);
        createAInput.setValue(getFixture());
        assertEquals(getFixture().getAccessors().size(), 2);
    }
} // SAttributeTest
