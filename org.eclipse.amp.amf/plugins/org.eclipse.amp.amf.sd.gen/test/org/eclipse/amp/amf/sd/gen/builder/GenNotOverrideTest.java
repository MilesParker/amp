package org.eclipse.amp.amf.sd.gen.builder;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;

/**
 * After code generation, existing Java files and the generated ones should be merged. Not simply overwritten. This test
 * class should make sure this happens.
 * <p/>
 * Usually, you'll need to increase PermGenSpace to run this test! Use <code>-XX:MaxPermSize=128m</code> as VM argument.
 * 
 * @author ruj
 */
public class GenNotOverrideTest extends AbstractJavaSDTest {

	private static final String MODEL_JAVA_FILE = "/srcgen/GenNotOverride/myagent_SD/SDModel.java";

	public GenNotOverrideTest() throws Exception {
		super("GenNotOverride");
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		emptyProjectDir("bin");

		doGenerate("/bin/GenNotOverride/myagent_SD/SDModel.class");
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		emptyProjectDir("bin");
	}

	/**
	 * Methods with "generated NOT" annotations must <emph>not</emph> be overwritten by the code generator.
	 * 
	 * @throws IOException
	 * @throws CoreExceptionl
	 */
	public void testCheckNotOverride() throws IOException, CoreException {
		String text = getFileText(MODEL_JAVA_FILE);
		assertTrue("Code generator did not merge constructor body correctly.", text.contains("int a = 0;"));
		assertTrue("Code generator did not merge constructor body correctly.", text.contains("// This part should not be overwritten by the generator!"));
		checkNoCompilationErrors(MODEL_JAVA_FILE);
	}

}
