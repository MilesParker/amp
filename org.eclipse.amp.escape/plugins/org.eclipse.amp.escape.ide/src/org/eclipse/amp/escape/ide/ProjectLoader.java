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
package org.eclipse.amp.escape.ide;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

// TODO: Auto-generated Javadoc
/**
 * Provides class loading for a project, with a fall back to the main class-loader for all other classes. Overriding a
 * specific class loader seems to be the only model that works. Decorator pattern does not find new classes.
 * 
 * @author milesparker
 */
public class ProjectLoader extends URLClassLoader {

    IProject project;

    public ClassLoader mainLoader;

    private Bundle bundle;

    /**
     * Instantiates a new project loader.
     * 
     * @param project the project
     * 
     * @throws LoaderCreationException the loader creation exception
     */
    @SuppressWarnings("deprecation")
    public ProjectLoader(IProject project) throws LoaderCreationException {
        super(new URL[0]);
        this.project = project;
        try {
            project.open(null);
            IJavaProject javaProject = JavaCore.create(project);
            List<URL> outputURL = new ArrayList<URL>();
            // URL[] outputURL = new URL[allPackageFragmentRoots.length + 1];

            // IPackageFragmentRoot[] allPackageFragmentRoots = javaProject.getAllPackageFragmentRoots();
            // int index = 0;
            // for (IPackageFragmentRoot fragmentRoot : allPackageFragmentRoots) {
            // String osString = fragmentRoot.getPath().toOSString();
            // if (osString.contains("org.ascape.ui.amp")) {
            // outputURL.add(new File(osString).toURI().toURL());
            // }
            // }
            // for (IPackageFragmentRoot fragmentRoot : allPackageFragmentRoots) {
            // String osString = fragmentRoot.getPath().toOSString();
            // URL url = new File(osString).toURI().toURL();
            // try {
            // fragmentRoot.open(null);
            // } catch (JavaModelException e) {
            // throw new RuntimeException(e);
            // }
            // outputURL[index++] = url;
            // }
            outputURL.add(new File(project.getLocation() + "/" + javaProject.getOutputLocation().removeFirstSegments(1)
                                   + "/").toURI().toURL());
            for (URL url : outputURL) {
                addURL(url);
                System.err.println("url " + url);
            }
            activate();
        } catch (Exception e1) {
            throw new LoaderCreationException("Couldn't load class", e1);
        }
    }

    /**
     * Activate.
     * 
     * @throws LoaderCreationException the loader creation exception
     */
    public void activate() throws LoaderCreationException {
        bundle = Platform.getBundle("org.eclipse.amp.escape.runtime");
        mainLoader = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(this);
    }

    /**
     * Restore.
     */
    public void restore() {
        Thread.currentThread().setContextClassLoader(mainLoader);
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.ClassLoader#loadClass(java.lang.String)
     */
    /**
     * 
     * @see java.lang.ClassLoader#loadClass(java.lang.String)
     */
    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        System.err.println("FIND " + name);
        try {
            Class<?> loadClass = super.loadClass(name);
            System.err.println("su: " + loadClass + " " + loadClass.getClassLoader());
            return loadClass;
        } catch (NoClassDefFoundError classNotFoundException) {
            Class<?> loadClassI = bundle.loadClass(name);
            System.err.println("ncd: " + loadClassI + " " + loadClassI.getClassLoader());
            return loadClassI;
        } catch (NoSuchMethodError classNotFoundException) {
            Class<?> loadClassI = bundle.loadClass(name);
            System.err.println("nsm: " + loadClassI);
            return loadClassI;
        } catch (ClassNotFoundException classNotFoundException) {
            Class<?> loadClassI = bundle.loadClass(name);
            System.err.println("cnf: " + loadClassI);
            return loadClassI;
        } catch (UnsupportedClassVersionError classNotFoundException) {
            throw new RuntimeException("Bad class: " + name, classNotFoundException);
        } catch (Exception e) {
            throw new RuntimeException("Unexpected Exception for " + name, e);
        }
    }
}
