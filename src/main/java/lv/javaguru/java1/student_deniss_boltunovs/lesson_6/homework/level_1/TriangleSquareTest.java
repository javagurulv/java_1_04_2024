package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_1;

class TriangleSquareTest {

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.testCalculateSemiPerimeter();
        test.testCalculateSquare();
    }

    //  input  - 4,6,5
    //  output - 7.5
    public void testCalculateSemiPerimeter() {
         TriangleSquare triangle = new TriangleSquare();
         double result = triangle.calculateSemiPerimeter(4,6,5);
         double expectedResult = 7.5;
         if (result == expectedResult) {
             System.out.println("TEST calculateSemiPerimeter: OK");
         } else {
             System.out.println("TEST calculateSemiPerimeter: FAILED (expected " + expectedResult + ", result " + result + ")");
         }
    }


    //  input  - 4,6,5
    //  output - 9.921567416492215
    public void testCalculateSquare() {
        TriangleSquare triangle = new TriangleSquare();
        double result = triangle.calculateSquare(4,6,5);
        double expectedResult = 9.921567416492215;
        if (result == expectedResult) {
            System.out.println("TEST calculateSquare: OK");
        } else {
            System.out.println("TEST calculateSquare: FAILED (expected " + expectedResult + ", result " + result + ")");
        }
    }

}
