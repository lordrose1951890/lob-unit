package org.lordrose.units;

class WasRun extends TestCase {
    boolean wasRun;
    String log;

    public WasRun(String testMethod) {
        super(testMethod);
    }

    @Override
    void setUp() {
        wasRun = false;
        log = "setUp ";
    }

    public void testMethod() {
        wasRun = true;
        log += testMethod;
    }
}
