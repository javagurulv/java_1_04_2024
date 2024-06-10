package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_6;

class AssetAnalysisTest {
    public static void main(String[] args) {
        AssetAnalysisTest test = new AssetAnalysisTest();
        test.test1();
        test.test2();
    }

    Stock[] createTestArray() {
        Stock[] array = {new Stock("MSFT", 425.0, 4.0),
                new Stock("NVDA", 122.0, 8.0),
                new Stock("AAPL", 200.0, 10.0)};
        return array;
    }

    void test1() {
        AssetAnalysis assetAnalysis = new AssetAnalysis();
        double actualResult = assetAnalysis.calculateTotalAssetValue(createTestArray());
        checkResult(actualResult, 747.0, "ShouldCalculateTotalAssetValueTest1");
    }

    void test2() {
        AssetAnalysis assetAnalysis = new AssetAnalysis();
        double actualResult = valueFormattingWithMathRound(assetAnalysis.calculateAverageReturnPercentage(createTestArray()), 2);
        checkResult(actualResult, 6.26, "ShouldCalculateAverageReturnPercentageTest2");
    }

    static double valueFormattingWithMathRound(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    void checkResult(double actualResult, double expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
