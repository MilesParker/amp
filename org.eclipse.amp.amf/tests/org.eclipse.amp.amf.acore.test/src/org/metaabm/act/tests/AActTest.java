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

import java.util.List;

import org.metaabm.MetaABMFactory;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
import org.metaabm.SContext;
import org.metaabm.act.AAct;
import org.metaabm.act.AGroup;
import org.metaabm.act.ASelect;
import org.metaabm.act.ASet;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.tests.IIDTest;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>AAct</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are tested:
 *         <ul>
 *         <li>{@link org.metaabm.act.AAct#getReference() <em>Reference</em>}</li>
 *         <li>{@link org.metaabm.act.AAct#getAllSources() <em>All Sources</em>}
 *         </li>
 *         <li>{@link org.metaabm.act.AAct#getAllTargets() <em>All Targets</em>}
 *         </li>
 *         </ul>
 *         </p>
 * @generated
 */
public abstract class AActTest extends IIDTest {

    SContext context;

    /**
     * Constructs a new AAct test case with the given name. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AActTest(String name) {
        super(name);
    }

    /**
     * @generated NOT
     */
    protected void setUp() throws Exception {
        context = MetaABMFactory.eINSTANCE.createSContext();
        context.setRootActivity(MetaABMActFactory.eINSTANCE.createAGroup());
        ((AGroup) context.getRootActivity()).getMembers().add(getFixture());
        getFixture().setLabel("Label");
        super.setUp();
    }

    /**
     * Returns the fixture for this AAct test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected AAct getFixture() {
        return (AAct) fixture;
    }

    /**
     * Tests the '{@link org.metaabm.act.AAct#getReference() <em>Reference</em>}
     * ' feature getter. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metaabm.act.AAct#getReference()
     * @generated NOT
     */
    public void testGetReference() {
        assertEquals(getFixture().getReference(), context);
    }

    /**
     * Tests the '{@link org.metaabm.act.AAct#getAllSources()
     * <em>All Sources</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.act.AAct#getAllSources()
     * @generated NOT
     */
    public void testGetAllSources() {
        ASet act0 = MetaABMActFactory.eINSTANCE.createASet();
        ASet act1_0 = MetaABMActFactory.eINSTANCE.createASet();
        act1_0.getTargets().add(act0);
        ASet act1_1 = MetaABMActFactory.eINSTANCE.createASet();
        act1_1.getTargets().add(act0);
        List<AAct> list0 = act1_1.getAllTargets();
        assertTrue(list0.contains(act0));
        assertFalse(list0.contains(act1_1));
        assertEquals(list0.size(), 1);
        ASet act2_1 = MetaABMActFactory.eINSTANCE.createASet();
        act2_1.getTargets().add(act1_1);
        List<AAct> list1 = act2_1.getAllTargets();
        assertTrue(list1.contains(act0));
        assertTrue(list1.contains(act1_1));
        assertFalse(list1.contains(act1_0));
        assertFalse(list1.contains(act2_1));
        assertEquals(list1.size(), 2);
    }

    /**
     * Tests the '{@link org.metaabm.act.AAct#getAllTargets()
     * <em>All Targets</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.act.AAct#getAllTargets()
     * @generated NOT
     */
    public void testGetAllTargets() {
        ASet act0 = MetaABMActFactory.eINSTANCE.createASet();
        ASet act1_0 = MetaABMActFactory.eINSTANCE.createASet();
        act1_0.getSources().add(act0);
        ASet act1_1 = MetaABMActFactory.eINSTANCE.createASet();
        act1_1.getSources().add(act0);
        List<AAct> list0 = act1_1.getAllSources();
        assertTrue(list0.contains(act0));
        assertFalse(list0.contains(act1_1));
        assertEquals(list0.size(), 1);
        ASet act2_1 = MetaABMActFactory.eINSTANCE.createASet();
        act2_1.getSources().add(act1_1);
        List<AAct> list1 = act2_1.getAllSources();
        assertTrue(list1.contains(act0));
        assertTrue(list1.contains(act1_1));
        assertFalse(list1.contains(act1_0));
        assertFalse(list1.contains(act2_1));
        assertEquals(list1.size(), 2);
    }

    public void testReachable() {
        SAgent agent = MetaABMFactory.eINSTANCE.createSAgent();
        SAttribute testAttr = MetaABMFactory.eINSTANCE.createSAttribute();
        agent.getAttributes().add(testAttr);
        AGroup rootAct = MetaABMActFactory.eINSTANCE.createAGroup();
        agent.setRootActivity(rootAct);

        AAct eval = MetaABMActFactory.eINSTANCE.createAEvaluate();
        ASelect select = MetaABMActFactory.eINSTANCE.createASelect();
        select.setAgent(agent);
        eval.setSelected(select);
        testAttr.setSType(SAttributeType.REAL_LITERAL);
        select.getTargets().add(eval);

        assertTrue(eval.isTargetOf(select));
        assertFalse(select.isTargetOf(eval));

        assertTrue(agent.isReachable(testAttr));
        assertTrue(select.isReachable(testAttr));
        assertTrue(eval.isReachable(testAttr));
    }
} // AActTest
