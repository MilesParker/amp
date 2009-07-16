package org.metaabm.gen.repast.test;

import org.metaabm.gen.test.share.AbstractGenerateBaseTest;

public class GenerateRepastTest extends AbstractGenerateBaseTest {

    // NOTE: in order for these tests to run correctly currently it is
    // Necessary to run them w/on a pre-prepared
    // workspace with the appropriate projects already loaded.
    public void testGenerate() {
        executeGeneration("org.eclipse.amp.amf.gen.repast.test", AbstractGenerateBaseTest.BASE_ACT_MOVE_MODEL_NAMES,
                        AbstractGenerateBaseTest.BASE_ACT_MOVE_CLASS_NAMES);
    }
}
