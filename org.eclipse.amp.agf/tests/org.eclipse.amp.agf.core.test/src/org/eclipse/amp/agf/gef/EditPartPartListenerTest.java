package org.eclipse.amp.agf.gef;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.gef.RootEditPart;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartReference;
import org.junit.Before;
import org.junit.Test;

public class EditPartPartListenerTest {

	private EditPartPartListener classToTest;

	private MockViewPart viewPart;

	private SimpleWorkbenchPartRef ref;

	@Before
	public void setUp() throws Exception {
		ref = new SimpleWorkbenchPartRef();
		viewPart = new MockViewPart();
		classToTest = new EditPartPartListener(viewPart);
	}

	/**
	 * The refresh should only be done if the id is equal
	 */
	@Test
	public void testPartActivated() {
		classToTest.partActivated(ref);
		assertTrue(viewPart.refreshed);

		viewPart.refreshed = false;
		viewPart.id = "ww";
		classToTest.partActivated(ref);
		assertFalse(viewPart.refreshed);
	}

	/**
	 * The listener should be detached on closing the view
	 */
	@Test
	public void testPartClosed() {
		classToTest.partClosed(ref);
		assertTrue(viewPart.removed);

		viewPart.removed = false;
		viewPart.id = "WW";
		classToTest.partClosed(ref);
		assertFalse(viewPart.removed);
	}

	private class MockViewPart extends EditPartViewPart {

		boolean refreshed = false;

		boolean removed = false;

		String id = "partId";

		public MockViewPart() {
			//
		}

		@Override
		public RootEditPart createRoot() {
			return null;
		}

		@Override
		protected void refresh() {
			refreshed = true;
		}

		@Override
		protected String getId() {
			return id;
		}

		@Override
		protected void removePartListener(IPartListener2 lis) {
			removed = true;
		}

	}

	private class SimpleWorkbenchPartRef implements IWorkbenchPartReference {

		public SimpleWorkbenchPartRef() {
			//
		}

		public IWorkbenchPart getPart(boolean restore) {
			return null;
		}

		public String getTitle() {
			return null;
		}

		public Image getTitleImage() {
			return null;
		}

		public String getTitleToolTip() {
			return null;
		}

		public String getId() {
			return "partId";
		}

		public void addPropertyListener(IPropertyListener listener) {
			//
		}

		public void removePropertyListener(IPropertyListener listener) {
			//
		}

		public IWorkbenchPage getPage() {
			return null;
		}

		public String getPartName() {
			return null;
		}

		public String getContentDescription() {
			return null;
		}

		public boolean isDirty() {
			return false;
		}

		public String getPartProperty(String key) {
			return null;
		}

		public void addPartPropertyListener(IPropertyChangeListener listener) {
			//
		}

		public void removePartPropertyListener(IPropertyChangeListener listener) {
			//
		}
	}
}
