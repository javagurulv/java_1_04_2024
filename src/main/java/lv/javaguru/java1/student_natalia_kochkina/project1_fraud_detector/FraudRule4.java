package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

class FraudRule4 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Jamaica");
    }
}
