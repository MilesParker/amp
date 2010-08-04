/**
 * 
 */
package org.metaabm.gen.test.share;

import org.eclipse.core.runtime.NullProgressMonitor;

public class LockMonitor extends NullProgressMonitor {

    boolean doneFlag = false;

    public void done() {
        synchronized (this) {
            super.done();
            doneFlag = true;
        }
    }

    public void reset() {
        doneFlag = false;
    }

    public void block() {
        while (!doneFlag) {
            try {
                Thread.currentThread().wait(10);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void blockContinue() {
        block();
        reset();
    }

    protected boolean isDoneFlag() {
        return doneFlag;
    }
}