package org.eclipse.amp.amf.gen.ide;

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

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.generator.MergeableManifest;
import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;

/**
 * Creates a plugin project, creating MANIFEST.MF and plugin.properties files
 * from scratch.
 * 
 * @author milesparker
 * @author jonas.ruettimann
 */
public abstract class PluginTemplateProjectWizard extends PluginProjectWizard implements IExecutableExtension {

	private static final String MANIFEST_MF = "MANIFEST.MF";

	private static final String META_INF = "META-INF";

	/** ID of the new-wizard configuration extension point. */
	public static final String CONF_EXTPOINT_ID = GenIDEPlugin.PLUGIN_ID + ".newProjectWizardConfigurations";

	private IConfigurationElement wizardConfiguration;

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		this.wizardConfiguration = config;
	}

	/**
	 * Copies template PDE project files into target project and replaces template
	 * values with those of project.
	 */
	@Override
	public void createFiles() throws CoreException, IOException {
		try {
			createManifest();
			createProperties();
		} finally {
			getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		}
	}

	@Override
	public List<String> getBuilders() {
		List<String> builderIDs = new ArrayList<String>();
		builderIDs.addAll(findBuilderIdsForWizard(getWizardId()));
		builderIDs.addAll(super.getBuilders());
		return builderIDs;
	}

	@Override
	public List<String> getNatures() {
		List<String> natures = super.getNatures();
		natures.add("org.eclipse.pde.PluginNature");
		return natures;
	}

	/**
	 * Overwrite this method to let a certain subclass behave more specifically.
	 * Use extension point {@link #CONF_EXTPOINT_ID} to make all wizards with a
	 * certain ID behave more specifically if the extending Plug-in is present.
	 * 
	 * @return list of packages that should be added as imports in the MANIFEST.MF
	 */
	protected Set<String> getImportsForManifest() {
		return findImportedPackages(getWizardId());
	}

	/**
	 * Overwrite this method to let a certain subclass behave more specifically.
	 * Use extension point {@link #CONF_EXTPOINT_ID} to make all wizards with a
	 * certain ID behave more specifically if the extending Plug-in is present.
	 * 
	 * @return list of bundles that should be added as dependencies in the
	 *         MANIFEST.MF
	 */
	protected Set<String> getDependenciesForManifest() {
		return findRequiredBundles(getWizardId());
	}

	/**
	 * @return the ID under which this wizard has been registered in the extension
	 *         point registry
	 */
	protected String getWizardId() {
		return wizardConfiguration.getAttribute("id");
	}

	/**
	 * Copying versions from the existing manifest file of this Plug-in seems like
	 * a comfortable way to stay up-to-date.
	 * 
	 * @throws IOException
	 * @throws CoreException
	 * @throws FileNotFoundException
	 */
	private void createManifest() throws IOException, CoreException, FileNotFoundException {
		// Copy versions from existing:
		Manifest original = new Manifest(openStream(getPluginID(), META_INF + "/" + MANIFEST_MF));
		String manifestVersion = original.getMainAttributes().getValue(Attributes.Name.MANIFEST_VERSION);
		String bundleManifestVersion = original.getMainAttributes().getValue(Constants.BUNDLE_MANIFESTVERSION);
		String bundleVersion = original.getMainAttributes().getValue(MergeableManifest.BUNDLE_VERSION);
		String jre = original.getMainAttributes().getValue(MergeableManifest.BUNDLE_REQUIRED_EXECUTION_ENV);

		// Create new manifest:
		MergeableManifest manifest = new MergeableManifest(new ByteArrayInputStream(new byte[0]));
		manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, manifestVersion);
		manifest.getMainAttributes().put(new Attributes.Name(Constants.BUNDLE_MANIFESTVERSION), bundleManifestVersion);
		manifest.getMainAttributes().put(MergeableManifest.BUNDLE_NAME, getProject().getName());
		manifest.getMainAttributes().put(MergeableManifest.BUNDLE_SYMBOLIC_NAME, getProject().getName());
		manifest.getMainAttributes().put(MergeableManifest.BUNDLE_VERSION, bundleVersion);
		manifest.getMainAttributes().put(MergeableManifest.BUNDLE_REQUIRED_EXECUTION_ENV, jre);

		// Add new attributes:
		manifest.addRequiredBundles(getDependenciesForManifest());
		manifest.addImportedPackages(getImportsForManifest());

		IFolder metaInfFolder = getProject().getFolder(META_INF);
		metaInfFolder.create(true, true, null);

		IPath targetFile = metaInfFolder.getFile(MANIFEST_MF).getRawLocation();
		FileOutputStream out = new FileOutputStream(targetFile.toFile());
		try {
			manifest.write(out);
		} finally {
			out.close();
		}
	}

	/**
	 * Create a properties file with source path entries and bin includes.
	 * 
	 * @throws CoreException
	 */
	private void createProperties() throws CoreException {
		String buildProperties = new String();
		buildProperties += "source.. = " + getSourceDirName() + "/" + "\r\n";
		buildProperties += "bin.includes = " + META_INF + "/,\\" + "\r\n";
		buildProperties += "               .";

		ByteArrayInputStream input = new ByteArrayInputStream(buildProperties.getBytes());
		getProject().getFile("build.properties").create(input, true, null);
	}

	/**
	 * Finds and opens a stream for reading from the plugin path.
	 * 
	 * @param pluginID
	 * @param path
	 * @return
	 */
	private InputStream openStream(String pluginID, String path) {
		try {
			Bundle bundle = Platform.getBundle(pluginID);
			URL entry = bundle.getEntry(path);
			if (entry == null) {
				throw new RuntimeException("No resource:" + path + " found in plugin: " + pluginID);
			}
			return entry.openStream();
		} catch (IOException e) {
			throw new RuntimeException("Couldn't load project resource from plugin.", e);
		}
	}

	/**
	 * @param wizardId
	 * @return a list with IDs of builders to be activated for the new project
	 */
	private HashSet<String> findBuilderIdsForWizard(String wizardId) {
		return findAttributes(wizardId, "builder", "builderID");
	}

	/**
	 * @param wizardId
	 * @return a list with IDs bundles to be added as dependencies to the created
	 *         project
	 */
	private HashSet<String> findRequiredBundles(String wizardId) {
		return findAttributes(wizardId, "dependency", "requiredBundleID");
	}

	/**
	 * @param wizardId
	 * @return a list with packages to be added as imports to the created project
	 */
	private HashSet<String> findImportedPackages(String wizardId) {
		return findAttributes(wizardId, "import", "package");
	}

	private HashSet<String> findAttributes(String wizardId, String elementName, String attributeName) {
		HashSet<String> attributes = new HashSet<String>();
		IConfigurationElement[] configs = Platform.getExtensionRegistry().getConfigurationElementsFor(CONF_EXTPOINT_ID);
		for (IConfigurationElement config : configs) {
			if (wizardId != null && wizardId.equals(config.getAttribute("newWizardID"))) {
				for (IConfigurationElement element : config.getChildren(elementName)) {
					attributes.add(element.getAttribute(attributeName));
				}
			}
		}
		return attributes;
	}

}
