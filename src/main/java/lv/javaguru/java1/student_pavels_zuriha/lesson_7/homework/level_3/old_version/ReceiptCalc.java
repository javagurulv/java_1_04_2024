package lv.javaguru.java1.student_pavels_zuriha.lesson_7.homework.level_3.old_version;

class ReceiptCalc {

    public double receiptSumAll(Receipt[] receiptArray, int receiptCount) {

        //for (int i = 0; i < receiptCount; i++) {
        //    Receipt receipt = new Receipt(i + 1, receiptArray[i]);
        //}

        double sum = 0;
        for (int i = 0; i < receiptArray.length; i++) {
            sum = sum + receiptArray[i].getReceiptSum();
        }

        return sum;

    }

    public double receiptAverageAll(Receipt[] receiptArray, int receiptCount) {

        //for (int i = 0; i < receiptCount; i++) {
        //    Receipt receipt = new Receipt(i + 1, receiptArray[i]);
        //}

        double sum = 0;
        for (int i = 0; i < receiptArray.length; i++) {
            sum = sum + receiptArray[i].getReceiptSum();
        }

        return sum / receiptArray.length;

    }

}
