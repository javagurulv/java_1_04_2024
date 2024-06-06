package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_4_middle;

class SalaryAppTest {
    public static void main(String[] args) {
        SalaryAppTest test = new SalaryAppTest();
        test.salaryTotal3000();
        test.salaryTotal0();
        test.salaryMin100();
        test.salaryMin200();
        test.salaryMin0();
        test.salaryMax4000();
        test.salaryMax200();
        test.salaryMax0();
        test.salaryAvg1();
        test.salaryAvg2();
        test.salaryAvg3();
    }
//    Test case 1: salary total 3000 = {1000,1000,1000}
//    Test case 2: salary total 0 = {}
//    Test case 3: salary min 100 = {100.00, 300.00, 4000.00}
//    Test case 4: salary min 200 = {200.00, 200.00, 200.00}
//    Test case 5: salary min 0 = {}
//    Test case 6: salary max 4000 = {100.00, 300.00, 4000.00}
//    Test case 7: salary max 200 = {200.00, 200.00, 200.00}
//    Test case 8: salary max 0 = {}
//    Test case 9: salary avg 1446 = {100.00, 300.00, 4000.00}
//    Test case 10: salary avg 200 = {200.00, 200.00, 200.00}
//    Test case 11: salary max 0 = {}


    public void salaryTotal3000() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {1000.00, 1000.00, 1000.00};
        double result = salaryStatistics.calculateSalaryTotal(testArray);
        checkResult(result,3000.00,"salaryTotal3000");
    }

    public void salaryTotal0() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {};
        double result = salaryStatistics.calculateSalaryTotal(testArray);
        checkResult(result,0,"salaryTotal0");
    }

    public void salaryMin100() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {100.00, 300.00, 4000.00};
        double result = salaryStatistics.findMinSalary(testArray);
        checkResult(result,100.00,"salaryMin100");
    }

    public void salaryMin200() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {200.00, 200.00, 200.00};
        double result = salaryStatistics.findMinSalary(testArray);
        checkResult(result,200.00,"salaryMin200");
    }

    public void salaryMin0() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {};
        double result = salaryStatistics.findMinSalary(testArray);
        checkResult(result,0.00,"salaryMin0");
    }

    public void salaryMax4000() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {100.00, 300.00, 4000.00};
        double result = salaryStatistics.findMaxSalary(testArray);
        checkResult(result,4000.00,"salaryMax4000");
    }

    public void salaryMax200() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {200.00, 200.00, 200.00};
        double result = salaryStatistics.findMaxSalary(testArray);
        checkResult(result,200.00,"salaryMax200");
    }

    public void salaryMax0() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {};
        double result = salaryStatistics.findMaxSalary(testArray);
        checkResult(result,0.00,"salaryMax0");
    }

    public void salaryAvg1() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {100.00, 300.00, 4000.00};
        double result = salaryStatistics.findAverageSalary(testArray);
        checkResult(result,1466.6666666666667,"salaryAvg1");
    }

    public void salaryAvg2() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {200.00, 200.00, 200.00};
        double result = salaryStatistics.findAverageSalary(testArray);
        checkResult(result,200.00,"salaryAvg2");
    }

    public void salaryAvg3() {
        SalaryStatistics salaryStatistics = new SalaryStatistics();
        double[] testArray = {};
        double result = salaryStatistics.findAverageSalary(testArray);
        checkResult(result,0.00,"salaryAvg3");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        if (realResult == expectedResult) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL!");
        }
    }
}
