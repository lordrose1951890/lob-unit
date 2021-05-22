package org.lordrose.units.utils;

public class MyAssertions {

    public static void assertTrue(boolean check) {
        if (!check) {
            throw new RuntimeException("Assertion fail");
        }
    }

    public static  <T extends Throwable> void assertThrows(Class<T> expectedThrow, Executable exe) {
        try {
            exe.execute();
        } catch (Exception actualException) {
            if (expectedThrow.isInstance(actualException)) {
                return;
            } else {
                throw new RuntimeException("Expected: " + expectedThrow.getName() +
                        " but actual: " + actualException.getClass().getName());
            }
        }
        throw new RuntimeException("Expected: " + expectedThrow.getName() + " but no exception was thrown");
    }

    @FunctionalInterface
    public interface Executable {
        void execute();
    }
}
