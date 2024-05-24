package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_3;

class SquareEquationTest {

    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();
        test.discriminantTest1();
        test.discriminantTest2();
        test.isRootTest1();
        test.isRootTest2();
        test.firstRootTest1();
        test.secondRootTest1();
    }

    public void discriminantTest1() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.discriminant(1, 2, 1);
        checkDoubleResult(realResult, 0,
                "DiscriminantTest1 ");
    }

    public void discriminantTest2() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.discriminant(1, 2, -3);
        checkDoubleResult(realResult, 16,
                "DiscriminantTest2 ");
    }

    public void isRootTest1() {
        SquareEquation squareEquation = new SquareEquation();
        boolean realResult = squareEquation.isSquareRoot(1, 2, -3);
        checkRootResult(realResult, true, "IsRootTest1 ");
    }

    public void isRootTest2() {
        SquareEquation squareEquation = new SquareEquation();
        boolean realResult = squareEquation.isSquareRoot(3, 1, 4);
        checkRootResult(realResult, false, "IsRootTest2 ");
    }

    public void firstRootTest1() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.firstRoot(1, 2, -3);
        checkDoubleResult(realResult, -3, "FirstRootTest1 ");
    }

    public void secondRootTest1() {
        SquareEquation squareEquation = new SquareEquation();
        double realResult = squareEquation.secondRoot(1, 2, -3);
        checkDoubleResult(realResult, 1, "SecondRootTest1 ");
    }


    private void checkDoubleResult(double realResult, double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST = OK");
        } else {
            System.out.println(testScenarioName + "TEST = FAIL");
        }
    }

    private void checkRootResult(boolean realResult, boolean expectedResult,
                                 String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST = OK");
        } else {
            System.out.println(testScenarioName + "TEST = FAIL");
        }
    }
}
