package org.lordrose.units;

import static org.lordrose.units.utils.MyAssertions.assertTrue;

public class TestCaseTest extends TestCase {

    public static void main(String[] args) {
        System.out.println(new TestCaseTest("testTemplateMethod").run().summary());
        System.out.println(new TestCaseTest("testResult").run().summary());
        System.out.println(new TestCaseTest("testFailedResult").run().summary());
        System.out.println(new TestCaseTest("testFailedResultFormatting").run().summary());
    }

    public TestCaseTest(String testMethod) {
        super(testMethod);
    }

    public void testTemplateMethod() {
        WasRun test = new WasRun("testMethod");
        test.run();
        assertTrue("setUp testMethod tearDown ".equals(test.log));
    }

    public void testResult() {
        WasRun test = new WasRun("testMethod");
        TestResult result = test.run();
        assertTrue("1 run, 0 failed".equals(result.summary()));
    }

    public void testFailedResult() {
        WasRun test = new WasRun("testBrokenMethod");
        TestResult result = test.run();
        assertTrue("1 run, 1 failed".equals(result.summary()));
    }

    public void testFailedResultFormatting() {
        TestResult result = new TestResult();
        result.testStarted();
        result.testFailed();
        assertTrue("1 run, 1 failed".equals(result.summary()));
    }
}
