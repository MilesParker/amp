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
import org.metaabm.function.FLogicalOperator;
import org.metaabm.function.MetaABMFunctionFactory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>FLogical Operator</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 * @generated
 */
public class FLogicalOperatorTest extends FOperatorTest {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(FLogicalOperatorTest.class);
    }

    /**
     * Constructs a new FLogical Operator test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public FLogicalOperatorTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this FLogical Operator test case. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected FLogicalOperator getFixture() {
        return (FLogicalOperator) fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMFunctionFactory.eINSTANCE.createFLogicalOperator());
        FArgumentPrototype arg0 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        arg0.setSType(SAttributeType.BOOLEAN_LITERAL);
        FArgumentPrototype arg1 = MetaABMFunctionFactory.eINSTANCE.createFArgumentPrototype();
        arg1.setSType(SAttributeType.BOOLEAN_LITERAL);
        getFixture().getInputPrototypes().add(arg0);
        getFixture().getInputPrototypes().add(arg1);
        super.setUp();
    }

    public void testAccepts() {
        SAttribute testInput = MetaABMFactory.eINSTANCE.createSAttribute();
        testInput.setSType(SAttributeType.BOOLEAN_LITERAL);
        assertTrue(getFixture().accepts(testInput, 0));
        assertTrue(getFixture().accepts(testInput, 1));
        assertFalse(getFixture().accepts(testInput, 2));
        testInput.setSType(SAttributeType.INTEGER_LITERAL);
        assertFalse(getFixture().accepts(testInput, 0));
        testInput.setSType(SAttributeType.INTEGER_LITERAL);
        assertFalse(getFixture().accepts(testInput, 0));
        testInput.setSType(SAttributeType.NUMERIC_LITERAL);
        assertFalse(getFixture().accepts(testInput, 0));
        testInput.setSType(SAttributeType.REAL_LITERAL);
        assertFalse(getFixture().accepts(testInput, 0));
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
        assertEquals(getFixture().getArity(), 2);
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

} // FLogicalOperatorTest
