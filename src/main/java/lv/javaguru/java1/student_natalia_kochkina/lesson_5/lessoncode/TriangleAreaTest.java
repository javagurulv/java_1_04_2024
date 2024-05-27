package lv.javaguru.java1.student_natalia_kochkina.lesson_5.lessoncode;

class TriangleAreaTest {

    public static void main(String[] args) {
        TriangleAreaTest test = new TriangleAreaTest();
        test.semiPerimeterTest1();
        test.semiPerimeterTest2();
        test.areaTest1();
        test.areaTest2();
    }

    public void semiPerimeterTest1() {
        TriangleArea triangleArea = new TriangleArea();
        double realResult = triangleArea.calculateSemiPerimeter(2, 4, 3);
        checkResult(realResult, 4.5, "SemiPerimeterTest1 ");
    }

    public void semiPerimeterTest2() {
        TriangleArea triangleArea = new TriangleArea();
        double realResult = triangleArea.calculateSemiPerimeter(0, 3, 3);
        checkResult(realResult, 3, "SemiPerimeterTest2 ");
    }

    public void areaTest1() {
        TriangleArea triangleArea = new TriangleArea();
        double realResult = triangleArea.calculateArea(13, 14, 15);
        checkResult(realResult, 84, "AreaTest1 ");
    }

    public void areaTest2() {
        TriangleArea triangleArea = new TriangleArea();
        double realResult = triangleArea.calculateArea(14, 14, 0);
        checkResult(realResult, 0, "AreaTest2 ");
    }

    private void checkResult(double realResult, double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST = OK");
        } else {
            System.out.println(testScenarioName + "TEST = FAIL");
        }
    }
}
