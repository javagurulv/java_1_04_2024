package lv.javaguru.java1.student_igors_gergeleziu.project_1_fraud_detector;

class FraudRule5 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        return trader.getCountry().equals("Germany") && transaction.getAmount() > 1000;
    }

    @Override
    public String getRuleName() {
        return "FraudRule5";
    }
}
