package org.lordrose.units;

public class TestingTest {

    public static void main(String[] args) {
        TestingTest testSuite = new TestingTest();
        testSuite.testTestMethod();
    }

    public void testTestMethod() {
        WasRun test = new WasRun("testMethod");
        System.out.println(test.wasRun);
        test.run();
        System.out.println(test.wasRun);
    }
}
