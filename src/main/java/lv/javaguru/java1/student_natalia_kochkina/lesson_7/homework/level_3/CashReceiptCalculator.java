package lv.javaguru.java1.student_natalia_kochkina.lesson_7.homework.level_3;

class CashReceiptCalculator {

    double calculateSalesAmount(CashReceipt[] receipts) {
        double sum = 0;
        for (CashReceipt receipt : receipts) {
            sum = sum + receipt.getPurchaseAmount();
        }
        return sum;
    }

    double calculateAverageCost(CashReceipt[] receipts) {
        double sum = calculateSalesAmount(receipts);
        if (receipts.length != 0) {
            return sum / receipts.length;
        } else {
            return 0;
        }
    }
}
