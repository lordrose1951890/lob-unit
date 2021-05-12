package org.lordrose.units;

public class WasRun {
    public boolean wasRun;

    public WasRun(String testMethod) {
        wasRun = false;
    }

    public void testMethod() {
        wasRun = true;
    }

    public void run() {
        testMethod();
    }
}
