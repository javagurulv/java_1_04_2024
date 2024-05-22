package lv.javaguru.java1.student_pavels_zuriha.lesson_6.homework.level_4.task_2;

class FactorialRecursionTest {
    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.factorialTest();
        test.factorialTest1();
        test.factorialTest2();
        test.factorialTest3();


    }

    public void factorialTest() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(4);
        checkResult(realResult, 24);

    }

    public void factorialTest1() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(9);
        checkResult(realResult, 362880);
    }

    public void factorialTest2() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(7);
        checkResult(realResult, 5040);
    }

    public void factorialTest3() {
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(0);
        checkResult(realResult, 1);
    }

    private void checkResult(int realResult, int expectedResult) {
        if (realResult == expectedResult) {
            System.out.println("Test is ok");
        } else {
            System.out.println ("Test failed");
        }
    }
}
