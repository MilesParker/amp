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
import org.metaabm.SAttributeArray;
import org.metaabm.SAttributeType;
import org.metaabm.function.FArgumentArrayPrototype;
import org.metaabm.function.FArgumentPrototype;
import org.metaabm.function.FOperator;
import org.metaabm.function.MetaABMFunctionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>FOperator</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are tested:
 *         <ul>
 *         <li>{@link org.metaabm.function.FOperator#getArity() <em>Arity</em>}</li>
 *         </ul>
 *         </p>
 * @generated
 */
public class FOperatorTest extends FFunctionTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(FOperatorTest.class);
    }

    /**
     * Constructs a new FOperator test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FOperatorTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this FOperator test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected FOperator getFixture() {
        return (FOperator) fixture;
    }

    public void testAccepts() {
        FArgumentPrototype argF = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        argF.setSType(SAttributeType.REAL_LITERAL);
        getFixture().getInputPrototypes().add(argF);
        FArgumentPrototype argF1 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        argF1.setSType(SAttributeType.REAL_LITERAL);
        getFixture().getInputPrototypes().add(argF1);
        SAttribute testInput = MetaABMFactory.eINSTANCE.createSAttribute();
        testInput.setSType(SAttributeType.REAL_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));
        assertTrue(getFixture().accepts(testInput, 1));
        assertFalse(getFixture().accepts(testInput, 2));
        testInput.setSType(SAttributeType.INTEGER_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));
        testInput.setSType(SAttributeType.INTEGER_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));
        testInput.setSType(SAttributeType.NUMERIC_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));
        testInput.setSType(SAttributeType.BOOLEAN_LITERAL);
        assertFalse(getFixture().accepts(testInput, 0));

        argF.setSType(SAttributeType.UNDEFINED_LITERAL);
        testInput.setSType(SAttributeType.BOOLEAN_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));
        testInput.setSType(SAttributeType.REAL_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));
        testInput.setSType(SAttributeType.INTEGER_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));
        testInput.setSType(SAttributeType.NUMERIC_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));
        testInput.setSType(SAttributeType.SYMBOL_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));

        getFixture().getInputPrototypes().remove(argF);
        FArgumentArrayPrototype argAr = MetaABMFunctionFactory.eINSTANCE.createFArgumentArrayPrototype();
        argAr.setSType(SAttributeType.REAL_LITERAL);
        argAr.setSize(2);
        getFixture().getInputPrototypes().add(0, argAr);

        SAttributeArray testArrayInput = MetaABMFactory.eINSTANCE.createSAttributeArray();
        testArrayInput.setSType(SAttributeType.REAL_LITERAL);
        testArrayInput.setSize(2);
        assertTrue(getFixture().accepts(testArrayInput, 0));
        assertFalse(getFixture().accepts(testArrayInput, 1));

        testArrayInput.setSize(3);
        assertFalse(getFixture().accepts(testArrayInput, 0));
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
            setFixture(MetaABMFunctionFactory.eINSTANCE.createFOperator());
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
     * Tests the '{@link org.metaabm.function.FOperator#getArity()
     * <em>Arity</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.function.FOperator#getArity()
     * @generated NOT
     */
    public void testGetArity() {
        assertEquals(getFixture().getArity(), 0);
        FArgumentPrototype argF = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        argF.setSType(SAttributeType.REAL_LITERAL);
        getFixture().getInputPrototypes().add(argF);
        assertEquals(getFixture().getArity(), 1);
        FArgumentPrototype argF1 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        argF1.setSType(SAttributeType.REAL_LITERAL);
        getFixture().getInputPrototypes().add(argF1);
        assertEquals(getFixture().getArity(), 2);
    }

} // FOperatorTest
