package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_6;

class StockCalculator {

    double calculateSumOfAssetValues(Stock[] stocks) {
        double sum = 0;
        for (int i = 0; i < stocks.length; i++) {
            sum += stocks[i].getAssetValue();
        }
        return sum;
    }

    private double calculateStockReturn(Stock stock) {
        return (stock.getReturnInPercents() / 100)
                * stock.getAssetValue();
    }

    double calculateAverageStockPortfolioReturn(Stock[] stocks) {
        double returnSum = 0;
        for (int i = 0; i < stocks.length; i++) {
            returnSum += calculateStockReturn(stocks[i]);
        }
        return (returnSum / calculateSumOfAssetValues(stocks)) * 100;
    }
}
