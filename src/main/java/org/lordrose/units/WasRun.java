package org.lordrose.units;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WasRun {
    public boolean wasRun;
    String testMethod;

    public WasRun(String testMethod) {
        wasRun = false;
        this.testMethod = testMethod;
    }

    public void testMethod() {
        wasRun = true;
    }

    public void run() {
        Method test;
        try {
            test = WasRun.class.getDeclaredMethod(testMethod);
            test.invoke(this);
        } catch (InvocationTargetException
                | NoSuchMethodException
                | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
