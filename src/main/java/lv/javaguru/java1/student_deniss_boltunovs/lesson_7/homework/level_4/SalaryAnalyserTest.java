package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_4;

class SalaryAnalyserTest {

    public static void main(String[] args) {
        SalaryAnalyserTest test = new SalaryAnalyserTest();
        test.testTotalSalary();
        test.testMinSalary();
        test.testMaxSalary();
        test.testAvgSalary();
        test.testZeroAvgSalary();
        test.testStandardDeviationOfSalary();
    }

    // salaries {2500.0, 3200.0, 1800.0, 4000.0, 2900.0} -> 14400
    public void testTotalSalary(){
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        SalaryAnalyser analyser = new SalaryAnalyser();
        double realResult = analyser.totalSalary(salaries);
        double expectedResult = 14400;
        checkResult(realResult, expectedResult,"testTotalSalary");
    }

    // salaries {2500.0, 3200.0, 1800.0, 4000.0, 2900.0} -> 1800
    public void testMinSalary(){
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        SalaryAnalyser analyser = new SalaryAnalyser();
        double realResult = analyser.minSalary(salaries);
        double expectedResult = 1800;
        checkResult(realResult, expectedResult,"testMinSalary");
    }

    // salaries {2500.0, 3200.0, 1800.0, 4000.0, 2900.0} -> 4000
    public void testMaxSalary(){
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        SalaryAnalyser analyser = new SalaryAnalyser();
        double realResult = analyser.maxSalary(salaries);
        double expectedResult = 4000;
        checkResult(realResult, expectedResult,"testMaxSalary");
    }

    // salaries {2500.0, 3200.0, 1800.0, 4000.0, 2900.0} -> 4000
    public void testAvgSalary(){
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        SalaryAnalyser analyser = new SalaryAnalyser();
        double realResult = analyser.avgSalary(salaries);
        double expectedResult = 2880;
        checkResult(realResult, expectedResult,"testAvgSalary");
    }

    // salaries {} -> 0
    public void testZeroAvgSalary(){
        double[] salaries = {};
        SalaryAnalyser analyser = new SalaryAnalyser();
        double realResult = analyser.avgSalary(salaries);
        double expectedResult = 0;
        checkResult(realResult, expectedResult,"testZeroAvgSalary");
    }

    // salaries {2500.0, 3200.0, 1800.0, 4000.0, 2900.0} -> 730.479294709987
    public void testStandardDeviationOfSalary(){
        double[] salaries = {2500.0, 3200.0, 1800.0, 4000.0, 2900.0};
        SalaryAnalyser analyser = new SalaryAnalyser();
        double realResult = analyser.standardDeviation(salaries);
        double expectedResult = 730.479294709987;
        checkResult(realResult, expectedResult,"testStandardDeviationOfSalary");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testName){
        if (realResult == expectedResult){
           System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED (expected " + expectedResult + ", received " + realResult +")");
        }
    }

}
