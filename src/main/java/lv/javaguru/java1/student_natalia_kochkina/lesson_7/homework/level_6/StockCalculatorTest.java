package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_6;

class StockCalculatorTest {

    public static void main(String[] args) {
        StockCalculatorTest test = new StockCalculatorTest();
        test.test1();
        test.test2();
    }

    public void test1() {
        StockCalculator calculator = new StockCalculator();
        Stock[] stocks = {
            new Stock("stock1", 10000, 10),
            new Stock("stock2", 20000, 10)
        };
        double realResult = calculator.calculateSumOfAssetValues(stocks);
        checkResults(realResult, 30000,
                "CalculateSumOfAssentValuesTest ");
    }

    public void test2() {
        StockCalculator calculator = new StockCalculator();
        Stock[] stocks = {
                new Stock("stock1", 10000, 10),
                new Stock("stock2", 20000, 10)
        };
        double realResult = calculator.calculateAverageStockPortfolioReturn(stocks);
        checkResults(realResult, 10,
                "CalculateSumOfAssentValuesTest ");
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
