package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector;

class FraudDetectionResult {

    private boolean fraud;
    private String ruleName;

    FraudDetectionResult(boolean fraud, String ruleName) {
        this.fraud = fraud;
        this.ruleName = ruleName;
    }

    boolean isFraud() {
        return fraud;
    }

    String getRuleName() {
        return ruleName;
    }
}
