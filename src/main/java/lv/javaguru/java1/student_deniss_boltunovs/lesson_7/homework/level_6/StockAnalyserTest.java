package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_6;

class StockAnalyserTest {

    public static void main(String[] args) {
        StockAnalyserTest test = new StockAnalyserTest();
        test.testTotalAssetValue();
        test.testAverageReturnInPercent();
        test.testTotalAssetValueEmptyArray();
        test.testAverageReturnInPercentEmptyArray();
    }

    /// assetValue: 1500, 675 -> 2175
    public void testTotalAssetValue(){
        Stock[] stocks = { new Stock("APPL", 1500.00, 15.5),
                           new Stock("PG", 675.00, 37.6)};
        StockAnalyser analyser = new StockAnalyser();
        double realResult = analyser.calculateTotalAssetValue(stocks);
        double expectedResult = 2175;
        checkResult(realResult, expectedResult, "testTotalAssetValue");
    }

    /// assetValue: 15.5, 37.6 -> 53.1
    public void testAverageReturnInPercent(){
        Stock[] stocks = { new Stock("APPL", 1500.00, 15.5),
                new Stock("PG", 675.00, 37.6)};
        StockAnalyser analyser = new StockAnalyser();
        double realResult = analyser.calculateAverageReturnInPercent(stocks);
        double expectedResult = 26.55;
        checkResult(realResult, expectedResult, "testAverageReturnInPercent");
    }

    /// assetValue: 1500, 675 -> 2175
    public void testTotalAssetValueEmptyArray(){
        Stock[] stocks = {};
        StockAnalyser analyser = new StockAnalyser();
        double realResult = analyser.calculateTotalAssetValue(stocks);
        double expectedResult = 0;
        checkResult(realResult, expectedResult, "testTotalAssetValueEmptyArray");
    }

    /// assetValue:  -> 0
    public void testAverageReturnInPercentEmptyArray(){
        Stock[] stocks = {};
        StockAnalyser analyser = new StockAnalyser();
        double realResult = analyser.calculateAverageReturnInPercent(stocks);
        double expectedResult = 0;
        checkResult(realResult, expectedResult, "testAverageReturnInPercentEmptyArray");
    }

    private void checkResult(double realResult,
                             double expectedResult,
                             String testName){
        if (realResult == expectedResult){
            System.out.println(testName + ": OK");
        } else {
            System.out.println(testName + ": FAILED (expected " + expectedResult + ", received " + realResult + ")");
        }
    }

}
