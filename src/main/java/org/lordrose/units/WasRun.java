package org.lordrose.units;

class WasRun extends TestCase {
    public boolean wasRun;
    public boolean wasSetUp;

    public WasRun(String testMethod) {
        super(testMethod);
    }

    @Override
    void setUp() {
        wasRun = false;
        wasSetUp = true;
    }

    public void testMethod() {
        wasRun = true;
    }
}
