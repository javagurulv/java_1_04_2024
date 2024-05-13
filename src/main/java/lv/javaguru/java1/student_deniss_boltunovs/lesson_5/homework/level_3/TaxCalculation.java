package lv.javaguru.java1.student_deniss_boltunovs.lesson_5.homework.level_3;

class TaxCalculation {

     public void calculateTaxAmount(int income) {

         int income10k = 10000;
         int income50k = 50000;

         double taxRateLow = 0.3;
         double taxRateMedium = 0.4;
         double taxRateHigh = 0.5;

         double taxAmount1 = 0;
         double taxAmount2 = 0;
         double taxAmount3 = 0;

         if (income < income10k) {
             taxAmount1 = income * taxRateLow;
         } else if (income <= income50k) {
             taxAmount1 = income10k * taxRateLow;
             taxAmount2 = (income - income10k) * taxRateMedium;
         } else {
             taxAmount1 = income10k * taxRateLow;
             taxAmount2 = (income50k - income10k) * taxRateMedium;
             taxAmount3 = (income - income50k) * taxRateHigh;
         }

         double taxAmountTotal = taxAmount1 + taxAmount2 + taxAmount3;

         System.out.println("Income: " + income);
         System.out.println("Tax 30%: " + taxAmount1);
         System.out.println("Tax 40%: " + taxAmount2);
         System.out.println("Tax 50%: " + taxAmount3);
         System.out.println("Tax amount total: " + taxAmountTotal+"\n");

     }
}
