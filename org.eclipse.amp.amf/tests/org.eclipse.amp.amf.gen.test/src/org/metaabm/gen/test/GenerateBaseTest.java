package org.metaabm.gen.test;

import org.junit.Test;
import org.metaabm.gen.test.share.AbstractGenerateBaseTest;

public class GenerateBaseTest extends AbstractGenerateBaseTest {

    @Test
    public void testGenerate() {
        executeGeneration("org.eclipse.amp.amf.gen.test", AbstractGenerateBaseTest.BASE_ACT_MOVE_MODEL_NAMES,
                          AbstractGenerateBaseTest.BASE_ACT_MOVE_CLASS_NAMES);
    }

}