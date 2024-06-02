package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {

        FullNameChecker fullNameChecker = new FullNameChecker();
        TransactionsAbove1MillionChecker transactionsAbove1MillionChecker = new TransactionsAbove1MillionChecker();
        CityChecker cityChecker = new CityChecker();
        CountryChecker countryChecker = new CountryChecker();

        if (
                (!fullNameChecker.fullNameChecker(transaction.getTrader()))
                || ((!transactionsAbove1MillionChecker.transactionAbove1Million(transaction)))
                || (!cityChecker.cityChecker(transaction.getTrader()))
                || (!countryChecker.countryChecker(transaction.getTrader(), transaction))
        ) {
            return false;
        } else {
            return true;
        }
    }






}


