package lv.javaguru.java1.teacher.project_fraud_detector.step_16.frauddetector;

interface FraudRule {

    boolean isFraud(Transaction transaction);

    String getRuleName();

}
