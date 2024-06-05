package lv.javaguru.java1.student_artem_galustan.lesson6.homework;

class TriangleSquareTest {
    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.test1();
        test.test2();
        test.test3();
    }

    void checkResult(double actualResult, double expectedResult, String testPart) {
        if (actualResult == expectedResult) {
            System.out.println(testPart + ": = OK");
        } else System.out.println(testPart + ": = FAIL");
    }
        void test1() {
            TriangleSquare triangleSquare = new TriangleSquare();
            double actualResult = triangleSquare.calculateSemiPerimeter(12, 10, 10);
            checkResult(actualResult, 16.0, " semi-PerimeterTest1");
        }

        void test2() {
            TriangleSquare triangleSquare = new TriangleSquare();
            double actualResult = triangleSquare.calculateSemiPerimeter(0, 0, 0);
            checkResult(actualResult, 0.0, " semi-PerimeterTest2");


        }
    void test3(){
        TriangleSquare triangleSquare = new TriangleSquare();
        double actualResult = triangleSquare.calculateSemiPerimeter(20,16,17);
        checkResult(actualResult, 26.5," semi-PerimeterTest3");
    }
}








