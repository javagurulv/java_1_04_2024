package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

class SquareTest {

    public static void main(String[] args) {
        SquareTest test = new SquareTest();
        test.squareAreaTest1();
        test.squareAreaTest2();
        test.squarePerimeterTest1();
        test.squarePerimeterTest2();
    }

    public void squareAreaTest1() {
        Square square = new Square("Square1", 2.5);
        double realResult = square.calculateArea();
        checkResult(realResult, 6.25, "SquareArea1");
    }

    public void squareAreaTest2() {
        Square square = new Square("Square2", 0);
        double realResult = square.calculateArea();
        checkResult(realResult, 0, "SquareArea2");
    }

    public void squarePerimeterTest1() {
        Square square = new Square("Square3", 2.5);
        double realResult = square.calculatePerimeter();
        checkResult(realResult, 10, "SquarePerimeter1");
    }

    public void squarePerimeterTest2() {
        Square square = new Square("Square4", 0);
        double realResult = square.calculatePerimeter();
        checkResult(realResult, 0, "SquarePerimeter2");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testName) {
        if (realResult == expectedResult) {
            System.out.println("TEST" + testName + "= OK");
        } else {
            System.out.println("TEST" + testName + "= FAIL");
            System.out.println("Real result = " + realResult);
            System.out.println("Expected result = " + expectedResult);
        }
    }

}
