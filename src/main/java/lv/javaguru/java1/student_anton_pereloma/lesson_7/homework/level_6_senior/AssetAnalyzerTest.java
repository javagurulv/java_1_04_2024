package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_6_senior;

class AssetAnalyzerTest {

    public static void main(String[] args) {
        AssetAnalyzerTest test = new AssetAnalyzerTest();
        test.checkAssetSumOfThreeItemsArray();
        test.checkAssetSumOfItemsEmptyArray();
        test.checkAssetSumOfOneItemArray();
        test.checkMeanAssetReturnThreeItemArray();
        test.checkMeanAssetReturnOneItemArray();
        test.checkMeanAssetReturnEmptyItemArray();
    }

    public void checkAssetSumOfThreeItemsArray() {
        AssetAnalyzer assetAnalyzer = new AssetAnalyzer();
        Stock[] testStockPortfolio = {
                new Stock("tst1",10,10),
                new Stock("tst2",20,5),
                new Stock("tst3",30,7),
        };
        double result = assetAnalyzer.findAssetValueSum(testStockPortfolio);
        checkResult(result,10+20+30,"checkAssetSumOfThreeItemsArray");
    }

    public void checkAssetSumOfOneItemArray() {
        AssetAnalyzer assetAnalyzer = new AssetAnalyzer();
        Stock[] testStockPortfolio = {
                new Stock("tst1",10,10),
        };
        double result = assetAnalyzer.findAssetValueSum(testStockPortfolio);
        checkResult(result,10,"checkAssetSumOfOneItemArray");
    }


    public void checkAssetSumOfItemsEmptyArray() {
        AssetAnalyzer assetAnalyzer = new AssetAnalyzer();
        Stock[] testStockPortfolio = {};
        double result = assetAnalyzer.findAssetValueSum(testStockPortfolio);
        checkResult(result,0,"checkAssetSumOfEmptyArray");
    }

    public void checkMeanAssetReturnThreeItemArray() {
        AssetAnalyzer assetAnalyzer = new AssetAnalyzer();
        Stock[] testStockPortfolio = {
                new Stock("tst1",10,10),
                new Stock("tst2",20,5),
                new Stock("tst3",30,3),
        };
        double result = assetAnalyzer.findMeanAssetReturn(testStockPortfolio);
        checkResult(result,6.0, "checkMeanAssetReturnThreeItemArray");
    }

    public void checkMeanAssetReturnOneItemArray() {
        AssetAnalyzer assetAnalyzer = new AssetAnalyzer();
        Stock[] testStockPortfolio = {
                new Stock("tst1",10,10)
        };
        double result = assetAnalyzer.findMeanAssetReturn(testStockPortfolio);
        checkResult(result,10.0, "checkMeanAssetReturnOneItemArray");
    }

    public void checkMeanAssetReturnEmptyItemArray() {
        AssetAnalyzer assetAnalyzer = new AssetAnalyzer();
        Stock[] testStockPortfolio = {};
        double result = assetAnalyzer.findMeanAssetReturn(testStockPortfolio);
        checkResult(result,0, "checkMeanAssetReturnEmptyItemArray");
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



