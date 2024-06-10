package lv.javaguru.java1.student_nikita_paramonovs.lesson_7.level3;

public class CashMachine {
    private CashReceipt[] receipts;
    CashMachine(CashReceipt[] receipts){
        this.receipts = receipts;
    }
    double calculateTotalSales() {
        double total = 0;
        for (CashReceipt receipt : receipts){
            total += receipt.getPurchaseAmount();
        }
        return  total;
    }
    double calculateAveragePurchase() {
        if (receipts.length == 0) {
            return 0;
        }
        return calculateTotalSales() / receipts.length;
    }
}
