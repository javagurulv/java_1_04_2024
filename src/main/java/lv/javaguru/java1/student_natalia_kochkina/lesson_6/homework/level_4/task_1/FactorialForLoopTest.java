package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_4.task_1;

class FactorialForLoopTest {

    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(10);
        checkResult(realResult, 3628800, "factorialTest1 ");
    }

    public void test2() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(3);
        checkResult(realResult, 6, "factorialTest2 ");
    }

    public void test3() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(7);
        checkResult(realResult, 5040, "factorialTest3 ");
    }

    public void test4() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int realResult = factorialForLoop.factorial(11);
        checkResult(realResult, 39916800, "factorialTest4 ");
    }

    private void checkResult(int realResult, int expectedResult,
                                   String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST = OK");
        } else {
            System.out.println(testScenarioName + "TEST = FAIL");
        }
    }
}
