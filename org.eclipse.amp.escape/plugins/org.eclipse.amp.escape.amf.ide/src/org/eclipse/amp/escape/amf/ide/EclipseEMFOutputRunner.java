package org.eclipse.amp.escape.amf.ide;

import java.util.ArrayList;

import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.amp.escape.view.FileEMFSimDataCollector;
import org.eclipse.core.resources.IResource;
import org.metaabm.SContext;

final class EclipseEMFOutputRunner extends EclipseEscapeRunner {
	/**
	 * 
	 */
	private SContext model;

	private IResource resource;

	private AParInterpreter aParInterpreter;

	public EclipseEMFOutputRunner(SContext model, IResource resource,
			AParInterpreter aParInterpreter) {
		super();
		assert(resource != null);
		assert(model != null);
		this.model = model;
		this.resource = resource;
		this.aParInterpreter = aParInterpreter;
	}

	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @see org.ascape.runtime.Runner#run()
	 */
	@Override
	public synchronized void run() {
		boolean found = false;
		ArrayList scapeListeners = new ArrayList(getScape().getScapeListeners());
		for (Object l : scapeListeners) {
			if (l instanceof FileEMFSimDataCollector) {
				found = true;
				break;
			}
		}
		if (!found) {
			getScape().addView(new FileEMFSimDataCollector(resource, model));
		}
		super.run();
	}

	/**
	 * @param args
	 * @param block
	 * @see org.ascape.runtime.Runner#openImplementation(java.lang.String[],
	 *      boolean)
	 */
	@Override
	public void openImplementation(String[] args, boolean block) {
		if (aParInterpreter != null) {
			aParInterpreter.assignValues(new Object[] { getRootScape(), this },
					null);
		}
		super.openImplementation(args, block);
	}
}