package lv.javaguru.java1.student_deniss_boltunovs.lesson_7.homework.level_3;

class ChequeCalculator {

    public double calculateTotalSalesAmount(Cheque[] cheques) {
        double totalAmount = 0;
        for (Cheque cheque : cheques) {
            totalAmount += cheque.getAmount();
        }
        /*
          for (int i = 0; i < cheques.length; i++) {
               totalAmount += cheques[i].getAmount();
           }
         */
       return totalAmount;
    }

    public double calculateAverageSalesAmount(Cheque[] cheques) {
        if (cheques.length == 0) {
            return 0;
        } else {
            double totalAmount = calculateTotalSalesAmount(cheques);
            return (double) (totalAmount / cheques.length);
        }
    }

}
