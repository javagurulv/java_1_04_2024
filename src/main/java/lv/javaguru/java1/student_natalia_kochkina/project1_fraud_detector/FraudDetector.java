package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

import java.util.List;

class FraudDetector {

    List<FraudRule> rules = List.of(new FraudRule1(),
            new FraudRule2(),
            new FraudRule3(),
            new FraudRule4(),
            new FraudRule5());

    FraudDetectionResult isFraud(Transaction transaction) {
        return rules.stream()
                .filter(fraudRule -> fraudRule.isFraud(transaction))
                .findFirst()
                .map(fraudRule -> new FraudDetectionResult(true, fraudRule.getRuleName()))
                .orElse(new FraudDetectionResult(false, null));

    }

}
