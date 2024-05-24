package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_3;

class SquareEquationTest {
    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
        test.test7();
        test.test8();
        test.test9();
        test.test10();
    }

    void test1() {
        SquareEquation squareEquation = new SquareEquation();
        double actualResult = squareEquation.discriminant(3, 6, 2);
        checkResult(actualResult, 12, "discriminantIsGreaterThanZeroTest1");
    }

    void test2() {
        SquareEquation squareEquation = new SquareEquation();
        double actualResult = squareEquation.discriminant(3, 6, 3);
        checkResult(actualResult, 0, "discriminantIsZeroTest2");
    }

    void test3() {
        SquareEquation squareEquation = new SquareEquation();
        double actualResult = squareEquation.discriminant(5, 10, 7);
        checkResult(actualResult, -40, "discriminantIsLessThanZeroTest3");
    }

    void test4() {
        SquareEquation squareEquation = new SquareEquation();
        boolean actualResult = squareEquation.isSquareRoot(3, 6, 2);
        checkResult(actualResult, true, "rootIsSquareTest4");
    }

    void test5() {
        SquareEquation squareEquation = new SquareEquation();
        boolean actualResult = squareEquation.isSquareRoot(3, 6, 3);
        checkResult(actualResult, true, "rootIsSquareTest5");
    }

    void test6() {
        SquareEquation squareEquation = new SquareEquation();
        boolean actualResult = squareEquation.isSquareRoot(5, 10, 7);
        checkResult(actualResult, false, "rootIsSquareTest6");
    }

    void test7() {
        SquareEquation squareEquation = new SquareEquation();
        double actualResult = valueFormattingWithMathRound(squareEquation.firstRoot(3, 6, 2), 3);
        checkResult(actualResult, -1.577, "firstRootForDiscriminantGreaterThanZeroTest7");
    }

    void test8() {
        SquareEquation squareEquation = new SquareEquation();
        double actualResult = valueFormattingWithMathRound(squareEquation.secondRoot(3, 6, 2), 3);
        checkResult(actualResult, -0.423, "secondRootForDiscriminantGreaterThanZeroTest8");
    }

    void test9() {
        SquareEquation squareEquation = new SquareEquation();
        double actualResult = valueFormattingWithMathRound(squareEquation.firstRoot(3, 6, 3), 3);
        checkResult(actualResult, -1, "firstRootForDiscriminantZeroTest9");
    }

    void test10() {
        SquareEquation squareEquation = new SquareEquation();
        double actualResult = valueFormattingWithMathRound(squareEquation.secondRoot(3, 6, 3), 3);
        checkResult(actualResult, -1, "secondRootForDiscriminantZeroTest10");
    }

    static double valueFormattingWithMathRound(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    void checkResult(boolean actualResult, boolean expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
