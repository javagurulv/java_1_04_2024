package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return fraud;
    }

    public String getRuleName() {
        return ruleName;
    }
}
