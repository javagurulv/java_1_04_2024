package lv.javaguru.java1.student_igors_gergeleziu.project_1_fraud_detector;

import lv.javaguru.java1.student_igors_gergeleziu.project_1_fraud_detector.Transaction;

interface FraudRule {
    boolean isFraud(Transaction transaction);

    String getRuleName();
}
