/**
 * <copyright>
 *
 * Copyright (c) 2002-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: JavaPackageResourceFactoryImpl.java,v 1.1 2009/07/28 19:12:19 mparker Exp $
 */
package org.eclipse.emf.java.util;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;


/**
 */
public class JavaPackageResourceFactoryImpl extends ResourceFactoryImpl 
{
  @Override
  public Resource createResource(URI uri)
  {
    return new JavaPackageResourceImpl(uri);
  }
}
