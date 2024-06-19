package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lesson_11_06;

 class MinGradeCalculatorTest {
     public static void main(String[] args){
         MinGradeCalculatorTest test = new MinGradeCalculatorTest();

        // test.test0();
         test.test1();
         test.test2();
         //test.testNull();


     }

     /*void test0(){
         MinGradeCalculator calculator = new MinGradeCalculator();
         int[] grades = {};
         int realResult = calculator.findMinGrade(grades);
         checkResult(realResult, 1, "TEST 0");
     }*/


     void test1(){
         MinGradeCalculator calculator = new MinGradeCalculator();
         int[] grades = {1, 4, 6, 8, 2};
         int realResult = calculator.findMinGrade(grades);
         checkResult(realResult, 1, "TEST 1");
     }


     void test2(){
         MinGradeCalculator calculator = new MinGradeCalculator();
         int[] grades = {6, 7, 9, 8, 3};
         int realResult = calculator.findMinGrade(grades);
         checkResult(realResult, 3, "TEST 2");
     }

     /*void testNull(){
         MinGradeCalculator calculator = new MinGradeCalculator();
         int[] grades = null;
         int realResult = calculator.findMinGrade(grades);
         checkResult(realResult, 8, "TEST Null");
     }*/




     private void checkResult(int realResult, int expectedResult,String testScenarioName){
         if (realResult == expectedResult){
             System.out.println(testScenarioName + ": OK");
         } else {
             System.out.println(testScenarioName + ": FAIL");
         }


     }

 }

