package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_5;

class Sale {

    private String product;
    private double pricePerUnit;
    private int unitCount;

    public Sale(String product, double pricePerUnit, int unitCount) {
        this.product = product;
        this.pricePerUnit = pricePerUnit;
        this.unitCount = unitCount;
    }

    public String getProduct() {
        return product;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getUnitCount() {
        return unitCount;
    }
}