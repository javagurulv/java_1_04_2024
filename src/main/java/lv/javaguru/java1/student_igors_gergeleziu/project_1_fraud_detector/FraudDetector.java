package lv.javaguru.java1.student_igors_gergeleziu.project_1_fraud_detector;

class FraudDetector {
    private FraudRule fraudRule1 = new FraudRule1();
    private FraudRule fraudRule2 = new FraudRule2();
    private FraudRule fraudRule3 = new FraudRule3();
    private FraudRule fraudRule4 = new FraudRule4();
    private FraudRule fraudRule5 = new FraudRule5();

    private FraudRule[] fraudRules = {fraudRule1, fraudRule2, fraudRule3, fraudRule4, fraudRule5};


    FraudDetectionResult isFraud(Transaction transaction) {
        int ruleIndex = 0;
        for (int i = 0; i < fraudRules.length; i++) {
            if (fraudRules[i].isFraud(transaction)) {
                ruleIndex = i + 1;
                return new FraudDetectionResult(true, "Rule" + ruleIndex);
            }
        }
        return new FraudDetectionResult(false, null);
    }

}
