package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest test = new ShapeUtilTest();
        test.areaTest1();
        test.areaTest2();
        test.areaTest3();
        test.PerimeterTest1();
        test.PerimeterTest2();
    }

    //areaTest Circle(4), Square(4), Rectangle(4, 5) -> 86.26548245743669
    public void areaTest1() {
        Shape[] shapes = {
                new Circle("Circle1", 4),
                new Square("Square1", 4),
                new Rectangle("Rectangle1", 4, 5)
        };
        ShapeUtil shapeUtil = new ShapeUtil();
        double realResult = shapeUtil.calculateArea(shapes);
        checkResult(realResult, 86.26548245743669, " Area1 ");
    }

    //areaTest Circle(10), Square(2), Rectangle(2, 5) -> 42.274333882308138
    public void areaTest2() {
        Shape[] shapes = {
                new Circle("Circle2", 10),
                new Square("Square2", 2),
                new Rectangle("Rectangle2", 2, 5)
        };
        ShapeUtil shapeUtil = new ShapeUtil();
        double realResult = shapeUtil.calculateArea(shapes);
        checkResult(realResult, 328.1592653589793, " Area2 ");
    }

    //areaTest Circle(0), Square(0), Rectangle(0, 0) -> 0
    public void areaTest3() {
        Shape[] shapes = {
                new Circle("Circle3", 0),
                new Square("Square3", 0),
                new Rectangle("Rectangle3", 0, 0)
        };
        ShapeUtil shapeUtil = new ShapeUtil();
        double realResult = shapeUtil.calculateArea(shapes);
        checkResult(realResult, 0, " Area3 ");
    }

    //PerimeterTest Circle(3.5), Square(4), Rectangle(4, 5) -> 86.26548245743669
    public void PerimeterTest1() {
        Shape[] shapes = {
                new Circle("Circle4", 3.5),
                new Square("Square4", 4),
                new Rectangle("Rectangle4", 4, 5)
        };
        ShapeUtil shapeUtil = new ShapeUtil();
        double realResult = shapeUtil.calculatePerimeter(shapes);
        checkResult(realResult, 55.99114857512855, " Perimeter1 ");
    }

    //PerimeterTest Circle(0), Square(0), Rectangle(0) -> 0
    public void PerimeterTest2() {
        Shape[] shapes = {
                new Circle("Circle5", 0),
                new Square("Square5", 0),
                new Rectangle("Rectangle5", 0, 0)
        };
        ShapeUtil shapeUtil = new ShapeUtil();
        double realResult = shapeUtil.calculatePerimeter(shapes);
        checkResult(realResult, 0, " Perimeter2 ");
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
