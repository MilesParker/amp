package org.metaabm.gen.test;


public class OperationsAgentManualTest extends AgentTestCase {

    public void testSimpleCondition() {
        agent.testSimpleCondition();
        assertEquals(agent.getFloat1p8(), 20.0);
        assertEquals(agent.getFloat20(), 3.0);
        assertEquals(agent.getFloatResult1(), 10.0);
    }

    /**
     * .
     */
    public void assert1p8Equals20() {
    }

    /**
     * .
     */
    public void testSimpleConjunction() {
        agent.testSimpleConjunction();
        assertTrue(agent.isResultBoolean());
    }

    /**
     * .
     */
    public void testSimpleMath() {
        agent.testSimpleMath();
        assertEquals(agent.getFloatResult1(), 21.6);
    }

    /**
     * .
     */
    public void testComplexMath() {
        agent.testComplexMath();
        assertTrue(agent.isComplexResultCorrect());
        assertEquals(agent.getComplexResultValue(), 10);
    }

    /**
     * .
     */
    public void testSimpleOR() {
        agent.testSimpleOR();
        assertEquals(agent.getFloatResult1(), 3.0);
    }

    /**
     * .
     */
    public void testLiterals() {
        agent.testLiterals();
        assertEquals(agent.getFloatResult1(), 3.0);
    }

    /**
     * .
     */
    public void testNegate() {
        agent.testNegate();
        assertEquals(agent.getFloat12(), 1.8);
    }

    /**
     * .
     */
    public void testIdentity() {
        agent.testIdentity();
        assertEquals(agent.getFloat12(), 12.0);
    }

    /**
     * .
     */
    public void testNegateComplex() {
        agent.testNegateComplex();
        assertEquals(agent.getFloatResult1(), 2.0);
    }

    /**
     * .
     */
    public void testComplexConjunction() {
        agent.testComplexConjunction();
        assertEquals(agent.getFloatResult1(), 1.0);
    }

    public void testNegateSameTarget() {
        agent.testNegateSameTarget();
        assertEquals(agent.getFloatResult1(), 10.0);
        assertFalse(agent.getComplexResultValue() == 10.0);
    }

    public void testNegateMultipleTargets() {
        agent.testNegateMultipleTargets();
        assertEquals(agent.getFloatResult1(), 2.0);
    }

    /**
     * .
     */
    public void testExclusiveConjunctions() {
        agent.testExclusiveConjunctions();
        assertFalse(agent.isBoolean1());
        assertEquals(agent.getFloatResult1(), 12.0);
    }

    /**
     * .
     */
    public void testMultiplePaths() {
        agent.testMultiplePaths();
        assertTrue((agent.getFloat1p8() == 20.0f) || (agent.getFloat1p8() == 12.0f));
    }

    public void testNegateOr() {
        agent.testNegateOr();
        assertEquals(agent.getFloat12(), 12.0);
        assertEquals(agent.getFloat1p8(), 1.8);
        assertEquals(agent.getFloatResult1(), 2.0);
    }
}
