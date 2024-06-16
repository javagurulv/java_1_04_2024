package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

class FraudDetectionResult {

    private boolean isFraud;
    private String ruleName;

    FraudDetectionResult(boolean isFraud, String ruleName){
        this.isFraud = isFraud;
        this.ruleName = ruleName;
    }

    public boolean isFraud() {
        return isFraud;
    }

    public String getRuleName() {
        return ruleName;
    }
}
