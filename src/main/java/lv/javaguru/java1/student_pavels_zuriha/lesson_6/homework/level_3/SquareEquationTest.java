package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_3;

class SquareEquationTest {
    public static void main(String[] args) {
     SquareEquationTest squareEquationTest = new SquareEquationTest();
     squareEquationTest.discriminantTest();
     squareEquationTest.isSquareRootTest();
     squareEquationTest.firstRootTest();
     squareEquationTest.secondRootTest();

    }

    public void discriminantTest() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.discriminant(-7,-8,10);
        checkResult(realResult, 344);

    }

    public void isSquareRootTest() {
        SquareEquation squareEquation = new SquareEquation();
        boolean realResult = squareEquation.isSquareRoot(-7,-8,10);
        checkResultBoolean(realResult, true);
    }

    public void firstRootTest() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.firstRoot(-7,-8,10);
        checkResult(realResult, 0.7533740707851005);
    }

    public void secondRootTest() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.secondRoot(-7,-8,10);
        checkResult(realResult, -1.8962312136422435);
    }

    public void checkResult(double realResult, double expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Test is Ok");
        } else {
            System.out.println("Test failed");
        }
    }

    public void checkResultBoolean(boolean realResult, boolean expectedResult) {
        if (realResult) {
            System.out.println("Test is Ok");
        } else {
            System.out.println("Test failed");
        }
    }


}
