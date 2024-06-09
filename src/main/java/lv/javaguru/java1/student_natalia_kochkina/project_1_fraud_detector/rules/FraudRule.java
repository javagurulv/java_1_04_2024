package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.rules;

import lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.domain.Transaction;

public interface FraudRule {

    boolean isFraud(Transaction transaction);
    String getRuleName();

}
