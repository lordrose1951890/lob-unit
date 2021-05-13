package org.lordrose.units;

public class TestResult {

    private int runCount;
    private int errorCount;

    TestResult() {
        runCount = 0;
        errorCount = 0;
    }

    void testStarted() {
        runCount += 1;
    }

    public void testFailed() {
        errorCount += 1;
    }

    String summary() {
        return String.format("%d run, %d failed", runCount, errorCount);
    }
}
