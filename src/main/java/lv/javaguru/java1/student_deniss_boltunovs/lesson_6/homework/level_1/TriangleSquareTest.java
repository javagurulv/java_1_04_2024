package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_1;

class TriangleSquareTest {

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.testCalculateSemiPerimeter();
        test.testCalculateSquare();
    }

    // a = 4, b = 6, c = 5, result = 7.5
    public void testCalculateSemiPerimeter() {
         TriangleSquare triangle = new TriangleSquare();
         double result = triangle.calculateSemiPerimeter(4,6,5);
         double expectedResult = 7.5;
         checkResult(result,expectedResult, "testCalculateSemiPerimeter");
    }

    // a = 4, b = 6, c = 5, result = 9.921567416492215
    public void testCalculateSquare() {
        TriangleSquare triangle = new TriangleSquare();
        double result = triangle.calculateSquare(4,6,5);
        double expectedResult = 9.921567416492215;
        checkResult(result, expectedResult, "testCalculateSquare");
    }

    public void checkResult(double realResult,
                            double expectedResult,
                            String testName) {
        if (realResult == expectedResult){
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAILED" + " (result " + realResult + ", expected " + expectedResult + ")");
        }
    }

}
