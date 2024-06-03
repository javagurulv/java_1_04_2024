package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_4_junior;

class FactorialForLoopTest {
    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.checkFactorial();
        test.checkFactorialWithNegative();
        test.checkFactorialWithZero();
    }

    public void checkFactorial() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(6);
        checkResult(result,720,"checkFactorialOf6");
    }

    public void checkFactorialWithNegative() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(-6);
        checkResult(result,1,"checkFactorialOfANegative");
    }

    public void checkFactorialWithZero() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(0);
        checkResult(result,1,"checkFactorialOfAZero");

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
