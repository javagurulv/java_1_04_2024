package lv.javaguru.java1.teacher.project_fraud_detector.step_14.frauddetector;

class FraudRule2 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
