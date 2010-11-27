/**
 * <copyright>
 * </copyright>
 *
 * $Id: Catalog.java,v 1.3 2010/08/04 01:54:19 mparker Exp $
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
