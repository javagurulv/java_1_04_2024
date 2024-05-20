package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_3;

class CashReceiptCalculator {

    public double calculateSalesAmount(CashReceipt[] receipts) {
        double sum = 0;
        for (int i = 0; i < receipts.length; i++) {
            sum = sum + receipts[i].getPurchaseAmount();
        }
        return sum;
    }

    public double calculateAverageCost(CashReceipt[] receipts) {
        double sum = calculateSalesAmount(receipts);
        if (receipts.length != 0) {
            return sum / receipts.length;
        } else {
            return 0;
        }
    }
}
