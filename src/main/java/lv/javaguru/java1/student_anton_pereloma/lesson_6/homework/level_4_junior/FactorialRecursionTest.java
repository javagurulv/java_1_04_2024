package lv.javaguru.java1.student_anton_pereloma.lesson_6.homework.level_4_junior;

class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();

        test.factorialRecursionTestOf0();
        test.factorialRecursionTestOf1();
        test.factorialRecursionTestOf4();
        test.factorialRecursionTestOf5();
        test.factorialRecursionTestOf6();
        test.factorialRecursionTestOf10();


    }
    public void factorialRecursionTestOf1() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(1);
        checkResult(result,1,"factorialRecursionTestOf1");
    }
    public void factorialRecursionTestOf0() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(0);
        checkResult(result,1,"factorialRecursionTestOf0");
    }
    public void factorialRecursionTestOf4() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(4);
        checkResult(result,24,"factorialRecursionTestOf4");
    }
    public void factorialRecursionTestOf5() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(5);
        checkResult(result,120,"factorialRecursionTestOf5");
    }
    public void factorialRecursionTestOf6() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(6);
        checkResult(result,720,"factorialRecursionTestOf6");
    }
    public void factorialRecursionTestOf10() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(10);
        checkResult(result,3628800,"factorialRecursionTestOf6");
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
