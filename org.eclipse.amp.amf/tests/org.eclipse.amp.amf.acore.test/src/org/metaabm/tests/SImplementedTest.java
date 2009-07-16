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

import org.metaabm.MetaABMFactory;
import org.metaabm.SContext;
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>SImplemented</b></em>'.
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
public abstract class SImplementedTest extends IIDTest {
    protected SImplementation impl = null;

    protected SContext context = null;

    /**
     * Constructs a new SImplemented test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SImplementedTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this SImplemented test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    protected void setFixture(SImplemented fixture) {
        this.fixture = fixture;
        if (fixture != null) {
            context = MetaABMFactory.eINSTANCE.createSContext();
            impl = MetaABMFactory.eINSTANCE.createSImplementation();
            fixture.setImplementation(impl);
            impl.setClassName("Implemented");
        }
    }

    /**
     * @generated NOT
     */
    protected void setUp() throws Exception {
        getFixture().setLabel("Label");
        super.setUp();
    }

    /**
     * Returns the fixture for this SImplemented test case. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected SImplemented getFixture() {
        return (SImplemented) fixture;
    }

    /**
     * @generated NOT
     */
    public void testGetParent() {
        assert (getFixture().getParent() == context);
    }
} // SImplementedTest
