package lv.javaguru.java1.student_natalia_kochkina.lesson_6.homework.level_4.task_2;

class FactorialRecursionTest {

    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    public void test1() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(2);
        checkResult(realResult, 2, "factorialTest1 ");
    }

    public void test2() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(5);
        checkResult(realResult, 120, "factorialTest2 ");
    }

    public void test3() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(4);
        checkResult(realResult, 24, "factorialTest3 ");
    }

    public void test4() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(1);
        checkResult(realResult, 1, "factorialTest4 ");
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
