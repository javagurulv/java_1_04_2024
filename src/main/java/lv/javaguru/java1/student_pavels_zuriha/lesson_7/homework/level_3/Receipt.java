package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_3;

class Receipt {

    private int receiptNumber;
    private double receiptSum;

    public Receipt(int receiptNumber, double receiptSum) {
        this.receiptNumber = receiptNumber;
        this.receiptSum = receiptSum;

    }

    public int getReceiptNumber() {
        return receiptNumber;
    }

    public double getReceiptSum() {
        return receiptSum;
    }
}
