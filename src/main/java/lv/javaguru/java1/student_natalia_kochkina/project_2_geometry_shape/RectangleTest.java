package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

class RectangleTest {

    public static void main(String[] args) {
        RectangleTest test = new RectangleTest();
        test.rectangleAreaTest1();
        test.rectangleAreaTest2();
        test.rectanglePerimeterTest1();
        test.rectanglePerimeterTest2();
    }

    public void rectangleAreaTest1() {
        Rectangle rectangle = new Rectangle("Rectangle1", 2.5, 3);
        double realResult = rectangle.calculateArea();
        checkResult(realResult, 7.5, "RectangleArea1");
    }

    public void rectangleAreaTest2() {
        Rectangle rectangle = new Rectangle("Rectangle2", 0, 0);
        double realResult = rectangle.calculateArea();
        checkResult(realResult, 0, "RectangleArea2");
    }

    public void rectanglePerimeterTest1() {
        Rectangle rectangle = new Rectangle("Rectangle3", 2.5, 3);
        double realResult = rectangle.calculatePerimeter();
        checkResult(realResult, 11, "RectanglePerimeter1");
    }

    public void rectanglePerimeterTest2() {
        Rectangle rectangle = new Rectangle("Rectangle4", 0, 0);
        double realResult = rectangle.calculatePerimeter();
        checkResult(realResult, 0, "RectanglePerimeter2");
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
