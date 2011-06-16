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

import java.io.File;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.metaabm.MetaABMFactory;
import org.metaabm.SContext;
import org.metaabm.SImplementation;
import org.metaabm.impl.SImplementationImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>SImplementation</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are tested:
 *         <ul>
 *         <li>{@link org.metaabm.SImplementation#getClassName() <em>Class Name
 *         </em>}</li>
 *         <li>{@link org.metaabm.SImplementation#getQualifiedName() <em>
 *         Qualified Name</em>}</li>
 *         <li>{@link org.metaabm.SImplementation#getDerivedPath() <em>Derived
 *         Path</em>}</li>
 *         <li>{@link org.metaabm.SImplementation#getDerivedPackage() <em>
 *         Derived Package</em>}</li>
 *         <li>{@link org.metaabm.SImplementation#getJavaFileLoc() <em>Java File
 *         Loc</em>}</li>
 *         <li>{@link org.metaabm.SImplementation#getClassFileLoc() <em>Class
 *         File Loc</em>}</li>
 *         <li>{@link org.metaabm.SImplementation#getDerivedBinDir() <em>Derived
 *         Bin Dir</em>}</li>
 *         <li>{@link org.metaabm.SImplementation#getDerivedSrcDir() <em>Derived
 *         Src Dir</em>}</li>
 *         </ul>
 *         </p>
 * @generated
 */
