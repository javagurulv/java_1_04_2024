package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector;

class FraudRule5 implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCountry().equals("Germany")
                && (transaction.getAmount() > 1000);
    }

    @Override
    public String getRuleName() {
        return "FraudRule5";
    }

}
