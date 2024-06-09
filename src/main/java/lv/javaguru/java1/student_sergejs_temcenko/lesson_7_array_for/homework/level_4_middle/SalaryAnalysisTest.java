package lv.javaguru.java1.student_sergejs_temcenko.lesson_7_array_for.homework.level_4_middle;

class SalaryAnalysisTest {

    public static void main(String[] args) {
        SalaryAnalysisTest test = new SalaryAnalysisTest();
        test.totalSalaryTest();
        test.minSalaryTest();
        test.maxSalaryTest();
        test.averageSalaryTest();
    }

    public void totalSalaryTest (){
        SalaryAnalysis salaryAnalysis = new SalaryAnalysis();
        double[] salaries = {10.0, 20.0, 80.0, 40.0, 50.0};
        double totalSalaryFinal = salaryAnalysis.getTotalSalaries(salaries);
        checkResult(totalSalaryFinal, 200.0, "totalSalaryTest " + totalSalaryFinal);
    }

    public void minSalaryTest (){
        SalaryAnalysis salaryAnalysis = new SalaryAnalysis();
        double[] salaries = {10.0, 20.0, 80.0, 40.0, 50.0};
        double minSalary = salaryAnalysis.getMinSalaries(salaries);
        checkResult(minSalary, 10.0, "minSalaryTest " + minSalary);
    }

    public void maxSalaryTest (){
        SalaryAnalysis salaryAnalysis = new SalaryAnalysis();
        double[] salaries = {10.0, 20.0, 80.0, 40.0, 50.0};
        double maxSalary = salaryAnalysis.getMaxSalaries(salaries);
        checkResult(maxSalary, 80.0, "maxSalaryTest " + maxSalary);
    }

    public void averageSalaryTest (){
        SalaryAnalysis salaryAnalysis = new SalaryAnalysis();
        double[] salaries = {10.0, 20.0, 80.0, 40.0, 50.0};
        double averageSalary = salaryAnalysis.getAverageSalary(salaries);
        checkResult(averageSalary, 40.0, "averageSalaryTest " + averageSalary);
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testName + ": TEST OK!");
        } else {
            System.out.println(testName + ": TEST FAIL!");
        }
    }

}
