package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_4_junior;

class FactorialForLoopTest {
    // 1. n = 0 -> 1;
    // 2. n = 1 -> 1;
    // 3. n = 4 -> 24

    public static void main(String[] args) {
        FactorialForLoopTest test = new FactorialForLoopTest();
        test.test1();
        test.test2();
        test.test3();
    }

    public void test1() {
        FactorialForLoop factorial = new FactorialForLoop();
        int realResult = factorial.factorial(0);
        checkResult(realResult, 1, "1");

    }
    public void test2() {
        FactorialForLoop factorial = new FactorialForLoop();
        int realResult = factorial.factorial(1);
        checkResult(realResult, 1, "2");

    }
    public void test3() {
        FactorialForLoop factorial = new FactorialForLoop();
        int realResult = factorial.factorial(4);
        checkResult(realResult, 24, "3");
    }
    private void checkResult (int realResult, int expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println ("TEST " + testName + " OK");
        } else {
            System.out.println ("TEST " + testName + " FAIL");
        }
    }
}