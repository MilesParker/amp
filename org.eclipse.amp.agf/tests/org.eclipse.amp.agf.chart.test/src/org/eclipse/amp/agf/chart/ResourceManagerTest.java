package org.eclipse.amp.agf.chart;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.eclipse.amp.agf.chart.ChartEditPart.ResourceManager;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ResourceManagerTest {

	private ResourceManager classToTest;

	private Shell shell;

	@Before
	public void setUp() throws Exception {
		shell = new Shell();
		classToTest = new ChartEditPart().getResourceManager();
	}

	@After
	public void tearDown() {
		shell.dispose();
	}

	/**
	 * Will the old {@link GC} be disposed? Can we use <code>null</code> to
	 * dispose the {@link GC}?
	 */
	@Test
	public void testSetGc() {
		GC gc = new GC(shell);
		assertFalse(gc.isDisposed());

		classToTest.setGc(gc);
		assertFalse(gc.isDisposed());

		GC gc2 = new GC(shell);
		classToTest.setGc(gc2);
		assertTrue(gc.isDisposed());
		assertFalse(gc2.isDisposed());

		try {
			classToTest.setGc(null);
			assertTrue(gc2.isDisposed());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	/**
	 * Will the old {@link Image} be disposed? Can we use <code>null</code> to
	 * dispose the {@link Image}?
	 */
	@Test
	public void testSetImage() {
		Image image = new Image(Display.getCurrent(), 10, 10);
		assertFalse(image.isDisposed());

		classToTest.setImage(image);
		assertFalse(image.isDisposed());

		Image image2 = new Image(Display.getCurrent(), 10, 10);
		classToTest.setImage(image2);
		assertTrue(image.isDisposed());
		assertFalse(image2.isDisposed());

		try {
			classToTest.setImage(null);
			assertTrue(image2.isDisposed());
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}
