package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

interface FraudRule {

    boolean isFraud(Transaction transaction) ;

    String getRuleName();
}