public class SImplementationTest extends TestCase {
    /**
     * The fixture for this SImplementation test case. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SImplementation fixture = null;

    private SContext parentContext;

    private SImplementation parentImpl;

    private SContext agent;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public static void main(String[] args) {
        TestRunner.run(SImplementationTest.class);
    }

    /**
     * Constructs a new SImplementation test case with the given name. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public SImplementationTest(String name) {
        super(name);
    }

    /**
     * Sets the fixture for this SImplementation test case. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void setFixture(SImplementation fixture) {
        this.fixture = fixture;
    }

    /**
     * Returns the fixture for this SImplementation test case. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected SImplementation getFixture() {
        return fixture;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#setUp()
     * @generated NOT
     */
    @Override
    protected void setUp() throws Exception {
        setFixture(MetaABMFactory.eINSTANCE.createSImplementation());
        agent = MetaABMFactory.eINSTANCE.createSContext();
        agent.setImplementation(fixture);
        parentContext = MetaABMFactory.eINSTANCE.createSContext();
        parentContext.getAgents().add(agent);
        parentImpl = MetaABMFactory.eINSTANCE.createSImplementation();
        parentContext.setImplementation(parentImpl);
        fixture.setClassName("SomeClass");
        parentImpl.setTarget(parentContext);
        parentImpl.setBasePath("../someBase");
        parentImpl.setBinDir("bin");
        parentImpl.setSrcDir("src");
        parentImpl.setPackage("org.someorg");
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see junit.framework.TestCase#tearDown()
     * @generated NOT
     */
    @Override
    protected void tearDown() throws Exception {
        setFixture(null);
    }

    /**
     * Tests the '{@link org.metaabm.SImplementation#getClassName()
     * <em>Class Name</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.SImplementation#getClassName()
     * @generated NOT
     */
    public void testGetClassName() {
        assertEquals(fixture.getClassName(), "SomeClass");
    }

    /**
     * Tests the '
     * {@link org.metaabm.SImplementation#setClassName(java.lang.String)
     * <em>Class Name</em>}' feature setter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.SImplementation#setClassName(java.lang.String)
     * @generated NOT
     */
    public void testSetClassName() {
        fixture.setClassName("SomeClass");
    }

    /**
     * Tests the '{@link org.metaabm.SImplementation#getQualifiedName()
     * <em>Qualified Name</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.SImplementation#getQualifiedName()
     * @generated NOT
     */
    public void testGetQualifiedName() {
        assertEquals(fixture.getQualifiedName(), "org.someorg.SomeClass");
    }

    /**
     * Tests the '{@link org.metaabm.SImplementation#getDerivedPath()
     * <em>Derived Path</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.SImplementation#getDerivedPath()
     * @generated NOT
     */
    public void testGetDerivedPath() {
        assertEquals(fixture.getDerivedPath(), "../someBase");
        fixture.setPackage("org.someother");
        assertEquals(fixture.getDerivedPackage(), "org.someother");
    }

    /**
     * Tests the '{@link org.metaabm.SImplementation#getDerivedPackage()
     * <em>Derived Package</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.SImplementation#getDerivedPackage()
     * @generated NOT
     */
    public void testGetDerivedPackage() {
        assertEquals(fixture.getDerivedPackage(), "org.someorg");
        fixture.setPackage("org.someother");
        assertEquals(fixture.getDerivedPackage(), "org.someother");
    }

    /**
     * Tests the '{@link org.metaabm.SImplementation#getJavaFileLoc()
     * <em>Java File Loc</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.SImplementation#getJavaFileLoc()
     * @generated NOT
     */
    public void testGetJavaFileLoc() {
        assertEquals(fixture.getJavaFileLoc(), "../someBase/srcgen/org/someorg/SomeClass.java");
        fixture.setBasePath("/Hello");
        fixture.setPackage("org.someother");
        assertEquals(fixture.getJavaFileLoc(), "/Hello/srcgen/org/someother/SomeClass.java");
    }

    /**
     * Tests the '{@link org.metaabm.SImplementation#getClassFileLoc()
     * <em>Class File Loc</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.SImplementation#getClassFileLoc()
     * @generated NOT
     */
    public void testGetClassFileLoc() {
        assertEquals(fixture.getClassFileLoc(), "../someBase/bin/org/someorg/SomeClass.class");
        fixture.setBasePath("/Hello");
        fixture.setPackage("org.someother");
        assertEquals(fixture.getClassFileLoc(), "/Hello/bin/org/someother/SomeClass.class");
    }

    /**
     * Tests the '{@link org.metaabm.SImplementation#getDerivedBinDir()
     * <em>Derived Bin Dir</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.SImplementation#getDerivedBinDir()
     * @generated NOT
     */
    public void testGetDerivedBinDir() throws Exception {
        assertEquals(fixture.getBinDir(), "bin");
        assertEquals(fixture.getDerivedBinDir(), "bin");
        parentContext.getImplementation().setBinDir("lib");
        fixture.setBinDir(null);
        assertEquals(fixture.getDerivedBinDir(), "lib");
        fixture.setBinDir("bin2");
        assertEquals(fixture.getBinDir(), "bin2");
        assertEquals(fixture.getDerivedBinDir(), "bin2");
    }

    /**
     * Tests the '{@link org.metaabm.SImplementation#getDerivedSrcDir()
     * <em>Derived Src Dir</em>}' feature getter. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     * 
     * @see org.metaabm.SImplementation#getDerivedSrcDir()
     * @generated NOT
     */
    public void testGetDerivedSrcDir() {
        assertEquals(fixture.getSrcDir(), "srcgen");
        assertEquals(fixture.getDerivedSrcDir(), "srcgen");
        parentContext.getImplementation().setSrcDir("src");
        fixture.setSrcDir(null);
        assertEquals(fixture.getDerivedSrcDir(), "src");
        fixture.setSrcDir("src2");
        assertEquals(fixture.getDerivedSrcDir(), "src2");
    }

    public void testLookup() {
        char sc = SImplementationImpl.sc;
        // basic
        assertEquals(SImplementationImpl.addDir("", ""), "");
        assertEquals(SImplementationImpl.addDir("a", ""), "a");
        assertEquals(SImplementationImpl.addDir("", "b"), "b");
        assertEquals(SImplementationImpl.addDir("a", "b"), "a" + sc + "b");

        parentImpl.setClassName("Foo");
        parentImpl.setPackage("com.blah");
        parentImpl.setBasePath("/Some/path");
        assertEquals(parentContext.getImplementation().getQualifiedName(), "com.blah.Foo");
        assertEquals(parentContext.getImplementation().getDerivedPath(), "/Some/path");
        // assuming default values of srcgen and bin
        assertEquals(parentContext.getImplementation().getJavaFileLoc(), "/Some/path" + sc + "src" + sc + "com" + sc
                        + "blah" + sc + "Foo.java");
        assertEquals(parentContext.getImplementation().getClassFileLoc(), "/Some/path" + sc + "bin" + sc + "com" + sc
                        + "blah" + sc + "Foo.class");
        parentImpl.setPackage("");
        assertEquals(parentContext.getImplementation().getClassFileLoc(), "/Some/path" + sc + "bin" + sc + "Foo.class");
        parentImpl.setPackage("com.foo");
        parentImpl.setBasePath("");
        assertEquals(parentContext.getImplementation().getClassFileLoc(), "bin" + sc + "com" + sc + "foo" + sc
                        + "Foo.class");
        parentImpl.setBinDir("");
        assertEquals(parentContext.getImplementation().getClassFileLoc(), "com" + sc + "foo" + sc + "Foo.class");
        parentImpl.setSrcDir("");
        parentImpl.setBasePath("/Some/Other");
        assertEquals(parentContext.getImplementation().getJavaFileLoc(), "/Some/Other" + sc + "com" + sc + "foo" + sc
                        + "Foo.java");

        // get from parents
        agent.getImplementation().setClassName("Bar");
        assertEquals(agent.getImplementation().getQualifiedName(), "com.foo.Bar");
        assertEquals(agent.getImplementation().getDerivedPath(), "/Some/Other");

        // "override"
        agent.getImplementation().setPackage("com.blah2");
        agent.getImplementation().setBasePath("/Some/other");
        assertEquals(agent.getImplementation().getQualifiedName(), "com.blah2.Bar");
        assertEquals(agent.getImplementation().getDerivedPath(), "/Some/other");
        assertEquals(agent.getImplementation().getJavaFileLoc(), "/Some/other" + sc + "srcgen" + sc + "com" + sc
                        + "blah2" + sc + "Bar.java");
        assertEquals(agent.getImplementation().getClassFileLoc(), "/Some/other/bin" + sc + "com" + sc + "blah2" + sc
                        + "Bar.class");

        // null vs. "" values
        agent.getImplementation().setPackage(null);
        agent.getImplementation().setBasePath(null);
        assertEquals(agent.getImplementation().getQualifiedName(), "com.foo.Bar");
        assertEquals(agent.getImplementation().getDerivedPath(), "/Some/Other");

        // null vs. "" values
        agent.getImplementation().setPackage("");
        agent.getImplementation().setBasePath("");
        assertEquals(agent.getImplementation().getQualifiedName(), "com.foo.Bar");
        assertEquals(agent.getImplementation().getDerivedPath(), "/Some/Other");
        assertEquals(agent.getImplementation().getJavaFileLoc(), "/Some/Other" + sc + "srcgen" + sc + "com" + sc
                        + "foo" + sc + "Bar.java");
    }

} // SImplementationTest
