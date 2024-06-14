package lv.javaguru.java1.student_maksims_latkovskis.level_6_unit_testing.homework.level_7_senior;

public class CompoundInterestCalculatorTest {

    public static void main(String[] args){
        CompoundInterestCalculatorTest test = new CompoundInterestCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
    }

    void test1(){
        // sum = 100, interest = 5, years = 2; Expected output: 110.25
        CompoundInterestCalculator calc = new CompoundInterestCalculator();
        double compoundOutput = calc.compoundInterest(100, 5, 2);
        if(compoundOutput == 110.25) System.out.println("Test 1 Pass");
        else System.out.println("Test 1 Fail");

    }

    void test2(){
        // sum = 0, interest = 5, years = 2; Expected output: 0
        CompoundInterestCalculator calc = new CompoundInterestCalculator();
        double compoundOutput = calc.compoundInterest(0, 5, 2);
        if(compoundOutput == 0) System.out.println("Test 2 Pass");
        else System.out.println("Test 2 Fail");

    }

    void test3(){
        // sum = 100, interest = 0, years = 2; Expected output: 0
        CompoundInterestCalculator calc = new CompoundInterestCalculator();
        double compoundOutput = calc.compoundInterest(100, 0, 2);
        if(compoundOutput == 100) System.out.println("Test 3 Pass");
        else System.out.println("Test 3 Fail");

    }

    void test4(){
        // sum = 100, interest = 5, years = 0; Expected output: 0
        CompoundInterestCalculator calc = new CompoundInterestCalculator();
        double compoundOutput = calc.compoundInterest(100, 5, 0);
        if(compoundOutput == 100) System.out.println("Test 4 Pass");
        else System.out.println("Test 4 Fail");

    }




}
