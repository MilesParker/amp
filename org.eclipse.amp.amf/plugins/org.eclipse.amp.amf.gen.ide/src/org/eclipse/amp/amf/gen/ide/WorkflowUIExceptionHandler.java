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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.mwe.core.issues.MWEDiagnostic;
import org.eclipse.internal.xtend.expression.ast.SyntaxElement;
import org.eclipse.xtend.expression.ExceptionHandler;
import org.eclipse.xtend.expression.ExecutionContext;
import org.eclipse.xtend.expression.Variable;

/**
 * On RuntimeException creates a workflow issue. Intended for workflow exceptionHandler slot.
 * 
 * @author milesparker
 * 
 */
public class WorkflowUIExceptionHandler implements ExceptionHandler {

    boolean errorShown;

    List<MWEDiagnostic> exceptions = new ArrayList<MWEDiagnostic>();

    public void handleRuntimeException(RuntimeException ex, SyntaxElement element, ExecutionContext ctx,
            Map<String, Object> additionalContextInfo) {
        if (exceptions == null) {
            exceptions = new ArrayList<MWEDiagnostic>();
        }
        String msg = "An exception occurred while generating metaABM model. \n";
        msg += "(Any further exceptions will be shown in log view.)";
        msg += "Template: " + element.getFileName() + "\n";
        msg += "Name: " + element.getNameString(ctx) + "\n";
        msg += "Line: " + element.getLine() + "\n";
        msg += "Start/End: " + element.getStart() + " - " + element.getEnd() + "\n";
        for (Variable var : ctx.getVisibleVariables().values()) {
            msg += var.getName() + ": " + var.getValue() + "\n";
        }
        MWEDiagnostic issue = new MWEDiagnostic(0, msg, ex, msg, ex, null, null);
        exceptions.add(issue);
    }

    public MWEDiagnostic[] getExceptions() {
        return exceptions.toArray(new MWEDiagnostic[0]);
    }
}
