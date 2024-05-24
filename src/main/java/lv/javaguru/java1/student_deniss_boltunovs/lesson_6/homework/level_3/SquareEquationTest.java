package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_3;

class SquareEquationTest {

    public static void main(String[] args) {
        SquareEquationTest test = new SquareEquationTest();

        System.out.println("(No Roots) - Tests");
        test.testNoRootsDiscriminant();
        test.testNoRootsIsSquareRoot();
        test.testNoRootsFirstRoot();
        test.testNoRootsSecondRoot();

        System.out.println("(One Root) - Tests");
        test.testOneRootDiscriminant();
        test.testOneRootIsSquareRoot();
        test.testOneRootFirstRoot();
        test.testOneRootSecondRoot();

        System.out.println("(Two Roots) - Tests");
        test.testTwoRootsDiscriminant();
        test.testTwoRootsIsSquareRoot();
        test.testTwoRootsFirstRoot();
        test.testTwoRootsSecondRoot();

    }

    //////////// (No Roots) - Tests

    // input  : 3,-4,5
    // output : -44
    public void testNoRootsDiscriminant() {
        SquareEquation equation = new SquareEquation();
        double result = equation.discriminant(3,-4,5);
        double expectedResult = -44;
        if (result == expectedResult) {
            System.out.println("TEST Discriminant: OK");
        } else {
            System.out.println("TEST Discriminant: FAILED (expected " + expectedResult + ", received " + result + ")");
        }
    }

    // input  : 3,-4,5
    // output : false
    public void testNoRootsIsSquareRoot() {
        SquareEquation equation = new SquareEquation();
        boolean result = equation.isSquareRoot(3,-4,5);
        if (result == false) {
            System.out.println("TEST isSquareRoot: OK");
        } else {
            System.out.println("TEST isSquareRoot: FAILED (expected false, received true)");
        }
    }

    // input  : 3,-4,5
    // output : NaN
    public void testNoRootsFirstRoot() {
        SquareEquation equation = new SquareEquation();
        double result = equation.firstRoot(3,-4,5);
        if (Double.isNaN(result)) {
            System.out.println("TEST firstRoot: OK");
        } else {
            System.out.println("TEST firstRoot: FAILED (expected NaN, received " + result + ")");
        }
    }

    // input  : 3,-4,5
    // output : NaN
    public void testNoRootsSecondRoot() {
        SquareEquation equation = new SquareEquation();
        double result = equation.secondRoot(3,-4,5);
        if (Double.isNaN(result)) {
            System.out.println("TEST secondRoot: OK");
        } else {
            System.out.println("TEST secondRoot: FAILED (expected NaN, received " + result + ")");
        }
    }


    //////////// (One Root) - Tests

    // input  : 2,-8,8
    // output : 0
    public void testOneRootDiscriminant() {
        SquareEquation equation = new SquareEquation();
        double result = equation.discriminant(2,-8,8);
        double expectedResult = 0;
        if (result == expectedResult) {
            System.out.println("TEST Discriminant: OK");
        } else {
            System.out.println("TEST Discriminant: FAILED (expected " + expectedResult + ", received " + result + ")");
        }
    }

    // input  : 2,-8,8
    // output : true
    public void testOneRootIsSquareRoot() {
        SquareEquation equation = new SquareEquation();
        boolean result = equation.isSquareRoot(2,-8,8);
        if (result == true) {
            System.out.println("TEST isSquareRoot: OK");
        } else {
            System.out.println("TEST isSquareRoot: FAILED (expected true, received false)");
        }
    }

    // input  : 2,-8,8
    // output : 2
    public void testOneRootFirstRoot() {
        SquareEquation equation = new SquareEquation();
        double result = equation.firstRoot(2,-8,8);
        double expectedResult = 2;
        if (result == expectedResult) {
            System.out.println("TEST firstRoot: OK");
        } else {
            System.out.println("TEST firstRoot: FAILED (expected " + expectedResult + ", received " + result + ")");
        }
    }

    // input  : 2,-8,8
    // output : 2
    public void testOneRootSecondRoot() {
        SquareEquation equation = new SquareEquation();
        double result = equation.secondRoot(2,-8,8);
        double expectedResult = 2;
        if (result == expectedResult) {
            System.out.println("TEST secondRoot: OK");
        } else {
            System.out.println("TEST secondRoot: FAILED (expected " + expectedResult + ", received " + result + ")");
        }
    }


    //////////// (Two Roots) - Tests

    // input  : 1,-3,2
    // output : 1
    public void testTwoRootsDiscriminant() {
        SquareEquation equation = new SquareEquation();
        double result = equation.discriminant(1,-3,2);
        double expectedResult = 1;
        if (result == expectedResult) {
            System.out.println("TEST Discriminant: OK");
        } else {
            System.out.println("TEST Discriminant: FAILED (expected " + expectedResult + ", received " + result + ")");
        }
    }

    // input  : 1,-3,2
    // output : true
    public void testTwoRootsIsSquareRoot() {
        SquareEquation equation = new SquareEquation();
        boolean result = equation.isSquareRoot(1,-3,2);
        if (result == true) {
            System.out.println("TEST isSquareRoot: OK");
        } else {
            System.out.println("TEST isSquareRoot: FAILED (expected true, received false)");
        }
    }

    // input  : 1,-3,2
    // output : 1
    public void testTwoRootsFirstRoot() {
        SquareEquation equation = new SquareEquation();
        double result = equation.firstRoot(1,-3,2);
        double expectedResult = 1;
        if (result == expectedResult) {
            System.out.println("TEST firstRoot: OK");
        } else {
            System.out.println("TEST firstRoot: FAILED (expected " + expectedResult + ", received " + result + ")");
        }
    }

    // input  : 1,-3,2
    // output : 2
    public void testTwoRootsSecondRoot() {
        SquareEquation equation = new SquareEquation();
        double result = equation.secondRoot(1,-3,2);
        double expectedResult = 2;
        if (result == expectedResult) {
            System.out.println("TEST secondRoot: OK");
        } else {
            System.out.println("TEST secondRoot: FAILED (expected " + expectedResult + ", received " + result + ")");
        }
    }

}
