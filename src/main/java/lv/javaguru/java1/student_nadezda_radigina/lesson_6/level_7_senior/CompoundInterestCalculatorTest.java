package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_7_senior;

 class CompoundInterestCalculatorTest {

     public static void main(String[] args){
         CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
         test.test1();
         test.test2();
         test.test3();
         test.test4();
         //test.test5();
     }

     // sum = 0;
     // interest = 0;
     // years = 0;  can't divide by zero
     // normal sum, interest, year

     public void test1(){
         CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
         double realResult = compoundInterestCalculator.compoundInterest(0, 3, 1);
         double expectedResult = 0;
         if (realResult == (expectedResult)){
             System.out.println("TEST 1 = OK");
         }else {
             System.out.println("TEST 1 = FAIL");
         }

     }
     public void test2(){
         CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
         double realResult = compoundInterestCalculator.compoundInterest(2000, 0, 1);
         double expectedResult = 2000;
         if (realResult == (expectedResult)){
             System.out.println("TEST 2 = OK");
         }else {
             System.out.println("TEST 2 = FAIL");
         }

     }
     public void test3(){
         CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
         double realResult = compoundInterestCalculator.compoundInterest(7000, 0, 0);
         double expectedResult = 7000;
         if (realResult == (expectedResult)){
             System.out.println("TEST 3 = OK");
         }else {
             System.out.println("TEST 3 = FAIL");
         }

     }

          public void test4(){
         CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
         double realResult = compoundInterestCalculator.compoundInterest(1000, 5, 1);
         double expectedResult = 1050;
         if (realResult == (expectedResult)){
             System.out.println("TEST 4 = OK");
         }else {
             System.out.println("TEST 4 = FAIL");
         }

     }

    /* public void test5(){
         CompoundInterestCalculator compoundInterestCalculator = new CompoundInterestCalculator();
         double expectedResult = compoundInterestCalculator.compoundInterest(7000, 3, 4);
         System.out.println(expectedResult);
         double realResult = compoundInterestCalculator.compoundInterest(7000, 3, 4);
         if (realResult == (expectedResult)){
             System.out.println("TEST 5 = OK");
         }else {
             System.out.println("TEST 5 = FAIL");
         }

     }*/



 }
