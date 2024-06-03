package lv.javaguru.java1.teacher.project_1_fraud_detector.step_15.frauddetector;

class FraudRule3 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCity().equals("Sydney");
    }

    @Override
    public String getRuleName() {
        return "FraudRule3";
    }

}
