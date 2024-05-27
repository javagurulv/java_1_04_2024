package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_3_junior;

class QuadraticEquationTest {
    public static void main(String[] args) {
    QuadraticEquationTest test = new QuadraticEquationTest();
    test.positiveDiscriminantFinderCheck();
    test.validSquareRootChecker();
    test.validFirstRootFinderCheck();
    test.validSecondRootCheck();
    test.negativeDiscriminantFinderCheck();
    test.invalidSquareRootChecker();
    }

    public void positiveDiscriminantFinderCheck() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double result;
        result = quadraticEquation.discriminant(1, 8,12);
        checkResult(result,16,"positiveDiscriminantFinderCheck");
    }

    public void negativeDiscriminantFinderCheck() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double result;
        result = quadraticEquation.discriminant(1, 2,4);
        checkResult(result,-12,"negativeDiscriminantFinderCheck");
    }

    public void validSquareRootChecker() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        boolean result;
        result = quadraticEquation.isSquareRoot(1,8,12);
        checkResult(result,true,"validSquareRootCheck");
    }

    public void invalidSquareRootChecker() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        boolean result;
        result = quadraticEquation.isSquareRoot(1,2,4);
        checkResult(result,false,"invalidSquareRootCheck");
    }

    public void validFirstRootFinderCheck() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double result;
        result = quadraticEquation.firstRoot(1,8,12);
        checkResult(result,-6,"validFirstRootFinderCheck");
    }


    public void validSecondRootCheck() {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        double result;
        result = quadraticEquation.secondRoot(1,8,12);
        checkResult(result,-2,"validSecondRootFinderCheck");
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

    private void checkResult(boolean realResult,
                             boolean expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }

}

