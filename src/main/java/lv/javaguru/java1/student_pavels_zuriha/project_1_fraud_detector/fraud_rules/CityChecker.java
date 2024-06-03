package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector.fraud_rules;

import lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector.Trader;

public class CityChecker {

     public boolean cityChecker(Trader trader) {
         if (trader.getCity().equals("Sydney")) {
             return false;
         } else {
             return true;
         }
     }
}
