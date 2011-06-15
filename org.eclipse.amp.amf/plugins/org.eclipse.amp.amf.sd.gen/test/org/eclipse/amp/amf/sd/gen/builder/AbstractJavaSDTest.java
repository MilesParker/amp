package org.eclipse.amp.amf.sd.gen.builder;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.amp.amf.sd.gen.SDActivator;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;

public abstract class AbstractJavaSDTest extends TestCase {
	private static final String TEST_PROJECTS_DIR = "testProject/";

	private IProject project;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		emptyProjectDir("bin");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		emptyProjectDir("bin");
	}

	protected AbstractJavaSDTest(String projectName) throws Exception {
		IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(new Path(SDActivator.getAbsoluteDir(TEST_PROJECTS_DIR + projectName) + ".project"));
		project = ResourcesPlugin.getWorkspace().getRoot().getProject(description.getName());
		if (!project.exists()) {
			project.create(description, null);
			project.open(null);
		}
	}

	/**
	 * @param fileName
	 * @return number of "@generated" tags in the file
	 * @throws IOException
	 */
	protected int countGeneratedTags(String fileName) throws IOException {
		String text = getFileText(fileName);
		int retValue = 0;
		String searchString = "* @generated";
		int foundIndex = text.indexOf(searchString);
		while (foundIndex > -1) {
			retValue++;
			text = text.substring(foundIndex + searchString.length());
			foundIndex = text.indexOf(searchString);
		}
		return retValue;
	}

	/**
	 * Check for errors in compiler result.
	 * 
	 * @param resourceName
	 * @throws CoreException
	 */
	protected void checkNoCompilationErrors(String resourceName) throws CoreException {
		IResource resource = project.getFile(resourceName);
		assertTrue(resource.exists());

		IMarker[] markers = resource.findMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);
		for (IMarker tmp : markers) {
			assertFalse(tmp.getAttribute(IMarker.SEVERITY).equals(IMarker.SEVERITY_ERROR));
		}
	}

	/**
	 * @param fileName
	 * @return the contents of a text file as {@link String}
	 * @throws IOException
	 */
	protected String getFileText(String relativePath) throws IOException {
		String path = getProjectFilePath(relativePath);
		byte[] buffer = new byte[(int) new File(path).length()];
		BufferedInputStream f = null;
		try {
			f = new BufferedInputStream(new FileInputStream(path));
			f.read(buffer);
		} finally {
			if (f != null) {
				try {
					f.close();
				} catch (IOException e) {
					// Ignore closing exception.
				}
			}
		}
		return new String(buffer);
	}

	/**
	 * @param expectedFiles
	 *          files that are expected to be generated
	 * @throws Exception
	 */
	protected void doGenerate(String... expectedFiles) throws Exception {
		project.deleteMarkers(IMarker.PROBLEM, true, IResource.DEPTH_INFINITE);

		JobFinishedIndicator clean = new JobFinishedIndicator();
		project.build(IncrementalProjectBuilder.CLEAN_BUILD, clean);
		while (!clean.jobIsFinished()) {
			Thread.sleep(10);
		}

		JobFinishedIndicator fullBuild = new JobFinishedIndicator();
		project.build(IncrementalProjectBuilder.FULL_BUILD, fullBuild);
		while (!fullBuild.jobIsFinished()) {
			Thread.sleep(10);
		}

		// Check if generated files exist:
		for (String generatedFile : expectedFiles) {
			assertNotNull(getProjectFilePath(generatedFile));
		}
	}

	/**
	 * Remove all entries of a directory. The directory itself will not be
	 * deleted.
	 * 
	 * @param relativePath
	 * @return <code>true</code> if successful
	 */
	protected boolean emptyProjectDir(String relativePath) {
		String dir = getProjectFilePath(relativePath);
		if (dir != null) {
			return delete(new File(dir), false);
		}
		return true;
	}

	protected String getProjectFilePath(String relativePath) {
		return SDActivator.getAbsoluteDir(TEST_PROJECTS_DIR + project.getName() + "/" + relativePath);
	}

	/**
	 * Delete a file or or folder. In case of a directory, all entries need to be
	 * deleted first.
	 * 
	 * @param file
	 *          a file or a directory
	 * @return <code>true</code> if deletion was successful
	 */
	private boolean delete(File file, boolean deleteRoot) {
		if (file.isDirectory()) {
			for (File child : file.listFiles()) {
				if (!delete(child, true)) {
					return false;
				}
			}
		}

		if (!deleteRoot) {
			return true;
		}

		return file.delete();
	}

}

class JobFinishedIndicator extends NullProgressMonitor {
	private boolean done = false;

	@Override
	public void done() {
		done = true;
	}

	public boolean jobIsFinished() {
		return done || isCanceled();
	}
}
