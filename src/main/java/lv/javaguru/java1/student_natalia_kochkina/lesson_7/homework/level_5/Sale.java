package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_5;

class Sale {

    private String product;
    private double pricePerUnit;
    private int unitCount;

    Sale(String product, double pricePerUnit, int unitCount) {
        this.product = product;
        this.pricePerUnit = pricePerUnit;
        this.unitCount = unitCount;
    }

    String getProduct() {
        return product;
    }

    double getPricePerUnit() {
        return pricePerUnit;
    }

    int getUnitCount() {
        return unitCount;
    }

}
