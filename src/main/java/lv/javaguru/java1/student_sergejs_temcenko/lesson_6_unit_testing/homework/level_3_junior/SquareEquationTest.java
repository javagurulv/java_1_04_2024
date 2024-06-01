package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_3_junior;

class SquareEquationTest {

    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.testDiscriminant1();
        test.testDiscriminant2();
        test.testIsSquareRoot1();
        test.testIsSquareRoot2();
        test.testFirstRoot();
        test.testSecondRoot();

    }

    // 1. a = 2; b = 8; c = 6; expected = 16;
    public void testDiscriminant1() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(2, 8, 6);
        testCheck(result, 16, "testDiscriminant1:");

    }

    // 1. a = 2; b = 6; c = 6; expected = -12;
    public void testDiscriminant2() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.discriminant(2, 6, 6);
        testCheck(result, -12, "testDiscriminant2:");

    }

    // 1. a = 2; b = 8; c = 6; expected = true;
    public void testIsSquareRoot1() {
        SquareEquation squareEquation = new SquareEquation();
        boolean result = squareEquation.isSquareRoot(2, 8, 6);
        testCheckRoot(result, true, "testIsSquareRoot1:");
    }

    // 1. a = 2; b = 6; c = 6; expected = false;
    public void testIsSquareRoot2() {
        SquareEquation squareEquation = new SquareEquation();
        boolean result = squareEquation.isSquareRoot(2, 6, 6);
        testCheckRoot(result, false, "testIsSquareRoot2:");
    }

    // 1. a = 2; b = 8; c = 6; expected = - 3.00;
    public void testFirstRoot() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.firstRoot(2, 8, 6);
        testCheck(result, -3.00, "testFirstRoot:");

    }

    // 1. a = 2; b = 8; c = 6; expected = - 1.00;
    public void testSecondRoot() {
        SquareEquation squareEquation = new SquareEquation();
        double result = squareEquation.secondRoot(2, 8, 6);
        testCheck(result, -1.00, "testSecondRoot:");

    }


    private void testCheck(double result,
                           double expected,
                           String testName) {
        if (result == expected) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " NOT OK" + result);
        }
    }

    private void testCheckRoot(boolean result,
                               boolean expected,
                               String testName) {
        if (result == expected) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " NOT OK");
        }
    }

}
