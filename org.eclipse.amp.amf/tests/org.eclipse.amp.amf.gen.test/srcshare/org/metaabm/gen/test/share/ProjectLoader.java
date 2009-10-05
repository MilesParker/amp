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
package org.metaabm.gen.test.share;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * Provides class loading for a project, with a fall back to the main class-loader for all other classes.
 * Overriding a specific class loader seems to be the only model that works. Decorator pattern does not find new classes.
 * @author milesparker
 *
 */
public class ProjectLoader extends URLClassLoader {

    IProject project;

    public ClassLoader mainLoader;

    public ProjectLoader(IProject project) throws LoaderCreationException {
        super(new URL[0]);
        this.project = project;
        try {
            project.open(null);
            IJavaProject javaProject = JavaCore.create(project);
            URL[] outputURL = { new File(project.getLocation() + "/"
                                         + javaProject.getOutputLocation().removeFirstSegments(1) + "/").toURL() };
            addURL(outputURL[0]);
            activate();
        } catch (Exception e1) {
            throw new LoaderCreationException("Couldn't load class", e1);
        }
    }

    public void activate() throws LoaderCreationException {
        mainLoader = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(this);
    }

    public void restore() {
        Thread.currentThread().setContextClassLoader(mainLoader);
    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        try {
            return super.loadClass(name);
        } catch (NoClassDefFoundError classNotFoundException) {
            return mainLoader.loadClass(name);
        } catch (ClassNotFoundException classNotFoundException) {
            return mainLoader.loadClass(name);
        } catch (UnsupportedClassVersionError classNotFoundException) {
            throw new RuntimeException("Bad class: " + name, classNotFoundException);
        }
    }
}
