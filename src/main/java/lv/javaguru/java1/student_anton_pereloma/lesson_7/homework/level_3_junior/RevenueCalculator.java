package lv.javaguru.java1.student_anton_pereloma.lesson_7.homework.level_3_junior;

class RevenueCalculator {

    double calculateTotalRevenue(PaymentReceipt[] array) {
        double totalRevenue = 0;
        for (int i = 0; i < array.length; i++){
            totalRevenue = totalRevenue + array[i].getPurchaseAmount();
        }
        return  totalRevenue;
    }

    double calculateMeanRevenue(PaymentReceipt[] array) {
        double mean = calculateTotalRevenue(array);
        return mean/array.length;
    }
}
