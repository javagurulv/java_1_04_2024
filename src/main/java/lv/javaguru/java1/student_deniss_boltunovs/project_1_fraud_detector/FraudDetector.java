package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.domain.Transaction;
import lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector.rule.*;

import java.util.List;

class FraudDetector {

    private List<FraudRule> fraudRules = List.of( new FraudRule1()
                                                  , new FraudRule2()
                                                  , new FraudRule3()
                                                  , new FraudRule4()
                                                  , new FraudRule5() );

    FraudDetectionResult isFraud(Transaction transaction) {
        //// Detecting frauds
        for (FraudRule fraudRule : fraudRules) {
              if (fraudRule.isFraud(transaction)) {
                  String ruleName = fraudRule.getRuleName();
                  return new FraudDetectionResult( true, ruleName);
              }
         }
        //// If not a fraud
        return new FraudDetectionResult(false, null);
    }

}