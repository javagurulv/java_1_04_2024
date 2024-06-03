package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector.fraud_rules;

import lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector.Trader;

public class FullNameChecker {

    public boolean fullNameChecker(Trader trader) {
        if (trader.getFullName().equals("Pokemon")) {
            return false;
        } else {
            return true;
        }
    }
}
