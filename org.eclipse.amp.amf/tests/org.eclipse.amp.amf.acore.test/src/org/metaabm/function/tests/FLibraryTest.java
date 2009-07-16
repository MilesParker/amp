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
package org.metaabm.function.tests;

import junit.textui.TestRunner;

import org.metaabm.function.FLibrary;
import org.metaabm.function.MetaABMFunctionFactory;
import org.metaabm.tests.SNamedTest;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>FLibrary</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 * @generated
 */
public class FLibraryTest extends SNamedTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(FLibraryTest.class);
    }

    /**
     * Constructs a new FLibrary test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FLibraryTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this FLibrary test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected FLibrary getFixture() {
        return (FLibrary) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMFunctionFactory.eINSTANCE.createFLibrary());
        getFixture().setLabel("Label");
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
     * Tests the '{@link org.metaabm.IID#getLabel() <em>Label</em>}' feature
     * getter. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metaabm.IID#getLabel()
     * @generated NOT
     */
    public void testGetLabel() {
        assertEquals(fixture.getLabel(), "Label");
    }

} // FLibraryTest
