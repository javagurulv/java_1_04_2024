package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_3_junior;

class PaymentReceipt {
    private int receiptNumber = 0;
    private double purchaseAmount = 0;

    int getReceiptNumber(){
        return this.receiptNumber;
    }

    double getPurchaseAmount(){
        this.purchaseAmount = purchaseAmount;
        return purchaseAmount;
    }

    void setReceiptNumber(int number) {
        this.receiptNumber = number;
    }

    void setPurchaseAmount(double amount) {
        this.purchaseAmount = amount;
    }
}
