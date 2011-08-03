package org.eclipse.amp.escape.runtime.extension;

import java.util.List;

/**
 * Interface for simple contexts that can have children that are not covered by Scape mechanism. Supports SD and model extensions.
 * TODO Integrate with the ICompositionProvider construct
 * @milesparker
 */
public interface IAgentChildProvider {
	List<IAgentChild> getChildren();
}
