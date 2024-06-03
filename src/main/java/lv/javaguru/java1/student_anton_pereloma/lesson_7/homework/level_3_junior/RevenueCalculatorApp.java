package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_3_junior;

class RevenueCalculatorApp {
    public static void main(String[] args) {
        RevenueCalculator revenueCalculator = new RevenueCalculator();

        PaymentReceipt[] paymentReceipts = {
                new PaymentReceipt(1,100),
                new PaymentReceipt(2,2200),
                new PaymentReceipt(3,330)
        };

        System.out.println("Total revenue: " + revenueCalculator.calculateTotalRevenue(paymentReceipts));
        System.out.println("Mean revenue: " + revenueCalculator.calculateMeanRevenue(paymentReceipts));

    }
}
