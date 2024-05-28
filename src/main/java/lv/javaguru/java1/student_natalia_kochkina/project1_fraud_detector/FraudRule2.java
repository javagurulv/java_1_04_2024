package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

class FraudRule2 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }
}
