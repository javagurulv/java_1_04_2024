package lv.javaguru.java1.student_maksims_latkovskis.level_7_array_for.homework.level_3_junior;

class DaySalesData {

     double dayTotalIncome(Receipt [] receipts){
         double dayIncome = 0;

        for(int i = 0; i < receipts.length; i++){
            Receipt singleReceipt = receipts[i];
            dayIncome += singleReceipt.getReceiptTotal();
        }

       return dayIncome;
    }

    double dayAverageReceipt(Receipt [] receipts){
         double totalIncome = dayTotalIncome(receipts);
         double averageReceipt = totalIncome / receipts.length;
         return  averageReceipt;
    }


}
