package lv.javaguru.java1.student_igors_gergeleziu.project_1_fraud_detector;

class FraudDetectionResult {
    private boolean fraud;
    private String ruleName;

    public FraudDetectionResult(boolean fraud, String ruleName) {
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
