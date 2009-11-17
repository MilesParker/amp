package org.eclipse.amp.amf.examples.escape;
public class WikiExamplePartFactory
		extends
			org.eclipse.amp.escape.ascape.adapt.AscapePartFactory {

	protected org.eclipse.gef.EditPart getPartForElement(Object model) {

		if (model instanceof Individual) {
			return new org.eclipse.amp.amf.examples.escape.SimpleDraw();
		}

		return super.getPartForElement(model);
	}
}
