package org.eclipse.amp.amf.sd.gen.builder;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
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
		cleanOutProjectDir("bin");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		cleanOutProjectDir("bin");
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
		BufferedInputStream stream = null;
		try {
			stream = new BufferedInputStream(new FileInputStream(path));
			stream.read(buffer);
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e) {
					// Ignore closing exception.
				}
			}
		}
		return new String(buffer);
	}

	protected void writeToFile(String contents, String relativePath) throws IOException {
		FileWriter writer = new FileWriter(getProjectFilePath(relativePath));
		writer.write(contents);
		writer.flush();
		writer.close();
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
			File file = new File(getProjectFilePath(generatedFile));
			assertTrue(file.exists());
		}
	}

	/**
	 * Remove all entries of a directory. The directory itself will not be
	 * deleted. If it doesn't exist, it will be created.
	 * 
	 * @param relativePath
	 */
	protected void cleanOutProjectDir(String relativePath) {
		String absolutePath = getProjectFilePath(relativePath);
		File dir = new File(absolutePath);
		if (!dir.exists()) {
			assert dir.mkdir() : "Directory could not be created: " + dir;
		}
		assert delete(dir, false) : "Directory could not be cleaned out: " + dir;
	}

	protected String getProjectFilePath(String relativePath) {
		return SDActivator.getAbsoluteDir(TEST_PROJECTS_DIR + project.getName()) + relativePath;
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
		if (!file.exists()) {
			return true;
		}

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
