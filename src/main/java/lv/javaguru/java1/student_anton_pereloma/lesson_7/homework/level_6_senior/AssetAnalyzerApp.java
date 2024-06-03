package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_6_senior;

class AssetAnalyzerApp {
    public static void main(String[] args) {
        AssetAnalyzer assetAnalyzer = new AssetAnalyzer();
        Stock[] stocks = {
                new Stock("goog",10,5),
                new Stock("tsla",1,3),
                new Stock("nvda",5,10)
        };
        System.out.println(assetAnalyzer.findAssetValueSum(stocks));
        System.out.println(assetAnalyzer.findMeanAssetReturn(stocks));


    }
}
