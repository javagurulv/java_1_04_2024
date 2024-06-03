package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {

        FraudRule1 fullNameChecker = new FraudRule1();
        FraudRule2 transactionsAbove1MillionChecker = new FraudRule2();
        FraudRule3 cityChecker = new FraudRule3();
        FraudRule4 countryChecker = new FraudRule4();

        return (fullNameChecker.isFraud(transaction))
                || ((transactionsAbove1MillionChecker.isFraud(transaction)))
                || (cityChecker.isFraud(transaction))
                || (countryChecker.isFraud(transaction));
    }
}








