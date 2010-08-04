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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.StringTokenizer;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

// TODO: Auto-generated Javadoc
/**
 * The Class ParameterReader.
 */
public class ParameterReader {

    String projectName;

    IProject project;

    IPath paramPath;

    IFile eclipseFile;

    String rootPathString;

    /**
     * Instantiates a new parameter reader.
     * 
     * @param resource the resource
     */
    public ParameterReader(IResource resource) {
        this(resource.getProject(), resource.getProjectRelativePath());
        this.eclipseFile = (IFile) resource;
    }

    /**
     * The Constructor.
     * 
     * @param project the project
     * @param paramPath the param path
     */
    public ParameterReader(IProject project, IPath paramPath) {
        super();
        this.paramPath = paramPath;
        this.project = project;
        paramPath = makeRelativeTo(paramPath, project.getLocation());
        this.eclipseFile = project.getFile(paramPath);
        if (!this.eclipseFile.exists()) {
            throw new RuntimeException("No file exists at path: " + paramPath + " in " + project);
        }
        rootPathString = project.getLocation().addTrailingSeparator().toOSString();
    }

    /**
     * Instantiates a new parameter reader.
     * 
     * @param projectName the project name
     * @param path the path
     */
    public ParameterReader(String projectName, String path) {
        this.paramPath = new Path(path);
        this.projectName = projectName;
        File file = new File(paramPath.toOSString());
        if (!file.exists()) {
            throw new RuntimeException("No file exists at system path: " + file);
        }
        int projectSegment = 0;
        for (String segment : paramPath.segments()) {
            if (segment.equals(projectName)) {
                break;
            }
            projectSegment++;
        }
        rootPathString = paramPath.uptoSegment(projectSegment + 1).toOSString() + File.separator;
    }

    private static final Set<String> keywords = new HashSet<String>();

    static {
        keywords.add("model");
        keywords.add("experiment");
        keywords.add("comments");
    }

    // From Eclipse 3.5
    /**
     * Matching first segments.
     * 
     * @param target the target
     * @param anotherPath the another path
     * 
     * @return the int
     */
    public static int matchingFirstSegments(IPath target, IPath anotherPath) {
        Assert.isNotNull(anotherPath);
        int anotherPathLen = anotherPath.segmentCount();
        int max = Math.min(target.segments().length, anotherPathLen);
        int count = 0;
        for (int i = 0; i < max; i++) {
            if (!target.segments()[i].equals(anotherPath.segment(i))) {
                return count;
            }
            count++;
        }
        return count;
    }

    /**
     * Make relative to.
     * 
     * @param target the target
     * @param base the base
     * 
     * @return the i path
     */
    public static IPath makeRelativeTo(IPath target, IPath base) {
        int commonLength = matchingFirstSegments(target, base);
        IPath newPath = new Path("");
        for (int i = 0; i < base.segmentCount() - commonLength; i++) {
            newPath = newPath.append("../");
        }
        for (int i = commonLength; i < target.segmentCount(); i++) {
            newPath = newPath.append(target.segments()[i]);
        }
        return newPath;
    }

    private BufferedReader createReader() {
        InputStream is = null;
        try {
            if (eclipseFile != null) {
                is = eclipseFile.getContents();
            } else {
                String directFilePath = paramPath.toPortableString();
                try {
                    File inputFile = new File(directFilePath);
                    is = new FileInputStream(inputFile);
                } catch (IOException e) {
                    throw new RuntimeException("Couldn't read model file: " + directFilePath, e);
                }
            }
        } catch (CoreException e) {
            throw new RuntimeException("Couldn't read model file: " + eclipseFile.getFullPath(), e);
        }
        return new BufferedReader(new InputStreamReader(is));
    }

    /**
     * Gets the relative.
     * 
     * @param newPath the new path
     * 
     * @return the relative
     */
    public ParameterReader getRelative(IPath newPath) {
        if (project != null) {
            return new ParameterReader(project, newPath);
        } else {
            return new ParameterReader(projectName, newPath.toOSString());
        }
    }

    /**
     * Gets the incorporated.
     * 
     * @param filePath the file path
     * 
     * @return the incorporated
     */
    public IPath getIncorporated(IPath filePath) {
        if (!filePath.isAbsolute()) {
            IPath curentPath = paramPath.removeLastSegments(1);
            filePath = curentPath.append(filePath);
        }
        filePath = filePath.addFileExtension("apar");
        return filePath;
    }

