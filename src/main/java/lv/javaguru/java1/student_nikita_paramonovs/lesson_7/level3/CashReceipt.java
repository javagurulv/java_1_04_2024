package lv.javaguru.java1.student_nikita_paramonovs.lesson_7.level3;

public class CashReceipt {
    private int receiptNumber;
    private double purchaseAmount;

    CashReceipt(int receiptNumber, double purchaseAmount) {
        this.receiptNumber = receiptNumber;
        this.purchaseAmount = purchaseAmount;
    }

    int getReceiptNumber() {
        return receiptNumber;
    }

    double getPurchaseAmount() {
        return purchaseAmount;
    }
}
