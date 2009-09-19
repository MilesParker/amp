/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
 */
package org.eclipse.amp.escape.command;

import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;

// TODO: Auto-generated Javadoc
/**
 * The Class ExecuteJavaHandler.
 */
public class ExecuteJavaHandler extends ExecuteHandler {

    /**
     * Instantiates a new execute java handler.
     * 
     * @param headless the headless
     */
    public ExecuteJavaHandler(boolean headless) {
        super(headless);
    }

    /**
     * Instantiates a new execute java handler.
     */
    public ExecuteJavaHandler() {
        super(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.amp.escape.command.ExecuteHandler#executeOpen(org.eclipse.amp.escape.ide.EclipseEscapeRunner,
     * java.lang.Object, org.eclipse.core.runtime.IProgressMonitor)
     */
    protected void executeOpen(final EclipseEscapeRunner eclipseRunner, final Object executed, IProgressMonitor monitor) {
        // brain dead Java strikes again..
        if (executed instanceof ICompilationUnit && isSupertype(executed, "org.ascape.model.Scape")) {
            ICompilationUnit javaUnit = (ICompilationUnit) executed;
            IType javaClass = javaUnit.findPrimaryType();
            eclipseRunner.open(javaUnit.getResource().getProject(), javaClass.getFullyQualifiedName(), javaClass
                               .getElementName());
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.amp.escape.command.ExecuteHandler#handleSelect(java.lang.Object)
     */
    protected boolean handleSelect(Object sel) {
        return sel instanceof ICompilationUnit;// && isSupertype(sel, "org.ascape.model.Scape");
    }

    /**
     * Checks if is supertype.
     * 
     * @param type the type
     * @param className the class name
     * 
     * @return true, if is supertype
     */
    public boolean isSupertype(IType type, String className) {
        try {
            if (type != null) {
                ITypeHierarchy h = type.newTypeHierarchy(null);
                for (IType superType : h.getAllSupertypes(type)) {
                    if (superType.getFullyQualifiedName().equals(className)) {
                        return true;
                    }
                }
            }
        } catch (JavaModelException e) {
        }
        return false;
    }

    /**
     * Checks if is supertype.
     * 
     * @param sel the sel
     * @param className the class name
     * 
     * @return true, if is supertype
     */
    public boolean isSupertype(Object sel, String className) {
        return isSupertype(((ICompilationUnit) sel).findPrimaryType(), className);
    }
}
