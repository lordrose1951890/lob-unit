package org.lordrose.units;

import static org.lordrose.units.utils.MyAssertions.assertTrue;

public class TestCaseTest extends TestCase {

    private TestResult result;

    public static void main(String[] args) {
        TestSuite suite = new TestSuite();
        suite.add(new TestCaseTest("testTemplateMethod"));
        suite.add(new TestCaseTest("testResult"));
        suite.add(new TestCaseTest("testFailedResult"));
        suite.add(new TestCaseTest("testFailedResultFormatting"));
        suite.add(new TestCaseTest("testSuite"));
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println(result.summary());
    }

    public TestCaseTest(String testMethod) {
        super(testMethod);
    }

    @Override
    void setUp() {
        result = new TestResult();
    }

    public void testTemplateMethod() {
        WasRun test = new WasRun("testMethod");
        test.run(result);
        assertTrue("setUp testMethod tearDown ".equals(test.log));
    }

    public void testResult() {
        WasRun test = new WasRun("testMethod");
        test.run(result);
        assertTrue("1 run, 0 failed".equals(result.summary()));
    }

    public void testFailedResult() {
        WasRun test = new WasRun("testBrokenMethod");
        test.run(result);
        assertTrue("1 run, 1 failed".equals(result.summary()));
    }

    public void testFailedResultFormatting() {
        result.testStarted();
        result.testFailed();
        assertTrue("1 run, 1 failed".equals(result.summary()));
    }

    public void testSuite() {
        TestSuite suite = new TestSuite();
        suite.add(new WasRun("testMethod"));
        suite.add(new WasRun("testBrokenMethod"));
        suite.run(result);
        assertTrue("2 run, 1 failed".equals(result.summary()));
    }
}
