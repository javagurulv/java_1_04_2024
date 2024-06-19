package lv.javaguru.java1.student_nadezda_radigina.lesson_7.level_4_middle;

 class SalaryCalculatorTest {
     public static void main(String[] args){
         SalaryCalculatorTest test = new SalaryCalculatorTest();
         test.test1();
         test.test2();
         test.test3();
         test.test4();

     }

     void test1(){
        SalaryCalculator calculator = new SalaryCalculator();
        double[] salaries  = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        double realResult = calculator.findTotalSalary(salaries);
        checkResult(realResult, 14400.0, "Test 1");
     }
     void test2(){
         SalaryCalculator calculator = new SalaryCalculator();
         double[] salaries  = {7000.0, 3200.0, 1900.0, 4000.0, 2900.0};
         double realResult = calculator.findMinSalary(salaries);
         checkResult(realResult, 1900.0, "Test 2");
     }
     void test3(){
         SalaryCalculator calculator = new SalaryCalculator();
         double[] salaries  = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
         double realResult = calculator.findMaxSalary(salaries);
         checkResult(realResult, 4000.0, "Test 3");
     }
     void test4(){
         SalaryCalculator calculator = new SalaryCalculator();
         double[] salaries  = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
         double realResult = calculator.calculateAverageSalary(salaries);
         checkResult(realResult, 2880.0, "Test 4");
     }




     private void checkResult(double realResult, double expectedResult,String testScenarioName){
         if (realResult == expectedResult){
             System.out.println(testScenarioName + ": OK");
         } else {
             System.out.println(testScenarioName + ": FAIL");
         }


     }


}
