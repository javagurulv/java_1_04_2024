package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_1.task_1;

class TriangleSquareTest {

    public static void main(String[] args) {
        TriangleSquareTest test = new TriangleSquareTest();
        test.calculateSemiPerimeterTest();
        test.calculateSquareTest();
    }

    public void calculateSemiPerimeterTest() {
        int number = 5;
        int number1 = 7;
        int number2 = 9;
        TriangleSquare triangleSquare = new TriangleSquare();
        double semiPerimeter1 = triangleSquare.calculateSemiPerimeter(number,number1,number2);
        checkResult(semiPerimeter1, 10.5);
        checkResult(semiPerimeter1, 5);

    }

    public void calculateSquareTest() {
        int number = 5;
        int number1 = 7;
        int number2 = 9;
        TriangleSquare triangleSquare = new TriangleSquare();
        double square = triangleSquare.calculateSquare(number,number1,number2);
        checkResult(square, 17.41228014936585);
        checkResult(square, 0);

    }




    private void checkResult(double realResult, double expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Test is OK");
        } else {
            System.out.println("Test is fail");
        }

    }




}
