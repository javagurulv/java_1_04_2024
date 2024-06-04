package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudDetector {

    private FraudRule1 rule1 = new FraudRule1();
    private FraudRule2 rule2 = new FraudRule2();
    private FraudRule3 rule3 = new FraudRule3();
    private FraudRule4 rule4 = new FraudRule4();
    private FraudRule5 rule5 = new FraudRule5();

    FraudDetectionResult isFraud(Transaction transaction) {
        /// FraudRule1
        if (rule1.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule1");
        }
        /// FraudRule2
        if (rule2.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule2");
        }
        /// FraudRule3
        if (rule3.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule3");
        }
        /// FraudRule4
        if (rule4.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule4");
        }
        /// FraudRule5
        if (rule5.isFraud(transaction)) {
            return new FraudDetectionResult(true, "FraudRule5");
        }
        //// Not a fraud
        return new FraudDetectionResult(false, null);
    }

}