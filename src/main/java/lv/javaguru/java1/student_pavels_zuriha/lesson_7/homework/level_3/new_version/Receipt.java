package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_3.new_version;

class Receipt {

    private String receiptNumber;
    private double receiptTotalPrice;

    public Receipt(String receiptNumber, double receiptTotalPrice) {
        this.receiptNumber = receiptNumber;
        this.receiptTotalPrice = receiptTotalPrice;

    }

    public String getReceiptNumber() {
        return this.receiptNumber;
    }

    public double getReceiptSaleSum() {
        return this.receiptTotalPrice;
    }

}
