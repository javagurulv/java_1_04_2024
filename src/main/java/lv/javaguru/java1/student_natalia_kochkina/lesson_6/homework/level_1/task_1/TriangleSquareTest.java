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
                "SquareTest1 ");
    }

    public void squareTest2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(13, 14, 15);
        checkResult(realSquare, 84,
                "SquareTest2 ");
    }

    public void squareTest3() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(0, 26, 26);
        checkResult(realSquare, 0,
                "SquareTest3 ");
    }

    public void semiPerimeterTest1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(28, 46, 51);
        checkResult(realSemiPerimeter, 62.5,
                "SemiPerimeterTest1 ");
    }

    public void semiPerimeterTest2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(23, 23, 23);
        checkResult(realSemiPerimeter, 34.5,
                "SemiPerimeterTest2 ");
    }

    public void semiPerimeterTest3() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(14, 14, 9);
        checkResult(realSemiPerimeter, 18.5,
                "SemiPerimeterTest3 ");
    }

    private void checkResult(double realResult, double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST = OK");
        } else {
            System.out.println(testScenarioName + "TEST = FAIL");
        }
    }
}
