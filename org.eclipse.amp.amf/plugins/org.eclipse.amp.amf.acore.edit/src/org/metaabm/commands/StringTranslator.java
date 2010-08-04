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
 * </copyright> $Id: StringTranslator.java,v 1.2 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import org.metaabm.IID;

/**
 * Simple interface for translating name based on source state.
 * 
 * @author milesparker
 * 
 */
public interface StringTranslator {

    String translateName(String otherName, IID source);
}
