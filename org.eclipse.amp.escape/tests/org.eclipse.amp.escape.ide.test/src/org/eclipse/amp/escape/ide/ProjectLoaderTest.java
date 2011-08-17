package org.eclipse.amp.escape.ide;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.junit.Test;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleException;

/**
 * JUnit plugin test.
 * 
 * @author jonas.ruettimann
 */
public class ProjectLoaderTest {

	/**
	 * Default manifest file. No optional dependencies, no re-exported
	 * dependencies. Just standard.
	 * 
	 * @throws IllegalStateException
	 * @throws FileNotFoundException
	 * @throws BundleException
	 * @throws IOException
	 */
	@Test
	public void testReadDependencies() throws IllegalStateException, FileNotFoundException, BundleException, IOException {
		List<Bundle> dependencies = ProjectLoader.readDependencies(getInputStream("defaultManifest.MF"));
		assertEquals(8, dependencies.size());
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.core.resources")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.core.runtime")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.jface")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.ui.views")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.ui.ide")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.jdt.debug.ui")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.core.expressions")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.jdt.launching")));
	}

	/**
	 * Optional bundles should be returned if they are available.
	 * 
	 * @throws IllegalStateException
	 * @throws FileNotFoundException
	 * @throws BundleException
	 * @throws IOException
	 */
	@Test
	public void testReadDependencies_optionalBundles() throws IllegalStateException, FileNotFoundException, BundleException, IOException {
		List<Bundle> dependencies = ProjectLoader.readDependencies(getInputStream("optionalBundles.MF"));
		assertEquals(8, dependencies.size());
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.core.resources")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.core.runtime")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.jface")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.ui.views")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.ui.ide")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.jdt.debug.ui")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.core.expressions")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.jdt.launching")));
	}

	/**
	 * The "org.antlr.gen" bundle is optional but not available! It should not
	 * occur in the list! Besides, some re-exported dependencies should not cause
	 * any problems.
	 * 
	 * @throws IllegalStateException
	 * @throws FileNotFoundException
	 * @throws BundleException
	 * @throws IOException
	 */
	@Test
	public void testReadDependencies_bundleUnavalilableButOptional() throws IllegalStateException, FileNotFoundException, BundleException, IOException {
		List<Bundle> dependencies = ProjectLoader.readDependencies(getInputStream("bundleUnavalilableButOptional.MF"));
		assertEquals(8, dependencies.size());
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.core.resources")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.core.runtime")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.jface")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.ui.views")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.ui.ide")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.jdt.debug.ui")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.core.expressions")));
		assertTrue(dependencies.contains(Platform.getBundle("org.eclipse.jdt.launching")));
	}

	/**
	 * The "org.antlr.gen" bundle is not available but necessary! An Exception
	 * expected to be thrown!
	 * 
	 * 
	 * @throws IllegalStateException
	 * @throws FileNotFoundException
	 * @throws BundleException
	 * @throws IOException
	 */
	@Test(expected = IllegalStateException.class)
	public void testReadDependencies_bundleUnavailableButNecessary() throws IllegalStateException, FileNotFoundException, BundleException, IOException {
		ProjectLoader.readDependencies(getInputStream("bundleUnavailableButNecessary.MF"));
	}

	private InputStream getInputStream(String fileName) throws IOException{
		URL[] url = FileLocator.findEntries(EscapeIDEPlugin.getDefault().getBundle(), new Path("testFiles/"+fileName));
		assert url.length == 1 : "Es wurde nicht genau einen Pfad gefunden. Erwartet wurde der Pfad für das:testFiles/" + fileName;
		return url[0].openStream();
	}
}
