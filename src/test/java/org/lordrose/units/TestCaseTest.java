package org.lordrose.units;

import static org.lordrose.units.utils.MyAssertions.assertTrue;

public class TestCaseTest extends TestCase {

    public static void main(String[] args) {
        new TestCaseTest("testTemplateMethod").run();
    }

    public TestCaseTest(String testMethod) {
        super(testMethod);
    }

    @Override
    void setUp() {
    }

    public void testTemplateMethod() {
        WasRun test = new WasRun("testMethod");
        test.run();
        assertTrue("setUp testMethod".equals(test.log));
    }
}
