package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

import java.util.List;

class FraudDetector {

    private List<FraudRule> rules = List.of(
            new FraudRule1(),
            new FraudRule2(),
            new FraudRule3(),
            new FraudRule4()
    );

    FraudDetectionResult isFraud(Transaction transaction) {

        for (FraudRule fraudRule : rules) {
            if (fraudRule.isFraud(transaction)) {
                String ruleName = fraudRule.getRuleName();
                return new FraudDetectionResult(true, ruleName);
            }
        }

        return new FraudDetectionResult(false, "null");

    }
}








