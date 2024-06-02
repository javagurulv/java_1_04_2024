package lv.javaguru.java1.student_igors_gergeleziu.lesson_7.level_3;

class CashReceipt {
    private int receiptID;
    private int purchaseAmount;

    public CashReceipt(int receiptID, int purchaseAmount) {
        this.receiptID = receiptID;
        this.purchaseAmount = purchaseAmount;
    }

    public int getReceiptID() {
        return receiptID;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    @Override
    public String toString() {
        return "CashReceipt{" +
                "ID=" + receiptID +
                ", purchaseAmount=" + purchaseAmount + "$" +
                '}';
    }
}
