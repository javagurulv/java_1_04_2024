package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_6;

class StockAnalyser {

    public double calculateAverageReturnInPercent(Stock[] stocks) {
        if ( !(isNullOrEmptyArray(stocks)) ) {
            double totalReturnInPercent = calculateTotalReturnInPercents(stocks);
            return (totalReturnInPercent / (double) stocks.length);
        } else {
            return 0;
        }
    }

    public double calculateTotalAssetValue(Stock[] stocks){
        double totalAssetValue = 0;
        for (Stock stock : stocks) {
            totalAssetValue += stock.getAssetValue();
        }
        return totalAssetValue;
    }

    private double calculateTotalReturnInPercents(Stock[] stocks){
        double totalReturnInPercents = 0;
        for (Stock stock : stocks) {
            totalReturnInPercents += stock.getReturnInPercents();
        }
        return totalReturnInPercents;
    }

    private boolean isNullOrEmptyArray(Stock[] stocks){
        return (stocks == null) || (stocks.length == 0);
    }

}
