package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudDetector {

    private FraudRule1 rule1 = new FraudRule1();
    private FraudRule2 rule2 = new FraudRule2();
    private FraudRule3 rule3 = new FraudRule3();
    private FraudRule4 rule4 = new FraudRule4();
    private FraudRule5 rule5 = new FraudRule5();

    boolean isFraud(Transaction transaction) {
        return ( rule1.isFraud(transaction) ||
                 rule2.isFraud(transaction) ||
                 rule3.isFraud(transaction) ||
                 rule4.isFraud(transaction) ||
                 rule5.isFraud(transaction) );
    }

}