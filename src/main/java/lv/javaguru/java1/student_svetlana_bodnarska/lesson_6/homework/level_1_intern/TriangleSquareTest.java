package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_1_intern;

class TriangleSquareTest {
    // p1: 3, 4, 5 -> 6;
    // p2: 3, 5, 4 -> 6;
    // p3: 4, 3, 5 -> 6;
    // p4: 4, 5, 3 -> 6;
    // p5: 5, 3, 4 -> 6;
    // p6: 5, 4, 3 -> 6;

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.semiPerimetertest1();
        test.semiPerimetertest2();
        test.semiPerimetertest3();
        test.semiPerimetertest4();
        test.semiPerimetertest5();
        test.semiPerimetertest6();
        test.SquareTest1();
        test.SquareTest2();
        test.SquareTest3();
        test.SquareTest4();
        test.SquareTest5();
        test.SquareTest6();
    }

    public void semiPerimetertest1() {

        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult = triangleSquare.calculateSemiPerimeter(3, 4, 5);
        checkResult(realResult, 6, " Nr.1");

    }

    public void semiPerimetertest2() {

        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult = triangleSquare.calculateSemiPerimeter(3, 5, 4);
        checkResult(realResult, 6, " Nr.2");
    }

    public void semiPerimetertest3() {

        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult = triangleSquare.calculateSemiPerimeter(4, 3, 5);
        checkResult(realResult, 6, " Nr.3");

    }

    public void semiPerimetertest4() {

        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult = triangleSquare.calculateSemiPerimeter(4, 5, 3);
        checkResult(realResult, 6, " Nr.4");

    }

    public void semiPerimetertest5() {

        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult = triangleSquare.calculateSemiPerimeter(5, 3, 4);
        checkResult(realResult, 6, " Nr.5");
    }

    public void semiPerimetertest6() {

        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult = triangleSquare.calculateSemiPerimeter(5, 4, 3);
        checkResult(realResult, 6, " Nr.6");
    }

    private void checkResult(double realResult, int expectedResult, String testName) {
        if (realResult == expectedResult) {
            System.out.println("TEST" + testName + " = OK");
        } else {
            System.out.println("TEST" + testName + " = FAIL");
        }
    }

    // s1: 3, 4, 5, = 36
    // s2: 3, 5, 4 = 36
    // s3: 4, 3, 5 = 36
    // s4: 4, 5, 3 = 36
    // s5: 5, 3, 4 = 36
    // s6: 5, 4, 3 = 36


    public void SquareTest1() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult2 = triangleSquare.calculateSquare(3, 4, 5);
        checkSquareResult(realResult2,6,"TriangleSquareTest1");
        }

    public void SquareTest2() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult2 = triangleSquare.calculateSquare(3, 5, 4);
        checkSquareResult(realResult2,6,"TriangleSquareTest1");
    }

    public void SquareTest3() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult2 = triangleSquare.calculateSquare(4, 3, 5);
        checkSquareResult(realResult2,6,"TriangleSquareTest1");
    }
    public void SquareTest4() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult2 = triangleSquare.calculateSquare(4, 5, 3);
        checkSquareResult(realResult2,6,"TriangleSquareTest1");
    }
    public void SquareTest5() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult2 = triangleSquare.calculateSquare(5, 3, 4);
        checkSquareResult(realResult2,6,"TriangleSquareTest1");
    }
    public void SquareTest6() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double realResult2 = triangleSquare.calculateSquare(5, 4, 3);
        checkSquareResult(realResult2,6,"TriangleSquareTest1");
    }

        private void checkSquareResult(double realResult2, int expectedResult, String testName){
        if(realResult2 == expectedResult){
            System.out.println("Triangle square test 1 = OK");
        } else {
            System.out.println("Triangle square test 1 = FAIl");
        }

    }
}
