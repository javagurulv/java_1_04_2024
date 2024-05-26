package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_1_intern;

// Test Scenario:
// All sides are equal, a = 1, b = 1, c = 1
// 1. Find Semi perimeter of the triangle
// 2. Find Area of the triangle



class TriangleAreaTest {
    public static void main(String[] args) {
        TriangleAreaTest test = new TriangleAreaTest();
        test.findSemiPerimeterTest();
        test.calculateAreaTest();

    }
    public void findSemiPerimeterTest() {
        TriangleArea triangleArea = new TriangleArea();
        double result;
        result = triangleArea.calculateSemiPerimeter(1,1,1);
        checkResult(result, 1.5,"Semi perimeter calc test");
    }

    public void calculateAreaTest() {
        TriangleArea triangleArea = new TriangleArea();
        double result;
        result = triangleArea.calculateArea(1,1,1);
        checkResult(result,0.4330127018922193, "area calc test");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
