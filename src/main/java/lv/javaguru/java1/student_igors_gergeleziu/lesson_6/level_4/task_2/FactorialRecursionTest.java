package lv.javaguru.java1.student_igors_gergeleziu.lesson_6.level_4.task_2;


class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.test1();
        test.test2();
        test.test3();
    }

    void test1() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int actualResult = factorialRecursion.factorial(0);
        checkResult(actualResult, 1, "factorialOfZeroTest1");
    }

    void test2() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int actualResult = factorialRecursion.factorial(1);
        checkResult(actualResult, 1, "factorialOfOneTest2");
    }

    void test3() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int actualResult = factorialRecursion.factorial(4);
        checkResult(actualResult, 24, "factorialOfFourTest3");
    }

    void checkResult(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
