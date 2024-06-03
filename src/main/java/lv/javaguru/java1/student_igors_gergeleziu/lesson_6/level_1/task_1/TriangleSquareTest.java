package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_1.task_1;

class TriangleSquareTest {
    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
    }

    void test1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double actualResult = triangleSquare.calculateSemiPerimeter(12, 10, 10);
        checkResult(actualResult, 16.0, "semiPerimeterTest1");
    }

    void test2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double actualResult = triangleSquare.calculateSemiPerimeter(0, 0, 0);
        checkResult(actualResult, 0.0, "semiPerimeterTest2");
    }

    void test3() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double actualResult = triangleSquare.calculateSemiPerimeter(25, 16, 18);
        checkResult(actualResult, 29.5, "semiPerimeterTest3");
    }

    void test4() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double actualResult = valueFormattingWithMathRound(triangleSquare.calculateSquare(25, 16, 18), 2);
        checkResult(actualResult, 143.56, "triangleSquareTest1");
    }

    void test5() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double actualResult = valueFormattingWithMathRound(triangleSquare.calculateSquare(13, 16, 10), 2);
        checkResult(actualResult, 64.92, "triangleSquareTest2");
    }

    void test6() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double actualResult = valueFormattingWithMathRound(triangleSquare.calculateSquare(20, 25, 18), 2);
        checkResult(actualResult, 178.29, "triangleSquareTest3");
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
}
