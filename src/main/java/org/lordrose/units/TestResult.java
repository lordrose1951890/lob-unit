package org.lordrose.units;

public class TestResult {

    private int runCount;

    TestResult() {
        this.runCount = 0;
    }

    void testStarted() {
        runCount += 1;
    }

    String summary() {
        return String.format("%d run, 0 failed", runCount);
    }
}
