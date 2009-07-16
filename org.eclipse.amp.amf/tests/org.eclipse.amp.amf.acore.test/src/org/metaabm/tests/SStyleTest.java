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
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;
import org.metaabm.SStyle;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>SStyle</b></em>'.
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
public abstract class SStyleTest extends SActableTest {
    protected SImplementation impl = null;

    /**
     * Constructs a new SStyle test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SStyleTest(String name) {
        super(name);
    }

    /**
     * Returns the fixture for this SStyle test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected SStyle getFixture() {
        return (SStyle) fixture;
    }

    /**
     * @generated NOT
     */
    protected void setFixture(SImplemented fixture) {
        super.setFixture(fixture);
        if (fixture != null) {
            context = MetaABMFactory.eINSTANCE.createSContext();
            context.getStyles().add((SStyle) fixture);
            impl = MetaABMFactory.eINSTANCE.createSImplementation();
            fixture.setImplementation(impl);
            impl.setClassName("Implemented");
        }
    }

    /**
     * Tests the '{@link org.metaabm.IID#getLabel() <em>Label</em>}' feature
     * getter. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.metaabm.IID#getLabel()
     * @generated NOT
     */
    public void testGetLabel() {
        assertEquals(getFixture().getLabel(), "Label");
    }

    /**
     * @generated NOT
     */
    public void testGetParent() {
        assert (getFixture().getParent() == context);
    }

} // SStyleTest
