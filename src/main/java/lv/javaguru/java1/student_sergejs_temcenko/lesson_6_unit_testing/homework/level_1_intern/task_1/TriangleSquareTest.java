package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_1_intern.task_1;

class TriangleSquareTest {
    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.testSemiPerimeter();
        test.testCalculateSquare();

    }

    // a = 2; b = 4; c = 5; expected = 5,5;
    public void testSemiPerimeter() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSemiPerimeter(2, 4, 5);
        checkTest(result, 5.5, "Test Semi Perimeter: ");
    }

    // a = 2; b = 4; c = 5; expected = 3.799671038392666
    public void testCalculateSquare() {
        TriangleSquare triangleSquare = new TriangleSquare();
        double result = triangleSquare.calculateSquare(2, 4, 5);
        checkTest(result, 3.799671038392666, "Test Calculate Square:");
    }

    private void checkTest(double result, double expected, String testName) {
        if (result == expected) {
            System.out.println(testName + " OK");
        } else {
            System.out.println(testName + " NOT OK ");
        }
    }


}
