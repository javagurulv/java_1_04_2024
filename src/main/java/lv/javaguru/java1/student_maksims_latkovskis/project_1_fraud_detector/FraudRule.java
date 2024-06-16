package lv.javaguru.java1.student_maksims_latkovskis.project_1_fraud_detector;

public interface FraudRule {

   FraudDetectionResult isFraud(Transaction t);
}
