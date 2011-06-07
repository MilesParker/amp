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
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.osgi.util.ManifestElement;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;
import org.osgi.framework.Constants;

/**
 * Provides class loading for a project, with a fall back to the main
 * class-loader for all other classes. Overriding a specific class loader seems
 * to be the only model that works. Decorator pattern does not find new classes.
 * 
 * @author milesparker
 */
public class ProjectLoader extends URLClassLoader {

	private IProject project;

	private ClassLoader mainLoader;

	private List<Bundle> bundles;

	/**
	 * Instantiates a new project loader.
	 * 
	 * @param project
	 *          the project
	 * 
	 * @throws LoaderCreationException
	 *           the loader creation exception
	 */
	public ProjectLoader(IProject project) throws LoaderCreationException {
		super(new URL[0]);
		this.project = project;
		try {
			project.open(null);
			IJavaProject javaProject = JavaCore.create(project);
			addURL(new File(project.getLocation() + "/" + javaProject.getOutputLocation().removeFirstSegments(1) + "/").toURI().toURL());

			bundles = readDependencies(openStream("META-INF/MANIFEST.MF"));

			mainLoader = Thread.currentThread().getContextClassLoader();
			Thread.currentThread().setContextClassLoader(this);

		} catch (Exception e) {
			throw new LoaderCreationException("Problem creating classloaders.", e);
		}
	}

	/**
	 * Read all dependencies in the given Manifest file and put them into a list
	 * of needed Bundles. Only the most current of all available bundles with a
	 * given name will be added.
	 * 
	 * @param manifestFileStream
	 * @return a list of all dependencies from the Manifest file
	 * @throws BundleException
	 *           if the manifest file cannot be parsed
	 * @throws IOException
	 *           if the Manifest file cannot be loaded
	 * @throws IllegalStateException
	 *           if a required bundle is not available
	 */
	public static List<Bundle> readDependencies(InputStream manifestFileStream) throws BundleException, IOException, IllegalStateException {
		List<Bundle> dependencies = new ArrayList<Bundle>();

		Map<String, String> manifest = ManifestElement.parseBundleManifest(manifestFileStream, null);
		ManifestElement[] bundleElements = ManifestElement.parseHeader(Constants.REQUIRE_BUNDLE, manifest.get(Constants.REQUIRE_BUNDLE));
		for (ManifestElement bundleElement : bundleElements) {

			String symbolicName = bundleElement.getValue();
			String version = bundleElement.getAttribute(Constants.BUNDLE_VERSION_ATTRIBUTE);
			Bundle[] availableBundles = Platform.getBundles(symbolicName, version);
			if (availableBundles != null && availableBundles.length > 0) {
				// The most current version is assumed to be the first one in the list.
				dependencies.add(availableBundles[0]);

			} else if (!isOptional(bundleElement)) {
				String missingBundle = "Bundle cannot be found: " + symbolicName;
				if (version != null) {
					missingBundle += " " + version;
				}
				throw new IllegalStateException(missingBundle);
			}
		}

		return dependencies;
	}

	/**
	 * The "Optional" property on a bundle element is not a mandatory field. So it
	 * can exist or not. By default, a bundle <emph>is</emph> mandatory. It should
	 * only be assumed to be optional if that property has been defined and if
	 * it's set to <code>true</code>.
	 * 
	 * @param bundleElement
	 * @return <code>true</code> given bundle element is marked as optional
	 */
	private static boolean isOptional(ManifestElement bundleElement) {
		String optional = bundleElement.getDirective(Constants.RESOLUTION_DIRECTIVE);
		if (optional != null && optional.equals(Constants.RESOLUTION_OPTIONAL)) {
			return true;
		}
		return false;
	}

	/**
	 * Finds and opens a stream for reading from the plugin path.
	 * 
	 * @param pluginID
	 * @param path
	 * @return
	 */
	private InputStream openStream(String path) {
		try {
			IFile file = project.getFile(path);
			if (file == null) {
				throw new RuntimeException("No resource " + path + " found in " + project + ".");
			}
			return file.getContents();

		} catch (CoreException e) {
			throw new RuntimeException("Couldn open file " + path + " in " + project + ".", e);
		}
	}

	/**
	 * Restore.
	 */
	public void restore() {
		Thread.currentThread().setContextClassLoader(mainLoader);
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		try {
			Class<?> loadClass = super.loadClass(name);
			return loadClass;
		} catch (NoClassDefFoundError classNotFoundException) {
			Class<?> loadClassI = loadClassInternal(name);
			return loadClassI;
		} catch (NoSuchMethodError classNotFoundException) {
			Class<?> loadClassI = loadClassInternal(name);
			return loadClassI;
		} catch (ClassNotFoundException classNotFoundException) {
			Class<?> loadClassI = loadClassInternal(name);
			return loadClassI;
		} catch (UnsupportedClassVersionError classNotFoundException) {
			throw new RuntimeException("Bad class: " + name, classNotFoundException);
		} catch (Exception e) {
			throw new RuntimeException("Unexpected Exception for " + name, e);
		}
	}

	private Class<?> loadClassInternal(String name) throws ClassNotFoundException {
		ClassNotFoundException lastException = null;
		for (Bundle tmp : bundles) {
			try {
				return tmp.loadClass(name);
			} catch (ClassNotFoundException e) {
				lastException = e;
			}
		}
		if (lastException != null) {
			throw lastException;
		}
		return null;
	}
}
