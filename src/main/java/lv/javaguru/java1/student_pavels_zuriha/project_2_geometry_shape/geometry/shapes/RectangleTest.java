package lv.javaguru.java1.student_pavels_zuriha.project_2_geometry_shape.geometry.shapes;

class RectangleTest {

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();

        test.testCalculateRectangleArea();
        test.testCalculateRectanglePerimeter();
    }

    public void testCalculateRectangleArea() {
        Rectangle rectangle = new Rectangle("Rectangle", 3.54, 2.79);
        double realResult = rectangle.calculateArea();
        checkResult(realResult,9.8766);
    }

    public void testCalculateRectanglePerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 3.54, 2.79);
        double realResult = rectangle.calculatePerimeter();
        checkResult(realResult,12.66);
    }



    public void checkResult(double realResult, double expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("TEST OK");
        } else {
            System.out.println("Test FAIL. Real Result: " + realResult);
        }
    }
}
