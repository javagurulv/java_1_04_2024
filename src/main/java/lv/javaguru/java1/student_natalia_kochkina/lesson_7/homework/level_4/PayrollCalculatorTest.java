package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_4;

class PayrollCalculatorTest {

    public static void main(String[] args) {
        PayrollCalculatorTest test = new PayrollCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
    }

    //sum, 2.5, 3 -> 5,5
    public void test1() {
        PayrollCalculator calculator = new PayrollCalculator();
        double[] salaries = {2.5, 3};
        double realResult = calculator.calculateSalarySum(salaries);
        checkResults(realResult, 5.5, "Sum Test = ");
    }

    //min, 2, 5, 4 -> 2
    public void test2() {
        PayrollCalculator calculator = new PayrollCalculator();
        double[] salaries = {2, 5, 4};
        double realResult = calculator.calculateMinSalary(salaries);
        checkResults(realResult, 2, "Min Test = ");
    }

    //max, 2, 5, 1000 -> 1000
    public void test3() {
        PayrollCalculator calculator = new PayrollCalculator();
        double[] salaries = {2, 5, 1000};
        double realResult = calculator.calculateMaxSalary(salaries);
        checkResults(realResult, 1000, "Max Test = ");
    }

    //average, 2, 5 -> 3.5
    public void test4() {
        PayrollCalculator calculator = new PayrollCalculator();
        double[] salaries = {2, 5};
        double realResult = calculator.calculateAverageSalary(salaries);
        checkResults(realResult, 3.5, "Average Test = ");
    }

    //sigma, 3, 6 -> 1.5
    public void test5() {
        PayrollCalculator calculator = new PayrollCalculator();
        double[] salaries = {3, 6};
        double realResult = calculator.calculateSigma(salaries);
        checkResults(realResult, 1.5, "Sigma Test = ");
    }


    private void checkResults(double realResult, double expectedResult,
                              String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + "TEST OK");
        } else {
            System.out.println(testScenarioName + "TEST FAIL");
        }
    }

}
