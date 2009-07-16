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

import org.metaabm.function.FArgumentPrototype;
import org.metaabm.function.MetaABMFunctionFactory;
import org.metaabm.tests.IIDTest;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>FArgument Prototype</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class FArgumentPrototypeTest extends IIDTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(FArgumentPrototypeTest.class);
    }

    /**
     * Constructs a new FArgument Prototype test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FArgumentPrototypeTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this FArgument Prototype test case. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected FArgumentPrototype getFixture() {
        return (FArgumentPrototype) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype());
        getFixture().setLabel("Label");
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

} // FArgumentPrototypeTest
