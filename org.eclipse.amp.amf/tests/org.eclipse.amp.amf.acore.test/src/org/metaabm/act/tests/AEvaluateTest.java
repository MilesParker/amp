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
package org.metaabm.act.tests;

import junit.textui.TestRunner;

import org.metaabm.MetaABMFactory;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
import org.metaabm.act.AEvaluate;
import org.metaabm.act.AGroup;
import org.metaabm.act.ASelect;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.function.FArgumentPrototype;
import org.metaabm.function.FGenericFunction;
import org.metaabm.function.FLogicalOperator;
import org.metaabm.function.FOperator;
import org.metaabm.function.MetaABMFunctionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>AEvaluate</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 * @generated
 */
public class AEvaluateTest extends ASinkTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AEvaluateTest.class);
    }

    /**
     * Constructs a new AEvaluate test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AEvaluateTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this AEvaluate test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected AEvaluate getFixture() {
        return (AEvaluate) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMActFactory.eINSTANCE.createAEvaluate());
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

    public void testAccepts() {
        FArgumentPrototype argB0 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        FArgumentPrototype argN1 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        FArgumentPrototype argF2 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        argB0.setSType(SAttributeType.BOOLEAN_LITERAL);
        argN1.setSType(SAttributeType.NUMERIC_LITERAL);
        argF2.setSType(SAttributeType.REAL_LITERAL);

        FGenericFunction generic = MetaABMFunctionFactory.eINSTANCE.createFGenericFunction();
        generic.getInputPrototypes().add(argB0);
        generic.getInputPrototypes().add(argN1);
        generic.getInputPrototypes().add(argF2);

        getFixture().setFunction(generic);

        SAgent agent = MetaABMFactory.eINSTANCE.createSAgent();
        SAttribute testAttr = MetaABMFactory.eINSTANCE.createSAttribute();
        agent.getAttributes().add(testAttr);
        AGroup rootAct = MetaABMActFactory.eINSTANCE.createAGroup();
        agent.setRootActivity(rootAct);

        ASelect select = MetaABMActFactory.eINSTANCE.createASelect();
        select.setAgent(agent);
        getFixture().setSelected(select);
        testAttr.setSType(SAttributeType.REAL_LITERAL);
        select.getTargets().add(getFixture());
        assertTrue(getFixture().isTargetOf(select));
        assertFalse(select.isTargetOf(getFixture()));

        rootAct.getMembers().add(getFixture());
        getFixture().getInputs().add(MetaABMActFactory.eINSTANCE.createAInput());
        getFixture().getInputs().add(MetaABMActFactory.eINSTANCE.createAInput());
        getFixture().getInputs().add(MetaABMActFactory.eINSTANCE.createAInput());

        assertTrue(agent.isReachable(testAttr));
        assertEquals(getFixture().getSelected().getAgent(), agent);
        assertTrue(getFixture().getInputs().get(0).isReachable(testAttr));

        assertFalse(getFixture().getInputs().get(0).isPotentialValue(testAttr));
        assertTrue(getFixture().getInputs().get(1).isPotentialValue(testAttr));
        assertTrue(getFixture().getInputs().get(2).isPotentialValue(testAttr));

        testAttr.setSType(SAttributeType.BOOLEAN_LITERAL);
        assertTrue(getFixture().getInputs().get(0).isPotentialValue(testAttr));
        assertFalse(getFixture().getInputs().get(1).isPotentialValue(testAttr));
        assertFalse(getFixture().getInputs().get(2).isPotentialValue(testAttr));

        FOperator oper = MetaABMFunctionFactory.eINSTANCE.createFOperator();
        getFixture().setFunction(oper);
        oper.getInputPrototypes().add(argN1);
        FArgumentPrototype argN2 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        oper.getInputPrototypes().add(argN2);
        argN2.setSType(SAttributeType.NUMERIC_LITERAL);
        assertEquals(oper.getArity(), 2);
        testAttr.setSType(SAttributeType.REAL_LITERAL);
        assertTrue(getFixture().getInputs().get(0).isPotentialValue(testAttr));
        assertTrue(getFixture().getInputs().get(1).isPotentialValue(testAttr));
        testAttr.setSType(SAttributeType.INTEGER_LITERAL);
        assertTrue(getFixture().getInputs().get(0).isPotentialValue(testAttr));
        assertTrue(getFixture().getInputs().get(1).isPotentialValue(testAttr));
        testAttr.setSType(SAttributeType.INTEGER_LITERAL);
        assertTrue(getFixture().getInputs().get(0).isPotentialValue(testAttr));
        assertTrue(getFixture().getInputs().get(1).isPotentialValue(testAttr));
        testAttr.setSType(SAttributeType.BOOLEAN_LITERAL);
        assertFalse(getFixture().getInputs().get(0).isPotentialValue(testAttr));
        assertFalse(getFixture().getInputs().get(1).isPotentialValue(testAttr));

        FLogicalOperator log = MetaABMFunctionFactory.eINSTANCE.createFLogicalOperator();
        getFixture().setFunction(log);
        log.getInputPrototypes().add(argB0);
        FArgumentPrototype argB1 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        argB1.setSType(SAttributeType.BOOLEAN_LITERAL);
        log.getInputPrototypes().add(argB1);
        assertEquals(log.getArity(), 2);
        testAttr.setSType(SAttributeType.REAL_LITERAL);
        assertFalse(getFixture().getInputs().get(0).isPotentialValue(testAttr));
        assertFalse(getFixture().getInputs().get(1).isPotentialValue(testAttr));
        testAttr.setSType(SAttributeType.BOOLEAN_LITERAL);
        assertTrue(getFixture().getInputs().get(0).isPotentialValue(testAttr));
        assertTrue(getFixture().getInputs().get(1).isPotentialValue(testAttr));
    }

} // AEvaluateTest
