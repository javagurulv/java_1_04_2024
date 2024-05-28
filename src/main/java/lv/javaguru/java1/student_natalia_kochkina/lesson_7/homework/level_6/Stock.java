package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_6;

class Stock {

    private String ticker;  // stock name
    private double assetValue;
    private double returnInPercents;

    Stock(String ticker,
                 double assetValue,
                 double returnInPercents) {
        this.ticker = ticker;
        this.assetValue = assetValue;
        this.returnInPercents = returnInPercents;
    }

    String getTicker() {
        return ticker;
    }

    double getAssetValue() {
        return assetValue;
    }

    double getReturnInPercents() {
        return returnInPercents;
    }
}
