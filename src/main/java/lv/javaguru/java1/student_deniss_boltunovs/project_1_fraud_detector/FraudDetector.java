package lv.javaguru.java1.student_deniss_boltunovs.project_1_fraud_detector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return (isFraudTrader(transaction) ||
                isFraudAmount(transaction) ||
                isFraudCity(transaction)||
                isFraudCountry(transaction));
    }

    //// fraud trader = Pokemon
    private boolean isFraudTrader(Transaction transaction) {
        String traderFullName = transaction.getTrader().getFullName();
        return traderFullName.equals("Pokemon");
    }

    /// fraud amount > 1mio
    private boolean isFraudAmount(Transaction transaction) {
        return transaction.getAmount() > 1000000;
    }

    /// fraud city = Sydney
    private boolean isFraudCity(Transaction transaction) {
        String traderCity = transaction.getTrader().getCity();
        return traderCity.equals("Sydney");
    }

    /// fraud country = Jamaica
    private boolean isFraudCountry(Transaction transaction) {
        String traderCountry = transaction.getTrader().getCountry();
        return traderCountry.equals("Jamaica");
    }

}
