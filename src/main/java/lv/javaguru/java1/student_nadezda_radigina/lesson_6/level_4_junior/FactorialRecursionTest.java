package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_4_junior;

 class FactorialRecursionTest {
    public static void main(String[] args){
        FactorialRecursionTest test = new FactorialRecursionTest();
        test.test1();
        test.test2();
        test.test3();


    }
    public void test1(){
        FactorialRecursion factorialRecursion = new FactorialRecursion();
        int realResult = factorialRecursion.factorial(3);
        System.out.println(realResult);
        int expectedResult = 6;
        if (expectedResult ==  realResult) {
            System.out.println("TEST 1 = OK");
        }else {
            System.out.println("TEST 1 = FAIL");
        }
    }
     public void test2(){
         FactorialRecursion factorialRecursion = new FactorialRecursion();
         int realResult = factorialRecursion.factorial(4);
         System.out.println(realResult);
         int expectedResult = 24;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 2 = OK");
         }else {
             System.out.println("TEST 2 = FAIL");
         }
     }
     public void test3(){
         FactorialRecursion factorialRecursion = new FactorialRecursion();
         int realResult = factorialRecursion.factorial(5);
         System.out.println(realResult);
         int expectedResult = 250;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 3 = OK");
         }else {
             System.out.println("TEST 3 = FAIL");
         }
     }




}
