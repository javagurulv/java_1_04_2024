package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.rules;

import lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.domain.Transaction;

public class FraudRule4 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Jamaica");
    }

    @Override
    public String getRuleName() {
        return "FraudRule4";
    }

}
