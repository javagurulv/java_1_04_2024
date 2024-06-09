package lv.javaguru.java1.student_nadezda_radigina.lesson_6.level_6_middle;

import java.text.DecimalFormat;

class SalaryTaxCalculatorTest {

     public static void main(String[] args){
         SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();
         test.test1();
         test.test2();
         test.test3();
         test.test4();
         test.test5();

     }

     public void test1(){
         SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
         double realResult = salaryTaxCalculator.calculate(0);
         double expectedResult = 0;
         if (realResult == (expectedResult)){
             System.out.println("TEST 1 = OK");
         }else {
             System.out.println("TEST 1 = FAIL");
         }
     }
    public void test2(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(500);
        double expectedResult = 150;
        if (realResult == (expectedResult)){
            System.out.println("TEST 2 = OK");
        }else {
            System.out.println("TEST 2 = FAIL");
        }
    }
    public void test3(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(-50);
        double expectedResult = 0;
        if (realResult == (expectedResult)){
            System.out.println("TEST 3 = OK");
        }else {
            System.out.println("TEST 3 = FAIL");
        }
    }
    public void test4(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(20000);
        double expectedResult = 7000;
        if (realResult == (expectedResult)){
            System.out.println("TEST 4 = OK");
        }else {
            System.out.println("TEST 4 = FAIL");
        }
    }
    public void test5(){
        SalaryTaxCalculator salaryTaxCalculator = new SalaryTaxCalculator();
        double realResult = salaryTaxCalculator.calculate(60000);
        double expectedResult = 24000;
        if (realResult == (expectedResult)){
            System.out.println("TEST 5 = OK");
        }else {
            System.out.println("TEST 5 = FAIL");
        }
    }



}
