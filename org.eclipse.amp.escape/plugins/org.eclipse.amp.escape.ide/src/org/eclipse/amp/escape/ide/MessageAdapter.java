/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
 */
package org.eclipse.amp.escape.ide;

import org.ascape.view.nonvis.IMessageStream;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

// TODO: Auto-generated Javadoc
/**
 * The Class MessageAdapter.
 */
public class MessageAdapter implements IMessageStream {
    private MessageConsoleStream stream;

    /**
     * Instantiates a new message adapter.
     * 
     * @param eclipseConsole the eclipse console
     */
    public MessageAdapter(MessageConsole eclipseConsole) {
        stream = eclipseConsole.newMessageStream();
    }

    /**
     * 
     * @see org.ascape.view.nonvis.IMessageStream#print(java.lang.String)
     */
    public void print(String message) {
        stream.print(message);
    }

    /**
     * 
     * @see org.ascape.view.nonvis.IMessageStream#println()
     */
    public void println() {
        stream.println();
    }

    /**
     * 
     * @see org.ascape.view.nonvis.IMessageStream#println(java.lang.String)
     */
    public void println(String message) {
        stream.println(message);
    }
}
