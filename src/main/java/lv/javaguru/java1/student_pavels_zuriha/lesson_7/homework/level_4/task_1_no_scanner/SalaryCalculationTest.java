package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_4.task_1_no_scanner;

class SalaryCalculationTest {

    public static void main(String[] args) {

        SalaryCalculationTest test = new SalaryCalculationTest();
        test.shouldReturnSumSalary();
        test.shouldReturnMinSalary();
        test.shouldReturnMaxSalary();
        test.shouldReturnAverageSalary();
        test.shouldReturnZeroSumSalary();
        test.shouldReturnZeroMinSalary();
        test.shouldReturnZeroMaxSalary();
        test.shouldReturnZeroAverageSalary();
    }

    public void shouldReturnSumSalary() {

        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double[] employeeSalaryArray = {1.2,1.6,2.4};
        double realResult = salaryCalculation.employeeSalarySum(employeeSalaryArray);
        checkResult(realResult, 5.2, "shouldReturnSumSalary");

    }

    public void shouldReturnMinSalary() {
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double[] employeeSalaryArray = {1.2,1.6,2.4};
        double realResult = salaryCalculation.employeeSalaryMin(employeeSalaryArray);
        checkResult(realResult, 1.2, "shouldReturnMinSalary");
    }

    public void shouldReturnMaxSalary() {
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double[] employeeSalaryArray = {1.2,1.6,2.4};
        double realResult = salaryCalculation.employeeSalaryMax(employeeSalaryArray);
        checkResult(realResult, 2.4, "shouldReturnMaxSalary");
    }

    public void shouldReturnAverageSalary() {
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double[] employeeSalaryArray = {1.2,1.6,2.4};
        double realResult = salaryCalculation.employeeSalaryAverage(employeeSalaryArray);
        checkResult(realResult, 1.73333333333, "shouldReturnAverageSalary");
    }

    public void shouldReturnZeroSumSalary() {
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double[] employeeSalaryArray = {};
        double realResult = salaryCalculation.employeeSalarySum(employeeSalaryArray);
        checkResult(realResult, 0, "shouldReturnZeroSumSalary");
    }

    public void shouldReturnZeroMinSalary() {
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double[] employeeSalaryArray = {};
        double realResult = salaryCalculation.employeeSalaryMin(employeeSalaryArray);
        checkResult(realResult, 0, "shouldReturnZeroMinSalary");
    }

    public void shouldReturnZeroMaxSalary() {
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double[] employeeSalaryArray = {};
        double realResult = salaryCalculation.employeeSalaryMax(employeeSalaryArray);
        checkResult(realResult, 0, "shouldReturnZeroMaxSalary");
    }

    public void shouldReturnZeroAverageSalary() {
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double[] employeeSalaryArray = {};
        double realResult = salaryCalculation.employeeSalaryAverage(employeeSalaryArray);
        checkResult(realResult, 0, "shouldReturnZeroAverageSalary");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
