package org.lordrose.units;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCase {
    String testMethod;

    public TestCase(String testMethod) {
        this.testMethod = testMethod;
    }

    public void run() {
        Method test;
        try {
            test = this.getClass().getMethod(testMethod);
            test.invoke(this);
        } catch (InvocationTargetException
                | NoSuchMethodException
                | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
