package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudRule2 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

    @Override
    public String getRuleName() {
        return "Rule 2";
    }
}
