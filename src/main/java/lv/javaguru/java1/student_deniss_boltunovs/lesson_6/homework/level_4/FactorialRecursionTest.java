package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_4;

class FactorialRecursionTest {

    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.test1();
        test.test2();
        test.test3();
    }

    //  number = 5, result = 120
    public void test1(){
        FactorialRecursion factorial = new FactorialRecursion();
        int result = factorial.factorial(5);
        int expectedResult = 120;
        checkResult(result, expectedResult, "test1");
    }

    //  number = 3, result = 6
    public void test2(){
        FactorialRecursion factorial = new FactorialRecursion();
        int result = factorial.factorial(3);
        int expectedResult = 6;
        checkResult(result, expectedResult, "test2");
    }

    //  number = 0, result = 1
    public void test3(){
        FactorialRecursion factorial = new FactorialRecursion();
        int result = factorial.factorial(0);
        int expectedResult = 1;
        checkResult(result, expectedResult, "test3");
    }

    public void checkResult(int realResult,
                            int expectedResult,
                            String testName) {
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAILED" + " (result " + realResult + ", expected " + expectedResult + ")");
        }
    }

}
