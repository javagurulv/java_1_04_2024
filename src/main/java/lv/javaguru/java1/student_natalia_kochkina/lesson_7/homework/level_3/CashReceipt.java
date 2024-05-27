package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_3;

class CashReceipt {

    private int checkNumber;
    private double purchaseAmount;

    CashReceipt(int checkNumber, double purchaseAmount) {
        this.checkNumber = checkNumber;
        this.purchaseAmount = purchaseAmount;
    }

    int getCheckNumber() {
        return checkNumber;
    }

    double getPurchaseAmount() {
        return purchaseAmount;
    }
}
