package org.eclipse.amp.axf.ide;

import static org.junit.Assert.fail;

import org.ascape.model.Scape;
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.view.ModelInput;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.junit.Before;
import org.junit.Test;

public class ModelViewManagerTest {

	private ModelViewManager classToTest;

	private DummyModelInput modelInput;

	@Before
	public void setUp() throws Exception {
		classToTest = ModelViewManager.createNewInstance();
		EclipseEscapeRunner runner = new EclipseEscapeRunner() {

			@Override
			public void close() {
				//
			}
		};
		SimpleModel model = new SimpleModel(new Scape());
		model.engine = runner;
		classToTest.register(model, runner);
		modelInput = new DummyModelInput(model);
	}

	/**
	 * The method should also be callable if the main {@link Thread} is the caller
	 * Bug: The Application has a deadlock if the main {@link Thread} calls the
	 * method
	 */
	@Test
	public void testCreateViewPart() {
		ObserverThread thread = new ObserverThread();
		thread.mainThread = Thread.currentThread();
		thread.start();
		classToTest.createViewPart(EmptyView.VIEW_ID, modelInput, "empty view");
		if (thread.mainThreadInterrupted) {
			fail("Deadlock in createViewPart?");
		}
		thread.interrupt();
	}

	private class ObserverThread extends Thread {

		Thread mainThread;

		boolean mainThreadInterrupted = false;

		public ObserverThread() {
			//
		}

		@Override
		public void run() {
			try {
				sleep(10000);
				mainThreadInterrupted = true;
				mainThread.interrupt();
			} catch (InterruptedException e) {
				//
			}
		}
	}

	private class SimpleModel extends ScapeWrapperModel implements IModel {

		IEngine engine;

		public SimpleModel(Scape scape) {
			super(scape);
		}

		@Override
		public IEngine getEngine() {
			return engine;
		}

	}

	private class DummyModelInput extends ModelInput {

		public DummyModelInput(IModel model) {
			super(model);
		}

	}
}
