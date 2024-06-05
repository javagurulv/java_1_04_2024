package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.rules;

import lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.domain.Transaction;

public class FraudRule3 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sydney");
    }

    @Override
    public String getRuleName() {
        return "FraudRule3";
    }

}
