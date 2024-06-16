package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudRule3 implements FraudRule {

    public FraudDetectionResult isFraud(Transaction transaction) {
        if (transaction.getTrader().getCity().equals("Sydney")) {
           return new FraudDetectionResult(true, "FraudRule3");
        }
        else return new FraudDetectionResult(false, null);
    }
}
