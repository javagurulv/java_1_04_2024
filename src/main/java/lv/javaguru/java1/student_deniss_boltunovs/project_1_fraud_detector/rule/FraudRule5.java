package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.rule;

import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Transaction;

public class FraudRule5 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        String country = transaction.getTrader().getCountry();
        int amount = transaction.getAmount();
        return (country.equals("Germany")) && (amount > 1000);
    }

    @Override
    public String getRuleName() {
        return "FraudRule5";
    }

}
