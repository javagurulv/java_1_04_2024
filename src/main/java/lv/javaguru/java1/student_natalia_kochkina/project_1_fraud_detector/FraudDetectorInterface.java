package lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector;

import lv.javaguru.java1.student_natalia_kochkina.project_1_fraud_detector.domain.Transaction;

interface FraudDetectorInterface {

    FraudDetectionResult isFraud(Transaction transaction);

}