    /**
     * Gets the tested.
     * 
     * @return the tested
     */
    public ParameterReader getTested() {
        IPath testPath = null;
        try {
            BufferedReader reader = createReader();
            String next = reader.readLine();
            while (next != null) {
                if (next.startsWith("tests")) {
                    testPath = new Path(next.substring(6, next.length()));
                    testPath = getIncorporated(testPath);
                    break;
                }
                next = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Couldn't read model file: " + e);
        }
        if (testPath == null) {
            testPath = paramPath.removeFileExtension().addFileExtension("apar");
        }
        return getRelative(testPath);
    }

    /**
     * Pvs from file.
     * 
     * @return the list< param value>
     */
    public List<ParamValue> pvsFromFile() {
        List<ParamValue> pvs = new ArrayList<ParamValue>();
        BufferedReader reader = createReader();
        String next;
        try {
            next = reader.readLine();
            while (next != null) {
                StringTokenizer t = new StringTokenizer(next, "\t");
                try {
                    String param = t.nextToken();
                    String value = t.nextToken();
                    value = StringUtils.replace(value, "|", rootPathString);
                    if (param.equals("incorporates")) {
                        IPath incorporatePath = new Path(value);
                        incorporatePath = getIncorporated(incorporatePath);
                        pvs = mergePV(pvs, getRelative(incorporatePath).pvsFromFile());
                    } else {
                        ParamValue pv = new ParamValue(param, value);
                        pvs.add(pv);
                    }
                } catch (NoSuchElementException e) {
                    System.out.println("Ignoring line: " + next);
                }
                next = reader.readLine();
            }
            return pvs;
        } catch (IOException ioe) {
            throw new RuntimeException("Problem reading file.", ioe);
        }
    }

    /**
     * Gets the constraints.
     * 
     * @return the constraints
     */
    public List<ExpectedValue> getConstraints() {
        List<ExpectedValue> args = new ArrayList<ExpectedValue>();
        BufferedReader reader = createReader();
        String next;
        try {
            next = reader.readLine();
            while (next != null) {
                try {
                    StringTokenizer t = new StringTokenizer(next, "\t");
                    ExpectedValue ev = new ExpectedValue(t.nextToken(), t.nextToken(), t.nextToken());
                    args.add(ev);
                } catch (NoSuchElementException e) {
                    System.out.println("Ignoring line: " + next);
                }
                next = reader.readLine();
            }
        } catch (IOException e1) {
            throw new RuntimeException(e1);
        }
        return args;
    }

    /**
     * Arg from pv.
     * 
     * @param pv the pv
     * 
     * @return the string
     */
    static String argFromPV(ParamValue pv) {
        return pv.param.replaceAll(" ", "") + "=" + pv.value;
    }

    /**
     * Args from pv.
     * 
     * @param pvArgs the pv args
     * 
     * @return the string[]
     */
    public static String[] argsFromPV(List<ParamValue> pvArgs) {
        List<String> args = new ArrayList<String>();
        for (ParamValue pv : pvArgs) {
            if (!keywords.contains(pv.param)) {
                args.add(argFromPV(pv));
            }
        }
        return args.toArray(new String[0]);
    }

    /**
     * Merge pv.
     * 
     * @param pv1 the pv1
     * @param pv2 the pv2
     * 
     * @return the list< param value>
     */
    public static List<ParamValue> mergePV(List<ParamValue> pv1, List<ParamValue> pv2) {
        List<ParamValue> args = new ArrayList<ParamValue>();
        Set<String> overrides = new HashSet<String>();
        for (ParamValue pv : pv2) {
            overrides.add(pv.param);
        }
        for (ParamValue pv : pv1) {
            if (!overrides.contains(pv.param)) {
                args.add(pv);
            }
        }
        for (ParamValue pv : pv2) {
            args.add(pv);
        }
        return args;
    }

    /**
     * Model class name from file.
     * 
     * @return the string
     */
    public String modelClassNameFromFile() {
        List<ParamValue> pvs = pvsFromFile();
        return valueForParam(pvs, "model");
    }

    /**
     * Title from file.
     * 
     * @return the string
     */
    public String titleFromFile() {
        List<ParamValue> pvs = pvsFromFile();
        String name = valueForParam(pvs, "title");
        if (name == null) {
            name = paramPath.removeFileExtension().lastSegment();
        }
        if (name == null) {
            throw new RuntimeException("Couldn't determine run title.");
        }
        return name;
    }

    /**
     * Value for param.
     * 
     * @param pvs the pvs
     * @param paramName the param name
     * 
     * @return the string
     */
    public String valueForParam(List<ParamValue> pvs, String paramName) {
        for (ParamValue pv : pvs) {
            if (pv.param.equalsIgnoreCase(paramName)) {
                return pv.value;
            }
        }
        return null;
    }

    /**
     * Gets the name.
     * 
     * @return the name
     */
    public String getName() {
        return getParamPath().removeFileExtension().lastSegment();
    }

    /**
     * Gets the project.
     * 
     * @return the project
     */
    public IProject getProject() {
        return project;
    }

    /**
     * Gets the param path.
     * 
     * @return the param path
     */
    public IPath getParamPath() {
        return paramPath;
    }

    /**
     * Gets the file.
     * 
     * @return the file
     */
    public IFile getFile() {
        return eclipseFile;
    }

    /**
     * Gets the project name.
     * 
     * @return the project name
     */
    public String getProjectName() {
        return projectName;
    }
}
