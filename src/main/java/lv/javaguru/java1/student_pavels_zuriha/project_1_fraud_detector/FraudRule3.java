package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudRule3 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }
}
