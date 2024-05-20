package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_3;

class CashReceipt {

    private int checkNumber;
    private double purchaseAmount;

    public CashReceipt(int checkNumber, double purchaseAmount) {
        this.checkNumber = checkNumber;
        this.purchaseAmount = purchaseAmount;
    }

    public int getCheckNumber() {
        return checkNumber;
    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }
}
