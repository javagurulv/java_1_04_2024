package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_6;

class StockTest {

    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.testCalculateAssetValueSum();
        test.testCalculateAverageProfitPercentage();
    }

    public void testCalculateAssetValueSum() {
        StockCalculator stockCalculator = new StockCalculator();
        Stock[] stock = {
                new Stock("Google", 10.53, 20),
                new Stock("Microsoft", 20.10, 20),
        };
        double assetValueSum = stockCalculator.assetValueSum(stock);
        checkResult(assetValueSum, 30.63, "testCalculateAssetValueSum");
    }

    public void testCalculateAverageProfitPercentage() {
        StockCalculator stockCalculator = new StockCalculator();
        Stock[] stock = {
                new Stock("Google", 10.53, 20),
                new Stock("Microsoft", 20.10, 20),
        };
        double averageProfitPercentage = stockCalculator.calculateProfitPercentageAverage(stock);
        checkResult(averageProfitPercentage, 3.063, "testCalculateAverageProfitPercentage");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testScenarioName) {
        double threshold = 0.000001d;
        if (Math.abs(realResult - expectedResult) < threshold) {
            System.out.println(testScenarioName + ": TEST OK!");
        } else {
            System.out.println(testScenarioName + ": TEST FAIL! realResult = " + realResult + " expectedResult = " + expectedResult);
        }
    }
}
