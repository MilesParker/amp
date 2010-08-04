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
package org.metaabm.xsd;

import java.io.File;
import java.io.IOException;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SContext;
import org.metaabm.util.MetaABMResourceFactoryImpl;
import org.xml.sax.SAXException;

public class MetaABMPersist {

    public static final String CONTEXT_FILE_NAME = "model.metaabm";

    private Resource resource;

    SContext context;

    private URI fileURI;

    protected MetaABMPersist(SContext context, URI fileURI) {
        super();
        this.context = context;
        this.fileURI = fileURI;
    }

    public static MetaABMPersist create(SContext persist, String path) throws IOException {
        MetaABMPersist cp = new MetaABMPersist(persist, null);
        cp.setFilePath(path);
        return cp;
    }

    public static MetaABMPersist create(SContext persist, File file) throws IOException {
        MetaABMPersist cp = new MetaABMPersist(persist, null);
        cp.setFile(file);
        return cp;
    }

    public static MetaABMPersist create(String path) throws IOException {
        MetaABMPersist cp = new MetaABMPersist(null, null);
        cp.setFilePath(path);
        return cp;
    }

    public static MetaABMPersist createURI(URI path) throws IOException {
        MetaABMPersist cp = new MetaABMPersist(null, null);
        cp.setFileURI(path);
        return cp;
    }

    public static MetaABMPersist create(File file) throws IOException {
        MetaABMPersist cp = new MetaABMPersist(null, null);
        cp.setFile(file);
        return cp;
    }

    public SContext load() throws IOException {
        if (resource == null) {
            MetaABMResourceFactoryImpl resourceFactory = new MetaABMResourceFactoryImpl();
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("metaabm", resourceFactory);
            ResourceSet resourceSet = new ResourceSetImpl();
            @SuppressWarnings("unused")
            MetaABMPackage pkg = org.metaabm.MetaABMPackage.eINSTANCE;

            resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);

            @SuppressWarnings("unused")
            MetaABMFactory factory = org.metaabm.MetaABMFactory.eINSTANCE;
            resource = resourceSet.getResource(fileURI, true);
        }
        context = (SContext) resource.getEObject("/");
        return context;
    }

    public void save() throws IOException {
        if (resource == null) {
            resource = new XMIResourceFactoryImpl().createResource(fileURI);
        }
        if (!resource.getContents().contains(context)) {
            resource.getContents().clear();
            resource.getContents().add(context);
        }
        resource.save(null);
    }

    /**
     * Normalize classpath to platform specific string, and use cannonical form.
     * Classpaths are expected to be in a standard format ala Ant paths -- i.e.
     * seperator character can be '/' or '\', inputPath seperator <i>must</i> be
     * ';' (to avoid confusion with Window's drive letters).
     * 
     * @throws SAXException in the rare case where file system access is an
     *             issue
     */
    public static String platformPath(String inputPath) {
        inputPath = inputPath.replace('/', File.separatorChar).replace('\\', File.separatorChar);
        StringBuffer resultPath = new StringBuffer();
        for (StringTokenizer stringTokenizer = new StringTokenizer(inputPath, ";"); stringTokenizer.hasMoreTokens();) {
            String pathDir = stringTokenizer.nextToken();
            File f = new File(pathDir);
            try {
                resultPath.append(f.getCanonicalPath());
            } catch (IOException e) {
                System.out.println("WARNING: Could not get system file context.");
                resultPath.append(pathDir);
            }
            if (stringTokenizer.hasMoreTokens()) {
                resultPath.append(File.pathSeparator);
            }
        }
        return resultPath.toString();
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public SContext getContext() {
        return context;
    }

    public void setContext(SContext context) {
        this.context = context;
    }

    public void reset() {
        context = null;
        fileURI = null;
        resource = null;
    }

    public URI getFileURI() {
        return fileURI;
    }

    public void setFileURI(URI fileURI) {
        this.fileURI = fileURI;
        // set resource to null so that it will not be imrpoperly reused..
        resource = null;
    }

    public void setFilePath(String path) throws IOException {
        setFile(new File(platformPath(path)));
    }

    public void setFile(File file) throws IOException {
        setFileURI(URI.createFileURI(file.getCanonicalPath()));
    }
}
