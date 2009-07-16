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

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>SAgent</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are tested:
 *         <ul>
 *         <li>{@link org.metaabm.SImplemented#getParent() <em>Parent</em>}</li>
 *         </ul>
 *         </p>
 * @generated
 */
public class SAgentTest extends SActableTest {
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SAgentTest.class);
    }

    /**
     * Constructs a new SAgent test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SAgentTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this SAgent test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected SAgent getFixture() {
        return (SAgent) fixture;
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
            setFixture(MetaABMFactory.eINSTANCE.createSAgent());
        }
        super.setUp();
        if (getFixture() != null) {
            context.getAgents().add(getFixture());
        }
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
     * Tests the '{@link org.metaabm.SImplemented#getParent() <em>Parent</em>}'
     * feature getter. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metaabm.SImplemented#getParent()
     * @generated NOT
     */
    public void testGetParent() {
        assertEquals(getFixture().getParent(), context);
    }

    private SAttribute addAttr(String name) {
        SAttribute attr = MetaABMFactory.eINSTANCE.createSAttribute();
        attr.setID(name);
        getFixture().getAttributes().add(attr);
        return attr;
    }

    public void testFindAttribute() {
        addAttr("myTestField");
        SAttribute target = addAttr("anotherTestField");
        addAttr("yetAnotherTestField");
        SAttribute res = getFixture().findAttribute("wha?");
        assertEquals(res, null);
        res = getFixture().findAttribute("anotherTestField");
        assertEquals(res, target);
    }

    // This needs to be done in edit..
    // public void testAccessors() {
    // addAttr("inputVar");
    // ASink sink = MetaABMActFactory.eINSTANCE.createAQuery();
    // AInputClient input = MetaABMActFactory.eINSTANCE.createAInputClient();
    // SAttribute inputVar = getFixture().findAttribute("inputVar");
    // input.setAttribute(inputVar);
    // sink.getInputs().add(input);
    // sink.getInputClients().add(input);
    // getFixture().getAttributes().remove(inputVar);
    // assertEquals(sink.getInputs().size(), 0);
    // assertEquals(sink.getInputClients().size(), 0);
    // }

} // SAgentTest
