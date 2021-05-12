package org.lordrose.units;

public class TestCaseTest extends TestCase {

    public TestCaseTest(String testMethod) {
        super(testMethod);
    }

    public static void main(String[] args) {
        TestCaseTest test = new TestCaseTest("testRunning");
        test.run();
    }

    public void testRunning() {
        System.out.println("Hey! It ran, it ran.");
        WasRun test = new WasRun("testMethod");
        assert !test.wasRun;
        test.run();
        assert test.wasRun;
    }
}
