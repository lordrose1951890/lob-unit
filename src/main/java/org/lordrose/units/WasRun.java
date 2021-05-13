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

    @Override
    void tearDown() {
        log += "tearDown ";
    }

    public void testMethod() {
        wasRun = true;
        log += "testMethod ";
    }

    public void testBrokenMethod() {
        throw new RuntimeException("Expected exception from broken method");
    }
}
