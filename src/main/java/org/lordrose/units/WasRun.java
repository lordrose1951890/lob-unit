package org.lordrose.units;

class WasRun extends TestCase {
    public boolean wasRun;

    public WasRun(String testMethod) {
        super(testMethod);
        wasRun = false;
    }

    public void testMethod() {
        wasRun = true;
    }
}
