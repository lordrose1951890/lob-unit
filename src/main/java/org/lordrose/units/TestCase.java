package org.lordrose.units;

import java.lang.reflect.Method;

public class TestCase {
    String testMethod;

    public TestCase(String testMethod) {
        this.testMethod = testMethod;
    }

    void setUp() {
    }

    void tearDown() {
    }

    public void run(TestResult result) {
        result.testStarted();
        setUp();
        Method test;
        try {
            test = this.getClass().getMethod(testMethod);
            test.invoke(this);
        } catch (Exception e) {
            result.testFailed();
        }
        tearDown();
    }
}
