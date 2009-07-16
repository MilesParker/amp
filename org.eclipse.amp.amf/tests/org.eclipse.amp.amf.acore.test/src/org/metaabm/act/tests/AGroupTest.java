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

import org.metaabm.act.AAct;
import org.metaabm.act.AGroup;
import org.metaabm.act.MetaABMActFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>AGroup</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are tested:
 *         <ul>
 *         <li>{@link org.metaabm.act.AGroup#getRoots() <em>Roots</em>}</li>
 *         </ul>
 *         </p>
 * @generated
 */
public class AGroupTest extends AActTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(AGroupTest.class);
    }

    /**
     * Constructs a new AGroup test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public AGroupTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this AGroup test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected AGroup getFixture() {
        return (AGroup) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMActFactory.eINSTANCE.createAGroup());
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
     * Tests the '{@link org.metaabm.act.AGroup#getRoots() <em>Roots</em>}'
     * feature getter. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metaabm.act.AGroup#getRoots()
     * @generated NOT
     */
    public void testGetRoots() {
        AAct a0 = MetaABMActFactory.eINSTANCE.createASchedule();
        AAct a1 = MetaABMActFactory.eINSTANCE.createAAny();
        AAct a2 = MetaABMActFactory.eINSTANCE.createABuild();
        AAct a3 = MetaABMActFactory.eINSTANCE.createAAll();
        AAct a4 = MetaABMActFactory.eINSTANCE.createAWatch();
        getFixture().getMembers().add(a0);
        getFixture().getMembers().add(a1);
        getFixture().getMembers().add(a2);
        getFixture().getMembers().add(a3);
        getFixture().getMembers().add(a4);

        assertEquals(getFixture().getMembers().size(), 5);
        assertEquals(getFixture().getRoots().size(), 3);

        a1.getSources().add(a0);
        a2.getTargets().add(a2);
        a1.getSources().add(a4);

        assertEquals(getFixture().getMembers().size(), 5);
        assertEquals(getFixture().getRoots().size(), 2);

        assertTrue(getFixture().getRoots().contains(a0));
        assertFalse(getFixture().getRoots().contains(a2));
        assertTrue(getFixture().getRoots().contains(a4));
        assertFalse(getFixture().getRoots().contains(a1));
        assertFalse(getFixture().getRoots().contains(a3));
    }

} // AGroupTest
