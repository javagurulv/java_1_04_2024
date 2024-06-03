package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_1.task_1;

class TriangleSquareTest {

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.squareTest1();
        test.squareTest2();
        test.squareTest3();
        test.semiPerimeterTest1();
        test.semiPerimeterTest2();
        test.semiPerimeterTest3();
    }

    public void squareTest1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(20, 16, 12);
        checkResult(realSquare, 96,
                "Square1");
    }

    public void squareTest2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(13, 14, 15);
        checkResult(realSquare, 84,
                "Square2");
    }

    public void squareTest3() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(0, 26, 26);
        checkResult(realSquare, 0,
                "Square3");
    }

    public void semiPerimeterTest1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(28, 46, 51);
        checkResult(realSemiPerimeter, 62.5,
                "SemiPerimeter1");
    }

    public void semiPerimeterTest2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(23, 23, 23);
        checkResult(realSemiPerimeter, 34.5,
                "SemiPerimeter2");
    }

    public void semiPerimeterTest3() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(14, 14, 9);
        checkResult(realSemiPerimeter, 18.5,
                "SemiPerimeter3");
    }

    private void checkResult(double realResult, double expectedResult,
                             String testName) {
        if (realResult == expectedResult) {
            System.out.println("TEST " + testName + " = OK");
        } else {
            System.out.println("TEST " + testName + " = OK");
            System.out.println("Real result = " + realResult);
            System.out.println("Expected result = " + expectedResult);
        }
    }
}
