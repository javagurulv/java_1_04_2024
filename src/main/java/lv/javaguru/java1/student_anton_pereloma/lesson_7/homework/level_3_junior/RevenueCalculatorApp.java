package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_3_junior;

class RevenueCalculatorApp {
    public static void main(String[] args) {
        RevenueCalculator revenueCalculator = new RevenueCalculator();

        PaymentReceipt[] paymentReceipts = new PaymentReceipt[5];

        PaymentReceipt paymentReceipt0 = new PaymentReceipt();
        PaymentReceipt paymentReceipt1 = new PaymentReceipt();
        PaymentReceipt paymentReceipt2 = new PaymentReceipt();
        PaymentReceipt paymentReceipt3 = new PaymentReceipt();
        PaymentReceipt paymentReceipt4 = new PaymentReceipt();

        paymentReceipts[0] = paymentReceipt0;
        paymentReceipts[1] = paymentReceipt1;
        paymentReceipts[2] = paymentReceipt2;
        paymentReceipts[3] = paymentReceipt3;
        paymentReceipts[4] = paymentReceipt4;

        paymentReceipts[0].setReceiptNumber(1);
        paymentReceipts[0].setPurchaseAmount(1000);

        paymentReceipts[1].setReceiptNumber(2);
        paymentReceipts[1].setPurchaseAmount(10);

        paymentReceipts[2].setReceiptNumber(3);
        paymentReceipts[2].setPurchaseAmount(50);

        paymentReceipts[3].setReceiptNumber(4);
        paymentReceipts[3].setPurchaseAmount(150);

        paymentReceipts[4].setReceiptNumber(5);
        paymentReceipts[4].setPurchaseAmount(300);

        System.out.println("Total revenue: " + revenueCalculator.calculateTotalRevenue(paymentReceipts));
        System.out.println("Mean revenue: " + revenueCalculator.calculateMeanRevenue(paymentReceipts));

    }
}
