package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lavel_3_junior;

 class AverageCheckAndTotalTest {
     public static void main(String[] args){
         AverageCheckAndTotalTest test = new AverageCheckAndTotalTest();
         test.test1();
         test.test2();

     }

     void test1(){
         Check[] checks = {
                 new Check(1, 200),
                 new Check(2, 300),
                 new Check(3, 150),
                 new Check(4, 400),
                 new Check(5, 500),
         };
         AverageCheckAndTotal calculator = new AverageCheckAndTotal();
         double totalAmount = calculator.calculateTotalAmount(checks);
         System.out.println("Total amount of purchases " + totalAmount);
         double averageCheck = calculator.calculateAverageCheck(checks);
         System.out.println("Average customer check " + averageCheck);

         double realResult = calculator.calculateTotalAmount(checks);
         double expectedResult = 1550;
         if (realResult == (expectedResult)){
             System.out.println("TEST 1 = OK");
         }else {
             System.out.println("TEST 1 = FAIL");
         }
     }
     void test2(){
         Check[] checks = {
                 new Check(0, 0),
                 new Check(0, 0),
                 new Check(0, 0),
                 new Check(0, 0),
                 new Check(0, 0),
         };
         AverageCheckAndTotal calculator = new AverageCheckAndTotal();
         double totalAmount = calculator.calculateTotalAmount(checks);
         System.out.println("Total amount of purchases " + totalAmount);
         double averageCheck = calculator.calculateAverageCheck(checks);
         System.out.println("Average customer check " + averageCheck);

         double realResult = calculator.calculateAverageCheck(checks);
         double expectedResult = 0;
         if (realResult == (expectedResult)){
             System.out.println("TEST 1 = OK");
         }else {
             System.out.println("TEST 1 = FAIL");
         }

     }
 }
