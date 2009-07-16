/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */

package org.metaabm.tests;

import org.metaabm.SContext;

public interface Transformer {
    public void prepare(SContext target);

    public void exec();

    public void undo();

    public void redo();

    public boolean modifies();
}