package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        List<Supplier<Boolean>> fraudRules = new ArrayList<>();

        // Adding instances of each fraud rule
        fraudRules.add(() -> new FraudRule1().fraudRule1(transaction));
        fraudRules.add(() -> new FraudRule2().fraudRule2(transaction));
        fraudRules.add(() -> new FraudRule3().fraudRule3(transaction));
        fraudRules.add(() -> new FraudRule4().fraudRule4(transaction));
        fraudRules.add(() -> new FraudRule5().fraudRule5(transaction));

        // Checking each rule
        for (Supplier<Boolean> rule : fraudRules) {
            if (!rule.get()) {
                return false;
            }
        }
        return true;

    }
}
