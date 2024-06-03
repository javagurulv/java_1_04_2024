package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_3_junior;

class PaymentReceipt {
    private int receiptNumber = 0;
    private double purchaseAmount = 0;

    public PaymentReceipt(int receiptNumber, double purchaseAmount) {
        this.receiptNumber = receiptNumber;
        this.purchaseAmount = purchaseAmount;
    }

    int getReceiptNumber(){
        return receiptNumber;
    }

    double getPurchaseAmount(){
        return purchaseAmount;
    }
}
