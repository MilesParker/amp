/**
 * <copyright>
 * </copyright>
 *
 * $Id: Parameter.java,v 1.3 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

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
 *   <li>{@link org.eclipse.amp.amf.adata.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Parameter#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Parameter#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.adata.DataPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
    /**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(SAttribute)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getParameter_Attribute()
	 * @model
	 * @generated
	 */
    SAttribute getAttribute();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.Parameter#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
    void setAttribute(SAttribute value);

    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getParameter_Name()
	 * @model required="true"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

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
