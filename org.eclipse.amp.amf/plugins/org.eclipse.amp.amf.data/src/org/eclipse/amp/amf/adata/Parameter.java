/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parameter.java,v 1.1 2010/02/13 03:59:06 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

import org.eclipse.emf.common.util.EList;
import org.eclipse.amp.amf.abase.aBase.Value;

import org.eclipse.emf.ecore.EObject;

import org.metaabm.SAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.Parameter#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Parameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.adata.DataPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
    /**
     * Returns the value of the '<em><b>Attribute</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute</em>' attribute.
     * @see #setAttribute(String)
     * @see org.eclipse.amp.amf.adata.DataPackage#getParameter_Attribute()
     * @model required="true"
     * @generated
     */
    String getAttribute();

    /**
     * Sets the value of the '{@link org.eclipse.amp.amf.adata.Parameter#getAttribute <em>Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute</em>' attribute.
     * @see #getAttribute()
     * @generated
     */
    void setAttribute(String value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(String)
     * @see org.eclipse.amp.amf.adata.DataPackage#getParameter_Value()
     * @model required="true"
     * @generated
     */
    String getValue();

    /**
     * Sets the value of the '{@link org.eclipse.amp.amf.adata.Parameter#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(String value);

} // Parameter
