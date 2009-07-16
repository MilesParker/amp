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

import junit.framework.TestCase;

import org.metaabm.IID;
import org.metaabm.MetaABMFactory;
import org.metaabm.SContext;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>IID</b></em>
 * '.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 * @generated
 */
public abstract class IIDTest extends TestCase {

    /**
     * The fixture for this IID test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected IID fixture = null;

    protected SContext context = null;

    /**
     * Constructs a new IID test case with the given name. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public IIDTest(String name) {
        super(name);
    }

    /**
     * @generated NOT
     */
    protected void setUp() throws Exception {
        super.setUp();
        getFixture().setLabel("Label");
        context = MetaABMFactory.eINSTANCE.createSContext();
    }

    /**
     * Sets the fixture for this IID test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected void setFixture(IID fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this IID test case. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @generated
     */
    protected IID getFixture() {
        return fixture;
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

} // IIDTest
