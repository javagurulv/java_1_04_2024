package lv.javaguru.java1.student_pavels_zuriha.project_2_geometry_shape.geometry.shapes;

class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();

        test.testCalculateCircleArea();
        test.testCalculateCirclePerimeter();
    }

    public void testCalculateCircleArea() {
        Circle circle = new Circle("Circle", 5);

        double realResult = circle.calculateArea();
        checkResult(realResult,78.53981633974483);
    }

    public void testCalculateCirclePerimeter() {
        Circle circle = new Circle("Circle", 5);

        double realResult = circle.calculatePerimeter();
        checkResult(realResult,31.41592653589793);
    }

    public void checkResult(double realResult, double expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("TEST OK");
        } else {
            System.out.println("Test FAIL. Real Result: " + realResult);
        }
    }

}
