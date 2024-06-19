package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class FraudDetector {

    FraudDetectionResult isFraud(Transaction transaction) {
        List<Supplier<FraudDetectionResult>> fraudRules = new ArrayList<>();

        // Adding instances of each fraud rule
        fraudRules.add(() -> new FraudRule1().isFraud(transaction));
        fraudRules.add(() -> new FraudRule2().isFraud(transaction));
        fraudRules.add(() -> new FraudRule3().isFraud(transaction));
        fraudRules.add(() -> new FraudRule4().isFraud(transaction));
        fraudRules.add(() -> new FraudRule5().isFraud(transaction));

        // Checking each rule
        for (Supplier<FraudDetectionResult> rule : fraudRules) {
            if (rule.get().isFraud()) {
                return rule.get();
            }
        }
           return new FraudDetectionResult(false, null);

         /*  IT DOESN'T WORK ANYWAY....
        return fraudRules.stream()
                .filter(fraudRule -> fraudRule.get().isFraud())
                .findFirst()
                .map(this::buildFraudResult)
                .orElse(buildNotFraudResult());
          */
    }

    private FraudDetectionResult buildNotFraudResult() {
        return new FraudDetectionResult(false, null);
    }
    private FraudDetectionResult buildFraudResult(FraudRule fraudRule) {
        return new FraudDetectionResult(true, fraudRule.getRuleName());
    }

}