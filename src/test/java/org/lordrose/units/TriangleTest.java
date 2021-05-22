package org.lordrose.units;

import org.lordrose.units.examples.TriangleValidator;

import static org.lordrose.units.utils.MyAssertions.assertThrows;
import static org.lordrose.units.utils.MyAssertions.assertTrue;

public class TriangleTest extends TestCase {

    public TriangleTest(String testMethod) {
        super(testMethod);
    }

    public static void main(String[] args) {
        TestSuite suite = new TestSuite();
        suite.add(new TriangleTest("testEquilateralTriangle"));
        suite.add(new TriangleTest("testIsoscelesTriangle"));
        suite.add(new TriangleTest("testScaleneTriangle"));
        suite.add(new TriangleTest("testInvalidTriangle"));
        suite.add(new TriangleTest("testNegative"));
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println(result.summary());
    }

    TriangleValidator validator;

    @Override
    void setUp() {
        validator = new TriangleValidator();
    }

    @Override
    void tearDown() {
        validator = null;
    }

    public void testEquilateralTriangle() {
        assertTrue(validator.validate(3, 3, 3) == 1);
    }

    public void testIsoscelesTriangle() {
        assertTrue(validator.validate(3, 3, 2) == 2);
    }

    public void testScaleneTriangle() {
        assertTrue(validator.validate(3, 4, 5) == 3);
    }

    public void testInvalidTriangle() {
        assertThrows(TriangleValidator.InvalidTriangleException.class,
                () -> validator.validate(1, 2, 3));
    }

    public void testNegative() {
        assertThrows(TriangleValidator.InvalidTriangleException.class,
                () -> validator.validate(3, 4, -5));
    }
}
