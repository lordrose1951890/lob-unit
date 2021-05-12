package org.lordrose.units;

public class TestCaseTest extends TestCase {
    private WasRun test;

    public static void main(String[] args) {
        new TestCaseTest("testRunning").run();
        new TestCaseTest("testSetUp").run();
    }

    public TestCaseTest(String testMethod) {
        super(testMethod);
    }

    @Override
    void setUp() {
        test = new WasRun("testMethod");
    }

    public void testRunning() {
        test.run();
        assert test.wasRun;
    }

    public void testSetUp() {
        test.run();
        assert test.wasSetUp;
    }
}
