package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_4;

class FactorialRecursionTest {

    public static void main(String[] args) {
      FactorialRecursionTest test = new FactorialRecursionTest();
      test.testFactorialOf5();
      test.testFactorialOf3();
      test.testFactorialOf0();
    }

    // input  : 5
    // output : 120
    public void testFactorialOf5(){
        FactorialRecursion factorial = new FactorialRecursion();
        int result = factorial.factorial(5);
        int expectedResult = 120;
        if (result == expectedResult) {
            System.out.println("TEST FactorialOf5: OK");
        } else {
            System.out.println("TEST FactorialOf5: FAILED (expected " + expectedResult + ", received " + result +")");
        }
    }

    // input  : 3
    // output : 6
    public void testFactorialOf3(){
        FactorialRecursion factorial = new FactorialRecursion();
        int result = factorial.factorial(3);
        int expectedResult = 6;
        if (result == expectedResult) {
            System.out.println("TEST FactorialOf3: OK");
        } else {
            System.out.println("TEST FactorialOf3: FAILED (expected " + expectedResult + ", received " + result +")");
        }
    }

    // input  : 0
    // output : 1
    public void testFactorialOf0(){
        FactorialRecursion factorial = new FactorialRecursion();
        int result = factorial.factorial(0);
        int expectedResult = 1;
        if (result == expectedResult) {
            System.out.println("TEST FactorialOf0: OK");
        } else {
            System.out.println("TEST FactorialOf0: FAILED (expected " + expectedResult + ", received " + result +")");
        }
    }

}
