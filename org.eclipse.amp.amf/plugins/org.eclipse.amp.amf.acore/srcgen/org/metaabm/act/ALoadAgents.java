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
 * </copyright> $Id: ALoadAgents.java,v 1.3 2010/06/16 18:01:15 mparker Exp $
 */
package org.metaabm.act;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>ALoad
 * Agents</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ALoadAgents#getSourceURL <em>Source URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getALoadAgents()
 * @model
 * @generated
 */
public interface ALoadAgents extends ACreateAgents {
	/**
	 * Returns the value of the '<em><b>Source URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source URL</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source URL</em>' attribute.
	 * @see #setSourceURL(String)
	 * @see org.metaabm.act.MetaABMActPackage#getALoadAgents_SourceURL()
	 * @model required="true"
	 * @generated
	 */
	String getSourceURL();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ALoadAgents#getSourceURL <em>Source URL</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Source URL</em>' attribute.
	 * @see #getSourceURL()
	 * @generated
	 */
	void setSourceURL(String value);

} // ALoadAgents
