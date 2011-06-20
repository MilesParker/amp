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
import org.eclipse.jdt.core.IJavaProject;
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
    @Override
		protected EclipseEscapeRunner executeOpen(final Object executed, IProgressMonitor monitor) {
        // brain dead Java strikes again..
        if (isSupertype(executed, "org.ascape.model.Scape")) {
            IType javaClass = getType(executed);
            IJavaProject javaProject = javaClass.getJavaProject();
            EclipseEscapeRunner eclipseRunner = createRunner();
            eclipseRunner.open(javaProject.getProject(), javaClass.getFullyQualifiedName(), javaClass
                               .getElementName());
            return eclipseRunner;
        }
        return null;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.amp.escape.command.ExecuteHandler#handleSelect(java.lang.Object)
     */
    @Override
		protected boolean handleSelect(Object sel) {
        return sel instanceof ICompilationUnit || sel instanceof IType;
    }

    /**
     * Checks if is supertype.
     * 
     * @param type the type
     * @param className the class name
     * 
     * @return true, if is supertype
     */
    public boolean isTypeSupertype(IType type, String className) {
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
        	//
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
        return isTypeSupertype(getType(sel), className);
    }

    public IType getType(Object object) {
        if (object instanceof ICompilationUnit) {
            return ((ICompilationUnit) object).findPrimaryType();
        } else if (object instanceof IType) {
            return (IType) object;
        }
        return null;
    }
}
