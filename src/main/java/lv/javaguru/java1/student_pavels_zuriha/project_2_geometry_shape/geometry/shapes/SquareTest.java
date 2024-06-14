package lv.javaguru.java1.student_pavels_zuriha.project_2_geometry_shape.geometry.shapes;

class SquareTest {

    public static void main(String[] args) {

        SquareTest test = new SquareTest();
        test.testCalculateSquareArea();
        test.testCalculateSquarePerimeter();
    }

    public void testCalculateSquareArea() {

        Square square = new Square("Square", 6.7);
        double realResult = square.calculateArea();
        checkResult(realResult, 44.89);
    }

    public void testCalculateSquarePerimeter() {

        Square square = new Square("Square", 6.7);
        double realResult = square.calculatePerimeter();
        checkResult(realResult,26.8);
    }

    public void checkResult(double realResult, double expectedResult) {

        if (realResult == expectedResult) {
            System.out.println("TEST OK");
        } else {
            System.out.println("Test FAIL. Real Result: " + realResult);
        }
    }
}
