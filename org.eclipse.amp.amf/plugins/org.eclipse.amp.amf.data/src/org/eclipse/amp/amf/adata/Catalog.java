/**
 * <copyright>
 * </copyright>
 *
 * $Id: Catalog.java,v 1.1 2010/02/13 03:59:06 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.Catalog#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Catalog#getRuns <em>Runs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.adata.DataPackage#getCatalog()
 * @model
 * @generated
 */
public interface Catalog extends EObject {
    /**
     * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.amp.amf.adata.DataPoint}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entries</em>' containment reference list.
     * @see org.eclipse.amp.amf.adata.DataPackage#getCatalog_Entries()
     * @model containment="true" ordered="false"
     * @generated
     */
    EList<DataPoint> getEntries();

    /**
     * Returns the value of the '<em><b>Runs</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.amp.amf.adata.Run}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Runs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Runs</em>' containment reference list.
     * @see org.eclipse.amp.amf.adata.DataPackage#getCatalog_Runs()
     * @model containment="true"
     * @generated
     */
    EList<Run> getRuns();

} // Catalog
