package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_1.task_1;

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

    public void test1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(20, 16, 12);
        checkResult(realSquare, 96,
                "SquareTest1 ");
    }

    public void test2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(13, 14, 15);
        checkResult(realSquare, 84,
                "SquareTest2 ");
    }

    public void test3() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSquare = triangleSquare.calculateSquare(28, 26, 30);
        checkResult(realSquare, 336,
                "SquareTest3 ");
    }

    public void test4() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(28, 46, 51);
        checkResult(realSemiPerimeter, 62.5,
                "SemiPerimeterTest1 ");
    }

    public void test5() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realSemiPerimeter = triangleSquare.calculateSemiPerimeter(23, 23, 23);
        checkResult(realSemiPerimeter, 34.5,
                "SemiPerimeterTest2 ");
    }

    public void test6() {
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
