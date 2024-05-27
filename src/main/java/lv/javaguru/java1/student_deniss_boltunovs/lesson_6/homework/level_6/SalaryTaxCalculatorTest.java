package lv.javaguru.java1.student_deniss_boltunovs.lesson_6.homework.level_6;

class SalaryTaxCalculatorTest {

    public static void main(String[] args) {
        SalaryTaxCalculatorTest test = new SalaryTaxCalculatorTest();

        test.testSalaryZero();
        test.testSalaryTill10k();
        test.testSalaryTill50k();
        test.testSalaryAbove50k();
    }


    // salary = 0 , result = 0
    public void testSalaryZero() {
        SalaryTaxCalculator tax = new SalaryTaxCalculator();
        double realResult = tax.calculate(0);
        double expectedResult = 0;
        checkResult(realResult,expectedResult, "testSalaryZero");
    }

    // salary = 7500 , result = 2250
    public void testSalaryTill10k() {
        SalaryTaxCalculator tax = new SalaryTaxCalculator();
        double realResult = tax.calculate(7500);
        double expectedResult = 2250;
        checkResult(realResult,expectedResult, "testSalaryTill10k");
    }

    // salary = 35000 , result = 13000
    public void testSalaryTill50k() {
        SalaryTaxCalculator tax = new SalaryTaxCalculator();
        double realResult = tax.calculate(35000);
        double expectedResult = 13000;
        checkResult(realResult,expectedResult, "testSalaryTill50k");
    }

    // salary = 57500 , result = 13000
    public void testSalaryAbove50k() {
        SalaryTaxCalculator tax = new SalaryTaxCalculator();
        double realResult = tax.calculate(57500);
        double expectedResult = 22750;
        checkResult(realResult,expectedResult, "testSalaryAbove50k");
    }

    public void checkResult(double realResult,
                            double expectedResult,
                            String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + " : OK");
        } else {
            System.out.println(testName + " : FAILED" + " (result " + realResult + ", expected " + expectedResult + ")");
        }
    }

}
