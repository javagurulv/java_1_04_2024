package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_5;

class SaleCalculator {

    public String mostSoldUnit(Sale[] sales) {

        double mostSold = 0.0;
        String mostSoldUnit = null;
        for (int i = 0; i < sales.length; i++) {
            Sale sale = sales[i];
            if (mostSold == sale.getUnitCount()) {
                mostSoldUnit = "Equals";
            } else if (mostSold < sale.getUnitCount()) {
                mostSold = sale.getUnitCount();
                mostSoldUnit = sale.getProduct();
            }
        }
        if (mostSold == 0) {
            mostSoldUnit = "No Sales";
        }

        return mostSoldUnit;
    }


    public String mostProfitUnit(Sale[] sales) {

        double mostProfit = 0.0;
        String mostProfitUnit = null;
        for (int i = 0; i < sales.length; i++) {
            Sale sale = sales[i];
            if (mostProfit == sale.getUnitCount() * sale.getPricePerUnit()) {
                mostProfitUnit = "Equals";
            } else if (mostProfit < sale.getUnitCount() * sale.getPricePerUnit()) {
                mostProfit = sale.getUnitCount() * sale.getPricePerUnit();
                mostProfitUnit = sale.getProduct();
            }
        }
        if (mostProfit == 0) {
            mostProfitUnit = "No Sales";
        }
        return mostProfitUnit;
    }
}
