package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_2_intern;

 class MaxOfThreeNumbersTest {
     public static void main(String[] args){
         MaxOfThreeNumbersTest test = new MaxOfThreeNumbersTest();
         test.test1();
         test.test2();
         test.test3();
         test.test4();
     }

     public void test1(){
         MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
         int realResult = maxOfThreeNumbers.findMax(1, 2, 3);
         int expectedResult = 3;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 1 = OK");
         }else {
             System.out.println("TEST 1 = FAIL");
         }
     }
     public void test2(){
         MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
         int realResult = maxOfThreeNumbers.findMax(1, 2, 3);
         int expectedResult = 1;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 2 = OK");
         }else {
             System.out.println("TEST 2 = FAIL");
         }
     }
     public void test3(){
         MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
         int realResult = maxOfThreeNumbers.findMax(1, 2, 3);
         int expectedResult = 2;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 2 = OK");
         }else {
             System.out.println("TEST 2 = FAIL");
         }
     }
     public void test4(){
         MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
         int realResult = maxOfThreeNumbers.findMax(8, 2, 3);
         int expectedResult = 8;
         if (expectedResult ==  realResult) {
             System.out.println("TEST 2 = OK");
         }else {
             System.out.println("TEST 2 = FAIL");
         }
     }
}
