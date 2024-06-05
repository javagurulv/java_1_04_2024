package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudRule3 implements FraudRule {

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sydney");
    }

    @Override
    public String getRuleName() {
        return "FraudRule3";
    }

}
