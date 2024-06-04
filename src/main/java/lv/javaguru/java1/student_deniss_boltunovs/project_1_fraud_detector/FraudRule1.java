package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudRule1 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }

}
