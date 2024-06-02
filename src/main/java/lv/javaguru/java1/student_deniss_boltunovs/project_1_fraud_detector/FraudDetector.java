package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return (isFraudTrader(transaction) ||
                isFraudAmount(transaction) ||
                isFraudCity(transaction)||
                isFraudCountry(transaction) ||
                isFraudCountryAndAmount(transaction) );
    }

    //// fraud trader = Pokemon
    private boolean isFraudTrader(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }

    /// fraud amount > 1mio
    private boolean isFraudAmount(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

    /// fraud city = Sydney
    private boolean isFraudCity(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sydney");
    }

    /// fraud country = Jamaica
    private boolean isFraudCountry(Transaction transaction) {
       return transaction.getTrader().getCountry().equals("Jamaica");
    }

    /// fraud country = Germany && amount > 1000
    private boolean isFraudCountryAndAmount(Transaction transaction) {
        boolean traderCountry = transaction.getTrader().getCountry().equals("Germany");
        boolean transactionAmount = transaction.getAmount() > 1000;
        return (traderCountry && transactionAmount);
    }


}
