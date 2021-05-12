package org.lordrose.units;

import java.lang.reflect.InvocationTargetException;
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

    public void run() {
        System.out.println("Running: " + testMethod);
        setUp();
        Method test;
        try {
            test = this.getClass().getMethod(testMethod);
            test.invoke(this);
        } catch (InvocationTargetException
                | NoSuchMethodException
                | IllegalAccessException e) {
            e.printStackTrace();
        }
        tearDown();
    }
}
