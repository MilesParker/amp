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

package org.eclipse.amp.escape.view;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TooManyListenersException;

import org.ascape.model.event.ScapeEvent;
import org.eclipse.amp.amf.adata.Catalog;
import org.eclipse.amp.amf.adata.impl.DataFactoryImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.metaabm.SContext;

/**
 * 
 * @author mparker
 * 
 */
public class FileEMFSimDataCollector extends EMFSimDataCollector {

	private static final long serialVersionUID = 1L;

	private ResourceSet resourceSet;

	private URI dataFileURI;

	private Resource dataResource;

	public final static IPath RESULTS_FOLDER = new Path("output");

	public FileEMFSimDataCollector(IResource resource, SContext model) {
		super(model);
		assert (resource != null);

		IProject project = resource.getProject();
		IPath projectPath = RESULTS_FOLDER.append(
				resource.getProjectRelativePath().removeFirstSegments(1).removeLastSegments(1)).append(
				getFileName(resource) + ".adata");

		dataFileURI = URI.createPlatformResourceURI(project.getName() + "/" + projectPath, true);
	}

	private String getFileName(IResource resource) {
		String name = ((IFile) resource).getProjectRelativePath().removeFileExtension().lastSegment();
		// name += DateFormatUtils.format(System.currentTimeMillis(),
		// "MM-dd-yy_HH-mm-S");
		return name;
	}

	/**
	 * @param scapeEvent
	 * @throws TooManyListenersException
	 * @see org.ascape.view.nonvis.DataView#scapeAdded(org.ascape.model.event.ScapeEvent)
	 */
	@Override
	public void scapeAdded(ScapeEvent scapeEvent) throws TooManyListenersException {
		super.scapeAdded(scapeEvent);

		Resource.Factory binResourceFactory = new Resource.Factory() {

			public Resource createResource(URI uri) {
				return new BinaryResourceImpl(uri);
			}

		};
		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("adata", binResourceFactory);
		// resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT,
		// Boolean.TRUE);
		// resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION,
		// Boolean.TRUE);
		// resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_DEPRECATED_METHODS,
		// Boolean.FALSE);
		boolean exists = resourceSet.getURIConverter().exists(dataFileURI, null);
		if (exists) {
			dataResource = resourceSet.getResource(dataFileURI, true);
			setCatalog((Catalog) dataResource.getContents().get(0));
		} else {
			dataResource = resourceSet.createResource(dataFileURI);
			setCatalog(DataFactoryImpl.eINSTANCE.createCatalog());
			dataResource.getContents().add(getCatalog());
		}

		saveResults();
	}

	/**
	 * @param scapeEvent
	 * @see org.ascape.model.event.DefaultScapeListener#scapeStopped(org.ascape.model.event.ScapeEvent)
	 */
	@Override
	public void scapeStopped(ScapeEvent scapeEvent) {
		super.scapeStopped(scapeEvent);
		saveResults();
	}

	@Override
	public void scapeRemoved(ScapeEvent scapeEvent) {
		// TODO Auto-generated method stub
		super.scapeRemoved(scapeEvent);
		if (dataResource != null) {
			dataResource.unload();
			resourceSet.getResources().remove(dataResource);
		}
	}

	private synchronized void saveResults() {
		Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		try {
			saveOptions.put(BinaryResourceImpl.OPTION_SAVE_ONLY_IF_CHANGED, null);
			dataResource.save(saveOptions);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
