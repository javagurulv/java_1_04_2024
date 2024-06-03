package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_5;

class SaleCalculator {

    String findMostSelling(Sale[] sales) {
        Sale mostSelling = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (calculateSalesOfProduct(mostSelling, sales)
                < calculateSalesOfProduct(sales[i], sales)) {
                mostSelling = sales[i];
            }
        }

        return mostSelling.getProduct();
    }

    String findProductWithBestTurnover(Sale[] sales) {
        Sale bestTurnoverProduct = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (calculateTurnover(bestTurnoverProduct, sales)
                    < calculateTurnover(sales[i], sales)) {
                bestTurnoverProduct = sales[i];
            }
        }
        return bestTurnoverProduct.getProduct();
    }

    private int calculateSalesOfProduct(Sale sale, Sale[] sales) {
        int salesOfProduct = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sale.getProduct().equals(sales[i].getProduct())) {
                salesOfProduct += sales[i].getUnitCount();
            }
        }
        return salesOfProduct;
    }

    private double calculateTurnover(Sale sale, Sale[] sales) {
        return calculateSalesOfProduct(sale, sales)
                * sale.getPricePerUnit();
    }

}
