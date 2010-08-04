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
 *   Metascape - Development and maintenance
 *
 * </copyright> $Id: ExtendedResourceLoader.java,v 1.2 2010/08/04 01:54:01 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderDefaultImpl;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * Allows URLs to be added to resource loaders. todo this class doesn't seem to be doing anything anymore.. delete?
 * 
 * @author milesparker
 * 
 */
public class ExtendedResourceLoader extends ResourceLoaderDefaultImpl {
    private ClassLoader projectCL;

    public ExtendedResourceLoader() throws CoreException {
        super();
    }

    /**
     * Builds a classloader for a Java project from the workspace.
     * 
     * @param project An Eclipse project
     * @throws CoreException
     */
    @SuppressWarnings("deprecation")
    public void addProject(IProject project) throws CoreException {
        if (project != null) {
            IJavaProject jp = JavaCore.create(project);

            IClasspathEntry[] javacp = jp.getResolvedClasspath(true);
            URL[] url = new URL[javacp.length];

            for (int i = 0; i < javacp.length; i++) {
                try {
                    url[i] = javacp[i].getPath().toFile().toURL();
                    // System.out.println((new
                    // StringBuffer(" : "+url[i]).insert(0,
                    // "[ExtendedResourceLoader.addProject] url[i]")));

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
            if (projectCL != null) {
                projectCL = new URLClassLoader(url, projectCL);
            } else {
                projectCL = new URLClassLoader(url);
            }
        }
    }

    /**
     * Builds a classloader for a Java project from the workspace.
     * 
     * @param project An Eclipse project
     * @throws CoreException
     */
    public void addURL(URL url) throws CoreException {
        URL[] urls = new URL[1];
        urls[0] = url;
        if (projectCL != null) {
            projectCL = new URLClassLoader(urls, projectCL);
        } else {
            projectCL = new URLClassLoader(urls);
        }
    }

    //TODO is below neccessary?
    /**    @Override
    protected URL internalGetResource(String path) {
        URL resource = projectCL.getResource(path);
        if (resource == null) {
            resource = super.internalGetResource(path);
        }
        return resource;
    }

    @Override
    protected InputStream internalGetResourceAsStream(String path) {
        URL url = internalGetResource(path);
        try {
            return url != null ? url.openStream() : null;
        } catch (IOException e) {
            return null;
        }
    }**/
}
