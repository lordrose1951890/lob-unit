package org.lordrose.units;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {

    private final List<TestCase> tests;

    public TestSuite() {
        tests = new ArrayList<>();
    }

    public void add(TestCase test) {
        tests.add(test);
    }

    public void run(TestResult result) {
        for (TestCase test : tests) {
            test.run(result);
        }
    }
}
