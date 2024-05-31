package lv.javaguru.java1.student_natalia_kochkina.project1_fraud_detector;

interface FraudRule {

    boolean isFraud(Transaction transaction);
    String getRuleName();

}
