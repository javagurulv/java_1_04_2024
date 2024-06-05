package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudRule4 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
         Trader trader = transaction.getTrader();
         return trader.getCountry().equals("Jamaica")
                 || (trader.getCountry().equals("Germany") && (transaction.getAmount() > 1000));
    }

    @Override
    public String getRuleName() {
        return "Rule 4";
    }
}
