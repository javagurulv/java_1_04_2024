package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_3;

class ChequeCalculatorTest {

    public static void main(String[] args) {
        ChequeCalculatorTest test = new ChequeCalculatorTest();
        test.testTotalSalesAmount();
        test.testZeroTotalSalesAmount();
        test.testAverageSalesAmount();
        test.testZeroAverageSalesAmount();
    }

    // sales 545, 20 -> 565
    public void testTotalSalesAmount() {
        Cheque[] cheques = { new Cheque("N1", 545.0),
                             new Cheque("N2", 20.0)};
        ChequeCalculator calculator = new ChequeCalculator();
        double realResult = calculator.calculateTotalSalesAmount(cheques);
        double expectedResult = 565;
        checkResult(realResult, expectedResult, "testTotalSalesAmount");
    }

    // sales 0 -> 0
    public void testZeroTotalSalesAmount() {
        Cheque[] cheques = {};
        ChequeCalculator calculator = new ChequeCalculator();
        double realResult = calculator.calculateTotalSalesAmount(cheques);
        double expectedResult = 0.0;
        checkResult(realResult, expectedResult, "testZeroTotalSalesAmount");
    }

    // sales 545,20 -> 285.5
    public void testAverageSalesAmount() {
        Cheque[] cheques = { new Cheque("N1", 545.0),
                             new Cheque("N2", 20.0)};
        ChequeCalculator calculator = new ChequeCalculator();
        double realResult = calculator.calculateAverageSalesAmount(cheques);
        double expectedResult = 282.5;
        checkResult(realResult, expectedResult, "testAverageSalesAmount");
    }

    // sales 0 -> 0
    public void testZeroAverageSalesAmount() {
        Cheque[] cheques = {};
        ChequeCalculator calculator = new ChequeCalculator();
        double realResult = calculator.calculateAverageSalesAmount(cheques);
        double expectedResult = 0.0;
        checkResult(realResult, expectedResult, "testZeroAverageSalesAmount");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testName){
        if (realResult == expectedResult) {
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED (expected " + expectedResult + ", received " + realResult + ")");
        }
    }

}
