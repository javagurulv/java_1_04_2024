package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudDetector {

    private FraudRule fullnameChecker = new FraudRule1();
    private FraudRule transactionsAbove1MillionChecker = new FraudRule2();
    private FraudRule cityChecker = new FraudRule3();
    private FraudRule countryChecker = new FraudRule4();

    FraudDetectionResult isFraud(Transaction transaction) {

        if (fullnameChecker.isFraud(transaction)) {
            return new FraudDetectionResult(true, "fullNameChecker");
        }
        if (transactionsAbove1MillionChecker.isFraud(transaction)) {
            return new FraudDetectionResult(true, "transactionsAbove1MillionChecker");
        }
        if (cityChecker.isFraud(transaction)) {
            return new FraudDetectionResult(true, "cityChecker");
        }
        if (countryChecker.isFraud(transaction)) {
            return new FraudDetectionResult(true, "countryChecker");
        }
        return new FraudDetectionResult(false, "null");

    }




}








