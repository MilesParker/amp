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
package org.eclipse.amp.amf.gen.ide;

import java.util.Map;

import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xtend.expression.ExceptionHandler;
import org.eclipse.xtend.expression.ExecutionContext;

public class WorkflowExceptionHandler implements ExceptionHandler {

    static ExceptionHandler wrappedHandler;

    public void handleRuntimeException(RuntimeException ex, SyntaxElement element, ExecutionContext ctx,
            Map<String, Object> additionalContextInfo) {
        if (wrappedHandler != null) {
            wrappedHandler.handleRuntimeException(ex, element, ctx, additionalContextInfo);
        } else {
            throw new RuntimeException("No default handler set");
        }
    }

    public static void setWrappedHandler(ExceptionHandler wrappedHandler) {
        WorkflowExceptionHandler.wrappedHandler = wrappedHandler;
    }
}
