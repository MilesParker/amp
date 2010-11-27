/**
 * <copyright>
 * </copyright>
 *
 * $Id: Run.java,v 1.4 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.metaabm.SContext;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.Run#getModel <em>Model</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Run#getStarted <em>Started</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Run#getFinished <em>Finished</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Run#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Run#getParameterSets <em>Parameter Sets</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Run#getMeasurements <em>Measurements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.adata.DataPackage#getRun()
 * @model
 * @generated
 */
public interface Run extends EObject {
    /**
	 * Returns the value of the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' reference.
	 * @see #setModel(SContext)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getRun_Model()
	 * @model required="true"
	 * @generated
	 */
    SContext getModel();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.Run#getModel <em>Model</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' reference.
	 * @see #getModel()
	 * @generated
	 */
    void setModel(SContext value);

    /**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Started</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(Date)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getRun_Started()
	 * @model
	 * @generated
	 */
    Date getStarted();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.Run#getStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #getStarted()
	 * @generated
	 */
    void setStarted(Date value);

    /**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Finished</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see #setFinished(Date)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getRun_Finished()
	 * @model
	 * @generated
	 */
    Date getFinished();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.Run#getFinished <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished</em>' attribute.
	 * @see #getFinished()
	 * @generated
	 */
    void setFinished(Date value);

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
	 * @see org.eclipse.amp.amf.adata.DataPackage#getRun_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.Run#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Parameter Sets</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amp.amf.adata.ParameterSet}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Sets</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Sets</em>' containment reference list.
	 * @see org.eclipse.amp.amf.adata.DataPackage#getRun_ParameterSets()
	 * @model containment="true"
	 * @generated
	 */
    EList<ParameterSet> getParameterSets();

    /**
	 * Returns the value of the '<em><b>Measurements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amp.amf.adata.Measurement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amp.amf.adata.Measurement#getRun <em>Run</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measurements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurements</em>' containment reference list.
	 * @see org.eclipse.amp.amf.adata.DataPackage#getRun_Measurements()
	 * @see org.eclipse.amp.amf.adata.Measurement#getRun
	 * @model opposite="run" containment="true"
	 * @generated
	 */
    EList<Measurement> getMeasurements();

} // Run
