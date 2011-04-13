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
package org.metaabm;

import org.eclipse.emf.ecore.EObject;
import org.metaabm.util.Derivable;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SImplementation</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SImplementation#getPackage <em>Package</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getMode <em>Mode</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getDerivedPath <em>Derived Path</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getDerivedPackage <em>Derived Package</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getJavaFileLoc <em>Java File Loc</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getSrcDir <em>Src Dir</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getBinDir <em>Bin Dir</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getClassFileLoc <em>Class File Loc</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getDerivedBinDir <em>Derived Bin Dir</em>}</li>
 *   <li>{@link org.metaabm.SImplementation#getDerivedSrcDir <em>Derived Src Dir</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSImplementation()
 * @model
 * @generated
 */
public interface SImplementation extends EObject {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see org.metaabm.MetaABMPackage#getSImplementation_Package()
	 * @model
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link org.metaabm.SImplementation#getPackage <em>Package</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see org.metaabm.MetaABMPackage#getSImplementation_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link org.metaabm.SImplementation#getClassName <em>Class Name</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Path</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The relative or absolute path to the base directory containing
	 * implementing code, e.g. \"../myproject\", \"/MyDrive/local/myproject\". <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see org.metaabm.MetaABMPackage#getSImplementation_BasePath()
	 * @model unique="false"
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link org.metaabm.SImplementation#getBasePath <em>Base Path</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The default value is <code>"GENERATE"</code>.
	 * The literals are from the enumeration {@link org.metaabm.SImplementationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see org.metaabm.SImplementationMode
	 * @see #setMode(SImplementationMode)
	 * @see org.metaabm.MetaABMPackage#getSImplementation_Mode()
	 * @model default="GENERATE" required="true"
	 * @generated
	 */
	SImplementationMode getMode();

	/**
	 * Sets the value of the '{@link org.metaabm.SImplementation#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see org.metaabm.SImplementationMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(SImplementationMode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SImplemented#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' container reference.
	 * @see #setTarget(SImplemented)
	 * @see org.metaabm.MetaABMPackage#getSImplementation_Target()
	 * @see org.metaabm.SImplemented#getImplementation
	 * @model opposite="implementation" required="true" transient="false"
	 * @generated
	 */
	SImplemented getTarget();

	/**
	 * Sets the value of the '{@link org.metaabm.SImplementation#getTarget <em>Target</em>}' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Target</em>' container reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SImplemented value);

	/**
	 * Returns the value of the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Name</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Name</em>' attribute.
	 * @see org.metaabm.MetaABMPackage#getSImplementation_QualifiedName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getQualifiedName();

	/**
	 * Returns the value of the '<em><b>Derived Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Path</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Path</em>' attribute.
	 * @see org.metaabm.MetaABMPackage#getSImplementation_DerivedPath()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDerivedPath();

	String getPackagePath();

	/**
	 * Returns the value of the '<em><b>Derived Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Package</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Package</em>' attribute.
	 * @see org.metaabm.MetaABMPackage#getSImplementation_DerivedPackage()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDerivedPackage();

	/**
	 * Returns the value of the '<em><b>Java File Loc</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java File Loc</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc --> <!-- begin-model-doc --> The precise location of any related java file, e.g.
	 * \"../projectdir/srcgen/org/foo/MyClass.java\" or \"/root/projectdir/srcgen/org/foo/MyClass.java\". <!--
	 * end-model-doc -->
	 * 
	 * @return the value of the '<em>Java File Loc</em>' attribute.
	 * @see org.metaabm.MetaABMPackage#getSImplementation_JavaFileLoc()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getJavaFileLoc();

	/**
	 * Returns the value of the '<em><b>Src Dir</b></em>' attribute. The default value is <code>"srcgen"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Dir</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Src Dir</em>' attribute.
	 * @see #setSrcDir(String)
	 * @see org.metaabm.MetaABMPackage#getSImplementation_SrcDir()
	 * @model default="srcgen"
	 * @generated
	 */
	String getSrcDir();

	/**
	 * Sets the value of the '{@link org.metaabm.SImplementation#getSrcDir <em>Src Dir</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Src Dir</em>' attribute.
	 * @see #getSrcDir()
	 * @generated
	 */
	void setSrcDir(String value);

	/**
	 * Returns the value of the '<em><b>Bin Dir</b></em>' attribute. The default value is <code>"bin"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Dir</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Bin Dir</em>' attribute.
	 * @see #setBinDir(String)
	 * @see org.metaabm.MetaABMPackage#getSImplementation_BinDir()
	 * @model default="bin"
	 * @generated
	 */
	String getBinDir();

	/**
	 * Sets the value of the '{@link org.metaabm.SImplementation#getBinDir <em>Bin Dir</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Bin Dir</em>' attribute.
	 * @see #getBinDir()
	 * @generated
	 */
	void setBinDir(String value);

	/**
	 * Returns the value of the '<em><b>Class File Loc</b></em>' attribute. The default value is <code>""</code>. <!--
	 * begin-model-doc --> The precise location of any related binary class file, e.g.
	 * "../projectdir/bin/org/foo/MyClass.class" or "/root/projectdir/bin/org/foo/MyClass.class". <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Class File Loc</em>' attribute.
	 * @see org.metaabmPackage#getSImplementation_ClassFileLoc()
	 * @model default="" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getClassFileLoc();

	/**
	 * Returns the value of the '<em><b>Derived Bin Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Bin Dir</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Bin Dir</em>' attribute.
	 * @see org.metaabm.MetaABMPackage#getSImplementation_DerivedBinDir()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDerivedBinDir();

	/**
	 * Returns the value of the '<em><b>Derived Src Dir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived Src Dir</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Derived Src Dir</em>' attribute.
	 * @see org.metaabm.MetaABMPackage#getSImplementation_DerivedSrcDir()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getDerivedSrcDir();

	/**
	 * If this object's value for the derived parent is null, return the parent's value for the derivable.
	 * 
	 * @param derivable
	 * @return
	 */
	String derive(Derivable derivable);

} // SImplementation