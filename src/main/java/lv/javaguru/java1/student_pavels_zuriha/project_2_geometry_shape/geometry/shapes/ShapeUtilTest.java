package lv.javaguru.java1.student_pavels_zuriha.project_2_geometry_shape.geometry.shapes;

class ShapeUtilTest {

    public static void main(String[] args) {

        ShapeUtilTest test = new ShapeUtilTest();
        test.testCalculateArea();
        test.testCalculatePerimeter();
    }

    public void testCalculateArea() {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = {
                new Circle("A", 4.0),
                new Square("B", 1.0),
                new Rectangle("C", 2.0, 3.0)
        };

        double realResult = shapeUtil.calculateArea(shapes);
        checkResult(realResult, 57.26548245743669);

    }

    public void testCalculatePerimeter() {

        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shapes = {
                new Circle("A", 4.0),
                new Square("B", 1.0),
                new Rectangle("C", 2.0, 3.0)
        };

        double realResult = shapeUtil.calculatePerimeter(shapes);
        checkResult(realResult, 39.132741228718345);

    }

    private void checkResult(double realResult,
                             double expectedResult) {

        if (realResult == expectedResult) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL. Real Result: " + realResult);
        }
    }


}
