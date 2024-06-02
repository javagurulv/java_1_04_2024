package lv.javaguru.java1.student_pavels_zuriha.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        if ((!fullNameChecker(transaction.getTrader()))
                || ((!transactionAbove1Million(transaction)))
                || (!cityChecker(transaction.getTrader()))
                || (!countryChecker(transaction.getTrader(), transaction))
        ) {
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

    public boolean cityChecker(Trader trader) {
        if (trader.getCity().equals("Sydney")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean countryChecker(Trader trader, Transaction transaction) {
        if (
                (trader.getCountry().equals("Jamaica"))
                || ((trader.getCountry().equals("Germany")) && (transaction.getAmount() > 1000))
        ) {
            return false;
        } else {
            return true;
        }
    }




}


