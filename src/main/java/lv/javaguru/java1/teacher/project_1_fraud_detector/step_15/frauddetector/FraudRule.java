package lv.javaguru.java1.teacher.project_1_fraud_detector.step_15.frauddetector;

interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}
