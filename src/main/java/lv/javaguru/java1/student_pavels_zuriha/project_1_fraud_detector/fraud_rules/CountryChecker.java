package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector.fraud_rules;

import lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector.Trader;
import lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector.Transaction;

public class CountryChecker {

     public boolean countryChecker(Trader trader, Transaction transaction) {
         if (
                 (trader.getCountry().equals("Jamaica"))
                         || ((trader.getCountry().equals("Germany")) && (transaction.getAmount() > 1000))
         ) {
             return false;
         } else {
             return true;
         }
     }
}
