package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {

        if ((!fullNameChecker(transaction.getTrader())) || ((!transactionAbove1Million(transaction))))   {
            return false;
        } else {
            return true;
        }
    }

    public boolean fullNameChecker(Trader trader) {

        if (trader.getFullName().equals("Pokemon")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean transactionAbove1Million(Transaction transaction) {

        if (transaction.getAmount() > 1000000) {
            return false;
        } else {
            return true;
        }
    }


}


