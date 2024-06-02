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
     if (realResult == 1){
         System.out.println("TEST 1 = OK");
     } else {
         System.out.println("TEST 1 = FAIL");
     }
 }
    public void test2(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(3);
        if (realResult == 6){
            System.out.println("TEST 2 = OK");
        } else {
            System.out.println("TEST 2 = FAIL");
        }
    }
    public void test3(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(6);
        if (realResult == 720){
            System.out.println("TEST 3 = OK");
        } else {
            System.out.println("TEST 3 = FAIL");
        }
    }
    public void test4(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(0);
        if (realResult == 1){
            System.out.println("TEST 4 = OK");
        } else {
            System.out.println("TEST 4 = FAIL");
        }
    }
}
