package org.eclipse.amp.amf.sd.gen.builder;

import java.io.IOException;

import org.eclipse.core.runtime.CoreException;

/**
 * After code generation, existing Java files and the generated ones should be
 * merged. Not simply overwritten. This test class should make sure this
 * happens.
 * <p/>
 * Usually, you'll need to increase PermGenSpace to run this test! Use
 * <code>-XX:MaxPermSize=128m</code> as VM argument.
 * 
 * @author jonas.ruettimann
 */
public class GenNotOverrideTest extends AbstractJavaSDTest {

	/**
	 * This comment was entered manually into the {@link #MODEL_JAVA_FILE}. It
	 * should remain in the constructor, since we've declared it \"@generated
	 * NOT\".
	 */
	private static final String PRESERVE_KEYPHRASE_A = "// This part should not be overwritten by the generator!";

	private static final String PRESERVE_KEYPHRASE_B = "int a = 0;";

	private static final String OVERWRITE_KEYPHRASE = "// This comment should be overwritten when running the generator.";

	private static final String GENERATED = "@generated";

	private static final String GENERATED_NOT = GENERATED + " NOT";

	private static final String MODEL_JAVA_FILE = "/srcgen/GenNotOverride/my_SD/SDModel.java";

	public GenNotOverrideTest() throws Exception {
		super("GenNotOverride");
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		cleanOutProjectDir("srcgen");

		doGenerate(MODEL_JAVA_FILE, "/bin/GenNotOverride/my_SD/SDModel.class");

		addManualChangesToGeneratedFile();

		// Generate with merge:
		doGenerate(MODEL_JAVA_FILE, "/bin/GenNotOverride/my_SD/SDModel.class");
	}

	/**
	 * Add some manual changes to the file to be able to test merge. Basically,
	 * we'll add some lines of code in "generated" and in "generated NOT" methods.
	 * 
	 * @throws IOException
	 */
	private void addManualChangesToGeneratedFile() throws IOException {
		String original = getFileText(MODEL_JAVA_FILE);
		assert !original.contains(PRESERVE_KEYPHRASE_A);
		assert !original.contains(PRESERVE_KEYPHRASE_B);
		assert !original.contains(OVERWRITE_KEYPHRASE);

		String[] sdModelJava = original.split(GENERATED);

		StringBuilder changed = new StringBuilder();
		changed.append(sdModelJava[0]);
		changed.append(GENERATED);
		changed.append(sdModelJava[1]);

		// Turn generated-method into a generated-NOT method:
		changed.append(GENERATED_NOT);
		changed.append(sdModelJava[2].replaceFirst("\\{", "{\r\n		" + PRESERVE_KEYPHRASE_A + "\r\n		" + PRESERVE_KEYPHRASE_B));

		// Add a manual code changes into a generated-method:
		for (int i = 3; i < sdModelJava.length; i++) {
			changed.append(GENERATED);
			if (i == 5) { // Just pick any generated-method:
				changed.append(sdModelJava[i].replaceFirst("\\{", "{\r\n		" + OVERWRITE_KEYPHRASE));
			} else {
				changed.append(sdModelJava[i]);
			}
		}

		writeToFile(changed.toString(), MODEL_JAVA_FILE);

		assert changed.toString().contains(PRESERVE_KEYPHRASE_A);
		assert changed.toString().contains(PRESERVE_KEYPHRASE_B);
		assert changed.toString().contains(OVERWRITE_KEYPHRASE);
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		cleanOutProjectDir("srcgen");
	}

	/**
	 * Methods with "generated NOT" annotations must <emph>not</emph> be
	 * overwritten by the code generator.
	 * 
	 * @throws IOException
	 * @throws CoreException
	 */
	public void testDontOverwriteGeneratedNOT() throws IOException, CoreException {
		String text = getFileText(MODEL_JAVA_FILE);
		assertTrue("Code generator did not merge constructor body correctly.", text.contains(PRESERVE_KEYPHRASE_A));
		assertTrue("Code generator did not merge constructor body correctly.", text.contains(PRESERVE_KEYPHRASE_B));
		checkNoCompilationErrors(MODEL_JAVA_FILE);
	}

	/**
	 * Will a generated method completely be overwritten when regenerating code?
	 * 
	 * @throws IOException
	 * @throws CoreException
	 */
	public void testOverwriteGenerated() throws IOException, CoreException {
		String text = getFileText(MODEL_JAVA_FILE);
		assertFalse("The method has a \"generated\" tag but was not overwritten.", text.contains(OVERWRITE_KEYPHRASE));
		checkNoCompilationErrors(MODEL_JAVA_FILE);
	}
}
