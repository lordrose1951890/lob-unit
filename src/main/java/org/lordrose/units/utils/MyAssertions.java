package org.lordrose.units.utils;

public class MyAssertions {

    public static void assertTrue(boolean check) {
        if (!check) {
            throw new RuntimeException("Assertion fail");
        }
    }
}
