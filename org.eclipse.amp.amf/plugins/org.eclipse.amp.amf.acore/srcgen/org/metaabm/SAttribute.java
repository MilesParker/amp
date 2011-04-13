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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SAttribute</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SAttribute#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.metaabm.SAttribute#isGatherData <em>Gather Data</em>}</li>
 *   <li>{@link org.metaabm.SAttribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link org.metaabm.SAttribute#getUnits <em>Units</em>}</li>
 *   <li>{@link org.metaabm.SAttribute#isImmutable <em>Immutable</em>}</li>
 *   <li>{@link org.metaabm.SAttribute#isDerived <em>Derived</em>}</li>
 *   <li>{@link org.metaabm.SAttribute#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSAttribute()
 * @model
 * @generated
 */
public interface SAttribute extends SNamed, IValue, ITyped {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SAttributed#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(SAttributed)
	 * @see org.metaabm.MetaABMPackage#getSAttribute_Owner()
	 * @see org.metaabm.SAttributed#getAttributes
	 * @model opposite="attributes" keys="ID" required="true" transient="false"
	 * @generated
	 */
	SAttributed getOwner();

	/**
	 * Sets the value of the '{@link org.metaabm.SAttribute#getOwner <em>Owner</em>}' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(SAttributed value);

	/**
	 * Returns the value of the '<em><b>Gather Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gather Data</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gather Data</em>' attribute.
	 * @see #setGatherData(boolean)
	 * @see org.metaabm.MetaABMPackage#getSAttribute_GatherData()
	 * @model
	 * @generated
	 */
	boolean isGatherData();

	/**
	 * Sets the value of the '{@link org.metaabm.SAttribute#isGatherData <em>Gather Data</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Gather Data</em>' attribute.
	 * @see #isGatherData()
	 * @generated
	 */
	void setGatherData(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see org.metaabm.MetaABMPackage#getSAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link org.metaabm.SAttribute#getDefaultValue <em>Default Value</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Units</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(String)
	 * @see org.metaabm.MetaABMPackage#getSAttribute_Units()
	 * @model
	 * @generated
	 */
	String getUnits();

	/**
	 * Sets the value of the '{@link org.metaabm.SAttribute#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(String value);

	/**
	 * Returns the value of the '<em><b>Immutable</b></em>' attribute. The default value is <code>"false"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Immutable</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Immutable</em>' attribute.
	 * @see #setImmutable(boolean)
	 * @see org.metaabm.MetaABMPackage#getSAttribute_Immutable()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isImmutable();

	/**
	 * Sets the value of the '{@link org.metaabm.SAttribute#isImmutable <em>Immutable</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Immutable</em>' attribute.
	 * @see #isImmutable()
	 * @generated
	 */
	void setImmutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Derived</b></em>' attribute. The default value is <code>"false"</code>. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Derived</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Derived</em>' attribute.
	 * @see #setDerived(boolean)
	 * @see org.metaabm.MetaABMPackage#getSAttribute_Derived()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isDerived();

	/**
	 * Sets the value of the '{@link org.metaabm.SAttribute#isDerived <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derived</em>' attribute.
	 * @see #isDerived()
	 * @generated
	 */
	void setDerived(boolean value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.metaabm.IAttributeChild}.
	 * It is bidirectional and its opposite is '{@link org.metaabm.IAttributeChild#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.metaabm.MetaABMPackage#getSAttribute_Children()
	 * @see org.metaabm.IAttributeChild#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<IAttributeChild> getChildren();

	public boolean accepts(IValue value);
} // SAttribute