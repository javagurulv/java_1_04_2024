package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

 class CityChecker {

     public boolean cityChecker(Trader trader) {
         if (trader.getCity().equals("Sydney")) {
             return false;
         } else {
             return true;
         }
     }
}
