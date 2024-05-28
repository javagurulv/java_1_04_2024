package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_3.new_version;

class ReceiptCalculator {

    public double receiptSumCalculator(Receipt[] receiptTotalPrice) {

        double sum = 0.0;
        for (int i = 0; i < receiptTotalPrice.length; i++) {
            Receipt receipt = receiptTotalPrice[i];
            sum += receipt.getReceiptSaleSum();
        }
        return sum;

    }

    public double receiptAverageSumCalculator(Receipt[] receiptTotalPrice) {

        if (receiptTotalPrice.length == 0) {
            return 0;
        } else {
            double sum = 0.0;
            for (int i = 0; i < receiptTotalPrice.length; i++) {
                Receipt receipt = receiptTotalPrice[i];
                sum += receipt.getReceiptSaleSum();
            }
            return sum / receiptTotalPrice.length;
        }
    }
}
