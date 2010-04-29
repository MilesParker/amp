package org.metaabm.gen.test;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.runner.JUnitCore;

public class AllBasicModelTests extends TestCase{
    private List<Class> testClasses = new ArrayList<Class>();

    public void testClasses() {
        addTestClass("org.metaabm.gen.test.BasicModel");
        JUnitCore.runClasses(testClasses.toArray(new Class[] {}));
    }

    private void addTestClass(String className) {
        try {
            testClasses.add(Class.forName(className));
        } catch (ClassNotFoundException e) {
            fail("Couldn't load class: ");
        }
    }
}
