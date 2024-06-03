package lv.javaguru.java1.student_sergejs_temcenko.lesson_6_unit_testing.homework.level_4_junior;

class FactorialRecursionTest {

    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.test1();
        test.test2();
        test.test3();

    }

    // 1. 0;  expected 1.
    public void test1(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(0);
        testCheck(result, 1, "test1:");

    }

    // 1. 1;  expected 1.
    public void test2(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(1);
        testCheck(result, 1, "test2:");

    }

    // 1. 5;  expected 120.
    public void test3(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int result = factorialRecursion.factorial(5);
        testCheck(result, 120, "test3:");

    }


    private void testCheck (int result,
                            int expected,
                            String testName) {
        if (result == expected) {
            System.out.println(testName + " OK " + result);
        } else {
            System.out.println(testName + " FAILED");
        }
    }
}


