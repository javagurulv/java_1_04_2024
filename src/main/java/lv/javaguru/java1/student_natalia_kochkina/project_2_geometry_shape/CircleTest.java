package lv.javaguru.java1.student_natalia_kochkina.project_2_geometry_shape;

class CircleTest {

    public static void main(String[] args) {
        CircleTest test = new CircleTest();
        test.circleAreaTest1();
        test.circleAreaTest2();
        test.circlePerimeterTest1();
        test.circlePerimeterTest2();
    }

    public void circleAreaTest1() {
        Circle circle = new Circle("Circle1", 2.5);
        double realResult = circle.calculateArea();
        checkResult(realResult, 19.634954084936208,
                "CircleArea1");
    }

    public void circleAreaTest2() {
        Circle circle = new Circle("Circle2", 0);
        double realResult = circle.calculateArea();
        checkResult(realResult, 0,
                "CircleArea2");
    }

    public void circlePerimeterTest1() {
        Circle circle = new Circle("Circle3", 3.5);
        double realResult = circle.calculatePerimeter();
        checkResult(realResult, 21.991148575128552,
                "CirclePerimeter1");
    }

    public void circlePerimeterTest2() {
        Circle circle = new Circle("Circle4", 0);
        double realResult = circle.calculatePerimeter();
        checkResult(realResult, 0,
                "CirclePerimeter2");
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
