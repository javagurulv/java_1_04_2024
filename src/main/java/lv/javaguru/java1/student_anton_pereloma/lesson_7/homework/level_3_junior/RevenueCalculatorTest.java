package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_3_junior;

class RevenueCalculatorTest {
    public static void main(String[] args) {
        RevenueCalculatorTest test = new RevenueCalculatorTest();
        test.expecting2AsMeanCalculation();
        test.expecting10AsMeanCalculation();
        test.expecting22p22AsMeanCalculation();
        test.expecting1AsMeanCalculation();
        test.expecting1p5AsMeanCalculation();
        test.expecting0AsMeanCalculation();


    }
// Test case 1. purchase amount = {1,2,3}
// Test case 2. purchase amount = {10,10,10}
// Test case 3. purchase amount = {11.11,22.22,33.33}
// Test case 4. purchase amount = {0.11,0.22,0.33}
// Test case 6. purchase amount = {}

    public void expecting2AsMeanCalculation() {
        RevenueCalculator revenueCalculator = new RevenueCalculator();
        PaymentReceipt[] testArray = {
                new PaymentReceipt(1,1),
                new PaymentReceipt(2,2),
                new PaymentReceipt(3,3)
        };
        double result = revenueCalculator.calculateMeanRevenue(testArray);
        checkResult(result,2,"expecting2AsMeanCalculation");
    }

    public void expecting10AsMeanCalculation() {
    RevenueCalculator revenueCalculator = new RevenueCalculator();
    PaymentReceipt[] testArray = {
            new PaymentReceipt(1,10),
            new PaymentReceipt(2,10),
            new PaymentReceipt(3,10)
        };
    double result = revenueCalculator.calculateMeanRevenue(testArray);
    checkResult(result,10,"expecting1AsMeanCalculation");
    }

    public void expecting22p22AsMeanCalculation() {
    RevenueCalculator revenueCalculator = new RevenueCalculator();
    PaymentReceipt[] testArray = {
            new PaymentReceipt(1,11.11),
            new PaymentReceipt(2,22.22),
            new PaymentReceipt(3,33.33)
        };
    double result = revenueCalculator.calculateMeanRevenue(testArray);
    checkResult(result,22.22,"expecting22p22AsMeanCalculation");
    }

    public void expecting1AsMeanCalculation() {
    RevenueCalculator revenueCalculator = new RevenueCalculator();
    PaymentReceipt[] testArray = {
            new PaymentReceipt(1,3),
            new PaymentReceipt(2,0),
            new PaymentReceipt(3,0)
        };
    double result = revenueCalculator.calculateMeanRevenue(testArray);
    checkResult(result,1,"expecting1AsMeanCalculation");
    }

    public void expecting1p5AsMeanCalculation() {
    RevenueCalculator revenueCalculator = new RevenueCalculator();
    PaymentReceipt[] testArray = {
            new PaymentReceipt(1,3),
            new PaymentReceipt(2,0)
        };
    double result = revenueCalculator.calculateMeanRevenue(testArray);
    checkResult(result,1.5,"expecting1p5AsMeanCalculation");
    }

    public void expecting0AsMeanCalculation() {
    RevenueCalculator revenueCalculator = new RevenueCalculator();
    PaymentReceipt[] testArray = {};
    double result = revenueCalculator.calculateMeanRevenue(testArray);
    checkResult(result,0,"expecting0AsMeanCalculation");
        System.out.println(result);
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
