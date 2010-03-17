/**
 * <copyright>
 * </copyright>
 *
 * $Id: Measurement.java,v 1.2 2010/03/17 04:12:59 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

import org.eclipse.emf.ecore.EObject;

import org.metaabm.SAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.Measurement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Measurement#getAttribute <em>Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.adata.DataPackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipse.amp.amf.adata.ScaleType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see org.eclipse.amp.amf.adata.ScaleType
     * @see #setType(ScaleType)
     * @see org.eclipse.amp.amf.adata.DataPackage#getMeasurement_Type()
     * @model unique="false" ordered="false"
     * @generated
     */
    ScaleType getType();

    /**
     * Sets the value of the '{@link org.eclipse.amp.amf.adata.Measurement#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see org.eclipse.amp.amf.adata.ScaleType
     * @see #getType()
     * @generated
     */
    void setType(ScaleType value);

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
     * @see org.eclipse.amp.amf.adata.DataPackage#getMeasurement_Attribute()
     * @model required="true"
     * @generated
     */
    String getAttribute();

    /**
     * Sets the value of the '{@link org.eclipse.amp.amf.adata.Measurement#getAttribute <em>Attribute</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute</em>' attribute.
     * @see #getAttribute()
     * @generated
     */
    void setAttribute(String value);

} // Measurement
