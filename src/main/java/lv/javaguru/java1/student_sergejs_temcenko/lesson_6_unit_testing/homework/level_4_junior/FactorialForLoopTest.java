package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_4_junior;

class FactorialForLoopTest {

    public static void main(String[] args) {

        FactorialForLoopTest test = new FactorialForLoopTest();
        test.test1();
        test.test2();
        test.test3();

    }

    // 1. 4; expected 24.
    public void test1() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(4);
        testCheck(result, 24, "Test1:");
    }

    // 1. 0; expected 1.
    public void test2() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(0);
        testCheck(result, 1, "Test2:");

    }

    // 1. 1; expected 1.
    public void test3() {
        FactorialForLoop factorialForLoop = new FactorialForLoop();
        int result = factorialForLoop.factorial(1);
        testCheck(result, 1, "Test3:");
    }


    private void testCheck(int result,
                           int expected,
                           String testName) {
        if (result == expected) {
            System.out.println(testName + " OK" + result);
        } else {
            System.out.println(testName + " NOT OK");
        }
    }


}
