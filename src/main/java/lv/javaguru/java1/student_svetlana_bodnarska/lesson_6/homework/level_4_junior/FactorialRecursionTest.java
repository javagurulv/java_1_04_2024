package lv.javaguru.java1.student_svetlana_bodnarska.lesson_6.homework.level_4_junior;

class FactorialRecursionTest
{
    // 1. n = 1 -> 1
    // 2. n = 3 -> 6
    // 3. n = 6 -> 720
    // 4. n = 0 -> 1

    public static void main(String[] args) {
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

 public void test1(){
     FactorialRecursion factorialRecursion = new FactorialRecursion();
     int realResult = factorialRecursion.factorial(1);
     checkResult(realResult, 1, "1");

 }
    public void test2(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(3);
        checkResult(realResult, 6, "2");

    }
    public void test3(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(6);
        checkResult(realResult, 720, "3");

    }
    public void test4(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(0);
        checkResult(realResult, 1, "4");
    }
    private void checkResult (int realResult, int expectedResult, String testName){
        if (realResult == expectedResult){
            System.out.println("TEST " + testName + " OK");
        } else {
            System.out.println("TEST " + testName + " FAIL");
        }
    }
}
