package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

import java.util.List;

class FraudDetector {

    List<FraudRule> rules = List.of(new FraudRule1(),
            new FraudRule2(),
            new FraudRule3(),
            new FraudRule4(),
            new FraudRule5());

    FraudDetectionResult isFraud(Transaction transaction) {
        for (FraudRule rule: rules) {
            if (rule.isFraud(transaction)) {
                return new FraudDetectionResult(true, rule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }

}
