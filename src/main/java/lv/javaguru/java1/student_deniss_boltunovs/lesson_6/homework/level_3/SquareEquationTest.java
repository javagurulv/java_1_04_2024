package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_3;

class SquareEquationTest {

    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();

        System.out.println("TESTS where Discriminant > 0");
        test.test1Discriminant();
        test.test1IsSquareRoot();
        test.test1FirstRoot();
        test.test1SecondRoot();

        System.out.println("TESTS where Discriminant = 0");
        test.test2Discriminant();
        test.test2IsSquareRoot();
        test.test2FirstRoot();
        test.test2SecondRoot();

        System.out.println("TESTS where Discriminant < 0");
        test.test3Discriminant();
        test.test3IsSquareRoot();
        test.test3FirstRoot();
        test.test3SecondRoot();
    }

    /////////////// TESTS where Discriminant > 0

    // a = 1, b = -3, c = 2 , result = 1
    public void test1Discriminant() {
        SquareEquation equation = new SquareEquation();
        double result = equation.discriminant(1,-3,2);
        double expectedResult = 1;
        checkResultNumber(result, expectedResult, "test1Discriminant");
    }

    // a = 1, b = -3, c = 2 , result = true
    public void test1IsSquareRoot() {
        SquareEquation equation = new SquareEquation();
        boolean result = equation.isSquareRoot(1,-3,2);
        boolean expectedResult = true;
        checkResultBoolean(result, expectedResult, "test1IsSquareRoot");
    }

    // a = 1, b = -3, c = 2 , result = 1
    public void test1FirstRoot() {
        SquareEquation equation = new SquareEquation();
        double result = equation.firstRoot(1,-3,2);
        double expectedResult = 1;
        checkResultNumber(result, expectedResult, "test1FirstRoot" );
    }

    // a = 1, b = -3, c = 2 , result = 2
    public void test1SecondRoot() {
        SquareEquation equation = new SquareEquation();
        double result = equation.secondRoot(1,-3,2);
        double expectedResult = 2;
        checkResultNumber(result, expectedResult, "test1SecondRoot");
    }


    /////////////// TESTS where Discriminant = 0

    // a = 2, b = -8, c = 8 , result = 0
    public void test2Discriminant() {
        SquareEquation equation = new SquareEquation();
        double result = equation.discriminant(2,-8,8);
        double expectedResult = 0;
        checkResultNumber(result, expectedResult, "test2Discriminant");
    }

    // a = 2, b = -8, c = 8 , result = true
    public void test2IsSquareRoot() {
        SquareEquation equation = new SquareEquation();
        boolean result = equation.isSquareRoot(2,-8,8);
        boolean expectedResult = true;
        checkResultBoolean(result, expectedResult, "test2IsSquareRoot");
    }

    // a = 2, b = -8, c = 8 , result = 2
    public void test2FirstRoot() {
        SquareEquation equation = new SquareEquation();
        double result = equation.firstRoot(2,-8,8);
        double expectedResult = 2;
        checkResultNumber(result, expectedResult, "test2FirstRoot");
    }

    // a = 2, b = -8, c = 8 , result = 2
    public void test2SecondRoot() {
        SquareEquation equation = new SquareEquation();
        double result = equation.secondRoot(2,-8,8);
        double expectedResult = 2;
        checkResultNumber(result, expectedResult, "test2SecondRoot");
    }


    /////////////// TESTS where Discriminant < 0

    // a = 3, b = -4, c = 5 , result = -44
    public void test3Discriminant() {
        SquareEquation equation = new SquareEquation();
        double result = equation.discriminant(3,-4,5);
        double expectedResult = -44;
        checkResultNumber(result, expectedResult, "test3Discriminant");
    }

    // a = 3, b = -4, c = 5 , result = false
    public void test3IsSquareRoot() {
        SquareEquation equation = new SquareEquation();
        boolean result = equation.isSquareRoot(3,-4,5);
        boolean expectedResult = false;
        checkResultBoolean(result, expectedResult, "test3IsSquareRoot");
    }

    // a = 3, b = -4, c = 5 , result = NaN
    public void test3FirstRoot() {
        SquareEquation equation = new SquareEquation();
        boolean result = Double.isNaN(equation.firstRoot(3,-4,5));
        boolean expectedResult = true;
        checkResultBoolean(result, expectedResult, "test3FirstRoot");
    }

    // a = 3, b = -4, c = 5 , result = NaN
    public void test3SecondRoot() {
        SquareEquation equation = new SquareEquation();
        boolean result = Double.isNaN(equation.secondRoot(3,-4,5));
        boolean expectedResult = true;
        checkResultBoolean(result, expectedResult, "test3SecondRoot");
    }


    public void checkResultNumber(double realResult,
                                  double expectedResult,
                                  String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAILED" + " (result " + realResult + ", expected " + expectedResult + ")");
        }
    }

    public void checkResultBoolean(boolean realResult,
                                   boolean expectedResult,
                                   String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAILED" + " (result " + realResult + ", expected " + expectedResult + ")");
        }
    }

}
