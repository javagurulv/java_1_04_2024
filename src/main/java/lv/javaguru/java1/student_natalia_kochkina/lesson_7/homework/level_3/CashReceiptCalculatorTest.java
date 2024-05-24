package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_3;

class CashReceiptCalculatorTest {

    public static void main(String[] args) {
        CashReceiptCalculatorTest test = new CashReceiptCalculatorTest();
        test.test1();
        test.test2();
        test.test3();
        test.test4();
        test.test5();
        test.test6();
    }

    public void test1() {
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        CashReceipt[] receipts = {new CashReceipt(1, 2),
                new CashReceipt(2, 5)};
        double realResult = calculator.calculateSalesAmount(receipts);
        checkResults(realResult, 7,
                "SalesAmountTest1 ");
    }

    public void test2() {
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        CashReceipt[] receipts = {new CashReceipt(1, 0),
                new CashReceipt(2, 0)};
        double realResult = calculator.calculateSalesAmount(receipts);
        checkResults(realResult, 0,
                "SalesAmountTest2 ");
    }

    public void test3() {
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        CashReceipt[] receipts = {new CashReceipt(1, 3),
                new CashReceipt(2, 2)};
        double realResult = calculator.calculateAverageCost(receipts);
        checkResults(realResult, 2.5,
                "AverageCostTest1 ");
    }

    public void test4() {
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        CashReceipt[] receipts = {new CashReceipt(1, 0),
                new CashReceipt(2, 0)};
        double realResult = calculator.calculateAverageCost(receipts);
        checkResults(realResult, 0,
                "AverageCostTest2 ");
    }

    public void test5() {
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        CashReceipt[] receipts = {};
        double realResult = calculator.calculateAverageCost(receipts);
        checkResults(realResult, 0,
                "AverageCost3 ");
    }

    public void test6() {
        CashReceiptCalculator calculator = new CashReceiptCalculator();
        CashReceipt[] receipts = {};
        double realResult = calculator.calculateSalesAmount(receipts);
        checkResults(realResult, 0,
                "SalesAmountTest3 ");
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
