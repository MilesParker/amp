
package org.eclipse.amp.amf.testing;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ATestStandaloneSetup extends ATestStandaloneSetupGenerated{

	public static void doSetup() {
		new ATestStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

