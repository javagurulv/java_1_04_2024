package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_6;

class StockCalculator {

    public double assetValueSum(Stock[] stocks) {

        double sum = 0.0;
        for (int i = 0; i < stocks.length; i++) {
            Stock stock = stocks[i];
            sum += stock.getAssetValue();
        }
        return sum;
    }

    public double calculateProfitPercentage(Stock[] stocks) {

        double profit = 0.0;
        for (int i = 0; i < stocks.length; i++) {
            Stock stock = stocks[i];
            profit = profit + stock.getAssetValue() / 100 * stock.getReturnInPercents();
        }

        return profit;
    }

    public double calculateProfitPercentageAverage(Stock[] stocks) {

        StockCalculator stockCalculator = new StockCalculator();
        double profitPercentage = stockCalculator.calculateProfitPercentage(stocks);
        return profitPercentage / stocks.length;
    }
}
