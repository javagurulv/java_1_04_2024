package lv.javaguru.java1.student_nadezda_radigina.lesson_7.lavel_3_junior;

 class AverageCheckAndTotal {
     public static double calculateTotalAmount(Check[] checks){
      double total = 0.0;
      for ( int i = 0; i < checks.length; i++){
          Check check = checks[i];
       total += check.getPurchaseAmount();
      }
      return total;
     }
     public static double calculateAverageCheck(Check[] checks){
         if (checks.length == 0){
             return 0.0;
         } else {
             double total = calculateTotalAmount(checks);
             return total / checks.length;
         }
     }
}
