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

import org.metaabm.MetaABMFactory;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
import org.metaabm.function.FArgumentPrototype;
import org.metaabm.function.FGenericFunction;
import org.metaabm.function.MetaABMFunctionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>FGeneric Function</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 * @generated
 */
public class FGenericFunctionTest extends FGenericTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(FGenericFunctionTest.class);
    }

    /**
     * Constructs a new FGeneric Function test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FGenericFunctionTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this FGeneric Function test case. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected FGenericFunction getFixture() {
        return (FGenericFunction) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMFunctionFactory.eINSTANCE.createFGenericFunction());
        super.setUp();
    }

    public void testAccepts() {
        FArgumentPrototype arg0 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        FArgumentPrototype arg1 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        FArgumentPrototype arg2 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        getFixture().getInputPrototypes().add(arg0);
        getFixture().getInputPrototypes().add(arg1);
        getFixture().getInputPrototypes().add(arg2);
        arg0.setSType(SAttributeType.BOOLEAN_LITERAL);
        arg1.setSType(SAttributeType.NUMERIC_LITERAL);
        arg2.setSType(SAttributeType.REAL_LITERAL);

        SAttribute testInput = MetaABMFactory.eINSTANCE.createSAttribute();
        testInput.setSType(SAttributeType.BOOLEAN_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));
        assertFalse(getFixture().accepts(testInput, 1));
        assertFalse(getFixture().accepts(testInput, 2));
        assertFalse(getFixture().accepts(testInput, 3));

        testInput.setSType(SAttributeType.NUMERIC_LITERAL);
        assertFalse(getFixture().accepts(testInput, 0));
        assertTrue(getFixture().accepts(testInput, 1));
        assertTrue(getFixture().accepts(testInput, 2));

        testInput.setSType(SAttributeType.REAL_LITERAL);
        assertFalse(getFixture().accepts(testInput, 0));
        assertTrue(getFixture().accepts(testInput, 1));
        assertTrue(getFixture().accepts(testInput, 2));

        testInput.setSType(SAttributeType.INTEGER_LITERAL);
        assertFalse(getFixture().accepts(testInput, 0));
        assertTrue(getFixture().accepts(testInput, 1));
        assertTrue(getFixture().accepts(testInput, 2));

        FGenericFunction simpleFunction = MetaABMFunctionFactory.eINSTANCE.createFGenericFunction();
        FArgumentPrototype out0 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        simpleFunction.getOutputPrototypes().add(out0);
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

} // FGenericFunctionTest
