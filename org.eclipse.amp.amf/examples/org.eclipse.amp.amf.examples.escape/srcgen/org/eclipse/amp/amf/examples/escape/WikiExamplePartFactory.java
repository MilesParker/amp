package org.eclipse.amp.amf.examples.escape;

import org.ascape.model.HostCell;
import org.eclipse.amp.escape.ascape.adapt.AscapePartFactory;
import org.eclipse.gef.EditPart;
import org.eclipse.amp.escape.ascape.gef.DefaultHostCellEditPart;

public class WikiExamplePartFactory extends AscapePartFactory {

	protected EditPart getPartForElement(Object model) {

		if (model instanceof Individual) {
			return new org.eclipse.amp.amf.examples.escape.SimpleDraw();
		}

		return super.getPartForElement(model);
	}
}
