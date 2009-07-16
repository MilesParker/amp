package org.metaabm.gen.test;

public class GenerateBaseTest extends AbstractGenerateBaseTest {

    public void testGenerate() {
        executeGeneration("org.eclipse.amp.amf.gen.test.target", "", AbstractGenerateBaseTest.BASE_ACT_MOVE_MODEL_NAMES, AbstractGenerateBaseTest.BASE_ACT_MOVE_CLASS_NAMES);
    }
}
