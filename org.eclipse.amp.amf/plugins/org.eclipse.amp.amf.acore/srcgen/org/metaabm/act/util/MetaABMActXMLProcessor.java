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
package org.metaabm.act.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.util.XMLProcessor;
import org.metaabm.act.MetaABMActPackage;

/*
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class MetaABMActXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMActXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		MetaABMActPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the MetaABMActResourceFactoryImpl factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new MetaABMActResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new MetaABMActResourceFactoryImpl());
		}
		return registrations;
	}

} // MetaABMActXMLProcessor
